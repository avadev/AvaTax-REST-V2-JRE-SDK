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
 * Rate type Model
 */
public class RateTypeModel {


    private String id;

    /**
     * Getter for id
     *
     * The unique ID number of this rate type.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this rate type.
     */
    public void setId(String value) {
        this.id = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * Description of this rate type.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of this rate type.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Country code for this rate type
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country code for this rate type
     */
    public void setCountry(String value) {
        this.country = value;
    }


    /**
     * Returns a JSON string representation of RateTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
