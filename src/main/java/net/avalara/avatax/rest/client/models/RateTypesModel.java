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
 * Rate types Model
 */
public class RateTypesModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this rate type.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this rate type.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String rateType;

    /**
     * Getter for rateType
     *
     * The name of this rateType
	 * 
     */
    public String getRateType() {
        return this.rateType;
    }

    /**
     * Setter for rateType
     *
     * The name of this rateType
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * The description of this rate type.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of this rate type.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns a JSON string representation of RateTypesModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
