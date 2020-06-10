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
 * Model with options for adding a new filing calendar
 */
public class CycleAddOptionModel {


    private Boolean available;

    /**
     * Getter for available
     *
     * True if this form can be added and filed for the current cycle. "Current cycle" is considered one month before the month of today's date.
     */
    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * Setter for available
     *
     * True if this form can be added and filed for the current cycle. "Current cycle" is considered one month before the month of today's date.
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }


    private Date transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart
     *
     * The period start date for the customer's first transaction in the jurisdiction being added
     */
    public Date getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart
     *
     * The period start date for the customer's first transaction in the jurisdiction being added
     */
    public void setTransactionalPeriodStart(Date value) {
        this.transactionalPeriodStart = value;
    }


    private Date transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd
     *
     * The period end date for the customer's last transaction in the jurisdiction being added
     */
    public Date getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd
     *
     * The period end date for the customer's last transaction in the jurisdiction being added
     */
    public void setTransactionalPeriodEnd(Date value) {
        this.transactionalPeriodEnd = value;
    }


    private Date filingDueDate;

    /**
     * Getter for filingDueDate
     *
     * The jurisdiction-assigned due date for the form
     */
    public Date getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate
     *
     * The jurisdiction-assigned due date for the form
     */
    public void setFilingDueDate(Date value) {
        this.filingDueDate = value;
    }


    private String cycleName;

    /**
     * Getter for cycleName
     *
     * A descriptive name of the cycle and due date of form.
     */
    public String getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName
     *
     * A descriptive name of the cycle and due date of form.
     */
    public void setCycleName(String value) {
        this.cycleName = value;
    }


    private String frequencyName;

    /**
     * Getter for frequencyName
     *
     * The filing frequency of the form
     */
    public String getFrequencyName() {
        return this.frequencyName;
    }

    /**
     * Setter for frequencyName
     *
     * The filing frequency of the form
     */
    public void setFrequencyName(String value) {
        this.frequencyName = value;
    }


    private String filingFrequencyCode;

    /**
     * Getter for filingFrequencyCode
     *
     * A code assigned to the filing frequency
     */
    public String getFilingFrequencyCode() {
        return this.filingFrequencyCode;
    }

    /**
     * Setter for filingFrequencyCode
     *
     * A code assigned to the filing frequency
     */
    public void setFilingFrequencyCode(String value) {
        this.filingFrequencyCode = value;
    }


    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId
     *
     * The filing frequency of the request
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId
     *
     * The filing frequency of the request
     */
    public void setFilingFrequencyId(FilingFrequencyId value) {
        this.filingFrequencyId = value;
    }


    private String cycleUnavailableReason;

    /**
     * Getter for cycleUnavailableReason
     *
     * An explanation for why this form cannot be added for the current cycle
     */
    public String getCycleUnavailableReason() {
        return this.cycleUnavailableReason;
    }

    /**
     * Setter for cycleUnavailableReason
     *
     * An explanation for why this form cannot be added for the current cycle
     */
    public void setCycleUnavailableReason(String value) {
        this.cycleUnavailableReason = value;
    }


    private ArrayList<String> availableLocationCodes;

    /**
     * Getter for availableLocationCodes
     *
     * A list of outlet codes that can be assigned to this form for the current cycle
     */
    public ArrayList<String> getAvailableLocationCodes() {
        return this.availableLocationCodes;
    }

    /**
     * Setter for availableLocationCodes
     *
     * A list of outlet codes that can be assigned to this form for the current cycle
     */
    public void setAvailableLocationCodes(ArrayList<String> value) {
        this.availableLocationCodes = value;
    }


    /**
     * Returns a JSON string representation of CycleAddOptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
