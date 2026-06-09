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
 * A Custom Tax represents a tax-rate / taxability / exemption package owned by a single
* company. It is a type of Custom Rule that exposes a focused, content-oriented shape for
* callers who want to manage tax overrides without constructing a Custom Rule by hand.
* <br>
* Use of the Custom Tax endpoints requires the `AvaCustomContent` subscription.
* <br>
* This is the output variant returned by `GetCustomTax`, `ListCustomTaxes`, and
* write endpoints that echo the persisted record. It includes system-populated fields such
* as `id`, `companyId`, and the created/modified audit fields which are not
* accepted on input.
 */
public class CustomTaxOutputModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique identifier for this custom tax. Stable for the lifetime of the record and
    * shared with the broader Custom Rule namespace, so a Custom Tax id is never reused by
    * another Custom Rule on the same company.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for this custom tax. Stable for the lifetime of the record and
    * shared with the broader Custom Rule namespace, so a Custom Tax id is never reused by
    * another Custom Rule on the same company.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The company ID of the company that owns this custom tax. Returned on output so clients
    * can correlate the record with its parent company.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The company ID of the company that owns this custom tax. Returned on output so clients
    * can correlate the record with its parent company.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the custom tax. Displayed in UI surfaces and used to identify the custom
    * tax when reviewing rules for a company.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the custom tax. Displayed in UI surfaces and used to identify the custom
    * tax when reviewing rules for a company.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Optional description of the custom tax. Intended for use by compliance and support
    * teams to document the intent or source of the rule.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Optional description of the custom tax. Intended for use by compliance and support
    * teams to document the intent or source of the rule.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country in which the custom tax applies. This is typically an ISO 3166-1 alpha-2
    * country code such as `US` or `CA`.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country in which the custom tax applies. This is typically an ISO 3166-1 alpha-2
    * country code such as `US` or `CA`.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * The region or state in which the custom tax applies. The expected value depends on
    * `country`; for the United States this is typically the two-letter state
    * abbreviation such as `WA`.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The region or state in which the custom tax applies. The expected value depends on
    * `country`; for the United States this is typically the two-letter state
    * abbreviation such as `WA`.
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String taxTypeCode;

    /**
     * Getter for taxTypeCode
     *
     * The tax type for this custom tax.
     */
    public String getTaxTypeCode() {
        return this.taxTypeCode;
    }

    /**
     * Setter for taxTypeCode
     *
     * The tax type for this custom tax.
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * The tax subtype for this custom tax. Subtypes typically mirror the tax type but may be
    * customized to describe more granular categories.
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * The tax subtype for this custom tax. Subtypes typically mirror the tax type but may be
    * customized to describe more granular categories.
     */
    public void setTaxSubType(String value) {
        this.taxSubType = value;
    }

    private ArrayList<String> rateTypeCodes;

    /**
     * Getter for rateTypeCodes
     *
     * The rate types associated with this custom tax.
     */
    public ArrayList<String> getRateTypeCodes() {
        return this.rateTypeCodes;
    }

    /**
     * Setter for rateTypeCodes
     *
     * The rate types associated with this custom tax.
     */
    public void setRateTypeCodes(ArrayList<String> value) {
        this.rateTypeCodes = value;
    }

    private String unitOfBasis;

    /**
     * Getter for unitOfBasis
     *
     * The default unit of basis used to calculate the value of this custom tax. Determines
    * how the rate on each rate row is interpreted — for example, `PerCurrencyUnit` for
    * a percentage or `PerUnit` for a flat amount per unit.
     */
    public String getUnitOfBasis() {
        return this.unitOfBasis;
    }

    /**
     * Setter for unitOfBasis
     *
     * The default unit of basis used to calculate the value of this custom tax. Determines
    * how the rate on each rate row is interpreted — for example, `PerCurrencyUnit` for
    * a percentage or `PerUnit` for a flat amount per unit.
     */
    public void setUnitOfBasis(String value) {
        this.unitOfBasis = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The start date when the tax is valid. Transactions with a document date earlier than
    * this date will not be affected by this custom tax.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The start date when the tax is valid. Transactions with a document date earlier than
    * this date will not be affected by this custom tax.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date when the tax is valid. Transactions with a document date later than this
    * date will not be affected by this custom tax.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date when the tax is valid. Transactions with a document date later than this
    * date will not be affected by this custom tax.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean enabled;

    /**
     * Getter for enabled
     *
     * Whether the custom tax is enabled. When false, the tax is persisted but is not
    * evaluated during tax calculation.
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for enabled
     *
     * Whether the custom tax is enabled. When false, the tax is persisted but is not
    * evaluated during tax calculation.
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    private Boolean continueOnError;

    /**
     * Getter for continueOnError
     *
     * Whether to continue execution if there is an error evaluating the rule criteria. When
    * true, an error in this custom tax does not stop evaluation of other custom taxes or
    * custom rules on the transaction.
     */
    public Boolean getContinueOnError() {
        return this.continueOnError;
    }

    /**
     * Setter for continueOnError
     *
     * Whether to continue execution if there is an error evaluating the rule criteria. When
    * true, an error in this custom tax does not stop evaluation of other custom taxes or
    * custom rules on the transaction.
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    private ArrayList<CustomTaxJurisdictionOutputModel> jurisdictions;

    /**
     * Getter for jurisdictions
     *
     * A list of jurisdictions in which this custom tax applies. At least one jurisdiction is
    * required; each jurisdiction identifies a region of applicability for the tax.
     */
    public ArrayList<CustomTaxJurisdictionOutputModel> getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions
     *
     * A list of jurisdictions in which this custom tax applies. At least one jurisdiction is
    * required; each jurisdiction identifies a region of applicability for the tax.
     */
    public void setJurisdictions(ArrayList<CustomTaxJurisdictionOutputModel> value) {
        this.jurisdictions = value;
    }

    private CustomTaxAdditionalCriteriaOutputModel conditions;

    /**
     * Getter for conditions
     *
     * 
     */
    public CustomTaxAdditionalCriteriaOutputModel getConditions() {
        return this.conditions;
    }

    /**
     * Setter for conditions
     *
     * 
     */
    public void setConditions(CustomTaxAdditionalCriteriaOutputModel value) {
        this.conditions = value;
    }

    private ArrayList<CustomTaxTaxabilityOutputModel> taxability;

    /**
     * Getter for taxability
     *
     * Define the taxability treatment and rate type assignment for this custom tax. Taxability
    * rows express default and override behaviour for items the tax applies to.
     */
    public ArrayList<CustomTaxTaxabilityOutputModel> getTaxability() {
        return this.taxability;
    }

    /**
     * Setter for taxability
     *
     * Define the taxability treatment and rate type assignment for this custom tax. Taxability
    * rows express default and override behaviour for items the tax applies to.
     */
    public void setTaxability(ArrayList<CustomTaxTaxabilityOutputModel> value) {
        this.taxability = value;
    }

    private ArrayList<CustomTaxRateOutputModel> rates;

    /**
     * Getter for rates
     *
     * Define the tax rates associated with this custom tax. Each rate row specifies the
    * numeric rate and the criteria under which that rate applies.
     */
    public ArrayList<CustomTaxRateOutputModel> getRates() {
        return this.rates;
    }

    /**
     * Setter for rates
     *
     * Define the tax rates associated with this custom tax. Each rate row specifies the
    * numeric rate and the criteria under which that rate applies.
     */
    public void setRates(ArrayList<CustomTaxRateOutputModel> value) {
        this.rates = value;
    }

    private ArrayList<CustomTaxExemptionsOutputModel> exemptions;

    /**
     * Getter for exemptions
     *
     * Optional list of when items are exempt from this custom tax. Each exemption row defines
    * criteria that mark matching transaction lines as exempt (or explicitly not exempt).
     */
    public ArrayList<CustomTaxExemptionsOutputModel> getExemptions() {
        return this.exemptions;
    }

    /**
     * Setter for exemptions
     *
     * Optional list of when items are exempt from this custom tax. Each exemption row defines
    * criteria that mark matching transaction lines as exempt (or explicitly not exempt).
     */
    public void setExemptions(ArrayList<CustomTaxExemptionsOutputModel> value) {
        this.exemptions = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when the custom tax was created. Populated automatically when the record is
    * persisted.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when the custom tax was created. Populated automatically when the record is
    * persisted.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user who created the custom tax. Populated automatically from the calling user's
    * identity at creation time.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user who created the custom tax. Populated automatically from the calling user's
    * identity at creation time.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when the custom tax was last modified. Populated automatically whenever the
    * record is updated.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when the custom tax was last modified. Populated automatically whenever the
    * record is updated.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user who last modified the custom tax. Populated automatically from the calling
    * user's identity when the record is updated.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user who last modified the custom tax. Populated automatically from the calling
    * user's identity when the record is updated.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of CustomTaxOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
