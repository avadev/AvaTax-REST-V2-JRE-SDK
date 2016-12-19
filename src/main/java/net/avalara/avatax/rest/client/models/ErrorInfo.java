package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Information about the error that occurred
 */
public class ErrorInfo {
    private ErrorCodeId code;

    /**
     * Getter for code - Type of error that occurred
     */
    public ErrorCodeId getCode() {
        return this.code;
    }

    /**
     * Setter for code - Type of error that occurred
     */
    public void setCode(ErrorCodeId code) {
        this.code = code;
    }

    
    private String message;

    /**
     * Getter for message - Short one-line message to summaryize what went wrong
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - Short one-line message to summaryize what went wrong
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private ErrorTargetCode target;

    /**
     * Getter for target - What object or service caused the error?
     */
    public ErrorTargetCode getTarget() {
        return this.target;
    }

    /**
     * Setter for target - What object or service caused the error?
     */
    public void setTarget(ErrorTargetCode target) {
        this.target = target;
    }

    
    private ArrayList<ErrorDetail> details;

    /**
     * Getter for details - Array of detailed error messages
     */
    public ArrayList<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Setter for details - Array of detailed error messages
     */
    public void setDetails(ArrayList<ErrorDetail> details) {
        this.details = details;
    }

    


    /**
     * Returns a JSON string representation of ErrorInfo.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    