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
public class Message {


    private String details;

    /**
     * Getter for details
     *
     * 
	 * 
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * 
     */
    public void setDetails(String value) {
        this.details = value;
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

    private String name;

    /**
     * Getter for name
     *
     * 
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * 
     */
    public void setName(String value) {
        this.name = value;
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

    private String severity;

    /**
     * Getter for severity
     *
     * 
	 * 
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity
     *
     * 
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    private String source;

    /**
     * Getter for source
     *
     * 
	 * 
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for source
     *
     * 
     */
    public void setSource(String value) {
        this.source = value;
    }

    private String summary;

    /**
     * Getter for summary
     *
     * 
	 * 
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * 
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Returns a JSON string representation of Message
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
