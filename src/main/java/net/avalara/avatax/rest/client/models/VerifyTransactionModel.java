package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Verify this transaction by matching it to values in your accounting system.
 */
public class VerifyTransactionModel {
    private Date verifyTransactionDate;

    /**
     * Getter for verifyTransactionDate - Verify this transaction by matching it to values in your accounting system.
     */
    public Date getVerifyTransactionDate() {
        return this.verifyTransactionDate;
    }

    /**
     * Setter for verifyTransactionDate - Verify this transaction by matching it to values in your accounting system.
     */
    public void setVerifyTransactionDate(Date verifyTransactionDate) {
        this.verifyTransactionDate = verifyTransactionDate;
    }

    
    private BigDecimal verifyTotalAmount;

    /**
     * Getter for verifyTotalAmount - Verify this transaction by matching it to values in your accounting system.
     */
    public BigDecimal getVerifyTotalAmount() {
        return this.verifyTotalAmount;
    }

    /**
     * Setter for verifyTotalAmount - Verify this transaction by matching it to values in your accounting system.
     */
    public void setVerifyTotalAmount(BigDecimal verifyTotalAmount) {
        this.verifyTotalAmount = verifyTotalAmount;
    }

    
    private BigDecimal verifyTotalTax;

    /**
     * Getter for verifyTotalTax - Verify this transaction by matching it to values in your accounting system.
     */
    public BigDecimal getVerifyTotalTax() {
        return this.verifyTotalTax;
    }

    /**
     * Setter for verifyTotalTax - Verify this transaction by matching it to values in your accounting system.
     */
    public void setVerifyTotalTax(BigDecimal verifyTotalTax) {
        this.verifyTotalTax = verifyTotalTax;
    }

    


    /**
     * Returns a JSON string representation of VerifyTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    