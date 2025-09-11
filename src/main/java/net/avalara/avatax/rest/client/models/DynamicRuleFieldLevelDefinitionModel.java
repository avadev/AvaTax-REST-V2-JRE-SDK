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
 * Information about a field at a specific "level" (Document or Line).
 */
public class DynamicRuleFieldLevelDefinitionModel {


    private String type;

    /**
     * Getter for type
     *
     * The JSON type of the field.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The JSON type of the field.
     */
    public void setType(String value) {
        this.type = value;
    }

    private String expressionType;

    /**
     * Getter for expressionType
     *
     * The internal expression type of the field.
     */
    public String getExpressionType() {
        return this.expressionType;
    }

    /**
     * Setter for expressionType
     *
     * The internal expression type of the field.
     */
    public void setExpressionType(String value) {
        this.expressionType = value;
    }

    private Boolean deprecated;

    /**
     * Getter for deprecated
     *
     * Whether the field is deprecated or not.
     */
    public Boolean getDeprecated() {
        return this.deprecated;
    }

    /**
     * Setter for deprecated
     *
     * Whether the field is deprecated or not.
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

    private ArrayList<DynamicRuleEnumValueModel> anyOf;

    /**
     * Getter for anyOf
     *
     * Optional list of enumerated values.
     */
    public ArrayList<DynamicRuleEnumValueModel> getAnyOf() {
        return this.anyOf;
    }

    /**
     * Setter for anyOf
     *
     * Optional list of enumerated values.
     */
    public void setAnyOf(ArrayList<DynamicRuleEnumValueModel> value) {
        this.anyOf = value;
    }

    private ArrayList<String> readSteps;

    /**
     * Getter for readSteps
     *
     * The execution steps in which the field is readable.
     */
    public ArrayList<String> getReadSteps() {
        return this.readSteps;
    }

    /**
     * Setter for readSteps
     *
     * The execution steps in which the field is readable.
     */
    public void setReadSteps(ArrayList<String> value) {
        this.readSteps = value;
    }

    private Boolean readOnly;

    /**
     * Getter for readOnly
     *
     * Whether the field is read-only.
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * Setter for readOnly
     *
     * Whether the field is read-only.
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    private ArrayList<String> writeSteps;

    /**
     * Getter for writeSteps
     *
     * The execution steps in which the field is writable.
     */
    public ArrayList<String> getWriteSteps() {
        return this.writeSteps;
    }

    /**
     * Setter for writeSteps
     *
     * The execution steps in which the field is writable.
     */
    public void setWriteSteps(ArrayList<String> value) {
        this.writeSteps = value;
    }

    private Boolean writeOnly;

    /**
     * Getter for writeOnly
     *
     * Whether the field is write-only.
     */
    public Boolean getWriteOnly() {
        return this.writeOnly;
    }

    /**
     * Setter for writeOnly
     *
     * Whether the field is write-only.
     */
    public void setWriteOnly(Boolean value) {
        this.writeOnly = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleFieldLevelDefinitionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
