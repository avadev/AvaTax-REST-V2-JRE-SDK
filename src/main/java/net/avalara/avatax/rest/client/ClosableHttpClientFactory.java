package net.avalara.avatax.rest.client;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;

/**
 * Factory for creating CloseableHttpClient instances.
 * Each call returns a new HttpClient instance with the specified configuration.
 */
public class ClosableHttpClientFactory {
    private final CloseableHttpClient closeableHttpClient;

    private ClosableHttpClientFactory(HttpClientBuilder httpClientBuilder,
            String proxyHost, Integer proxyPort, String proxySchema) {
        if (httpClientBuilder != null) {
            this.closeableHttpClient = httpClientBuilder.build();
        } else if (proxyHost != null) {
            this.closeableHttpClient = HttpClients.custom()
                    .setRoutePlanner(new DefaultProxyRoutePlanner(new HttpHost(proxyHost, proxyPort, proxySchema)))
                    .build();
        } else {
            this.closeableHttpClient = HttpClients.createDefault();
        }
    }

    /**
     * Creates a new ClosableHttpClientFactory with the specified configuration.
     * Each call returns a new factory with its own HttpClient instance.
     *
     * @param httpClientBuilder Custom HttpClientBuilder, or null for default
     * @param proxyHost         Proxy host, or null if no proxy
     * @param proxyPort         Proxy port
     * @param proxySchema       Proxy schema (e.g., "http")
     * @return A new ClosableHttpClientFactory instance
     */
    public static ClosableHttpClientFactory create(HttpClientBuilder httpClientBuilder,
            String proxyHost, Integer proxyPort, String proxySchema) {
        return new ClosableHttpClientFactory(httpClientBuilder, proxyHost, proxyPort, proxySchema);
    }

    public CloseableHttpClient getCloseableHttpClient() {
        return closeableHttpClient;
    }
}
