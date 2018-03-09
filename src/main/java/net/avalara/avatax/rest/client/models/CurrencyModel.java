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
 * Represents an ISO 4217 currency code used for designating the currency of a transaction.
 */
public class CurrencyModel {


    private String code;

    /**
     * Getter for code
     *
     * The ISO 4217 currency code for this currency.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The ISO 4217 currency code for this currency.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A friendly human-readable name representing this currency.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly human-readable name representing this currency.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Byte decimalDigits;

    /**
     * Getter for decimalDigits
     *
     * The number of decimal digits to use when formatting a currency value for display.
     */
    public Byte getDecimalDigits() {
        return this.decimalDigits;
    }

    /**
     * Setter for decimalDigits
     *
     * The number of decimal digits to use when formatting a currency value for display.
     */
    public void setDecimalDigits(Byte value) {
        this.decimalDigits = value;
    }


    /**
     * Returns a JSON string representation of CurrencyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
