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
 * Options for expiring a filing calendar.
 */
public class CycleExpireOptionModel {


    private Instant transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart
     *
     * The period start date for the customer's first transaction in the jurisdiction being expired.
     */
    public Instant getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart
     *
     * The period start date for the customer's first transaction in the jurisdiction being expired.
     */
    public void setTransactionalPeriodStart(Instant value) {
        this.transactionalPeriodStart = value;
    }


    private Instant transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd
     *
     * The period end date for the customer's last transaction in the jurisdiction being expired.
     */
    public Instant getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd
     *
     * The period end date for the customer's last transaction in the jurisdiction being expired.
     */
    public void setTransactionalPeriodEnd(Instant value) {
        this.transactionalPeriodEnd = value;
    }


    private Instant filingDueDate;

    /**
     * Getter for filingDueDate
     *
     * The jurisdiction-assigned due date for the form.
     */
    public Instant getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate
     *
     * The jurisdiction-assigned due date for the form.
     */
    public void setFilingDueDate(Instant value) {
        this.filingDueDate = value;
    }


    private string cycleName;

    /**
     * Getter for cycleName
     *
     * A descriptive name of the cycle and due date of the form.
     */
    public string getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName
     *
     * A descriptive name of the cycle and due date of the form.
     */
    public void setCycleName(string value) {
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
