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
 * Available Cycle object
 */
public class AvailableCycleModel {


    private Date transactionalPeriodStart;

    /**
     * Getter for transactionalPeriodStart
     *
     * Transactional Period Start
     */
    public Date getTransactionalPeriodStart() {
        return this.transactionalPeriodStart;
    }

    /**
     * Setter for transactionalPeriodStart
     *
     * Transactional Period Start
     */
    public void setTransactionalPeriodStart(Date value) {
        this.transactionalPeriodStart = value;
    }

    private Date transactionalPeriodEnd;

    /**
     * Getter for transactionalPeriodEnd
     *
     * Transactional Period End
     */
    public Date getTransactionalPeriodEnd() {
        return this.transactionalPeriodEnd;
    }

    /**
     * Setter for transactionalPeriodEnd
     *
     * Transactional Period End
     */
    public void setTransactionalPeriodEnd(Date value) {
        this.transactionalPeriodEnd = value;
    }

    private Date filingDueDate;

    /**
     * Getter for filingDueDate
     *
     * Filing Due Date
     */
    public Date getFilingDueDate() {
        return this.filingDueDate;
    }

    /**
     * Setter for filingDueDate
     *
     * Filing Due Date
     */
    public void setFilingDueDate(Date value) {
        this.filingDueDate = value;
    }

    private String cycleName;

    /**
     * Getter for cycleName
     *
     * Cycle Name
     */
    public String getCycleName() {
        return this.cycleName;
    }

    /**
     * Setter for cycleName
     *
     * Cycle Name
     */
    public void setCycleName(String value) {
        this.cycleName = value;
    }

    /**
     * Returns a JSON string representation of AvailableCycleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
