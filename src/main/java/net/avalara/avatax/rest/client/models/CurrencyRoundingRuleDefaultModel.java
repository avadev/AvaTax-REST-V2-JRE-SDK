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
 * An Avalara system default currency-rounding-rule. These describe the rounding behavior
* AvaTax applies to a currency when an account has no rule of its own, and are the set of
* currencies for which an account may create its own Avalara.AvaTax.AccountServices.Models.v2.AccountCurrencyRoundingRuleModel.
*  
* This is reference data, not account-specific - it never exposes the internal system
* account that these defaults are stored against.
 */
public class CurrencyRoundingRuleDefaultModel {


    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The three-character ISO 4217 currency code this default applies to, for example `INR`, `TWD`, or `JPY`.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The three-character ISO 4217 currency code this default applies to, for example `INR`, `TWD`, or `JPY`.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Integer precision;

    /**
     * Getter for precision
     *
     * The number of decimal places tax is rounded to by default: `0` for the whole currency
    * unit, or `2` for standard decimal cents.
     */
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Setter for precision
     *
     * The number of decimal places tax is rounded to by default: `0` for the whole currency
    * unit, or `2` for standard decimal cents.
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * The first tax date, inclusive, for which this default applies.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The first tax date, inclusive, for which this default applies.
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last tax date, inclusive, for which this default applies.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last tax date, inclusive, for which this default applies.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of CurrencyRoundingRuleDefaultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
