package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Model with options for adding a new filing calendar
 */
public class CycleAddOptionModel {
    private ArrayList<String> availableLocationCodes;

    /**
     * Getter for availableLocationCodes - Model with options for adding a new filing calendar
     */
    public ArrayList<String> getAvailableLocationCodes() {
        return this.availableLocationCodes;
    }

    /**
     * Setter for availableLocationCodes - Model with options for adding a new filing calendar
     */
    public void setAvailableLocationCodes(ArrayList<String> availableLocationCodes) {
        this.availableLocationCodes = availableLocationCodes;
    }

    
    private String frequencyName;

    /**
     * Getter for frequencyName - Model with options for adding a new filing calendar
     */
    public String getFrequencyName() {
        return this.frequencyName;
    }

    /**
     * Setter for frequencyName - Model with options for adding a new filing calendar
     */
    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    
    private Date transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd - Model with options for adding a new filing calendar
     */
    public Date getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd - Model with options for adding a new filing calendar
     */
    public void setTransactionalPeriodEnd(Date transactionalPeriodEnd) {
        this.transactionalPeriodEnd = transactionalPeriodEnd;
    }

    
    private Date transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart - Model with options for adding a new filing calendar
     */
    public Date getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart - Model with options for adding a new filing calendar
     */
    public void setTransactionalPeriodStart(Date transactionalPeriodStart) {
        this.transactionalPeriodStart = transactionalPeriodStart;
    }

    
    private String filingFrequencyCode;

    /**
     * Getter for filingFrequencyCode - Model with options for adding a new filing calendar
     */
    public String getFilingFrequencyCode() {
        return this.filingFrequencyCode;
    }

    /**
     * Setter for filingFrequencyCode - Model with options for adding a new filing calendar
     */
    public void setFilingFrequencyCode(String filingFrequencyCode) {
        this.filingFrequencyCode = filingFrequencyCode;
    }

    
    private String cycleName;

    /**
     * Getter for cycleName - Model with options for adding a new filing calendar
     */
    public String getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName - Model with options for adding a new filing calendar
     */
    public void setCycleName(String cycleName) {
        this.cycleName = cycleName;
    }

    
    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId - Model with options for adding a new filing calendar
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId - Model with options for adding a new filing calendar
     */
    public void setFilingFrequencyId(FilingFrequencyId filingFrequencyId) {
        this.filingFrequencyId = filingFrequencyId;
    }

    
    private Boolean available;

    /**
     * Getter for available - Model with options for adding a new filing calendar
     */
    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * Setter for available - Model with options for adding a new filing calendar
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    
    private Date filingDueDate;

    /**
     * Getter for filingDueDate - Model with options for adding a new filing calendar
     */
    public Date getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate - Model with options for adding a new filing calendar
     */
    public void setFilingDueDate(Date filingDueDate) {
        this.filingDueDate = filingDueDate;
    }

    
    private String cycleUnavailableReason;

    /**
     * Getter for cycleUnavailableReason - Model with options for adding a new filing calendar
     */
    public String getCycleUnavailableReason() {
        return this.cycleUnavailableReason;
    }

    /**
     * Setter for cycleUnavailableReason - Model with options for adding a new filing calendar
     */
    public void setCycleUnavailableReason(String cycleUnavailableReason) {
        this.cycleUnavailableReason = cycleUnavailableReason;
    }

    


    /**
     * Returns a JSON string representation of CycleAddOptionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    