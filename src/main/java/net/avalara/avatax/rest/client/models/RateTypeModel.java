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
 * Rate type Model
 */
public class RateTypeModel {


    private string id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax authority.
     */
    public string getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax authority.
     */
    public void setId(string value) {
        this.id = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * Description of this rate type.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of this rate type.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * Country code for this rate type
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country code for this rate type
     */
    public void setCountry(string value) {
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
