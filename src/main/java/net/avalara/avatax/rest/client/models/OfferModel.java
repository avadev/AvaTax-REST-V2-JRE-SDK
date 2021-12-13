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
 * Gets the response for the offer request
 */
public class OfferModel {


    private String id;

    /**
     * Getter for id
     *
     * Id of the transaction
	 * 
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Id of the transaction
     */
    public void setId(String value) {
        this.id = value;
    }

    private String offerMessage;

    /**
     * Getter for offerMessage
     *
     * Message indicating what action took place
	 * 
     */
    public String getOfferMessage() {
        return this.offerMessage;
    }

    /**
     * Setter for offerMessage
     *
     * Message indicating what action took place
     */
    public void setOfferMessage(String value) {
        this.offerMessage = value;
    }

    /**
     * Returns a JSON string representation of OfferModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
