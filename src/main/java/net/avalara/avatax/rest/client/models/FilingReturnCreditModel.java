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
 * An attachment associated with a filing return
 */
public class FilingReturnCreditModel {


    private BigDecimal totalSales;

    /**
     * Getter for totalSales
     *
     * The resourceFileId used to retrieve the attachment
	 * 
     */
    public BigDecimal getTotalSales() {
        return this.totalSales;
    }

    /**
     * Setter for totalSales
     *
     * The resourceFileId used to retrieve the attachment
     */
    public void setTotalSales(BigDecimal value) {
        this.totalSales = value;
    }

    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt
     *
     * The resourceFileId used to retrieve the attachment
	 * 
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt
     *
     * The resourceFileId used to retrieve the attachment
     */
    public void setTotalExempt(BigDecimal value) {
        this.totalExempt = value;
    }

    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable
     *
     * The resourceFileId used to retrieve the attachment
	 * 
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable
     *
     * The resourceFileId used to retrieve the attachment
     */
    public void setTotalTaxable(BigDecimal value) {
        this.totalTaxable = value;
    }

    private BigDecimal totalTax;

    /**
     * Getter for totalTax
     *
     * The resourceFileId used to retrieve the attachment
	 * 
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax
     *
     * The resourceFileId used to retrieve the attachment
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    private ArrayList<WorksheetDocument> transactionDetails;

    /**
     * Getter for transactionDetails
     *
     * The excluded carry over credit documents
	 * 
     */
    public ArrayList<WorksheetDocument> getTransactionDetails() {
        return this.transactionDetails;
    }

    /**
     * Setter for transactionDetails
     *
     * The excluded carry over credit documents
     */
    public void setTransactionDetails(ArrayList<WorksheetDocument> value) {
        this.transactionDetails = value;
    }

    /**
     * Returns a JSON string representation of FilingReturnCreditModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
