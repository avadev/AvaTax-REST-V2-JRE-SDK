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
 * A model for return adjustments.
 */
public class FilingAdjustmentModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number for the adjustment.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number for the adjustment.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Long filingId;

    /**
     * Getter for filingId
     *
     * The filing return id that this applies too
     */
    public Long getFilingId() {
        return this.filingId;
    }

    /**
     * Setter for filingId
     *
     * The filing return id that this applies too
     */
    public void setFilingId(Long value) {
        this.filingId = value;
    }


    private BigDecimal amount;

    /**
     * Getter for amount
     *
     * The adjustment amount.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * The adjustment amount.
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }


    private AdjustmentPeriodTypeId period;

    /**
     * Getter for period
     *
     * The filing period the adjustment is applied to.
     */
    public AdjustmentPeriodTypeId getPeriod() {
        return this.period;
    }

    /**
     * Setter for period
     *
     * The filing period the adjustment is applied to.
     */
    public void setPeriod(AdjustmentPeriodTypeId value) {
        this.period = value;
    }


    private AdjustmentTypeId type;

    /**
     * Getter for type
     *
     * The type of the adjustment.
     */
    public AdjustmentTypeId getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the adjustment.
     */
    public void setType(AdjustmentTypeId value) {
        this.type = value;
    }


    private Boolean isCalculated;

    /**
     * Getter for isCalculated
     *
     * Whether or not the adjustment has been calculated.
     */
    public Boolean getIsCalculated() {
        return this.isCalculated;
    }

    /**
     * Setter for isCalculated
     *
     * Whether or not the adjustment has been calculated.
     */
    public void setIsCalculated(Boolean value) {
        this.isCalculated = value;
    }


    private PaymentAccountTypeId accountType;

    /**
     * Getter for accountType
     *
     * The account type of the adjustment.
     */
    public PaymentAccountTypeId getAccountType() {
        return this.accountType;
    }

    /**
     * Setter for accountType
     *
     * The account type of the adjustment.
     */
    public void setAccountType(PaymentAccountTypeId value) {
        this.accountType = value;
    }


    private String reason;

    /**
     * Getter for reason
     *
     * A descriptive reason for creating this adjustment.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason
     *
     * A descriptive reason for creating this adjustment.
     */
    public void setReason(String value) {
        this.reason = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    /**
     * Returns a JSON string representation of FilingAdjustmentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
