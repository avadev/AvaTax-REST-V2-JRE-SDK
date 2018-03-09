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
 * Represents an override of tax jurisdictions for a specific address.
* 
* During the time period represented by EffDate through EndDate, all tax decisions for addresses matching
* this override object will be assigned to the list of jurisdictions designated in this object.
 */
public class JurisdictionOverrideModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this override.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this override.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A description of why this jurisdiction override was created.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of why this jurisdiction override was created.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String line1;

    /**
     * Getter for line1
     *
     * The street address of the physical location affected by this override.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The street address of the physical location affected by this override.
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * The city address of the physical location affected by this override.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city address of the physical location affected by this override.
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country to be affected by this override.
    * 
    * Note that only United States addresses are affected by the jurisdiction override system.
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
     * Name or ISO 3166 code identifying the region within the country to be affected by this override.
    * 
    * Note that only United States addresses are affected by the jurisdiction override system.
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
     * The two character ISO-3166 country code of the country affected by this override.
    * 
    * Note that only United States addresses are affected by the jurisdiction override system.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO-3166 country code of the country affected by this override.
    * 
    * Note that only United States addresses are affected by the jurisdiction override system.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code of the physical location affected by this override.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code of the physical location affected by this override.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this override first takes effect. Set this value to null to affect all dates up to the end date.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this override first takes effect. Set this value to null to affect all dates up to the end date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date when this override will cease to take effect. Set this value to null to never expire.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date when this override will cease to take effect. Set this value to null to never expire.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private ArrayList<JurisdictionModel> jurisdictions;

    /**
     * Getter for jurisdictions
     *
     * A list of the tax jurisdictions that will be assigned to this overridden address.
     */
    public ArrayList<JurisdictionModel> getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions
     *
     * A list of the tax jurisdictions that will be assigned to this overridden address.
     */
    public void setJurisdictions(ArrayList<JurisdictionModel> value) {
        this.jurisdictions = value;
    }


    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The TaxRegionId of the new location affected by this jurisdiction override.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The TaxRegionId of the new location affected by this jurisdiction override.
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }


    private BoundaryLevel boundaryLevel;

    /**
     * Getter for boundaryLevel
     *
     * The boundary level of this override
     */
    public BoundaryLevel getBoundaryLevel() {
        return this.boundaryLevel;
    }

    /**
     * Setter for boundaryLevel
     *
     * The boundary level of this override
     */
    public void setBoundaryLevel(BoundaryLevel value) {
        this.boundaryLevel = value;
    }


    private Boolean isDefault;

    /**
     * Getter for isDefault
     *
     * True if this is a default boundary
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault
     *
     * True if this is a default boundary
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }


    /**
     * Returns a JSON string representation of JurisdictionOverrideModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
