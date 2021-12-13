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
 * Represents a single notification.
*  
* A notification is a message from Avalara that may have relevance to your business. You may want
* to regularly review notifications and then dismiss them when you are certain that you have addressed
* any relevant concerns raised by this notification.
*  
* An example of a notification would be a message about new software, or a change to AvaTax that may
* affect you, or a potential issue with your company's tax profile.
 */
public class NotificationModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique id of the notification.
	 * 
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique id of the notification.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the account that received this notification.
	 * 
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the account that received this notification.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * If this notification was tied to a specific company, this will be the
    * unique ID number of the company that received the notification. Notifications that
    * are tied to accounts will have a `NULL` value for `companyId`.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * If this notification was tied to a specific company, this will be the
    * unique ID number of the company that received the notification. Notifications that
    * are tied to accounts will have a `NULL` value for `companyId`.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String referenceObject;

    /**
     * Getter for referenceObject
     *
     * The type name of object referred to by this notification, if any.
    *  
    * Some notifications may include information about a related data object.
    *  
    * For example, if this notification was related to a nexus declaration, the `referenceObject` field would
    * be `Nexus` and the `referenceId` field would be the unique ID number of that nexus.
	 * 
     */
    public String getReferenceObject() {
        return this.referenceObject;
    }

    /**
     * Setter for referenceObject
     *
     * The type name of object referred to by this notification, if any.
    *  
    * Some notifications may include information about a related data object.
    *  
    * For example, if this notification was related to a nexus declaration, the `referenceObject` field would
    * be `Nexus` and the `referenceId` field would be the unique ID number of that nexus.
     */
    public void setReferenceObject(String value) {
        this.referenceObject = value;
    }

    private Long referenceId;

    /**
     * Getter for referenceId
     *
     * The unique reference Id number of the object referred to by this notification, if any.
    *  
    * Some notifications may include information about a related data object.
    *  
    * For example, if this notification was related to a nexus declaration, the `referenceObject` field would
    * be `Nexus` and the `referenceId` field would be the unique ID number of that nexus.
	 * 
     */
    public Long getReferenceId() {
        return this.referenceId;
    }

    /**
     * Setter for referenceId
     *
     * The unique reference Id number of the object referred to by this notification, if any.
    *  
    * Some notifications may include information about a related data object.
    *  
    * For example, if this notification was related to a nexus declaration, the `referenceObject` field would
    * be `Nexus` and the `referenceId` field would be the unique ID number of that nexus.
     */
    public void setReferenceId(Long value) {
        this.referenceId = value;
    }

    private NotificationSeverityLevel severityLevelId;

    /**
     * Getter for severityLevelId
     *
     * The severity level of the notification.
	 * 
     */
    public NotificationSeverityLevel getSeverityLevelId() {
        return this.severityLevelId;
    }

    /**
     * Setter for severityLevelId
     *
     * The severity level of the notification.
     */
    public void setSeverityLevelId(NotificationSeverityLevel value) {
        this.severityLevelId = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * The category of this notification.
    *  
    * Notification categories are a useful way to group related notifications together. Category names may change
    * over time.
    *  
    * For Example: "Backdated Transactions" or "Nexus Jurisdiction Alerts", or "Certificate Expiration".
	 * 
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * The category of this notification.
    *  
    * Notification categories are a useful way to group related notifications together. Category names may change
    * over time.
    *  
    * For Example: "Backdated Transactions" or "Nexus Jurisdiction Alerts", or "Certificate Expiration".
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private String topic;

    /**
     * Getter for topic
     *
     * The topic of this notification.
    *  
    * Notification topics contain information about the notification. They are a summary of the issue and can
    * help you decide what type of action to take.
    *  
    * For Example: "Backdated Transactions" or "Nexus Jurisdiction Alerts", or "Certificate Expiration".
	 * 
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Setter for topic
     *
     * The topic of this notification.
    *  
    * Notification topics contain information about the notification. They are a summary of the issue and can
    * help you decide what type of action to take.
    *  
    * For Example: "Backdated Transactions" or "Nexus Jurisdiction Alerts", or "Certificate Expiration".
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * The message for this notification. This is a friendly description of the notification and any relevant
    * information that can help you decide what kind of action, if any, to take in response.
	 * 
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The message for this notification. This is a friendly description of the notification and any relevant
    * information that can help you decide what kind of action, if any, to take in response.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private Boolean needsAction;

    /**
     * Getter for needsAction
     *
     * If this notification object requires user action to resolve, this value will be set to true.
	 * 
     */
    public Boolean getNeedsAction() {
        return this.needsAction;
    }

    /**
     * Setter for needsAction
     *
     * If this notification object requires user action to resolve, this value will be set to true.
     */
    public void setNeedsAction(Boolean value) {
        this.needsAction = value;
    }

    private String actionName;

    /**
     * Getter for actionName
     *
     * If there is a specific action suggested by this notification, this is the name of the action.
    *  
    * An action is a suggested next step such as "Review Your Tax Profile." If an action is suggested,
    * you should give the viewer a hyperlink to the location referred to by `actionLink` and give the
    * hyperlink the name `actionName`.
	 * 
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * Setter for actionName
     *
     * If there is a specific action suggested by this notification, this is the name of the action.
    *  
    * An action is a suggested next step such as "Review Your Tax Profile." If an action is suggested,
    * you should give the viewer a hyperlink to the location referred to by `actionLink` and give the
    * hyperlink the name `actionName`.
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    private String actionLink;

    /**
     * Getter for actionLink
     *
     * If there is a specific action suggested by this notification, this is the URL of the action.
    *  
    * An action is a suggested next step such as "Review Your Tax Profile." If an action is suggested,
    * you should give the viewer a hyperlink to the location referred to by `actionLink` and give the
    * hyperlink the name `actionName`.
	 * 
     */
    public String getActionLink() {
        return this.actionLink;
    }

    /**
     * Setter for actionLink
     *
     * If there is a specific action suggested by this notification, this is the URL of the action.
    *  
    * An action is a suggested next step such as "Review Your Tax Profile." If an action is suggested,
    * you should give the viewer a hyperlink to the location referred to by `actionLink` and give the
    * hyperlink the name `actionName`.
     */
    public void setActionLink(String value) {
        this.actionLink = value;
    }

    private Date actionDueDate;

    /**
     * Getter for actionDueDate
     *
     * If there is a specific action suggested by this notification, and if this action is requested
    * by a specific due date, this value will be the due date for the action.
    *  
    * An action is a suggested next step such as "Review Your Tax Profile." If an action is suggested,
    * you should give the viewer a hyperlink to the location referred to by `actionLink` and give the
    * hyperlink the name `actionName`.
    *  
    * For actions that have deadlines, such as "Confirm your tax registration before filing", this value
    * will be set to the deadline date for the action. Otherwise, this value will be null.
	 * 
     */
    public Date getActionDueDate() {
        return this.actionDueDate;
    }

    /**
     * Setter for actionDueDate
     *
     * If there is a specific action suggested by this notification, and if this action is requested
    * by a specific due date, this value will be the due date for the action.
    *  
    * An action is a suggested next step such as "Review Your Tax Profile." If an action is suggested,
    * you should give the viewer a hyperlink to the location referred to by `actionLink` and give the
    * hyperlink the name `actionName`.
    *  
    * For actions that have deadlines, such as "Confirm your tax registration before filing", this value
    * will be set to the deadline date for the action. Otherwise, this value will be null.
     */
    public void setActionDueDate(Date value) {
        this.actionDueDate = value;
    }

    private Boolean dismissed;

    /**
     * Getter for dismissed
     *
     * When a user has finished reviewing a notification, they may opt to dismiss it by calling the
    * `DismissNotification` API. This API marks the notification as dismissed, and dismissed notifications
    * will generally not appear in most user interfaces.
	 * 
     */
    public Boolean getDismissed() {
        return this.dismissed;
    }

    /**
     * Setter for dismissed
     *
     * When a user has finished reviewing a notification, they may opt to dismiss it by calling the
    * `DismissNotification` API. This API marks the notification as dismissed, and dismissed notifications
    * will generally not appear in most user interfaces.
     */
    public void setDismissed(Boolean value) {
        this.dismissed = value;
    }

    private Integer dismissedByUserId;

    /**
     * Getter for dismissedByUserId
     *
     * If this notification has been dismissed, this indicates the unique ID number of the user that
    * dismissed the notification.
	 * 
     */
    public Integer getDismissedByUserId() {
        return this.dismissedByUserId;
    }

    /**
     * Setter for dismissedByUserId
     *
     * If this notification has been dismissed, this indicates the unique ID number of the user that
    * dismissed the notification.
     */
    public void setDismissedByUserId(Integer value) {
        this.dismissedByUserId = value;
    }

    private Date dismissedDate;

    /**
     * Getter for dismissedDate
     *
     * If this notification has been dismissed, this indicates the timestamp (in UTC time) when the user
    * dismissed the notification.
	 * 
     */
    public Date getDismissedDate() {
        return this.dismissedDate;
    }

    /**
     * Setter for dismissedDate
     *
     * If this notification has been dismissed, this indicates the timestamp (in UTC time) when the user
    * dismissed the notification.
     */
    public void setDismissedDate(Date value) {
        this.dismissedDate = value;
    }

    private Date expireDate;

    /**
     * Getter for expireDate
     *
     * If this notification is time sensitive, this is the latest date when the notification should be
    * displayed to the user.
	 * 
     */
    public Date getExpireDate() {
        return this.expireDate;
    }

    /**
     * Setter for expireDate
     *
     * If this notification is time sensitive, this is the latest date when the notification should be
    * displayed to the user.
     */
    public void setExpireDate(Date value) {
        this.expireDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The unique ID number of the user who created the notification.
	 * 
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The unique ID number of the user who created the notification.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The UTC timestamp of the time when this notification was created.
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The UTC timestamp of the time when this notification was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The unique ID number of the user who most recently modified this notification.
	 * 
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The unique ID number of the user who most recently modified this notification.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The UTC timestamp of the time when this notification was last modified.
	 * 
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The UTC timestamp of the time when this notification was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of NotificationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
