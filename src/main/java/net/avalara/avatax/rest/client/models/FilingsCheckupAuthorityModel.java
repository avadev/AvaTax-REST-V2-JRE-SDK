package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Cycle Safe Expiration results.
 */
public class FilingsCheckupAuthorityModel {
    private String taxTypeId;

    /**
     * Getter for taxTypeId - Cycle Safe Expiration results.
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - Cycle Safe Expiration results.
     */
    public void setTaxTypeId(String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName - Cycle Safe Expiration results.
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName - Cycle Safe Expiration results.
     */
    public void setTaxAuthorityName(String taxAuthorityName) {
        this.taxAuthorityName = taxAuthorityName;
    }

    
    private ArrayList<FilingsCheckupSuggestedFormModel> suggestedForms;

    /**
     * Getter for suggestedForms - Cycle Safe Expiration results.
     */
    public ArrayList<FilingsCheckupSuggestedFormModel> getSuggestedForms() {
        return this.suggestedForms;
    }

    /**
     * Setter for suggestedForms - Cycle Safe Expiration results.
     */
    public void setSuggestedForms(ArrayList<FilingsCheckupSuggestedFormModel> suggestedForms) {
        this.suggestedForms = suggestedForms;
    }

    
    private BigDecimal tax;

    /**
     * Getter for tax - Cycle Safe Expiration results.
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax - Cycle Safe Expiration results.
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    
    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId - Cycle Safe Expiration results.
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId - Cycle Safe Expiration results.
     */
    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - Cycle Safe Expiration results.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - Cycle Safe Expiration results.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId - Cycle Safe Expiration results.
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId - Cycle Safe Expiration results.
     */
    public void setTaxAuthorityTypeId(Integer taxAuthorityTypeId) {
        this.taxAuthorityTypeId = taxAuthorityTypeId;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Cycle Safe Expiration results.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Cycle Safe Expiration results.
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    


    /**
     * Returns a JSON string representation of FilingsCheckupAuthorityModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    