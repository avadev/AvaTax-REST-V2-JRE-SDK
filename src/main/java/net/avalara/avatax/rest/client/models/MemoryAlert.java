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
 * Memory alert information
 */
public class MemoryAlert {


    private String id;

    /**
     * Getter for id
     *
     * Unique identifier for the alert
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the alert
     */
    public void setId(String value) {
        this.id = value;
    }

    private String title;

    /**
     * Getter for title
     *
     * Title of the alert
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Title of the alert
     */
    public void setTitle(String value) {
        this.title = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Detailed description of the alert
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Detailed description of the alert
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private MemoryAlertSeverity severity;

    /**
     * Getter for severity
     *
     * Severity level of the alert
     */
    public MemoryAlertSeverity getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity
     *
     * Severity level of the alert
     */
    public void setSeverity(MemoryAlertSeverity value) {
        this.severity = value;
    }

    private Date timestamp;

    /**
     * Getter for timestamp
     *
     * Timestamp when the alert was generated
     */
    public Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for timestamp
     *
     * Timestamp when the alert was generated
     */
    public void setTimestamp(Date value) {
        this.timestamp = value;
    }

    private HashMap<String, String> metrics;

    /**
     * Getter for metrics
     *
     * Additional metrics associated with the alert
     */
    public HashMap<String, String> getMetrics() {
        return this.metrics;
    }

    /**
     * Setter for metrics
     *
     * Additional metrics associated with the alert
     */
    public void setMetrics(HashMap<String, String> value) {
        this.metrics = value;
    }

    /**
     * Returns a JSON string representation of MemoryAlert
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
