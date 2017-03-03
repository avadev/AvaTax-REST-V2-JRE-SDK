package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
 */
public class LocationModel {
    private String city;

    /**
     * Getter for city - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String dbaName;

    /**
     * Getter for dbaName - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getDbaName() {
        return this.dbaName;
    }

    /**
     * Setter for dbaName - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

    
    private String description;

    /**
     * Getter for description - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private String country;

    /**
     * Getter for country - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private AddressTypeId addressTypeId;

    /**
     * Getter for addressTypeId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public AddressTypeId getAddressTypeId() {
        return this.addressTypeId;
    }

    /**
     * Setter for addressTypeId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setAddressTypeId(AddressTypeId addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    
    private String line1;

    /**
     * Getter for line1 - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String outletName;

    /**
     * Getter for outletName - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getOutletName() {
        return this.outletName;
    }

    /**
     * Setter for outletName - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String county;

    /**
     * Getter for county - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setCounty(String county) {
        this.county = county;
    }

    
    private AddressCategoryId addressCategoryId;

    /**
     * Getter for addressCategoryId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public AddressCategoryId getAddressCategoryId() {
        return this.addressCategoryId;
    }

    /**
     * Setter for addressCategoryId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setAddressCategoryId(AddressCategoryId addressCategoryId) {
        this.addressCategoryId = addressCategoryId;
    }

    
    private Integer id;

    /**
     * Getter for id - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private Boolean isRegistered;

    /**
     * Getter for isRegistered - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Boolean getIsRegistered() {
        return this.isRegistered;
    }

    /**
     * Setter for isRegistered - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    
    private Date registeredDate;

    /**
     * Getter for registeredDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Date getRegisteredDate() {
        return this.registeredDate;
    }

    /**
     * Setter for registeredDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    
    private Date lastTransactionDate;

    /**
     * Getter for lastTransactionDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Date getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    /**
     * Setter for lastTransactionDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setLastTransactionDate(Date lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    
    private ArrayList<LocationSettingModel> settings;

    /**
     * Getter for settings - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public ArrayList<LocationSettingModel> getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setSettings(ArrayList<LocationSettingModel> settings) {
        this.settings = settings;
    }

    
    private Boolean isDefault;

    /**
     * Getter for isDefault - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private String line3;

    /**
     * Getter for line3 - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - A location where this company does business.
Some jurisdictions may require you to list all locations where your company does business.
     */
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    


    /**
     * Returns a JSON string representation of LocationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    