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
 * Describes a single exemption override row for a custom tax.
* <br>
* This is the input variant used when creating or updating a custom tax. Each exemption row
* defines whether a matching transaction line is exempt from the custom tax, optionally
* scoped by jurisdiction, rate type, tax code, tariff code, or entity use code.
 */
public class CustomTaxExemptionsInputModel {


    private Boolean exempt;

    /**
     * Getter for exempt
     *
     * Whether this tax treatment sets an item as exempt or not exempt. When true, matching
    * lines are exempt from this custom tax; when false, an existing exemption is explicitly
    * overridden so the custom tax still applies.
     */
    public Boolean getExempt() {
        return this.exempt;
    }

    /**
     * Setter for exempt
     *
     * Whether this tax treatment sets an item as exempt or not exempt. When true, matching
    * lines are exempt from this custom tax; when false, an existing exemption is explicitly
    * overridden so the custom tax still applies.
     */
    public void setExempt(Boolean value) {
        this.exempt = value;
    }

    private JurisdictionType jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * Optionally set the type of jurisdiction this exemption applies to, e.g. State or City.
    * When combined with `jurisCode`, the exemption is scoped to the matching
    * jurisdiction only.
     */
    public JurisdictionType getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * Optionally set the type of jurisdiction this exemption applies to, e.g. State or City.
    * When combined with `jurisCode`, the exemption is scoped to the matching
    * jurisdiction only.
     */
    public void setJurisdictionTypeId(JurisdictionType value) {
        this.jurisdictionTypeId = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * Optionally set the specific jurisdiction this exemption applies to. This should be one
    * of the jurisdictions defined on the parent custom tax.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * Optionally set the specific jurisdiction this exemption applies to. This should be one
    * of the jurisdictions defined on the parent custom tax.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Optionally set a specific rate type this exemption applies to.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Optionally set a specific rate type this exemption applies to.
     */
    public void setRateTypeCode(String value) {
        this.rateTypeCode = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * Optionally set a specific tax code this exemption applies to. Tax codes identify
    * product or service categories for taxation.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * Optionally set a specific tax code this exemption applies to. Tax codes identify
    * product or service categories for taxation.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String tariffCode;

    /**
     * Getter for tariffCode
     *
     * Optionally set a specific tariff code this exemption applies to. Tariff codes are used
    * for cross-border and customs taxation.
     */
    public String getTariffCode() {
        return this.tariffCode;
    }

    /**
     * Setter for tariffCode
     *
     * Optionally set a specific tariff code this exemption applies to. Tariff codes are used
    * for cross-border and customs taxation.
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * Optionally set a specific entity use code this exemption applies to. Entity use codes
    * describe customer usage such as resale, manufacturing, or government use.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * Optionally set a specific entity use code this exemption applies to. Entity use codes
    * describe customer usage such as resale, manufacturing, or government use.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Optionally set a different effective date for this exemption. This date cannot be
    * earlier than the base effective date set for the entire custom tax.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Optionally set a different effective date for this exemption. This date cannot be
    * earlier than the base effective date set for the entire custom tax.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * Optionally set a different expiration date for this exemption. This date cannot be
    * later than the base expiration date set for the entire custom tax.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Optionally set a different expiration date for this exemption. This date cannot be
    * later than the base expiration date set for the entire custom tax.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean isAllJuris;

    /**
     * Getter for isAllJuris
     *
     * Whether this exemption applies to all child jurisdictions or only the specified one.
    * When true, the exemption is applied to every jurisdiction beneath the one identified by
    * `jurisCode`; when false or null, only the exact jurisdiction is matched.
     */
    public Boolean getIsAllJuris() {
        return this.isAllJuris;
    }

    /**
     * Setter for isAllJuris
     *
     * Whether this exemption applies to all child jurisdictions or only the specified one.
    * When true, the exemption is applied to every jurisdiction beneath the one identified by
    * `jurisCode`; when false or null, only the exact jurisdiction is matched.
     */
    public void setIsAllJuris(Boolean value) {
        this.isAllJuris = value;
    }

    /**
     * Returns a JSON string representation of CustomTaxExemptionsInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
