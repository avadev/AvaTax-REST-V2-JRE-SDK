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
 * 
 */
public class TaxTypeGroupModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax type group.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax type group.
     */
    public void setId(int value) {
        this.id = value;
    }


    private string taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * The unique human readable Id of this tax type group.
     */
    public string getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup
     *
     * The unique human readable Id of this tax type group.
     */
    public void setTaxTypeGroup(string value) {
        this.taxTypeGroup = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * The description of this tax type group.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of this tax type group.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    /**
     * Returns a JSON string representation of TaxTypeGroupModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
