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
 * The HS code classification error model.
 */
public class HSCodeClassificationError {


    private String code;

    /**
     * Getter for code
     *
     * The error code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The error code.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * The error message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The error message
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private String target;

    /**
     * Getter for target
     *
     * Target is source where failure is happened.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Setter for target
     *
     * Target is source where failure is happened.
     */
    public void setTarget(String value) {
        this.target = value;
    }

    private String faultCode;

    /**
     * Getter for faultCode
     *
     * The fault code
     */
    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * Setter for faultCode
     *
     * The fault code
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Returns a JSON string representation of HSCodeClassificationError
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
