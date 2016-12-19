package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
 */
public class TaxRuleModel {
    private String taxCode;

    /**
     * Getter for taxCode - The code string of the tax code for this rule.
            When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - The code string of the tax code for this rule.
            When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - The type of customer usage to which this rule applies.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - The type of customer usage to which this rule applies.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId - Indicates which tax types to which this rule applies.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - Indicates which tax types to which this rule applies.
     */
    public void setTaxTypeId(MatchingTaxType taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - The last date for which this rule applies.  If null, this rule will apply to all dates after the effective date.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - The last date for which this rule applies.  If null, this rule will apply to all dates after the effective date.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String jurisCode;

    /**
     * Getter for jurisCode - The code of the jurisdiction to which this tax rule applies.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode - The code of the jurisdiction to which this tax rule applies.
     */
    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    
    private String description;

    /**
     * Getter for description - A friendly name for this tax rule.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A friendly name for this tax rule.
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

    
    private Sourcing sourcing;

    /**
     * Getter for sourcing - The sourcing types to which this rule applies.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing - The sourcing types to which this rule applies.
     */
    public void setSourcing(Sourcing sourcing) {
        this.sourcing = sourcing;
    }

    
    private String country;

    /**
     * Getter for country - The two character ISO 3166 country code for the locations where this rule applies.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The two character ISO 3166 country code for the locations where this rule applies.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Integer taxCodeId;

    /**
     * Getter for taxCodeId - The unique ID number of the tax code for this rule.
            When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId - The unique ID number of the tax code for this rule.
            When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    
    private String options;

    /**
     * Getter for options - Custom option flags for this rule.
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options - Custom option flags for this rule.
     */
    public void setOptions(String options) {
        this.options = options;
    }

    
    private Boolean isAllJuris;

    /**
     * Getter for isAllJuris - Set this value to true if this tax rule applies in all jurisdictions.
     */
    public Boolean getIsAllJuris() {
        return this.isAllJuris;
    }

    /**
     * Setter for isAllJuris - Set this value to true if this tax rule applies in all jurisdictions.
     */
    public void setIsAllJuris(Boolean isAllJuris) {
        this.isAllJuris = isAllJuris;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this tax rule.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this tax rule.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String stateFIPS;

    /**
     * Getter for stateFIPS - For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public String getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS - For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public void setStateFIPS(String stateFIPS) {
        this.stateFIPS = stateFIPS;
    }

    
    private BigDecimal threshold;

    /**
     * Getter for threshold - The per-unit threshold that must be met before this rule applies.
     */
    public BigDecimal getThreshold() {
        return this.threshold;
    }

    /**
     * Setter for threshold - The per-unit threshold that must be met before this rule applies.
     */
    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    
    private Boolean isSTPro;

    /**
     * Getter for isSTPro - If true, indicates this rule is for Sales Tax Pro.
     */
    public Boolean getIsSTPro() {
        return this.isSTPro;
    }

    /**
     * Setter for isSTPro - If true, indicates this rule is for Sales Tax Pro.
     */
    public void setIsSTPro(Boolean isSTPro) {
        this.isSTPro = isSTPro;
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
     * Getter for effectiveDate - The first date at which this rule applies.  If null, this rule will apply to all dates prior to the end date.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - The first date at which this rule applies.  If null, this rule will apply to all dates prior to the end date.
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
     * Getter for region - The state, region, or province name for the locations where this rule applies.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The state, region, or province name for the locations where this rule applies.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String countyFIPS;

    /**
     * Getter for countyFIPS - For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public String getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS - For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public void setCountyFIPS(String countyFIPS) {
        this.countyFIPS = countyFIPS;
    }

    
    private TaxRuleTypeId taxRuleTypeId;

    /**
     * Getter for taxRuleTypeId - This type value determines the behavior of the tax rule.
            You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate 
            (for example, if you have been granted an official ruling for your product's rate that differs from the official rate), 
            or other types of behavior.
     */
    public TaxRuleTypeId getTaxRuleTypeId() {
        return this.taxRuleTypeId;
    }

    /**
     * Setter for taxRuleTypeId - This type value determines the behavior of the tax rule.
            You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate 
            (for example, if you have been granted an official ruling for your product's rate that differs from the official rate), 
            or other types of behavior.
     */
    public void setTaxRuleTypeId(TaxRuleTypeId taxRuleTypeId) {
        this.taxRuleTypeId = taxRuleTypeId;
    }

    
    private RateType rateTypeId;

    /**
     * Getter for rateTypeId - Indicates the rate type to which this rule applies.
     */
    public RateType getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId - Indicates the rate type to which this rule applies.
     */
    public void setRateTypeId(RateType rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    
    private String jurisName;

    /**
     * Getter for jurisName - The name of the jurisdiction to which this tax rule applies.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName - The name of the jurisdiction to which this tax rule applies.
     */
    public void setJurisName(String jurisName) {
        this.jurisName = jurisName;
    }

    
    private BigDecimal cap;

    /**
     * Getter for cap - The maximum cap for the price of this item according to this rule.
     */
    public BigDecimal getCap() {
        return this.cap;
    }

    /**
     * Setter for cap - The maximum cap for the price of this item according to this rule.
     */
    public void setCap(BigDecimal cap) {
        this.cap = cap;
    }

    
    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId - The type of the jurisdiction to which this tax rule applies.
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId - The type of the jurisdiction to which this tax rule applies.
     */
    public void setJurisTypeId(JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }

    
    private BigDecimal value;

    /**
     * Getter for value - The corrected rate for this tax rule.
     */
    public BigDecimal getValue() {
        return this.value;
    }

    /**
     * Setter for value - The corrected rate for this tax rule.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company that owns this tax rule.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company that owns this tax rule.
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

    


    /**
     * Returns a JSON string representation of TaxRuleModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    