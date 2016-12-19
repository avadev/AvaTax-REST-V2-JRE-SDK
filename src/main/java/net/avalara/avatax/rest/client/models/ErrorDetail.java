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
     * Getter for number - Error message identifier
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for number - Error message identifier
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    
    private String refersTo;

    /**
     * Getter for refersTo - Item the message refers to, if applicable.  This is used to indicate a missing or incorrect value.
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo - Item the message refers to, if applicable.  This is used to indicate a missing or incorrect value.
     */
    public void setRefersTo(String refersTo) {
        this.refersTo = refersTo;
    }

    
    private String description;

    /**
     * Getter for description - A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private ErrorCodeId code;

    /**
     * Getter for code - Name of the error.
     */
    public ErrorCodeId getCode() {
        return this.code;
    }

    /**
     * Setter for code - Name of the error.
     */
    public void setCode(ErrorCodeId code) {
        this.code = code;
    }

    
    private String helpLink;

    /**
     * Getter for helpLink - URL to help for this message
     */
    public String getHelpLink() {
        return this.helpLink;
    }

    /**
     * Setter for helpLink - URL to help for this message
     */
    public void setHelpLink(String helpLink) {
        this.helpLink = helpLink;
    }

    
    private String faultCode;

    /**
     * Getter for faultCode - Indicates the SoapFault code
     */
    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * Setter for faultCode - Indicates the SoapFault code
     */
    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    
    private String message;

    /**
     * Getter for message - Concise summary of the message, suitable for display in the caption of an alert box.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - Concise summary of the message, suitable for display in the caption of an alert box.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private SeverityLevel severity;

    /**
     * Getter for severity - Severity of the message
     */
    public SeverityLevel getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity - Severity of the message
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
    