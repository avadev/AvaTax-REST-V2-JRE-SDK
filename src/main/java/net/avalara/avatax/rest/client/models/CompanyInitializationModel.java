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
     * Getter for city - Company Initialization Model
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - Company Initialization Model
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String name;

    /**
     * Getter for name - Company Initialization Model
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Company Initialization Model
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String phoneNumber;

    /**
     * Getter for phoneNumber - Company Initialization Model
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber - Company Initialization Model
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    private String email;

    /**
     * Getter for email - Company Initialization Model
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Company Initialization Model
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private String vatRegistrationId;

    /**
     * Getter for vatRegistrationId - Company Initialization Model
     */
    public String getVatRegistrationId() {
        return this.vatRegistrationId;
    }

    /**
     * Setter for vatRegistrationId - Company Initialization Model
     */
    public void setVatRegistrationId(String vatRegistrationId) {
        this.vatRegistrationId = vatRegistrationId;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Company Initialization Model
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Company Initialization Model
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private String country;

    /**
     * Getter for country - Company Initialization Model
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Company Initialization Model
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber - Company Initialization Model
     */
    public String getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber - Company Initialization Model
     */
    public void setTaxpayerIdNumber(String taxpayerIdNumber) {
        this.taxpayerIdNumber = taxpayerIdNumber;
    }

    
    private String line1;

    /**
     * Getter for line1 - Company Initialization Model
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - Company Initialization Model
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String mobileNumber;

    /**
     * Getter for mobileNumber - Company Initialization Model
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * Setter for mobileNumber - Company Initialization Model
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - Company Initialization Model
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - Company Initialization Model
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String lastName;

    /**
     * Getter for lastName - Company Initialization Model
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - Company Initialization Model
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - Company Initialization Model
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - Company Initialization Model
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private String region;

    /**
     * Getter for region - Company Initialization Model
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Company Initialization Model
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - Company Initialization Model
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - Company Initialization Model
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private String title;

    /**
     * Getter for title - Company Initialization Model
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title - Company Initialization Model
     */
    public void setTitle(String title) {
        this.title = title;
    }

    
    private String faxNumber;

    /**
     * Getter for faxNumber - Company Initialization Model
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Setter for faxNumber - Company Initialization Model
     */
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    
    private String line3;

    /**
     * Getter for line3 - Company Initialization Model
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - Company Initialization Model
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
    