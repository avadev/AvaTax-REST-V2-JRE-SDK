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
 * Represents a single validation message for a dynamic rule.
 */
public class DynamicRuleValidationMessageModel {


    private String level;

    /**
     * Getter for level
     *
     * The severity level of the message (error, warning, or info).
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Setter for level
     *
     * The severity level of the message (error, warning, or info).
     */
    public void setLevel(String value) {
        this.level = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * The detailed message content.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The detailed message content.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private String refersTo;

    /**
     * Getter for refersTo
     *
     * An optional reference indicating what part of the rule or configuration this message pertains to.
    * This is usually a node identifier, but may be empty if the message is not related to a specific node.
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo
     *
     * An optional reference indicating what part of the rule or configuration this message pertains to.
    * This is usually a node identifier, but may be empty if the message is not related to a specific node.
     */
    public void setRefersTo(String value) {
        this.refersTo = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleValidationMessageModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
