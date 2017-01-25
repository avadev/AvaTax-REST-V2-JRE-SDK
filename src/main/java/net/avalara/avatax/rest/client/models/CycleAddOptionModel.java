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
     * Getter for availableLocationCodes - A list of outlet codes that can be assigned to this form for the current cycle
     */
    public ArrayList<String> getAvailableLocationCodes() {
        return this.availableLocationCodes;
    }

    /**
     * Setter for availableLocationCodes - A list of outlet codes that can be assigned to this form for the current cycle
     */
    public void setAvailableLocationCodes(ArrayList<String> availableLocationCodes) {
        this.availableLocationCodes = availableLocationCodes;
    }

    
    private String frequencyName;

    /**
     * Getter for frequencyName - The filing frequency of the form
     */
    public String getFrequencyName() {
        return this.frequencyName;
    }

    /**
     * Setter for frequencyName - The filing frequency of the form
     */
    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    
    private Date transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd - The period end date for the customer's last transaction in the jurisdiction being added
     */
    public Date getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd - The period end date for the customer's last transaction in the jurisdiction being added
     */
    public void setTransactionalPeriodEnd(Date transactionalPeriodEnd) {
        this.transactionalPeriodEnd = transactionalPeriodEnd;
    }

    
    private Date transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart - The period start date for the customer's first transaction in the jurisdiction being added
     */
    public Date getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart - The period start date for the customer's first transaction in the jurisdiction being added
     */
    public void setTransactionalPeriodStart(Date transactionalPeriodStart) {
        this.transactionalPeriodStart = transactionalPeriodStart;
    }

    
    private String filingFrequencyCode;

    /**
     * Getter for filingFrequencyCode - A code assigned to the filing frequency
     */
    public String getFilingFrequencyCode() {
        return this.filingFrequencyCode;
    }

    /**
     * Setter for filingFrequencyCode - A code assigned to the filing frequency
     */
    public void setFilingFrequencyCode(String filingFrequencyCode) {
        this.filingFrequencyCode = filingFrequencyCode;
    }

    
    private String cycleName;

    /**
     * Getter for cycleName - A descriptive name of the cycle and due date of form.
     */
    public String getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName - A descriptive name of the cycle and due date of form.
     */
    public void setCycleName(String cycleName) {
        this.cycleName = cycleName;
    }

    
    private Boolean available;

    /**
     * Getter for available - True if this form can be added and filed for the current cycle. "Current cycle" is considered one month before the month of today's date.
     */
    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * Setter for available - True if this form can be added and filed for the current cycle. "Current cycle" is considered one month before the month of today's date.
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    
    private Date filingDueDate;

    /**
     * Getter for filingDueDate - The jurisdiction-assigned due date for the form
     */
    public Date getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate - The jurisdiction-assigned due date for the form
     */
    public void setFilingDueDate(Date filingDueDate) {
        this.filingDueDate = filingDueDate;
    }

    
    private String cycleUnavailableReason;

    /**
     * Getter for cycleUnavailableReason - An explanation for why this form cannot be added for the current cycle
     */
    public String getCycleUnavailableReason() {
        return this.cycleUnavailableReason;
    }

    /**
     * Setter for cycleUnavailableReason - An explanation for why this form cannot be added for the current cycle
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
    