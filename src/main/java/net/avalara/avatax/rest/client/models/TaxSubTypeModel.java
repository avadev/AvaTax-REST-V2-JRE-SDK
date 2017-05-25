package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 */
public class TaxSubTypeModel {
    private Integer id;

    /**
     * Getter for id - 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String taxSubType;

    /**
     * Getter for taxSubType - 
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType - 
     */
    public void setTaxSubType(String taxSubType) {
        this.taxSubType = taxSubType;
    }

    
    private String description;

    /**
     * Getter for description - 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup - 
     */
    public String getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup - 
     */
    public void setTaxTypeGroup(String taxTypeGroup) {
        this.taxTypeGroup = taxTypeGroup;
    }

    


    /**
     * Returns a JSON string representation of TaxSubTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    