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
 * Swagger name: AvaTaxClient
 */

/**
 * Represents a tax rule that is generated or affected by a dynamic rule.
* This model mirrors structure of a standard tax rule with relevant fields.
 */
public class DynamicRuleGeneratedTaxRuleModel {


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

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
    *  
    * The `RateOverrideRule`, `BaseRule`, and `ExemptEntityRule` rule types can be applied to all tax codes. To
    * make a rule that applies to all tax codes, leave both fields blank.
    *  
    * The `ProductTaxabilityRule` rule must be associated with a tax code.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
    *  
    * The `RateOverrideRule`, `BaseRule`, and `ExemptEntityRule` rule types can be applied to all tax codes. To
    * make a rule that applies to all tax codes, leave both fields blank.
    *  
    * The `ProductTaxabilityRule` rule must be associated with a tax code.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String stateFIPS;

    /**
     * Getter for stateFIPS
     *
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
    *  
    * This field is required for rules that apply to specific jurisdictions in the United States. It is not required
    * if you set the `isAllJuris` flag to true.
     */
    public String getStateFIPS() {
        return this.stateFIPS;
    }

    /**
     * Setter for stateFIPS
     *
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
    *  
    * This field is required for rules that apply to specific jurisdictions in the United States. It is not required
    * if you set the `isAllJuris` flag to true.
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

    private JurisdictionType jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * The type of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions.
    *  
    * To make a custom tax rule for US or Canada that applies to all jurisdictions of a specific type, see the `isAllJuris`
    * field for more information.
     */
    public JurisdictionType getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * The type of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions.
    *  
    * To make a custom tax rule for US or Canada that applies to all jurisdictions of a specific type, see the `isAllJuris`
    * field for more information.
     */
    public void setJurisdictionTypeId(JurisdictionType value) {
        this.jurisdictionTypeId = value;
    }

    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * Some tax type groups contain multiple different types of tax. To create a rule that affects only one
    * type of tax within a tax type group, set this value to the code matching the specific tax type within
    * that group. The custom tax rule will then only apply to taxes calculated for that specific type.
    *  
    * For rules that affect all tax types, use the value `A` to match `All` tax types within that group.
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * Some tax type groups contain multiple different types of tax. To create a rule that affects only one
    * type of tax within a tax type group, set this value to the code matching the specific tax type within
    * that group. The custom tax rule will then only apply to taxes calculated for that specific type.
    *  
    * For rules that affect all tax types, use the value `A` to match `All` tax types within that group.
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private String taxTypeCode;

    /**
     * Getter for taxTypeCode
     *
     * Indicates the code of the tax type that applies to this rule.
     */
    public String getTaxTypeCode() {
        return this.taxTypeCode;
    }

    /**
     * Setter for taxTypeCode
     *
     * Indicates the code of the tax type that applies to this rule.
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    private String taxRuleTypeId;

    /**
     * Getter for taxRuleTypeId
     *
     * This type value determines the behavior of the tax rule.
     */
    public String getTaxRuleTypeId() {
        return this.taxRuleTypeId;
    }

    /**
     * Setter for taxRuleTypeId
     *
     * This type value determines the behavior of the tax rule.
     */
    public void setTaxRuleTypeId(String value) {
        this.taxRuleTypeId = value;
    }

    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule.
    *  
    * If you specify a value in the rateTypeCode field, this rule will cause tax lines that are affected by the rule
    * to change to a different rate type code.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule.
    *  
    * If you specify a value in the rateTypeCode field, this rule will cause tax lines that are affected by the rule
    * to change to a different rate type code.
     */
    public void setRateTypeCode(String value) {
        this.rateTypeCode = value;
    }

    private Boolean isAllJuris;

    /**
     * Getter for isAllJuris
     *
     * Allows you to make tax rules apply to lower jurisdictions. This feature is only available in the United States and Canada.
    *  
    * * In the United States, this value can be used for rules written at the `State` jurisdictional level. If set to `true`, this rule will at the state level, county level, city level, and special jurisdiction level.
    * * In Canada, this value can be used for rules written at the `Country` or `State` jurisdictional levels. If set to `true`, this rule will at all lower jurisdictional levels.
    *  
    * For any other use case, this value must be `false`.
     */
    public Boolean getIsAllJuris() {
        return this.isAllJuris;
    }

    /**
     * Setter for isAllJuris
     *
     * Allows you to make tax rules apply to lower jurisdictions. This feature is only available in the United States and Canada.
    *  
    * * In the United States, this value can be used for rules written at the `State` jurisdictional level. If set to `true`, this rule will at the state level, county level, city level, and special jurisdiction level.
    * * In Canada, this value can be used for rules written at the `Country` or `State` jurisdictional levels. If set to `true`, this rule will at all lower jurisdictional levels.
    *  
    * For any other use case, this value must be `false`.
     */
    public void setIsAllJuris(Boolean value) {
        this.isAllJuris = value;
    }

    private BigDecimal value;

    /**
     * Getter for value
     *
     * This field has different behavior based on the type of the tax rule.
    *  
    * * For a product taxability rule, this value is either 1 or 0, indicating taxable or non-taxable.
    * * For a rate override rule, this value is the corrected rate stored as a decimal, for example, a rate of 5% would be stored as 0.05 decimal. If you use the special value of 1.0, only the cap and threshold values will be applied and the rate will be left alone.
     */
    public BigDecimal getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * This field has different behavior based on the type of the tax rule.
    *  
    * * For a product taxability rule, this value is either 1 or 0, indicating taxable or non-taxable.
    * * For a rate override rule, this value is the corrected rate stored as a decimal, for example, a rate of 5% would be stored as 0.05 decimal. If you use the special value of 1.0, only the cap and threshold values will be applied and the rate will be left alone.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    private BigDecimal cap;

    /**
     * Getter for cap
     *
     * The maximum cap for the price of this item according to this rule. Any amount above this cap will not be subject to this rule.
    *  
    * For example, if you must pay 5% of a product's value up to a maximum value of $1000, you would set the `cap` to `1000.00` and the `value` to `0.05`.
     */
    public BigDecimal getCap() {
        return this.cap;
    }

    /**
     * Setter for cap
     *
     * The maximum cap for the price of this item according to this rule. Any amount above this cap will not be subject to this rule.
    *  
    * For example, if you must pay 5% of a product's value up to a maximum value of $1000, you would set the `cap` to `1000.00` and the `value` to `0.05`.
     */
    public void setCap(BigDecimal value) {
        this.cap = value;
    }

    private BigDecimal threshold;

    /**
     * Getter for threshold
     *
     * The per-unit threshold that must be met before this rule applies.
    *  
    * For example, if your product is nontaxable unless it is above $100 per product, you would set the `threshold` value to `100`. In this case, the rate
    * for the rule would apply to the entire amount above $100.
    *  
    * You can also create rules that make the entire product taxable if it exceeds a threshold, but is nontaxable
    * if it is below the threshold. To choose this, set the `options` field to the value `TaxAll`.
     */
    public BigDecimal getThreshold() {
        return this.threshold;
    }

    /**
     * Setter for threshold
     *
     * The per-unit threshold that must be met before this rule applies.
    *  
    * For example, if your product is nontaxable unless it is above $100 per product, you would set the `threshold` value to `100`. In this case, the rate
    * for the rule would apply to the entire amount above $100.
    *  
    * You can also create rules that make the entire product taxable if it exceeds a threshold, but is nontaxable
    * if it is below the threshold. To choose this, set the `options` field to the value `TaxAll`.
     */
    public void setThreshold(BigDecimal value) {
        this.threshold = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date at which this rule applies. If `null`, this rule will apply to all dates prior to the end date.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The first date at which this rule applies. If `null`, this rule will apply to all dates prior to the end date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date for which this rule applies. If `null`, this rule will apply to all dates after the effective date.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date for which this rule applies. If `null`, this rule will apply to all dates after the effective date.
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

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The entity use code to which this rule applies.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The entity use code to which this rule applies.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private String sourcing;

    /**
     * Getter for sourcing
     *
     * The sourcing types to which this rule applies.
     */
    public String getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * The sourcing types to which this rule applies.
     */
    public void setSourcing(String value) {
        this.sourcing = value;
    }

    private String countyFIPS;

    /**
     * Getter for countyFIPS
     *
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
    *  
    * This field is required for rules that apply to specific jurisdictions in the United States. It is not required
    * if you set the `isAllJuris` flag to true.
     */
    public String getCountyFIPS() {
        return this.countyFIPS;
    }

    /**
     * Setter for countyFIPS
     *
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
    *  
    * This field is required for rules that apply to specific jurisdictions in the United States. It is not required
    * if you set the `isAllJuris` flag to true.
     */
    public void setCountyFIPS(String value) {
        this.countyFIPS = value;
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
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * This field has different behavior based on the type of rule.
    *  
    * * For a product taxability rule, if the rule applies to an item, this value will override the tax type group of the original product.
    * * For other rules, this value determines what tax type groups will be affected by the rule.
     */
    public String getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup
     *
     * This field has different behavior based on the type of rule.
    *  
    * * For a product taxability rule, if the rule applies to an item, this value will override the tax type group of the original product.
    * * For other rules, this value determines what tax type groups will be affected by the rule.
     */
    public void setTaxTypeGroup(String value) {
        this.taxTypeGroup = value;
    }

    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * This field has different behavior based on the type of rule.
    *  
    * * For a product taxability rule, if the rule applies to an item, this value will override the tax sub type of the original product.
    * * For other rules, this value determines what tax sub types will be affected by the rule.
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * This field has different behavior based on the type of rule.
    *  
    * * For a product taxability rule, if the rule applies to an item, this value will override the tax sub type of the original product.
    * * For other rules, this value determines what tax sub types will be affected by the rule.
     */
    public void setTaxSubType(String value) {
        this.taxSubType = value;
    }

    private String options;

    /**
     * Getter for options
     *
     * Supports custom options for your tax rule.
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Supports custom options for your tax rule.
     */
    public void setOptions(String value) {
        this.options = value;
    }

    private String tariffCode;

    /**
     * Getter for tariffCode
     *
     * The tariff code (HS Code) associated with this tax rule.
    * On the TaxRuleModel, this must be converted to TaxRuleProductDetailModel.
     */
    public String getTariffCode() {
        return this.tariffCode;
    }

    /**
     * Setter for tariffCode
     *
     * The tariff code (HS Code) associated with this tax rule.
    * On the TaxRuleModel, this must be converted to TaxRuleProductDetailModel.
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleGeneratedTaxRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
