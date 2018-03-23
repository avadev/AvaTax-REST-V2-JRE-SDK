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
 * Verify this transaction by matching it to values in your accounting system.
* 
* You may specify one or more of the following fields to verify: `date`, `totalAmount`, or `totalTax`.
* This call will report an error if there is any difference between the data stored in AvaTax and
* the data stored in your accounting system.
 */
public class VerifyTransactionModel {


    private Date verifyTransactionDate;

    /**
     * Getter for verifyTransactionDate
     *
     * Set this value if you wish to verify a match between `verifyTransactionDate` and
    * the `documentDate` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public Date getVerifyTransactionDate() {
        return this.verifyTransactionDate;
    }

    /**
     * Setter for verifyTransactionDate
     *
     * Set this value if you wish to verify a match between `verifyTransactionDate` and
    * the `documentDate` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public void setVerifyTransactionDate(Date value) {
        this.verifyTransactionDate = value;
    }


    private BigDecimal verifyTotalAmount;

    /**
     * Getter for verifyTotalAmount
     *
     * Set this value if you wish to verify a match between `verifyTotalAmount` and
    * the `totalAmount` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public BigDecimal getVerifyTotalAmount() {
        return this.verifyTotalAmount;
    }

    /**
     * Setter for verifyTotalAmount
     *
     * Set this value if you wish to verify a match between `verifyTotalAmount` and
    * the `totalAmount` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public void setVerifyTotalAmount(BigDecimal value) {
        this.verifyTotalAmount = value;
    }


    private BigDecimal verifyTotalTax;

    /**
     * Getter for verifyTotalTax
     *
     * Set this value if you wish to verify a match between `verifyTotalTax` and
    * the `totalTax` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public BigDecimal getVerifyTotalTax() {
        return this.verifyTotalTax;
    }

    /**
     * Setter for verifyTotalTax
     *
     * Set this value if you wish to verify a match between `verifyTotalTax` and
    * the `totalTax` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public void setVerifyTotalTax(BigDecimal value) {
        this.verifyTotalTax = value;
    }


    /**
     * Returns a JSON string representation of VerifyTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
