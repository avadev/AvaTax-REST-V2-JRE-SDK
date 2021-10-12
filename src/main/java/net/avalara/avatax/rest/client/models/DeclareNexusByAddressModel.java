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
 * Use this object to provide an address and date range where your company does business.
* This address will be used to determine what jurisdictions you should declare nexus and
* calculate tax.
 */
public class DeclareNexusByAddressModel {


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The earliest date on which your company does business at this address. If you omit
    * a value in this field, nexus will be declared at the earliest possible date for this
    * jurisdiction.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The earliest date on which your company does business at this address. If you omit
    * a value in this field, nexus will be declared at the earliest possible date for this
    * jurisdiction.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date on which your company stopped doing business at this address, or empty if
    * your company has no plans to stop doing business at this address.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date on which your company stopped doing business at this address, or empty if
    * your company has no plans to stop doing business at this address.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String line1;

    /**
     * Getter for line1
     *
     * First line of the street address
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * First line of the street address
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    private TextCase textCase;

    /**
     * Getter for textCase
     *
     * Specify the text case for the validated address result. If not specified, will return uppercase.
     */
    public TextCase getTextCase() {
        return this.textCase;
    }

    /**
     * Setter for textCase
     *
     * Specify the text case for the validated address result. If not specified, will return uppercase.
     */
    public void setTextCase(TextCase value) {
        this.textCase = value;
    }

    private String line2;

    /**
     * Getter for line2
     *
     * Second line of the street address
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * Second line of the street address
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    private String line3;

    /**
     * Getter for line3
     *
     * Third line of the street address
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * Third line of the street address
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * City component of the address
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City component of the address
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
     * Postal Code / Zip Code component of the address.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code / Zip Code component of the address.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    private BigDecimal latitude;

    /**
     * Getter for latitude
     *
     * Geospatial latitude measurement, in Decimal Degrees floating point format.
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for latitude
     *
     * Geospatial latitude measurement, in Decimal Degrees floating point format.
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    private BigDecimal longitude;

    /**
     * Getter for longitude
     *
     * Geospatial longitude measurement, in Decimal Degrees floating point format.
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for longitude
     *
     * Geospatial longitude measurement, in Decimal Degrees floating point format.
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Returns a JSON string representation of DeclareNexusByAddressModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
