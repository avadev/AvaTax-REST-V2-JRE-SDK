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
 * This is used to map the error details in response
 */
public class NotFoundErrorResponse {


    private Integer code;

    /**
     * Getter for code
     *
     * Status code in the response
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Status code in the response
     */
    public void setCode(Integer value) {
        this.code = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * Error message in the response
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * Error message in the response
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Returns a JSON string representation of NotFoundErrorResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
