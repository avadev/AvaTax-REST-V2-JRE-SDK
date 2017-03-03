package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a service that this account has subscribed to.
 */
public class SubscriptionModel {
    private Date endDate;

    /**
     * Getter for endDate - Represents a service that this account has subscribed to.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents a service that this account has subscribed to.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a service that this account has subscribed to.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a service that this account has subscribed to.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer subscriptionTypeId;

    /**
     * Getter for subscriptionTypeId - Represents a service that this account has subscribed to.
     */
    public Integer getSubscriptionTypeId() {
        return this.subscriptionTypeId;
    }

    /**
     * Setter for subscriptionTypeId - Represents a service that this account has subscribed to.
     */
    public void setSubscriptionTypeId(Integer subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - Represents a service that this account has subscribed to.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents a service that this account has subscribed to.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents a service that this account has subscribed to.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a service that this account has subscribed to.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String subscriptionDescription;

    /**
     * Getter for subscriptionDescription - Represents a service that this account has subscribed to.
     */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * Setter for subscriptionDescription - Represents a service that this account has subscribed to.
     */
    public void setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a service that this account has subscribed to.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a service that this account has subscribed to.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - Represents a service that this account has subscribed to.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - Represents a service that this account has subscribed to.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a service that this account has subscribed to.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a service that this account has subscribed to.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a service that this account has subscribed to.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a service that this account has subscribed to.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of SubscriptionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    