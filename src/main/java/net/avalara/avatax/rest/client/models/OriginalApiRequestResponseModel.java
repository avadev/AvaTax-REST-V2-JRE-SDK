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
 * Represents the exact API request and response from the original transaction API call, if available
 */
public class OriginalApiRequestResponseModel {


    private String request;

    /**
     * Getter for request
     *
     * API request
     */
    public String getRequest() {
        return this.request;
    }

    /**
     * Setter for request
     *
     * API request
     */
    public void setRequest(String value) {
        this.request = value;
    }


    private String response;

    /**
     * Getter for response
     *
     * API response
     */
    public String getResponse() {
        return this.response;
    }

    /**
     * Setter for response
     *
     * API response
     */
    public void setResponse(String value) {
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
