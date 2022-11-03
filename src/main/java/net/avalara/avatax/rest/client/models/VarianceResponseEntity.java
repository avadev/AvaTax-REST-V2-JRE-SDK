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
public class VarianceResponseEntity {


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

    private Long customInvoiceId;

    /**
     * Getter for customInvoiceId
     *
     * 
     */
    public Long getCustomInvoiceId() {
        return this.customInvoiceId;
    }

    /**
     * Setter for customInvoiceId
     *
     * 
     */
    public void setCustomInvoiceId(Long value) {
        this.customInvoiceId = value;
    }

    private Long varianceId;

    /**
     * Getter for varianceId
     *
     * 
     */
    public Long getVarianceId() {
        return this.varianceId;
    }

    /**
     * Setter for varianceId
     *
     * 
     */
    public void setVarianceId(Long value) {
        this.varianceId = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * 
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String errorMessage;

    /**
     * Getter for errorMessage
     *
     * 
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage
     *
     * 
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    private BigDecimal taxableVariance;

    /**
     * Getter for taxableVariance
     *
     * 
     */
    public BigDecimal getTaxableVariance() {
        return this.taxableVariance;
    }

    /**
     * Setter for taxableVariance
     *
     * 
     */
    public void setTaxableVariance(BigDecimal value) {
        this.taxableVariance = value;
    }

    private BigDecimal dutyVariance;

    /**
     * Getter for dutyVariance
     *
     * 
     */
    public BigDecimal getDutyVariance() {
        return this.dutyVariance;
    }

    /**
     * Setter for dutyVariance
     *
     * 
     */
    public void setDutyVariance(BigDecimal value) {
        this.dutyVariance = value;
    }

    private BigDecimal taxVariance;

    /**
     * Getter for taxVariance
     *
     * 
     */
    public BigDecimal getTaxVariance() {
        return this.taxVariance;
    }

    /**
     * Setter for taxVariance
     *
     * 
     */
    public void setTaxVariance(BigDecimal value) {
        this.taxVariance = value;
    }

    private BigDecimal totalTaxVariance;

    /**
     * Getter for totalTaxVariance
     *
     * 
     */
    public BigDecimal getTotalTaxVariance() {
        return this.totalTaxVariance;
    }

    /**
     * Setter for totalTaxVariance
     *
     * 
     */
    public void setTotalTaxVariance(BigDecimal value) {
        this.totalTaxVariance = value;
    }

    private ArrayList<VarianceDetail> unMappedDetails;

    /**
     * Getter for unMappedDetails
     *
     * 
     */
    public ArrayList<VarianceDetail> getUnMappedDetails() {
        return this.unMappedDetails;
    }

    /**
     * Setter for unMappedDetails
     *
     * 
     */
    public void setUnMappedDetails(ArrayList<VarianceDetail> value) {
        this.unMappedDetails = value;
    }

    private ArrayList<VarianceResponseLine> varianceLines;

    /**
     * Getter for varianceLines
     *
     * 
     */
    public ArrayList<VarianceResponseLine> getVarianceLines() {
        return this.varianceLines;
    }

    /**
     * Setter for varianceLines
     *
     * 
     */
    public void setVarianceLines(ArrayList<VarianceResponseLine> value) {
        this.varianceLines = value;
    }

    /**
     * Returns a JSON string representation of VarianceResponseEntity
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
