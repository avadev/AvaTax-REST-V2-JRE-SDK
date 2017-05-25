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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Model with options for actual filing calendar output based on user edits to filing calendar.
 */
public class CycleEditOptionModel {


    private object success;

    /**
     * Getter for success
     *
     * Whether or not changes can be made to the filing calendar.
     */
    public object getSuccess() {
        return this.success;
    }

    /**
     * Setter for success
     *
     * Whether or not changes can be made to the filing calendar.
     */
    public void setSuccess(object value) {
        this.success = value;
    }


    private string message;

    /**
     * Getter for message
     *
     * The message to present to the user when calendar is successfully or unsuccessfully changed.
     */
    public string getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The message to present to the user when calendar is successfully or unsuccessfully changed.
     */
    public void setMessage(string value) {
        this.message = value;
    }


    private object customerMustApprove;

    /**
     * Getter for customerMustApprove
     *
     * Whether or not the user should be warned of a change, because some changes are risky and may be being done not in accordance with jurisdiction rules.
    * For example, user would be warned if user changes filing frequency to new frequency with a start date during an accrual month of the existing frequency.
     */
    public object getCustomerMustApprove() {
        return this.customerMustApprove;
    }

    /**
     * Setter for customerMustApprove
     *
     * Whether or not the user should be warned of a change, because some changes are risky and may be being done not in accordance with jurisdiction rules.
    * For example, user would be warned if user changes filing frequency to new frequency with a start date during an accrual month of the existing frequency.
     */
    public void setCustomerMustApprove(object value) {
        this.customerMustApprove = value;
    }


    private object mustCloneFilingCalendar;

    /**
     * Getter for mustCloneFilingCalendar
     *
     * True if the filing calendar must be cloned to allow this change; false if the existing filing calendar can be changed itself.
     */
    public object getMustCloneFilingCalendar() {
        return this.mustCloneFilingCalendar;
    }

    /**
     * Setter for mustCloneFilingCalendar
     *
     * True if the filing calendar must be cloned to allow this change; false if the existing filing calendar can be changed itself.
     */
    public void setMustCloneFilingCalendar(object value) {
        this.mustCloneFilingCalendar = value;
    }


    private Instant clonedCalendarEffDate;

    /**
     * Getter for clonedCalendarEffDate
     *
     * The effective date of the filing calendar (only applies if cloning).
     */
    public Instant getClonedCalendarEffDate() {
        return this.clonedCalendarEffDate;
    }

    /**
     * Setter for clonedCalendarEffDate
     *
     * The effective date of the filing calendar (only applies if cloning).
     */
    public void setClonedCalendarEffDate(Instant value) {
        this.clonedCalendarEffDate = value;
    }


    private Instant expiredCalendarEndDate;

    /**
     * Getter for expiredCalendarEndDate
     *
     * The expired end date of the old filing calendar (only applies if cloning).
     */
    public Instant getExpiredCalendarEndDate() {
        return this.expiredCalendarEndDate;
    }

    /**
     * Setter for expiredCalendarEndDate
     *
     * The expired end date of the old filing calendar (only applies if cloning).
     */
    public void setExpiredCalendarEndDate(Instant value) {
        this.expiredCalendarEndDate = value;
    }


    /**
     * Returns a JSON string representation of CycleEditOptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
