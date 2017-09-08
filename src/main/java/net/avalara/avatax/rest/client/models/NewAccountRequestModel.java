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
 * Represents a request for a new account with Avalara for a new subscriber.
* Contains information about the account requested and the rate plan selected.
 */
public class NewAccountRequestModel {


    private String offer;

    /**
     * Getter for offer
     *
     * Offer with which the partner account needs to be created
     */
    public String getOffer() {
        return this.offer;
    }

    /**
     * Setter for offer
     *
     * Offer with which the partner account needs to be created
     */
    public void setOffer(String value) {
        this.offer = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date on which the account should take effect. If null, defaults to today.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date on which the account should take effect. If null, defaults to today.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date on which the account should expire. If null, defaults to a 90-day trial account.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date on which the account should expire. If null, defaults to a 90-day trial account.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String accountName;

    /**
     * Getter for accountName
     *
     * Account Name
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Setter for accountName
     *
     * Account Name
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }


    private String website;

    /**
     * Getter for website
     *
     * Website of the partner account being created
     */
    public String getWebsite() {
        return this.website;
    }

    /**
     * Setter for website
     *
     * Website of the partner account being created
     */
    public void setWebsite(String value) {
        this.website = value;
    }


    private String firstName;

    /**
     * Getter for firstName
     *
     * First Name of the primary contact person for this account
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * First Name of the primary contact person for this account
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }


    private String lastName;

    /**
     * Getter for lastName
     *
     * Last Name of the primary contact person for this account
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * Last Name of the primary contact person for this account
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
     * If no password is supplied, an a tempoarary password is generated by the system and emailed to the user. The user will 
    * be challenged to change this password upon logging in to the Admin Console. If supplied, will be the set password for 
    * the default created user, and the user will not be challenged to change their password upon login to the Admin Console.
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * Setter for userPassword
     *
     * If no password is supplied, an a tempoarary password is generated by the system and emailed to the user. The user will 
    * be challenged to change this password upon logging in to the Admin Console. If supplied, will be the set password for 
    * the default created user, and the user will not be challenged to change their password upon login to the Admin Console.
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }


    private WelcomeEmail welcomeEmail;

    /**
     * Getter for welcomeEmail
     *
     * Normal - If a welcome email needs to be generated for the user.
    * Suppressed - If no welcome email needs to be generated for the user.
    * Custom - If a custom welcome email needs to be generated for the user.
     */
    public WelcomeEmail getWelcomeEmail() {
        return this.welcomeEmail;
    }

    /**
     * Setter for welcomeEmail
     *
     * Normal - If a welcome email needs to be generated for the user.
    * Suppressed - If no welcome email needs to be generated for the user.
    * Custom - If a custom welcome email needs to be generated for the user.
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
     */
    public Boolean getAcceptAvalaraTermsAndConditions() {
        return this.acceptAvalaraTermsAndConditions;
    }

    /**
     * Setter for acceptAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account accepts Avalara's terms and conditions for your account.
     */
    public void setAcceptAvalaraTermsAndConditions(Boolean value) {
        this.acceptAvalaraTermsAndConditions = value;
    }


    private Boolean haveReadAvalaraTermsAndConditions;

    /**
     * Getter for haveReadAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account has fully read Avalara's terms and conditions for your account.
     */
    public Boolean getHaveReadAvalaraTermsAndConditions() {
        return this.haveReadAvalaraTermsAndConditions;
    }

    /**
     * Setter for haveReadAvalaraTermsAndConditions
     *
     * Set this to true if and only if the owner of the newly created account has fully read Avalara's terms and conditions for your account.
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
