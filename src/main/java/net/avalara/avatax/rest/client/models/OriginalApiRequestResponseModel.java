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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents the exact API request and response from the original transaction API call, if available
 */
public class OriginalApiRequestResponseModel {


    private string request;

    /**
     * Getter for request
     *
     * API request
     */
    public string getRequest() {
        return this.request;
    }

    /**
     * Setter for request
     *
     * API request
     */
    public void setRequest(string value) {
        this.request = value;
    }


    private string response;

    /**
     * Getter for response
     *
     * API response
     */
    public string getResponse() {
        return this.response;
    }

    /**
     * Setter for response
     *
     * API response
     */
    public void setResponse(string value) {
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
