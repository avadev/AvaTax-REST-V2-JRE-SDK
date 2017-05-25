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
 * A location where this company does business.
* Some jurisdictions may require you to list all locations where your company does business.
 */
public class LocationModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this location.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this location.
     */
    public void setId(int value) {
        this.id = value;
    }


    private int companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that operates at this location.
     */
    public int getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that operates at this location.
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }


    private string locationCode;

    /**
     * Getter for locationCode
     *
     * A code that identifies this location. Must be unique within your company.
     */
    public string getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * A code that identifies this location. Must be unique within your company.
     */
    public void setLocationCode(string value) {
        this.locationCode = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * A friendly name for this location.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly name for this location.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private AddressTypeId addressTypeId;

    /**
     * Getter for addressTypeId
     *
     * Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public AddressTypeId getAddressTypeId() {
        return this.addressTypeId;
    }

    /**
     * Setter for addressTypeId
     *
     * Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public void setAddressTypeId(AddressTypeId value) {
        this.addressTypeId = value;
    }


    private AddressCategoryId addressCategoryId;

    /**
     * Getter for addressCategoryId
     *
     * Indicates the type of place of business represented by this location.
     */
    public AddressCategoryId getAddressCategoryId() {
        return this.addressCategoryId;
    }

    /**
     * Setter for addressCategoryId
     *
     * Indicates the type of place of business represented by this location.
     */
    public void setAddressCategoryId(AddressCategoryId value) {
        this.addressCategoryId = value;
    }


    private string line1;

    /**
     * Getter for line1
     *
     * The first line of the physical address of this location.
     */
    public string getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The first line of the physical address of this location.
     */
    public void setLine1(string value) {
        this.line1 = value;
    }


    private string line2;

    /**
     * Getter for line2
     *
     * The second line of the physical address of this location.
     */
    public string getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * The second line of the physical address of this location.
     */
    public void setLine2(string value) {
        this.line2 = value;
    }


    private string line3;

    /**
     * Getter for line3
     *
     * The third line of the physical address of this location.
     */
    public string getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * The third line of the physical address of this location.
     */
    public void setLine3(string value) {
        this.line3 = value;
    }


    private string city;

    /**
     * Getter for city
     *
     * The city of the physical address of this location.
     */
    public string getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city of the physical address of this location.
     */
    public void setCity(string value) {
        this.city = value;
    }


    private string county;

    /**
     * Getter for county
     *
     * The county name of the physical address of this location. Not required.
     */
    public string getCounty() {
        return this.county;
    }

    /**
     * Setter for county
     *
     * The county name of the physical address of this location. Not required.
     */
    public void setCounty(string value) {
        this.county = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The state, region, or province of the physical address of this location.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The state, region, or province of the physical address of this location.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code or zip code of the physical address of this location.
     */
    public string getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code or zip code of the physical address of this location.
     */
    public void setPostalCode(string value) {
        this.postalCode = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The two character ISO-3166 country code of the physical address of this location.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO-3166 country code of the physical address of this location.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private object isDefault;

    /**
     * Getter for isDefault
     *
     * Set this flag to true to indicate that this is the default location for this company.
     */
    public object getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault
     *
     * Set this flag to true to indicate that this is the default location for this company.
     */
    public void setIsDefault(object value) {
        this.isDefault = value;
    }


    private object isRegistered;

    /**
     * Getter for isRegistered
     *
     * Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public object getIsRegistered() {
        return this.isRegistered;
    }

    /**
     * Setter for isRegistered
     *
     * Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public void setIsRegistered(object value) {
        this.isRegistered = value;
    }


    private string dbaName;

    /**
     * Getter for dbaName
     *
     * If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public string getDbaName() {
        return this.dbaName;
    }

    /**
     * Setter for dbaName
     *
     * If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public void setDbaName(string value) {
        this.dbaName = value;
    }


    private string outletName;

    /**
     * Getter for outletName
     *
     * A friendly name for this location.
     */
    public string getOutletName() {
        return this.outletName;
    }

    /**
     * Setter for outletName
     *
     * A friendly name for this location.
     */
    public void setOutletName(string value) {
        this.outletName = value;
    }


    private Instant effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this location was opened for business, or null if not known.
     */
    public Instant getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this location was opened for business, or null if not known.
     */
    public void setEffectiveDate(Instant value) {
        this.effectiveDate = value;
    }


    private Instant endDate;

    /**
     * Getter for endDate
     *
     * If this place of business has closed, the date when this location closed business.
     */
    public Instant getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * If this place of business has closed, the date when this location closed business.
     */
    public void setEndDate(Instant value) {
        this.endDate = value;
    }


    private Instant lastTransactionDate;

    /**
     * Getter for lastTransactionDate
     *
     * The most recent date when a transaction was processed for this location. Set by AvaTax.
     */
    public Instant getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    /**
     * Setter for lastTransactionDate
     *
     * The most recent date when a transaction was processed for this location. Set by AvaTax.
     */
    public void setLastTransactionDate(Instant value) {
        this.lastTransactionDate = value;
    }


    private Instant registeredDate;

    /**
     * Getter for registeredDate
     *
     * The date when this location was registered with a tax authority. Not required.
     */
    public Instant getRegisteredDate() {
        return this.registeredDate;
    }

    /**
     * Setter for registeredDate
     *
     * The date when this location was registered with a tax authority. Not required.
     */
    public void setRegisteredDate(Instant value) {
        this.registeredDate = value;
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


    private LocationSettingModel[] settings;

    /**
     * Getter for settings
     *
     * Extra information required by certain jurisdictions for filing.
    * For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions". 
    * To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public LocationSettingModel[] getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings
     *
     * Extra information required by certain jurisdictions for filing.
    * For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions". 
    * To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public void setSettings(LocationSettingModel[] value) {
        this.settings = value;
    }


    /**
     * Returns a JSON string representation of LocationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
