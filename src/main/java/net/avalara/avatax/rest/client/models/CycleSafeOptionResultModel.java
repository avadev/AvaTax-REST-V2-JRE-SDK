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
 * CycleSafe Option Result
 */
public class CycleSafeOptionResultModel {


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

    private Boolean mustCloneFilingCalendar;

    /**
     * Getter for mustCloneFilingCalendar
     *
     * Boolean if the Filing Calendar must be cloned
     */
    public Boolean getMustCloneFilingCalendar() {
        return this.mustCloneFilingCalendar;
    }

    /**
     * Setter for mustCloneFilingCalendar
     *
     * Boolean if the Filing Calendar must be cloned
     */
    public void setMustCloneFilingCalendar(Boolean value) {
        this.mustCloneFilingCalendar = value;
    }

    private Date clonedCalendarEffDate;

    /**
     * Getter for clonedCalendarEffDate
     *
     * Cloned Calendar Effective Date
     */
    public Date getClonedCalendarEffDate() {
        return this.clonedCalendarEffDate;
    }

    /**
     * Setter for clonedCalendarEffDate
     *
     * Cloned Calendar Effective Date
     */
    public void setClonedCalendarEffDate(Date value) {
        this.clonedCalendarEffDate = value;
    }

    private Date expiredCalendarEndDate;

    /**
     * Getter for expiredCalendarEndDate
     *
     * Expired Calendar End Date
     */
    public Date getExpiredCalendarEndDate() {
        return this.expiredCalendarEndDate;
    }

    /**
     * Setter for expiredCalendarEndDate
     *
     * Expired Calendar End Date
     */
    public void setExpiredCalendarEndDate(Date value) {
        this.expiredCalendarEndDate = value;
    }

    private ArrayList<FrequencyAvailableModel> frequenciesAvailable;

    /**
     * Getter for frequenciesAvailable
     *
     * Frequencies Available
     */
    public ArrayList<FrequencyAvailableModel> getFrequenciesAvailable() {
        return this.frequenciesAvailable;
    }

    /**
     * Setter for frequenciesAvailable
     *
     * Frequencies Available
     */
    public void setFrequenciesAvailable(ArrayList<FrequencyAvailableModel> value) {
        this.frequenciesAvailable = value;
    }

    /**
     * Returns a JSON string representation of CycleSafeOptionResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
