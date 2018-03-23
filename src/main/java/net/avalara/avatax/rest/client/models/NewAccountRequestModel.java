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
 * Represents a request for a new account with Avalara for a new subscriber.
* Contains information about the account requested and the rate plan selected.
 */
public class NewAccountRequestModel {


    private String offer;

    /**
     * Getter for offer
     *
     * The offer code provided to you by your Avalara business development contact. 
    * 
    * This code controls what services and rates the customer will be provisioned with upon creation.
    * 
    * If you do not know your offer code, please contact your Avalara business development representative.
     */
    public String getOffer() {
        return this.offer;
    }

    /**
     * Setter for offer
     *
     * The offer code provided to you by your Avalara business development contact. 
    * 
    * This code controls what services and rates the customer will be provisioned with upon creation.
    * 
    * If you do not know your offer code, please contact your Avalara business development representative.
     */
    public void setOffer(String value) {
        this.offer = value;
    }


    private String campaign;

    /**
     * Getter for campaign
     *
     * If your Avalara business development representative requests, please provide the campaign ID associated with your
    * signup process. This campaign identifier helps Avalara match users to the context in which they learned about the product
    * to help improve the accuracy of our messaging.
    *  
    * The `campaign` field must be either null or a value provided to you by an Avalara business development representative.
    * If you provide an unexpected value in this field, your API call will fail.
     */
    public String getCampaign() {
        return this.campaign;
    }

    /**
     * Setter for campaign
     *
     * If your Avalara business development representative requests, please provide the campaign ID associated with your
    * signup process. This campaign identifier helps Avalara match users to the context in which they learned about the product
    * to help improve the accuracy of our messaging.
    *  
    * The `campaign` field must be either null or a value provided to you by an Avalara business development representative.
    * If you provide an unexpected value in this field, your API call will fail.
     */
    public void setCampaign(String value) {
        this.campaign = value;
    }


    private String leadSource;

    /**
     * Getter for leadSource
     *
     * If your Avalara business development representative requests, please provide the lead source value associated with your
    * signup process. This lead source identifier helps Avalara match users to the context in which they learned about the product
    * to help improve the accuracy of our messaging.
    *  
    * The `leadSource` field must be either null or a value provided to you by an Avalara business development representative.
    * If you provide an unexpected value in this field, your API call will fail.
     */
    public String getLeadSource() {
        return this.leadSource;
    }

    /**
     * Setter for leadSource
     *
     * If your Avalara business development representative requests, please provide the lead source value associated with your
    * signup process. This lead source identifier helps Avalara match users to the context in which they learned about the product
    * to help improve the accuracy of our messaging.
    *  
    * The `leadSource` field must be either null or a value provided to you by an Avalara business development representative.
    * If you provide an unexpected value in this field, your API call will fail.
     */
    public void setLeadSource(String value) {
        this.leadSource = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date on which the account should take effect. If null, defaults to today.
    * 
    * You should leave this value `null` unless specifically requested by your Avalara business development manager.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date on which the account should take effect. If null, defaults to today.
    * 
    * You should leave this value `null` unless specifically requested by your Avalara business development manager.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date on which the account should expire.
    * 
    * You should leave this value `null` unless specifically requested by your Avalara business development manager.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date on which the account should expire.
    * 
    * You should leave this value `null` unless specifically requested by your Avalara business development manager.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String accountName;

    /**
     * Getter for accountName
     *
     * The name of the account to create
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


    private String website;

    /**
     * Getter for website
     *
     * Website of the new customer whose account is being created. 
    * 
    * It is strongly recommended to provide the customer's website URL, as this will help our support representatives better
    * assist customers.
     */
    public String getWebsite() {
        return this.website;
    }

    /**
     * Setter for website
     *
     * Website of the new customer whose account is being created. 
    * 
    * It is strongly recommended to provide the customer's website URL, as this will help our support representatives better
    * assist customers.
     */
    public void setWebsite(String value) {
        this.website = value;
    }


    private String paymentMethodId;

    /**
     * Getter for paymentMethodId
     *
     * Payment Method to be associated with the account.
    * 
    * This is strictly to be used internally unless your Avalara business development manager specifically asks you to provide this value
    * while attempting to create an account.
     */
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /**
     * Setter for paymentMethodId
     *
     * Payment Method to be associated with the account.
    * 
    * This is strictly to be used internally unless your Avalara business development manager specifically asks you to provide this value
    * while attempting to create an account.
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }


    private String firstName;

    /**
     * Getter for firstName
     *
     * First name of the primary contact person for this account
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


    private String userPassword;

    /**
     * Getter for userPassword
     *
     * If instructed by your Avalara business development manager, set this value to a temporary password to permit the user to continue their onboarding process.
    * 
    * If this value is null, a temporary password is generated by the system and emailed to the user. 
    * 
    * The user will then be asked to choose a permanent password when they first log on to the AvaTax website.
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * Setter for userPassword
     *
     * If instructed by your Avalara business development manager, set this value to a temporary password to permit the user to continue their onboarding process.
    * 
    * If this value is null, a temporary password is generated by the system and emailed to the user. 
    * 
    * The user will then be asked to choose a permanent password when they first log on to the AvaTax website.
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }


    private WelcomeEmail welcomeEmail;

    /**
     * Getter for welcomeEmail
     *
     * This option controls what type of a welcome email is sent when the account is created.
    * 
    * * `Normal` - A standard welcome email will be sent.
    * * `Suppressed` - No email will be sent.
    * * `Custom` - If your Avalara business development representative provides you with a customized welcome email for your customers, please select this option.
     */
    public WelcomeEmail getWelcomeEmail() {
        return this.welcomeEmail;
    }

    /**
     * Setter for welcomeEmail
     *
     * This option controls what type of a welcome email is sent when the account is created.
    * 
    * * `Normal` - A standard welcome email will be sent.
    * * `Suppressed` - No email will be sent.
    * * `Custom` - If your Avalara business development representative provides you with a customized welcome email for your customers, please select this option.
     */
    public void setWelcomeEmail(WelcomeEmail value) {
        this.welcomeEmail = value;
    }


    private CompanyAddress companyAddress;

    /**
     * Getter for companyAddress
     *
     * Address information of the account being created.
     */
    public CompanyAddress getCompanyAddress() {
        return this.companyAddress;
    }

    /**
     * Setter for companyAddress
     *
     * Address information of the account being created.
     */
    public void setCompanyAddress(CompanyAddress value) {
        this.companyAddress = value;
    }


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Company code to be assigned to the company created for this account.
    * 
    * If no company code is provided, this will be defaulted to "DEFAULT" company code.
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


    private ArrayList<String> properties;

    /**
     * Getter for properties
     *
     * Properties of the primary contact person for this account
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


    private Boolean acceptAvalaraTermsAndConditions;

    /**
     * Getter for acceptAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account accepts Avalara's terms and conditions for your account.
    * 
    * Reading and accepting Avalara's terms and conditions is necessary in order for the account to receive a license key.
     */
    public Boolean getAcceptAvalaraTermsAndConditions() {
        return this.acceptAvalaraTermsAndConditions;
    }

    /**
     * Setter for acceptAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account accepts Avalara's terms and conditions for your account.
    * 
    * Reading and accepting Avalara's terms and conditions is necessary in order for the account to receive a license key.
     */
    public void setAcceptAvalaraTermsAndConditions(Boolean value) {
        this.acceptAvalaraTermsAndConditions = value;
    }


    private Boolean haveReadAvalaraTermsAndConditions;

    /**
     * Getter for haveReadAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account has fully read Avalara's terms and conditions for your account.
    * 
    * Reading and accepting Avalara's terms and conditions is necessary in order for the account to receive a license key.
     */
    public Boolean getHaveReadAvalaraTermsAndConditions() {
        return this.haveReadAvalaraTermsAndConditions;
    }

    /**
     * Setter for haveReadAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account has fully read Avalara's terms and conditions for your account.
    * 
    * Reading and accepting Avalara's terms and conditions is necessary in order for the account to receive a license key.
     */
    public void setHaveReadAvalaraTermsAndConditions(Boolean value) {
        this.haveReadAvalaraTermsAndConditions = value;
    }


    /**
     * Returns a JSON string representation of NewAccountRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
