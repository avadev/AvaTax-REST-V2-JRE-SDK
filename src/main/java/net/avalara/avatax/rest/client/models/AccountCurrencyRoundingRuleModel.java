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
 * A currency-rounding-rule model controls how AvaTax rounds calculated tax for a given
* account and currency.
*  
* Each rule is effective-dated: it applies to transactions whose tax date falls within the
* `effDate`/`endDate` window. When no account-specific rule applies for a currency on a
* transaction's tax date, the tax engine uses standard decimal precision (no rounding).
*  
* An account may hold several rules for the same currency, and their windows may overlap: for a
* given tax date the rule with the latest `effDate` whose window contains that date applies, so
* adding a later-dated rule supersedes an earlier one. Two rules sharing a `currencyCode` and
* `effDate` are ambiguous and are rejected.
*  
* A rule can only be created for a currency that already has an Avalara system default (see
* the `ListCurrencyRoundingRuleDefaults` definitions API). The rounding method is fixed
* (rounds halves away from zero) and is an internal implementation detail, not exposed here;
* `precision` - `0` for the whole currency unit, or `2` for standard decimal cents - is the
* only control over the rounding behavior.
 */
public class AccountCurrencyRoundingRuleModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this currency rounding rule.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this currency rounding rule.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The ID number of the account that owns this currency rounding rule.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The ID number of the account that owns this currency rounding rule.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The three-character ISO 4217 currency code this rule applies to, for example `INR`, `TWD`, or `JPY`.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The three-character ISO 4217 currency code this rule applies to, for example `INR`, `TWD`, or `JPY`.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Integer precision;

    /**
     * Getter for precision
     *
     * The number of decimal places the tax is rounded to: `0` for the whole currency unit, or
    * `2` for standard decimal cents. This is the only control over the rounding method.
     */
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Setter for precision
     *
     * The number of decimal places the tax is rounded to: `0` for the whole currency unit, or
    * `2` for standard decimal cents. This is the only control over the rounding method.
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * The first tax date, inclusive, for which this rule applies.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The first tax date, inclusive, for which this rule applies.
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last tax date, inclusive, for which this rule applies. If omitted, the rule applies
    * through `9998-12-31`; a later date is also stored as `9998-12-31`.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last tax date, inclusive, for which this rule applies. If omitted, the rule applies
    * through `9998-12-31`; a later date is also stored as `9998-12-31`.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of AccountCurrencyRoundingRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
