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
public class VarianceLine {


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

    private String hsCode;

    /**
     * Getter for hsCode
     *
     * 
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * 
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    private BigDecimal dutyRate;

    /**
     * Getter for dutyRate
     *
     * 
     */
    public BigDecimal getDutyRate() {
        return this.dutyRate;
    }

    /**
     * Setter for dutyRate
     *
     * 
     */
    public void setDutyRate(BigDecimal value) {
        this.dutyRate = value;
    }

    private BigDecimal taxRate;

    /**
     * Getter for taxRate
     *
     * 
     */
    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    /**
     * Setter for taxRate
     *
     * 
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
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
     * Returns a JSON string representation of VarianceLine
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
