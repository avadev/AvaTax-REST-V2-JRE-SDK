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
 * Describes a single jurisdiction in which a custom tax is applicable.
* <br>
* This is the output variant returned by Custom Tax read endpoints. Each jurisdiction
* identifies a region of applicability for the parent custom tax.
 */
public class CustomTaxJurisdictionOutputModel {


    private JurisdictionType jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * The type of jurisdiction this is, e.g. State or City.
     */
    public JurisdictionType getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * The type of jurisdiction this is, e.g. State or City.
     */
    public void setJurisdictionTypeId(JurisdictionType value) {
        this.jurisdictionTypeId = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code identifying this jurisdiction, in combination with the `jurisdictionTypeId`.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code identifying this jurisdiction, in combination with the `jurisdictionTypeId`.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Optionally set a different effective date for this jurisdiction. This date cannot be earlier than the base
    * effective date set for the entire custom tax. When omitted, the jurisdiction inherits the custom tax's
    * effective date.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Optionally set a different effective date for this jurisdiction. This date cannot be earlier than the base
    * effective date set for the entire custom tax. When omitted, the jurisdiction inherits the custom tax's
    * effective date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * Optionally set a different expiration date for this jurisdiction. This date cannot be later than the base
    * expiration date set for the entire custom tax. When omitted, the jurisdiction inherits the custom tax's end
    * date.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Optionally set a different expiration date for this jurisdiction. This date cannot be later than the base
    * expiration date set for the entire custom tax. When omitted, the jurisdiction inherits the custom tax's end
    * date.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of CustomTaxJurisdictionOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
