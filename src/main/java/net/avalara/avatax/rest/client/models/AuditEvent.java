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
public class AuditEvent {


    private Long auditEventId;

    /**
     * Getter for auditEventId
     *
     * 
	 * 
     */
    public Long getAuditEventId() {
        return this.auditEventId;
    }

    /**
     * Setter for auditEventId
     *
     * 
     */
    public void setAuditEventId(Long value) {
        this.auditEventId = value;
    }

    private Long transactionId;

    /**
     * Getter for transactionId
     *
     * 
	 * 
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * 
     */
    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    private Integer auditEventLevelId;

    /**
     * Getter for auditEventLevelId
     *
     * 
	 * 
     */
    public Integer getAuditEventLevelId() {
        return this.auditEventLevelId;
    }

    /**
     * Setter for auditEventLevelId
     *
     * 
     */
    public void setAuditEventLevelId(Integer value) {
        this.auditEventLevelId = value;
    }

    private Date eventTimestamp;

    /**
     * Getter for eventTimestamp
     *
     * 
	 * 
     */
    public Date getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Setter for eventTimestamp
     *
     * 
     */
    public void setEventTimestamp(Date value) {
        this.eventTimestamp = value;
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

    /**
     * Returns a JSON string representation of AuditEvent
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
