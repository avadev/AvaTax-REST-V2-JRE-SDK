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
 * 
 */
public class ErrorDetail {


    private ErrorCodeId code;

    /**
     * Getter for code
     *
     * 
	 * 
     */
    public ErrorCodeId getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * 
     */
    public void setCode(ErrorCodeId value) {
        this.code = value;
    }

    private Integer number;

    /**
     * Getter for number
     *
     * 
	 * 
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for number
     *
     * 
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * 
	 * 
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * 
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * 
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String faultCode;

    /**
     * Getter for faultCode
     *
     * 
	 * 
     */
    public String getFaultCode() {
        return this.faultCode;
    }

    /**
     * Setter for faultCode
     *
     * 
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    private String faultSubCode;

    /**
     * Getter for faultSubCode
     *
     * 
	 * 
     */
    public String getFaultSubCode() {
        return this.faultSubCode;
    }

    /**
     * Setter for faultSubCode
     *
     * 
     */
    public void setFaultSubCode(String value) {
        this.faultSubCode = value;
    }

    private String helpLink;

    /**
     * Getter for helpLink
     *
     * 
	 * 
     */
    public String getHelpLink() {
        return this.helpLink;
    }

    /**
     * Setter for helpLink
     *
     * 
     */
    public void setHelpLink(String value) {
        this.helpLink = value;
    }

    private String refersTo;

    /**
     * Getter for refersTo
     *
     * 
	 * 
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo
     *
     * 
     */
    public void setRefersTo(String value) {
        this.refersTo = value;
    }

    private SeverityLevel severity;

    /**
     * Getter for severity
     *
     * 
	 * 
     */
    public SeverityLevel getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity
     *
     * 
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
