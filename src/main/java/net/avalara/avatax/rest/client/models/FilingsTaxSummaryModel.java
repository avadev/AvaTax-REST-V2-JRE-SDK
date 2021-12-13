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
 * Represents a listing of all tax calculation data for filings and for accruing to future filings.
 */
public class FilingsTaxSummaryModel {


    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount
     *
     * The total sales amount
	 * 
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount
     *
     * The total sales amount
     */
    public void setSalesAmount(BigDecimal value) {
        this.salesAmount = value;
    }

    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount
	 * 
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount
     *
     * The nontaxable amount
	 * 
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount
     *
     * The nontaxable amount
     */
    public void setNonTaxableAmount(BigDecimal value) {
        this.nonTaxableAmount = value;
    }

    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * The tax amount
	 * 
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * The tax amount
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    private BigDecimal remittanceAmount;

    /**
     * Getter for remittanceAmount
     *
     * The remittance amount
	 * 
     */
    public BigDecimal getRemittanceAmount() {
        return this.remittanceAmount;
    }

    /**
     * Setter for remittanceAmount
     *
     * The remittance amount
     */
    public void setRemittanceAmount(BigDecimal value) {
        this.remittanceAmount = value;
    }

    private BigDecimal collectAmount;

    /**
     * Getter for collectAmount
     *
     * The collect amount
	 * 
     */
    public BigDecimal getCollectAmount() {
        return this.collectAmount;
    }

    /**
     * Setter for collectAmount
     *
     * The collect amount
     */
    public void setCollectAmount(BigDecimal value) {
        this.collectAmount = value;
    }

    private BigDecimal salesAccrualAmount;

    /**
     * Getter for salesAccrualAmount
     *
     * The sales accrual amount
	 * 
     */
    public BigDecimal getSalesAccrualAmount() {
        return this.salesAccrualAmount;
    }

    /**
     * Setter for salesAccrualAmount
     *
     * The sales accrual amount
     */
    public void setSalesAccrualAmount(BigDecimal value) {
        this.salesAccrualAmount = value;
    }

    private BigDecimal taxableAccrualAmount;

    /**
     * Getter for taxableAccrualAmount
     *
     * The taxable sales accrual amount
	 * 
     */
    public BigDecimal getTaxableAccrualAmount() {
        return this.taxableAccrualAmount;
    }

    /**
     * Setter for taxableAccrualAmount
     *
     * The taxable sales accrual amount
     */
    public void setTaxableAccrualAmount(BigDecimal value) {
        this.taxableAccrualAmount = value;
    }

    private BigDecimal nonTaxableAccrualAmount;

    /**
     * Getter for nonTaxableAccrualAmount
     *
     * The nontaxable accrual amount
	 * 
     */
    public BigDecimal getNonTaxableAccrualAmount() {
        return this.nonTaxableAccrualAmount;
    }

    /**
     * Setter for nonTaxableAccrualAmount
     *
     * The nontaxable accrual amount
     */
    public void setNonTaxableAccrualAmount(BigDecimal value) {
        this.nonTaxableAccrualAmount = value;
    }

    private BigDecimal taxAccrualAmount;

    /**
     * Getter for taxAccrualAmount
     *
     * The tax accrual amount
	 * 
     */
    public BigDecimal getTaxAccrualAmount() {
        return this.taxAccrualAmount;
    }

    /**
     * Setter for taxAccrualAmount
     *
     * The tax accrual amount
     */
    public void setTaxAccrualAmount(BigDecimal value) {
        this.taxAccrualAmount = value;
    }

    private BigDecimal reportableSalesAmount;

    /**
     * Getter for reportableSalesAmount
     *
     * reportableSalesAmount
	 * 
     */
    public BigDecimal getReportableSalesAmount() {
        return this.reportableSalesAmount;
    }

    /**
     * Setter for reportableSalesAmount
     *
     * reportableSalesAmount
     */
    public void setReportableSalesAmount(BigDecimal value) {
        this.reportableSalesAmount = value;
    }

    private BigDecimal reportableNonTaxableAmount;

    /**
     * Getter for reportableNonTaxableAmount
     *
     * reportableNonTaxableAmount
	 * 
     */
    public BigDecimal getReportableNonTaxableAmount() {
        return this.reportableNonTaxableAmount;
    }

    /**
     * Setter for reportableNonTaxableAmount
     *
     * reportableNonTaxableAmount
     */
    public void setReportableNonTaxableAmount(BigDecimal value) {
        this.reportableNonTaxableAmount = value;
    }

    private BigDecimal reportableTaxableAmount;

    /**
     * Getter for reportableTaxableAmount
     *
     * reportableTaxableAmount
	 * 
     */
    public BigDecimal getReportableTaxableAmount() {
        return this.reportableTaxableAmount;
    }

    /**
     * Setter for reportableTaxableAmount
     *
     * reportableTaxableAmount
     */
    public void setReportableTaxableAmount(BigDecimal value) {
        this.reportableTaxableAmount = value;
    }

    private BigDecimal reportableTaxAmount;

    /**
     * Getter for reportableTaxAmount
     *
     * reportableTaxAmount
	 * 
     */
    public BigDecimal getReportableTaxAmount() {
        return this.reportableTaxAmount;
    }

    /**
     * Setter for reportableTaxAmount
     *
     * reportableTaxAmount
     */
    public void setReportableTaxAmount(BigDecimal value) {
        this.reportableTaxAmount = value;
    }

    /**
     * Returns a JSON string representation of FilingsTaxSummaryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
