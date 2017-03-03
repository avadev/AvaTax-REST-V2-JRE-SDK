package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * This is the output model coming from skyscraper services
 */
public class LoginVerificationOutputModel {
    private Integer jobId;

    /**
     * Getter for jobId - This is the output model coming from skyscraper services
     */
    public Integer getJobId() {
        return this.jobId;
    }

    /**
     * Setter for jobId - This is the output model coming from skyscraper services
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    
    private String operationStatus;

    /**
     * Getter for operationStatus - This is the output model coming from skyscraper services
     */
    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * Setter for operationStatus - This is the output model coming from skyscraper services
     */
    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    
    private String message;

    /**
     * Getter for message - This is the output model coming from skyscraper services
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - This is the output model coming from skyscraper services
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private Boolean loginSuccess;

    /**
     * Getter for loginSuccess - This is the output model coming from skyscraper services
     */
    public Boolean getLoginSuccess() {
        return this.loginSuccess;
    }

    /**
     * Setter for loginSuccess - This is the output model coming from skyscraper services
     */
    public void setLoginSuccess(Boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    


    /**
     * Returns a JSON string representation of LoginVerificationOutputModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    