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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
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


    private Decimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * Indicates a total override of the calculated tax on the document. AvaTax will distribute
    * the override across all the lines.
     */
    public Decimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * Indicates a total override of the calculated tax on the document. AvaTax will distribute
    * the override across all the lines.
     */
    public void setTaxAmount(Decimal value) {
        this.taxAmount = value;
    }


    private Instant taxDate;

    /**
     * Getter for taxDate
     *
     * The override tax date to use
     */
    public Instant getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate
     *
     * The override tax date to use
     */
    public void setTaxDate(Instant value) {
        this.taxDate = value;
    }


    private string reason;

    /**
     * Getter for reason
     *
     * This provides the reason for a tax override for audit purposes. It is required for types 2-4.
     */
    public string getReason() {
        return this.reason;
    }

    /**
     * Setter for reason
     *
     * This provides the reason for a tax override for audit purposes. It is required for types 2-4.
     */
    public void setReason(string value) {
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
