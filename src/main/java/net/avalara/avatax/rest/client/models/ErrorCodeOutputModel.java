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
 * Model that has the matching count for an errorcode
 */
public class ErrorCodeOutputModel {


    private String errorCode;

    /**
     * Getter for errorCode
     *
     * Name of the error code
	 * 
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Setter for errorCode
     *
     * Name of the error code
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    private Integer count;

    /**
     * Getter for count
     *
     * Number of error code recorded
	 * 
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Setter for count
     *
     * Number of error code recorded
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Returns a JSON string representation of ErrorCodeOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
