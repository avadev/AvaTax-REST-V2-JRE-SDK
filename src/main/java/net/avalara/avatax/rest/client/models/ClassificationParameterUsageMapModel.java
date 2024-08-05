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
 * usage of system defined parameters.
 */
public class ClassificationParameterUsageMapModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this property.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this property.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Long parameterId;

    /**
     * Getter for parameterId
     *
     * The id of the parameter.
     */
    public Long getParameterId() {
        return this.parameterId;
    }

    /**
     * Setter for parameterId
     *
     * The id of the parameter.
     */
    public void setParameterId(Long value) {
        this.parameterId = value;
    }

    private String taxTypeGroupId;

    /**
     * Getter for taxTypeGroupId
     *
     * tax type group id for the classification parameter usage item.
     */
    public String getTaxTypeGroupId() {
        return this.taxTypeGroupId;
    }

    /**
     * Setter for taxTypeGroupId
     *
     * tax type group id for the classification parameter usage item.
     */
    public void setTaxTypeGroupId(String value) {
        this.taxTypeGroupId = value;
    }

    private Visibility visibility;

    /**
     * Getter for visibility
     *
     * This defines if the parameter is recommended ,optional or mandatory
     */
    public Visibility getVisibility() {
        return this.visibility;
    }

    /**
     * Setter for visibility
     *
     * This defines if the parameter is recommended ,optional or mandatory
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    private String attributeType;

    /**
     * Getter for attributeType
     *
     * The type of parameter as determined by its application, e.g. Product, Transaction, Calculated
     */
    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * Setter for attributeType
     *
     * The type of parameter as determined by its application, e.g. Product, Transaction, Calculated
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    private String attributeSubType;

    /**
     * Getter for attributeSubType
     *
     * The sub-type of parameter as determined by its application.
     */
    public String getAttributeSubType() {
        return this.attributeSubType;
    }

    /**
     * Setter for attributeSubType
     *
     * The sub-type of parameter as determined by its application.
     */
    public void setAttributeSubType(String value) {
        this.attributeSubType = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the property. To use this property, add a field on the `parameters` object of a [CreateTransaction](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Transactions/CreateTransaction/) call.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the property. To use this property, add a field on the `parameters` object of a [CreateTransaction](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Transactions/CreateTransaction/) call.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String dataType;

    /**
     * Getter for dataType
     *
     * The data type of the property.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType
     *
     * The data type of the property.
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    private String helpText;

    /**
     * Getter for helpText
     *
     * Help text to be shown to the user when they are filling out this parameter. Help text may include HTML links to additional
    * content with more information about a parameter.
     */
    public String getHelpText() {
        return this.helpText;
    }

    /**
     * Setter for helpText
     *
     * Help text to be shown to the user when they are filling out this parameter. Help text may include HTML links to additional
    * content with more information about a parameter.
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    private String label;

    /**
     * Getter for label
     *
     * Label that helps the user to identify a parameter
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for label
     *
     * Label that helps the user to identify a parameter
     */
    public void setLabel(String value) {
        this.label = value;
    }

    private String helpUrl;

    /**
     * Getter for helpUrl
     *
     * A help url that provides more information about the parameter
     */
    public String getHelpUrl() {
        return this.helpUrl;
    }

    /**
     * Setter for helpUrl
     *
     * A help url that provides more information about the parameter
     */
    public void setHelpUrl(String value) {
        this.helpUrl = value;
    }

    private ArrayList<String> values;

    /**
     * Getter for values
     *
     * If the parameter is of enumeration data type, then this list will be populated with all of the possible enumeration values.
     */
    public ArrayList<String> getValues() {
        return this.values;
    }

    /**
     * Setter for values
     *
     * If the parameter is of enumeration data type, then this list will be populated with all of the possible enumeration values.
     */
    public void setValues(ArrayList<String> value) {
        this.values = value;
    }

    private String measurementType;

    /**
     * Getter for measurementType
     *
     * The unit of measurement type of the parameter
     */
    public String getMeasurementType() {
        return this.measurementType;
    }

    /**
     * Setter for measurementType
     *
     * The unit of measurement type of the parameter
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    /**
     * Returns a JSON string representation of ClassificationParameterUsageMapModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
