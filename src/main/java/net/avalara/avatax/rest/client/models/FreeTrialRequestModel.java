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
 * Represents a request for a free trial account for AvaTax.
* Free trial accounts are only available on the Sandbox environment.
 */
public class FreeTrialRequestModel {


    private String firstName;

    /**
     * Getter for firstName
     *
     * The first or given name of the user requesting a free trial.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * The first or given name of the user requesting a free trial.
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    private String lastName;

    /**
     * Getter for lastName
     *
     * The last or family name of the user requesting a free trial.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * The last or family name of the user requesting a free trial.
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    private String email;

    /**
     * Getter for email
     *
     * The email address of the user requesting a free trial.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * The email address of the user requesting a free trial.
     */
    public void setEmail(String value) {
        this.email = value;
    }

    private String company;

    /**
     * Getter for company
     *
     * The company or organizational name for this free trial. If this account is for personal use, it is acceptable
    * to use your full name here.
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * Setter for company
     *
     * The company or organizational name for this free trial. If this account is for personal use, it is acceptable
    * to use your full name here.
     */
    public void setCompany(String value) {
        this.company = value;
    }

    private String phone;

    /**
     * Getter for phone
     *
     * The phone number of the person requesting the free trial.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone
     *
     * The phone number of the person requesting the free trial.
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    private String campaign;

    /**
     * Getter for campaign
     *
     * Campaign identifier for Notification purpose
     */
    public String getCampaign() {
        return this.campaign;
    }

    /**
     * Setter for campaign
     *
     * Campaign identifier for Notification purpose
     */
    public void setCampaign(String value) {
        this.campaign = value;
    }

    private CompanyAddress companyAddress;

    /**
     * Getter for companyAddress
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

    private String website;

    /**
     * Getter for website
     *
     * Website of the company or user requesting a free trial
     */
    public String getWebsite() {
        return this.website;
    }

    /**
     * Setter for website
     *
     * Website of the company or user requesting a free trial
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    private Boolean haveReadAvalaraTermsAndConditions;

    /**
     * Getter for haveReadAvalaraTermsAndConditions
     *
     * Read Avalara's terms and conditions is necessary for a free trial account
     */
    public Boolean getHaveReadAvalaraTermsAndConditions() {
        return this.haveReadAvalaraTermsAndConditions;
    }

    /**
     * Setter for haveReadAvalaraTermsAndConditions
     *
     * Read Avalara's terms and conditions is necessary for a free trial account
     */
    public void setHaveReadAvalaraTermsAndConditions(Boolean value) {
        this.haveReadAvalaraTermsAndConditions = value;
    }

    private Boolean acceptAvalaraTermsAndConditions;

    /**
     * Getter for acceptAvalaraTermsAndConditions
     *
     * Accept Avalara's terms and conditions is necessary for a free trial
     */
    public Boolean getAcceptAvalaraTermsAndConditions() {
        return this.acceptAvalaraTermsAndConditions;
    }

    /**
     * Setter for acceptAvalaraTermsAndConditions
     *
     * Accept Avalara's terms and conditions is necessary for a free trial
     */
    public void setAcceptAvalaraTermsAndConditions(Boolean value) {
        this.acceptAvalaraTermsAndConditions = value;
    }

    /**
     * Returns a JSON string representation of FreeTrialRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
