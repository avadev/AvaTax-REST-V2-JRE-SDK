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
public class WorksheetDocument {


    private String docCode;

    /**
     * Getter for docCode
     *
     * 
	 * 
     */
    public String getDocCode() {
        return this.docCode;
    }

    /**
     * Setter for docCode
     *
     * 
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    private Date docDate;

    /**
     * Getter for docDate
     *
     * 
	 * 
     */
    public Date getDocDate() {
        return this.docDate;
    }

    /**
     * Setter for docDate
     *
     * 
     */
    public void setDocDate(Date value) {
        this.docDate = value;
    }

    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt
     *
     * 
	 * 
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt
     *
     * 
     */
    public void setTotalExempt(BigDecimal value) {
        this.totalExempt = value;
    }

    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable
     *
     * 
	 * 
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable
     *
     * 
     */
    public void setTotalTaxable(BigDecimal value) {
        this.totalTaxable = value;
    }

    private BigDecimal totalTax;

    /**
     * Getter for totalTax
     *
     * 
	 * 
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax
     *
     * 
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    private ArrayList<WorksheetDocumentLine> lines;

    /**
     * Getter for lines
     *
     * 
	 * 
     */
    public ArrayList<WorksheetDocumentLine> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * 
     */
    public void setLines(ArrayList<WorksheetDocumentLine> value) {
        this.lines = value;
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
     * Returns a JSON string representation of WorksheetDocument
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
