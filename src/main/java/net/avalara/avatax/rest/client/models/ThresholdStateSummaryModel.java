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
 * Economic nexus threshold status for a single US state.
 */
public class ThresholdStateSummaryModel {


    private String state;

    /**
     * Getter for state
     *
     * Two-letter US state postal code (e.g. CA, TX, WA). Matches the database column `state`; use that name in `$filter`.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * Two-letter US state postal code (e.g. CA, TX, WA). Matches the database column `state`; use that name in `$filter`.
     */
    public void setState(String value) {
        this.state = value;
    }

    private String stateName;

    /**
     * Getter for stateName
     *
     * Full display name of the state.
     */
    public String getStateName() {
        return this.stateName;
    }

    /**
     * Setter for stateName
     *
     * Full display name of the state.
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * Threshold status as determined by the upstream data pipeline. Typical values: 'met', 'notmet'.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * Threshold status as determined by the upstream data pipeline. Typical values: 'met', 'notmet'.
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String thresholdTimeframe;

    /**
     * Getter for thresholdTimeframe
     *
     * Label describing the measurement window used for threshold evaluation (e.g. 'Prior calendar year').
     */
    public String getThresholdTimeframe() {
        return this.thresholdTimeframe;
    }

    /**
     * Setter for thresholdTimeframe
     *
     * Label describing the measurement window used for threshold evaluation (e.g. 'Prior calendar year').
     */
    public void setThresholdTimeframe(String value) {
        this.thresholdTimeframe = value;
    }

    private Date thresholdStartDate;

    /**
     * Getter for thresholdStartDate
     *
     * Start of the threshold evaluation window.
     */
    public Date getThresholdStartDate() {
        return this.thresholdStartDate;
    }

    /**
     * Setter for thresholdStartDate
     *
     * Start of the threshold evaluation window.
     */
    public void setThresholdStartDate(Date value) {
        this.thresholdStartDate = value;
    }

    private Date thresholdEndDate;

    /**
     * Getter for thresholdEndDate
     *
     * End of the threshold evaluation window.
     */
    public Date getThresholdEndDate() {
        return this.thresholdEndDate;
    }

    /**
     * Setter for thresholdEndDate
     *
     * End of the threshold evaluation window.
     */
    public void setThresholdEndDate(Date value) {
        this.thresholdEndDate = value;
    }

    private String triggerType;

    /**
     * Getter for triggerType
     *
     * What triggered the threshold evaluation. Typical values: 'Sales', 'Transactions'.
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * Setter for triggerType
     *
     * What triggered the threshold evaluation. Typical values: 'Sales', 'Transactions'.
     */
    public void setTriggerType(String value) {
        this.triggerType = value;
    }

    private Long transactionThreshold;

    /**
     * Getter for transactionThreshold
     *
     * The configured transaction count threshold for this state, if applicable.
     */
    public Long getTransactionThreshold() {
        return this.transactionThreshold;
    }

    /**
     * Setter for transactionThreshold
     *
     * The configured transaction count threshold for this state, if applicable.
     */
    public void setTransactionThreshold(Long value) {
        this.transactionThreshold = value;
    }

    private BigDecimal salesThreshold;

    /**
     * Getter for salesThreshold
     *
     * The configured sales amount threshold for this state, if applicable.
     */
    public BigDecimal getSalesThreshold() {
        return this.salesThreshold;
    }

    /**
     * Setter for salesThreshold
     *
     * The configured sales amount threshold for this state, if applicable.
     */
    public void setSalesThreshold(BigDecimal value) {
        this.salesThreshold = value;
    }

    private BigDecimal totalSalesAmount;

    /**
     * Getter for totalSalesAmount
     *
     * Actual total sales amount in the evaluation window.
     */
    public BigDecimal getTotalSalesAmount() {
        return this.totalSalesAmount;
    }

    /**
     * Setter for totalSalesAmount
     *
     * Actual total sales amount in the evaluation window.
     */
    public void setTotalSalesAmount(BigDecimal value) {
        this.totalSalesAmount = value;
    }

    private Long totalTransactions;

    /**
     * Getter for totalTransactions
     *
     * Actual total transaction count in the evaluation window.
     */
    public Long getTotalTransactions() {
        return this.totalTransactions;
    }

    /**
     * Setter for totalTransactions
     *
     * Actual total transaction count in the evaluation window.
     */
    public void setTotalTransactions(Long value) {
        this.totalTransactions = value;
    }

    private Date sourceLastUpdatedAt;

    /**
     * Getter for sourceLastUpdatedAt
     *
     * UTC timestamp of when the upstream Snowflake source record was last modified.
     */
    public Date getSourceLastUpdatedAt() {
        return this.sourceLastUpdatedAt;
    }

    /**
     * Setter for sourceLastUpdatedAt
     *
     * UTC timestamp of when the upstream Snowflake source record was last modified.
     */
    public void setSourceLastUpdatedAt(Date value) {
        this.sourceLastUpdatedAt = value;
    }

    /**
     * Returns a JSON string representation of ThresholdStateSummaryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
