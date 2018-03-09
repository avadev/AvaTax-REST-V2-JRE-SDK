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
 * Represents a purchase order number for a transaction
 */
public class PoNumberModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique ID number
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String poNumber;

    /**
     * Getter for poNumber
     *
     * Purchase order number.
     */
    public String getPoNumber() {
        return this.poNumber;
    }

    /**
     * Setter for poNumber
     *
     * Purchase order number.
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }


    /**
     * Returns a JSON string representation of PoNumberModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
