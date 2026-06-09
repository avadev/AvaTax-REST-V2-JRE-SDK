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
 * Describes a single taxability override row for a custom tax.
* <br>
* This is the output variant returned by Custom Tax read endpoints. Each taxability row
* defines whether an item is taxable or not, optionally scoped to a specific jurisdiction,
* tax code, tariff code, or entity use code.
 */
public class CustomTaxTaxabilityOutputModel {


    private Boolean taxable;

    /**
     * Getter for taxable
     *
     * Whether this tax treatment sets an item as taxable or not taxable. When true, items
    * matching the other criteria are taxable under this custom tax; when false, they are
    * explicitly marked as not taxable.
     */
    public Boolean getTaxable() {
        return this.taxable;
    }

    /**
     * Setter for taxable
     *
     * Whether this tax treatment sets an item as taxable or not taxable. When true, items
    * matching the other criteria are taxable under this custom tax; when false, they are
    * explicitly marked as not taxable.
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    private BigDecimal cap;

    /**
     * Getter for cap
     *
     * Optionally specify the maximum taxable amount. Any portion of the base above this cap
    * is not taxed under this taxability treatment.
     */
    public BigDecimal getCap() {
        return this.cap;
    }

    /**
     * Setter for cap
     *
     * Optionally specify the maximum taxable amount. Any portion of the base above this cap
    * is not taxed under this taxability treatment.
     */
    public void setCap(BigDecimal value) {
        this.cap = value;
    }

    private BigDecimal threshold;

    /**
     * Getter for threshold
     *
     * Optionally specify the per-unit threshold that must be met to apply this tax treatment.
    * If the line amount is below the threshold, this treatment does not apply.
     */
    public BigDecimal getThreshold() {
        return this.threshold;
    }

    /**
     * Setter for threshold
     *
     * Optionally specify the per-unit threshold that must be met to apply this tax treatment.
    * If the line amount is below the threshold, this treatment does not apply.
     */
    public void setThreshold(BigDecimal value) {
        this.threshold = value;
    }

    private JurisdictionType jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * Optionally set the type of jurisdiction this tax treatment applies to, e.g. State or
    * City. When combined with `jurisCode`, the taxability is scoped to the matching
    * jurisdiction only.
     */
    public JurisdictionType getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * Optionally set the type of jurisdiction this tax treatment applies to, e.g. State or
    * City. When combined with `jurisCode`, the taxability is scoped to the matching
    * jurisdiction only.
     */
    public void setJurisdictionTypeId(JurisdictionType value) {
        this.jurisdictionTypeId = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * Optionally set the specific jurisdiction this tax treatment applies to. This should be
    * one of the jurisdictions defined on the parent custom tax.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * Optionally set the specific jurisdiction this tax treatment applies to. This should be
    * one of the jurisdictions defined on the parent custom tax.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * The rate type to assign as part of this tax treatment.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * The rate type to assign as part of this tax treatment.
     */
    public void setRateTypeCode(String value) {
        this.rateTypeCode = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * Optionally set a specific tax code this tax treatment applies to. Tax codes identify
    * product or service categories for taxation.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * Optionally set a specific tax code this tax treatment applies to. Tax codes identify
    * product or service categories for taxation.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String tariffCode;

    /**
     * Getter for tariffCode
     *
     * Optionally set a specific tariff code this tax treatment applies to. Tariff codes are
    * used for cross-border and customs taxation.
     */
    public String getTariffCode() {
        return this.tariffCode;
    }

    /**
     * Setter for tariffCode
     *
     * Optionally set a specific tariff code this tax treatment applies to. Tariff codes are
    * used for cross-border and customs taxation.
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * Optionally set a specific entity use code this tax treatment applies to. Entity use
    * codes describe customer usage such as resale, manufacturing, or government use.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * Optionally set a specific entity use code this tax treatment applies to. Entity use
    * codes describe customer usage such as resale, manufacturing, or government use.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Optionally set a different effective date for this tax treatment. This date cannot be
    * earlier than the base effective date set for the entire custom tax.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Optionally set a different effective date for this tax treatment. This date cannot be
    * earlier than the base effective date set for the entire custom tax.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * Optionally set a different expiration date for this tax treatment. This date cannot be
    * later than the base expiration date set for the entire custom tax.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Optionally set a different expiration date for this tax treatment. This date cannot be
    * later than the base expiration date set for the entire custom tax.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * Optionally set the currency code to use for this tax treatment.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * Optionally set the currency code to use for this tax treatment.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Boolean isAllJuris;

    /**
     * Getter for isAllJuris
     *
     * Whether this tax treatment applies to all child jurisdictions or only the specified one.
    * When true, the treatment is applied to every jurisdiction beneath the one identified by
    * `jurisCode`; when false or null, only the exact jurisdiction is matched.
     */
    public Boolean getIsAllJuris() {
        return this.isAllJuris;
    }

    /**
     * Setter for isAllJuris
     *
     * Whether this tax treatment applies to all child jurisdictions or only the specified one.
    * When true, the treatment is applied to every jurisdiction beneath the one identified by
    * `jurisCode`; when false or null, only the exact jurisdiction is matched.
     */
    public void setIsAllJuris(Boolean value) {
        this.isAllJuris = value;
    }

    private String sourcing;

    /**
     * Getter for sourcing
     *
     * Optionally override the sourcing to Origin, Destination, or blank (default). Sourcing
    * controls which location of the transaction (origin or destination) is used to evaluate
    * this tax treatment.
     */
    public String getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * Optionally override the sourcing to Origin, Destination, or blank (default). Sourcing
    * controls which location of the transaction (origin or destination) is used to evaluate
    * this tax treatment.
     */
    public void setSourcing(String value) {
        this.sourcing = value;
    }

    private ArrayList<String> options;

    /**
     * Getter for options
     *
     * Optional advanced settings for this tax treatment. The allowed values depend on the
    * tax type and are documented separately.
     */
    public ArrayList<String> getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Optional advanced settings for this tax treatment. The allowed values depend on the
    * tax type and are documented separately.
     */
    public void setOptions(ArrayList<String> value) {
        this.options = value;
    }

    /**
     * Returns a JSON string representation of CustomTaxTaxabilityOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
