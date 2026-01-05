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
 * Represents HS Code Punitive Rate Details.
 */
public class ItemHSCodePunitiveRateDetailModel {


    private String rate;

    /**
     * Getter for rate
     *
     * The rate for this punitive duty.
     */
    public String getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The rate for this punitive duty.
     */
    public void setRate(String value) {
        this.rate = value;
    }

    private String uom;

    /**
     * Getter for uom
     *
     * The unit of measure.
     */
    public String getUom() {
        return this.uom;
    }

    /**
     * Setter for uom
     *
     * The unit of measure.
     */
    public void setUom(String value) {
        this.uom = value;
    }

    private Boolean isStackable;

    /**
     * Getter for isStackable
     *
     * Whether this rate is stackable with other rates.
     */
    public Boolean getIsStackable() {
        return this.isStackable;
    }

    /**
     * Setter for isStackable
     *
     * Whether this rate is stackable with other rates.
     */
    public void setIsStackable(Boolean value) {
        this.isStackable = value;
    }

    private Boolean isTaxOnTax;

    /**
     * Getter for isTaxOnTax
     *
     * Whether this is a tax on tax.
     */
    public Boolean getIsTaxOnTax() {
        return this.isTaxOnTax;
    }

    /**
     * Setter for isTaxOnTax
     *
     * Whether this is a tax on tax.
     */
    public void setIsTaxOnTax(Boolean value) {
        this.isTaxOnTax = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodePunitiveRateDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
