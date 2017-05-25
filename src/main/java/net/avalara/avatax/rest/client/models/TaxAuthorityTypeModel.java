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
 * Tax Authority Type Model
 */
public class TaxAuthorityTypeModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax Authority customer type.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax Authority customer type.
     */
    public void setId(int value) {
        this.id = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * The description name of this tax authority type.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description name of this tax authority type.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string taxAuthorityGroup;

    /**
     * Getter for taxAuthorityGroup
     *
     * Tax Authority Group
     */
    public string getTaxAuthorityGroup() {
        return this.taxAuthorityGroup;
    }

    /**
     * Setter for taxAuthorityGroup
     *
     * Tax Authority Group
     */
    public void setTaxAuthorityGroup(string value) {
        this.taxAuthorityGroup = value;
    }


    /**
     * Returns a JSON string representation of TaxAuthorityTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
