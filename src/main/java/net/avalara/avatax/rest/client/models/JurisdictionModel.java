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
 * Represents information about a single legal taxing jurisdiction
 */
public class JurisdictionModel {


    private String code;

    /**
     * Getter for code
     *
     * The code that is used to identify this jurisdiction
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The code that is used to identify this jurisdiction
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The name of this jurisdiction
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this jurisdiction
     */
    public void setName(String value) {
        this.name = value;
    }


    private JurisdictionType type;

    /**
     * Getter for type
     *
     * The type of the jurisdiction, indicating whether it is a country, state/region, city, for example.
     */
    public JurisdictionType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the jurisdiction, indicating whether it is a country, state/region, city, for example.
     */
    public void setType(JurisdictionType value) {
        this.type = value;
    }


    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The base rate of tax specific to this jurisdiction.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The base rate of tax specific to this jurisdiction.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }


    private BigDecimal salesRate;

    /**
     * Getter for salesRate
     *
     * The "Sales" tax rate specific to this jurisdiction.
     */
    public BigDecimal getSalesRate() {
        return this.salesRate;
    }

    /**
     * Setter for salesRate
     *
     * The "Sales" tax rate specific to this jurisdiction.
     */
    public void setSalesRate(BigDecimal value) {
        this.salesRate = value;
    }


    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * The Avalara-supplied signature code for this jurisdiction.
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The Avalara-supplied signature code for this jurisdiction.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
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


    private BigDecimal useRate;

    /**
     * Getter for useRate
     *
     * The "Seller's Use" tax rate specific to this jurisdiction.
     */
    public BigDecimal getUseRate() {
        return this.useRate;
    }

    /**
     * Setter for useRate
     *
     * The "Seller's Use" tax rate specific to this jurisdiction.
     */
    public void setUseRate(BigDecimal value) {
        this.useRate = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * The city name of this jurisdiction
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city name of this jurisdiction
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String county;

    /**
     * Getter for county
     *
     * The county name of this jurisdiction
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county
     *
     * The county name of this jurisdiction
     */
    public void setCounty(String value) {
        this.county = value;
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


    private String shortName;

    /**
     * Getter for shortName
     *
     * A short name of the jurisidiction
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for shortName
     *
     * A short name of the jurisidiction
     */
    public void setShortName(String value) {
        this.shortName = value;
    }


    private String stateFips;

    /**
     * Getter for stateFips
     *
     * State FIPS code
     */
    public String getStateFips() {
        return this.stateFips;
    }

    /**
     * Setter for stateFips
     *
     * State FIPS code
     */
    public void setStateFips(String value) {
        this.stateFips = value;
    }


    private String countyFips;

    /**
     * Getter for countyFips
     *
     * County FIPS code
     */
    public String getCountyFips() {
        return this.countyFips;
    }

    /**
     * Setter for countyFips
     *
     * County FIPS code
     */
    public void setCountyFips(String value) {
        this.countyFips = value;
    }


    private String placeFips;

    /**
     * Getter for placeFips
     *
     * City FIPS code
     */
    public String getPlaceFips() {
        return this.placeFips;
    }

    /**
     * Setter for placeFips
     *
     * City FIPS code
     */
    public void setPlaceFips(String value) {
        this.placeFips = value;
    }


    private Integer id;

    /**
     * Getter for id
     *
     * Unique AvaTax Id of this Jurisdiction
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique AvaTax Id of this Jurisdiction
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date this jurisdiction starts to take effect on tax calculations
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
     * Returns a JSON string representation of JurisdictionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
