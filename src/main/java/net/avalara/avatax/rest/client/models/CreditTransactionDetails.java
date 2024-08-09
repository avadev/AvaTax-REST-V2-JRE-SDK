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
 * Swagger name: AvaTaxClient
 */

/**
 * Credit Transaction Details
 */
public class CreditTransactionDetails {


    private String docCode;

    /**
     * Getter for docCode
     *
     * DocCode
     */
    public String getDocCode() {
        return this.docCode;
    }

    /**
     * Setter for docCode
     *
     * DocCode
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    private Date docDate;

    /**
     * Getter for docDate
     *
     * DocDate
     */
    public Date getDocDate() {
        return this.docDate;
    }

    /**
     * Setter for docDate
     *
     * DocDate
     */
    public void setDocDate(Date value) {
        this.docDate = value;
    }

    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt
     *
     * TotalExempt
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt
     *
     * TotalExempt
     */
    public void setTotalExempt(BigDecimal value) {
        this.totalExempt = value;
    }

    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable
     *
     * TotalTaxable
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable
     *
     * TotalTaxable
     */
    public void setTotalTaxable(BigDecimal value) {
        this.totalTaxable = value;
    }

    private BigDecimal totalTax;

    /**
     * Getter for totalTax
     *
     * TotalTax
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax
     *
     * TotalTax
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    private ArrayList<CreditTransactionDetailLines> lines;

    /**
     * Getter for lines
     *
     * Lines
     */
    public ArrayList<CreditTransactionDetailLines> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * Lines
     */
    public void setLines(ArrayList<CreditTransactionDetailLines> value) {
        this.lines = value;
    }

    /**
     * Returns a JSON string representation of CreditTransactionDetails
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
