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
 * Represents a region, province, or state within a country
 */
public class IsoRegionModel {


    private String countryCode;

    /**
     * Getter for countryCode
     *
     * The two-character ISO 3166 country code this region belongs to
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for countryCode
     *
     * The two-character ISO 3166 country code this region belongs to
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }


    private String code;

    /**
     * Getter for code
     *
     * The three character ISO 3166 region code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The three character ISO 3166 region code
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The full name, using localized characters, for this region, in uppercase.
    * 
    * For names in proper or formal case, or for names in other languages, please examine the `localizedNames` element for an appropriate name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The full name, using localized characters, for this region, in uppercase.
    * 
    * For names in proper or formal case, or for names in other languages, please examine the `localizedNames` element for an appropriate name.
     */
    public void setName(String value) {
        this.name = value;
    }


    private String classification;

    /**
     * Getter for classification
     *
     * The word in the local language that classifies what type of a region this represents
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * Setter for classification
     *
     * The word in the local language that classifies what type of a region this represents
     */
    public void setClassification(String value) {
        this.classification = value;
    }


    private Boolean streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax
     *
     * For the United States, this flag indicates whether a U.S. State participates in the Streamlined
    * Sales Tax program. For countries other than the US, this flag is null.
     */
    public Boolean getStreamlinedSalesTax() {
        return this.streamlinedSalesTax;
    }

    /**
     * Setter for streamlinedSalesTax
     *
     * For the United States, this flag indicates whether a U.S. State participates in the Streamlined
    * Sales Tax program. For countries other than the US, this flag is null.
     */
    public void setStreamlinedSalesTax(Boolean value) {
        this.streamlinedSalesTax = value;
    }


    private ArrayList<IsoLocalizedName> localizedNames;

    /**
     * Getter for localizedNames
     *
     * A list of localized names in a variety of languages.
    * 
    * This list is maintained by the International Standards Organization.
     */
    public ArrayList<IsoLocalizedName> getLocalizedNames() {
        return this.localizedNames;
    }

    /**
     * Setter for localizedNames
     *
     * A list of localized names in a variety of languages.
    * 
    * This list is maintained by the International Standards Organization.
     */
    public void setLocalizedNames(ArrayList<IsoLocalizedName> value) {
        this.localizedNames = value;
    }


    /**
     * Returns a JSON string representation of IsoRegionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
