package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Company Initialization Model
 */
public class CompanyInitializationModel {
    private String city;

    /**
     * Getter for city - City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - City
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String name;

    /**
     * Getter for name - Company Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Company Name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String phoneNumber;

    /**
     * Getter for phoneNumber - Phone Number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber - Phone Number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    private String email;

    /**
     * Getter for email - Email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private String vatRegistrationId;

    /**
     * Getter for vatRegistrationId - Vat Registration Id - leave blank if not known.
     */
    public String getVatRegistrationId() {
        return this.vatRegistrationId;
    }

    /**
     * Setter for vatRegistrationId - Vat Registration Id - leave blank if not known.
     */
    public void setVatRegistrationId(String vatRegistrationId) {
        this.vatRegistrationId = vatRegistrationId;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Company Code - used to distinguish between companies within your accounting system
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Company Code - used to distinguish between companies within your accounting system
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private String country;

    /**
     * Getter for country - Two character ISO 3166 Country code for this company's primary business location.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Two character ISO 3166 Country code for this company's primary business location.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber - United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
            Social Security Number if you are an individual.
            This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
            but it is optional if you do not subscribe to either of those services.
     */
    public String getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber - United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
            Social Security Number if you are an individual.
            This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
            but it is optional if you do not subscribe to either of those services.
     */
    public void setTaxpayerIdNumber(String taxpayerIdNumber) {
        this.taxpayerIdNumber = taxpayerIdNumber;
    }

    
    private String line1;

    /**
     * Getter for line1 - Address Line1
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - Address Line1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String mobileNumber;

    /**
     * Getter for mobileNumber - Mobile Number
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * Setter for mobileNumber - Mobile Number
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - Postal Code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - Postal Code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String lastName;

    /**
     * Getter for lastName - Last Name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - Last Name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - First Name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - First Name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private String region;

    /**
     * Getter for region - Two character ISO 3166 Region code for this company's primary business location.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Two character ISO 3166 Region code for this company's primary business location.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - Line2
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - Line2
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private String title;

    /**
     * Getter for title - Title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title - Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    
    private String faxNumber;

    /**
     * Getter for faxNumber - Fax Number
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Setter for faxNumber - Fax Number
     */
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    
    private String line3;

    /**
     * Getter for line3 - Line3
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - Line3
     */
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    


    /**
     * Returns a JSON string representation of CompanyInitializationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    