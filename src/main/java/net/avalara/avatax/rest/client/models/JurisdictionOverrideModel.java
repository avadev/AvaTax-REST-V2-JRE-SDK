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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
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


    private string description;

    /**
     * Getter for description
     *
     * A description of why this jurisdiction override was created.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of why this jurisdiction override was created.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string line1;

    /**
     * Getter for line1
     *
     * The street address of the physical location affected by this override.
     */
    public string getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The street address of the physical location affected by this override.
     */
    public void setLine1(string value) {
        this.line1 = value;
    }


    private string city;

    /**
     * Getter for city
     *
     * The city address of the physical location affected by this override.
     */
    public string getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city address of the physical location affected by this override.
     */
    public void setCity(string value) {
        this.city = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The two or three character ISO region code of the region, state, or province affected by this override.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two or three character ISO region code of the region, state, or province affected by this override.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The two character ISO-3166 country code of the country affected by this override.
    * Note that only United States addresses are affected by the jurisdiction override system.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO-3166 country code of the country affected by this override.
    * Note that only United States addresses are affected by the jurisdiction override system.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code of the physical location affected by this override.
     */
    public string getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code of the physical location affected by this override.
     */
    public void setPostalCode(string value) {
        this.postalCode = value;
    }


    private Instant effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this override first takes effect. Set this value to null to affect all dates up to the end date.
     */
    public Instant getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this override first takes effect. Set this value to null to affect all dates up to the end date.
     */
    public void setEffectiveDate(Instant value) {
        this.effectiveDate = value;
    }


    private Instant endDate;

    /**
     * Getter for endDate
     *
     * The date when this override will cease to take effect. Set this value to null to never expire.
     */
    public Instant getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date when this override will cease to take effect. Set this value to null to never expire.
     */
    public void setEndDate(Instant value) {
        this.endDate = value;
    }


    private Instant createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Instant getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Instant value) {
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


    private Instant modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Instant getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Instant value) {
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


    private JurisdictionModel[] jurisdictions;

    /**
     * Getter for jurisdictions
     *
     * A list of the tax jurisdictions that will be assigned to this overridden address.
     */
    public JurisdictionModel[] getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions
     *
     * A list of the tax jurisdictions that will be assigned to this overridden address.
     */
    public void setJurisdictions(JurisdictionModel[] value) {
        this.jurisdictions = value;
    }


    private int taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The TaxRegionId of the new location affected by this jurisdiction override.
     */
    public int getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The TaxRegionId of the new location affected by this jurisdiction override.
     */
    public void setTaxRegionId(int value) {
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


    private object isDefault;

    /**
     * Getter for isDefault
     *
     * True if this is a default boundary
     */
    public object getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault
     *
     * True if this is a default boundary
     */
    public void setIsDefault(object value) {
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
