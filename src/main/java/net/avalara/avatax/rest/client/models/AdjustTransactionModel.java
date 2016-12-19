package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A request to adjust tax for a previously existing transaction
 */
public class AdjustTransactionModel {
    private AdjustmentReason adjustmentReason;

    /**
     * Getter for adjustmentReason - A reason code indicating why this adjustment was made
     */
    public AdjustmentReason getAdjustmentReason() {
        return this.adjustmentReason;
    }

    /**
     * Setter for adjustmentReason - A reason code indicating why this adjustment was made
     */
    public void setAdjustmentReason(AdjustmentReason adjustmentReason) {
        this.adjustmentReason = adjustmentReason;
    }

    
    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription - If the AdjustmentReason is "Other", specify the reason here
     */
    public String getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription - If the AdjustmentReason is "Other", specify the reason here
     */
    public void setAdjustmentDescription(String adjustmentDescription) {
        this.adjustmentDescription = adjustmentDescription;
    }

    
    private CreateTransactionModel newTransaction;

    /**
     * Getter for newTransaction - Replace the current transaction with tax data calculated for this new transaction
     */
    public CreateTransactionModel getNewTransaction() {
        return this.newTransaction;
    }

    /**
     * Setter for newTransaction - Replace the current transaction with tax data calculated for this new transaction
     */
    public void setNewTransaction(CreateTransactionModel newTransaction) {
        this.newTransaction = newTransaction;
    }

    


    /**
     * Returns a JSON string representation of AdjustTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    