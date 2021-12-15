package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class RestCallFactory {
    private String appName;
    private String appVersion;
    private String machineName;
    private String environmentUrl;
    private String header;
    private String proxyHost;
    private int proxyPort;
    private String proxySchema;
    private HttpClientBuilder httpClientBuilder;

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, HttpClientBuilder httpClientBuilder) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
        this.httpClientBuilder = httpClientBuilder;
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl);
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.proxySchema = proxySchema;
    }

    public <T> RestCall<T> createRestCall(String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        if (header != null) {
            if (proxyHost == null) {
                if (httpClientBuilder == null) {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken);
                } else {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, httpClientBuilder);
                }
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, proxyHost, proxyPort, proxySchema);
            }
        } else {
            if (proxyHost == null) {
                if (httpClientBuilder == null) {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken);
                } else {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder);
                }
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema);
            }
        }
    }

    public <T> RestCall<T> createRestCall(String method, AvaTaxPath path, Object model, TypeToken<T> typeToken, String apiVersion) {
        if (header != null) {
            if (proxyHost == null) {
                if (httpClientBuilder == null) {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken,apiVersion);
                } else {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, httpClientBuilder,apiVersion);
                }
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, proxyHost, proxyPort, proxySchema,apiVersion);
            }
        } else {
            if (proxyHost == null) {
                if (httpClientBuilder == null) {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken,apiVersion);
                } else {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder,apiVersion);
                }
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema,apiVersion);
            }
        }
    }

    public void addSecurityHeader(String header) {
        this.header = header;
    }
}
