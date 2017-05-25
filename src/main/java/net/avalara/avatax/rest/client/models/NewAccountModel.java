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


    private string accountDetailsEmailedTo;

    /**
     * Getter for accountDetailsEmailedTo
     *
     * This is the email address to which credentials were mailed
     */
    public string getAccountDetailsEmailedTo() {
        return this.accountDetailsEmailedTo;
    }

    /**
     * Setter for accountDetailsEmailedTo
     *
     * This is the email address to which credentials were mailed
     */
    public void setAccountDetailsEmailedTo(string value) {
        this.accountDetailsEmailedTo = value;
    }


    private Instant createdDate;

    /**
     * Getter for createdDate
     *
     * The date and time when this account was created
     */
    public Instant getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date and time when this account was created
     */
    public void setCreatedDate(Instant value) {
        this.createdDate = value;
    }


    private Instant emailedDate;

    /**
     * Getter for emailedDate
     *
     * The date and time when account information was emailed to the user
     */
    public Instant getEmailedDate() {
        return this.emailedDate;
    }

    /**
     * Setter for emailedDate
     *
     * The date and time when account information was emailed to the user
     */
    public void setEmailedDate(Instant value) {
        this.emailedDate = value;
    }


    private string limitations;

    /**
     * Getter for limitations
     *
     * If this account includes any limitations, specify them here
     */
    public string getLimitations() {
        return this.limitations;
    }

    /**
     * Setter for limitations
     *
     * If this account includes any limitations, specify them here
     */
    public void setLimitations(string value) {
        this.limitations = value;
    }


    /**
     * Returns a JSON string representation of NewAccountModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
