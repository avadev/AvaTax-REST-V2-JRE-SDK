package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 * Swagger name: AvaTaxClient
 */

/**
 * Provides detailed information about an API call.
*  
* The information on this record was captured by AvaTax when your API call was made. If you are unsure why you
* received an error, you can fetch these audit objects and examine the `RequestUrl`, `RequestBody`, and `ErrorMessage`
* fields to determine root cause for the error.
 */
public class AuditModel {


    private Long transactionId;

    /**
     * Getter for transactionId
     *
     * A unique ID number referring to this individual API call.
	 * 
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * A unique ID number referring to this individual API call.
     */
    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the account to which the user belongs.
	 * 
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the account to which the user belongs.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private Integer userId;

    /**
     * Getter for userId
     *
     * The unique ID number of the user that performed this API call.
	 * 
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for userId
     *
     * The unique ID number of the user that performed this API call.
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    private String ipAddress;

    /**
     * Getter for ipAddress
     *
     * The origin IP address from which AvaTax received this API call. If you use a proxy layer or other
    * gateway, this IP address may be the address of the gateway. This information is not guaranteed
    * to be accurate and may change based on network conditions between your site and AvaTax.
	 * 
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Setter for ipAddress
     *
     * The origin IP address from which AvaTax received this API call. If you use a proxy layer or other
    * gateway, this IP address may be the address of the gateway. This information is not guaranteed
    * to be accurate and may change based on network conditions between your site and AvaTax.
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    private String machineName;

    /**
     * Getter for machineName
     *
     * If your API call specified a `MachineName` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
	 * 
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * Setter for machineName
     *
     * If your API call specified a `MachineName` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
     */
    public void setMachineName(String value) {
        this.machineName = value;
    }

    private String clientName;

    /**
     * Getter for clientName
     *
     * If your API call specified a `ClientName` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
	 * 
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * Setter for clientName
     *
     * If your API call specified a `ClientName` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    private String clientVersion;

    /**
     * Getter for clientVersion
     *
     * If your API call specified a `ClientVersion` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
	 * 
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * Setter for clientVersion
     *
     * If your API call specified a `ClientVersion` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

    private String adapterName;

    /**
     * Getter for adapterName
     *
     * If your API call specified a `AdapterName` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
	 * 
     */
    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * Setter for adapterName
     *
     * If your API call specified a `AdapterName` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
     */
    public void setAdapterName(String value) {
        this.adapterName = value;
    }

    private String adapterVersion;

    /**
     * Getter for adapterVersion
     *
     * If your API call specified a `AdapterVersion` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
	 * 
     */
    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    /**
     * Setter for adapterVersion
     *
     * If your API call specified a `AdapterVersion` in the [Client Profile Headers](https://developer.avalara.com/avatax/client-headers/), this
    * variable will contain its value. This information is self-reported by the client and is not guaranteed to be present.
     */
    public void setAdapterVersion(String value) {
        this.adapterVersion = value;
    }

    private String serverName;

    /**
     * Getter for serverName
     *
     * The server name of the AvaTax server that responded to this API call.
	 * 
     */
    public String getServerName() {
        return this.serverName;
    }

    /**
     * Setter for serverName
     *
     * The server name of the AvaTax server that responded to this API call.
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    private String serverVersion;

    /**
     * Getter for serverVersion
     *
     * The software version number of the currently deployed AvaTax API software on the server that responded to this API call.
	 * 
     */
    public String getServerVersion() {
        return this.serverVersion;
    }

    /**
     * Setter for serverVersion
     *
     * The software version number of the currently deployed AvaTax API software on the server that responded to this API call.
     */
    public void setServerVersion(String value) {
        this.serverVersion = value;
    }

    private Long referenceId;

    /**
     * Getter for referenceId
     *
     * A context-dependent reference ID for this API call. This reference ID is not guaranteed to contain a specific value
    * and may be used differently by various API calls.
	 * 
     */
    public Long getReferenceId() {
        return this.referenceId;
    }

    /**
     * Setter for referenceId
     *
     * A context-dependent reference ID for this API call. This reference ID is not guaranteed to contain a specific value
    * and may be used differently by various API calls.
     */
    public void setReferenceId(Long value) {
        this.referenceId = value;
    }

    private Integer severityLevelId;

    /**
     * Getter for severityLevelId
     *
     * If the API contained a specific type of error code, this value would contain the unique ID number of the severity level
    * of the response returned to the client.
	 * 
     */
    public Integer getSeverityLevelId() {
        return this.severityLevelId;
    }

    /**
     * Setter for severityLevelId
     *
     * If the API contained a specific type of error code, this value would contain the unique ID number of the severity level
    * of the response returned to the client.
     */
    public void setSeverityLevelId(Integer value) {
        this.severityLevelId = value;
    }

    private Date serverTimestamp;

    /**
     * Getter for serverTimestamp
     *
     * The server timestamp, in UTC, of the time when the server received this API call.
	 * 
     */
    public Date getServerTimestamp() {
        return this.serverTimestamp;
    }

    /**
     * Setter for serverTimestamp
     *
     * The server timestamp, in UTC, of the time when the server received this API call.
     */
    public void setServerTimestamp(Date value) {
        this.serverTimestamp = value;
    }

    private Integer serverDuration;

    /**
     * Getter for serverDuration
     *
     * The number of milliseconds that the AvaTax server took to respond to this API call.
	 * 
     */
    public Integer getServerDuration() {
        return this.serverDuration;
    }

    /**
     * Setter for serverDuration
     *
     * The number of milliseconds that the AvaTax server took to respond to this API call.
     */
    public void setServerDuration(Integer value) {
        this.serverDuration = value;
    }

    private String serviceName;

    /**
     * Getter for serviceName
     *
     * The service name of the AvaTax API service that responded to this API call.
	 * 
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Setter for serviceName
     *
     * The service name of the AvaTax API service that responded to this API call.
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    private String operation;

    /**
     * Getter for operation
     *
     * The operation name of this API call.
	 * 
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Setter for operation
     *
     * The operation name of this API call.
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    private String referenceCode;

    /**
     * Getter for referenceCode
     *
     * A context-dependent reference code for this API call. This reference code is not guaranteed to contain a specific value
    * and may be used differently by various API calls.
	 * 
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * A context-dependent reference code for this API call. This reference code is not guaranteed to contain a specific value
    * and may be used differently by various API calls.
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    private String errorMessage;

    /**
     * Getter for errorMessage
     *
     * If this API call reported an error, this contains the name of the error that was returned. You can look up more
    * information about AvaTax error messages on the [AvaTax REST Error Page](https://developer.avalara.com/avatax/errors/).
	 * 
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage
     *
     * If this API call reported an error, this contains the name of the error that was returned. You can look up more
    * information about AvaTax error messages on the [AvaTax REST Error Page](https://developer.avalara.com/avatax/errors/).
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    private String auditMessage;

    /**
     * Getter for auditMessage
     *
     * Reserved for Avalara internal usage.
	 * 
     */
    public String getAuditMessage() {
        return this.auditMessage;
    }

    /**
     * Setter for auditMessage
     *
     * Reserved for Avalara internal usage.
     */
    public void setAuditMessage(String value) {
        this.auditMessage = value;
    }

    private Integer loadBalancerDuration;

    /**
     * Getter for loadBalancerDuration
     *
     * Reserved for Avalara internal usage.
	 * 
     */
    public Integer getLoadBalancerDuration() {
        return this.loadBalancerDuration;
    }

    /**
     * Setter for loadBalancerDuration
     *
     * Reserved for Avalara internal usage.
     */
    public void setLoadBalancerDuration(Integer value) {
        this.loadBalancerDuration = value;
    }

    private Integer recordCount;

    /**
     * Getter for recordCount
     *
     * If this API call returned an array of information, this value contains the number of records returned.
	 * 
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * Setter for recordCount
     *
     * If this API call returned an array of information, this value contains the number of records returned.
     */
    public void setRecordCount(Integer value) {
        this.recordCount = value;
    }

    private String referenceAuthorization;

    /**
     * Getter for referenceAuthorization
     *
     * Reserved for Avalara internal usage.
	 * 
     */
    public String getReferenceAuthorization() {
        return this.referenceAuthorization;
    }

    /**
     * Setter for referenceAuthorization
     *
     * Reserved for Avalara internal usage.
     */
    public void setReferenceAuthorization(String value) {
        this.referenceAuthorization = value;
    }

    private Boolean isQueued;

    /**
     * Getter for isQueued
     *
     * Reserved for Avalara internal usage.
	 * 
     */
    public Boolean getIsQueued() {
        return this.isQueued;
    }

    /**
     * Setter for isQueued
     *
     * Reserved for Avalara internal usage.
     */
    public void setIsQueued(Boolean value) {
        this.isQueued = value;
    }

    private Integer databaseCallCount;

    /**
     * Getter for databaseCallCount
     *
     * If this API call included requests made to any of the AvaTax data layers, this contains the number of requests that were traced.
    *  
    * Please note that not all data layers support this measurement.
	 * 
     */
    public Integer getDatabaseCallCount() {
        return this.databaseCallCount;
    }

    /**
     * Setter for databaseCallCount
     *
     * If this API call included requests made to any of the AvaTax data layers, this contains the number of requests that were traced.
    *  
    * Please note that not all data layers support this measurement.
     */
    public void setDatabaseCallCount(Integer value) {
        this.databaseCallCount = value;
    }

    private String databaseCallDuration;

    /**
     * Getter for databaseCallDuration
     *
     * If this API call included requests made to any of the AvaTax data layers, this contains the total duration time measured for all the requests.
    *  
    * Please note that not all data layers support this measurement.
	 * 
     */
    public String getDatabaseCallDuration() {
        return this.databaseCallDuration;
    }

    /**
     * Setter for databaseCallDuration
     *
     * If this API call included requests made to any of the AvaTax data layers, this contains the total duration time measured for all the requests.
    *  
    * Please note that not all data layers support this measurement.
     */
    public void setDatabaseCallDuration(String value) {
        this.databaseCallDuration = value;
    }

    private String remoteCallDuration;

    /**
     * Getter for remoteCallDuration
     *
     * If this API call included interoperation with other Avalara services, this contains the amount of time taken by those services.
	 * 
     */
    public String getRemoteCallDuration() {
        return this.remoteCallDuration;
    }

    /**
     * Setter for remoteCallDuration
     *
     * If this API call included interoperation with other Avalara services, this contains the amount of time taken by those services.
     */
    public void setRemoteCallDuration(String value) {
        this.remoteCallDuration = value;
    }

    private ArrayList<AuditEvent> events;

    /**
     * Getter for events
     *
     * Reserved for Avalara internal usage.
	 * 
     */
    public ArrayList<AuditEvent> getEvents() {
        return this.events;
    }

    /**
     * Setter for events
     *
     * Reserved for Avalara internal usage.
     */
    public void setEvents(ArrayList<AuditEvent> value) {
        this.events = value;
    }

    private String requestUrl;

    /**
     * Getter for requestUrl
     *
     * The original request URL as provided by the client.
	 * 
     */
    public String getRequestUrl() {
        return this.requestUrl;
    }

    /**
     * Setter for requestUrl
     *
     * The original request URL as provided by the client.
     */
    public void setRequestUrl(String value) {
        this.requestUrl = value;
    }

    private String requestBody;

    /**
     * Getter for requestBody
     *
     * If this request was an HTTP request that included a body such as a POST or a PUT, this will contain the request body sent by the client.
    *  
    * This request body is represented as a string, exactly as it was received from the client. Regardless of whether the request was JSON,
    * Base64 encoded bytes, or a CSV file, this contains the exact contents of the request body.
	 * 
     */
    public String getRequestBody() {
        return this.requestBody;
    }

    /**
     * Setter for requestBody
     *
     * If this request was an HTTP request that included a body such as a POST or a PUT, this will contain the request body sent by the client.
    *  
    * This request body is represented as a string, exactly as it was received from the client. Regardless of whether the request was JSON,
    * Base64 encoded bytes, or a CSV file, this contains the exact contents of the request body.
     */
    public void setRequestBody(String value) {
        this.requestBody = value;
    }

    private Integer responseStatus;

    /**
     * Getter for responseStatus
     *
     * The HTTP response code that was sent by the server.
	 * 
     */
    public Integer getResponseStatus() {
        return this.responseStatus;
    }

    /**
     * Setter for responseStatus
     *
     * The HTTP response code that was sent by the server.
     */
    public void setResponseStatus(Integer value) {
        this.responseStatus = value;
    }

    private String responseBody;

    /**
     * Getter for responseBody
     *
     * The entire response body sent from the AvaTax server to the client. This value is returned as a string regardless of whether the results
    * were JSON-formatted text, CSV files, or raw strings.
	 * 
     */
    public String getResponseBody() {
        return this.responseBody;
    }

    /**
     * Setter for responseBody
     *
     * The entire response body sent from the AvaTax server to the client. This value is returned as a string regardless of whether the results
    * were JSON-formatted text, CSV files, or raw strings.
     */
    public void setResponseBody(String value) {
        this.responseBody = value;
    }

    private ArrayList<AuditModel> remoteCalls;

    /**
     * Getter for remoteCalls
     *
     * Reserved for Avalara internal usage.
	 * 
     */
    public ArrayList<AuditModel> getRemoteCalls() {
        return this.remoteCalls;
    }

    /**
     * Setter for remoteCalls
     *
     * Reserved for Avalara internal usage.
     */
    public void setRemoteCalls(ArrayList<AuditModel> value) {
        this.remoteCalls = value;
    }

    /**
     * Returns a JSON string representation of AuditModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
