package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Refund a committed transaction
 */
public class RefundTransactionModel {
    private String refundTransactionCode;

    /**
     * Getter for refundTransactionCode - Refund a committed transaction
     */
    public String getRefundTransactionCode() {
        return this.refundTransactionCode;
    }

    /**
     * Setter for refundTransactionCode - Refund a committed transaction
     */
    public void setRefundTransactionCode(String refundTransactionCode) {
        this.refundTransactionCode = refundTransactionCode;
    }

    
    private String referenceCode;

    /**
     * Getter for referenceCode - Refund a committed transaction
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode - Refund a committed transaction
     */
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    
    private ArrayList<String> refundLines;

    /**
     * Getter for refundLines - Refund a committed transaction
     */
    public ArrayList<String> getRefundLines() {
        return this.refundLines;
    }

    /**
     * Setter for refundLines - Refund a committed transaction
     */
    public void setRefundLines(ArrayList<String> refundLines) {
        this.refundLines = refundLines;
    }

    
    private BigDecimal refundPercentage;

    /**
     * Getter for refundPercentage - Refund a committed transaction
     */
    public BigDecimal getRefundPercentage() {
        return this.refundPercentage;
    }

    /**
     * Setter for refundPercentage - Refund a committed transaction
     */
    public void setRefundPercentage(BigDecimal refundPercentage) {
        this.refundPercentage = refundPercentage;
    }

    
    private Date refundDate;

    /**
     * Getter for refundDate - Refund a committed transaction
     */
    public Date getRefundDate() {
        return this.refundDate;
    }

    /**
     * Setter for refundDate - Refund a committed transaction
     */
    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    
    private RefundType refundType;

    /**
     * Getter for refundType - Refund a committed transaction
     */
    public RefundType getRefundType() {
        return this.refundType;
    }

    /**
     * Setter for refundType - Refund a committed transaction
     */
    public void setRefundType(RefundType refundType) {
        this.refundType = refundType;
    }

    


    /**
     * Returns a JSON string representation of RefundTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    