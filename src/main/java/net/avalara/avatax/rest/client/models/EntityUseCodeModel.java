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
 * Represents a code describing the intended use for a product that may affect its taxability
 */
public class EntityUseCodeModel {


    private string code;

    /**
     * Getter for code
     *
     * The Avalara-recognized entity use code for this definition
     */
    public string getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The Avalara-recognized entity use code for this definition
     */
    public void setCode(string value) {
        this.code = value;
    }


    private string name;

    /**
     * Getter for name
     *
     * The name of this entity use code
     */
    public string getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this entity use code
     */
    public void setName(string value) {
        this.name = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * Text describing the meaning of this use code
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Text describing the meaning of this use code
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string[] validCountries;

    /**
     * Getter for validCountries
     *
     * A list of countries where this use code is valid
     */
    public string[] getValidCountries() {
        return this.validCountries;
    }

    /**
     * Setter for validCountries
     *
     * A list of countries where this use code is valid
     */
    public void setValidCountries(string[] value) {
        this.validCountries = value;
    }


    /**
     * Returns a JSON string representation of EntityUseCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
