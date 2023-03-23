package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class RestCallFactory {
    private String appName;
    private String appVersion;
    private String machineName;
    private String environmentUrl;
    private String header;
    private CloseableHttpClient closeableHttpClient;

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
        this.closeableHttpClient = ClosableHttpClientFactory.getInstance(null, null, null, null).getCloseableHttpClient();
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, HttpClientBuilder httpClientBuilder) {
        this(appName, appVersion, machineName, environmentUrl);
        this.closeableHttpClient = ClosableHttpClientFactory.getInstance(httpClientBuilder, null, null, null).getCloseableHttpClient();
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl);
        this.closeableHttpClient = ClosableHttpClientFactory.getInstance(null, proxyHost, proxyPort, proxySchema).getCloseableHttpClient();
    }

    public <T> RestCall<T> createRestCall(String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, closeableHttpClient, null, header);
    }

    public <T> RestCall<T> createRestCall(String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String apiVersion) {
        return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, closeableHttpClient, apiVersion, header);
    }

    public void addSecurityHeader(String header) {
        this.header = header;
    }
}
