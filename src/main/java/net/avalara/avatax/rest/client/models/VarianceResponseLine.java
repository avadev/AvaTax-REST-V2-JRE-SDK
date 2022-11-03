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
public class VarianceResponseLine {


    private String lineNo;

    /**
     * Getter for lineNo
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

    private HsCode hsCodeVariance;

    /**
     * Getter for hsCodeVariance
     *
     * 
     */
    public HsCode getHsCodeVariance() {
        return this.hsCodeVariance;
    }

    /**
     * Setter for hsCodeVariance
     *
     * 
     */
    public void setHsCodeVariance(HsCode value) {
        this.hsCodeVariance = value;
    }

    private String dutyRateVariance;

    /**
     * Getter for dutyRateVariance
     *
     * 
     */
    public String getDutyRateVariance() {
        return this.dutyRateVariance;
    }

    /**
     * Setter for dutyRateVariance
     *
     * 
     */
    public void setDutyRateVariance(String value) {
        this.dutyRateVariance = value;
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

    /**
     * Returns a JSON string representation of VarianceResponseLine
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
