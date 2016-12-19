package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;

public class RestCallFactory {
    private String appName;
    private String appVersion;
    private String machineName;
    private String environmentUrl;
    private String header;

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
    }

    public <T> RestCall<T> createRestCall(String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        if (header != null) {
            return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken);
        } else {
            return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken);
        }
    }

    public void addSecurityHeader(String header) {
        this.header = header;
    }
}
