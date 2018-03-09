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
 * Represents a customer to whom you sell products and/or services.
 */
public class CustomerModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique ID number of this customer.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number of this customer.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the AvaTax company that recorded this customer.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the AvaTax company that recorded this customer.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String customerCode;

    /**
     * Getter for customerCode
     *
     * The unique code identifying this customer. Must be unique within your company.
    * 
    * This code should be used in the `customerCode` field of any call that creates or adjusts a transaction
    * in order to ensure that all exemptions that apply to this customer are correctly considered.
    * 
    * Note: This field is case sensitive.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * The unique code identifying this customer. Must be unique within your company.
    * 
    * This code should be used in the `customerCode` field of any call that creates or adjusts a transaction
    * in order to ensure that all exemptions that apply to this customer are correctly considered.
    * 
    * Note: This field is case sensitive.
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }


    private String alternateId;

    /**
     * Getter for alternateId
     *
     * A customer-configurable alternate ID number for this customer. You may set this value to match any
    * other system that would like to reference this customer record.
     */
    public String getAlternateId() {
        return this.alternateId;
    }

    /**
     * Setter for alternateId
     *
     * A customer-configurable alternate ID number for this customer. You may set this value to match any
    * other system that would like to reference this customer record.
     */
    public void setAlternateId(String value) {
        this.alternateId = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * A friendly name identifying this customer.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A friendly name identifying this customer.
     */
    public void setName(String value) {
        this.name = value;
    }


    private String attnName;

    /**
     * Getter for attnName
     *
     * Indicates the "Attn:" component of the address for this customer, if this customer requires mailings to be shipped 
    * to the attention of a specific person or department name.
     */
    public String getAttnName() {
        return this.attnName;
    }

    /**
     * Setter for attnName
     *
     * Indicates the "Attn:" component of the address for this customer, if this customer requires mailings to be shipped 
    * to the attention of a specific person or department name.
     */
    public void setAttnName(String value) {
        this.attnName = value;
    }


    private String line1;

    /**
     * Getter for line1
     *
     * First line of the street address of this customer.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * First line of the street address of this customer.
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String line2;

    /**
     * Getter for line2
     *
     * Second line of the street address of this customer.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * Second line of the street address of this customer.
     */
    public void setLine2(String value) {
        this.line2 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * City component of the street address of this customer.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City component of the street address of this customer.
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * Postal Code / Zip Code component of the address of this customer.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code / Zip Code component of the address of this customer.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private String phoneNumber;

    /**
     * Getter for phoneNumber
     *
     * The main phone number for this customer.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber
     *
     * The main phone number for this customer.
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }


    private String faxNumber;

    /**
     * Getter for faxNumber
     *
     * The fax phone number for this customer, if any.
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Setter for faxNumber
     *
     * The fax phone number for this customer, if any.
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }


    private String emailAddress;

    /**
     * Getter for emailAddress
     *
     * The main email address for this customer.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Setter for emailAddress
     *
     * The main email address for this customer.
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }


    private String contactName;

    /**
     * Getter for contactName
     *
     * The name of the main contact person for this customer.
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * Setter for contactName
     *
     * The name of the main contact person for this customer.
     */
    public void setContactName(String value) {
        this.contactName = value;
    }


    private Date lastTransaction;

    /**
     * Getter for lastTransaction
     *
     * Date when this customer last executed a transaction.
     */
    public Date getLastTransaction() {
        return this.lastTransaction;
    }

    /**
     * Setter for lastTransaction
     *
     * Date when this customer last executed a transaction.
     */
    public void setLastTransaction(Date value) {
        this.lastTransaction = value;
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


    private Boolean isBill;

    /**
     * Getter for isBill
     *
     * True if this customer record is specifically used for bill-to purposes.
     */
    public Boolean getIsBill() {
        return this.isBill;
    }

    /**
     * Setter for isBill
     *
     * True if this customer record is specifically used for bill-to purposes.
     */
    public void setIsBill(Boolean value) {
        this.isBill = value;
    }


    private Boolean isShip;

    /**
     * Getter for isShip
     *
     * True if this customer record is specifically used for ship-to purposes.
     */
    public Boolean getIsShip() {
        return this.isShip;
    }

    /**
     * Setter for isShip
     *
     * True if this customer record is specifically used for ship-to purposes.
     */
    public void setIsShip(Boolean value) {
        this.isShip = value;
    }


    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber
     *
     * For customers in the United States, this field is the federal taxpayer ID number. For businesses, this is 
    * a Federal Employer Identification Number. For individuals, this will be a Social Security Number.
     */
    public String getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber
     *
     * For customers in the United States, this field is the federal taxpayer ID number. For businesses, this is 
    * a Federal Employer Identification Number. For individuals, this will be a Social Security Number.
     */
    public void setTaxpayerIdNumber(String value) {
        this.taxpayerIdNumber = value;
    }


    private ArrayList<CertificateModel> certificates;

    /**
     * Getter for certificates
     *
     * A list of exemption certficates that apply to this customer. You can fetch this data by specifying 
    * `$include=certificates` when calling a customer fetch API.
     */
    public ArrayList<CertificateModel> getCertificates() {
        return this.certificates;
    }

    /**
     * Setter for certificates
     *
     * A list of exemption certficates that apply to this customer. You can fetch this data by specifying 
    * `$include=certificates` when calling a customer fetch API.
     */
    public void setCertificates(ArrayList<CertificateModel> value) {
        this.certificates = value;
    }


    /**
     * Returns a JSON string representation of CustomerModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
