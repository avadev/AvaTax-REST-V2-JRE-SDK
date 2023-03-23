package net.avalara.avatax.rest.client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LogObject {
    private String httpMethod;
    private String headerCorrelationId;
    private String requestDetails;
    private String responseDetails;
    private URI requestURI;
    private long totalExecutionTime;
    private Integer statusCode;
    private String timestamp;
    private String exceptionMessage;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

    static {
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public LogObject() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void populateRequestInfo(HttpRequestBase request) throws IOException {
        this.timestamp = formatter.format(new Date());
        this.httpMethod = request.getMethod();
        this.requestURI = request.getURI();

        if(AvaTaxConstants.shouldLogRequestAndResponse) {
            if ("POST".equalsIgnoreCase(this.httpMethod)) {
                this.requestDetails = EntityUtils.toString(((HttpPost) request).getEntity());
            } else if ("PUT".equalsIgnoreCase(this.httpMethod)) {
                this.requestDetails = EntityUtils.toString(((HttpPut)request).getEntity());
            }
        }
    }

    public void populateErrorInfo(String exceptionMessage, CloseableHttpResponse response,
                                  long startTime){
        populateTotalExecutionTime(startTime);
        populateStatusCode(response);
        populateHeaderCorrelationId(response);
        this.exceptionMessage = exceptionMessage;
    }

    public void populateResponseInfo(CloseableHttpResponse response, String responseJson, long startTime) {
        populateTotalExecutionTime(startTime);
        populateStatusCode(response);
        populateHeaderCorrelationId(response);
        if(AvaTaxConstants.shouldLogRequestAndResponse) {
            this.responseDetails = responseJson;
        }
    }

    private void populateStatusCode(CloseableHttpResponse response) {
        if(response != null && response.getStatusLine() != null)
            this.statusCode = response.getStatusLine().getStatusCode();
    }

    private void populateTotalExecutionTime(long startTime) {
        long stopTime = System.currentTimeMillis();
        this.totalExecutionTime = stopTime - startTime;
    }

    private void populateHeaderCorrelationId(CloseableHttpResponse response) {
        if(response != null && response.getHeaders("x-correlation-id") != null
                && response.getHeaders("x-correlation-id").length > 0) {
            this.headerCorrelationId = response.getHeaders("x-correlation-id")[0].getValue();
        }
    }
}
