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
 * Represents information about a newly created account
 */
public class NewAccountModel {


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * This is the ID number of the account that was created
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * This is the ID number of the account that was created
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private String accountDetailsEmailedTo;

    /**
     * Getter for accountDetailsEmailedTo
     *
     * This is the email address to which credentials were mailed
     */
    public String getAccountDetailsEmailedTo() {
        return this.accountDetailsEmailedTo;
    }

    /**
     * Setter for accountDetailsEmailedTo
     *
     * This is the email address to which credentials were mailed
     */
    public void setAccountDetailsEmailedTo(String value) {
        this.accountDetailsEmailedTo = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date and time when this account was created
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date and time when this account was created
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Date emailedDate;

    /**
     * Getter for emailedDate
     *
     * The date and time when account information was emailed to the user
     */
    public Date getEmailedDate() {
        return this.emailedDate;
    }

    /**
     * Setter for emailedDate
     *
     * The date and time when account information was emailed to the user
     */
    public void setEmailedDate(Date value) {
        this.emailedDate = value;
    }


    private String limitations;

    /**
     * Getter for limitations
     *
     * If this account includes any limitations, specify them here
     */
    public String getLimitations() {
        return this.limitations;
    }

    /**
     * Setter for limitations
     *
     * If this account includes any limitations, specify them here
     */
    public void setLimitations(String value) {
        this.limitations = value;
    }


    private String licenseKey;

    /**
     * Getter for licenseKey
     *
     * The license key of the account that was created
     */
    public String getLicenseKey() {
        return this.licenseKey;
    }

    /**
     * Setter for licenseKey
     *
     * The license key of the account that was created
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }


    private String paymentUrl;

    /**
     * Getter for paymentUrl
     *
     * The payment url where the payment method can be set up
     */
    public String getPaymentUrl() {
        return this.paymentUrl;
    }

    /**
     * Setter for paymentUrl
     *
     * The payment url where the payment method can be set up
     */
    public void setPaymentUrl(String value) {
        this.paymentUrl = value;
    }


    /**
     * Returns a JSON string representation of NewAccountModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
