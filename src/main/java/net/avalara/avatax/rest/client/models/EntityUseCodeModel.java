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


    private String code;

    /**
     * Getter for code;
     * The Avalara-recognized entity use code for this definition
     */
    public String getcode() {;
        return this.code;;
    }

    /**
     * Setter for code;
     * The Avalara-recognized entity use code for this definition
     */
    public void setcode(String value) {;
        this.code = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The name of this entity use code
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The name of this entity use code
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private String description;

    /**
     * Getter for description;
     * Text describing the meaning of this use code
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * Text describing the meaning of this use code
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private List<String> validCountries;

    /**
     * Getter for validCountries;
     * A list of countries where this use code is valid
     */
    public List<String> getvalidCountries() {;
        return this.validCountries;;
    }

    /**
     * Setter for validCountries;
     * A list of countries where this use code is valid
     */
    public void setvalidCountries(List<String> value) {;
        this.validCountries = value;;
    }


    /**
     * Returns a JSON string representation of EntityUseCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
