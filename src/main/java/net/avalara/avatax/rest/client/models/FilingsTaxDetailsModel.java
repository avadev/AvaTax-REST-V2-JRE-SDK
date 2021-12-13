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
public class FilingsTaxDetailsModel {


    private String taxType;

    /**
     * Getter for taxType
     *
     * The tax type associated with the summary
	 * 
     */
    public String getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType
     *
     * The tax type associated with the summary
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

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

    private Long numberOfNights;

    /**
     * Getter for numberOfNights
     *
     * The number of nights
	 * 
     */
    public Long getNumberOfNights() {
        return this.numberOfNights;
    }

    /**
     * Setter for numberOfNights
     *
     * The number of nights
     */
    public void setNumberOfNights(Long value) {
        this.numberOfNights = value;
    }

    /**
     * Returns a JSON string representation of FilingsTaxDetailsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
