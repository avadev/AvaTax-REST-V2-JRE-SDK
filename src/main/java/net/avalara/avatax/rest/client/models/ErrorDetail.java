package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Message object
 */
public class ErrorDetail {
    private Integer number;

    /**
     * Getter for number - Message object
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for number - Message object
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    
    private String refersTo;

    /**
     * Getter for refersTo - Message object
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo - Message object
     */
    public void setRefersTo(String refersTo) {
        this.refersTo = refersTo;
    }

    
    private String description;

    /**
     * Getter for description - Message object
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Message object
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private ErrorCodeId code;

    /**
     * Getter for code - Message object
     */
    public ErrorCodeId getCode() {
        return this.code;
    }

    /**
     * Setter for code - Message object
     */
    public void setCode(ErrorCodeId code) {
        this.code = code;
    }

    
    private String helpLink;

    /**
     * Getter for helpLink - Message object
     */
    public String getHelpLink() {
        return this.helpLink;
    }

    /**
     * Setter for helpLink - Message object
     */
    public void setHelpLink(String helpLink) {
        this.helpLink = helpLink;
    }

    
    private String faultCode;

    /**
     * Getter for faultCode - Message object
     */
    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * Setter for faultCode - Message object
     */
    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    
    private String message;

    /**
     * Getter for message - Message object
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - Message object
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private SeverityLevel severity;

    /**
     * Getter for severity - Message object
     */
    public SeverityLevel getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity - Message object
     */
    public void setSeverity(SeverityLevel severity) {
        this.severity = severity;
    }

    


    /**
     * Returns a JSON string representation of ErrorDetail.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    