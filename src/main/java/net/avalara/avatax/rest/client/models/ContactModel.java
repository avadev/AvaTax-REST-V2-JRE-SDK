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
 * A contact person for a company.
 */
public class ContactModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this contact.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this contact.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which this contact belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which this contact belongs.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String contactCode;

    /**
     * Getter for contactCode
     *
     * A unique code for this contact.
     */
    public String getContactCode() {
        return this.contactCode;
    }

    /**
     * Setter for contactCode
     *
     * A unique code for this contact.
     */
    public void setContactCode(String value) {
        this.contactCode = value;
    }


    private String firstName;

    /**
     * Getter for firstName
     *
     * The first or given name of this contact.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * The first or given name of this contact.
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }


    private String middleName;

    /**
     * Getter for middleName
     *
     * The middle name of this contact.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Setter for middleName
     *
     * The middle name of this contact.
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }


    private String lastName;

    /**
     * Getter for lastName
     *
     * The last or family name of this contact.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * The last or family name of this contact.
     */
    public void setLastName(String value) {
        this.lastName = value;
    }


    private String title;

    /**
     * Getter for title
     *
     * Professional title of this contact.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Professional title of this contact.
     */
    public void setTitle(String value) {
        this.title = value;
    }


    private String line1;

    /**
     * Getter for line1
     *
     * The first line of the postal mailing address of this contact.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The first line of the postal mailing address of this contact.
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String line2;

    /**
     * Getter for line2
     *
     * The second line of the postal mailing address of this contact.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * The second line of the postal mailing address of this contact.
     */
    public void setLine2(String value) {
        this.line2 = value;
    }


    private String line3;

    /**
     * Getter for line3
     *
     * The third line of the postal mailing address of this contact.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * The third line of the postal mailing address of this contact.
     */
    public void setLine3(String value) {
        this.line3 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * The city of the postal mailing address of this contact.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city of the postal mailing address of this contact.
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


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code or zip code of the postal mailing address of this contact.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code or zip code of the postal mailing address of this contact.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country.
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
     * Name or ISO 3166 code identifying the country.
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


    private String email;

    /**
     * Getter for email
     *
     * The email address of this contact.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * The email address of this contact.
     */
    public void setEmail(String value) {
        this.email = value;
    }


    private String phone;

    /**
     * Getter for phone
     *
     * The main phone number for this contact.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone
     *
     * The main phone number for this contact.
     */
    public void setPhone(String value) {
        this.phone = value;
    }


    private String mobile;

    /**
     * Getter for mobile
     *
     * The mobile phone number for this contact.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Setter for mobile
     *
     * The mobile phone number for this contact.
     */
    public void setMobile(String value) {
        this.mobile = value;
    }


    private String fax;

    /**
     * Getter for fax
     *
     * The facsimile phone number for this contact.
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Setter for fax
     *
     * The facsimile phone number for this contact.
     */
    public void setFax(String value) {
        this.fax = value;
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


    /**
     * Returns a JSON string representation of ContactModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
