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
 * Model for distinct jurisdictions.
 */
public class ComplianceJurisdictionModel {


    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The id of the tax region.
	 * 
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The id of the tax region.
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }

    private String stateAssignedCode;

    /**
     * Getter for stateAssignedCode
     *
     * The state assigned code for the jurisdiction.
	 * 
     */
    public String getStateAssignedCode() {
        return this.stateAssignedCode;
    }

    /**
     * Setter for stateAssignedCode
     *
     * The state assigned code for the jurisdiction.
     */
    public void setStateAssignedCode(String value) {
        this.stateAssignedCode = value;
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

    private String county;

    /**
     * Getter for county
     *
     * The name of the county.
	 * 
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county
     *
     * The name of the county.
     */
    public void setCounty(String value) {
        this.county = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * The name of the city.
	 * 
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The name of the city.
     */
    public void setCity(String value) {
        this.city = value;
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

    private String taxRegionName;

    /**
     * Getter for taxRegionName
     *
     * The name of the tax region.
	 * 
     */
    public String getTaxRegionName() {
        return this.taxRegionName;
    }

    /**
     * Setter for taxRegionName
     *
     * The name of the tax region.
     */
    public void setTaxRegionName(String value) {
        this.taxRegionName = value;
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

    private ArrayList<ComplianceAggregatedTaxRateModel> rates;

    /**
     * Getter for rates
     *
     * Optional: A list of rates for this jurisdiction. To fetch this list, add the query string `?$include=TaxRates` to your URL.
	 * 
     */
    public ArrayList<ComplianceAggregatedTaxRateModel> getRates() {
        return this.rates;
    }

    /**
     * Setter for rates
     *
     * Optional: A list of rates for this jurisdiction. To fetch this list, add the query string `?$include=TaxRates` to your URL.
     */
    public void setRates(ArrayList<ComplianceAggregatedTaxRateModel> value) {
        this.rates = value;
    }

    /**
     * Returns a JSON string representation of ComplianceJurisdictionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
