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
 * Represents the definition and schema of a Dynamic Rule component.
 */
public class DynamicRuleComponentDefinitionModel {


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

    private String name;

    /**
     * Getter for name
     *
     * Display name of this component
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Display name of this component
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A description of the component's purpose and usage
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of the component's purpose and usage
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String dataSchema;

    /**
     * Getter for dataSchema
     *
     * The JSON schema defining the component's configuration structure, as a string
     */
    public String getDataSchema() {
        return this.dataSchema;
    }

    /**
     * Setter for dataSchema
     *
     * The JSON schema defining the component's configuration structure, as a string
     */
    public void setDataSchema(String value) {
        this.dataSchema = value;
    }

    private ArrayList<String> validSteps;

    /**
     * Getter for validSteps
     *
     * The execution steps in which the component is usable
     */
    public ArrayList<String> getValidSteps() {
        return this.validSteps;
    }

    /**
     * Setter for validSteps
     *
     * The execution steps in which the component is usable
     */
    public void setValidSteps(ArrayList<String> value) {
        this.validSteps = value;
    }

    private ArrayList<String> requires;

    /**
     * Getter for requires
     *
     * Array of node subtypes which are required to be present when this node type is present
     */
    public ArrayList<String> getRequires() {
        return this.requires;
    }

    /**
     * Setter for requires
     *
     * Array of node subtypes which are required to be present when this node type is present
     */
    public void setRequires(ArrayList<String> value) {
        this.requires = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleComponentDefinitionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
