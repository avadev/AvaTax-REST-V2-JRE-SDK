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
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Verify this transaction by matching it to values in your accounting system.
 */
public class VerifyTransactionModel {


    private Date verifyTransactionDate;

    /**
     * Getter for verifyTransactionDate
     *
     * Transaction Date - The date on the invoice, purchase order, etc.
    *  
    * This is used to verify data consistency with the client application.
     */
    public Date getVerifyTransactionDate() {
        return this.verifyTransactionDate;
    }

    /**
     * Setter for verifyTransactionDate
     *
     * Transaction Date - The date on the invoice, purchase order, etc.
    *  
    * This is used to verify data consistency with the client application.
     */
    public void setVerifyTransactionDate(Date value) {
        this.verifyTransactionDate = value;
    }


    private BigDecimal verifyTotalAmount;

    /**
     * Getter for verifyTotalAmount
     *
     * Total Amount - The total amount (not including tax) for the document.
    *  
    * This is used to verify data consistency with the client application.
     */
    public BigDecimal getVerifyTotalAmount() {
        return this.verifyTotalAmount;
    }

    /**
     * Setter for verifyTotalAmount
     *
     * Total Amount - The total amount (not including tax) for the document.
    *  
    * This is used to verify data consistency with the client application.
     */
    public void setVerifyTotalAmount(BigDecimal value) {
        this.verifyTotalAmount = value;
    }


    private BigDecimal verifyTotalTax;

    /**
     * Getter for verifyTotalTax
     *
     * Total Tax - The total tax for the document.
    *  
    * This is used to verify data consistency with the client application.
     */
    public BigDecimal getVerifyTotalTax() {
        return this.verifyTotalTax;
    }

    /**
     * Setter for verifyTotalTax
     *
     * Total Tax - The total tax for the document.
    *  
    * This is used to verify data consistency with the client application.
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
