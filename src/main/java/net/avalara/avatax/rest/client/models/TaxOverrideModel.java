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
 */

/**
 * Represents a tax override for a transaction
 */
public class TaxOverrideModel {


    private TaxOverrideType type;

    /**
     * Getter for type
     *
     * Identifies the type of tax override
     */
    public TaxOverrideType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Identifies the type of tax override
     */
    public void setType(TaxOverrideType value) {
        this.type = value;
    }


    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * Indicates a total override of the calculated tax on the document. AvaTax will distribute
    * the override across all the lines.
    *  
    * Tax will be distributed on a best effort basis. It may not always be possible to override all taxes. Please consult
    * your account manager for information about overrides.
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * Indicates a total override of the calculated tax on the document. AvaTax will distribute
    * the override across all the lines.
    *  
    * Tax will be distributed on a best effort basis. It may not always be possible to override all taxes. Please consult
    * your account manager for information about overrides.
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }


    private Date taxDate;

    /**
     * Getter for taxDate
     *
     * The override tax date to use
    *  
    * This is used when the tax has been previously calculated
    * as in the case of a layaway, return or other reason indicated by the Reason element.
    * If the date is not overridden, then it should be set to the same as the DocDate.
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate
     *
     * The override tax date to use
    *  
    * This is used when the tax has been previously calculated
    * as in the case of a layaway, return or other reason indicated by the Reason element.
    * If the date is not overridden, then it should be set to the same as the DocDate.
     */
    public void setTaxDate(Date value) {
        this.taxDate = value;
    }


    private String reason;

    /**
     * Getter for reason
     *
     * This provides the reason for a tax override for audit purposes. It is required for types 2-4.
    *  
    * Typical reasons include:
    * "Return"
    * "Layaway"
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason
     *
     * This provides the reason for a tax override for audit purposes. It is required for types 2-4.
    *  
    * Typical reasons include:
    * "Return"
    * "Layaway"
     */
    public void setReason(String value) {
        this.reason = value;
    }


    /**
     * Returns a JSON string representation of TaxOverrideModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
