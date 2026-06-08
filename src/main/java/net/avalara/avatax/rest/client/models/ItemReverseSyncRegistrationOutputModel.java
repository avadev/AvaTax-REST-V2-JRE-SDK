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
 * Output model representing a Connector Data Sync (reverse sync) webhook registration.
 */
public class ItemReverseSyncRegistrationOutputModel {


    private Long registrationId;

    /**
     * Getter for registrationId
     *
     * The unique identifier for this registration.
     */
    public Long getRegistrationId() {
        return this.registrationId;
    }

    /**
     * Setter for registrationId
     *
     * The unique identifier for this registration.
     */
    public void setRegistrationId(Long value) {
        this.registrationId = value;
    }

    private String connectorName;

    /**
     * Getter for connectorName
     *
     * The connector name. This value is also used as the OAuth scope for the registration.
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * Setter for connectorName
     *
     * The connector name. This value is also used as the OAuth scope for the registration.
     */
    public void setConnectorName(String value) {
        this.connectorName = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The Avalara company identifier that owns this registration.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The Avalara company identifier that owns this registration.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String url;

    /**
     * Getter for url
     *
     * The webhook callback URL that the connector exposes to receive notifications.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for url
     *
     * The webhook callback URL that the connector exposes to receive notifications.
     */
    public void setUrl(String value) {
        this.url = value;
    }

    private ItemReverseSyncTypeName typeName;

    /**
     * Getter for typeName
     *
     * The registration delivery channel (for example, Webhook).
     */
    public ItemReverseSyncTypeName getTypeName() {
        return this.typeName;
    }

    /**
     * Setter for typeName
     *
     * The registration delivery channel (for example, Webhook).
     */
    public void setTypeName(ItemReverseSyncTypeName value) {
        this.typeName = value;
    }

    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * Indicates whether this registration is currently active.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * Indicates whether this registration is currently active.
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    private ItemReverseSyncEventType events;

    /**
     * Getter for events
     *
     * The list of events this registration subscribes to.
     */
    public ItemReverseSyncEventType getEvents() {
        return this.events;
    }

    /**
     * Setter for events
     *
     * The list of events this registration subscribes to.
     */
    public void setEvents(ItemReverseSyncEventType value) {
        this.events = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date and time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date and time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date and time when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date and time when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user ID who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user ID who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    /**
     * Returns a JSON string representation of ItemReverseSyncRegistrationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
