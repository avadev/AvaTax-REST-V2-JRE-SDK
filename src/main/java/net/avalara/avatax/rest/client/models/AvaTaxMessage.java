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
 * Informational or warning messages returned by AvaTax with a transaction
 */
public class AvaTaxMessage {


    private String summary;

    /**
     * Getter for summary
     *
     * A brief summary of what this message tells us
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * A brief summary of what this message tells us
     */
    public void setSummary(String value) {
        this.summary = value;
    }


    private String details;

    /**
     * Getter for details
     *
     * Detailed information that explains what the summary provided
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * Detailed information that explains what the summary provided
     */
    public void setDetails(String value) {
        this.details = value;
    }


    private String refersTo;

    /**
     * Getter for refersTo
     *
     * Information about what object in your request this message refers to
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo
     *
     * Information about what object in your request this message refers to
     */
    public void setRefersTo(String value) {
        this.refersTo = value;
    }


    private String severity;

    /**
     * Getter for severity
     *
     * A category that indicates how severely this message affects the results
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity
     *
     * A category that indicates how severely this message affects the results
     */
    public void setSeverity(String value) {
        this.severity = value;
    }


    private String source;

    /**
     * Getter for source
     *
     * The name of the code or service that generated this message
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for source
     *
     * The name of the code or service that generated this message
     */
    public void setSource(String value) {
        this.source = value;
    }


    /**
     * Returns a JSON string representation of AvaTaxMessage
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
