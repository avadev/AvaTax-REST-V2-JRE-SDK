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
 * A location where this company does business.
* Some jurisdictions may require you to list all locations where your company does business.
 */
public class LocationModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this location.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this location.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that operates at this location.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that operates at this location.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String locationCode;

    /**
     * Getter for locationCode
     *
     * A code that identifies this location. Must be unique within your company.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * A code that identifies this location. Must be unique within your company.
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A friendly name for this location.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly name for this location.
     */
    public void setDescription(String value) {
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

    private Boolean isMarketplaceOutsideUsa;

    /**
     * Getter for isMarketplaceOutsideUsa
     *
     * Indicates whether the Marketplace is outside or in USA
     */
    public Boolean getIsMarketplaceOutsideUsa() {
        return this.isMarketplaceOutsideUsa;
    }

    /**
     * Setter for isMarketplaceOutsideUsa
     *
     * Indicates whether the Marketplace is outside or in USA
     */
    public void setIsMarketplaceOutsideUsa(Boolean value) {
        this.isMarketplaceOutsideUsa = value;
    }

    private String line1;

    /**
     * Getter for line1
     *
     * The first line of the physical address of this location.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The first line of the physical address of this location.
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    private String line2;

    /**
     * Getter for line2
     *
     * The second line of the physical address of this location.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * The second line of the physical address of this location.
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    private String line3;

    /**
     * Getter for line3
     *
     * The third line of the physical address of this location.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * The third line of the physical address of this location.
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * The city of the physical address of this location.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city of the physical address of this location.
     */
    public void setCity(String value) {
        this.city = value;
    }

    private String county;

    /**
     * Getter for county
     *
     * The county name of the physical address of this location. Not required.
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for county
     *
     * The county name of the physical address of this location. Not required.
     */
    public void setCounty(String value) {
        this.county = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country of the physical address of this location.
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
     * Name or ISO 3166 code identifying the region within the country of the physical address of this location.
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

    private String postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code or zip code of the physical address of this location.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code or zip code of the physical address of this location.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country of the physical address of this location.
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
     * Name or ISO 3166 code identifying the country of the physical address of this location.
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

    private Boolean isDefault;

    /**
     * Getter for isDefault
     *
     * Set this flag to true to indicate that this is the default location for this company.
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault
     *
     * Set this flag to true to indicate that this is the default location for this company.
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    private Boolean isRegistered;

    /**
     * Getter for isRegistered
     *
     * Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public Boolean getIsRegistered() {
        return this.isRegistered;
    }

    /**
     * Setter for isRegistered
     *
     * Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public void setIsRegistered(Boolean value) {
        this.isRegistered = value;
    }

    private String dbaName;

    /**
     * Getter for dbaName
     *
     * If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public String getDbaName() {
        return this.dbaName;
    }

    /**
     * Setter for dbaName
     *
     * If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public void setDbaName(String value) {
        this.dbaName = value;
    }

    private String outletName;

    /**
     * Getter for outletName
     *
     * A friendly name for this location.
     */
    public String getOutletName() {
        return this.outletName;
    }

    /**
     * Setter for outletName
     *
     * A friendly name for this location.
     */
    public void setOutletName(String value) {
        this.outletName = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this location was opened for business, or null if not known.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this location was opened for business, or null if not known.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * If this place of business has closed, the date when this location closed business.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * If this place of business has closed, the date when this location closed business.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Date lastTransactionDate;

    /**
     * Getter for lastTransactionDate
     *
     * The most recent date when a transaction was processed for this location. Set by AvaTax.
     */
    public Date getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    /**
     * Setter for lastTransactionDate
     *
     * The most recent date when a transaction was processed for this location. Set by AvaTax.
     */
    public void setLastTransactionDate(Date value) {
        this.lastTransactionDate = value;
    }

    private Date registeredDate;

    /**
     * Getter for registeredDate
     *
     * The date when this location was registered with a tax authority. Not required.
     */
    public Date getRegisteredDate() {
        return this.registeredDate;
    }

    /**
     * Setter for registeredDate
     *
     * The date when this location was registered with a tax authority. Not required.
     */
    public void setRegisteredDate(Date value) {
        this.registeredDate = value;
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

    private ArrayList<LocationSettingModel> settings;

    /**
     * Getter for settings
     *
     * Extra information required by certain jurisdictions for filing.
    * For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions".
    * To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public ArrayList<LocationSettingModel> getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings
     *
     * Extra information required by certain jurisdictions for filing.
    * For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions".
    * To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public void setSettings(ArrayList<LocationSettingModel> value) {
        this.settings = value;
    }

    private ArrayList<LocationParameterModel> parameters;

    /**
     * Getter for parameters
     *
     * List of location parameters.
     */
    public ArrayList<LocationParameterModel> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * List of location parameters.
     */
    public void setParameters(ArrayList<LocationParameterModel> value) {
        this.parameters = value;
    }

    /**
     * Returns a JSON string representation of LocationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
