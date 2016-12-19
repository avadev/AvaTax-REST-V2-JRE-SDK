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
     * Getter for city - The city of the physical address of this location.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - The city of the physical address of this location.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - If this place of business has closed, the date when this location closed business.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - If this place of business has closed, the date when this location closed business.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String dbaName;

    /**
     * Getter for dbaName - If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public String getDbaName() {
        return this.dbaName;
    }

    /**
     * Setter for dbaName - If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

    
    private String description;

    /**
     * Getter for description - A friendly name for this location.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A friendly name for this location.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - A code that identifies this location.  Must be unique within your company.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - A code that identifies this location.  Must be unique within your company.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private String country;

    /**
     * Getter for country - The two character ISO-3166 country code of the physical address of this location.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The two character ISO-3166 country code of the physical address of this location.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private AddressTypeId addressTypeId;

    /**
     * Getter for addressTypeId - Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public AddressTypeId getAddressTypeId() {
        return this.addressTypeId;
    }

    /**
     * Setter for addressTypeId - Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public void setAddressTypeId(AddressTypeId addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    
    private String line1;

    /**
     * Getter for line1 - The first line of the physical address of this location.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - The first line of the physical address of this location.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String outletName;

    /**
     * Getter for outletName - A friendly name for this location.
     */
    public String getOutletName() {
        return this.outletName;
    }

    /**
     * Setter for outletName - A friendly name for this location.
     */
    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - The postal code or zip code of the physical address of this location.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - The postal code or zip code of the physical address of this location.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String county;

    /**
     * Getter for county - The county name of the physical address of this location.  Not required.
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county - The county name of the physical address of this location.  Not required.
     */
    public void setCounty(String county) {
        this.county = county;
    }

    
    private AddressCategoryId addressCategoryId;

    /**
     * Getter for addressCategoryId - Indicates the type of place of business represented by this location.
     */
    public AddressCategoryId getAddressCategoryId() {
        return this.addressCategoryId;
    }

    /**
     * Setter for addressCategoryId - Indicates the type of place of business represented by this location.
     */
    public void setAddressCategoryId(AddressCategoryId addressCategoryId) {
        this.addressCategoryId = addressCategoryId;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this location.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this location.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - The date when this location was opened for business, or null if not known.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - The date when this location was opened for business, or null if not known.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - The state, region, or province of the physical address of this location.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The state, region, or province of the physical address of this location.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - The second line of the physical address of this location.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - The second line of the physical address of this location.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private Boolean isRegistered;

    /**
     * Getter for isRegistered - Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public Boolean getIsRegistered() {
        return this.isRegistered;
    }

    /**
     * Setter for isRegistered - Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    
    private Date registeredDate;

    /**
     * Getter for registeredDate - The date when this location was registered with a tax authority.  Not required.
     */
    public Date getRegisteredDate() {
        return this.registeredDate;
    }

    /**
     * Setter for registeredDate - The date when this location was registered with a tax authority.  Not required.
     */
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    
    private Date lastTransactionDate;

    /**
     * Getter for lastTransactionDate - The most recent date when a transaction was processed for this location.  Set by AvaTax.
     */
    public Date getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    /**
     * Setter for lastTransactionDate - The most recent date when a transaction was processed for this location.  Set by AvaTax.
     */
    public void setLastTransactionDate(Date lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    
    private ArrayList<LocationSettingModel> settings;

    /**
     * Getter for settings - Extra information required by certain jurisdictions for filing.
            For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions". 
            To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public ArrayList<LocationSettingModel> getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings - Extra information required by certain jurisdictions for filing.
            For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions". 
            To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public void setSettings(ArrayList<LocationSettingModel> settings) {
        this.settings = settings;
    }

    
    private Boolean isDefault;

    /**
     * Getter for isDefault - Set this flag to true to indicate that this is the default location for this company.
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault - Set this flag to true to indicate that this is the default location for this company.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company that operates at this location.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company that operates at this location.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private String line3;

    /**
     * Getter for line3 - The third line of the physical address of this location.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - The third line of the physical address of this location.
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
    