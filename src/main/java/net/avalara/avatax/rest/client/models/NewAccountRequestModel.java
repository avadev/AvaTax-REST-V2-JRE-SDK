package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
 */
public class NewAccountRequestModel {
    private String phoneNumber;

    /**
     * Getter for phoneNumber - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String email;

    /**
     * Getter for email - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private String accountName;

    /**
     * Getter for accountName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Setter for accountName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    
    private String parentAccountNumber;

    /**
     * Getter for parentAccountNumber - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getParentAccountNumber() {
        return this.parentAccountNumber;
    }

    /**
     * Setter for parentAccountNumber - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setParentAccountNumber(String parentAccountNumber) {
        this.parentAccountNumber = parentAccountNumber;
    }

    
    private ArrayList<String> products;

    /**
     * Getter for products - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public ArrayList<String> getProducts() {
        return this.products;
    }

    /**
     * Setter for products - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    
    private String referrerId;

    /**
     * Getter for referrerId - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getReferrerId() {
        return this.referrerId;
    }

    /**
     * Setter for referrerId - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    
    private String connectorName;

    /**
     * Getter for connectorName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * Setter for connectorName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    
    private String lastName;

    /**
     * Getter for lastName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private String paymentMethodId;

    /**
     * Getter for paymentMethodId - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /**
     * Setter for paymentMethodId - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private String userPassword;

    /**
     * Getter for userPassword - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * Setter for userPassword - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    
    private String title;

    /**
     * Getter for title - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title - Represents a request for a new account with Avalara for a new subscriber.
Contains information about the account requested and the rate plan selected.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    


    /**
     * Returns a JSON string representation of NewAccountRequestModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    