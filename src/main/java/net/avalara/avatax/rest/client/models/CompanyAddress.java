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
 * Company Address Information
 */
public class CompanyAddress {


    private String line;

    /**
     * Getter for line
     *
     * Address Line1
     */
    public String getLine() {
        return this.line;
    }

    /**
     * Setter for line
     *
     * Address Line1
     */
    public void setLine(String value) {
        this.line = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 code identifying the country.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * Postal Code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    /**
     * Returns a JSON string representation of CompanyAddress
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
