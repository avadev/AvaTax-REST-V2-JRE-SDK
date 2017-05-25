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
 * Represents a service that this account has subscribed to.
 */
public class SubscriptionModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this subscription.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this subscription.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 accountId;

    /**
     * Getter for accountId;
     * The unique ID number of the account this subscription belongs to.
     */
    public Int32 getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The unique ID number of the account this subscription belongs to.
     */
    public void setaccountId(Int32 value) {;
        this.accountId = value;;
    }


    private Int32? subscriptionTypeId;

    /**
     * Getter for subscriptionTypeId;
     * The unique ID number of the service that the account is subscribed to.
     */
    public Int32? getsubscriptionTypeId() {;
        return this.subscriptionTypeId;;
    }

    /**
     * Setter for subscriptionTypeId;
     * The unique ID number of the service that the account is subscribed to.
     */
    public void setsubscriptionTypeId(Int32? value) {;
        this.subscriptionTypeId = value;;
    }


    private String subscriptionDescription;

    /**
     * Getter for subscriptionDescription;
     * A friendly description of the service that the account is subscribed to.
     */
    public String getsubscriptionDescription() {;
        return this.subscriptionDescription;;
    }

    /**
     * Setter for subscriptionDescription;
     * A friendly description of the service that the account is subscribed to.
     */
    public void setsubscriptionDescription(String value) {;
        this.subscriptionDescription = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The date when the subscription began.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The date when the subscription began.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * If the subscription has ended or will end, this date indicates when the subscription ends.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * If the subscription has ended or will end, this date indicates when the subscription ends.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
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


    /**
     * Returns a JSON string representation of SubscriptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
