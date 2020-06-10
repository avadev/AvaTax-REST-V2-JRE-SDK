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
public class CycleExpireOptionModel {


    private Date transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart
     *
     * The period start date for the customer's first transaction in the jurisdiction being expired.
     */
    public Date getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart
     *
     * The period start date for the customer's first transaction in the jurisdiction being expired.
     */
    public void setTransactionalPeriodStart(Date value) {
        this.transactionalPeriodStart = value;
    }


    private Date transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd
     *
     * The period end date for the customer's last transaction in the jurisdiction being expired.
     */
    public Date getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd
     *
     * The period end date for the customer's last transaction in the jurisdiction being expired.
     */
    public void setTransactionalPeriodEnd(Date value) {
        this.transactionalPeriodEnd = value;
    }


    private Date filingDueDate;

    /**
     * Getter for filingDueDate
     *
     * The jurisdiction-assigned due date for the form.
     */
    public Date getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate
     *
     * The jurisdiction-assigned due date for the form.
     */
    public void setFilingDueDate(Date value) {
        this.filingDueDate = value;
    }


    private String cycleName;

    /**
     * Getter for cycleName
     *
     * A descriptive name of the cycle and due date of the form.
     */
    public String getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName
     *
     * A descriptive name of the cycle and due date of the form.
     */
    public void setCycleName(String value) {
        this.cycleName = value;
    }


    /**
     * Returns a JSON string representation of CycleExpireOptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
