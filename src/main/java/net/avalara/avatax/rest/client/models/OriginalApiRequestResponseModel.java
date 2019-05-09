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
 * (c) 2004-2019 Avalara, Inc.
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
 * Represents the exact API request and response from the original transaction API call, if available
 */
public class OriginalApiRequestResponseModel {


    private Object request;

    /**
     * Getter for request
     * Caution: this member object will change type in v19.5.
     *
     * API request
     */
    public Object getRequest() {
        return this.request;
    }

    /**
     * Setter for request
     * Caution: this member object will change type in v19.5.
     *
     * API request
     */
    public void Object(CreateTransactionModel value) {
        this.request = value;
    }


    private Object response;

    /**
     * Getter for response
     * Caution: this member object will change type in v19.5.
     *
     * API response
     */
    public Object getResponse() {
        return this.response;
    }

    /**
     * Setter for response
     * Caution: this member object will change type in v19.5.
     *
     * API response
     */
    public void setResponse(Object value) {
        this.response = value;
    }


    /**
     * Returns a JSON string representation of OriginalApiRequestResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
