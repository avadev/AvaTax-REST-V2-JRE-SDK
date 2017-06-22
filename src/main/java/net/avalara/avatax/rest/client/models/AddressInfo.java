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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.6.0-89
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a base address element.
 */
public class AddressInfo {


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
     * State / Province / Region component of the address.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * State / Province / Region component of the address.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Two character ISO 3166 Country Code. Call `ListCountries` for a list of ISO 3166 country codes.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Two character ISO 3166 Country Code. Call `ListCountries` for a list of ISO 3166 country codes.
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
     * Returns a JSON string representation of AddressInfo
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
