package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
 */
public class JurisdictionOverrideModel {
    private String city;

    /**
     * Getter for city - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private BoundaryLevel boundaryLevel;

    /**
     * Getter for boundaryLevel - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public BoundaryLevel getBoundaryLevel() {
        return this.boundaryLevel;
    }

    /**
     * Setter for boundaryLevel - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setBoundaryLevel(BoundaryLevel boundaryLevel) {
        this.boundaryLevel = boundaryLevel;
    }

    
    private String description;

    /**
     * Getter for description - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private ArrayList<JurisdictionModel> jurisdictions;

    /**
     * Getter for jurisdictions - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public ArrayList<JurisdictionModel> getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setJurisdictions(ArrayList<JurisdictionModel> jurisdictions) {
        this.jurisdictions = jurisdictions;
    }

    
    private String country;

    /**
     * Getter for country - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String line1;

    /**
     * Getter for line1 - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private Integer taxRegionId;

    /**
     * Getter for taxRegionId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setTaxRegionId(Integer taxRegionId) {
        this.taxRegionId = taxRegionId;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private Boolean isDefault;

    /**
     * Getter for isDefault - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents an override of tax jurisdictions for a specific address.

During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
this override object will be assigned to the list of jurisdictions designated in this object.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of JurisdictionOverrideModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    