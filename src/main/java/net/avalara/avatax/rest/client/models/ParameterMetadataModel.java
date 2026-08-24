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
 * Metadata for a parameter (attribute) a UnitOfBasis uses for tax calculation, sourced from the
* parameter dictionary. Provided for every attribute present in the dictionary, including
* engine-derived ("Calculated") attributes such as Qty.
 */
public class ParameterMetadataModel {


    private String name;

    /**
     * Getter for name
     *
     * The parameter name, matching an entry in the owning UnitOfBasis attributesUsed list.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The parameter name, matching an entry in the owning UnitOfBasis attributesUsed list.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String dataType;

    /**
     * Getter for dataType
     *
     * The expected data type of the parameter value (e.g. NumericMeasured, Boolean, Enumeration).
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType
     *
     * The expected data type of the parameter value (e.g. NumericMeasured, Boolean, Enumeration).
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    private String label;

    /**
     * Getter for label
     *
     * A human-readable label for the parameter.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for label
     *
     * A human-readable label for the parameter.
     */
    public void setLabel(String value) {
        this.label = value;
    }

    private String helpText;

    /**
     * Getter for helpText
     *
     * Descriptive help text for the parameter.
     */
    public String getHelpText() {
        return this.helpText;
    }

    /**
     * Setter for helpText
     *
     * Descriptive help text for the parameter.
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    private String attributeType;

    /**
     * Getter for attributeType
     *
     * The attribute type (e.g. Product, Company, Transaction, Nexus).
     */
    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * Setter for attributeType
     *
     * The attribute type (e.g. Product, Company, Transaction, Nexus).
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    private String measurementType;

    /**
     * Getter for measurementType
     *
     * The measurement type code for the parameter (e.g. Quantity), when applicable.
     */
    public String getMeasurementType() {
        return this.measurementType;
    }

    /**
     * Setter for measurementType
     *
     * The measurement type code for the parameter (e.g. Quantity), when applicable.
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * Whether the parameter is currently active.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * Whether the parameter is currently active.
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    private Boolean isNeededForCalculation;

    /**
     * Getter for isNeededForCalculation
     *
     * Whether the parameter is needed for calculation.
     */
    public Boolean getIsNeededForCalculation() {
        return this.isNeededForCalculation;
    }

    /**
     * Setter for isNeededForCalculation
     *
     * Whether the parameter is needed for calculation.
     */
    public void setIsNeededForCalculation(Boolean value) {
        this.isNeededForCalculation = value;
    }

    /**
     * Returns a JSON string representation of ParameterMetadataModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
