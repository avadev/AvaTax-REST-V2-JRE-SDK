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
     * Getter for recipient - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Setter for recipient - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    
    private String documentKey;

    /**
     * Getter for documentKey - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getDocumentKey() {
        return this.documentKey;
    }

    /**
     * Setter for documentKey - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setDocumentKey(String documentKey) {
        this.documentKey = documentKey;
    }

    
    private String errorMessage;

    /**
     * Getter for errorMessage - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    private Date lastActivated;

    /**
     * Getter for lastActivated - Status of an Avalara Managed Returns funding configuration for a company
     */
    public Date getLastActivated() {
        return this.lastActivated;
    }

    /**
     * Setter for lastActivated - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setLastActivated(Date lastActivated) {
        this.lastActivated = lastActivated;
    }

    
    private String domain;

    /**
     * Getter for domain - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Setter for domain - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    
    private String documentName;

    /**
     * Getter for documentName - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Setter for documentName - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    
    private Date lastSigned;

    /**
     * Getter for lastSigned - Status of an Avalara Managed Returns funding configuration for a company
     */
    public Date getLastSigned() {
        return this.lastSigned;
    }

    /**
     * Setter for lastSigned - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setLastSigned(Date lastSigned) {
        this.lastSigned = lastSigned;
    }

    
    private FundingESignMethodReturn methodReturn;

    /**
     * Getter for methodReturn - Status of an Avalara Managed Returns funding configuration for a company
     */
    public FundingESignMethodReturn getMethodReturn() {
        return this.methodReturn;
    }

    /**
     * Setter for methodReturn - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setMethodReturn(FundingESignMethodReturn methodReturn) {
        this.methodReturn = methodReturn;
    }

    
    private String status;

    /**
     * Getter for status - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
    private String documentType;

    /**
     * Getter for documentType - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    
    private Integer subledgerProfileID;

    /**
     * Getter for subledgerProfileID - Status of an Avalara Managed Returns funding configuration for a company
     */
    public Integer getSubledgerProfileID() {
        return this.subledgerProfileID;
    }

    /**
     * Setter for subledgerProfileID - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setSubledgerProfileID(Integer subledgerProfileID) {
        this.subledgerProfileID = subledgerProfileID;
    }

    
    private String sender;

    /**
     * Getter for sender - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getSender() {
        return this.sender;
    }

    /**
     * Setter for sender - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    
    private Long requestId;

    /**
     * Getter for requestId - Status of an Avalara Managed Returns funding configuration for a company
     */
    public Long getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for requestId - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    
    private Long templateRequestId;

    /**
     * Getter for templateRequestId - Status of an Avalara Managed Returns funding configuration for a company
     */
    public Long getTemplateRequestId() {
        return this.templateRequestId;
    }

    /**
     * Setter for templateRequestId - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setTemplateRequestId(Long templateRequestId) {
        this.templateRequestId = templateRequestId;
    }

    
    private Date lastPolled;

    /**
     * Getter for lastPolled - Status of an Avalara Managed Returns funding configuration for a company
     */
    public Date getLastPolled() {
        return this.lastPolled;
    }

    /**
     * Setter for lastPolled - Status of an Avalara Managed Returns funding configuration for a company
     */
    public void setLastPolled(Date lastPolled) {
        this.lastPolled = lastPolled;
    }

    
    private String companyID;

    /**
     * Getter for companyID - Status of an Avalara Managed Returns funding configuration for a company
     */
    public String getCompanyID() {
        return this.companyID;
    }

    /**
     * Setter for companyID - Status of an Avalara Managed Returns funding configuration for a company
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
    