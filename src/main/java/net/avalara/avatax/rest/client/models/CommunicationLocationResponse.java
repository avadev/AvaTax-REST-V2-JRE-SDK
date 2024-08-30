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
 * Encloses communication location details
 */
public class CommunicationLocationResponse {


    private String country;

    /**
     * Getter for country
     *
     * Communication tax country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Communication tax country
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * Communication tax state
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * Communication tax state
     */
    public void setState(String value) {
        this.state = value;
    }

    private String county;

    /**
     * Getter for county
     *
     * Communication tax County
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county
     *
     * Communication tax County
     */
    public void setCounty(String value) {
        this.county = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * Communication tax city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * Communication tax city
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Returns a JSON string representation of CommunicationLocationResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
