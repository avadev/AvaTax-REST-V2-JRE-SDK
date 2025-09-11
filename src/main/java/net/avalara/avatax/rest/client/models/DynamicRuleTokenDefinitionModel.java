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
 * Represents a valid expression token in Dynamic Rules, i.e. the variables, delimited by double curly braces,
* that may be used when performing string manipulation or evaluating formulas within a Dynamic Rule.
 */
public class DynamicRuleTokenDefinitionModel {


    private String token;

    /**
     * Getter for token
     *
     * Full contents of the token, including the prefix, but excluding functions.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Setter for token
     *
     * Full contents of the token, including the prefix, but excluding functions.
     */
    public void setToken(String value) {
        this.token = value;
    }

    private String tokenType;

    /**
     * Getter for tokenType
     *
     * The type of the token before evaluation. Usually this corresponds to the prefix.
     */
    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * Setter for tokenType
     *
     * The type of the token before evaluation. Usually this corresponds to the prefix.
     */
    public void setTokenType(String value) {
        this.tokenType = value;
    }

    private String evaluatedType;

    /**
     * Getter for evaluatedType
     *
     * The type of the token after evaluation.
     */
    public String getEvaluatedType() {
        return this.evaluatedType;
    }

    /**
     * Setter for evaluatedType
     *
     * The type of the token after evaluation.
     */
    public void setEvaluatedType(String value) {
        this.evaluatedType = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * Filterable token category.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * Filterable token category.
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Details about the token's purpose or usage.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Details about the token's purpose or usage.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleTokenDefinitionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
