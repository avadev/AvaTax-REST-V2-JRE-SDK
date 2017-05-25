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
 * A contact person for a company.
 */
public class ContactModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this contact.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this contact.
     */
    public void setId(int value) {
        this.id = value;
    }


    private int companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which this contact belongs.
     */
    public int getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which this contact belongs.
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }


    private string contactCode;

    /**
     * Getter for contactCode
     *
     * A unique code for this contact.
     */
    public string getContactCode() {
        return this.contactCode;
    }

    /**
     * Setter for contactCode
     *
     * A unique code for this contact.
     */
    public void setContactCode(string value) {
        this.contactCode = value;
    }


    private string firstName;

    /**
     * Getter for firstName
     *
     * The first or given name of this contact.
     */
    public string getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * The first or given name of this contact.
     */
    public void setFirstName(string value) {
        this.firstName = value;
    }


    private string middleName;

    /**
     * Getter for middleName
     *
     * The middle name of this contact.
     */
    public string getMiddleName() {
        return this.middleName;
    }

    /**
     * Setter for middleName
     *
     * The middle name of this contact.
     */
    public void setMiddleName(string value) {
        this.middleName = value;
    }


    private string lastName;

    /**
     * Getter for lastName
     *
     * The last or family name of this contact.
     */
    public string getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * The last or family name of this contact.
     */
    public void setLastName(string value) {
        this.lastName = value;
    }


    private string title;

    /**
     * Getter for title
     *
     * Professional title of this contact.
     */
    public string getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Professional title of this contact.
     */
    public void setTitle(string value) {
        this.title = value;
    }


    private string line1;

    /**
     * Getter for line1
     *
     * The first line of the postal mailing address of this contact.
     */
    public string getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The first line of the postal mailing address of this contact.
     */
    public void setLine1(string value) {
        this.line1 = value;
    }


    private string line2;

    /**
     * Getter for line2
     *
     * The second line of the postal mailing address of this contact.
     */
    public string getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * The second line of the postal mailing address of this contact.
     */
    public void setLine2(string value) {
        this.line2 = value;
    }


    private string line3;

    /**
     * Getter for line3
     *
     * The third line of the postal mailing address of this contact.
     */
    public string getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * The third line of the postal mailing address of this contact.
     */
    public void setLine3(string value) {
        this.line3 = value;
    }


    private string city;

    /**
     * Getter for city
     *
     * The city of the postal mailing address of this contact.
     */
    public string getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city of the postal mailing address of this contact.
     */
    public void setCity(string value) {
        this.city = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The state, region, or province of the postal mailing address of this contact.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The state, region, or province of the postal mailing address of this contact.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code or zip code of the postal mailing address of this contact.
     */
    public string getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code or zip code of the postal mailing address of this contact.
     */
    public void setPostalCode(string value) {
        this.postalCode = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The ISO 3166 two-character country code of the postal mailing address of this contact.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The ISO 3166 two-character country code of the postal mailing address of this contact.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string email;

    /**
     * Getter for email
     *
     * The email address of this contact.
     */
    public string getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * The email address of this contact.
     */
    public void setEmail(string value) {
        this.email = value;
    }


    private string phone;

    /**
     * Getter for phone
     *
     * The main phone number for this contact.
     */
    public string getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone
     *
     * The main phone number for this contact.
     */
    public void setPhone(string value) {
        this.phone = value;
    }


    private string mobile;

    /**
     * Getter for mobile
     *
     * The mobile phone number for this contact.
     */
    public string getMobile() {
        return this.mobile;
    }

    /**
     * Setter for mobile
     *
     * The mobile phone number for this contact.
     */
    public void setMobile(string value) {
        this.mobile = value;
    }


    private string fax;

    /**
     * Getter for fax
     *
     * The facsimile phone number for this contact.
     */
    public string getFax() {
        return this.fax;
    }

    /**
     * Setter for fax
     *
     * The facsimile phone number for this contact.
     */
    public void setFax(string value) {
        this.fax = value;
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


    /**
     * Returns a JSON string representation of ContactModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
