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
 * Verify this transaction by matching it to values in your accounting system.
 */
public class VerifyTransactionModel {


    private DateTime? verifyTransactionDate;

    /**
     * Getter for verifyTransactionDate;
     * Transaction Date - The date on the invoice, purchase order, etc.
     */
    public DateTime? getverifyTransactionDate() {;
        return this.verifyTransactionDate;;
    }

    /**
     * Setter for verifyTransactionDate;
     * Transaction Date - The date on the invoice, purchase order, etc.
     */
    public void setverifyTransactionDate(DateTime? value) {;
        this.verifyTransactionDate = value;;
    }


    private Decimal? verifyTotalAmount;

    /**
     * Getter for verifyTotalAmount;
     * Total Amount - The total amount (not including tax) for the document.
     */
    public Decimal? getverifyTotalAmount() {;
        return this.verifyTotalAmount;;
    }

    /**
     * Setter for verifyTotalAmount;
     * Total Amount - The total amount (not including tax) for the document.
     */
    public void setverifyTotalAmount(Decimal? value) {;
        this.verifyTotalAmount = value;;
    }


    private Decimal? verifyTotalTax;

    /**
     * Getter for verifyTotalTax;
     * Total Tax - The total tax for the document.
     */
    public Decimal? getverifyTotalTax() {;
        return this.verifyTotalTax;;
    }

    /**
     * Setter for verifyTotalTax;
     * Total Tax - The total tax for the document.
     */
    public void setverifyTotalTax(Decimal? value) {;
        this.verifyTotalTax = value;;
    }


    /**
     * Returns a JSON string representation of VerifyTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
