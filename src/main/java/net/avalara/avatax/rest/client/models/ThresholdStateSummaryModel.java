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
 * Economic nexus threshold status for a single US region.
 */
public class ThresholdStateSummaryModel {


    private String id;

    /**
     * Getter for id
     *
     * The unique identifier of this threshold status.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique identifier of this threshold status.
     */
    public void setId(String value) {
        this.id = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * Two-letter US state postal code (e.g. CA, TX, WA).
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Two-letter US state postal code (e.g. CA, TX, WA).
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String regionName;

    /**
     * Getter for regionName
     *
     * Full display name of the region.
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * Setter for regionName
     *
     * Full display name of the region.
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * Whether the economic nexus threshold has been met for this region. Typical values: 'met', 'notmet'.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * Whether the economic nexus threshold has been met for this region. Typical values: 'met', 'notmet'.
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String thresholdTimeframe;

    /**
     * Getter for thresholdTimeframe
     *
     * Label describing the measurement window used to evaluate the threshold (e.g. 'Prior calendar year').
     */
    public String getThresholdTimeframe() {
        return this.thresholdTimeframe;
    }

    /**
     * Setter for thresholdTimeframe
     *
     * Label describing the measurement window used to evaluate the threshold (e.g. 'Prior calendar year').
     */
    public void setThresholdTimeframe(String value) {
        this.thresholdTimeframe = value;
    }

    private Date thresholdStartDate;

    /**
     * Getter for thresholdStartDate
     *
     * The start of the measurement window.
     */
    public Date getThresholdStartDate() {
        return this.thresholdStartDate;
    }

    /**
     * Setter for thresholdStartDate
     *
     * The start of the measurement window.
     */
    public void setThresholdStartDate(Date value) {
        this.thresholdStartDate = value;
    }

    private Date thresholdEndDate;

    /**
     * Getter for thresholdEndDate
     *
     * The end of the measurement window.
     */
    public Date getThresholdEndDate() {
        return this.thresholdEndDate;
    }

    /**
     * Setter for thresholdEndDate
     *
     * The end of the measurement window.
     */
    public void setThresholdEndDate(Date value) {
        this.thresholdEndDate = value;
    }

    private String triggerType;

    /**
     * Getter for triggerType
     *
     * The measure the threshold is evaluated against. Typical values: 'Sales', 'Transactions'.
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * Setter for triggerType
     *
     * The measure the threshold is evaluated against. Typical values: 'Sales', 'Transactions'.
     */
    public void setTriggerType(String value) {
        this.triggerType = value;
    }

    private Long transactionThreshold;

    /**
     * Getter for transactionThreshold
     *
     * The configured transaction count threshold for this region, if applicable.
     */
    public Long getTransactionThreshold() {
        return this.transactionThreshold;
    }

    /**
     * Setter for transactionThreshold
     *
     * The configured transaction count threshold for this region, if applicable.
     */
    public void setTransactionThreshold(Long value) {
        this.transactionThreshold = value;
    }

    private BigDecimal salesThreshold;

    /**
     * Getter for salesThreshold
     *
     * The configured sales amount threshold for this region, if applicable.
     */
    public BigDecimal getSalesThreshold() {
        return this.salesThreshold;
    }

    /**
     * Setter for salesThreshold
     *
     * The configured sales amount threshold for this region, if applicable.
     */
    public void setSalesThreshold(BigDecimal value) {
        this.salesThreshold = value;
    }

    private BigDecimal totalSalesAmount;

    /**
     * Getter for totalSalesAmount
     *
     * The company's total sales amount within the measurement window.
     */
    public BigDecimal getTotalSalesAmount() {
        return this.totalSalesAmount;
    }

    /**
     * Setter for totalSalesAmount
     *
     * The company's total sales amount within the measurement window.
     */
    public void setTotalSalesAmount(BigDecimal value) {
        this.totalSalesAmount = value;
    }

    private Long totalTransactions;

    /**
     * Getter for totalTransactions
     *
     * The company's total transaction count within the measurement window.
     */
    public Long getTotalTransactions() {
        return this.totalTransactions;
    }

    /**
     * Setter for totalTransactions
     *
     * The company's total transaction count within the measurement window.
     */
    public void setTotalTransactions(Long value) {
        this.totalTransactions = value;
    }

    private Date sourceLastUpdatedAt;

    /**
     * Getter for sourceLastUpdatedAt
     *
     * The UTC date and time when this threshold status was last modified.
     */
    public Date getSourceLastUpdatedAt() {
        return this.sourceLastUpdatedAt;
    }

    /**
     * Setter for sourceLastUpdatedAt
     *
     * The UTC date and time when this threshold status was last modified.
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
