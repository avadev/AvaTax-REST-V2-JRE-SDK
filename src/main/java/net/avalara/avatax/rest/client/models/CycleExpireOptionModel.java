package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Options for expiring a filing calendar.
 */
public class CycleExpireOptionModel {
    private Date transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart - Options for expiring a filing calendar.
     */
    public Date getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart - Options for expiring a filing calendar.
     */
    public void setTransactionalPeriodStart(Date transactionalPeriodStart) {
        this.transactionalPeriodStart = transactionalPeriodStart;
    }

    
    private Date transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd - Options for expiring a filing calendar.
     */
    public Date getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd - Options for expiring a filing calendar.
     */
    public void setTransactionalPeriodEnd(Date transactionalPeriodEnd) {
        this.transactionalPeriodEnd = transactionalPeriodEnd;
    }

    
    private Date filingDueDate;

    /**
     * Getter for filingDueDate - Options for expiring a filing calendar.
     */
    public Date getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate - Options for expiring a filing calendar.
     */
    public void setFilingDueDate(Date filingDueDate) {
        this.filingDueDate = filingDueDate;
    }

    
    private String cycleName;

    /**
     * Getter for cycleName - Options for expiring a filing calendar.
     */
    public String getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName - Options for expiring a filing calendar.
     */
    public void setCycleName(String cycleName) {
        this.cycleName = cycleName;
    }

    


    /**
     * Returns a JSON string representation of CycleExpireOptionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    