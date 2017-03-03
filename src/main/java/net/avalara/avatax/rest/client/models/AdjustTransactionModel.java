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
     * Getter for adjustmentReason - A request to adjust tax for a previously existing transaction
     */
    public AdjustmentReason getAdjustmentReason() {
        return this.adjustmentReason;
    }

    /**
     * Setter for adjustmentReason - A request to adjust tax for a previously existing transaction
     */
    public void setAdjustmentReason(AdjustmentReason adjustmentReason) {
        this.adjustmentReason = adjustmentReason;
    }

    
    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription - A request to adjust tax for a previously existing transaction
     */
    public String getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription - A request to adjust tax for a previously existing transaction
     */
    public void setAdjustmentDescription(String adjustmentDescription) {
        this.adjustmentDescription = adjustmentDescription;
    }

    
    private CreateTransactionModel newTransaction;

    /**
     * Getter for newTransaction - A request to adjust tax for a previously existing transaction
     */
    public CreateTransactionModel getNewTransaction() {
        return this.newTransaction;
    }

    /**
     * Setter for newTransaction - A request to adjust tax for a previously existing transaction
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
    