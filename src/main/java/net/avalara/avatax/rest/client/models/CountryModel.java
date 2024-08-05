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
 * Defines a country as known to Avalara's certificate management system.
 */
public class CountryModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this country as defined in Avalara's certificate management system.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this country as defined in Avalara's certificate management system.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of this country in US English.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this country in US English.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String initials;

    /**
     * Getter for initials
     *
     * The three-character ISO 3166 code for this country.
     */
    public String getInitials() {
        return this.initials;
    }

    /**
     * Setter for initials
     *
     * The three-character ISO 3166 code for this country.
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    private String abbreviation;

    /**
     * Getter for abbreviation
     *
     * The two-character ISO 3166 code for this country.
     */
    public String getAbbreviation() {
        return this.abbreviation;
    }

    /**
     * Setter for abbreviation
     *
     * The two-character ISO 3166 code for this country.
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Returns a JSON string representation of CountryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
