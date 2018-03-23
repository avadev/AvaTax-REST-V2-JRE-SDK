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
 * Company Initialization Model
 */
public class CompanyInitializationModel {


    private String name;

    /**
     * Getter for name
     *
     * Company Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Company Name
     */
    public void setName(String value) {
        this.name = value;
    }


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Company Code - used to distinguish between companies within your accounting system
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company Code - used to distinguish between companies within your accounting system
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }


    private String vatRegistrationId;

    /**
     * Getter for vatRegistrationId
     *
     * Vat Registration Id - leave blank if not known.
     */
    public String getVatRegistrationId() {
        return this.vatRegistrationId;
    }

    /**
     * Setter for vatRegistrationId
     *
     * Vat Registration Id - leave blank if not known.
     */
    public void setVatRegistrationId(String value) {
        this.vatRegistrationId = value;
    }


    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber
     *
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
    * Social Security Number if you are an individual.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public String getTaxpayerIdNumber() {
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
    public void setTaxpayerIdNumber(String value) {
        this.taxpayerIdNumber = value;
    }


    private String line1;

    /**
     * Getter for line1
     *
     * Address Line1
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * Address Line1
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String line2;

    /**
     * Getter for line2
     *
     * Line2
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * Line2
     */
    public void setLine2(String value) {
        this.line2 = value;
    }


    private String line3;

    /**
     * Getter for line3
     *
     * Line3
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3
     *
     * Line3
     */
    public void setLine3(String value) {
        this.line3 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City
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
     * Postal Code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code
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


    private String firstName;

    /**
     * Getter for firstName
     *
     * First Name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * First Name
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }


    private String lastName;

    /**
     * Getter for lastName
     *
     * Last Name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * Last Name
     */
    public void setLastName(String value) {
        this.lastName = value;
    }


    private String title;

    /**
     * Getter for title
     *
     * Title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Title
     */
    public void setTitle(String value) {
        this.title = value;
    }


    private String email;

    /**
     * Getter for email
     *
     * Email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * Email
     */
    public void setEmail(String value) {
        this.email = value;
    }


    private String phoneNumber;

    /**
     * Getter for phoneNumber
     *
     * Phone Number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber
     *
     * Phone Number
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }


    private String mobileNumber;

    /**
     * Getter for mobileNumber
     *
     * Mobile Number
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * Setter for mobileNumber
     *
     * Mobile Number
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }


    private String faxNumber;

    /**
     * Getter for faxNumber
     *
     * Fax Number
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Setter for faxNumber
     *
     * Fax Number
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }


    private Integer parentCompanyId;

    /**
     * Getter for parentCompanyId
     *
     * Parent Company ID
     */
    public Integer getParentCompanyId() {
        return this.parentCompanyId;
    }

    /**
     * Setter for parentCompanyId
     *
     * Parent Company ID
     */
    public void setParentCompanyId(Integer value) {
        this.parentCompanyId = value;
    }


    /**
     * Returns a JSON string representation of CompanyInitializationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
