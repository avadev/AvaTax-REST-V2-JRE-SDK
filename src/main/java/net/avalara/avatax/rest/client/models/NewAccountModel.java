package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents information about a newly created account
 */
public class NewAccountModel {
    private Integer accountId;

    /**
     * Getter for accountId - Represents information about a newly created account
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents information about a newly created account
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String accountDetailsEmailedTo;

    /**
     * Getter for accountDetailsEmailedTo - Represents information about a newly created account
     */
    public String getAccountDetailsEmailedTo() {
        return this.accountDetailsEmailedTo;
    }

    /**
     * Setter for accountDetailsEmailedTo - Represents information about a newly created account
     */
    public void setAccountDetailsEmailedTo(String accountDetailsEmailedTo) {
        this.accountDetailsEmailedTo = accountDetailsEmailedTo;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents information about a newly created account
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents information about a newly created account
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private Date emailedDate;

    /**
     * Getter for emailedDate - Represents information about a newly created account
     */
    public Date getEmailedDate() {
        return this.emailedDate;
    }

    /**
     * Setter for emailedDate - Represents information about a newly created account
     */
    public void setEmailedDate(Date emailedDate) {
        this.emailedDate = emailedDate;
    }

    


    /**
     * Returns a JSON string representation of NewAccountModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    