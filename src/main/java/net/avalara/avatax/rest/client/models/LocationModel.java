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


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this location.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this location.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company that operates at this location.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company that operates at this location.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String locationCode;

    /**
     * Getter for locationCode;
     * A code that identifies this location. Must be unique within your company.
     */
    public String getlocationCode() {;
        return this.locationCode;;
    }

    /**
     * Setter for locationCode;
     * A code that identifies this location. Must be unique within your company.
     */
    public void setlocationCode(String value) {;
        this.locationCode = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A friendly name for this location.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A friendly name for this location.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private AddressTypeId addressTypeId;

    /**
     * Getter for addressTypeId;
     * Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public AddressTypeId getaddressTypeId() {;
        return this.addressTypeId;;
    }

    /**
     * Setter for addressTypeId;
     * Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public void setaddressTypeId(AddressTypeId value) {;
        this.addressTypeId = value;;
    }


    private AddressCategoryId addressCategoryId;

    /**
     * Getter for addressCategoryId;
     * Indicates the type of place of business represented by this location.
     */
    public AddressCategoryId getaddressCategoryId() {;
        return this.addressCategoryId;;
    }

    /**
     * Setter for addressCategoryId;
     * Indicates the type of place of business represented by this location.
     */
    public void setaddressCategoryId(AddressCategoryId value) {;
        this.addressCategoryId = value;;
    }


    private String line1;

    /**
     * Getter for line1;
     * The first line of the physical address of this location.
     */
    public String getline1() {;
        return this.line1;;
    }

    /**
     * Setter for line1;
     * The first line of the physical address of this location.
     */
    public void setline1(String value) {;
        this.line1 = value;;
    }


    private String line2;

    /**
     * Getter for line2;
     * The second line of the physical address of this location.
     */
    public String getline2() {;
        return this.line2;;
    }

    /**
     * Setter for line2;
     * The second line of the physical address of this location.
     */
    public void setline2(String value) {;
        this.line2 = value;;
    }


    private String line3;

    /**
     * Getter for line3;
     * The third line of the physical address of this location.
     */
    public String getline3() {;
        return this.line3;;
    }

    /**
     * Setter for line3;
     * The third line of the physical address of this location.
     */
    public void setline3(String value) {;
        this.line3 = value;;
    }


    private String city;

    /**
     * Getter for city;
     * The city of the physical address of this location.
     */
    public String getcity() {;
        return this.city;;
    }

    /**
     * Setter for city;
     * The city of the physical address of this location.
     */
    public void setcity(String value) {;
        this.city = value;;
    }


    private String county;

    /**
     * Getter for county;
     * The county name of the physical address of this location. Not required.
     */
    public String getcounty() {;
        return this.county;;
    }

    /**
     * Setter for county;
     * The county name of the physical address of this location. Not required.
     */
    public void setcounty(String value) {;
        this.county = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The state, region, or province of the physical address of this location.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The state, region, or province of the physical address of this location.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * The postal code or zip code of the physical address of this location.
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * The postal code or zip code of the physical address of this location.
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two character ISO-3166 country code of the physical address of this location.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two character ISO-3166 country code of the physical address of this location.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private Boolean? isDefault;

    /**
     * Getter for isDefault;
     * Set this flag to true to indicate that this is the default location for this company.
     */
    public Boolean? getisDefault() {;
        return this.isDefault;;
    }

    /**
     * Setter for isDefault;
     * Set this flag to true to indicate that this is the default location for this company.
     */
    public void setisDefault(Boolean? value) {;
        this.isDefault = value;;
    }


    private Boolean? isRegistered;

    /**
     * Getter for isRegistered;
     * Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public Boolean? getisRegistered() {;
        return this.isRegistered;;
    }

    /**
     * Setter for isRegistered;
     * Set this flag to true to indicate that this location has been registered with a tax authority.
     */
    public void setisRegistered(Boolean? value) {;
        this.isRegistered = value;;
    }


    private String dbaName;

    /**
     * Getter for dbaName;
     * If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public String getdbaName() {;
        return this.dbaName;;
    }

    /**
     * Setter for dbaName;
     * If this location has a different business name from its legal entity name, specify the "Doing Business As" name for this location.
     */
    public void setdbaName(String value) {;
        this.dbaName = value;;
    }


    private String outletName;

    /**
     * Getter for outletName;
     * A friendly name for this location.
     */
    public String getoutletName() {;
        return this.outletName;;
    }

    /**
     * Setter for outletName;
     * A friendly name for this location.
     */
    public void setoutletName(String value) {;
        this.outletName = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The date when this location was opened for business, or null if not known.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The date when this location was opened for business, or null if not known.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * If this place of business has closed, the date when this location closed business.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * If this place of business has closed, the date when this location closed business.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private DateTime? lastTransactionDate;

    /**
     * Getter for lastTransactionDate;
     * The most recent date when a transaction was processed for this location. Set by AvaTax.
     */
    public DateTime? getlastTransactionDate() {;
        return this.lastTransactionDate;;
    }

    /**
     * Setter for lastTransactionDate;
     * The most recent date when a transaction was processed for this location. Set by AvaTax.
     */
    public void setlastTransactionDate(DateTime? value) {;
        this.lastTransactionDate = value;;
    }


    private DateTime? registeredDate;

    /**
     * Getter for registeredDate;
     * The date when this location was registered with a tax authority. Not required.
     */
    public DateTime? getregisteredDate() {;
        return this.registeredDate;;
    }

    /**
     * Setter for registeredDate;
     * The date when this location was registered with a tax authority. Not required.
     */
    public void setregisteredDate(DateTime? value) {;
        this.registeredDate = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private List<LocationSettingModel> settings;

    /**
     * Getter for settings;
     * Extra information required by certain jurisdictions for filing.
    * For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions". 
    * To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public List<LocationSettingModel> getsettings() {;
        return this.settings;;
    }

    /**
     * Setter for settings;
     * Extra information required by certain jurisdictions for filing.
    * For a list of settings recognized by Avalara, query the endpoint "/api/v2/definitions/locationquestions". 
    * To determine the list of settings required for this location, query the endpoint "/api/v2/companies/(id)/locations/(id)/validate".
     */
    public void setsettings(List<LocationSettingModel> value) {;
        this.settings = value;;
    }


    /**
     * Returns a JSON string representation of LocationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
