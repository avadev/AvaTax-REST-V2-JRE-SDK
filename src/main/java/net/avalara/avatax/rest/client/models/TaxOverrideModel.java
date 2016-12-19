package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a tax override for a transaction
 */
public class TaxOverrideModel {
    private TaxOverrideType type;

    /**
     * Getter for type - Identifies the type of tax override
     */
    public TaxOverrideType getType() {
        return this.type;
    }

    /**
     * Setter for type - Identifies the type of tax override
     */
    public void setType(TaxOverrideType type) {
        this.type = type;
    }

    
    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount - Indicates a total override of the calculated tax on the document.  AvaTax will distribute
                the override across all the lines.
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount - Indicates a total override of the calculated tax on the document.  AvaTax will distribute
                the override across all the lines.
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    private Date taxDate;

    /**
     * Getter for taxDate - The override tax date to use
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate - The override tax date to use
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    
    private String reason;

    /**
     * Getter for reason - This provides the reason for a tax override for audit purposes.  It is required for types 2-4.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason - This provides the reason for a tax override for audit purposes.  It is required for types 2-4.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    


    /**
     * Returns a JSON string representation of TaxOverrideModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    