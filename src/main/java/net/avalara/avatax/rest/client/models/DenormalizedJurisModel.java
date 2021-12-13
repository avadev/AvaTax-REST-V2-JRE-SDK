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
 * Represents information about a single legal taxing jurisdiction within a specific Avalara tax region.
 */
public class DenormalizedJurisModel {


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The jurisdiction's effective date.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The jurisdiction's effective date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The jurisdiction's end date.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The jurisdiction's end date.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The jurisdiction's code.
	 * 
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The jurisdiction's code.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * The jurisdiction's id.
	 * 
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * The jurisdiction's id.
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
    }

    private JurisdictionType jurisType;

    /**
     * Getter for jurisType
     *
     * The jurisdiction's type.
	 * 
     */
    public JurisdictionType getJurisType() {
        return this.jurisType;
    }

    /**
     * Setter for jurisType
     *
     * The jurisdiction's type.
     */
    public void setJurisType(JurisdictionType value) {
        this.jurisType = value;
    }

    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The jurisdiction's name.
	 * 
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The jurisdiction's name.
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private String stateAssignedCode;

    /**
     * Getter for stateAssignedCode
     *
     * The state assigned code.
	 * 
     */
    public String getStateAssignedCode() {
        return this.stateAssignedCode;
    }

    /**
     * Setter for stateAssignedCode
     *
     * The state assigned code.
     */
    public void setStateAssignedCode(String value) {
        this.stateAssignedCode = value;
    }

    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The id of the tax authority.
	 * 
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The id of the tax authority.
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * The jurisdiction's region.
    * This should exist on the TaxRegion, but in practice often doesn't.
	 * 
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * The jurisdiction's region.
    * This should exist on the TaxRegion, but in practice often doesn't.
     */
    public void setState(String value) {
        this.state = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The jurisdiction's country.
    * This should exist on the TaxRegion, but in practice often doesn't.
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The jurisdiction's country.
    * This should exist on the TaxRegion, but in practice often doesn't.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String county;

    /**
     * Getter for county
     *
     * The jurisdiction's county.
    * This should exist on the TaxRegion, but in practice often doesn't.
	 * 
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county
     *
     * The jurisdiction's county.
    * This should exist on the TaxRegion, but in practice often doesn't.
     */
    public void setCounty(String value) {
        this.county = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * The jurisdiction's city.
    * This should exist on the TaxRegion, but in practice often doesn't.
	 * 
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The jurisdiction's city.
    * This should exist on the TaxRegion, but in practice often doesn't.
     */
    public void setCity(String value) {
        this.city = value;
    }

    private Boolean isAcm;

    /**
     * Getter for isAcm
     *
     * Is Acm flag
	 * 
     */
    public Boolean getIsAcm() {
        return this.isAcm;
    }

    /**
     * Setter for isAcm
     *
     * Is Acm flag
     */
    public void setIsAcm(Boolean value) {
        this.isAcm = value;
    }

    private Boolean isSst;

    /**
     * Getter for isSst
     *
     * Is Sst flag
	 * 
     */
    public Boolean getIsSst() {
        return this.isSst;
    }

    /**
     * Setter for isSst
     *
     * Is Sst flag
     */
    public void setIsSst(Boolean value) {
        this.isSst = value;
    }

    /**
     * Returns a JSON string representation of DenormalizedJurisModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
