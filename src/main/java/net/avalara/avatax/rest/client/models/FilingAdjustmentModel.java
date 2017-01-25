package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A model for return adjustments.
 */
public class FilingAdjustmentModel {
    private Boolean isCalculated;

    /**
     * Getter for isCalculated - Whether or not the adjustment has been calculated.
     */
    public Boolean getIsCalculated() {
        return this.isCalculated;
    }

    /**
     * Setter for isCalculated - Whether or not the adjustment has been calculated.
     */
    public void setIsCalculated(Boolean isCalculated) {
        this.isCalculated = isCalculated;
    }

    
    private String reason;

    /**
     * Getter for reason - A descriptive reason for creating this adjustment.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason - A descriptive reason for creating this adjustment.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    
    private BigDecimal amount;

    /**
     * Getter for amount - The adjustment amount.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount - The adjustment amount.
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number for the adjustment.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number for the adjustment.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private PaymentAccountTypeId accountType;

    /**
     * Getter for accountType - The account type of the adjustment.
     */
    public PaymentAccountTypeId getAccountType() {
        return this.accountType;
    }

    /**
     * Setter for accountType - The account type of the adjustment.
     */
    public void setAccountType(PaymentAccountTypeId accountType) {
        this.accountType = accountType;
    }

    
    private AdjustmentTypeId type;

    /**
     * Getter for type - The type of the adjustment.
     */
    public AdjustmentTypeId getType() {
        return this.type;
    }

    /**
     * Setter for type - The type of the adjustment.
     */
    public void setType(AdjustmentTypeId type) {
        this.type = type;
    }

    
    private AdjustmentPeriodTypeId period;

    /**
     * Getter for period - The filing period the adjustment is applied to.
     */
    public AdjustmentPeriodTypeId getPeriod() {
        return this.period;
    }

    /**
     * Setter for period - The filing period the adjustment is applied to.
     */
    public void setPeriod(AdjustmentPeriodTypeId period) {
        this.period = period;
    }

    


    /**
     * Returns a JSON string representation of FilingAdjustmentModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    