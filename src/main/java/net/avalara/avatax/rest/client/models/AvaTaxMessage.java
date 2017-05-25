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
 * Informational or warning messages returned by AvaTax with a transaction
 */
public class AvaTaxMessage {


    private string summary;

    /**
     * Getter for summary
     *
     * A brief summary of what this message tells us
     */
    public string getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * A brief summary of what this message tells us
     */
    public void setSummary(string value) {
        this.summary = value;
    }


    private string details;

    /**
     * Getter for details
     *
     * Detailed information that explains what the summary provided
     */
    public string getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * Detailed information that explains what the summary provided
     */
    public void setDetails(string value) {
        this.details = value;
    }


    private string refersTo;

    /**
     * Getter for refersTo
     *
     * Information about what object in your request this message refers to
     */
    public string getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo
     *
     * Information about what object in your request this message refers to
     */
    public void setRefersTo(string value) {
        this.refersTo = value;
    }


    private string severity;

    /**
     * Getter for severity
     *
     * A category that indicates how severely this message affects the results
     */
    public string getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity
     *
     * A category that indicates how severely this message affects the results
     */
    public void setSeverity(string value) {
        this.severity = value;
    }


    private string source;

    /**
     * Getter for source
     *
     * The name of the code or service that generated this message
     */
    public string getSource() {
        return this.source;
    }

    /**
     * Setter for source
     *
     * The name of the code or service that generated this message
     */
    public void setSource(string value) {
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
