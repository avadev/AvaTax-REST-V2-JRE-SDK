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
     * Getter for name - The name of this account.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The name of this account.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - If this account has been closed, this is the last date the account was open.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - If this account has been closed, this is the last date the account was open.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private ArrayList<UserModel> users;

    /**
     * Getter for users - Optional: A list of all the users belonging to this account.  To fetch this list, add the query string "?$include=Users" to your URL.
     */
    public ArrayList<UserModel> getUsers() {
        return this.users;
    }

    /**
     * Setter for users - Optional: A list of all the users belonging to this account.  To fetch this list, add the query string "?$include=Users" to your URL.
     */
    public void setUsers(ArrayList<UserModel> users) {
        this.users = users;
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

    
    private AccountStatusId accountStatusId;

    /**
     * Getter for accountStatusId - The current status of this account.
     */
    public AccountStatusId getAccountStatusId() {
        return this.accountStatusId;
    }

    /**
     * Setter for accountStatusId - The current status of this account.
     */
    public void setAccountStatusId(AccountStatusId accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number assigned to this account.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number assigned to this account.
     */
    public void setId(Integer id) {
        this.id = id;
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
     * Getter for effectiveDate - The earliest date on which this account may be used.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - The earliest date on which this account may be used.
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

    
    private ArrayList<SubscriptionModel> subscriptions;

    /**
     * Getter for subscriptions - Optional: A list of subscriptions granted to this account.  To fetch this list, add the query string "?$include=Subscriptions" to your URL.
     */
    public ArrayList<SubscriptionModel> getSubscriptions() {
        return this.subscriptions;
    }

    /**
     * Setter for subscriptions - Optional: A list of subscriptions granted to this account.  To fetch this list, add the query string "?$include=Subscriptions" to your URL.
     */
    public void setSubscriptions(ArrayList<SubscriptionModel> subscriptions) {
        this.subscriptions = subscriptions;
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
     * Returns a JSON string representation of AccountModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    