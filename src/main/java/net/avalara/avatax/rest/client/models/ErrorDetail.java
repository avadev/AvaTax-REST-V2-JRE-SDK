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
 * Message object
 */
public class ErrorDetail {


    private ErrorCodeId code;

    /**
     * Getter for code
     *
     * Name of the error or message.
     */
    public ErrorCodeId getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Name of the error or message.
     */
    public void setCode(ErrorCodeId value) {
        this.code = value;
    }


    private Integer number;

    /**
     * Getter for number
     *
     * Unique ID number referring to this error or message.
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for number
     *
     * Unique ID number referring to this error or message.
     */
    public void setNumber(Integer value) {
        this.number = value;
    }


    private String message;

    /**
     * Getter for message
     *
     * Concise summary of the message, suitable for display in the caption of an alert box.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * Concise summary of the message, suitable for display in the caption of an alert box.
     */
    public void setMessage(String value) {
        this.message = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String faultCode;

    /**
     * Getter for faultCode
     *
     * Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior.
     */
    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * Setter for faultCode
     *
     * Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior.
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }


    private String helpLink;

    /**
     * Getter for helpLink
     *
     * URL to help for this message
     */
    public String getHelpLink() {
        return this.helpLink;
    }

    /**
     * Setter for helpLink
     *
     * URL to help for this message
     */
    public void setHelpLink(String value) {
        this.helpLink = value;
    }


    private String refersTo;

    /**
     * Getter for refersTo
     *
     * Item the message refers to, if applicable. This is used to indicate a missing or incorrect value.
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo
     *
     * Item the message refers to, if applicable. This is used to indicate a missing or incorrect value.
     */
    public void setRefersTo(String value) {
        this.refersTo = value;
    }


    private SeverityLevel severity;

    /**
     * Getter for severity
     *
     * Severity of the message
     */
    public SeverityLevel getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity
     *
     * Severity of the message
     */
    public void setSeverity(SeverityLevel value) {
        this.severity = value;
    }


    /**
     * Returns a JSON string representation of ErrorDetail
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
