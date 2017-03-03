package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * An AvaTax account.
 */
public class AccountModel {
    private String name;

    /**
     * Getter for name - An AvaTax account.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - An AvaTax account.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - An AvaTax account.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - An AvaTax account.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private ArrayList<UserModel> users;

    /**
     * Getter for users - An AvaTax account.
     */
    public ArrayList<UserModel> getUsers() {
        return this.users;
    }

    /**
     * Setter for users - An AvaTax account.
     */
    public void setUsers(ArrayList<UserModel> users) {
        this.users = users;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - An AvaTax account.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - An AvaTax account.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private AccountStatusId accountStatusId;

    /**
     * Getter for accountStatusId - An AvaTax account.
     */
    public AccountStatusId getAccountStatusId() {
        return this.accountStatusId;
    }

    /**
     * Setter for accountStatusId - An AvaTax account.
     */
    public void setAccountStatusId(AccountStatusId accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    
    private Integer id;

    /**
     * Getter for id - An AvaTax account.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - An AvaTax account.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - An AvaTax account.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - An AvaTax account.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - An AvaTax account.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - An AvaTax account.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - An AvaTax account.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - An AvaTax account.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private ArrayList<SubscriptionModel> subscriptions;

    /**
     * Getter for subscriptions - An AvaTax account.
     */
    public ArrayList<SubscriptionModel> getSubscriptions() {
        return this.subscriptions;
    }

    /**
     * Setter for subscriptions - An AvaTax account.
     */
    public void setSubscriptions(ArrayList<SubscriptionModel> subscriptions) {
        this.subscriptions = subscriptions;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - An AvaTax account.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - An AvaTax account.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of AccountModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    