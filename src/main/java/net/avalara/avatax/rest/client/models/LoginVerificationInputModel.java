package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a verification request using Skyscraper for a company
 */
public class LoginVerificationInputModel {
    private Integer priority;

    /**
     * Getter for priority - Priority of the verification request
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Setter for priority - Priority of the verification request
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    
    private Integer bulkRequestId;

    /**
     * Getter for bulkRequestId - Bulk Request Id of the verification
     */
    public Integer getBulkRequestId() {
        return this.bulkRequestId;
    }

    /**
     * Setter for bulkRequestId - Bulk Request Id of the verification
     */
    public void setBulkRequestId(Integer bulkRequestId) {
        this.bulkRequestId = bulkRequestId;
    }

    
    private String username;

    /**
     * Getter for username - Username that we are using for verification
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for username - Username that we are using for verification
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - AccountId of the login verification
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - AccountId of the login verification
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String additionalOptions;

    /**
     * Getter for additionalOptions - Additional options of the verification
     */
    public String getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * Setter for additionalOptions - Additional options of the verification
     */
    public void setAdditionalOptions(String additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    
    private String region;

    /**
     * Getter for region - Region of the verification request
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Region of the verification request
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - CompanyId that we are verifying the login information for
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - CompanyId that we are verifying the login information for
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String password;

    /**
     * Getter for password - Password we are using for verification
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for password - Password we are using for verification
     */
    public void setPassword(String password) {
        this.password = password;
    }

    


    /**
     * Returns a JSON string representation of LoginVerificationInputModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    