package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * An individual tax detail element. Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
 */
public class TransactionLineDetailModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax detail.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax detail.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Long transactionLineId;

    /**
     * Getter for transactionLineId
     *
     * The unique ID number of the line within this transaction.
     */
    public Long getTransactionLineId() {
        return this.transactionLineId;
    }

    /**
     * Setter for transactionLineId
     *
     * The unique ID number of the line within this transaction.
     */
    public void setTransactionLineId(Long value) {
        this.transactionLineId = value;
    }

    private Long transactionId;

    /**
     * Getter for transactionId
     *
     * The unique ID number of this transaction.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * The unique ID number of this transaction.
     */
    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    private Long addressId;

    /**
     * Getter for addressId
     *
     * The unique ID number of the address used for this tax detail.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for addressId
     *
     * The unique ID number of the address used for this tax detail.
     */
    public void setAddressId(Long value) {
        this.addressId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The two character ISO 3166 country code of the country where this tax detail is assigned.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO 3166 country code of the country where this tax detail is assigned.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * The two-or-three character ISO region code for the region where this tax detail is assigned.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two-or-three character ISO region code for the region where this tax detail is assigned.
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String countyFIPS;

    /**
     * Getter for countyFIPS
     *
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the county where this tax detail is assigned.
     */
    public String getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS
     *
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the county where this tax detail is assigned.
     */
    public void setCountyFIPS(String value) {
        this.countyFIPS = value;
    }

    private String stateFIPS;

    /**
     * Getter for stateFIPS
     *
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the state where this tax detail is assigned.
     */
    public String getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS
     *
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the state where this tax detail is assigned.
     */
    public void setStateFIPS(String value) {
        this.stateFIPS = value;
    }

    private BigDecimal exemptAmount;

    /**
     * Getter for exemptAmount
     *
     * The amount of this line that was considered exempt in this tax detail.
     */
    public BigDecimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount
     *
     * The amount of this line that was considered exempt in this tax detail.
     */
    public void setExemptAmount(BigDecimal value) {
        this.exemptAmount = value;
    }

    private Integer exemptReasonId;

    /**
     * Getter for exemptReasonId
     *
     * The unique ID number of the exemption reason for this tax detail.
     */
    public Integer getExemptReasonId() {
        return this.exemptReasonId;
    }

    /**
     * Setter for exemptReasonId
     *
     * The unique ID number of the exemption reason for this tax detail.
     */
    public void setExemptReasonId(Integer value) {
        this.exemptReasonId = value;
    }

    private Boolean inState;

    /**
     * Getter for inState
     *
     * True if this detail element represented an in-state transaction.
     */
    public Boolean getInState() {
        return this.inState;
    }

    /**
     * Setter for inState
     *
     * True if this detail element represented an in-state transaction.
     */
    public void setInState(Boolean value) {
        this.inState = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code of the jurisdiction to which this tax detail applies.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code of the jurisdiction to which this tax detail applies.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The name of the jurisdiction to which this tax detail applies.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The name of the jurisdiction to which this tax detail applies.
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * The unique ID number of the jurisdiction to which this tax detail applies.
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * The unique ID number of the jurisdiction to which this tax detail applies.
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
    }

    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * The Avalara-specified signature code of the jurisdiction to which this tax detail applies.
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The Avalara-specified signature code of the jurisdiction to which this tax detail applies.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }

    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo
     *
     * The state assigned number of the jurisdiction to which this tax detail applies.
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo
     *
     * The state assigned number of the jurisdiction to which this tax detail applies.
     */
    public void setStateAssignedNo(String value) {
        this.stateAssignedNo = value;
    }

    private JurisTypeId jurisType;

    /**
     * Getter for jurisType
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Use jurisdictionTypeId instead.
    * The type of the jurisdiction to which this tax detail applies.
     */
    public JurisTypeId getJurisType() {
        return this.jurisType;
    }

    /**
     * Setter for jurisType
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Use jurisdictionTypeId instead.
    * The type of the jurisdiction to which this tax detail applies.
     */
    public void setJurisType(JurisTypeId value) {
        this.jurisType = value;
    }

    private JurisdictionType jurisdictionType;

    /**
     * Getter for jurisdictionType
     *
     * The type of the jurisdiction in which this tax detail applies.
     */
    public JurisdictionType getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType
     *
     * The type of the jurisdiction in which this tax detail applies.
     */
    public void setJurisdictionType(JurisdictionType value) {
        this.jurisdictionType = value;
    }

    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount
     *
     * The amount of this line item that was considered nontaxable in this tax detail.
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount
     *
     * The amount of this line item that was considered nontaxable in this tax detail.
     */
    public void setNonTaxableAmount(BigDecimal value) {
        this.nonTaxableAmount = value;
    }

    private Integer nonTaxableRuleId;

    /**
     * Getter for nonTaxableRuleId
     *
     * The rule according to which portion of this detail was considered nontaxable.
     */
    public Integer getNonTaxableRuleId() {
        return this.nonTaxableRuleId;
    }

    /**
     * Setter for nonTaxableRuleId
     *
     * The rule according to which portion of this detail was considered nontaxable.
     */
    public void setNonTaxableRuleId(Integer value) {
        this.nonTaxableRuleId = value;
    }

    private TaxRuleTypeId nonTaxableType;

    /**
     * Getter for nonTaxableType
     *
     * The type of nontaxability that was applied to this tax detail.
     */
    public TaxRuleTypeId getNonTaxableType() {
        return this.nonTaxableType;
    }

    /**
     * Setter for nonTaxableType
     *
     * The type of nontaxability that was applied to this tax detail.
     */
    public void setNonTaxableType(TaxRuleTypeId value) {
        this.nonTaxableType = value;
    }

    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The rate at which this tax detail was calculated.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The rate at which this tax detail was calculated.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    private Integer rateRuleId;

    /**
     * Getter for rateRuleId
     *
     * The unique ID number of the rule according to which this tax detail was calculated.
     */
    public Integer getRateRuleId() {
        return this.rateRuleId;
    }

    /**
     * Setter for rateRuleId
     *
     * The unique ID number of the rule according to which this tax detail was calculated.
     */
    public void setRateRuleId(Integer value) {
        this.rateRuleId = value;
    }

    private Integer rateSourceId;

    /**
     * Getter for rateSourceId
     *
     * The unique ID number of the source of the rate according to which this tax detail was calculated.
     */
    public Integer getRateSourceId() {
        return this.rateSourceId;
    }

    /**
     * Setter for rateSourceId
     *
     * The unique ID number of the source of the rate according to which this tax detail was calculated.
     */
    public void setRateSourceId(Integer value) {
        this.rateSourceId = value;
    }

    private String serCode;

    /**
     * Getter for serCode
     *
     * For Streamlined Sales Tax customers, the SST Electronic Return code under which this tax detail should be applied.
     */
    public String getSerCode() {
        return this.serCode;
    }

    /**
     * Setter for serCode
     *
     * For Streamlined Sales Tax customers, the SST Electronic Return code under which this tax detail should be applied.
     */
    public void setSerCode(String value) {
        this.serCode = value;
    }

    private Sourcing sourcing;

    /**
     * Getter for sourcing
     *
     * Indicates whether this tax detail applies to the origin or destination of the transaction.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * Indicates whether this tax detail applies to the origin or destination of the transaction.
     */
    public void setSourcing(Sourcing value) {
        this.sourcing = value;
    }

    private BigDecimal tax;

    /**
     * Getter for tax
     *
     * The amount of tax for this tax detail.
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax
     *
     * The amount of tax for this tax detail.
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount of this tax detail.
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount of this tax detail.
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    private String taxType;

    /**
     * Getter for taxType
     *
     * The type of tax that was calculated. Depends on the company's nexus settings as well as the jurisdiction's tax laws.
     */
    public String getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType
     *
     * The type of tax that was calculated. Depends on the company's nexus settings as well as the jurisdiction's tax laws.
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    private String taxSubTypeId;

    /**
     * Getter for taxSubTypeId
     *
     * The id of the tax subtype.
     */
    public String getTaxSubTypeId() {
        return this.taxSubTypeId;
    }

    /**
     * Setter for taxSubTypeId
     *
     * The id of the tax subtype.
     */
    public void setTaxSubTypeId(String value) {
        this.taxSubTypeId = value;
    }

    private String taxTypeGroupId;

    /**
     * Getter for taxTypeGroupId
     *
     * The id of the tax type group.
     */
    public String getTaxTypeGroupId() {
        return this.taxTypeGroupId;
    }

    /**
     * Setter for taxTypeGroupId
     *
     * The id of the tax type group.
     */
    public void setTaxTypeGroupId(String value) {
        this.taxTypeGroupId = value;
    }

    private String taxName;

    /**
     * Getter for taxName
     *
     * The name of the tax against which this tax amount was calculated.
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * The name of the tax against which this tax amount was calculated.
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId
     *
     * The type of the tax authority to which this tax will be remitted.
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId
     *
     * The type of the tax authority to which this tax will be remitted.
     */
    public void setTaxAuthorityTypeId(Integer value) {
        this.taxAuthorityTypeId = value;
    }

    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The unique ID number of the tax region.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The unique ID number of the tax region.
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }

    private BigDecimal taxCalculated;

    /**
     * Getter for taxCalculated
     *
     * The amount of tax that AvaTax calculated.
    * If an override for tax amount is used, there may be a difference between the tax
    * field which applies your override, and the this amount that is calculated without override.
     */
    public BigDecimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated
     *
     * The amount of tax that AvaTax calculated.
    * If an override for tax amount is used, there may be a difference between the tax
    * field which applies your override, and the this amount that is calculated without override.
     */
    public void setTaxCalculated(BigDecimal value) {
        this.taxCalculated = value;
    }

    private BigDecimal taxOverride;

    /**
     * Getter for taxOverride
     *
     * The amount of tax override that was specified for this tax line.
     */
    public BigDecimal getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride
     *
     * The amount of tax override that was specified for this tax line.
     */
    public void setTaxOverride(BigDecimal value) {
        this.taxOverride = value;
    }

    private RateType rateType;

    /**
     * Getter for rateType
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Please use rateTypeCode instead.
    * The rate type for this tax detail.
     */
    public RateType getRateType() {
        return this.rateType;
    }

    /**
     * Setter for rateType
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Please use rateTypeCode instead.
    * The rate type for this tax detail.
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Indicates the code of the rate type that was used to calculate this tax detail. Use [ListRateTypesByCountry](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListRateTypesByCountry/) API for a full list of rate type codes.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Indicates the code of the rate type that was used to calculate this tax detail. Use [ListRateTypesByCountry](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListRateTypesByCountry/) API for a full list of rate type codes.
     */
    public void setRateTypeCode(String value) {
        this.rateTypeCode = value;
    }

    private BigDecimal taxableUnits;

    /**
     * Getter for taxableUnits
     *
     * Number of units in this line item that were calculated to be taxable according to this rate detail.
     */
    public BigDecimal getTaxableUnits() {
        return this.taxableUnits;
    }

    /**
     * Setter for taxableUnits
     *
     * Number of units in this line item that were calculated to be taxable according to this rate detail.
     */
    public void setTaxableUnits(BigDecimal value) {
        this.taxableUnits = value;
    }

    private BigDecimal nonTaxableUnits;

    /**
     * Getter for nonTaxableUnits
     *
     * Number of units in this line item that were calculated to be nontaxable according to this rate detail.
     */
    public BigDecimal getNonTaxableUnits() {
        return this.nonTaxableUnits;
    }

    /**
     * Setter for nonTaxableUnits
     *
     * Number of units in this line item that were calculated to be nontaxable according to this rate detail.
     */
    public void setNonTaxableUnits(BigDecimal value) {
        this.nonTaxableUnits = value;
    }

    private BigDecimal exemptUnits;

    /**
     * Getter for exemptUnits
     *
     * Number of units in this line item that were calculated to be exempt according to this rate detail.
     */
    public BigDecimal getExemptUnits() {
        return this.exemptUnits;
    }

    /**
     * Setter for exemptUnits
     *
     * Number of units in this line item that were calculated to be exempt according to this rate detail.
     */
    public void setExemptUnits(BigDecimal value) {
        this.exemptUnits = value;
    }

    private String unitOfBasis;

    /**
     * Getter for unitOfBasis
     *
     * When calculating units, what basis of measurement did we use for calculating the units?
     */
    public String getUnitOfBasis() {
        return this.unitOfBasis;
    }

    /**
     * Setter for unitOfBasis
     *
     * When calculating units, what basis of measurement did we use for calculating the units?
     */
    public void setUnitOfBasis(String value) {
        this.unitOfBasis = value;
    }

    private Boolean isNonPassThru;

    /**
     * Getter for isNonPassThru
     *
     * True if this value is a non-passthrough tax.
    *  
    * A non-passthrough tax is a tax that may not be charged to a customer; it must be paid directly by the company.
     */
    public Boolean getIsNonPassThru() {
        return this.isNonPassThru;
    }

    /**
     * Setter for isNonPassThru
     *
     * True if this value is a non-passthrough tax.
    *  
    * A non-passthrough tax is a tax that may not be charged to a customer; it must be paid directly by the company.
     */
    public void setIsNonPassThru(Boolean value) {
        this.isNonPassThru = value;
    }

    private Boolean isFee;

    /**
     * Getter for isFee
     *
     * The Taxes/Fee component. True if the fee is applied.
     */
    public Boolean getIsFee() {
        return this.isFee;
    }

    /**
     * Setter for isFee
     *
     * The Taxes/Fee component. True if the fee is applied.
     */
    public void setIsFee(Boolean value) {
        this.isFee = value;
    }

    private BigDecimal reportingTaxableUnits;

    /**
     * Getter for reportingTaxableUnits
     *
     * Number of units in this line item that were calculated to be taxable according to this rate detail in the reporting currency.
     */
    public BigDecimal getReportingTaxableUnits() {
        return this.reportingTaxableUnits;
    }

    /**
     * Setter for reportingTaxableUnits
     *
     * Number of units in this line item that were calculated to be taxable according to this rate detail in the reporting currency.
     */
    public void setReportingTaxableUnits(BigDecimal value) {
        this.reportingTaxableUnits = value;
    }

    private BigDecimal reportingNonTaxableUnits;

    /**
     * Getter for reportingNonTaxableUnits
     *
     * Number of units in this line item that were calculated to be nontaxable according to this rate detail in the reporting currency.
     */
    public BigDecimal getReportingNonTaxableUnits() {
        return this.reportingNonTaxableUnits;
    }

    /**
     * Setter for reportingNonTaxableUnits
     *
     * Number of units in this line item that were calculated to be nontaxable according to this rate detail in the reporting currency.
     */
    public void setReportingNonTaxableUnits(BigDecimal value) {
        this.reportingNonTaxableUnits = value;
    }

    private BigDecimal reportingExemptUnits;

    /**
     * Getter for reportingExemptUnits
     *
     * Number of units in this line item that were calculated to be exempt according to this rate detail in the reporting currency.
     */
    public BigDecimal getReportingExemptUnits() {
        return this.reportingExemptUnits;
    }

    /**
     * Setter for reportingExemptUnits
     *
     * Number of units in this line item that were calculated to be exempt according to this rate detail in the reporting currency.
     */
    public void setReportingExemptUnits(BigDecimal value) {
        this.reportingExemptUnits = value;
    }

    private BigDecimal reportingTax;

    /**
     * Getter for reportingTax
     *
     * The amount of tax for this tax detail in the reporting currency.
     */
    public BigDecimal getReportingTax() {
        return this.reportingTax;
    }

    /**
     * Setter for reportingTax
     *
     * The amount of tax for this tax detail in the reporting currency.
     */
    public void setReportingTax(BigDecimal value) {
        this.reportingTax = value;
    }

    private BigDecimal reportingTaxCalculated;

    /**
     * Getter for reportingTaxCalculated
     *
     * The amount of tax that AvaTax calculated in the reporting currency.
    * If an override for tax amount is used, there may be a difference between the tax
    * field which applies your override, and the this amount that is calculated without override.
     */
    public BigDecimal getReportingTaxCalculated() {
        return this.reportingTaxCalculated;
    }

    /**
     * Setter for reportingTaxCalculated
     *
     * The amount of tax that AvaTax calculated in the reporting currency.
    * If an override for tax amount is used, there may be a difference between the tax
    * field which applies your override, and the this amount that is calculated without override.
     */
    public void setReportingTaxCalculated(BigDecimal value) {
        this.reportingTaxCalculated = value;
    }

    private LiabilityType liabilityType;

    /**
     * Getter for liabilityType
     *
     * LiabilityType identifies the party liable to file the tax. This field is used to filter taxes from reports and tax filings as appropriate.
     */
    public LiabilityType getLiabilityType() {
        return this.liabilityType;
    }

    /**
     * Setter for liabilityType
     *
     * LiabilityType identifies the party liable to file the tax. This field is used to filter taxes from reports and tax filings as appropriate.
     */
    public void setLiabilityType(LiabilityType value) {
        this.liabilityType = value;
    }

    /**
     * Returns a JSON string representation of TransactionLineDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
