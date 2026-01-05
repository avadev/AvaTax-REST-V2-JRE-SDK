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
 * Class to accommodate Custom defined parameters
 */
public class ItemCustomParametersModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this item custom parameter
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this item custom parameter
     */
    public void setId(Long value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * A unique code representing this item custom parameter.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A unique code representing this item custom parameter.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The value of the custom parameter for this item.
    * When creating or updating an item, you can specify custom parameter values
    * to store additional metadata or business-specific information.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value of the custom parameter for this item.
    * When creating or updating an item, you can specify custom parameter values
    * to store additional metadata or business-specific information.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JSON string representation of ItemCustomParametersModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
