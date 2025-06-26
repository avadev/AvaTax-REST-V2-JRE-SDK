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
 * Represents a physical location used in exemption certificate management.
 */
public class ClerkLocationModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique identifier for the location.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the location.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Display name of the location.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Display name of the location.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String code;

    /**
     * Getter for code
     *
     * Code used to reference this location.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Code used to reference this location.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String address_line1;

    /**
     * Getter for address_line1
     *
     * Primary street address of the location.
     */
    public String getAddress_line1() {
        return this.address_line1;
    }

    /**
     * Setter for address_line1
     *
     * Primary street address of the location.
     */
    public void setAddress_line1(String value) {
        this.address_line1 = value;
    }

    private String address_line2;

    /**
     * Getter for address_line2
     *
     * Additional address details (e.g., suite, building).
     */
    public String getAddress_line2() {
        return this.address_line2;
    }

    /**
     * Setter for address_line2
     *
     * Additional address details (e.g., suite, building).
     */
    public void setAddress_line2(String value) {
        this.address_line2 = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * City in which the location is situated.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City in which the location is situated.
     */
    public void setCity(String value) {
        this.city = value;
    }

    private String zip;

    /**
     * Getter for zip
     *
     * Postal or ZIP code of the location.
     */
    public String getZip() {
        return this.zip;
    }

    /**
     * Setter for zip
     *
     * Postal or ZIP code of the location.
     */
    public void setZip(String value) {
        this.zip = value;
    }

    private StateModel state;

    /**
     * Getter for state
     *
     * 
     */
    public StateModel getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * 
     */
    public void setState(StateModel value) {
        this.state = value;
    }

    /**
     * Returns a JSON string representation of ClerkLocationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
