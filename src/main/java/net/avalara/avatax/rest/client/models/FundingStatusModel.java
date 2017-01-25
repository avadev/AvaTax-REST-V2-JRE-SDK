package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Status of an Avalara Managed Returns funding configuration for a company
 */
public class FundingStatusModel {
    private String recipient;

    /**
     * Getter for recipient - Recipient
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Setter for recipient - Recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    
    private String documentKey;

    /**
     * Getter for documentKey - DocumentKey
     */
    public String getDocumentKey() {
        return this.documentKey;
    }

    /**
     * Setter for documentKey - DocumentKey
     */
    public void setDocumentKey(String documentKey) {
        this.documentKey = documentKey;
    }

    
    private String errorMessage;

    /**
     * Getter for errorMessage - ErrorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage - ErrorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    private Date lastActivated;

    /**
     * Getter for lastActivated - LastActivated
     */
    public Date getLastActivated() {
        return this.lastActivated;
    }

    /**
     * Setter for lastActivated - LastActivated
     */
    public void setLastActivated(Date lastActivated) {
        this.lastActivated = lastActivated;
    }

    
    private String domain;

    /**
     * Getter for domain - Domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Setter for domain - Domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    
    private String documentName;

    /**
     * Getter for documentName - DocumentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Setter for documentName - DocumentName
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    
    private Date lastSigned;

    /**
     * Getter for lastSigned - LastSigned
     */
    public Date getLastSigned() {
        return this.lastSigned;
    }

    /**
     * Setter for lastSigned - LastSigned
     */
    public void setLastSigned(Date lastSigned) {
        this.lastSigned = lastSigned;
    }

    
    private FundingESignMethodReturn methodReturn;

    /**
     * Getter for methodReturn - MethodReturn
     */
    public FundingESignMethodReturn getMethodReturn() {
        return this.methodReturn;
    }

    /**
     * Setter for methodReturn - MethodReturn
     */
    public void setMethodReturn(FundingESignMethodReturn methodReturn) {
        this.methodReturn = methodReturn;
    }

    
    private String status;

    /**
     * Getter for status - Status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
    private String documentType;

    /**
     * Getter for documentType - DocumentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType - DocumentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    
    private Integer subledgerProfileID;

    /**
     * Getter for subledgerProfileID - SubledgerProfileID
     */
    public Integer getSubledgerProfileID() {
        return this.subledgerProfileID;
    }

    /**
     * Setter for subledgerProfileID - SubledgerProfileID
     */
    public void setSubledgerProfileID(Integer subledgerProfileID) {
        this.subledgerProfileID = subledgerProfileID;
    }

    
    private String sender;

    /**
     * Getter for sender - Sender
     */
    public String getSender() {
        return this.sender;
    }

    /**
     * Setter for sender - Sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    
    private Long requestId;

    /**
     * Getter for requestId - The unique ID number of this funding request
     */
    public Long getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for requestId - The unique ID number of this funding request
     */
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    
    private Long templateRequestId;

    /**
     * Getter for templateRequestId - TemplateRequestId
     */
    public Long getTemplateRequestId() {
        return this.templateRequestId;
    }

    /**
     * Setter for templateRequestId - TemplateRequestId
     */
    public void setTemplateRequestId(Long templateRequestId) {
        this.templateRequestId = templateRequestId;
    }

    
    private Date lastPolled;

    /**
     * Getter for lastPolled - LastPolled
     */
    public Date getLastPolled() {
        return this.lastPolled;
    }

    /**
     * Setter for lastPolled - LastPolled
     */
    public void setLastPolled(Date lastPolled) {
        this.lastPolled = lastPolled;
    }

    
    private String companyID;

    /**
     * Getter for companyID - CompanyID
     */
    public String getCompanyID() {
        return this.companyID;
    }

    /**
     * Setter for companyID - CompanyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    


    /**
     * Returns a JSON string representation of FundingStatusModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    