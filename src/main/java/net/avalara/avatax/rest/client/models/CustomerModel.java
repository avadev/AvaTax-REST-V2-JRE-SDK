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
     * Unique ID number assigned to each company by Avalara.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number assigned to each company by Avalara.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the AvaTax company that maintains this customer record.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the AvaTax company that maintains this customer record.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private Integer clientId;

    /**
     * Getter for clientId
     *
     * TODO
     */
    public Integer getClientId() {
        return this.clientId;
    }

    /**
     * Setter for clientId
     *
     * TODO
     */
    public void setClientId(Integer value) {
        this.clientId = value;
    }


    private String customerNumber;

    /**
     * Getter for customerNumber
     *
     * A number by which this customer is known by your system. Must be unique within your company.
     */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * Setter for customerNumber
     *
     * A number by which this customer is known by your system. Must be unique within your company.
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }


    private String alternateId;

    /**
     * Getter for alternateId
     *
     * Alternate Id
     */
    public String getAlternateId() {
        return this.alternateId;
    }

    /**
     * Setter for alternateId
     *
     * Alternate Id
     */
    public void setAlternateId(String value) {
        this.alternateId = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * Customer name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Customer name
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
     * First line of the street address
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * First line of the street address
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String line2;

    /**
     * Getter for line2
     *
     * Second line of the street address
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * Second line of the street address
     */
    public void setLine2(String value) {
        this.line2 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * City component of the address
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City component of the address
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * Postal Code / Zip Code component of the address.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal Code / Zip Code component of the address.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private String phoneNumber;

    /**
     * Getter for phoneNumber
     *
     * Customer phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber
     *
     * Customer phone number
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }


    private String faxNumber;

    /**
     * Getter for faxNumber
     *
     * Customer fax number
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Setter for faxNumber
     *
     * Customer fax number
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }


    private String emailAddress;

    /**
     * Getter for emailAddress
     *
     * Customer email
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Setter for emailAddress
     *
     * Customer email
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }


    private String contactName;

    /**
     * Getter for contactName
     *
     * Customer contact name
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * Setter for contactName
     *
     * Customer contact name
     */
    public void setContactName(String value) {
        this.contactName = value;
    }


    private Date lastTransaction;

    /**
     * Getter for lastTransaction
     *
     * When last transaction was happened,
     */
    public Date getLastTransaction() {
        return this.lastTransaction;
    }

    /**
     * Setter for lastTransaction
     *
     * When last transaction was happened,
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
     * Two character ISO 3166 county code for this country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Two character ISO 3166 county code for this country
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Two or three character ISO 3166 region, province, or state name
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Two or three character ISO 3166 region, province, or state name
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private Boolean isBill;

    /**
     * Getter for isBill
     *
     * TODO
     */
    public Boolean getIsBill() {
        return this.isBill;
    }

    /**
     * Setter for isBill
     *
     * TODO
     */
    public void setIsBill(Boolean value) {
        this.isBill = value;
    }


    private Boolean isShip;

    /**
     * Getter for isShip
     *
     * TODO
     */
    public Boolean getIsShip() {
        return this.isShip;
    }

    /**
     * Setter for isShip
     *
     * TODO
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
     * A list of exemption certficates that apply to this customer.
     */
    public ArrayList<CertificateModel> getCertificates() {
        return this.certificates;
    }

    /**
     * Setter for certificates
     *
     * A list of exemption certficates that apply to this customer.
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
