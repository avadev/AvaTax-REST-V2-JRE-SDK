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
 * A custom field provides extra information about a customer or certificate.
*  
* Custom fields are provided to permit you to store additional information about an exemption certificate or customer. They are available to
* support additional use cases beyond that supported directly by Avalara's exemption certificate software.
*  
* For more information about custom fields, see the [Avalara Help Center article about custom fields](https://help.avalara.com/0021_Avalara_CertCapture/All_About_CertCapture/Edit_or_Remove_Details_about_Customers).
 */
public class CustomFieldModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Custom field ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Custom field ID
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the custom field.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the custom field.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String type;

    /**
     * Getter for type
     *
     * Custom field type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Custom field type
     */
    public void setType(String value) {
        this.type = value;
    }

    private String possibleValues;

    /**
     * Getter for possibleValues
     *
     * 
     */
    public String getPossibleValues() {
        return this.possibleValues;
    }

    /**
     * Setter for possibleValues
     *
     * 
     */
    public void setPossibleValues(String value) {
        this.possibleValues = value;
    }

    private Boolean usesDataEntry;

    /**
     * Getter for usesDataEntry
     *
     * Custom field uses data entry or not?
     */
    public Boolean getUsesDataEntry() {
        return this.usesDataEntry;
    }

    /**
     * Setter for usesDataEntry
     *
     * Custom field uses data entry or not?
     */
    public void setUsesDataEntry(Boolean value) {
        this.usesDataEntry = value;
    }

    private Boolean requiredInDataEntry;

    /**
     * Getter for requiredInDataEntry
     *
     * Custom field is required in data entry or not?
     */
    public Boolean getRequiredInDataEntry() {
        return this.requiredInDataEntry;
    }

    /**
     * Setter for requiredInDataEntry
     *
     * Custom field is required in data entry or not?
     */
    public void setRequiredInDataEntry(Boolean value) {
        this.requiredInDataEntry = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The value of the custom field.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value of the custom field.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JSON string representation of CustomFieldModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
