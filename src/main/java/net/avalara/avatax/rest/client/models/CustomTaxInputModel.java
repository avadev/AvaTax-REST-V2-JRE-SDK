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
 * A Custom Tax defines company-specific tax content - the jurisdictions where a tax applies together with its
* rates, taxability, and exemptions. It provides a focused, content-oriented way to author and manage tax
* overrides for a company.
* <br>
* Use of the Custom Tax endpoints requires the `AvaCustomContent` subscription.
 */
public class CustomTaxInputModel {


    private String name;

    /**
     * Getter for name
     *
     * The name of the custom tax.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the custom tax.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Optional description of the custom tax. Intended for use by compliance and support
    * teams to document intent or source.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Optional description of the custom tax. Intended for use by compliance and support
    * teams to document intent or source.
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
     * The tax type of the custom tax.
     */
    public String getTaxTypeCode() {
        return this.taxTypeCode;
    }

    /**
     * Setter for taxTypeCode
     *
     * The tax type of the custom tax.
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * The tax subtype for this custom tax, which describes a more granular
    * tax category within the main type.
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * The tax subtype for this custom tax, which describes a more granular
    * tax category within the main type.
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
    * how the rate on each rate row is interpreted - for example, `PerCurrencyUnit` for
    * a percentage or `PerUnit` for a flat amount per unit.
     */
    public String getUnitOfBasis() {
        return this.unitOfBasis;
    }

    /**
     * Setter for unitOfBasis
     *
     * The default unit of basis used to calculate the value of this custom tax. Determines
    * how the rate on each rate row is interpreted - for example, `PerCurrencyUnit` for
    * a percentage or `PerUnit` for a flat amount per unit.
     */
    public void setUnitOfBasis(String value) {
        this.unitOfBasis = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date when the tax is valid. Transactions with a document date earlier than
    * this date will not be affected by this custom tax.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The first date when the tax is valid. Transactions with a document date earlier than
    * this date will not be affected by this custom tax.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date when the tax is valid. Transactions with a document date later than this
    * date will not be affected by this custom tax.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date when the tax is valid. Transactions with a document date later than this
    * date will not be affected by this custom tax.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean enabled;

    /**
     * Getter for enabled
     *
     * Whether the custom tax is enabled. When false, the tax will not be calculated.
    * Existing saved documents are not affected.
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for enabled
     *
     * Whether the custom tax is enabled. When false, the tax will not be calculated.
    * Existing saved documents are not affected.
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
    * custom rules on the transaction. When false, a failure will cause the entire transaction
    * to return an error.
     */
    public Boolean getContinueOnError() {
        return this.continueOnError;
    }

    /**
     * Setter for continueOnError
     *
     * Whether to continue execution if there is an error evaluating the rule criteria. When
    * true, an error in this custom tax does not stop evaluation of other custom taxes or
    * custom rules on the transaction. When false, a failure will cause the entire transaction
    * to return an error.
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    private ArrayList<CustomTaxJurisdictionInputModel> jurisdictions;

    /**
     * Getter for jurisdictions
     *
     * A list of jurisdictions in which this custom tax applies. At least one jurisdiction is
    * required; each jurisdiction identifies a place of applicability for the tax.
     */
    public ArrayList<CustomTaxJurisdictionInputModel> getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions
     *
     * A list of jurisdictions in which this custom tax applies. At least one jurisdiction is
    * required; each jurisdiction identifies a place of applicability for the tax.
     */
    public void setJurisdictions(ArrayList<CustomTaxJurisdictionInputModel> value) {
        this.jurisdictions = value;
    }

    private CustomTaxAdditionalCriteriaInputModel conditions;

    /**
     * Getter for conditions
     *
     * 
     */
    public CustomTaxAdditionalCriteriaInputModel getConditions() {
        return this.conditions;
    }

    /**
     * Setter for conditions
     *
     * 
     */
    public void setConditions(CustomTaxAdditionalCriteriaInputModel value) {
        this.conditions = value;
    }

    private ArrayList<CustomTaxTaxabilityInputModel> taxability;

    /**
     * Getter for taxability
     *
     * Define the taxability treatment and rate type assignment for this custom tax. Taxability
    * rows express default and override behaviour for items the tax applies to.
     */
    public ArrayList<CustomTaxTaxabilityInputModel> getTaxability() {
        return this.taxability;
    }

    /**
     * Setter for taxability
     *
     * Define the taxability treatment and rate type assignment for this custom tax. Taxability
    * rows express default and override behaviour for items the tax applies to.
     */
    public void setTaxability(ArrayList<CustomTaxTaxabilityInputModel> value) {
        this.taxability = value;
    }

    private ArrayList<CustomTaxRateInputModel> rates;

    /**
     * Getter for rates
     *
     * Define the tax rates associated with this custom tax. Each rate row specifies the
    * numeric rate and the criteria under which that rate applies.
     */
    public ArrayList<CustomTaxRateInputModel> getRates() {
        return this.rates;
    }

    /**
     * Setter for rates
     *
     * Define the tax rates associated with this custom tax. Each rate row specifies the
    * numeric rate and the criteria under which that rate applies.
     */
    public void setRates(ArrayList<CustomTaxRateInputModel> value) {
        this.rates = value;
    }

    private ArrayList<CustomTaxExemptionInputModel> exemptions;

    /**
     * Getter for exemptions
     *
     * Optional list of when items are exempt from this custom tax. Each exemption row defines
    * criteria that mark matching transaction lines as exempt (or explicitly not exempt).
     */
    public ArrayList<CustomTaxExemptionInputModel> getExemptions() {
        return this.exemptions;
    }

    /**
     * Setter for exemptions
     *
     * Optional list of when items are exempt from this custom tax. Each exemption row defines
    * criteria that mark matching transaction lines as exempt (or explicitly not exempt).
     */
    public void setExemptions(ArrayList<CustomTaxExemptionInputModel> value) {
        this.exemptions = value;
    }

    /**
     * Returns a JSON string representation of CustomTaxInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
