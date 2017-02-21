package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;

public class RestCallFactory {
    private String appName;
    private String appVersion;
    private String machineName;
    private String environmentUrl;
    private String header;
    private String proxyHost;
    private int proxyPort;
    private String proxySchema;

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
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
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken);
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, proxyHost, proxyPort, proxySchema);
            }
        } else {
            if (proxyHost == null) {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken);
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema);
            }
        }
    }

    public void addSecurityHeader(String header) {
        this.header = header;
    }
}
