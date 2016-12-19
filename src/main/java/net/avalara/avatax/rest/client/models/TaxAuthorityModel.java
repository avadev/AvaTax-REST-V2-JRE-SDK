package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Authority Model
 */
public class TaxAuthorityModel {
    private Integer id;

    /**
     * Getter for id - The unique ID number of this tax authority.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this tax authority.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String name;

    /**
     * Getter for name - The friendly name of this tax authority.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The friendly name of this tax authority.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId - The type of this tax authority.
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId - The type of this tax authority.
     */
    public void setTaxAuthorityTypeId(Integer taxAuthorityTypeId) {
        this.taxAuthorityTypeId = taxAuthorityTypeId;
    }

    
    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId - The unique ID number of the jurisdiction for this tax authority.
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId - The unique ID number of the jurisdiction for this tax authority.
     */
    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    


    /**
     * Returns a JSON string representation of TaxAuthorityModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    