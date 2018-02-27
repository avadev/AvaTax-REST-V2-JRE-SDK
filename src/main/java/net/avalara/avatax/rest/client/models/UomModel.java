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
 * The "Unit of Measurement" model captures information about a type of measurement. Types of measurement refer to 
* different scales for the same dimension. For example, measurements of type "Distance" may include units of measurement
* such as meters, feet, inches, and miles.
 */
public class UomModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this unit of measurement.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this unit of measurement.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String code;

    /**
     * Getter for code
     *
     * The code that refers to this unit of measurement.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The code that refers to this unit of measurement.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String shortDesc;

    /**
     * Getter for shortDesc
     *
     * A short description of this unit of measurement.
     */
    public String getShortDesc() {
        return this.shortDesc;
    }

    /**
     * Setter for shortDesc
     *
     * A short description of this unit of measurement.
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A longer description of this unit of measurement.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A longer description of this unit of measurement.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Integer measurementTypeId;

    /**
     * Getter for measurementTypeId
     *
     * The ID number of the measurement type, such as "Distance" or "Mass".
     */
    public Integer getMeasurementTypeId() {
        return this.measurementTypeId;
    }

    /**
     * Setter for measurementTypeId
     *
     * The ID number of the measurement type, such as "Distance" or "Mass".
     */
    public void setMeasurementTypeId(Integer value) {
        this.measurementTypeId = value;
    }


    private String measurementTypeCode;

    /**
     * Getter for measurementTypeCode
     *
     * The code describing the measurement type.
     */
    public String getMeasurementTypeCode() {
        return this.measurementTypeCode;
    }

    /**
     * Setter for measurementTypeCode
     *
     * The code describing the measurement type.
     */
    public void setMeasurementTypeCode(String value) {
        this.measurementTypeCode = value;
    }


    private String siUOM;

    /**
     * Getter for siUOM
     *
     * For a particular measurement type, this is the ID number of the unit of measurement object corresponding to the 
    * International System of Units (abbreviated SI) unit of measurement standard. This pointer allows you to select
    * the SI unit of measurement for a particular measurement type.
     */
    public String getSiUOM() {
        return this.siUOM;
    }

    /**
     * Setter for siUOM
     *
     * For a particular measurement type, this is the ID number of the unit of measurement object corresponding to the 
    * International System of Units (abbreviated SI) unit of measurement standard. This pointer allows you to select
    * the SI unit of measurement for a particular measurement type.
     */
    public void setSiUOM(String value) {
        this.siUOM = value;
    }


    private String measurementTypeDescription;

    /**
     * Getter for measurementTypeDescription
     *
     * A description of the measurement type system.
     */
    public String getMeasurementTypeDescription() {
        return this.measurementTypeDescription;
    }

    /**
     * Setter for measurementTypeDescription
     *
     * A description of the measurement type system.
     */
    public void setMeasurementTypeDescription(String value) {
        this.measurementTypeDescription = value;
    }


    private Boolean isSiUom;

    /**
     * Getter for isSiUom
     *
     * True if this measurement is an International System of Units (abbreviated SI) defined standard.
     */
    public Boolean getIsSiUom() {
        return this.isSiUom;
    }

    /**
     * Setter for isSiUom
     *
     * True if this measurement is an International System of Units (abbreviated SI) defined standard.
     */
    public void setIsSiUom(Boolean value) {
        this.isSiUom = value;
    }


    /**
     * Returns a JSON string representation of UomModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
