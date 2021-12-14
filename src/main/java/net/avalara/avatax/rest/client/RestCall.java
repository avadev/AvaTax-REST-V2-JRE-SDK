package net.avalara.avatax.rest.client;

import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.enums.ErrorTargetCode;
import net.avalara.avatax.rest.client.models.ErrorDetail;
import net.avalara.avatax.rest.client.models.ErrorInfo;
import net.avalara.avatax.rest.client.models.ErrorResult;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.util.EntityUtils;

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

    private RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, CloseableHttpClient client) {
        this.client = client;
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;
        this.model = model;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost)this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPut)this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        }

        buildRequest(this.request,"");
    }

    private RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, CloseableHttpClient client, String apiVersion) {
        this.client = client;
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;
        this.model = model;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost)this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPut)this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        }

        buildRequest(this.request, apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.createDefault());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder.build());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.custom()
                .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                .build());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.createDefault(),apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder.build(),apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken,apiVersion);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder,apiVersion);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.custom()
                .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                .build(),apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema,apiVersion);

        this.request.setHeader("Authorization", "Basic " + header);
    }
    @Override
    public T call() throws Exception {

        CloseableHttpResponse response = this.client.execute(this.request);
        T obj = null;
        String json = null;
        try {
            HttpEntity entity = response.getEntity();
            if (entity!=null && entity.getContentLength()>0)
                json = EntityUtils.toString(entity);

            if (response.getStatusLine().getStatusCode() / 100 != 2)
            {
                throw new AvaTaxClientException((ErrorResult) JsonSerializer.DeserializeObject(json, ErrorResult.class), model);
            }
            if (json != null) {
                if (ContentType.getOrDefault(entity).getMimeType().equals("application/json")) {
                    obj = (T) JsonSerializer.DeserializeObject(json, typeToken.getType());
                } else {
                    obj = (T) json;
                }
            }
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

        return obj;
    }

    private void buildRequest(HttpRequestBase baseRequest, String apiVersion) {
        addTimeOutIfRequired(baseRequest);


        String clientId = String.format("%s; %s; %s; %s; %s", appName, appVersion, "JavaRestClient", apiVersion, machineName);
        baseRequest.setHeader(AvaTaxConstants.XClientHeader, clientId);
    }

    private void addTimeOutIfRequired( HttpRequestBase baseRequest ) {
        RequestConfig userConfig = getUserConfig();
        if (isTimeOutMissing(userConfig)) {
            addTimeOut(baseRequest, userConfig);
        }
    }

    private boolean isTimeOutMissing( RequestConfig userConfig ) {
        if (userConfig == null) {
            return true;
        }

        // Only override user config if user did not explicitly set a timeout
        return userConfig.getConnectionRequestTimeout() == -1 || userConfig.getConnectTimeout() == -1 || userConfig.getSocketTimeout() == -1;
    }

    private void addTimeOut( HttpRequestBase baseRequest, RequestConfig userConfig ) {
        int timeOut = 120_000;

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
            Configurable configurable = (Configurable)client;
            return configurable.getConfig();
        }

        return null;
    }
}
