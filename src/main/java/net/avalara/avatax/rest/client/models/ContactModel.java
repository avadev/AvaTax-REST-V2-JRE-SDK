package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A contact person for a company.
 */
public class ContactModel {
    private String city;

    /**
     * Getter for city - The city of the postal mailing address of this contact.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - The city of the postal mailing address of this contact.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String middleName;

    /**
     * Getter for middleName - The middle name of this contact.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Setter for middleName - The middle name of this contact.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    private String email;

    /**
     * Getter for email - The email address of this contact.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - The email address of this contact.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private String contactCode;

    /**
     * Getter for contactCode - A unique code for this contact.
     */
    public String getContactCode() {
        return this.contactCode;
    }

    /**
     * Setter for contactCode - A unique code for this contact.
     */
    public void setContactCode(String contactCode) {
        this.contactCode = contactCode;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String country;

    /**
     * Getter for country - The ISO 3166 two-character country code of the postal mailing address of this contact.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The ISO 3166 two-character country code of the postal mailing address of this contact.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String line1;

    /**
     * Getter for line1 - The first line of the postal mailing address of this contact.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - The first line of the postal mailing address of this contact.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - The postal code or zip code of the postal mailing address of this contact.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - The postal code or zip code of the postal mailing address of this contact.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String lastName;

    /**
     * Getter for lastName - The last or family name of this contact.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - The last or family name of this contact.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - The first or given name of this contact.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - The first or given name of this contact.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this contact.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this contact.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String fax;

    /**
     * Getter for fax - The facsimile phone number for this contact.
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Setter for fax - The facsimile phone number for this contact.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - The state, region, or province of the postal mailing address of this contact.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The state, region, or province of the postal mailing address of this contact.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - The second line of the postal mailing address of this contact.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - The second line of the postal mailing address of this contact.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private String title;

    /**
     * Getter for title - Professional title of this contact.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title - Professional title of this contact.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    
    private String mobile;

    /**
     * Getter for mobile - The mobile phone number for this contact.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Setter for mobile - The mobile phone number for this contact.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company to which this contact belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company to which this contact belongs.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String phone;

    /**
     * Getter for phone - The main phone number for this contact.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone - The main phone number for this contact.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private String line3;

    /**
     * Getter for line3 - The third line of the postal mailing address of this contact.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - The third line of the postal mailing address of this contact.
     */
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    


    /**
     * Returns a JSON string representation of ContactModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    