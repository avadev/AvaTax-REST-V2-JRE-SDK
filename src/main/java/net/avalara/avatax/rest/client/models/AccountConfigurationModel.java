package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents one configuration setting for this account
 */
public class AccountConfigurationModel {
    private String name;

    /**
     * Getter for name - Represents one configuration setting for this account
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents one configuration setting for this account
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents one configuration setting for this account
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents one configuration setting for this account
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - Represents one configuration setting for this account
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents one configuration setting for this account
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents one configuration setting for this account
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents one configuration setting for this account
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents one configuration setting for this account
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents one configuration setting for this account
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String category;

    /**
     * Getter for category - Represents one configuration setting for this account
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category - Represents one configuration setting for this account
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
    private String value;

    /**
     * Getter for value - Represents one configuration setting for this account
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value - Represents one configuration setting for this account
     */
    public void setValue(String value) {
        this.value = value;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents one configuration setting for this account
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents one configuration setting for this account
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of AccountConfigurationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    