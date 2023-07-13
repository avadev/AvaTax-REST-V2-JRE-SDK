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
 * Represents the coefficient, using which tax rules rates can be modified dynamically while applying tax rules
* in order to reduce the variance for all the transactions at country level.
*  
* Avalara supports a few different types of tax rules. For information about tax rule types, see
* [TaxRuleTypeId](https://developer.avalara.com/cofficients)
 */
public class CountryCoefficientsResponseModel {


    private Integer count;

    /**
     * Getter for count
     *
     * Total Number of Country Coefficients records inserted/updated.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Setter for count
     *
     * Total Number of Country Coefficients records inserted/updated.
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * Message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * Message
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Returns a JSON string representation of CountryCoefficientsResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
