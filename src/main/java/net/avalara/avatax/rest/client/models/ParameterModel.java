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
 * An extra property that can change the behavior of tax transactions.
 */
public class ParameterModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this property.
	 * 
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

    private String category;

    /**
     * Getter for category
     *
     * DEPRECATED - Date: 07/25/2018, Version: 18.7, Message: This field is deprecated and will return null.
    * The category grouping of this parameter. When your user interface displays a large number of parameters, they should
    * be grouped by their category value.
	 * 
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * DEPRECATED - Date: 07/25/2018, Version: 18.7, Message: This field is deprecated and will return null.
    * The category grouping of this parameter. When your user interface displays a large number of parameters, they should
    * be grouped by their category value.
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the property. To use this property, add a field on the `parameters` object of a [CreateTransaction](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Transactions/CreateTransaction/) call.
	 * 
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
	 * 
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
	 * 
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

    private ArrayList<String> serviceTypes;

    /**
     * Getter for serviceTypes
     *
     * A list of service types to which this parameter applies.
	 * 
     */
    public ArrayList<String> getServiceTypes() {
        return this.serviceTypes;
    }

    /**
     * Setter for serviceTypes
     *
     * A list of service types to which this parameter applies.
     */
    public void setServiceTypes(ArrayList<String> value) {
        this.serviceTypes = value;
    }

    private String prompt;

    /**
     * Getter for prompt
     *
     * DEPRECATED - Date: 07/25/2018, Version: 18.7, Message: This field is deprecated and will return null.
    * The prompt you should use when displaying this parameter to a user. For example, if your user interface displays a
    * parameter in a text box, this is the label you should use to identify that text box.
	 * 
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * Setter for prompt
     *
     * DEPRECATED - Date: 07/25/2018, Version: 18.7, Message: This field is deprecated and will return null.
    * The prompt you should use when displaying this parameter to a user. For example, if your user interface displays a
    * parameter in a text box, this is the label you should use to identify that text box.
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    private String regularExpression;

    /**
     * Getter for regularExpression
     *
     * DEPRECATED - Date: 07/25/2018, Version: 18.7, Message: This field is deprecated and will return null.
    * If your user interface permits client-side validation of parameters, this string is a regular expression you can use
    * to validate the user's data entry prior to submitting a tax request.
	 * 
     */
    public String getRegularExpression() {
        return this.regularExpression;
    }

    /**
     * Setter for regularExpression
     *
     * DEPRECATED - Date: 07/25/2018, Version: 18.7, Message: This field is deprecated and will return null.
    * If your user interface permits client-side validation of parameters, this string is a regular expression you can use
    * to validate the user's data entry prior to submitting a tax request.
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
    }

    private String label;

    /**
     * Getter for label
     *
     * Label that helps the user to identify a parameter
	 * 
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
	 * 
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

    private String attributeType;

    /**
     * Getter for attributeType
     *
     * The type of parameter as determined by its application, e.g. Product, Transaction, Calculated
	 * 
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

    private ArrayList<String> values;

    /**
     * Getter for values
     *
     * If the parameter is of enumeration data type, then this list will be populated with all of the possible enumeration values.
	 * 
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
	 * 
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

    private Boolean isNeededForCalculation;

    /**
     * Getter for isNeededForCalculation
     *
     * This field identifies if parameter is needed for calculation
	 * 
     */
    public Boolean getIsNeededForCalculation() {
        return this.isNeededForCalculation;
    }

    /**
     * Setter for isNeededForCalculation
     *
     * This field identifies if parameter is needed for calculation
     */
    public void setIsNeededForCalculation(Boolean value) {
        this.isNeededForCalculation = value;
    }

    private Boolean isNeededForReturns;

    /**
     * Getter for isNeededForReturns
     *
     * This field identifies if parameter is needed for returns
	 * 
     */
    public Boolean getIsNeededForReturns() {
        return this.isNeededForReturns;
    }

    /**
     * Setter for isNeededForReturns
     *
     * This field identifies if parameter is needed for returns
     */
    public void setIsNeededForReturns(Boolean value) {
        this.isNeededForReturns = value;
    }

    private Boolean isNeededForClassification;

    /**
     * Getter for isNeededForClassification
     *
     * This field identifies if parameter is needed for classification
	 * 
     */
    public Boolean getIsNeededForClassification() {
        return this.isNeededForClassification;
    }

    /**
     * Setter for isNeededForClassification
     *
     * This field identifies if parameter is needed for classification
     */
    public void setIsNeededForClassification(Boolean value) {
        this.isNeededForClassification = value;
    }

    /**
     * Returns a JSON string representation of ParameterModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
