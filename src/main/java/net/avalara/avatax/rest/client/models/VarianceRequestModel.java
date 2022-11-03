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
 * Request model used as input for Variance API.
 */
public class VarianceRequestModel {


    private Long documentId;

    /**
     * Getter for documentId
     *
     * 
     */
    public Long getDocumentId() {
        return this.documentId;
    }

    /**
     * Setter for documentId
     *
     * 
     */
    public void setDocumentId(Long value) {
        this.documentId = value;
    }

    private String documentCode;

    /**
     * Getter for documentCode
     *
     * 
     */
    public String getDocumentCode() {
        return this.documentCode;
    }

    /**
     * Setter for documentCode
     *
     * 
     */
    public void setDocumentCode(String value) {
        this.documentCode = value;
    }

    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo
     *
     * 
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo
     *
     * 
     */
    public void setPurchaseOrderNo(String value) {
        this.purchaseOrderNo = value;
    }

    private String referenceNo;

    /**
     * Getter for referenceNo
     *
     * 
     */
    public String getReferenceNo() {
        return this.referenceNo;
    }

    /**
     * Setter for referenceNo
     *
     * 
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate
     *
     * 
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate
     *
     * 
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    private ArrayList<VarianceLine> lines;

    /**
     * Getter for lines
     *
     * 
     */
    public ArrayList<VarianceLine> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * 
     */
    public void setLines(ArrayList<VarianceLine> value) {
        this.lines = value;
    }

    private VarianceUnit amount;

    /**
     * Getter for amount
     *
     * 
     */
    public VarianceUnit getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * 
     */
    public void setAmount(VarianceUnit value) {
        this.amount = value;
    }

    private VarianceUnit taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * 
     */
    public VarianceUnit getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * 
     */
    public void setTaxableAmount(VarianceUnit value) {
        this.taxableAmount = value;
    }

    private VarianceUnit dutyPaid;

    /**
     * Getter for dutyPaid
     *
     * 
     */
    public VarianceUnit getDutyPaid() {
        return this.dutyPaid;
    }

    /**
     * Setter for dutyPaid
     *
     * 
     */
    public void setDutyPaid(VarianceUnit value) {
        this.dutyPaid = value;
    }

    private VarianceUnit taxPaid;

    /**
     * Getter for taxPaid
     *
     * 
     */
    public VarianceUnit getTaxPaid() {
        return this.taxPaid;
    }

    /**
     * Setter for taxPaid
     *
     * 
     */
    public void setTaxPaid(VarianceUnit value) {
        this.taxPaid = value;
    }

    private VarianceUnit totalTaxPaid;

    /**
     * Getter for totalTaxPaid
     *
     * 
     */
    public VarianceUnit getTotalTaxPaid() {
        return this.totalTaxPaid;
    }

    /**
     * Setter for totalTaxPaid
     *
     * 
     */
    public void setTotalTaxPaid(VarianceUnit value) {
        this.totalTaxPaid = value;
    }

    private ArrayList<VarianceDetail> details;

    /**
     * Getter for details
     *
     * 
     */
    public ArrayList<VarianceDetail> getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * 
     */
    public void setDetails(ArrayList<VarianceDetail> value) {
        this.details = value;
    }

    /**
     * Returns a JSON string representation of VarianceRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
