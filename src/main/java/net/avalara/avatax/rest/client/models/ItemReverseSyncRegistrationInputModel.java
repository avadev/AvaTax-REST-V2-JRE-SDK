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
 * Input model used to create a Connector Data Sync (reverse sync) webhook registration.
*  
* A registration tells Avalara which connector should be notified when an item-related
* event occurs (currently `HSCodeAssigned`), the callback URL to invoke, and the
* events the connector wishes to subscribe to.
 */
public class ItemReverseSyncRegistrationInputModel {


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

    /**
     * Returns a JSON string representation of ItemReverseSyncRegistrationInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
