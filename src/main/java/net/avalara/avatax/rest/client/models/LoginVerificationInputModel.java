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
     * Getter for priority - Represents a verification request using Skyscraper for a company
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Setter for priority - Represents a verification request using Skyscraper for a company
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    
    private Integer bulkRequestId;

    /**
     * Getter for bulkRequestId - Represents a verification request using Skyscraper for a company
     */
    public Integer getBulkRequestId() {
        return this.bulkRequestId;
    }

    /**
     * Setter for bulkRequestId - Represents a verification request using Skyscraper for a company
     */
    public void setBulkRequestId(Integer bulkRequestId) {
        this.bulkRequestId = bulkRequestId;
    }

    
    private String username;

    /**
     * Getter for username - Represents a verification request using Skyscraper for a company
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for username - Represents a verification request using Skyscraper for a company
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - Represents a verification request using Skyscraper for a company
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents a verification request using Skyscraper for a company
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String additionalOptions;

    /**
     * Getter for additionalOptions - Represents a verification request using Skyscraper for a company
     */
    public String getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * Setter for additionalOptions - Represents a verification request using Skyscraper for a company
     */
    public void setAdditionalOptions(String additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    
    private String region;

    /**
     * Getter for region - Represents a verification request using Skyscraper for a company
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents a verification request using Skyscraper for a company
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a verification request using Skyscraper for a company
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a verification request using Skyscraper for a company
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String password;

    /**
     * Getter for password - Represents a verification request using Skyscraper for a company
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for password - Represents a verification request using Skyscraper for a company
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
    