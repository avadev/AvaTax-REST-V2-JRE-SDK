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
 * Represents a parameter associated with an item.
 */
public class ItemParameterModel {


    private Long id;

    /**
     * Getter for id
     *
     * The id of the parameter.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The id of the parameter.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The parameter's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The parameter's name.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The value for the parameter.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value for the parameter.
     */
    public void setValue(String value) {
        this.value = value;
    }

    private String unit;

    /**
     * Getter for unit
     *
     * The unit of measurement code for the parameter.
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Setter for unit
     *
     * The unit of measurement code for the parameter.
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    private Long itemId;

    /**
     * Getter for itemId
     *
     * The item id
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The item id
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    /**
     * Returns a JSON string representation of ItemParameterModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
