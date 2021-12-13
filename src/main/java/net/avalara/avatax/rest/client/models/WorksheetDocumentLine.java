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
 * 
 */
public class WorksheetDocumentLine {


    private Date reportingDate;

    /**
     * Getter for reportingDate
     *
     * 
	 * 
     */
    public Date getReportingDate() {
        return this.reportingDate;
    }

    /**
     * Setter for reportingDate
     *
     * 
     */
    public void setReportingDate(Date value) {
        this.reportingDate = value;
    }

    private String lineNo;

    /**
     * Getter for lineNo
     *
     * 
	 * 
     */
    public String getLineNo() {
        return this.lineNo;
    }

    /**
     * Setter for lineNo
     *
     * 
     */
    public void setLineNo(String value) {
        this.lineNo = value;
    }

    private BigDecimal lineAmount;

    /**
     * Getter for lineAmount
     *
     * 
	 * 
     */
    public BigDecimal getLineAmount() {
        return this.lineAmount;
    }

    /**
     * Setter for lineAmount
     *
     * 
     */
    public void setLineAmount(BigDecimal value) {
        this.lineAmount = value;
    }

    private BigDecimal exemptAmount;

    /**
     * Getter for exemptAmount
     *
     * 
	 * 
     */
    public BigDecimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount
     *
     * 
     */
    public void setExemptAmount(BigDecimal value) {
        this.exemptAmount = value;
    }

    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * 
	 * 
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * 
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * 
	 * 
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * 
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    private ArrayList<Message> messages;

    /**
     * Getter for messages
     *
     * 
	 * 
     */
    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages
     *
     * 
     */
    public void setMessages(ArrayList<Message> value) {
        this.messages = value;
    }

    private String resultCode;

    /**
     * Getter for resultCode
     *
     * 
	 * 
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * Setter for resultCode
     *
     * 
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    private String transactionId;

    /**
     * Getter for transactionId
     *
     * 
	 * 
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * 
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Returns a JSON string representation of WorksheetDocumentLine
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
