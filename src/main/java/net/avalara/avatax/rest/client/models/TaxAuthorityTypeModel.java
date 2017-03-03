package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Authority Type Model
 */
public class TaxAuthorityTypeModel {
    private Integer id;

    /**
     * Getter for id - Tax Authority Type Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Tax Authority Type Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - Tax Authority Type Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Tax Authority Type Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String taxAuthorityGroup;

    /**
     * Getter for taxAuthorityGroup - Tax Authority Type Model
     */
    public String getTaxAuthorityGroup() {
        return this.taxAuthorityGroup;
    }

    /**
     * Setter for taxAuthorityGroup - Tax Authority Type Model
     */
    public void setTaxAuthorityGroup(String taxAuthorityGroup) {
        this.taxAuthorityGroup = taxAuthorityGroup;
    }

    


    /**
     * Returns a JSON string representation of TaxAuthorityTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    