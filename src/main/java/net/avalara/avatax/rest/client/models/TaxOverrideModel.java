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
     * Getter for type - Represents a tax override for a transaction
     */
    public TaxOverrideType getType() {
        return this.type;
    }

    /**
     * Setter for type - Represents a tax override for a transaction
     */
    public void setType(TaxOverrideType type) {
        this.type = type;
    }

    
    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount - Represents a tax override for a transaction
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount - Represents a tax override for a transaction
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    private Date taxDate;

    /**
     * Getter for taxDate - Represents a tax override for a transaction
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate - Represents a tax override for a transaction
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    
    private String reason;

    /**
     * Getter for reason - Represents a tax override for a transaction
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason - Represents a tax override for a transaction
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
    