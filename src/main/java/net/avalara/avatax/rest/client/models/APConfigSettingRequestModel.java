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
 * AP Config Setting Request Model
 */
public class APConfigSettingRequestModel {


    private BigDecimal amount;

    /**
     * Getter for amount
     *
     * The Amount Threshold To Ignore Transaction
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * The Amount Threshold To Ignore Transaction
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    private BigDecimal amountToMarkForReview;

    /**
     * Getter for amountToMarkForReview
     *
     * The Amount Threshold To Mark Transaction For Manual Review
     */
    public BigDecimal getAmountToMarkForReview() {
        return this.amountToMarkForReview;
    }

    /**
     * Setter for amountToMarkForReview
     *
     * The Amount Threshold To Mark Transaction For Manual Review
     */
    public void setAmountToMarkForReview(BigDecimal value) {
        this.amountToMarkForReview = value;
    }

    private BigDecimal varianceForIgnore;

    /**
     * Getter for varianceForIgnore
     *
     * The Variance For Ignore
     */
    public BigDecimal getVarianceForIgnore() {
        return this.varianceForIgnore;
    }

    /**
     * Setter for varianceForIgnore
     *
     * The Variance For Ignore
     */
    public void setVarianceForIgnore(BigDecimal value) {
        this.varianceForIgnore = value;
    }

    private BigDecimal varianceForAccrue;

    /**
     * Getter for varianceForAccrue
     *
     * The Variance For Accrue
     */
    public BigDecimal getVarianceForAccrue() {
        return this.varianceForAccrue;
    }

    /**
     * Setter for varianceForAccrue
     *
     * The Variance For Accrue
     */
    public void setVarianceForAccrue(BigDecimal value) {
        this.varianceForAccrue = value;
    }

    private BigDecimal variancePercent;

    /**
     * Getter for variancePercent
     *
     * The Variance Percent
     */
    public BigDecimal getVariancePercent() {
        return this.variancePercent;
    }

    /**
     * Setter for variancePercent
     *
     * The Variance Percent
     */
    public void setVariancePercent(BigDecimal value) {
        this.variancePercent = value;
    }

    private ApConfigToleranceType apConfigToleranceType;

    /**
     * Getter for apConfigToleranceType
     *
     * The Ap Config Tolerance Type
    * BATCH or REALTIME
     */
    public ApConfigToleranceType getApConfigToleranceType() {
        return this.apConfigToleranceType;
    }

    /**
     * Setter for apConfigToleranceType
     *
     * The Ap Config Tolerance Type
    * BATCH or REALTIME
     */
    public void setApConfigToleranceType(ApConfigToleranceType value) {
        this.apConfigToleranceType = value;
    }

    private BigDecimal payAsBilledNoAccrual;

    /**
     * Getter for payAsBilledNoAccrual
     *
     * Pay Billed Do Not Accrue
     */
    public BigDecimal getPayAsBilledNoAccrual() {
        return this.payAsBilledNoAccrual;
    }

    /**
     * Setter for payAsBilledNoAccrual
     *
     * Pay Billed Do Not Accrue
     */
    public void setPayAsBilledNoAccrual(BigDecimal value) {
        this.payAsBilledNoAccrual = value;
    }

    private BigDecimal payAsBilledAccrueUndercharge;

    /**
     * Getter for payAsBilledAccrueUndercharge
     *
     * Pay Billed Accrue
     */
    public BigDecimal getPayAsBilledAccrueUndercharge() {
        return this.payAsBilledAccrueUndercharge;
    }

    /**
     * Setter for payAsBilledAccrueUndercharge
     *
     * Pay Billed Accrue
     */
    public void setPayAsBilledAccrueUndercharge(BigDecimal value) {
        this.payAsBilledAccrueUndercharge = value;
    }

    private BigDecimal shortPayItemsAccrueUndercharge;

    /**
     * Getter for shortPayItemsAccrueUndercharge
     *
     * ShortPay Items UnderCharge
     */
    public BigDecimal getShortPayItemsAccrueUndercharge() {
        return this.shortPayItemsAccrueUndercharge;
    }

    /**
     * Setter for shortPayItemsAccrueUndercharge
     *
     * ShortPay Items UnderCharge
     */
    public void setShortPayItemsAccrueUndercharge(BigDecimal value) {
        this.shortPayItemsAccrueUndercharge = value;
    }

    private BigDecimal markForReviewUndercharge;

    /**
     * Getter for markForReviewUndercharge
     *
     * Review UnderCharge
     */
    public BigDecimal getMarkForReviewUndercharge() {
        return this.markForReviewUndercharge;
    }

    /**
     * Setter for markForReviewUndercharge
     *
     * Review UnderCharge
     */
    public void setMarkForReviewUndercharge(BigDecimal value) {
        this.markForReviewUndercharge = value;
    }

    private BigDecimal rejectUndercharge;

    /**
     * Getter for rejectUndercharge
     *
     * Reject UnderCharge
     */
    public BigDecimal getRejectUndercharge() {
        return this.rejectUndercharge;
    }

    /**
     * Setter for rejectUndercharge
     *
     * Reject UnderCharge
     */
    public void setRejectUndercharge(BigDecimal value) {
        this.rejectUndercharge = value;
    }

    private BigDecimal payAsBilledOvercharge;

    /**
     * Getter for payAsBilledOvercharge
     *
     * Pay As BilledOvercharge
     */
    public BigDecimal getPayAsBilledOvercharge() {
        return this.payAsBilledOvercharge;
    }

    /**
     * Setter for payAsBilledOvercharge
     *
     * Pay As BilledOvercharge
     */
    public void setPayAsBilledOvercharge(BigDecimal value) {
        this.payAsBilledOvercharge = value;
    }

    private BigDecimal shortPayAvalaraCalculated;

    /**
     * Getter for shortPayAvalaraCalculated
     *
     * Short Pay Avalara CalculatedTax
     */
    public BigDecimal getShortPayAvalaraCalculated() {
        return this.shortPayAvalaraCalculated;
    }

    /**
     * Setter for shortPayAvalaraCalculated
     *
     * Short Pay Avalara CalculatedTax
     */
    public void setShortPayAvalaraCalculated(BigDecimal value) {
        this.shortPayAvalaraCalculated = value;
    }

    private BigDecimal shortPayItemsAccrueOvercharge;

    /**
     * Getter for shortPayItemsAccrueOvercharge
     *
     * Short Pay Items
     */
    public BigDecimal getShortPayItemsAccrueOvercharge() {
        return this.shortPayItemsAccrueOvercharge;
    }

    /**
     * Setter for shortPayItemsAccrueOvercharge
     *
     * Short Pay Items
     */
    public void setShortPayItemsAccrueOvercharge(BigDecimal value) {
        this.shortPayItemsAccrueOvercharge = value;
    }

    private BigDecimal markForReviewOvercharge;

    /**
     * Getter for markForReviewOvercharge
     *
     * Review OverCharge
     */
    public BigDecimal getMarkForReviewOvercharge() {
        return this.markForReviewOvercharge;
    }

    /**
     * Setter for markForReviewOvercharge
     *
     * Review OverCharge
     */
    public void setMarkForReviewOvercharge(BigDecimal value) {
        this.markForReviewOvercharge = value;
    }

    private BigDecimal rejectOvercharge;

    /**
     * Getter for rejectOvercharge
     *
     * Reject OverCharge
     */
    public BigDecimal getRejectOvercharge() {
        return this.rejectOvercharge;
    }

    /**
     * Setter for rejectOvercharge
     *
     * Reject OverCharge
     */
    public void setRejectOvercharge(BigDecimal value) {
        this.rejectOvercharge = value;
    }

    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * Is Active
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * Is Active
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Returns a JSON string representation of APConfigSettingRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
