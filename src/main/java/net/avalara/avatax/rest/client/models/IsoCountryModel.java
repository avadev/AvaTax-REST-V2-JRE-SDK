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
 * Represents an ISO 3166 recognized country
 */
public class IsoCountryModel {


    private String code;

    /**
     * Getter for code
     *
     * The two character ISO 3166 country code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The two character ISO 3166 country code
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String alpha3Code;

    /**
     * Getter for alpha3Code
     *
     * The three character ISO 3166 country code
     */
    public String getAlpha3Code() {
        return this.alpha3Code;
    }

    /**
     * Setter for alpha3Code
     *
     * The three character ISO 3166 country code
     */
    public void setAlpha3Code(String value) {
        this.alpha3Code = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The full name of this country in uppercase.
    * 
    * For names in proper or formal case, or for names in other languages, please examine the `localizedNames` element for an appropriate name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The full name of this country in uppercase.
    * 
    * For names in proper or formal case, or for names in other languages, please examine the `localizedNames` element for an appropriate name.
     */
    public void setName(String value) {
        this.name = value;
    }


    private Boolean isEuropeanUnion;

    /**
     * Getter for isEuropeanUnion
     *
     * True if this country is a member of the European Union
     */
    public Boolean getIsEuropeanUnion() {
        return this.isEuropeanUnion;
    }

    /**
     * Setter for isEuropeanUnion
     *
     * True if this country is a member of the European Union
     */
    public void setIsEuropeanUnion(Boolean value) {
        this.isEuropeanUnion = value;
    }


    private ArrayList<IsoLocalizedName> localizedNames;

    /**
     * Getter for localizedNames
     *
     * A list of localized names in a variety of languages.
    * 
    * This list is maintained by the International Standards Organization.
     */
    public ArrayList<IsoLocalizedName> getLocalizedNames() {
        return this.localizedNames;
    }

    /**
     * Setter for localizedNames
     *
     * A list of localized names in a variety of languages.
    * 
    * This list is maintained by the International Standards Organization.
     */
    public void setLocalizedNames(ArrayList<IsoLocalizedName> value) {
        this.localizedNames = value;
    }


    /**
     * Returns a JSON string representation of IsoCountryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
