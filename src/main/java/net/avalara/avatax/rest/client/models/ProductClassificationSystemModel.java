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
 * Represents a product classification system.
 */
public class ProductClassificationSystemModel {


    private Integer systemId;

    /**
     * Getter for systemId
     *
     * Its Integer SystemId value for System
	 * 
     */
    public Integer getSystemId() {
        return this.systemId;
    }

    /**
     * Setter for systemId
     *
     * Its Integer SystemId value for System
     */
    public void setSystemId(Integer value) {
        this.systemId = value;
    }

    private String systemCode;

    /**
     * Getter for systemCode
     *
     * The System code for this System.
	 * 
     */
    public String getSystemCode() {
        return this.systemCode;
    }

    /**
     * Setter for systemCode
     *
     * The System code for this System.
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A friendly human-readable name representing this System.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly human-readable name representing this System.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String customsValue;

    /**
     * Getter for customsValue
     *
     * custom value set for the system
	 * 
     */
    public String getCustomsValue() {
        return this.customsValue;
    }

    /**
     * Setter for customsValue
     *
     * custom value set for the system
     */
    public void setCustomsValue(String value) {
        this.customsValue = value;
    }

    private ArrayList<ProductSystemCountryModel> countries;

    /**
     * Getter for countries
     *
     * List of all countries that belong to the system including
	 * 
     */
    public ArrayList<ProductSystemCountryModel> getCountries() {
        return this.countries;
    }

    /**
     * Setter for countries
     *
     * List of all countries that belong to the system including
     */
    public void setCountries(ArrayList<ProductSystemCountryModel> value) {
        this.countries = value;
    }

    /**
     * Returns a JSON string representation of ProductClassificationSystemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
