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


    private Int32? id;

    /**
     * Getter for id;
     * The unique ID number of this override.
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this override.
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private Int32? accountId;

    /**
     * Getter for accountId;
     * The unique ID number assigned to this account.
     */
    public Int32? getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The unique ID number assigned to this account.
     */
    public void setaccountId(Int32? value) {;
        this.accountId = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A description of why this jurisdiction override was created.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A description of why this jurisdiction override was created.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String line1;

    /**
     * Getter for line1;
     * The street address of the physical location affected by this override.
     */
    public String getline1() {;
        return this.line1;;
    }

    /**
     * Setter for line1;
     * The street address of the physical location affected by this override.
     */
    public void setline1(String value) {;
        this.line1 = value;;
    }


    private String city;

    /**
     * Getter for city;
     * The city address of the physical location affected by this override.
     */
    public String getcity() {;
        return this.city;;
    }

    /**
     * Setter for city;
     * The city address of the physical location affected by this override.
     */
    public void setcity(String value) {;
        this.city = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The two or three character ISO region code of the region, state, or province affected by this override.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The two or three character ISO region code of the region, state, or province affected by this override.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two character ISO-3166 country code of the country affected by this override.
    * Note that only United States addresses are affected by the jurisdiction override system.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two character ISO-3166 country code of the country affected by this override.
    * Note that only United States addresses are affected by the jurisdiction override system.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * The postal code of the physical location affected by this override.
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * The postal code of the physical location affected by this override.
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The date when this override first takes effect. Set this value to null to affect all dates up to the end date.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The date when this override first takes effect. Set this value to null to affect all dates up to the end date.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * The date when this override will cease to take effect. Set this value to null to never expire.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * The date when this override will cease to take effect. Set this value to null to never expire.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
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


    private List<JurisdictionModel> jurisdictions;

    /**
     * Getter for jurisdictions;
     * A list of the tax jurisdictions that will be assigned to this overridden address.
     */
    public List<JurisdictionModel> getjurisdictions() {;
        return this.jurisdictions;;
    }

    /**
     * Setter for jurisdictions;
     * A list of the tax jurisdictions that will be assigned to this overridden address.
     */
    public void setjurisdictions(List<JurisdictionModel> value) {;
        this.jurisdictions = value;;
    }


    private Int32 taxRegionId;

    /**
     * Getter for taxRegionId;
     * The TaxRegionId of the new location affected by this jurisdiction override.
     */
    public Int32 gettaxRegionId() {;
        return this.taxRegionId;;
    }

    /**
     * Setter for taxRegionId;
     * The TaxRegionId of the new location affected by this jurisdiction override.
     */
    public void settaxRegionId(Int32 value) {;
        this.taxRegionId = value;;
    }


    private BoundaryLevel? boundaryLevel;

    /**
     * Getter for boundaryLevel;
     * The boundary level of this override
     */
    public BoundaryLevel? getboundaryLevel() {;
        return this.boundaryLevel;;
    }

    /**
     * Setter for boundaryLevel;
     * The boundary level of this override
     */
    public void setboundaryLevel(BoundaryLevel? value) {;
        this.boundaryLevel = value;;
    }


    private Boolean? isDefault;

    /**
     * Getter for isDefault;
     * True if this is a default boundary
     */
    public Boolean? getisDefault() {;
        return this.isDefault;;
    }

    /**
     * Setter for isDefault;
     * True if this is a default boundary
     */
    public void setisDefault(Boolean? value) {;
        this.isDefault = value;;
    }


    /**
     * Returns a JSON string representation of JurisdictionOverrideModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
