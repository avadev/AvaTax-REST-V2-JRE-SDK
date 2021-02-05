package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.models.CreateTransactionModel;
import net.avalara.avatax.rest.client.models.ErrorResult;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.config.RequestConfig;

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

        buildRequest(this.request);
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


    @Override
    public T call() throws Exception {

        CloseableHttpResponse response = this.client.execute(this.request);
        T obj = null;

        try {
            HttpEntity entity = response.getEntity();

            if (response.getStatusLine().getStatusCode() != 200 && response.getStatusLine().getStatusCode() != 201) {
                throw new AvaTaxClientException((ErrorResult) JsonSerializer.DeserializeObject(EntityUtils.toString(entity), ErrorResult.class), model);
            }

            if (entity != null) {
                if(ContentType.getOrDefault(entity).getMimeType().equals("application/json")) {
                    obj = (T)JsonSerializer.DeserializeObject(EntityUtils.toString(entity), typeToken.getType());
                }
                else {
                    obj = (T)EntityUtils.toString(entity);
                }
            }
        } finally {
            response.close();
        }

        return obj;
    }

    private void buildRequest(HttpRequestBase baseRequest) {

        int timeOut = 1200000;
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).setConnectionRequestTimeout(timeOut).build();
        baseRequest.setConfig(requestConfig);
        String clientId = String.format("%s; %s; %s; %s; %s", appName, appVersion, "JavaRestClient", "20.12.1", machineName);
        baseRequest.setHeader(AvaTaxConstants.XClientHeader, clientId);
    }
}
