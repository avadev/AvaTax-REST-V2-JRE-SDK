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
 * Tax Details by Tax subtype
 */
public class TaxDetailsByTaxSubType {


    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * Tax subtype
	 * 
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * Tax subtype
     */
    public void setTaxSubType(String value) {
        this.taxSubType = value;
    }

    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable
     *
     * Total taxable amount by tax type
	 * 
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable
     *
     * Total taxable amount by tax type
     */
    public void setTotalTaxable(BigDecimal value) {
        this.totalTaxable = value;
    }

    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt
     *
     * Total exempt by tax type
	 * 
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt
     *
     * Total exempt by tax type
     */
    public void setTotalExempt(BigDecimal value) {
        this.totalExempt = value;
    }

    private BigDecimal totalNonTaxable;

    /**
     * Getter for totalNonTaxable
     *
     * Total non taxable by tax type
	 * 
     */
    public BigDecimal getTotalNonTaxable() {
        return this.totalNonTaxable;
    }

    /**
     * Setter for totalNonTaxable
     *
     * Total non taxable by tax type
     */
    public void setTotalNonTaxable(BigDecimal value) {
        this.totalNonTaxable = value;
    }

    private BigDecimal totalTax;

    /**
     * Getter for totalTax
     *
     * Total tax by tax type
	 * 
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax
     *
     * Total tax by tax type
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Returns a JSON string representation of TaxDetailsByTaxSubType
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
