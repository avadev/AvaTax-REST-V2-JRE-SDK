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
 * Represents a tax type
 */
public class TaxTypeModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax type.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax type.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String taxType;

    /**
     * Getter for taxType
     *
     * The name of this tax type.
	 * 
     */
    public String getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType
     *
     * The name of this tax type.
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * The description of this tax type.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of this tax type.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns a JSON string representation of TaxTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
