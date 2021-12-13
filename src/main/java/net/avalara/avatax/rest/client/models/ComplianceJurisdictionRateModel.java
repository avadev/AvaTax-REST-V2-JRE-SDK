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
 * A flattened model for jurisdictions and rates.
 */
public class ComplianceJurisdictionRateModel {


    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * The id of the jurisdiction.
	 * 
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * The id of the jurisdiction.
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
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

    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    *  
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    *  
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
	 * 
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    *  
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    *  
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the jurisdiction.
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the jurisdiction.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * The type of the jurisdiction, indicating whether it is a country, state/region, city, for example.
	 * 
     */
    public String getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * The type of the jurisdiction, indicating whether it is a country, state/region, city, for example.
     */
    public void setJurisdictionTypeId(String value) {
        this.jurisdictionTypeId = value;
    }

    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The compontent rate.
	 * 
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The compontent rate.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    private String rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * The rate type.
	 * 
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * The rate type.
     */
    public void setRateTypeId(String value) {
        this.rateTypeId = value;
    }

    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * The tax type.
	 * 
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * The tax type.
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date this rate is starts to take effect.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date this rate is starts to take effect.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date this rate is no longer active.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date this rate is no longer active.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
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

    /**
     * Returns a JSON string representation of ComplianceJurisdictionRateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
