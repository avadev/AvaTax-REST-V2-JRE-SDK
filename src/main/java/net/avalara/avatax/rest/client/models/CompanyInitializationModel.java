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
 * Company Initialization Model
 */
public class CompanyInitializationModel {


    private string name;

    /**
     * Getter for name
     *
     * Company Name
     */
    public string getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Company Name
     */
    public void setName(string value) {
        this.name = value;
    }


    private string companyCode;

    /**
     * Getter for companyCode
     *
     * Company Code - used to distinguish between companies within your accounting system
     */
    public string getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company Code - used to distinguish between companies within your accounting system
     */
    public void setCompanyCode(string value) {
        this.companyCode = value;
    }


    private string vatRegistrationId;

    /**
     * Getter for vatRegistrationId
     *
     * Vat Registration Id - leave blank if not known.
     */
    public string getVatRegistrationId() {
        return this.vatRegistrationId;
    }

    /**
     * Setter for vatRegistrationId
     *
     * Vat Registration Id - leave blank if not known.
     */
    public void setVatRegistrationId(string value) {
        this.vatRegistrationId = value;
    }


    private string taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber
     *
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
    * Social Security Number if you are an individual.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public string getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber
     *
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
    * Social Security Number if you are an individual.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public void setTaxpayerIdNumber(string value) {
        this.taxpayerIdNumber = value;
    }


    private string line1;

    /**
     * Getter for line1
     *
     * Address Line1
     */
    public string getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * Address Line1
     */
    public void setLine1(string value) {
        this.line1 = value;
    }


    private string line2;

    /**
     * Getter for line2
     *
     * Line2
     */
    public string getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * Line2
     */
    public void setLine2(string value) {
        this.line2 = value;
    }


    private string line3;

    /**
     * Getter for line3
     *
     * Line3
     */
    public string getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * Line3
     */
    public void setLine3(string value) {
        this.line3 = value;
    }


    private string city;

    /**
     * Getter for city
     *
     * City
     */
    public string getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City
     */
    public void setCity(string value) {
        this.city = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * Two character ISO 3166 Region code for this company's primary business location.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Two character ISO 3166 Region code for this company's primary business location.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string postalCode;

    /**
     * Getter for postalCode
     *
     * Postal Code
     */
    public string getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code
     */
    public void setPostalCode(string value) {
        this.postalCode = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * Two character ISO 3166 Country code for this company's primary business location.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Two character ISO 3166 Country code for this company's primary business location.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string firstName;

    /**
     * Getter for firstName
     *
     * First Name
     */
    public string getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * First Name
     */
    public void setFirstName(string value) {
        this.firstName = value;
    }


    private string lastName;

    /**
     * Getter for lastName
     *
     * Last Name
     */
    public string getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * Last Name
     */
    public void setLastName(string value) {
        this.lastName = value;
    }


    private string title;

    /**
     * Getter for title
     *
     * Title
     */
    public string getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Title
     */
    public void setTitle(string value) {
        this.title = value;
    }


    private string email;

    /**
     * Getter for email
     *
     * Email
     */
    public string getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * Email
     */
    public void setEmail(string value) {
        this.email = value;
    }


    private string phoneNumber;

    /**
     * Getter for phoneNumber
     *
     * Phone Number
     */
    public string getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber
     *
     * Phone Number
     */
    public void setPhoneNumber(string value) {
        this.phoneNumber = value;
    }


    private string mobileNumber;

    /**
     * Getter for mobileNumber
     *
     * Mobile Number
     */
    public string getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * Setter for mobileNumber
     *
     * Mobile Number
     */
    public void setMobileNumber(string value) {
        this.mobileNumber = value;
    }


    private string faxNumber;

    /**
     * Getter for faxNumber
     *
     * Fax Number
     */
    public string getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Setter for faxNumber
     *
     * Fax Number
     */
    public void setFaxNumber(string value) {
        this.faxNumber = value;
    }


    /**
     * Returns a JSON string representation of CompanyInitializationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
