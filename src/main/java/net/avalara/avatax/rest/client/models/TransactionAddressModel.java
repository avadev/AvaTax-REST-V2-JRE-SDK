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
 * An address used within this transaction.
 */
public class TransactionAddressModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this address.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this address.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Long transactionId;

    /**
     * Getter for transactionId
     *
     * The unique ID number of the document to which this address belongs.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * The unique ID number of the document to which this address belongs.
     */
    public void setTransactionId(Long value) {
        this.transactionId = value;
    }


    private BoundaryLevel boundaryLevel;

    /**
     * Getter for boundaryLevel
     *
     * The boundary level at which this address was validated.
     */
    public BoundaryLevel getBoundaryLevel() {
        return this.boundaryLevel;
    }

    /**
     * Setter for boundaryLevel
     *
     * The boundary level at which this address was validated.
     */
    public void setBoundaryLevel(BoundaryLevel value) {
        this.boundaryLevel = value;
    }


    private String line1;

    /**
     * Getter for line1
     *
     * The first line of the address.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The first line of the address.
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String line2;

    /**
     * Getter for line2
     *
     * The second line of the address.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * The second line of the address.
     */
    public void setLine2(String value) {
        this.line2 = value;
    }


    private String line3;

    /**
     * Getter for line3
     *
     * The third line of the address.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * The third line of the address.
     */
    public void setLine3(String value) {
        this.line3 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * The city for the address.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city for the address.
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The ISO 3166 region code. E.g., the second part of ISO 3166-2.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The ISO 3166 region code. E.g., the second part of ISO 3166-2.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code or zip code for the address.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code or zip code for the address.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The ISO 3166 country code
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The ISO 3166 country code
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The unique ID number of the tax region for this address.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The unique ID number of the tax region for this address.
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }


    private String latitude;

    /**
     * Getter for latitude
     *
     * Latitude for this address
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for latitude
     *
     * Latitude for this address
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }


    private String longitude;

    /**
     * Getter for longitude
     *
     * Longitude for this address
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for longitude
     *
     * Longitude for this address
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }


    /**
     * Returns a JSON string representation of TransactionAddressModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
