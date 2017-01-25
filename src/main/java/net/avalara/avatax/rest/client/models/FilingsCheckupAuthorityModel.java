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
     * Getter for taxTypeId - Tax Type collected in the tax authority
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - Tax Type collected in the tax authority
     */
    public void setTaxTypeId(String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName - Name of the tax authority
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName - Name of the tax authority
     */
    public void setTaxAuthorityName(String taxAuthorityName) {
        this.taxAuthorityName = taxAuthorityName;
    }

    
    private ArrayList<FilingsCheckupSuggestedFormModel> suggestedForms;

    /**
     * Getter for suggestedForms - Suggested forms to file due to tax collected
     */
    public ArrayList<FilingsCheckupSuggestedFormModel> getSuggestedForms() {
        return this.suggestedForms;
    }

    /**
     * Setter for suggestedForms - Suggested forms to file due to tax collected
     */
    public void setSuggestedForms(ArrayList<FilingsCheckupSuggestedFormModel> suggestedForms) {
        this.suggestedForms = suggestedForms;
    }

    
    private BigDecimal tax;

    /**
     * Getter for tax - Amount of tax collected in this tax authority
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax - Amount of tax collected in this tax authority
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    
    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId - Jurisdiction Id of the tax authority
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId - Jurisdiction Id of the tax authority
     */
    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - Location Code of the tax authority
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - Location Code of the tax authority
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId - Type Id of the tax authority
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId - Type Id of the tax authority
     */
    public void setTaxAuthorityTypeId(Integer taxAuthorityTypeId) {
        this.taxAuthorityTypeId = taxAuthorityTypeId;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Unique ID of the tax authority
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Unique ID of the tax authority
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
    