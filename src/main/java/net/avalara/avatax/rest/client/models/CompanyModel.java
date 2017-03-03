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
     * Getter for locations - A company or business entity.
     */
    public ArrayList<LocationModel> getLocations() {
        return this.locations;
    }

    /**
     * Setter for locations - A company or business entity.
     */
    public void setLocations(ArrayList<LocationModel> locations) {
        this.locations = locations;
    }

    
    private String name;

    /**
     * Getter for name - A company or business entity.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - A company or business entity.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private ArrayList<TaxCodeModel> taxCodes;

    /**
     * Getter for taxCodes - A company or business entity.
     */
    public ArrayList<TaxCodeModel> getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes - A company or business entity.
     */
    public void setTaxCodes(ArrayList<TaxCodeModel> taxCodes) {
        this.taxCodes = taxCodes;
    }

    
    private ArrayList<NexusModel> nexus;

    /**
     * Getter for nexus - A company or business entity.
     */
    public ArrayList<NexusModel> getNexus() {
        return this.nexus;
    }

    /**
     * Setter for nexus - A company or business entity.
     */
    public void setNexus(ArrayList<NexusModel> nexus) {
        this.nexus = nexus;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - A company or business entity.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - A company or business entity.
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - A company or business entity.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - A company or business entity.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private ArrayList<ItemModel> items;

    /**
     * Getter for items - A company or business entity.
     */
    public ArrayList<ItemModel> getItems() {
        return this.items;
    }

    /**
     * Setter for items - A company or business entity.
     */
    public void setItems(ArrayList<ItemModel> items) {
        this.items = items;
    }

    
    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo - A company or business entity.
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo - A company or business entity.
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    
    private Boolean isReportingEntity;

    /**
     * Getter for isReportingEntity - A company or business entity.
     */
    public Boolean getIsReportingEntity() {
        return this.isReportingEntity;
    }

    /**
     * Setter for isReportingEntity - A company or business entity.
     */
    public void setIsReportingEntity(Boolean isReportingEntity) {
        this.isReportingEntity = isReportingEntity;
    }

    
    private ArrayList<UPCModel> upcs;

    /**
     * Getter for upcs - A company or business entity.
     */
    public ArrayList<UPCModel> getUpcs() {
        return this.upcs;
    }

    /**
     * Setter for upcs - A company or business entity.
     */
    public void setUpcs(ArrayList<UPCModel> upcs) {
        this.upcs = upcs;
    }

    
    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber - A company or business entity.
     */
    public String getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber - A company or business entity.
     */
    public void setTaxpayerIdNumber(String taxpayerIdNumber) {
        this.taxpayerIdNumber = taxpayerIdNumber;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - A company or business entity.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - A company or business entity.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String sstPid;

    /**
     * Getter for sstPid - A company or business entity.
     */
    public String getSstPid() {
        return this.sstPid;
    }

    /**
     * Setter for sstPid - A company or business entity.
     */
    public void setSstPid(String sstPid) {
        this.sstPid = sstPid;
    }

    
    private ArrayList<ContactModel> contacts;

    /**
     * Getter for contacts - A company or business entity.
     */
    public ArrayList<ContactModel> getContacts() {
        return this.contacts;
    }

    /**
     * Setter for contacts - A company or business entity.
     */
    public void setContacts(ArrayList<ContactModel> contacts) {
        this.contacts = contacts;
    }

    
    private Date sstEffectiveDate;

    /**
     * Getter for sstEffectiveDate - A company or business entity.
     */
    public Date getSstEffectiveDate() {
        return this.sstEffectiveDate;
    }

    /**
     * Setter for sstEffectiveDate - A company or business entity.
     */
    public void setSstEffectiveDate(Date sstEffectiveDate) {
        this.sstEffectiveDate = sstEffectiveDate;
    }

    
    private ArrayList<TaxRuleModel> taxRules;

    /**
     * Getter for taxRules - A company or business entity.
     */
    public ArrayList<TaxRuleModel> getTaxRules() {
        return this.taxRules;
    }

    /**
     * Setter for taxRules - A company or business entity.
     */
    public void setTaxRules(ArrayList<TaxRuleModel> taxRules) {
        this.taxRules = taxRules;
    }

    
    private RoundingLevelId roundingLevelId;

    /**
     * Getter for roundingLevelId - A company or business entity.
     */
    public RoundingLevelId getRoundingLevelId() {
        return this.roundingLevelId;
    }

    /**
     * Setter for roundingLevelId - A company or business entity.
     */
    public void setRoundingLevelId(RoundingLevelId roundingLevelId) {
        this.roundingLevelId = roundingLevelId;
    }

    
    private TaxDependencyLevelId taxDependencyLevelId;

    /**
     * Getter for taxDependencyLevelId - A company or business entity.
     */
    public TaxDependencyLevelId getTaxDependencyLevelId() {
        return this.taxDependencyLevelId;
    }

    /**
     * Setter for taxDependencyLevelId - A company or business entity.
     */
    public void setTaxDependencyLevelId(TaxDependencyLevelId taxDependencyLevelId) {
        this.taxDependencyLevelId = taxDependencyLevelId;
    }

    
    private Integer id;

    /**
     * Getter for id - A company or business entity.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - A company or business entity.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Boolean isTest;

    /**
     * Getter for isTest - A company or business entity.
     */
    public Boolean getIsTest() {
        return this.isTest;
    }

    /**
     * Setter for isTest - A company or business entity.
     */
    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }

    
    private Boolean warningsEnabled;

    /**
     * Getter for warningsEnabled - A company or business entity.
     */
    public Boolean getWarningsEnabled() {
        return this.warningsEnabled;
    }

    /**
     * Setter for warningsEnabled - A company or business entity.
     */
    public void setWarningsEnabled(Boolean warningsEnabled) {
        this.warningsEnabled = warningsEnabled;
    }

    
    private String defaultCountry;

    /**
     * Getter for defaultCountry - A company or business entity.
     */
    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    /**
     * Setter for defaultCountry - A company or business entity.
     */
    public void setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - A company or business entity.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - A company or business entity.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - A company or business entity.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - A company or business entity.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - A company or business entity.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - A company or business entity.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer defaultLocationId;

    /**
     * Getter for defaultLocationId - A company or business entity.
     */
    public Integer getDefaultLocationId() {
        return this.defaultLocationId;
    }

    /**
     * Setter for defaultLocationId - A company or business entity.
     */
    public void setDefaultLocationId(Integer defaultLocationId) {
        this.defaultLocationId = defaultLocationId;
    }

    
    private Boolean inProgress;

    /**
     * Getter for inProgress - A company or business entity.
     */
    public Boolean getInProgress() {
        return this.inProgress;
    }

    /**
     * Setter for inProgress - A company or business entity.
     */
    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    
    private Integer parentCompanyId;

    /**
     * Getter for parentCompanyId - A company or business entity.
     */
    public Integer getParentCompanyId() {
        return this.parentCompanyId;
    }

    /**
     * Setter for parentCompanyId - A company or business entity.
     */
    public void setParentCompanyId(Integer parentCompanyId) {
        this.parentCompanyId = parentCompanyId;
    }

    
    private Boolean hasProfile;

    /**
     * Getter for hasProfile - A company or business entity.
     */
    public Boolean getHasProfile() {
        return this.hasProfile;
    }

    /**
     * Setter for hasProfile - A company or business entity.
     */
    public void setHasProfile(Boolean hasProfile) {
        this.hasProfile = hasProfile;
    }

    
    private String baseCurrencyCode;

    /**
     * Getter for baseCurrencyCode - A company or business entity.
     */
    public String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    /**
     * Setter for baseCurrencyCode - A company or business entity.
     */
    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    
    private ArrayList<SettingModel> settings;

    /**
     * Getter for settings - A company or business entity.
     */
    public ArrayList<SettingModel> getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings - A company or business entity.
     */
    public void setSettings(ArrayList<SettingModel> settings) {
        this.settings = settings;
    }

    
    private Boolean isDefault;

    /**
     * Getter for isDefault - A company or business entity.
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault - A company or business entity.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - A company or business entity.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - A company or business entity.
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
    