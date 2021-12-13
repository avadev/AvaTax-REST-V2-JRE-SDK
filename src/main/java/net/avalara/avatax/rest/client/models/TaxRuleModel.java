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
 * Represents a tax rule that changes the behavior of Avalara's tax engine for certain products and/or entity use codes
* in certain jurisdictions.
*  
* Avalara supports a few different types of tax rules. For information about tax rule types, see
* [TaxRuleTypeId](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/TaxRuleTypeId/)
*  
* Because different types of tax rules have different behavior, some fields may change their behavior based on
* the type of tax rule selected. Please read the documentation for each field carefully and ensure that
* the value you send is appropriate for the type of tax rule.
 */
public class TaxRuleModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax rule.
	 * 
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
	 * 
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
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
    *  
    * You can choose to specify a tax code either by passing its unique ID number in the `taxCodeId` field or
    * by passing its alphanumeric code in the `taxCode` field. To search for the appropriate tax code for your
    * custom rule, use the `ListTaxCodes` API.
    *  
    * The `RateOverrideRule`, `BaseRule`, and `ExemptEntityRule` rule types can be applied to all tax codes. To
    * make a rule that applies to all tax codes, leave both fields blank.
    *  
    * The `ProductTaxabilityRule` rule must be associated with a tax code. If you attempt to create a product taxability rule
    * without a tax code, you will get an error message.
	 * 
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
    *  
    * You can choose to specify a tax code either by passing its unique ID number in the `taxCodeId` field or
    * by passing its alphanumeric code in the `taxCode` field. To search for the appropriate tax code for your
    * custom rule, use the `ListTaxCodes` API.
    *  
    * The `RateOverrideRule`, `BaseRule`, and `ExemptEntityRule` rule types can be applied to all tax codes. To
    * make a rule that applies to all tax codes, leave both fields blank.
    *  
    * The `ProductTaxabilityRule` rule must be associated with a tax code. If you attempt to create a product taxability rule
    * without a tax code, you will get an error message.
     */
    public void setTaxCodeId(Integer value) {
        this.taxCodeId = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
    *  
    * You can choose to specify a tax code either by passing its unique ID number in the `taxCodeId` field or
    * by passing its alphanumeric code in the `taxCode` field. To search for the appropriate tax code for your
    * custom rule, use the `ListTaxCodes` API.
    *  
    * The `RateOverrideRule`, `BaseRule`, and `ExemptEntityRule` rule types can be applied to all tax codes. To
    * make a rule that applies to all tax codes, leave both fields blank.
    *  
    * The `ProductTaxabilityRule` rule must be associated with a tax code. If you attempt to create a product taxability rule
    * without a tax code, you will get an error message.
	 * 
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
    *  
    * You can choose to specify a tax code either by passing its unique ID number in the `taxCodeId` field or
    * by passing its alphanumeric code in the `taxCode` field. To search for the appropriate tax code for your
    * custom rule, use the `ListTaxCodes` API.
    *  
    * The `RateOverrideRule`, `BaseRule`, and `ExemptEntityRule` rule types can be applied to all tax codes. To
    * make a rule that applies to all tax codes, leave both fields blank.
    *  
    * The `ProductTaxabilityRule` rule must be associated with a tax code. If you attempt to create a product taxability rule
    * without a tax code, you will get an error message.
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
	 * 
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
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions. To select a jurisdiction, use the
    * [ListJurisdictions API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictions/)
    * or the [ListJurisdictionsByAddress API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictionsByAddress/).
    * To set a rule that applies to all jurisdictions of a specific type, see `isAllJuris`.
    *  
    * Once you have determined which jurisdiction you wish to assign to the tax rule, you should fill in the `jurisName`, `jurisCode`, and
    * `jurisdictionTypeId` fields using the information you retrieved from the API above.
	 * 
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The name of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions. To select a jurisdiction, use the
    * [ListJurisdictions API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictions/)
    * or the [ListJurisdictionsByAddress API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictionsByAddress/).
    * To set a rule that applies to all jurisdictions of a specific type, see `isAllJuris`.
    *  
    * Once you have determined which jurisdiction you wish to assign to the tax rule, you should fill in the `jurisName`, `jurisCode`, and
    * `jurisdictionTypeId` fields using the information you retrieved from the API above.
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions. To select a jurisdiction, use the
    * [ListJurisdictions API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictions/)
    * or the [ListJurisdictionsByAddress API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictionsByAddress/).
    *  
    * Once you have determined which jurisdiction you wish to assign to the tax rule, you should fill in the `jurisName`, `jurisCode`, and
    * `jurisdictionTypeId` fields using the information you retrieved from the API above.
	 * 
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions. To select a jurisdiction, use the
    * [ListJurisdictions API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictions/)
    * or the [ListJurisdictionsByAddress API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictionsByAddress/).
    *  
    * Once you have determined which jurisdiction you wish to assign to the tax rule, you should fill in the `jurisName`, `jurisCode`, and
    * `jurisdictionTypeId` fields using the information you retrieved from the API above.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Please use `jurisdictionTypeId` instead.
	 * 
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Please use `jurisdictionTypeId` instead.
     */
    public void setJurisTypeId(JurisTypeId value) {
        this.jurisTypeId = value;
    }

    private JurisdictionType jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * The type of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions. To select a jurisdiction, use the
    * [ListJurisdictions API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictions/)
    * or the [ListJurisdictionsByAddress API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictionsByAddress/).
    *  
    * Once you have determined which jurisdiction you wish to assign to the tax rule, you should fill in the `jurisName`, `jurisCode`, and
    * `jurisdictionTypeId` fields using the information you retrieved from the API above.
    *  
    * To make a custom tax rule for US or Canada that applies to all jurisdictions of a specific type, see the `isAllJuris`
    * field for more information.
	 * 
     */
    public JurisdictionType getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * The type of the jurisdiction to which this tax rule applies.
    *  
    * Custom tax rules can apply to a specific jurisdiction or to all jurisdictions. To select a jurisdiction, use the
    * [ListJurisdictions API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictions/)
    * or the [ListJurisdictionsByAddress API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListJurisdictionsByAddress/).
    *  
    * Once you have determined which jurisdiction you wish to assign to the tax rule, you should fill in the `jurisName`, `jurisCode`, and
    * `jurisdictionTypeId` fields using the information you retrieved from the API above.
    *  
    * To make a custom tax rule for US or Canada that applies to all jurisdictions of a specific type, see the `isAllJuris`
    * field for more information.
     */
    public void setJurisdictionTypeId(JurisdictionType value) {
        this.jurisdictionTypeId = value;
    }

    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * DEPRECATED - Date: 10/16/2017, Version: 17.11, Message: Please use `entityUseCode` instead.
	 * 
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * DEPRECATED - Date: 10/16/2017, Version: 17.11, Message: Please use `entityUseCode` instead.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The entity use code to which this rule applies.
    *  
    * You can create custom `entityUseCode` values with specific behavior using this API, or you can change
    * the behavior of Avalara's system-defined entity use codes.
    *  
    * For a full list of Avalara-defined entity use codes, see the [ListEntityUseCodes API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListEntityUseCodes/).
	 * 
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The entity use code to which this rule applies.
    *  
    * You can create custom `entityUseCode` values with specific behavior using this API, or you can change
    * the behavior of Avalara's system-defined entity use codes.
    *  
    * For a full list of Avalara-defined entity use codes, see the [ListEntityUseCodes API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListEntityUseCodes/).
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * DEPRECATED - Date: 09/30/2021, Version: 21.9.0, Message: Please use `taxTypeCode` instead.
    * Some tax type groups contain multiple different types of tax. To create a rule that affects only one
    * type of tax within a tax type group, set this value to the code matching the specific tax type within
    * that group. The custom tax rule will then only apply to taxes calculated for that specific type.
    *  
    * For rules that affect all tax types, use the value `A` to match `All` tax types within that group.
	 * 
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * DEPRECATED - Date: 09/30/2021, Version: 21.9.0, Message: Please use `taxTypeCode` instead.
    * Some tax type groups contain multiple different types of tax. To create a rule that affects only one
    * type of tax within a tax type group, set this value to the code matching the specific tax type within
    * that group. The custom tax rule will then only apply to taxes calculated for that specific type.
    *  
    * For rules that affect all tax types, use the value `A` to match `All` tax types within that group.
     */
    public void setTaxTypeId(MatchingTaxType value) {
        this.taxTypeId = value;
    }

    private String taxTypeCode;

    /**
     * Getter for taxTypeCode
     *
     * Indicates the code of the tax type that applies to this rule. Use /api/v2/definitions/taxtypes endpoint to retrieve the list of tax types applicable for your company.
	 * 
     */
    public String getTaxTypeCode() {
        return this.taxTypeCode;
    }

    /**
     * Setter for taxTypeCode
     *
     * Indicates the code of the tax type that applies to this rule. Use /api/v2/definitions/taxtypes endpoint to retrieve the list of tax types applicable for your company.
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    private ArrayList<TaxRuleProductDetailModel> taxRuleProductDetail;

    /**
     * Getter for taxRuleProductDetail
     *
     * TaxRule Product Detail indicates the HSCode(s) to which the tax rule applies.
	 * 
     */
    public ArrayList<TaxRuleProductDetailModel> getTaxRuleProductDetail() {
        return this.taxRuleProductDetail;
    }

    /**
     * Setter for taxRuleProductDetail
     *
     * TaxRule Product Detail indicates the HSCode(s) to which the tax rule applies.
     */
    public void setTaxRuleProductDetail(ArrayList<TaxRuleProductDetailModel> value) {
        this.taxRuleProductDetail = value;
    }

    private RateType rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * DEPRECATED - Date: 8/27/2018, Version: 18.9, Message: Please use `rateTypeCode`, `taxTypeGroup` and `subTaxType` instead.
	 * 
     */
    public RateType getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * DEPRECATED - Date: 8/27/2018, Version: 18.9, Message: Please use `rateTypeCode`, `taxTypeGroup` and `subTaxType` instead.
     */
    public void setRateTypeId(RateType value) {
        this.rateTypeId = value;
    }

    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule. Use [ListRateTypesByCountry](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListRateTypesByCountry/) API for a full list of rate type codes.
    *  
    * If you specify a value in the rateTypeCode field, this rule will cause tax lines that are affected by the rule
    * to change to a different rate type code.
	 * 
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Indicates the code of the rate type that applies to this rule. Use [ListRateTypesByCountry](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListRateTypesByCountry/) API for a full list of rate type codes.
    *  
    * If you specify a value in the rateTypeCode field, this rule will cause tax lines that are affected by the rule
    * to change to a different rate type code.
     */
    public void setRateTypeCode(String value) {
        this.rateTypeCode = value;
    }

    private TaxRuleTypeId taxRuleTypeId;

    /**
     * Getter for taxRuleTypeId
     *
     * This type value determines the behavior of the tax rule.
    *  
    * You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate
    * (for example, if you have been granted an official ruling for your product's rate that differs from the official rate),
    * or other types of behavior.
	 * 
     */
    public TaxRuleTypeId getTaxRuleTypeId() {
        return this.taxRuleTypeId;
    }

    /**
     * Setter for taxRuleTypeId
     *
     * This type value determines the behavior of the tax rule.
    *  
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
     * Allows you to make tax rules apply to lower jurisdictions. This feature is only available in the United States and Canada.
    *  
    * * In the United States, this value can be used for rules written at the `State` jurisdictional level. If set to `true`, this rule will at the state level, county level, city level, and special jurisdiction level.
    * * In Canada, this value can be used for rules written at the `Country` or `State` jurisdictional levels. If set to `true`, this rule will at all lower jurisdictional levels.
    *  
    * For any other use case, this value must be `false`.
	 * 
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
	 * 
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
	 * 
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
	 * 
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

    private String options;

    /**
     * Getter for options
     *
     * Supports custom options for your tax rule.
    *  
    * Supported options include:
    * * `TaxAll` - This value indicates that the entire amount of the line becomes taxable when the line amount exceeds the `threshold`.
	 * 
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Supports custom options for your tax rule.
    *  
    * Supported options include:
    * * `TaxAll` - This value indicates that the entire amount of the line becomes taxable when the line amount exceeds the `threshold`.
     */
    public void setOptions(String value) {
        this.options = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date at which this rule applies. If `null`, this rule will apply to all dates prior to the end date.
	 * 
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
	 * 
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
	 * 
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
    *  
    * This field is required for rules that apply to specific jurisdictions in the United States. It is not required
    * if you set the `isAllJuris` flag to true.
	 * 
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

    private Boolean isSTPro;

    /**
     * Getter for isSTPro
     *
     * DEPRECATED - Date: 8/27/2018, Version: 18.9, Message: This field is no longer required.
	 * 
     */
    public Boolean getIsSTPro() {
        return this.isSTPro;
    }

    /**
     * Setter for isSTPro
     *
     * DEPRECATED - Date: 8/27/2018, Version: 18.9, Message: This field is no longer required.
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
	 * 
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
	 * 
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
	 * 
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

    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * This field has different behavior based on the type of rule.
    *  
    * * For a product taxability rule, if the rule applies to an item, this value will override the tax type group of the original product.
    * * For other rules, this value determines what tax type groups will be affected by the rule.
    *  
    * Refer to `ListTaxTypeGroups` for a list of tax type groups supported by AvaTax.
	 * 
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
    *  
    * Refer to `ListTaxTypeGroups` for a list of tax type groups supported by AvaTax.
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
    *  
    * Refer to `ListTaxSubtypes` for a list of tax sub types supported by AvaTax.
	 * 
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
    *  
    * Refer to `ListTaxSubtypes` for a list of tax sub types supported by AvaTax.
     */
    public void setTaxSubType(String value) {
        this.taxSubType = value;
    }

    private String nonPassthroughExpression;

    /**
     * Getter for nonPassthroughExpression
     *
     * Reserved for Avalara internal usage. Leave this field null.
	 * 
     */
    public String getNonPassthroughExpression() {
        return this.nonPassthroughExpression;
    }

    /**
     * Setter for nonPassthroughExpression
     *
     * Reserved for Avalara internal usage. Leave this field null.
     */
    public void setNonPassthroughExpression(String value) {
        this.nonPassthroughExpression = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The currency code to use for this rule.
    *  
    * For a list of currencies supported by AvaTax, use the [ListCurrencies API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListCurrencies/).
	 * 
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The currency code to use for this rule.
    *  
    * For a list of currencies supported by AvaTax, use the [ListCurrencies API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListCurrencies/).
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Integer preferredProgramId;

    /**
     * Getter for preferredProgramId
     *
     * Reserved for Avalara internal usage. Leave this field null.
	 * 
     */
    public Integer getPreferredProgramId() {
        return this.preferredProgramId;
    }

    /**
     * Setter for preferredProgramId
     *
     * Reserved for Avalara internal usage. Leave this field null.
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
    * For a list of units of measurement, use the [ListUnitsOfMeasurement API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListUnitOfMeasurement/).
	 * 
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
    * For a list of units of measurement, use the [ListUnitsOfMeasurement API](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListUnitOfMeasurement/).
     */
    public void setUomId(Integer value) {
        this.uomId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
	 * 
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
	 * 
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
	 * 
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
	 * 
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

    private String unitOfBasis;

    /**
     * Getter for unitOfBasis
     *
     * The UnitOfBasis for the TaxRule
	 * 
     */
    public String getUnitOfBasis() {
        return this.unitOfBasis;
    }

    /**
     * Setter for unitOfBasis
     *
     * The UnitOfBasis for the TaxRule
     */
    public void setUnitOfBasis(String value) {
        this.unitOfBasis = value;
    }

    /**
     * Returns a JSON string representation of TaxRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
