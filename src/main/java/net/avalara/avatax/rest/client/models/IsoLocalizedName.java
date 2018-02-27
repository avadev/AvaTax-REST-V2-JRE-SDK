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
 * Represents a language-specific localized name of a particular geographic entity such
* as a country or a region.
 */
public class IsoLocalizedName {


    private String languageAlpha2Code;

    /**
     * Getter for languageAlpha2Code
     *
     * The two-character alphanumeric code identifying the language in which this name is used.
    * 
    * Note that languageAlpha2Code and language3AlphaCode refer to the same language.
     */
    public String getLanguageAlpha2Code() {
        return this.languageAlpha2Code;
    }

    /**
     * Setter for languageAlpha2Code
     *
     * The two-character alphanumeric code identifying the language in which this name is used.
    * 
    * Note that languageAlpha2Code and language3AlphaCode refer to the same language.
     */
    public void setLanguageAlpha2Code(String value) {
        this.languageAlpha2Code = value;
    }


    private String languageAlpha3Code;

    /**
     * Getter for languageAlpha3Code
     *
     * The three-character alphanumeric code identifying the language in which this name is used.
    * 
    * Note that languageAlpha2Code and language3AlphaCode refer to the same language.
     */
    public String getLanguageAlpha3Code() {
        return this.languageAlpha3Code;
    }

    /**
     * Setter for languageAlpha3Code
     *
     * The three-character alphanumeric code identifying the language in which this name is used.
    * 
    * Note that languageAlpha2Code and language3AlphaCode refer to the same language.
     */
    public void setLanguageAlpha3Code(String value) {
        this.languageAlpha3Code = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The name of this geographic entity as known in this language.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this geographic entity as known in this language.
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Returns a JSON string representation of IsoLocalizedName
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
