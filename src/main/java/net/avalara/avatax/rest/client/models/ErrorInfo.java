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
 * Information about the error that occurred
 */
public class ErrorInfo {


    private ErrorCodeId code;

    /**
     * Getter for code
     *
     * Type of error that occurred
     */
    public ErrorCodeId getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Type of error that occurred
     */
    public void setCode(ErrorCodeId value) {
        this.code = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * Short one-line message to summaryize what went wrong
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * Short one-line message to summaryize what went wrong
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private ErrorTargetCode target;

    /**
     * Getter for target
     *
     * What object or service caused the error?
     */
    public ErrorTargetCode getTarget() {
        return this.target;
    }

    /**
     * Setter for target
     *
     * What object or service caused the error?
     */
    public void setTarget(ErrorTargetCode value) {
        this.target = value;
    }

    private ArrayList<ErrorDetail> details;

    /**
     * Getter for details
     *
     * Array of detailed error messages
     */
    public ArrayList<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * Array of detailed error messages
     */
    public void setDetails(ArrayList<ErrorDetail> value) {
        this.details = value;
    }

    /**
     * Returns a JSON string representation of ErrorInfo
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
