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
 * The tax region model.
 */
public class TaxRegionModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The id of the tax region.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The id of the tax region.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String code;

    /**
     * Getter for code
     *
     * The code of the tax region.
	 * 
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The code of the tax region.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the tax region.
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the tax region.
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

    private String serCode;

    /**
     * Getter for serCode
     *
     * The ser code.
	 * 
     */
    public String getSerCode() {
        return this.serCode;
    }

    /**
     * Setter for serCode
     *
     * The ser code.
     */
    public void setSerCode(String value) {
        this.serCode = value;
    }

    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * The tax region signature code.
	 * 
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The tax region signature code.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date this tax region starts to take effect.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date this tax region starts to take effect.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date this tax region stops to take effect.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date this tax region stops to take effect.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean isAcm;

    /**
     * Getter for isAcm
     *
     * Is Acm flag.
	 * 
     */
    public Boolean getIsAcm() {
        return this.isAcm;
    }

    /**
     * Setter for isAcm
     *
     * Is Acm flag.
     */
    public void setIsAcm(Boolean value) {
        this.isAcm = value;
    }

    private Boolean isSst;

    /**
     * Getter for isSst
     *
     * Is SST flag.
	 * 
     */
    public Boolean getIsSst() {
        return this.isSst;
    }

    /**
     * Setter for isSst
     *
     * Is SST flag.
     */
    public void setIsSst(Boolean value) {
        this.isSst = value;
    }

    private ArrayList<DenormalizedJurisModel> jurisdictions;

    /**
     * Getter for jurisdictions
     *
     * List of jurisdictions associated with this tax region.
	 * 
     */
    public ArrayList<DenormalizedJurisModel> getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions
     *
     * List of jurisdictions associated with this tax region.
     */
    public void setJurisdictions(ArrayList<DenormalizedJurisModel> value) {
        this.jurisdictions = value;
    }

    /**
     * Returns a JSON string representation of TaxRegionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
