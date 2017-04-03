package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
 */
public class TransactionLineDetailModel {
    private BigDecimal rate;

    /**
     * Getter for rate - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    
    private BigDecimal exemptAmount;

    /**
     * Getter for exemptAmount - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setExemptAmount(BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }

    
    private Integer rateSourceId;

    /**
     * Getter for rateSourceId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getRateSourceId() {
        return this.rateSourceId;
    }

    /**
     * Setter for rateSourceId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setRateSourceId(Integer rateSourceId) {
        this.rateSourceId = rateSourceId;
    }

    
    private String serCode;

    /**
     * Getter for serCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getSerCode() {
        return this.serCode;
    }

    /**
     * Setter for serCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setSerCode(String serCode) {
        this.serCode = serCode;
    }

    
    private JurisTypeId jurisType;

    /**
     * Getter for jurisType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public JurisTypeId getJurisType() {
        return this.jurisType;
    }

    /**
     * Setter for jurisType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setJurisType(JurisTypeId jurisType) {
        this.jurisType = jurisType;
    }

    
    private String jurisCode;

    /**
     * Getter for jurisCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    
    private BigDecimal tax;

    /**
     * Getter for tax - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    
    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    
    private BigDecimal taxOverride;

    /**
     * Getter for taxOverride - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxOverride(BigDecimal taxOverride) {
        this.taxOverride = taxOverride;
    }

    
    private String taxName;

    /**
     * Getter for taxName - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    
    private Integer nonTaxableRuleId;

    /**
     * Getter for nonTaxableRuleId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getNonTaxableRuleId() {
        return this.nonTaxableRuleId;
    }

    /**
     * Setter for nonTaxableRuleId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setNonTaxableRuleId(Integer nonTaxableRuleId) {
        this.nonTaxableRuleId = nonTaxableRuleId;
    }

    
    private Integer exemptReasonId;

    /**
     * Getter for exemptReasonId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getExemptReasonId() {
        return this.exemptReasonId;
    }

    /**
     * Setter for exemptReasonId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setExemptReasonId(Integer exemptReasonId) {
        this.exemptReasonId = exemptReasonId;
    }

    
    private TaxType taxType;

    /**
     * Getter for taxType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public TaxType getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    
    private Sourcing sourcing;

    /**
     * Getter for sourcing - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setSourcing(Sourcing sourcing) {
        this.sourcing = sourcing;
    }

    
    private String country;

    /**
     * Getter for country - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Integer rateRuleId;

    /**
     * Getter for rateRuleId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getRateRuleId() {
        return this.rateRuleId;
    }

    /**
     * Setter for rateRuleId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setRateRuleId(Integer rateRuleId) {
        this.rateRuleId = rateRuleId;
    }

    
    private Integer taxRegionId;

    /**
     * Getter for taxRegionId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxRegionId(Integer taxRegionId) {
        this.taxRegionId = taxRegionId;
    }

    
    private String rateTypeCode;

    /**
     * Getter for rateTypeCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setRateTypeCode(String rateTypeCode) {
        this.rateTypeCode = rateTypeCode;
    }

    
    private Long id;

    /**
     * Getter for id - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private BigDecimal taxCalculated;

    /**
     * Getter for taxCalculated - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxCalculated(BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }

    
    private TaxRuleTypeId nonTaxableType;

    /**
     * Getter for nonTaxableType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public TaxRuleTypeId getNonTaxableType() {
        return this.nonTaxableType;
    }

    /**
     * Setter for nonTaxableType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setNonTaxableType(TaxRuleTypeId nonTaxableType) {
        this.nonTaxableType = nonTaxableType;
    }

    
    private String stateFIPS;

    /**
     * Getter for stateFIPS - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setStateFIPS(String stateFIPS) {
        this.stateFIPS = stateFIPS;
    }

    
    private RateType rateType;

    /**
     * Getter for rateType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public RateType getRateType() {
        return this.rateType;
    }

    /**
     * Setter for rateType - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    
    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxAuthorityTypeId(Integer taxAuthorityTypeId) {
        this.taxAuthorityTypeId = taxAuthorityTypeId;
    }

    
    private String region;

    /**
     * Getter for region - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String countyFIPS;

    /**
     * Getter for countyFIPS - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setCountyFIPS(String countyFIPS) {
        this.countyFIPS = countyFIPS;
    }

    
    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setStateAssignedNo(String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }

    
    private Boolean inState;

    /**
     * Getter for inState - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Boolean getInState() {
        return this.inState;
    }

    /**
     * Setter for inState - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setInState(Boolean inState) {
        this.inState = inState;
    }

    
    private BigDecimal exemptUnits;

    /**
     * Getter for exemptUnits - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getExemptUnits() {
        return this.exemptUnits;
    }

    /**
     * Setter for exemptUnits - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setExemptUnits(BigDecimal exemptUnits) {
        this.exemptUnits = exemptUnits;
    }

    
    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    
    private BigDecimal nonTaxableUnits;

    /**
     * Getter for nonTaxableUnits - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getNonTaxableUnits() {
        return this.nonTaxableUnits;
    }

    /**
     * Setter for nonTaxableUnits - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setNonTaxableUnits(BigDecimal nonTaxableUnits) {
        this.nonTaxableUnits = nonTaxableUnits;
    }

    
    private Long transactionLineId;

    /**
     * Getter for transactionLineId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Long getTransactionLineId() {
        return this.transactionLineId;
    }

    /**
     * Setter for transactionLineId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTransactionLineId(Long transactionLineId) {
        this.transactionLineId = transactionLineId;
    }

    
    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setNonTaxableAmount(BigDecimal nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    
    private String unitOfBasis;

    /**
     * Getter for unitOfBasis - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getUnitOfBasis() {
        return this.unitOfBasis;
    }

    /**
     * Setter for unitOfBasis - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setUnitOfBasis(String unitOfBasis) {
        this.unitOfBasis = unitOfBasis;
    }

    
    private String jurisName;

    /**
     * Getter for jurisName - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setJurisName(String jurisName) {
        this.jurisName = jurisName;
    }

    
    private String signatureCode;

    /**
     * Getter for signatureCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
    }

    
    private Long transactionId;

    /**
     * Getter for transactionId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    
    private Long addressId;

    /**
     * Getter for addressId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for addressId - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    
    private BigDecimal taxableUnits;

    /**
     * Getter for taxableUnits - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public BigDecimal getTaxableUnits() {
        return this.taxableUnits;
    }

    /**
     * Setter for taxableUnits - An individual tax detail element.  Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
     */
    public void setTaxableUnits(BigDecimal taxableUnits) {
        this.taxableUnits = taxableUnits;
    }

    


    /**
     * Returns a JSON string representation of TransactionLineDetailModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    