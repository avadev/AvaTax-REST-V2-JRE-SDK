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
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public class RestCall<T> implements Callable<T> {
    private final Logger logger = LoggerFactory.getLogger(RestCall.class);
    private CloseableHttpClient client;
    private HttpRequestBase request;
    private String appName;
    private String appVersion;
    private String machineName;
    private Object model;
    private TypeToken<T> typeToken;

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path,
            Object model, TypeToken<T> typeToken, CloseableHttpClient client, String apiVersion, String header) {
        this.client = client;
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;
        this.model = model;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model),
                    ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPut) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model),
                    ContentType.create("application/json", "UTF-8")));
        }
        buildRequest(this.request, apiVersion, path.getHeaders());

        if (header != null)
            this.request.setHeader("Authorization", "Basic " + header);
    }

    private RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, CloseableHttpClient client) {
        this.client = client;
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;
        this.model = model;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model),
                    ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPut) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model),
                    ContentType.create("application/json", "UTF-8")));
        }

        buildRequest(this.request, "", path.getHeaders());
    }

    private RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, CloseableHttpClient client, String apiVersion) {
        this.client = client;
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;
        this.model = model;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model),
                    ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPut) this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model),
                    ContentType.create("application/json", "UTF-8")));
        }

        buildRequest(this.request, apiVersion, path.getHeaders());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken,
                HttpClients.createDefault());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken,
                httpClientBuilder.build());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header,
            String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header,
            String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort,
            String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.custom()
                .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                .build());
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header,
            String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort,
            String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort,
                proxySchema);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken,
                HttpClients.createDefault(), apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder,
            String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken,
                httpClientBuilder.build(), apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header,
            String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, apiVersion);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header,
            String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, HttpClientBuilder httpClientBuilder,
            String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder,
                apiVersion);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method,
            AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort, String proxySchema,
            String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, HttpClients.custom()
                .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                .build(), apiVersion);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header,
            String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String proxyHost, int proxyPort,
            String proxySchema, String apiVersion) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort,
                proxySchema, apiVersion);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    /**
     * Checks if the expected return type is InputStream
     *
     * @return true if the type token represents InputStream, false otherwise
     */
    private boolean isInputStreamType() {
        return typeToken != null && typeToken.getType() == InputStream.class;
    }

    public T call() throws Exception {
        // If we want a raw stream, delegate out
        if (isInputStreamType()) {
            // noinspection unchecked
            return (T) downloadStreamResponse();
        }

        // Otherwise—JSON / String path stays inside try-with-resources
        LogObject logObject = new LogObject();
        // Populate log object with request info
        logObject.populateRequestInfo(this.request);
        long startTime = System.currentTimeMillis();
        T result;
        String json = null;

        try (CloseableHttpResponse response = client.execute(request)) {
            HttpEntity entity = response.getEntity();
            int status = response.getStatusLine().getStatusCode();

            if (status / 100 != 2) {
                if (entity != null)
                    json = EntityUtils.toString(entity);
                logObject.populateErrorInfo(json, response, startTime);
                throw new AvaTaxClientException(
                        (ErrorResult) JsonSerializer.DeserializeObject(json, ErrorResult.class),
                        model);
            }

            if (entity != null) {
                json = EntityUtils.toString(entity);
            }
            if (json != null
                    && ContentType.getOrDefault(entity).getMimeType().equals("application/json")
                    && !Objects.equals(typeToken.getType(), String.class)) {
                // noinspection unchecked
                result = (T) JsonSerializer.DeserializeObject(json, typeToken.getType());
            } else {
                // noinspection unchecked
                result = (T) json;
            }

            logObject.populateResponseInfo(response, json, startTime);

        } catch (Exception ex) {
            logObject.populateErrorInfo(ex.getMessage(), null, startTime);
            throw ex;
        } finally {
            logInfo(logObject);
        }

        return result;
    }

    /**
     * Executes the request and returns an InputStream that, when closed,
     * also closes the underlying HTTP response.
     */
    private InputStream downloadStreamResponse() throws IOException, AvaTaxClientException {
        final CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        int status = response.getStatusLine().getStatusCode();

        if (status / 100 != 2 || entity == null) {
            String errPayload = (entity != null)
                    ? EntityUtils.toString(entity)
                    : "No response body";
            response.close();
            throw new AvaTaxClientException(
                    (ErrorResult) JsonSerializer.DeserializeObject(errPayload, ErrorResult.class),
                    model);
        }

        InputStream raw = entity.getContent();
        // Wrap so that closing the stream closes both it _and_ the response
        return new FilterInputStream(raw) {
            @Override
            public void close() throws IOException {
                try {
                    super.close();
                } finally {
                    response.close();
                }
            }
        };
    }

    private void logInfo(LogObject logObject) {
        if (logObject.getStatusCode() != null && logObject.getStatusCode() < 400) {
            logger.info(JsonSerializer.SerializeObject(logObject));
        } else {
            logger.error(JsonSerializer.SerializeObject(logObject));
        }
    }

    private void buildRequest(HttpRequestBase baseRequest, String apiVersion, HashMap<String, String> headers) {
        addTimeOutIfRequired(baseRequest);
        String clientId = String.format("%s; %s; %s; %s; %s", appName, appVersion, "JavaRestClient", apiVersion,
                machineName);
        baseRequest.setHeader(AvaTaxConstants.XClientHeader, clientId);
        if (headers != null && !headers.isEmpty()) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                baseRequest.setHeader(entry.getKey(), entry.getValue());
            }
        }
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
        return userConfig.getConnectionRequestTimeout() == -1 || userConfig.getConnectTimeout() == -1
                || userConfig.getSocketTimeout() == -1;
    }

    private void addTimeOut(HttpRequestBase baseRequest, RequestConfig userConfig) {
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
            builder = RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut)
                    .setConnectionRequestTimeout(timeOut);
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
