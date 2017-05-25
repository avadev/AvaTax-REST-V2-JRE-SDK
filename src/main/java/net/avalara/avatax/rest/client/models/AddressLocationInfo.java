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
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents an address to resolve.
 */
public class AddressLocationInfo {


    private string locationCode;

    /**
     * Getter for locationCode
     *
     * If you wish to use the address of an existing location for this company, specify the address here.
    * Otherwise, leave this value empty.
     */
    public string getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * If you wish to use the address of an existing location for this company, specify the address here.
    * Otherwise, leave this value empty.
     */
    public void setLocationCode(string value) {
        this.locationCode = value;
    }


    private string line1;

    /**
     * Getter for line1
     *
     * Line1
     */
    public string getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * Line1
     */
    public void setLine1(string value) {
        this.line1 = value;
    }


    private string line2;

    /**
     * Getter for line2
     *
     * Line2
     */
    public string getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * Line2
     */
    public void setLine2(string value) {
        this.line2 = value;
    }


    private string line3;

    /**
     * Getter for line3
     *
     * Line3
     */
    public string getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * Line3
     */
    public void setLine3(string value) {
        this.line3 = value;
    }


    private string city;

    /**
     * Getter for city
     *
     * City
     */
    public string getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City
     */
    public void setCity(string value) {
        this.city = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * State / Province / Region
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * State / Province / Region
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * Two character ISO 3166 Country Code
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Two character ISO 3166 Country Code
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string postalCode;

    /**
     * Getter for postalCode
     *
     * Postal Code / Zip Code
     */
    public string getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code / Zip Code
     */
    public void setPostalCode(string value) {
        this.postalCode = value;
    }


    private Decimal latitude;

    /**
     * Getter for latitude
     *
     * Geospatial latitude measurement
     */
    public Decimal getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for latitude
     *
     * Geospatial latitude measurement
     */
    public void setLatitude(Decimal value) {
        this.latitude = value;
    }


    private Decimal longitude;

    /**
     * Getter for longitude
     *
     * Geospatial longitude measurement
     */
    public Decimal getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for longitude
     *
     * Geospatial longitude measurement
     */
    public void setLongitude(Decimal value) {
        this.longitude = value;
    }


    /**
     * Returns a JSON string representation of AddressLocationInfo
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
