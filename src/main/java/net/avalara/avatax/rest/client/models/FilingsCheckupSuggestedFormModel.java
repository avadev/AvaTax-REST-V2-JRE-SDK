package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Worksheet Checkup Report Suggested Form Model
 */
public class FilingsCheckupSuggestedFormModel {
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Tax Authority ID of the suggested form returned
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Tax Authority ID of the suggested form returned
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String country;

    /**
     * Getter for country - Country of the suggested form returned
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Country of the suggested form returned
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String region;

    /**
     * Getter for region - Region of the suggested form returned
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Region of the suggested form returned
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String returnName;

    /**
     * Getter for returnName - Name of the suggested form returned
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - Name of the suggested form returned
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    


    /**
     * Returns a JSON string representation of FilingsCheckupSuggestedFormModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    