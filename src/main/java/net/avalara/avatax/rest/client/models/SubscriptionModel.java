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
     * Getter for endDate - If the subscription has ended or will end, this date indicates when the subscription ends.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - If the subscription has ended or will end, this date indicates when the subscription ends.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer subscriptionTypeId;

    /**
     * Getter for subscriptionTypeId - The unique ID number of the service that the account is subscribed to.
     */
    public Integer getSubscriptionTypeId() {
        return this.subscriptionTypeId;
    }

    /**
     * Setter for subscriptionTypeId - The unique ID number of the service that the account is subscribed to.
     */
    public void setSubscriptionTypeId(Integer subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - The unique ID number of the account this subscription belongs to.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - The unique ID number of the account this subscription belongs to.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this subscription.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this subscription.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String subscriptionDescription;

    /**
     * Getter for subscriptionDescription - A friendly description of the service that the account is subscribed to.
     */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * Setter for subscriptionDescription - A friendly description of the service that the account is subscribed to.
     */
    public void setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - The date when the subscription began.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - The date when the subscription began.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
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
    