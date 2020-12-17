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
 * Options for expiring a filing calendar.
 */
public class CycleSafeEditRequestModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company Identifier
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company Identifier
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String taxFormCode;

    /**
     * Getter for taxFormCode
     *
     * Tax Form Code
     */
    public String getTaxFormCode() {
        return this.taxFormCode;
    }

    /**
     * Setter for taxFormCode
     *
     * Tax Form Code
     */
    public void setTaxFormCode(String value) {
        this.taxFormCode = value;
    }

    private Long filingCalendarId;

    /**
     * Getter for filingCalendarId
     *
     * Filing Calendar Identifier
     */
    public Long getFilingCalendarId() {
        return this.filingCalendarId;
    }

    /**
     * Setter for filingCalendarId
     *
     * Filing Calendar Identifier
     */
    public void setFilingCalendarId(Long value) {
        this.filingCalendarId = value;
    }

    private ArrayList<CycleSafeFilingCalendarEditModel> edits;

    /**
     * Getter for edits
     *
     * Filing calendar edits
     */
    public ArrayList<CycleSafeFilingCalendarEditModel> getEdits() {
        return this.edits;
    }

    /**
     * Setter for edits
     *
     * Filing calendar edits
     */
    public void setEdits(ArrayList<CycleSafeFilingCalendarEditModel> value) {
        this.edits = value;
    }

    /**
     * Returns a JSON string representation of CycleSafeEditRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
