package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.concurrent.Callable;

public class RestCall<T> implements Callable<T> {
    private CloseableHttpClient client;
    private HttpRequestBase request;
    private String appName;
    private String appVersion;
    private String machineName;
    private TypeToken<T> typeToken;

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        this.client = HttpClients.createDefault();
        this.appName = appName;
        this.appVersion = appVersion;
        this.machineName = machineName;
        this.typeToken = typeToken;

        if (method == "post") {
            this.request = new HttpPost(environmentUrl + path.toString());
            ((HttpPost)this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        } else if (method == "get") {
            this.request = new HttpGet(environmentUrl + path.toString());
        } else if (method == "delete") {
            this.request = new HttpDelete(environmentUrl + path.toString());
        } else if (method == "put") {
            this.request = new HttpPut(environmentUrl + path.toString());
            ((HttpPost)this.request).setEntity(new StringEntity(JsonSerializer.SerializeObject(model), ContentType.create("application/json", "UTF-8")));
        }

        buildRequest(this.request);
    }

    public RestCall(String appName, String appVersion, String machineName, String environmentUrl, String header, String method, AvaTaxPath path, Object model, TypeToken<T> typeToken) {
        this(appName, appVersion, machineName, environmentUrl, method, path, model, typeToken);

        this.request.setHeader("Authorization", "Basic " + header);
    }

    @Override
    public T call() throws Exception {
        CloseableHttpResponse response = this.client.execute(this.request);
        T obj = null;

        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                obj = (T)JsonSerializer.DeserializeObject(EntityUtils.toString(entity), typeToken.getType());
            }
        } finally {
            response.close();
        }

        return obj;
    }

    private void buildRequest(HttpRequestBase baseRequest) {
        String clientId = String.format("%s; %s; %s; %s; %s", appName, appVersion, "JavaRestClient", "2.16.12", machineName);
        baseRequest.setHeader(AvaTaxConstants.XClientHeader, clientId);
    }
}
