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
 * Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
 */
public class TaxRuleModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax rule.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax rule.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that owns this tax rule.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that owns this tax rule.
     */
    public void setCompanyId(Integer value) {
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


    private String taxCode;

    /**
     * Getter for taxCode
     *
     * The code string of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The code string of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }


    private String stateFIPS;

    /**
     * Getter for stateFIPS
     *
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public String getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS
     *
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public void setStateFIPS(String value) {
        this.stateFIPS = value;
    }


    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The name of the jurisdiction to which this tax rule applies.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The name of the jurisdiction to which this tax rule applies.
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }


    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code of the jurisdiction to which this tax rule applies.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code of the jurisdiction to which this tax rule applies.
     */
    public void setJurisCode(String value) {
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


    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * DEPRECATED - The type of customer usage to which this rule applies.
    * Please use entityUseCode instead.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * DEPRECATED - The type of customer usage to which this rule applies.
    * Please use entityUseCode instead.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }


    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The type of customer usage to which this rule applies.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The type of customer usage to which this rule applies.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
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


    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public void setRateTypeCode(String value) {
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


    private String options;

    /**
     * Getter for options
     *
     * Custom option flags for this rule.
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Custom option flags for this rule.
     */
    public void setOptions(String value) {
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


    private String description;

    /**
     * Getter for description
     *
     * A friendly name for this tax rule.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly name for this tax rule.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String countyFIPS;

    /**
     * Getter for countyFIPS
     *
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public String getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS
     *
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public void setCountyFIPS(String value) {
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


    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country where this rule will apply.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 code identifying the country where this rule will apply.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region where this rule will apply.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
    * NOTE: Region is required for US and not required for non-US countries because the user may be either creating a Country-level or Region-level rule.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the region where this rule will apply.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
    * NOTE: Region is required for US and not required for non-US countries because the user may be either creating a Country-level or Region-level rule.
     */
    public void setRegion(String value) {
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


    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * The group Id of tax types supported by Avalara. Refer to /api/v2/definitions/taxtypegroups for types we support.
     */
    public String getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup
     *
     * The group Id of tax types supported by Avalara. Refer to /api/v2/definitions/taxtypegroups for types we support.
     */
    public void setTaxTypeGroup(String value) {
        this.taxTypeGroup = value;
    }


    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * The Id of sub tax types supported by Avalara. Refer to /api/v2/definitions/taxsubtypes for types we support.
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * The Id of sub tax types supported by Avalara. Refer to /api/v2/definitions/taxsubtypes for types we support.
     */
    public void setTaxSubType(String value) {
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


    private String nonPassthroughExpression;

    /**
     * Getter for nonPassthroughExpression
     *
     * Indicates the expression to use to determine whether this tax rule generates a non-passthrough tax.
    * 
    * Non-passthrough taxes are taxes that cannot be charged to the customer.
     */
    public String getNonPassthroughExpression() {
        return this.nonPassthroughExpression;
    }

    /**
     * Setter for nonPassthroughExpression
     *
     * Indicates the expression to use to determine whether this tax rule generates a non-passthrough tax.
    * 
    * Non-passthrough taxes are taxes that cannot be charged to the customer.
     */
    public void setNonPassthroughExpression(String value) {
        this.nonPassthroughExpression = value;
    }


    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The currency code to use for this rule.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The currency code to use for this rule.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }


    private Integer preferredProgramId;

    /**
     * Getter for preferredProgramId
     *
     * For rules that only apply to one tax code program, this value indicates what program should be used for implementing this rule.
     */
    public Integer getPreferredProgramId() {
        return this.preferredProgramId;
    }

    /**
     * Setter for preferredProgramId
     *
     * For rules that only apply to one tax code program, this value indicates what program should be used for implementing this rule.
     */
    public void setPreferredProgramId(Integer value) {
        this.preferredProgramId = value;
    }


    private Integer uomId;

    /**
     * Getter for uomId
     *
     * For tax rules that are calculated using units of measurement, this indicates the unit of measurement type
    * used to calculate the amounts for this rule.
    * 
    * For a list of units of measurement, please call `ListUnitsOfMeasurement()`.
     */
    public Integer getUomId() {
        return this.uomId;
    }

    /**
     * Setter for uomId
     *
     * For tax rules that are calculated using units of measurement, this indicates the unit of measurement type
    * used to calculate the amounts for this rule.
    * 
    * For a list of units of measurement, please call `ListUnitsOfMeasurement()`.
     */
    public void setUomId(Integer value) {
        this.uomId = value;
    }


    /**
     * Returns a JSON string representation of TaxRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
