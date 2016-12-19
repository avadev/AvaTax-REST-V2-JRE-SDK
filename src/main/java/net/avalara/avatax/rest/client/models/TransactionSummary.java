package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Summary information about an overall transaction.
 */
public class TransactionSummary {
    private BigDecimal rate;

    /**
     * Getter for rate - Tax Rate - The rate of taxation, as a fraction of the amount.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate - Tax Rate - The rate of taxation, as a fraction of the amount.
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    
    private BigDecimal exemption;

    /**
     * Getter for exemption - The amount of the transaction that was exempt.
     */
    public BigDecimal getExemption() {
        return this.exemption;
    }

    /**
     * Setter for exemption - The amount of the transaction that was exempt.
     */
    public void setExemption(BigDecimal exemption) {
        this.exemption = exemption;
    }

    
    private JurisdictionType jurisType;

    /**
     * Getter for jurisType - The type of jurisdiction that collects this tax.
     */
    public JurisdictionType getJurisType() {
        return this.jurisType;
    }

    /**
     * Setter for jurisType - The type of jurisdiction that collects this tax.
     */
    public void setJurisType(JurisdictionType jurisType) {
        this.jurisType = jurisType;
    }

    
    private String jurisCode;

    /**
     * Getter for jurisCode - Jurisdiction Code for the taxing jurisdiction
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode - Jurisdiction Code for the taxing jurisdiction
     */
    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    
    private BigDecimal tax;

    /**
     * Getter for tax - Tax amount - The calculated tax (Base * Rate).
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax - Tax amount - The calculated tax (Base * Rate).
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    
    private String taxName;

    /**
     * Getter for taxName - The name of the tax.
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName - The name of the tax.
     */
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    
    private Integer taxAuthorityType;

    /**
     * Getter for taxAuthorityType - The unique ID of the Tax Authority Type that collects this tax.
     */
    public Integer getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType - The unique ID of the Tax Authority Type that collects this tax.
     */
    public void setTaxAuthorityType(Integer taxAuthorityType) {
        this.taxAuthorityType = taxAuthorityType;
    }

    
    private TaxType taxType;

    /**
     * Getter for taxType - The tax type of this tax.
     */
    public TaxType getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType - The tax type of this tax.
     */
    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    
    private String country;

    /**
     * Getter for country - Two character ISO-3166 country code.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Two character ISO-3166 country code.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private BigDecimal taxCalculated;

    /**
     * Getter for taxCalculated - Tax Calculated by Avalara AvaTax.  This may be overriden by a TaxOverride.TaxAmount.
     */
    public BigDecimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated - Tax Calculated by Avalara AvaTax.  This may be overriden by a TaxOverride.TaxAmount.
     */
    public void setTaxCalculated(BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }

    
    private BigDecimal taxable;

    /**
     * Getter for taxable - Tax Base - The adjusted taxable amount.
     */
    public BigDecimal getTaxable() {
        return this.taxable;
    }

    /**
     * Setter for taxable - Tax Base - The adjusted taxable amount.
     */
    public void setTaxable(BigDecimal taxable) {
        this.taxable = taxable;
    }

    
    private RateType rateType;

    /**
     * Getter for rateType - Indicates the tax rate type.
     */
    public RateType getRateType() {
        return this.rateType;
    }

    /**
     * Setter for rateType - Indicates the tax rate type.
     */
    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    
    private BigDecimal nonTaxable;

    /**
     * Getter for nonTaxable - The amount of the transaction that was non-taxable.
     */
    public BigDecimal getNonTaxable() {
        return this.nonTaxable;
    }

    /**
     * Setter for nonTaxable - The amount of the transaction that was non-taxable.
     */
    public void setNonTaxable(BigDecimal nonTaxable) {
        this.nonTaxable = nonTaxable;
    }

    
    private String taxGroup;

    /**
     * Getter for taxGroup - Group code when special grouping is enabled.
     */
    public String getTaxGroup() {
        return this.taxGroup;
    }

    /**
     * Setter for taxGroup - Group code when special grouping is enabled.
     */
    public void setTaxGroup(String taxGroup) {
        this.taxGroup = taxGroup;
    }

    
    private String region;

    /**
     * Getter for region - Two or three character ISO region, state or province code, if applicable.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Two or three character ISO region, state or province code, if applicable.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo - The state assigned number of the jurisdiction that collects this tax.
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo - The state assigned number of the jurisdiction that collects this tax.
     */
    public void setStateAssignedNo(String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }

    
    private String jurisName;

    /**
     * Getter for jurisName - The name of the jurisdiction that collects this tax.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName - The name of the jurisdiction that collects this tax.
     */
    public void setJurisName(String jurisName) {
        this.jurisName = jurisName;
    }

    


    /**
     * Returns a JSON string representation of TransactionSummary.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    