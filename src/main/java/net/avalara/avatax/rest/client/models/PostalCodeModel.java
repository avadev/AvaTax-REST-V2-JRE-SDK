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
 * Represents a PostalCode and its associated data like: country, region, effective dates, etc.
 */
public class PostalCodeModel {


    private String country;

    /**
     * Getter for country
     *
     * Country this PostalCode locates in
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country this PostalCode locates in
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The Region/State/Province this PostalCode locates in
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The Region/State/Province this PostalCode locates in
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * An Avalara assigned TaxRegion Id associated to the PostalCode
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * An Avalara assigned TaxRegion Id associated to the PostalCode
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }


    private Date effDate;

    /**
     * Getter for effDate
     *
     * The date when the PostalCode becomes effective
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The date when the PostalCode becomes effective
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date when the PostalCode becomes expired
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date when the PostalCode becomes expired
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * The postalCode
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postalCode
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    /**
     * Returns a JSON string representation of PostalCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
