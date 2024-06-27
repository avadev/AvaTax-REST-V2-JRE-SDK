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
 * Defines a state, region, or province as known to Avalara's certificate management system.
 */
public class StateModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number that represents this state, region, or province.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number that represents this state, region, or province.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The state, region, or province name as known in US English.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The state, region, or province name as known in US English.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String initials;

    /**
     * Getter for initials
     *
     * The abbreviated two or three character ISO 3166 state, province, or region code.
     */
    public String getInitials() {
        return this.initials;
    }

    /**
     * Setter for initials
     *
     * The abbreviated two or three character ISO 3166 state, province, or region code.
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    private Integer geoCode;

    /**
     * Getter for geoCode
     *
     * A geocoding identification number for this state
     */
    public Integer getGeoCode() {
        return this.geoCode;
    }

    /**
     * Setter for geoCode
     *
     * A geocoding identification number for this state
     */
    public void setGeoCode(Integer value) {
        this.geoCode = value;
    }

    private CountryModel country;

    /**
     * Getter for country
     *
     * 
     */
    public CountryModel getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * 
     */
    public void setCountry(CountryModel value) {
        this.country = value;
    }

    /**
     * Returns a JSON string representation of StateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
