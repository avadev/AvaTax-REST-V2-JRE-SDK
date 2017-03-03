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
     * Getter for taxCode - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setTaxTypeId(MatchingTaxType taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String jurisCode;

    /**
     * Getter for jurisCode - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    
    private String description;

    /**
     * Getter for description - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Sourcing sourcing;

    /**
     * Getter for sourcing - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setSourcing(Sourcing sourcing) {
        this.sourcing = sourcing;
    }

    
    private String country;

    /**
     * Getter for country - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Integer taxCodeId;

    /**
     * Getter for taxCodeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    
    private String options;

    /**
     * Getter for options - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setOptions(String options) {
        this.options = options;
    }

    
    private Boolean isAllJuris;

    /**
     * Getter for isAllJuris - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Boolean getIsAllJuris() {
        return this.isAllJuris;
    }

    /**
     * Setter for isAllJuris - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setIsAllJuris(Boolean isAllJuris) {
        this.isAllJuris = isAllJuris;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String stateFIPS;

    /**
     * Getter for stateFIPS - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setStateFIPS(String stateFIPS) {
        this.stateFIPS = stateFIPS;
    }

    
    private BigDecimal threshold;

    /**
     * Getter for threshold - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public BigDecimal getThreshold() {
        return this.threshold;
    }

    /**
     * Setter for threshold - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    
    private Boolean isSTPro;

    /**
     * Getter for isSTPro - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Boolean getIsSTPro() {
        return this.isSTPro;
    }

    /**
     * Setter for isSTPro - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setIsSTPro(Boolean isSTPro) {
        this.isSTPro = isSTPro;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String countyFIPS;

    /**
     * Getter for countyFIPS - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setCountyFIPS(String countyFIPS) {
        this.countyFIPS = countyFIPS;
    }

    
    private TaxRuleTypeId taxRuleTypeId;

    /**
     * Getter for taxRuleTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public TaxRuleTypeId getTaxRuleTypeId() {
        return this.taxRuleTypeId;
    }

    /**
     * Setter for taxRuleTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setTaxRuleTypeId(TaxRuleTypeId taxRuleTypeId) {
        this.taxRuleTypeId = taxRuleTypeId;
    }

    
    private RateType rateTypeId;

    /**
     * Getter for rateTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public RateType getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setRateTypeId(RateType rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    
    private String jurisName;

    /**
     * Getter for jurisName - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setJurisName(String jurisName) {
        this.jurisName = jurisName;
    }

    
    private BigDecimal cap;

    /**
     * Getter for cap - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public BigDecimal getCap() {
        return this.cap;
    }

    /**
     * Setter for cap - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setCap(BigDecimal cap) {
        this.cap = cap;
    }

    
    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setJurisTypeId(JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }

    
    private BigDecimal value;

    /**
     * Getter for value - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public BigDecimal getValue() {
        return this.value;
    }

    /**
     * Setter for value - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
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
    