package net.avalara.avatax.rest.client;

import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.enums.ErrorCodeId;
import net.avalara.avatax.rest.client.enums.ErrorTargetCode;
import net.avalara.avatax.rest.client.models.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.util.EntityUtils;

import java.util.concurrent.TimeUnit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class RestCall<T> implements Callable<T> {
    private CloseableHttpClient client;
    private HttpRequestBase request;
    private String appName;
    private String appVersion;
    private String machineName;
    private Object model;
    private TypeToken<T> typeToken;
    private UserConfiguration userConfiguration;

    private RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, CloseableHttpClient client, UserConfiguration userConfiguration) {
        this.client = client;
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;
        this.model = model;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPut) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        }
        if (userConfiguration == null) {
            this.userConfiguration = new UserConfiguration();
        } else {
            this.userConfiguration = userConfiguration;
        }
        buildRequest(this.request);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.createDefault(), userConfiguration);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder, UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder.build(), userConfiguration);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, userConfiguration);
        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder, UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder, userConfiguration);
        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema, UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.custom()
                .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                .build(), userConfiguration);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema, UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema, userConfiguration);
        this.request.setHeader("Authorization", "Basic " + header);
    }

    @Override
    public T call() throws Exception {
        CloseableHttpResponse response;
        T obj = null;
        String json = null;
        int retryAttempt = 0;
        HttpEntity entity = null;
        while (userConfiguration.getMaxRetryAttempt() >= retryAttempt) {
            try {
                response = this.client.execute(this.request);
                try {
                    entity = response.getEntity();
                    json = EntityUtils.toString(entity);
                    if (response.getStatusLine().getStatusCode() == 500 || response.getStatusLine().getStatusCode() == 408) {
                        throw new AvaTaxServerError((ErrorResult) JsonSerializer.DeserializeObject(json, ErrorResult.class), model);
                    }
                    if (response.getStatusLine().getStatusCode() != 200 && response.getStatusLine().getStatusCode() != 201) {
                        throw new AvaTaxClientException((ErrorResult) JsonSerializer.DeserializeObject(json, ErrorResult.class), model);
                    }

                    if (ContentType.getOrDefault(entity).getMimeType().equals("application/json")) {
                        obj = (T)JsonSerializer.DeserializeObject(json, typeToken.getType());
                    } else {
                        obj = (T)json;
                    }
                    break;
                } catch (JsonParseException jsonParseException) {
                    ErrorResult errorResult = new ErrorResult();
                    int statusCode = response.getStatusLine().getStatusCode();
                    ArrayList<ErrorDetail> errors = new ArrayList<>();
                    ErrorDetail errorDetail = new ErrorDetail();
                    errorDetail.setDescription(json);
                    errors.add(errorDetail);

                    //set error info
                    ErrorInfo errorInfo = new ErrorInfo();
                    errorInfo.setMessage("The server returned " + statusCode + " but the response is in an unexpected format. See details for the complete response.");
                    errorInfo.setTarget(ErrorTargetCode.Unknown);
                    errorInfo.setDetails(errors);

                    errorResult.setError(errorInfo);
                    throw new AvaTaxClientException(errorResult, model);
                } finally {
                    response.close();
                }
            } catch (AvaTaxServerError | ConnectTimeoutException ex) {
                if (retryAttempt == userConfiguration.getMaxRetryAttempt()) {
                    throw ex;
                }
                retryAttempt++;
                TimeUnit.SECONDS.sleep((long) (2 * retryAttempt));
            }
        }
        return obj;
    }

    private void buildRequest(HttpRequestBase baseRequest) {
        addTimeOutIfRequired(baseRequest);


        String clientId = String.format("%s; %s; %s; %s; %s", appName, appVersion, "JavaRestClient", "21.3.2", machineName);
        baseRequest.setHeader(AvaTaxConstants.XClientHeader, clientId);
    }

    private void addTimeOutIfRequired(HttpRequestBase baseRequest) {
        RequestConfig userConfig = getUserConfig();
        if (isTimeOutMissing(userConfig)) {
            addTimeOut(baseRequest, userConfig);
        }
    }

    private boolean isTimeOutMissing(RequestConfig userConfig) {
        if (userConfig == null) {
            return true;
        }
        // Only override user config if user did not explicitly set a timeout
        return userConfig.getConnectionRequestTimeout() == -1 || userConfig.getConnectTimeout() == -1 || userConfig.getSocketTimeout() == -1;
    }

    private void addTimeOut(HttpRequestBase baseRequest, RequestConfig userConfig) {
        // conversion to milliseconds
        int timeOut = userConfiguration.getTimeOutInMinute() * 60 * 1000;
        RequestConfig.Builder builder;
        if (userConfig != null) {
            builder = RequestConfig.copy(userConfig);
            if (userConfig.getConnectionRequestTimeout() == -1) {
                builder.setConnectionRequestTimeout(timeOut);
            }
            if (userConfig.getConnectTimeout() == -1) {
                builder.setConnectTimeout(timeOut);
            }
            if (userConfig.getSocketTimeout() == -1) {
                builder.setSocketTimeout(timeOut);
            }
        } else {
            builder = RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).setConnectionRequestTimeout(timeOut);
        }

        RequestConfig requestConfig = builder.build();
        baseRequest.setConfig(requestConfig);
    }

    private RequestConfig getUserConfig() {
        if (client instanceof Configurable) {
            Configurable configurable = (Configurable) client;
            return configurable.getConfig();
        }
        return null;
    }
}