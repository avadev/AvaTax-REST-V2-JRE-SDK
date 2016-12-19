package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A company or business entity.
 */
public class CompanyModel {
    private ArrayList<LocationModel> locations;

    /**
     * Getter for locations - Optional: A list of locations defined for this company.  To fetch this list, add the query string "?$include=Locations" to your URL.
     */
    public ArrayList<LocationModel> getLocations() {
        return this.locations;
    }

    /**
     * Setter for locations - Optional: A list of locations defined for this company.  To fetch this list, add the query string "?$include=Locations" to your URL.
     */
    public void setLocations(ArrayList<LocationModel> locations) {
        this.locations = locations;
    }

    
    private String name;

    /**
     * Getter for name - The name of this company, as shown to customers.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The name of this company, as shown to customers.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private ArrayList<TaxCodeModel> taxCodes;

    /**
     * Getter for taxCodes - Optional: A list of tax codes defined for this company.  To fetch this list, add the query string "?$include=TaxCodes" to your URL.
     */
    public ArrayList<TaxCodeModel> getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes - Optional: A list of tax codes defined for this company.  To fetch this list, add the query string "?$include=TaxCodes" to your URL.
     */
    public void setTaxCodes(ArrayList<TaxCodeModel> taxCodes) {
        this.taxCodes = taxCodes;
    }

    
    private ArrayList<NexusModel> nexus;

    /**
     * Getter for nexus - Optional: A list of nexus defined for this company.  To fetch this list, add the query string "?$include=Nexus" to your URL.
     */
    public ArrayList<NexusModel> getNexus() {
        return this.nexus;
    }

    /**
     * Setter for nexus - Optional: A list of nexus defined for this company.  To fetch this list, add the query string "?$include=Nexus" to your URL.
     */
    public void setNexus(ArrayList<NexusModel> nexus) {
        this.nexus = nexus;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - A unique code that references this company within your account.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - A unique code that references this company within your account.
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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

    
    private ArrayList<ItemModel> items;

    /**
     * Getter for items - Optional: A list of items defined for this company.  To fetch this list, add the query string "?$include=Items" to your URL.
     */
    public ArrayList<ItemModel> getItems() {
        return this.items;
    }

    /**
     * Setter for items - Optional: A list of items defined for this company.  To fetch this list, add the query string "?$include=Items" to your URL.
     */
    public void setItems(ArrayList<ItemModel> items) {
        this.items = items;
    }

    
    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo - Business Identification No
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo - Business Identification No
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    
    private Boolean isReportingEntity;

    /**
     * Getter for isReportingEntity - Set this flag to true if this company must file its own tax returns.
            For users who have Returns enabled, this flag turns on monthly Worksheet generation for the company.
     */
    public Boolean getIsReportingEntity() {
        return this.isReportingEntity;
    }

    /**
     * Setter for isReportingEntity - Set this flag to true if this company must file its own tax returns.
            For users who have Returns enabled, this flag turns on monthly Worksheet generation for the company.
     */
    public void setIsReportingEntity(Boolean isReportingEntity) {
        this.isReportingEntity = isReportingEntity;
    }

    
    private ArrayList<UPCModel> upcs;

    /**
     * Getter for upcs - Optional: A list of UPCs defined for this company.  To fetch this list, add the query string "?$include=UPCs" to your URL.
     */
    public ArrayList<UPCModel> getUpcs() {
        return this.upcs;
    }

    /**
     * Setter for upcs - Optional: A list of UPCs defined for this company.  To fetch this list, add the query string "?$include=UPCs" to your URL.
     */
    public void setUpcs(ArrayList<UPCModel> upcs) {
        this.upcs = upcs;
    }

    
    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber - For United States companies, this field contains your Taxpayer Identification Number.  
            This is a nine digit number that is usually called an EIN for an Employer Identification Number if this company is a corporation, 
            or SSN for a Social Security Number if this company is a person.
     */
    public String getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber - For United States companies, this field contains your Taxpayer Identification Number.  
            This is a nine digit number that is usually called an EIN for an Employer Identification Number if this company is a corporation, 
            or SSN for a Social Security Number if this company is a person.
     */
    public void setTaxpayerIdNumber(String taxpayerIdNumber) {
        this.taxpayerIdNumber = taxpayerIdNumber;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - The unique ID number of the account this company belongs to.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - The unique ID number of the account this company belongs to.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String sstPid;

    /**
     * Getter for sstPid - If this company files Streamlined Sales Tax, this is the PID of this company as defined by the Streamlined Sales Tax governing board.
     */
    public String getSstPid() {
        return this.sstPid;
    }

    /**
     * Setter for sstPid - If this company files Streamlined Sales Tax, this is the PID of this company as defined by the Streamlined Sales Tax governing board.
     */
    public void setSstPid(String sstPid) {
        this.sstPid = sstPid;
    }

    
    private ArrayList<ContactModel> contacts;

    /**
     * Getter for contacts - Optional: A list of contacts defined for this company.  To fetch this list, add the query string "?$include=Contacts" to your URL.
     */
    public ArrayList<ContactModel> getContacts() {
        return this.contacts;
    }

    /**
     * Setter for contacts - Optional: A list of contacts defined for this company.  To fetch this list, add the query string "?$include=Contacts" to your URL.
     */
    public void setContacts(ArrayList<ContactModel> contacts) {
        this.contacts = contacts;
    }

    
    private Date sstEffectiveDate;

    /**
     * Getter for sstEffectiveDate - If this company participates in Streamlined Sales Tax, this is the date when the company joined the SST program.
     */
    public Date getSstEffectiveDate() {
        return this.sstEffectiveDate;
    }

    /**
     * Setter for sstEffectiveDate - If this company participates in Streamlined Sales Tax, this is the date when the company joined the SST program.
     */
    public void setSstEffectiveDate(Date sstEffectiveDate) {
        this.sstEffectiveDate = sstEffectiveDate;
    }

    
    private ArrayList<TaxRuleModel> taxRules;

    /**
     * Getter for taxRules - Optional: A list of tax rules defined for this company.  To fetch this list, add the query string "?$include=TaxRules" to your URL.
     */
    public ArrayList<TaxRuleModel> getTaxRules() {
        return this.taxRules;
    }

    /**
     * Setter for taxRules - Optional: A list of tax rules defined for this company.  To fetch this list, add the query string "?$include=TaxRules" to your URL.
     */
    public void setTaxRules(ArrayList<TaxRuleModel> taxRules) {
        this.taxRules = taxRules;
    }

    
    private RoundingLevelId roundingLevelId;

    /**
     * Getter for roundingLevelId - Indicates whether this company prefers to round amounts at the document level or line level.
     */
    public RoundingLevelId getRoundingLevelId() {
        return this.roundingLevelId;
    }

    /**
     * Setter for roundingLevelId - Indicates whether this company prefers to round amounts at the document level or line level.
     */
    public void setRoundingLevelId(RoundingLevelId roundingLevelId) {
        this.roundingLevelId = roundingLevelId;
    }

    
    private TaxDependencyLevelId taxDependencyLevelId;

    /**
     * Getter for taxDependencyLevelId - Used to apply tax detail dependency at a jurisdiction level.
     */
    public TaxDependencyLevelId getTaxDependencyLevelId() {
        return this.taxDependencyLevelId;
    }

    /**
     * Setter for taxDependencyLevelId - Used to apply tax detail dependency at a jurisdiction level.
     */
    public void setTaxDependencyLevelId(TaxDependencyLevelId taxDependencyLevelId) {
        this.taxDependencyLevelId = taxDependencyLevelId;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this company.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this company.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Boolean isTest;

    /**
     * Getter for isTest - Set this flag to true to indicate that this company is a test company.
            If you have Returns enabled, Test companies will not file tax returns and can be used for validation purposes.
     */
    public Boolean getIsTest() {
        return this.isTest;
    }

    /**
     * Setter for isTest - Set this flag to true to indicate that this company is a test company.
            If you have Returns enabled, Test companies will not file tax returns and can be used for validation purposes.
     */
    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }

    
    private Boolean warningsEnabled;

    /**
     * Getter for warningsEnabled - Set this value to true to receive warnings in API calls via SOAP.
     */
    public Boolean getWarningsEnabled() {
        return this.warningsEnabled;
    }

    /**
     * Setter for warningsEnabled - Set this value to true to receive warnings in API calls via SOAP.
     */
    public void setWarningsEnabled(Boolean warningsEnabled) {
        this.warningsEnabled = warningsEnabled;
    }

    
    private String defaultCountry;

    /**
     * Getter for defaultCountry - The two character ISO-3166 country code of the default country for this company.
     */
    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    /**
     * Setter for defaultCountry - The two character ISO-3166 country code of the default country for this company.
     */
    public void setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - This flag indicates whether tax activity can occur for this company.  Set this flag to true to permit the company to process transactions.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - This flag indicates whether tax activity can occur for this company.  Set this flag to true to permit the company to process transactions.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    
    private Integer defaultLocationId;

    /**
     * Getter for defaultLocationId - If set, this is the unique ID number of the default location for this company.
     */
    public Integer getDefaultLocationId() {
        return this.defaultLocationId;
    }

    /**
     * Setter for defaultLocationId - If set, this is the unique ID number of the default location for this company.
     */
    public void setDefaultLocationId(Integer defaultLocationId) {
        this.defaultLocationId = defaultLocationId;
    }

    
    private Boolean inProgress;

    /**
     * Getter for inProgress - Set this value to true to indicate that you are still working to finish configuring this company.
            While this value is true, no tax reporting will occur and the company will not be usable for transactions.
     */
    public Boolean getInProgress() {
        return this.inProgress;
    }

    /**
     * Setter for inProgress - Set this value to true to indicate that you are still working to finish configuring this company.
            While this value is true, no tax reporting will occur and the company will not be usable for transactions.
     */
    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    
    private Integer parentCompanyId;

    /**
     * Getter for parentCompanyId - If this company is fully owned by another company, this is the unique identity of the parent company.
     */
    public Integer getParentCompanyId() {
        return this.parentCompanyId;
    }

    /**
     * Setter for parentCompanyId - If this company is fully owned by another company, this is the unique identity of the parent company.
     */
    public void setParentCompanyId(Integer parentCompanyId) {
        this.parentCompanyId = parentCompanyId;
    }

    
    private Boolean hasProfile;

    /**
     * Getter for hasProfile - Set this flag to true to give this company its own unique tax profile.
            If this flag is true, this company will have its own Nexus, TaxRule, TaxCode, and Item definitions.
            If this flag is false, this company will inherit all profile values from its parent.
     */
    public Boolean getHasProfile() {
        return this.hasProfile;
    }

    /**
     * Setter for hasProfile - Set this flag to true to give this company its own unique tax profile.
            If this flag is true, this company will have its own Nexus, TaxRule, TaxCode, and Item definitions.
            If this flag is false, this company will inherit all profile values from its parent.
     */
    public void setHasProfile(Boolean hasProfile) {
        this.hasProfile = hasProfile;
    }

    
    private String baseCurrencyCode;

    /**
     * Getter for baseCurrencyCode - This is the three character ISO-4217 currency code of the default currency used by this company.
     */
    public String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    /**
     * Setter for baseCurrencyCode - This is the three character ISO-4217 currency code of the default currency used by this company.
     */
    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    
    private ArrayList<SettingModel> settings;

    /**
     * Getter for settings - Optional: A list of settings defined for this company.  To fetch this list, add the query string "?$include=Settings" to your URL.
     */
    public ArrayList<SettingModel> getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings - Optional: A list of settings defined for this company.  To fetch this list, add the query string "?$include=Settings" to your URL.
     */
    public void setSettings(ArrayList<SettingModel> settings) {
        this.settings = settings;
    }

    
    private Boolean isDefault;

    /**
     * Getter for isDefault - This flag is true if this company is the default company for this account.  Only one company may be set as the default.
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault - This flag is true if this company is the default company for this account.  Only one company may be set as the default.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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

    


    /**
     * Returns a JSON string representation of CompanyModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    