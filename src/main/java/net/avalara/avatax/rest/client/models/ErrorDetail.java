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
 * Message object
 */
public class ErrorDetail {


    private ErrorCodeId? code;

    /**
     * Getter for code;
     * Name of the error or message.
     */
    public ErrorCodeId? getcode() {;
        return this.code;;
    }

    /**
     * Setter for code;
     * Name of the error or message.
     */
    public void setcode(ErrorCodeId? value) {;
        this.code = value;;
    }


    private Int32? number;

    /**
     * Getter for number;
     * Unique ID number referring to this error or message.
     */
    public Int32? getnumber() {;
        return this.number;;
    }

    /**
     * Setter for number;
     * Unique ID number referring to this error or message.
     */
    public void setnumber(Int32? value) {;
        this.number = value;;
    }


    private String message;

    /**
     * Getter for message;
     * Concise summary of the message, suitable for display in the caption of an alert box.
     */
    public String getmessage() {;
        return this.message;;
    }

    /**
     * Setter for message;
     * Concise summary of the message, suitable for display in the caption of an alert box.
     */
    public void setmessage(String value) {;
        this.message = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String faultCode;

    /**
     * Getter for faultCode;
     * Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior.
     */
    public String getfaultCode() {;
        return this.faultCode;;
    }

    /**
     * Setter for faultCode;
     * Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior.
     */
    public void setfaultCode(String value) {;
        this.faultCode = value;;
    }


    private String helpLink;

    /**
     * Getter for helpLink;
     * URL to help for this message
     */
    public String gethelpLink() {;
        return this.helpLink;;
    }

    /**
     * Setter for helpLink;
     * URL to help for this message
     */
    public void sethelpLink(String value) {;
        this.helpLink = value;;
    }


    private String refersTo;

    /**
     * Getter for refersTo;
     * Item the message refers to, if applicable. This is used to indicate a missing or incorrect value.
     */
    public String getrefersTo() {;
        return this.refersTo;;
    }

    /**
     * Setter for refersTo;
     * Item the message refers to, if applicable. This is used to indicate a missing or incorrect value.
     */
    public void setrefersTo(String value) {;
        this.refersTo = value;;
    }


    private SeverityLevel? severity;

    /**
     * Getter for severity;
     * Severity of the message
     */
    public SeverityLevel? getseverity() {;
        return this.severity;;
    }

    /**
     * Setter for severity;
     * Severity of the message
     */
    public void setseverity(SeverityLevel? value) {;
        this.severity = value;;
    }


    /**
     * Returns a JSON string representation of ErrorDetail
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
