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
     * Getter for id - The unique ID number of this tax Authority customer type.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this tax Authority customer type.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - The description name of this tax authority type.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - The description name of this tax authority type.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String taxAuthorityGroup;

    /**
     * Getter for taxAuthorityGroup - Tax Authority Group
     */
    public String getTaxAuthorityGroup() {
        return this.taxAuthorityGroup;
    }

    /**
     * Setter for taxAuthorityGroup - Tax Authority Group
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
    