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
 * Update model for an existing Connector Data Sync (reverse sync) webhook registration.
*  
* Only the fields included in the request body will be updated.
 */
public class ItemReverseSyncRegistrationUpdateModel {


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
     * The registration delivery channel (for example, Webhook). Omit to leave the persisted value unchanged.
     */
    public ItemReverseSyncTypeName getTypeName() {
        return this.typeName;
    }

    /**
     * Setter for typeName
     *
     * The registration delivery channel (for example, Webhook). Omit to leave the persisted value unchanged.
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
     * Returns a JSON string representation of ItemReverseSyncRegistrationUpdateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
