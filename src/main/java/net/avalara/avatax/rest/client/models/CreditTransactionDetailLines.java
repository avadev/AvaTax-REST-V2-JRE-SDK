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
 * Credit Transaction Detail Lines
 */
public class CreditTransactionDetailLines {


    private Date reportingDate;

    /**
     * Getter for reportingDate
     *
     * ReportingDate
     */
    public Date getReportingDate() {
        return this.reportingDate;
    }

    /**
     * Setter for reportingDate
     *
     * ReportingDate
     */
    public void setReportingDate(Date value) {
        this.reportingDate = value;
    }

    private String lineNo;

    /**
     * Getter for lineNo
     *
     * LineNo
     */
    public String getLineNo() {
        return this.lineNo;
    }

    /**
     * Setter for lineNo
     *
     * LineNo
     */
    public void setLineNo(String value) {
        this.lineNo = value;
    }

    private BigDecimal lineAmount;

    /**
     * Getter for lineAmount
     *
     * LineAmount
     */
    public BigDecimal getLineAmount() {
        return this.lineAmount;
    }

    /**
     * Setter for lineAmount
     *
     * LineAmount
     */
    public void setLineAmount(BigDecimal value) {
        this.lineAmount = value;
    }

    private BigDecimal exemptAmount;

    /**
     * Getter for exemptAmount
     *
     * ExemptAmount
     */
    public BigDecimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount
     *
     * ExemptAmount
     */
    public void setExemptAmount(BigDecimal value) {
        this.exemptAmount = value;
    }

    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * TaxableAmount
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * TaxableAmount
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * TaxAmount
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * TaxAmount
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Returns a JSON string representation of CreditTransactionDetailLines
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
