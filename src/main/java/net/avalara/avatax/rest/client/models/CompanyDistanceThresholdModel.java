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
 * A company-distance-threshold model indicates the distance between a company
* and the taxing borders of various countries. Distance thresholds are necessary
* to correctly calculate some value-added taxes.
* 
* Distance thresholds only apply to sales of goods in certain countries. A distance threshold
* is applied for each ship-from/ship-to combination of countries. The threshold amount is defined by
* the ship-to country.
* 
* Generally, if you have exceeded a distance threshold for taxes between a pair of countries, your tax calculation
* will be determined to be the rate in the destination country. If you have not exceeded the threshold,
* your tax calculation will be determined to be the rate in the origin country.
* 
* The amount of a threshold is not tracked or managed in AvaTax, but the decision of your tax compliance department
* as to whether you have exceeded this threshold is maintained in this object. 
* 
* By default, you are considered to have exceeded tax thresholds. If you wish to change this default, you can create 
* a company-distance-threshold object to select the correct behavior for this origin/destination tax calculation process.
 */
public class CompanyDistanceThresholdModel {


    private Long id;

    /**
     * Getter for id
     *
     * A unique ID number representing this distance threshold object.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this distance threshold object.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The ID number of the company that defined this distance threshold.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The ID number of the company that defined this distance threshold.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String originCountry;

    /**
     * Getter for originCountry
     *
     * The origin country for this threshold.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getOriginCountry() {
        return this.originCountry;
    }

    /**
     * Setter for originCountry
     *
     * The origin country for this threshold.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
    }


    private String destinationCountry;

    /**
     * Getter for destinationCountry
     *
     * The destination country for this threshold.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getDestinationCountry() {
        return this.destinationCountry;
    }

    /**
     * Setter for destinationCountry
     *
     * The destination country for this threshold.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }


    private Date effDate;

    /**
     * Getter for effDate
     *
     * For distance threshold values that change over time, this is the earliest date for which this distance
    * threshold is valid. If null, this distance threshold is valid for all dates earlier than the `endDate` field.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * For distance threshold values that change over time, this is the earliest date for which this distance
    * threshold is valid. If null, this distance threshold is valid for all dates earlier than the `endDate` field.
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * For distance threshold values that change over time, this is the latest date for which this distance
    * threshold is valid. If null, this distance threshold is valid for all dates later than the `effDate` field.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * For distance threshold values that change over time, this is the latest date for which this distance
    * threshold is valid. If null, this distance threshold is valid for all dates later than the `effDate` field.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private Boolean thresholdExceeded;

    /**
     * Getter for thresholdExceeded
     *
     * True if your tax professional has determined that the value-added tax distance threshold is exceeded for this pair of countries.
    * 
    * If you set this value to `false`, your value added taxes will be calculated using the origin country. Otherwise, value
    * added taxes will be calculated on the destination country.
     */
    public Boolean getThresholdExceeded() {
        return this.thresholdExceeded;
    }

    /**
     * Setter for thresholdExceeded
     *
     * True if your tax professional has determined that the value-added tax distance threshold is exceeded for this pair of countries.
    * 
    * If you set this value to `false`, your value added taxes will be calculated using the origin country. Otherwise, value
    * added taxes will be calculated on the destination country.
     */
    public void setThresholdExceeded(Boolean value) {
        this.thresholdExceeded = value;
    }


    private String type;

    /**
     * Getter for type
     *
     * Indicates the distance threshold type.
    * 
    * This value can be either `Sale` or `Purchase`.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Indicates the distance threshold type.
    * 
    * This value can be either `Sale` or `Purchase`.
     */
    public void setType(String value) {
        this.type = value;
    }


    /**
     * Returns a JSON string representation of CompanyDistanceThresholdModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
