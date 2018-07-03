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
 */

/**
 * Provides detailed information about an API call.
 */
public class AuditModel {


    private Long transactionId;

    /**
     * Getter for transactionId
     *
     * The transaction id
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * The transaction id
     */
    public void setTransactionId(Long value) {
        this.transactionId = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The account id
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The account id
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private Integer userId;

    /**
     * Getter for userId
     *
     * The user id
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for userId
     *
     * The user id
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }


    private String ipAddress;

    /**
     * Getter for ipAddress
     *
     * The IP address
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Setter for ipAddress
     *
     * The IP address
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }


    private String machineName;

    /**
     * Getter for machineName
     *
     * The machine name
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * Setter for machineName
     *
     * The machine name
     */
    public void setMachineName(String value) {
        this.machineName = value;
    }


    private String clientName;

    /**
     * Getter for clientName
     *
     * The client name
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * Setter for clientName
     *
     * The client name
     */
    public void setClientName(String value) {
        this.clientName = value;
    }


    private String clientVersion;

    /**
     * Getter for clientVersion
     *
     * The client version
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * Setter for clientVersion
     *
     * The client version
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }


    private String adapterName;

    /**
     * Getter for adapterName
     *
     * The adapter name
     */
    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * Setter for adapterName
     *
     * The adapter name
     */
    public void setAdapterName(String value) {
        this.adapterName = value;
    }


    private String adapterVersion;

    /**
     * Getter for adapterVersion
     *
     * The adapter version
     */
    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    /**
     * Setter for adapterVersion
     *
     * The adapter version
     */
    public void setAdapterVersion(String value) {
        this.adapterVersion = value;
    }


    private String serverName;

    /**
     * Getter for serverName
     *
     * The server name
     */
    public String getServerName() {
        return this.serverName;
    }

    /**
     * Setter for serverName
     *
     * The server name
     */
    public void setServerName(String value) {
        this.serverName = value;
    }


    private String serverVersion;

    /**
     * Getter for serverVersion
     *
     * The server version
     */
    public String getServerVersion() {
        return this.serverVersion;
    }

    /**
     * Setter for serverVersion
     *
     * The server version
     */
    public void setServerVersion(String value) {
        this.serverVersion = value;
    }


    private Long referenceId;

    /**
     * Getter for referenceId
     *
     * The reference id
     */
    public Long getReferenceId() {
        return this.referenceId;
    }

    /**
     * Setter for referenceId
     *
     * The reference id
     */
    public void setReferenceId(Long value) {
        this.referenceId = value;
    }


    private String severityLevelId;

    /**
     * Getter for severityLevelId
     *
     * The severity level id
     */
    public String getSeverityLevelId() {
        return this.severityLevelId;
    }

    /**
     * Setter for severityLevelId
     *
     * The severity level id
     */
    public void setSeverityLevelId(String value) {
        this.severityLevelId = value;
    }


    private Date serverTimestamp;

    /**
     * Getter for serverTimestamp
     *
     * The server timestamp
     */
    public Date getServerTimestamp() {
        return this.serverTimestamp;
    }

    /**
     * Setter for serverTimestamp
     *
     * The server timestamp
     */
    public void setServerTimestamp(Date value) {
        this.serverTimestamp = value;
    }


    private Integer serverDuration;

    /**
     * Getter for serverDuration
     *
     * The server duration
     */
    public Integer getServerDuration() {
        return this.serverDuration;
    }

    /**
     * Setter for serverDuration
     *
     * The server duration
     */
    public void setServerDuration(Integer value) {
        this.serverDuration = value;
    }


    private String serviceName;

    /**
     * Getter for serviceName
     *
     * The service name
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Setter for serviceName
     *
     * The service name
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }


    private String operation;

    /**
     * Getter for operation
     *
     * The operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Setter for operation
     *
     * The operation
     */
    public void setOperation(String value) {
        this.operation = value;
    }


    private String referenceCode;

    /**
     * Getter for referenceCode
     *
     * The reference code
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * The reference code
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }


    private String errorMessage;

    /**
     * Getter for errorMessage
     *
     * The error message
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage
     *
     * The error message
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }


    private String auditMessage;

    /**
     * Getter for auditMessage
     *
     * The audit message
     */
    public String getAuditMessage() {
        return this.auditMessage;
    }

    /**
     * Setter for auditMessage
     *
     * The audit message
     */
    public void setAuditMessage(String value) {
        this.auditMessage = value;
    }


    private Integer lbDuration;

    /**
     * Getter for lbDuration
     *
     * The load balancer duration
     */
    public Integer getLbDuration() {
        return this.lbDuration;
    }

    /**
     * Setter for lbDuration
     *
     * The load balancer duration
     */
    public void setLbDuration(Integer value) {
        this.lbDuration = value;
    }


    private Integer recordCount;

    /**
     * Getter for recordCount
     *
     * The record count
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * Setter for recordCount
     *
     * The record count
     */
    public void setRecordCount(Integer value) {
        this.recordCount = value;
    }


    private String referenceAuthorization;

    /**
     * Getter for referenceAuthorization
     *
     * The reference authorization
     */
    public String getReferenceAuthorization() {
        return this.referenceAuthorization;
    }

    /**
     * Setter for referenceAuthorization
     *
     * The reference authorization
     */
    public void setReferenceAuthorization(String value) {
        this.referenceAuthorization = value;
    }


    private Boolean isQueued;

    /**
     * Getter for isQueued
     *
     * Whether or not it is queued
     */
    public Boolean getIsQueued() {
        return this.isQueued;
    }

    /**
     * Setter for isQueued
     *
     * Whether or not it is queued
     */
    public void setIsQueued(Boolean value) {
        this.isQueued = value;
    }


    private Integer databaseCallCount;

    /**
     * Getter for databaseCallCount
     *
     * The number of calls to the database
     */
    public Integer getDatabaseCallCount() {
        return this.databaseCallCount;
    }

    /**
     * Setter for databaseCallCount
     *
     * The number of calls to the database
     */
    public void setDatabaseCallCount(Integer value) {
        this.databaseCallCount = value;
    }


    private String databaseCallDuration;

    /**
     * Getter for databaseCallDuration
     *
     * The time to make a call to the database
     */
    public String getDatabaseCallDuration() {
        return this.databaseCallDuration;
    }

    /**
     * Setter for databaseCallDuration
     *
     * The time to make a call to the database
     */
    public void setDatabaseCallDuration(String value) {
        this.databaseCallDuration = value;
    }


    private String remoteCallDuration;

    /**
     * Getter for remoteCallDuration
     *
     * The time to receive a response from a remote server
     */
    public String getRemoteCallDuration() {
        return this.remoteCallDuration;
    }

    /**
     * Setter for remoteCallDuration
     *
     * The time to receive a response from a remote server
     */
    public void setRemoteCallDuration(String value) {
        this.remoteCallDuration = value;
    }


    private ArrayList<AuditEvent> events;

    /**
     * Getter for events
     *
     * Audit events
     */
    public ArrayList<AuditEvent> getEvents() {
        return this.events;
    }

    /**
     * Setter for events
     *
     * Audit events
     */
    public void setEvents(ArrayList<AuditEvent> value) {
        this.events = value;
    }


    private String requestUrl;

    /**
     * Getter for requestUrl
     *
     * The request url
     */
    public String getRequestUrl() {
        return this.requestUrl;
    }

    /**
     * Setter for requestUrl
     *
     * The request url
     */
    public void setRequestUrl(String value) {
        this.requestUrl = value;
    }


    private String requestBody;

    /**
     * Getter for requestBody
     *
     * The request body
     */
    public String getRequestBody() {
        return this.requestBody;
    }

    /**
     * Setter for requestBody
     *
     * The request body
     */
    public void setRequestBody(String value) {
        this.requestBody = value;
    }


    private Integer responseStatus;

    /**
     * Getter for responseStatus
     *
     * The resposne status
     */
    public Integer getResponseStatus() {
        return this.responseStatus;
    }

    /**
     * Setter for responseStatus
     *
     * The resposne status
     */
    public void setResponseStatus(Integer value) {
        this.responseStatus = value;
    }


    private String responseBody;

    /**
     * Getter for responseBody
     *
     * The response body
     */
    public String getResponseBody() {
        return this.responseBody;
    }

    /**
     * Setter for responseBody
     *
     * The response body
     */
    public void setResponseBody(String value) {
        this.responseBody = value;
    }


    private ArrayList<AuditModel> remoteCalls;

    /**
     * Getter for remoteCalls
     *
     * The remote calls
     */
    public ArrayList<AuditModel> getRemoteCalls() {
        return this.remoteCalls;
    }

    /**
     * Setter for remoteCalls
     *
     * The remote calls
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
