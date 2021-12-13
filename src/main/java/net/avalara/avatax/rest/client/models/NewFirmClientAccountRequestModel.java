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
 * Swagger name: AvaTaxClient
 */

/**
 * Represents a request for a new account with Avalara for a new Firm client.
 */
public class NewFirmClientAccountRequestModel {


    private String accountName;

    /**
     * Getter for accountName
     *
     * The name of the account to create
	 * 
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Setter for accountName
     *
     * The name of the account to create
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    private String firstName;

    /**
     * Getter for firstName
     *
     * First name of the primary contact person for this account
	 * 
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * First name of the primary contact person for this account
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    private String lastName;

    /**
     * Getter for lastName
     *
     * Last name of the primary contact person for this account
	 * 
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * Last name of the primary contact person for this account
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    private String title;

    /**
     * Getter for title
     *
     * Title of the primary contact person for this account
	 * 
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Title of the primary contact person for this account
     */
    public void setTitle(String value) {
        this.title = value;
    }

    private String phoneNumber;

    /**
     * Getter for phoneNumber
     *
     * Phone number of the primary contact person for this account
	 * 
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for phoneNumber
     *
     * Phone number of the primary contact person for this account
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    private String email;

    /**
     * Getter for email
     *
     * Email of the primary contact person for this account
	 * 
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * Email of the primary contact person for this account
     */
    public void setEmail(String value) {
        this.email = value;
    }

    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Company code to be assigned to the company created for this account.
    *  
    * If no company code is provided, this will be defaulted to "DEFAULT" company code.
	 * 
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company code to be assigned to the company created for this account.
    *  
    * If no company code is provided, this will be defaulted to "DEFAULT" company code.
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    private CompanyAddress companyAddress;

    /**
     * Getter for companyAddress
     *
     * 
	 * 
     */
    public CompanyAddress getCompanyAddress() {
        return this.companyAddress;
    }

    /**
     * Setter for companyAddress
     *
     * 
     */
    public void setCompanyAddress(CompanyAddress value) {
        this.companyAddress = value;
    }

    private String taxPayerIdNumber;

    /**
     * Getter for taxPayerIdNumber
     *
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your
    * Social Security Number if you are an individual.
    * This value is required if the address provided is inside the US. Otherwise it is optional.
	 * 
     */
    public String getTaxPayerIdNumber() {
        return this.taxPayerIdNumber;
    }

    /**
     * Setter for taxPayerIdNumber
     *
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your
    * Social Security Number if you are an individual.
    * This value is required if the address provided is inside the US. Otherwise it is optional.
     */
    public void setTaxPayerIdNumber(String value) {
        this.taxPayerIdNumber = value;
    }

    private ArrayList<String> properties;

    /**
     * Getter for properties
     *
     * Properties of the primary contact person for this account
	 * 
     */
    public ArrayList<String> getProperties() {
        return this.properties;
    }

    /**
     * Setter for properties
     *
     * Properties of the primary contact person for this account
     */
    public void setProperties(ArrayList<String> value) {
        this.properties = value;
    }

    /**
     * Returns a JSON string representation of NewFirmClientAccountRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
