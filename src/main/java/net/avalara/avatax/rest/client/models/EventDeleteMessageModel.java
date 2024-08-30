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
 * Encloses the delete message command.
 */
public class EventDeleteMessageModel {


    private ArrayList<EventDeleteBatchMessageModel> eventDeleteBatchMessageCommands;

    /**
     * Getter for eventDeleteBatchMessageCommands
     *
     * Command details for the delete message
     */
    public ArrayList<EventDeleteBatchMessageModel> getEventDeleteBatchMessageCommands() {
        return this.eventDeleteBatchMessageCommands;
    }

    /**
     * Setter for eventDeleteBatchMessageCommands
     *
     * Command details for the delete message
     */
    public void setEventDeleteBatchMessageCommands(ArrayList<EventDeleteBatchMessageModel> value) {
        this.eventDeleteBatchMessageCommands = value;
    }

    /**
     * Returns a JSON string representation of EventDeleteMessageModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
