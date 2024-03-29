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
 * User Defined fields/Flex Fields at Transaction level.
 */
public class TransactionUserDefinedFieldModel {


    private String name;

    /**
     * Getter for name
     *
     * The name of the user defined field.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the user defined field.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The value of the user defined field.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value of the user defined field.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JSON string representation of TransactionUserDefinedFieldModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
