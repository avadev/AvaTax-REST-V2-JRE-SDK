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
     * Getter for rate - Summary information about an overall transaction.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate - Summary information about an overall transaction.
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    
    private BigDecimal exemption;

    /**
     * Getter for exemption - Summary information about an overall transaction.
     */
    public BigDecimal getExemption() {
        return this.exemption;
    }

    /**
     * Setter for exemption - Summary information about an overall transaction.
     */
    public void setExemption(BigDecimal exemption) {
        this.exemption = exemption;
    }

    
    private JurisdictionType jurisType;

    /**
     * Getter for jurisType - Summary information about an overall transaction.
     */
    public JurisdictionType getJurisType() {
        return this.jurisType;
    }

    /**
     * Setter for jurisType - Summary information about an overall transaction.
     */
    public void setJurisType(JurisdictionType jurisType) {
        this.jurisType = jurisType;
    }

    
    private String jurisCode;

    /**
     * Getter for jurisCode - Summary information about an overall transaction.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode - Summary information about an overall transaction.
     */
    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    
    private BigDecimal tax;

    /**
     * Getter for tax - Summary information about an overall transaction.
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax - Summary information about an overall transaction.
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    
    private String taxName;

    /**
     * Getter for taxName - Summary information about an overall transaction.
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName - Summary information about an overall transaction.
     */
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    
    private Integer taxAuthorityType;

    /**
     * Getter for taxAuthorityType - Summary information about an overall transaction.
     */
    public Integer getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType - Summary information about an overall transaction.
     */
    public void setTaxAuthorityType(Integer taxAuthorityType) {
        this.taxAuthorityType = taxAuthorityType;
    }

    
    private TaxType taxType;

    /**
     * Getter for taxType - Summary information about an overall transaction.
     */
    public TaxType getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType - Summary information about an overall transaction.
     */
    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    
    private String country;

    /**
     * Getter for country - Summary information about an overall transaction.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Summary information about an overall transaction.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private BigDecimal taxCalculated;

    /**
     * Getter for taxCalculated - Summary information about an overall transaction.
     */
    public BigDecimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated - Summary information about an overall transaction.
     */
    public void setTaxCalculated(BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }

    
    private BigDecimal taxable;

    /**
     * Getter for taxable - Summary information about an overall transaction.
     */
    public BigDecimal getTaxable() {
        return this.taxable;
    }

    /**
     * Setter for taxable - Summary information about an overall transaction.
     */
    public void setTaxable(BigDecimal taxable) {
        this.taxable = taxable;
    }

    
    private RateType rateType;

    /**
     * Getter for rateType - Summary information about an overall transaction.
     */
    public RateType getRateType() {
        return this.rateType;
    }

    /**
     * Setter for rateType - Summary information about an overall transaction.
     */
    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    
    private BigDecimal nonTaxable;

    /**
     * Getter for nonTaxable - Summary information about an overall transaction.
     */
    public BigDecimal getNonTaxable() {
        return this.nonTaxable;
    }

    /**
     * Setter for nonTaxable - Summary information about an overall transaction.
     */
    public void setNonTaxable(BigDecimal nonTaxable) {
        this.nonTaxable = nonTaxable;
    }

    
    private String taxGroup;

    /**
     * Getter for taxGroup - Summary information about an overall transaction.
     */
    public String getTaxGroup() {
        return this.taxGroup;
    }

    /**
     * Setter for taxGroup - Summary information about an overall transaction.
     */
    public void setTaxGroup(String taxGroup) {
        this.taxGroup = taxGroup;
    }

    
    private String region;

    /**
     * Getter for region - Summary information about an overall transaction.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Summary information about an overall transaction.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo - Summary information about an overall transaction.
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo - Summary information about an overall transaction.
     */
    public void setStateAssignedNo(String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }

    
    private String jurisName;

    /**
     * Getter for jurisName - Summary information about an overall transaction.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName - Summary information about an overall transaction.
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
    