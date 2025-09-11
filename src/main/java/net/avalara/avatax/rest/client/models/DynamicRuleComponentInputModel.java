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
 * Represents a component within a Dynamic Rule definition.
* Components define the logic and flow of a rule, and include condition nodes, action nodes, and rule-wide variables.
 */
public class DynamicRuleComponentInputModel {


    private String id;

    /**
     * Getter for id
     *
     * Unique identifier for the component.
    * This ID is used to reference the component and establish connections
    * between components via the 'next' property.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the component.
    * This ID is used to reference the component and establish connections
    * between components via the 'next' property.
     */
    public void setId(String value) {
        this.id = value;
    }

    private DynamicRuleComponentType type;

    /**
     * Getter for type
     *
     * The primary type of the component, determining its role in the rule execution.
    * This is typically one of the following: Condition, Action, or Variable.
     */
    public DynamicRuleComponentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The primary type of the component, determining its role in the rule execution.
    * This is typically one of the following: Condition, Action, or Variable.
     */
    public void setType(DynamicRuleComponentType value) {
        this.type = value;
    }

    private DynamicRuleComponentSubtype subtype;

    /**
     * Getter for subtype
     *
     * The specific subtype of the component, providing more detailed classification
    * within the main type. For example, a Condition type might have subtypes like
    * MatchCustomerCode, MatchProductCode, etc.
    * The subtype determines the expected format of the data property.
     */
    public DynamicRuleComponentSubtype getSubtype() {
        return this.subtype;
    }

    /**
     * Setter for subtype
     *
     * The specific subtype of the component, providing more detailed classification
    * within the main type. For example, a Condition type might have subtypes like
    * MatchCustomerCode, MatchProductCode, etc.
    * The subtype determines the expected format of the data property.
     */
    public void setSubtype(DynamicRuleComponentSubtype value) {
        this.subtype = value;
    }

    private String data;

    /**
     * Getter for data
     *
     * JSON-formatted string containing the configuration data for the component.
    * The structure of this data varies based on the component type and subtype.
    * For example, a MatchCustomerCode condition might contain an array of customer codes to match against.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Setter for data
     *
     * JSON-formatted string containing the configuration data for the component.
    * The structure of this data varies based on the component type and subtype.
    * For example, a MatchCustomerCode condition might contain an array of customer codes to match against.
     */
    public void setData(String value) {
        this.data = value;
    }

    private ArrayList<String> next;

    /**
     * Getter for next
     *
     * Array of component IDs that represent the next components in the rule execution flow.
    * This property defines the outgoing edges in the rule graph, allowing for
    * conditional branching and sequential processing of components.
     */
    public ArrayList<String> getNext() {
        return this.next;
    }

    /**
     * Setter for next
     *
     * Array of component IDs that represent the next components in the rule execution flow.
    * This property defines the outgoing edges in the rule graph, allowing for
    * conditional branching and sequential processing of components.
     */
    public void setNext(ArrayList<String> value) {
        this.next = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleComponentInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
