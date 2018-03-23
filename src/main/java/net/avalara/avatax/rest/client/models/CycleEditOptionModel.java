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
 * Model with options for actual filing calendar output based on user edits to filing calendar.
 */
public class CycleEditOptionModel {


    private Boolean success;

    /**
     * Getter for success
     *
     * Whether or not changes can be made to the filing calendar.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Setter for success
     *
     * Whether or not changes can be made to the filing calendar.
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }


    private String message;

    /**
     * Getter for message
     *
     * The message to present to the user when calendar is successfully or unsuccessfully changed.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The message to present to the user when calendar is successfully or unsuccessfully changed.
     */
    public void setMessage(String value) {
        this.message = value;
    }


    private Boolean customerMustApprove;

    /**
     * Getter for customerMustApprove
     *
     * Whether or not the user should be warned of a change, because some changes are risky and may be being done not in accordance with jurisdiction rules.
    * For example, user would be warned if user changes filing frequency to new frequency with a start date during an accrual month of the existing frequency.
     */
    public Boolean getCustomerMustApprove() {
        return this.customerMustApprove;
    }

    /**
     * Setter for customerMustApprove
     *
     * Whether or not the user should be warned of a change, because some changes are risky and may be being done not in accordance with jurisdiction rules.
    * For example, user would be warned if user changes filing frequency to new frequency with a start date during an accrual month of the existing frequency.
     */
    public void setCustomerMustApprove(Boolean value) {
        this.customerMustApprove = value;
    }


    private Boolean mustCloneFilingCalendar;

    /**
     * Getter for mustCloneFilingCalendar
     *
     * True if the filing calendar must be cloned to allow this change; false if the existing filing calendar can be changed itself.
     */
    public Boolean getMustCloneFilingCalendar() {
        return this.mustCloneFilingCalendar;
    }

    /**
     * Setter for mustCloneFilingCalendar
     *
     * True if the filing calendar must be cloned to allow this change; false if the existing filing calendar can be changed itself.
     */
    public void setMustCloneFilingCalendar(Boolean value) {
        this.mustCloneFilingCalendar = value;
    }


    private Date clonedCalendarEffDate;

    /**
     * Getter for clonedCalendarEffDate
     *
     * The effective date of the filing calendar (only applies if cloning).
     */
    public Date getClonedCalendarEffDate() {
        return this.clonedCalendarEffDate;
    }

    /**
     * Setter for clonedCalendarEffDate
     *
     * The effective date of the filing calendar (only applies if cloning).
     */
    public void setClonedCalendarEffDate(Date value) {
        this.clonedCalendarEffDate = value;
    }


    private Date expiredCalendarEndDate;

    /**
     * Getter for expiredCalendarEndDate
     *
     * The expired end date of the old filing calendar (only applies if cloning).
     */
    public Date getExpiredCalendarEndDate() {
        return this.expiredCalendarEndDate;
    }

    /**
     * Setter for expiredCalendarEndDate
     *
     * The expired end date of the old filing calendar (only applies if cloning).
     */
    public void setExpiredCalendarEndDate(Date value) {
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
