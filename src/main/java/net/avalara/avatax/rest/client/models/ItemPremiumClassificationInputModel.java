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
 * Represents a premium classification associated with an item's HS code for a system code.
 */
public class ItemPremiumClassificationInputModel {


    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The HsCode for which this premium classification is being created.
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The HsCode for which this premium classification is being created.
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    private String justification;

    /**
     * Getter for justification
     *
     * Justification why this HsCode is attached to this item.
     */
    public String getJustification() {
        return this.justification;
    }

    /**
     * Setter for justification
     *
     * Justification why this HsCode is attached to this item.
     */
    public void setJustification(String value) {
        this.justification = value;
    }

    /**
     * Returns a JSON string representation of ItemPremiumClassificationInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
