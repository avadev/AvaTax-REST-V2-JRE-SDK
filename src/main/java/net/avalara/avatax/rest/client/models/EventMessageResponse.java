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
 * Encloses event message details
 */
public class EventMessageResponse {


    private String body;

    /**
     * Getter for body
     *
     * Message content
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Setter for body
     *
     * Message content
     */
    public void setBody(String value) {
        this.body = value;
    }

    private String messageId;

    /**
     * Getter for messageId
     *
     * A system-assigned message ID
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Setter for messageId
     *
     * A system-assigned message ID
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    private String receiptHandle;

    /**
     * Getter for receiptHandle
     *
     * The receipt handle associated with the message to delete.
     */
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    /**
     * Setter for receiptHandle
     *
     * The receipt handle associated with the message to delete.
     */
    public void setReceiptHandle(String value) {
        this.receiptHandle = value;
    }

    /**
     * Returns a JSON string representation of EventMessageResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
