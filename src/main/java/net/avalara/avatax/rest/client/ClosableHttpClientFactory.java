package net.avalara.avatax.rest.client;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;

public class ClosableHttpClientFactory {
    private static CloseableHttpClient closeableHttpClient;

    private static ClosableHttpClientFactory instance = null;

    private ClosableHttpClientFactory(HttpClientBuilder httpClientBuilder,
                                     String proxyHost, Integer proxyPort, String proxySchema) {

        if(closeableHttpClient == null) {
            if (httpClientBuilder == null && proxyHost == null) {
                closeableHttpClient = HttpClients.createDefault();
            } else if (httpClientBuilder != null) {
                closeableHttpClient = httpClientBuilder.build();
            } else {
                closeableHttpClient = HttpClients.custom()
                        .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                        .build();
            }
        }
    }

    public static synchronized ClosableHttpClientFactory getInstance(HttpClientBuilder httpClientBuilder, String proxyHost, Integer proxyPort, String proxySchema) {
        if (instance == null)
            instance = new ClosableHttpClientFactory(httpClientBuilder, proxyHost, proxyPort, proxySchema);
        return instance;
    }

    public synchronized CloseableHttpClient getCloseableHttpClient() {
        return closeableHttpClient;
    }
}
