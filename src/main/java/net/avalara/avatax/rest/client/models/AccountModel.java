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
 * An AvaTax account.
 */
public class AccountModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number assigned to this account.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number assigned to this account.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The name of this account.
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The name of this account.
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The earliest date on which this account may be used.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The earliest date on which this account may be used.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * If this account has been closed, this is the last date the account was open.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * If this account has been closed, this is the last date the account was open.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private AccountStatusId? accountStatusId;

    /**
     * Getter for accountStatusId;
     * The current status of this account.
     */
    public AccountStatusId? getaccountStatusId() {;
        return this.accountStatusId;;
    }

    /**
     * Setter for accountStatusId;
     * The current status of this account.
     */
    public void setaccountStatusId(AccountStatusId? value) {;
        this.accountStatusId = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private List<SubscriptionModel> subscriptions;

    /**
     * Getter for subscriptions;
     * Optional: A list of subscriptions granted to this account. To fetch this list, add the query string "?$include=Subscriptions" to your URL.
     */
    public List<SubscriptionModel> getsubscriptions() {;
        return this.subscriptions;;
    }

    /**
     * Setter for subscriptions;
     * Optional: A list of subscriptions granted to this account. To fetch this list, add the query string "?$include=Subscriptions" to your URL.
     */
    public void setsubscriptions(List<SubscriptionModel> value) {;
        this.subscriptions = value;;
    }


    private List<UserModel> users;

    /**
     * Getter for users;
     * Optional: A list of all the users belonging to this account. To fetch this list, add the query string "?$include=Users" to your URL.
     */
    public List<UserModel> getusers() {;
        return this.users;;
    }

    /**
     * Setter for users;
     * Optional: A list of all the users belonging to this account. To fetch this list, add the query string "?$include=Users" to your URL.
     */
    public void setusers(List<UserModel> value) {;
        this.users = value;;
    }


    /**
     * Returns a JSON string representation of AccountModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
