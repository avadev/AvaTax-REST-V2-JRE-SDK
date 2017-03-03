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
     * Getter for city - A contact person for a company.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - A contact person for a company.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String middleName;

    /**
     * Getter for middleName - A contact person for a company.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Setter for middleName - A contact person for a company.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    private String email;

    /**
     * Getter for email - A contact person for a company.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - A contact person for a company.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private String contactCode;

    /**
     * Getter for contactCode - A contact person for a company.
     */
    public String getContactCode() {
        return this.contactCode;
    }

    /**
     * Setter for contactCode - A contact person for a company.
     */
    public void setContactCode(String contactCode) {
        this.contactCode = contactCode;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - A contact person for a company.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - A contact person for a company.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String country;

    /**
     * Getter for country - A contact person for a company.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - A contact person for a company.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String line1;

    /**
     * Getter for line1 - A contact person for a company.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - A contact person for a company.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - A contact person for a company.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - A contact person for a company.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String lastName;

    /**
     * Getter for lastName - A contact person for a company.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - A contact person for a company.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - A contact person for a company.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - A contact person for a company.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private Integer id;

    /**
     * Getter for id - A contact person for a company.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - A contact person for a company.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String fax;

    /**
     * Getter for fax - A contact person for a company.
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Setter for fax - A contact person for a company.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - A contact person for a company.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - A contact person for a company.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - A contact person for a company.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - A contact person for a company.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - A contact person for a company.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - A contact person for a company.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - A contact person for a company.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - A contact person for a company.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private String title;

    /**
     * Getter for title - A contact person for a company.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title - A contact person for a company.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    
    private String mobile;

    /**
     * Getter for mobile - A contact person for a company.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Setter for mobile - A contact person for a company.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - A contact person for a company.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - A contact person for a company.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String phone;

    /**
     * Getter for phone - A contact person for a company.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone - A contact person for a company.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - A contact person for a company.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - A contact person for a company.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private String line3;

    /**
     * Getter for line3 - A contact person for a company.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - A contact person for a company.
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
    