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
 * An extra property that can change the behavior of tax transactions.
 */
public class ParameterModel {


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


    private String category;

    /**
     * Getter for category
     *
     * The category grouping of this parameter. When your user interface displays a large number of parameters, they should
    * be grouped by their category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
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
     * The name of the property. To use this property, add a field on the `parameters` object of a `/api/v2/transactions/create` call.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the property. To use this property, add a field on the `parameters` object of a `/api/v2/transactions/create` call.
     */
    public void setName(String value) {
        this.name = value;
    }


    private ParameterBagDataType dataType;

    /**
     * Getter for dataType
     *
     * The data type of the property.
     */
    public ParameterBagDataType getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType
     *
     * The data type of the property.
     */
    public void setDataType(ParameterBagDataType value) {
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


    private ArrayList<String> serviceTypes;

    /**
     * Getter for serviceTypes
     *
     * A list of service types to which this parameter applies.
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
     * The prompt you should use when displaying this parameter to a user. For example, if your user interface displays a
    * parameter in a text box, this is the label you should use to identify that text box.
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * Setter for prompt
     *
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
     * If your user interface permits client-side validation of parameters, this string is a regular expression you can use
    * to validate the user's data entry prior to submitting a tax request.
     */
    public String getRegularExpression() {
        return this.regularExpression;
    }

    /**
     * Setter for regularExpression
     *
     * If your user interface permits client-side validation of parameters, this string is a regular expression you can use
    * to validate the user's data entry prior to submitting a tax request.
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
    }


    /**
     * Returns a JSON string representation of ParameterModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
