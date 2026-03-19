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
 * Represents a single tax rate item
 */
public class RateItemModel {


    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The tax rate as a decimal (e.g., 0.20 for 20%)
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The tax rate as a decimal (e.g., 0.20 for 20%)
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    private String displayName;

    /**
     * Getter for displayName
     *
     * The display name formatted as "<rate> (<taxName>)" (e.g., "20.0% (VAT/GST)")
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Setter for displayName
     *
     * The display name formatted as "<rate> (<taxName>)" (e.g., "20.0% (VAT/GST)")
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    private String taxName;

    /**
     * Getter for taxName
     *
     * The tax name (e.g., "VAT/GST")
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * The tax name (e.g., "VAT/GST")
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The jurisdiction code
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The jurisdiction code
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The jurisdiction name
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The jurisdiction name
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private String jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * The jurisdiction type ID
     */
    public String getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * The jurisdiction type ID
     */
    public void setJurisdictionTypeId(String value) {
        this.jurisdictionTypeId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country code
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country code
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * The rate type ID
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * The rate type ID
     */
    public void setRateTypeId(String value) {
        this.rateTypeId = value;
    }

    private String taxTypeGroupId;

    /**
     * Getter for taxTypeGroupId
     *
     * The tax type group ID
     */
    public String getTaxTypeGroupId() {
        return this.taxTypeGroupId;
    }

    /**
     * Setter for taxTypeGroupId
     *
     * The tax type group ID
     */
    public void setTaxTypeGroupId(String value) {
        this.taxTypeGroupId = value;
    }

    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * The tax sub type ID
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * The tax sub type ID
     */
    public void setTaxSubType(String value) {
        this.taxSubType = value;
    }

    /**
     * Returns a JSON string representation of RateItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
