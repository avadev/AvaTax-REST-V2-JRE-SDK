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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
 */
public class TaxRuleModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax rule.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax rule.
     */
    public void setId(int value) {
        this.id = value;
    }


    private int companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that owns this tax rule.
     */
    public int getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that owns this tax rule.
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }


    private Integer taxCodeId;

    /**
     * Getter for taxCodeId
     *
     * The unique ID number of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId
     *
     * The unique ID number of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void setTaxCodeId(Integer value) {
        this.taxCodeId = value;
    }


    private string taxCode;

    /**
     * Getter for taxCode
     *
     * The code string of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public string getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The code string of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void setTaxCode(string value) {
        this.taxCode = value;
    }


    private string stateFIPS;

    /**
     * Getter for stateFIPS
     *
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public string getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS
     *
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public void setStateFIPS(string value) {
        this.stateFIPS = value;
    }


    private string jurisName;

    /**
     * Getter for jurisName
     *
     * The name of the jurisdiction to which this tax rule applies.
     */
    public string getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The name of the jurisdiction to which this tax rule applies.
     */
    public void setJurisName(string value) {
        this.jurisName = value;
    }


    private string jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code of the jurisdiction to which this tax rule applies.
     */
    public string getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code of the jurisdiction to which this tax rule applies.
     */
    public void setJurisCode(string value) {
        this.jurisCode = value;
    }


    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId
     *
     * The type of the jurisdiction to which this tax rule applies.
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId
     *
     * The type of the jurisdiction to which this tax rule applies.
     */
    public void setJurisTypeId(JurisTypeId value) {
        this.jurisTypeId = value;
    }


    private string customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * The type of customer usage to which this rule applies.
     */
    public string getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * The type of customer usage to which this rule applies.
     */
    public void setCustomerUsageType(string value) {
        this.customerUsageType = value;
    }


    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * Indicates which tax types to which this rule applies.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * Indicates which tax types to which this rule applies.
     */
    public void setTaxTypeId(MatchingTaxType value) {
        this.taxTypeId = value;
    }


    private RateType rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * (DEPRECATED) Enumerated rate type to which this rule applies. Please use rateTypeCode instead.
     */
    public RateType getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * (DEPRECATED) Enumerated rate type to which this rule applies. Please use rateTypeCode instead.
     */
    public void setRateTypeId(RateType value) {
        this.rateTypeId = value;
    }


    private string rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public string getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public void setRateTypeCode(string value) {
        this.rateTypeCode = value;
    }


    private TaxRuleTypeId taxRuleTypeId;

    /**
     * Getter for taxRuleTypeId
     *
     * This type value determines the behavior of the tax rule.
    * You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate 
    * (for example, if you have been granted an official ruling for your product's rate that differs from the official rate), 
    * or other types of behavior.
     */
    public TaxRuleTypeId getTaxRuleTypeId() {
        return this.taxRuleTypeId;
    }

    /**
     * Setter for taxRuleTypeId
     *
     * This type value determines the behavior of the tax rule.
    * You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate 
    * (for example, if you have been granted an official ruling for your product's rate that differs from the official rate), 
    * or other types of behavior.
     */
    public void setTaxRuleTypeId(TaxRuleTypeId value) {
        this.taxRuleTypeId = value;
    }


    private Boolean isAllJuris;

    /**
     * Getter for isAllJuris
     *
     * Set this value to true if this tax rule applies in all jurisdictions.
     */
    public Boolean getIsAllJuris() {
        return this.isAllJuris;
    }

    /**
     * Setter for isAllJuris
     *
     * Set this value to true if this tax rule applies in all jurisdictions.
     */
    public void setIsAllJuris(Boolean value) {
        this.isAllJuris = value;
    }


    private BigDecimal value;

    /**
     * Getter for value
     *
     * The corrected rate for this tax rule.
     */
    public BigDecimal getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The corrected rate for this tax rule.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }


    private BigDecimal cap;

    /**
     * Getter for cap
     *
     * The maximum cap for the price of this item according to this rule.
     */
    public BigDecimal getCap() {
        return this.cap;
    }

    /**
     * Setter for cap
     *
     * The maximum cap for the price of this item according to this rule.
     */
    public void setCap(BigDecimal value) {
        this.cap = value;
    }


    private BigDecimal threshold;

    /**
     * Getter for threshold
     *
     * The per-unit threshold that must be met before this rule applies.
     */
    public BigDecimal getThreshold() {
        return this.threshold;
    }

    /**
     * Setter for threshold
     *
     * The per-unit threshold that must be met before this rule applies.
     */
    public void setThreshold(BigDecimal value) {
        this.threshold = value;
    }


    private string options;

    /**
     * Getter for options
     *
     * Custom option flags for this rule.
     */
    public string getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Custom option flags for this rule.
     */
    public void setOptions(string value) {
        this.options = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date at which this rule applies. If null, this rule will apply to all dates prior to the end date.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The first date at which this rule applies. If null, this rule will apply to all dates prior to the end date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date for which this rule applies. If null, this rule will apply to all dates after the effective date.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date for which this rule applies. If null, this rule will apply to all dates after the effective date.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * A friendly name for this tax rule.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly name for this tax rule.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string countyFIPS;

    /**
     * Getter for countyFIPS
     *
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public string getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS
     *
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public void setCountyFIPS(string value) {
        this.countyFIPS = value;
    }


    private Boolean isSTPro;

    /**
     * Getter for isSTPro
     *
     * If true, indicates this rule is for Sales Tax Pro.
     */
    public Boolean getIsSTPro() {
        return this.isSTPro;
    }

    /**
     * Setter for isSTPro
     *
     * If true, indicates this rule is for Sales Tax Pro.
     */
    public void setIsSTPro(Boolean value) {
        this.isSTPro = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The two character ISO 3166 country code for the locations where this rule applies.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO 3166 country code for the locations where this rule applies.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The state, region, or province name for the locations where this rule applies.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The state, region, or province name for the locations where this rule applies.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private Sourcing sourcing;

    /**
     * Getter for sourcing
     *
     * The sourcing types to which this rule applies.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * The sourcing types to which this rule applies.
     */
    public void setSourcing(Sourcing value) {
        this.sourcing = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private string taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * The group Id of tax types supported by Avalara. Refer to /api/v2/definitions/taxtypegroups for types we support.
     */
    public string getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup
     *
     * The group Id of tax types supported by Avalara. Refer to /api/v2/definitions/taxtypegroups for types we support.
     */
    public void setTaxTypeGroup(string value) {
        this.taxTypeGroup = value;
    }


    private string taxSubType;

    /**
     * Getter for taxSubType
     *
     * The Id of sub tax types supported by Avalara. Refer to /api/v2/definitions/taxsubtypes for types we support.
     */
    public string getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * The Id of sub tax types supported by Avalara. Refer to /api/v2/definitions/taxsubtypes for types we support.
     */
    public void setTaxSubType(string value) {
        this.taxSubType = value;
    }


    private Integer taxTypeMappingId;

    /**
     * Getter for taxTypeMappingId
     *
     * Id for TaxTypeMapping object
     */
    public Integer getTaxTypeMappingId() {
        return this.taxTypeMappingId;
    }

    /**
     * Setter for taxTypeMappingId
     *
     * Id for TaxTypeMapping object
     */
    public void setTaxTypeMappingId(Integer value) {
        this.taxTypeMappingId = value;
    }


    private Integer rateTypeTaxTypeMappingId;

    /**
     * Getter for rateTypeTaxTypeMappingId
     *
     * Id for RateTypeTaxTypeMapping object
     */
    public Integer getRateTypeTaxTypeMappingId() {
        return this.rateTypeTaxTypeMappingId;
    }

    /**
     * Setter for rateTypeTaxTypeMappingId
     *
     * Id for RateTypeTaxTypeMapping object
     */
    public void setRateTypeTaxTypeMappingId(Integer value) {
        this.rateTypeTaxTypeMappingId = value;
    }


    /**
     * Returns a JSON string representation of TaxRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
