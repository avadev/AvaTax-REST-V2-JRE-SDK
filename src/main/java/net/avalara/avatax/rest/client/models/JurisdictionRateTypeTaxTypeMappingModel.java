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
 * Represents a Jurisdiction with applicable TaxType, TaxSubType and RateType.
 */
public class JurisdictionRateTypeTaxTypeMappingModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this Jurisdiction RateType TaxType Mapping.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this Jurisdiction RateType TaxType Mapping.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country of this jurisdiction.
    *  
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    *  
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 code identifying the country of this jurisdiction.
    *  
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    *  
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * Name or ISO 3166 code identifying the region of this jurisdiction.
    *  
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    *  
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
	 * 
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * Name or ISO 3166 code identifying the region of this jurisdiction.
    *  
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    *  
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setState(String value) {
        this.state = value;
    }

    private String jurisdictionType;

    /**
     * Getter for jurisdictionType
     *
     * Jurisdiction TypeId
	 * 
     */
    public String getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType
     *
     * Jurisdiction TypeId
     */
    public void setJurisdictionType(String value) {
        this.jurisdictionType = value;
    }

    private String jurisdictionCode;

    /**
     * Getter for jurisdictionCode
     *
     * Jurisdiction Code
	 * 
     */
    public String getJurisdictionCode() {
        return this.jurisdictionCode;
    }

    /**
     * Setter for jurisdictionCode
     *
     * Jurisdiction Code
     */
    public void setJurisdictionCode(String value) {
        this.jurisdictionCode = value;
    }

    private String longName;

    /**
     * Getter for longName
     *
     * Jurisdiction long name
	 * 
     */
    public String getLongName() {
        return this.longName;
    }

    /**
     * Setter for longName
     *
     * Jurisdiction long name
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * Tax Type to which this jurisdiction is applicable
	 * 
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * Tax Type to which this jurisdiction is applicable
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private String taxSubTypeId;

    /**
     * Getter for taxSubTypeId
     *
     * Tax Type to which this jurisdiction is applicable
	 * 
     */
    public String getTaxSubTypeId() {
        return this.taxSubTypeId;
    }

    /**
     * Setter for taxSubTypeId
     *
     * Tax Type to which this jurisdiction is applicable
     */
    public void setTaxSubTypeId(String value) {
        this.taxSubTypeId = value;
    }

    private String taxTypeGroupId;

    /**
     * Getter for taxTypeGroupId
     *
     * Tax Type Group to which this jurisdiction is applicable
	 * 
     */
    public String getTaxTypeGroupId() {
        return this.taxTypeGroupId;
    }

    /**
     * Setter for taxTypeGroupId
     *
     * Tax Type Group to which this jurisdiction is applicable
     */
    public void setTaxTypeGroupId(String value) {
        this.taxTypeGroupId = value;
    }

    private String rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * Rate Type to which this jurisdiction is applicable
	 * 
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * Rate Type to which this jurisdiction is applicable
     */
    public void setRateTypeId(String value) {
        this.rateTypeId = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date this jurisdiction starts to take effect on tax calculations
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date this jurisdiction starts to take effect on tax calculations
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date this jurisdiction stops to take effect on tax calculations
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date this jurisdiction stops to take effect on tax calculations
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of JurisdictionRateTypeTaxTypeMappingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
