package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.models.UserConfiguration;
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
    private UserConfiguration userConfiguration;

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl,UserConfiguration userConfiguration) {
        this(appName,appVersion,machineName,environmentUrl);
        setUserConfig( userConfiguration);
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, HttpClientBuilder httpClientBuilder) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.environmentUrl = environmentUrl;
        this.httpClientBuilder = httpClientBuilder;
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, HttpClientBuilder httpClientBuilder,UserConfiguration userConfiguration) {
        this(appName,appVersion,machineName,environmentUrl,httpClientBuilder);
        setUserConfig(userConfiguration);
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environmentUrl);
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.proxySchema = proxySchema;
    }

    public RestCallFactory(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema,UserConfiguration userConfiguration) {
        this(appName, appVersion, machineName, environmentUrl);
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.proxySchema = proxySchema;
        setUserConfig(userConfiguration);
    }

    public void setUserConfig(UserConfiguration userConfiguration){
        if(userConfiguration==null){
            this.userConfiguration=new UserConfiguration();
        }
        else {
            this.userConfiguration = userConfiguration;
        }
    }

    public <T> RestCall<T> createRestCall(String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        if (header != null) {
            if (proxyHost == null) {
                if (httpClientBuilder == null) {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, userConfiguration);
                } else {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, httpClientBuilder, userConfiguration);
                }
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, header, method, path, model, typeToken, proxyHost, proxyPort, proxySchema, userConfiguration);
            }
        } else {
            if (proxyHost == null) {
                if (httpClientBuilder == null) {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, userConfiguration);
                } else {
                    return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, httpClientBuilder, userConfiguration);
                }
            } else {
                return new RestCall<T>(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken, proxyHost, proxyPort, proxySchema, userConfiguration);
            }
        }
    }

    public void addSecurityHeader(String header) {
        this.header = header;
    }
}
