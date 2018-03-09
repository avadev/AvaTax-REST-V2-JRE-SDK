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
 * Represents a service that this account has subscribed to.
 */
public class SubscriptionModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this subscription.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this subscription.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the account this subscription belongs to.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the account this subscription belongs to.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private Integer subscriptionTypeId;

    /**
     * Getter for subscriptionTypeId
     *
     * The unique ID number of the service that the account is subscribed to. If this is provided, subscription description is ignored.
     */
    public Integer getSubscriptionTypeId() {
        return this.subscriptionTypeId;
    }

    /**
     * Setter for subscriptionTypeId
     *
     * The unique ID number of the service that the account is subscribed to. If this is provided, subscription description is ignored.
     */
    public void setSubscriptionTypeId(Integer value) {
        this.subscriptionTypeId = value;
    }


    private String subscriptionDescription;

    /**
     * Getter for subscriptionDescription
     *
     * A friendly description of the service that the account is subscribed to. You can either provide the subscription type Id or this but not both. If 
    * subscription type Id is provided, then this information is ignored and this field will be updated with the information from subscription type id.
     */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * Setter for subscriptionDescription
     *
     * A friendly description of the service that the account is subscribed to. You can either provide the subscription type Id or this but not both. If 
    * subscription type Id is provided, then this information is ignored and this field will be updated with the information from subscription type id.
     */
    public void setSubscriptionDescription(String value) {
        this.subscriptionDescription = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when the subscription began.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when the subscription began.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * If the subscription has ended or will end, this date indicates when the subscription ends.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * If the subscription has ended or will end, this date indicates when the subscription ends.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
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


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
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


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    /**
     * Returns a JSON string representation of SubscriptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
