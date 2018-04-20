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
 * A model for return payments.
 */
public class FilingPaymentModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number for the payment.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number for the payment.
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


    private BigDecimal paymentAmount;

    /**
     * Getter for paymentAmount
     *
     * The payment amount.
     */
    public BigDecimal getPaymentAmount() {
        return this.paymentAmount;
    }

    /**
     * Setter for paymentAmount
     *
     * The payment amount.
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }


    private PaymentType type;

    /**
     * Getter for type
     *
     * The type of the payment.
     */
    public PaymentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the payment.
     */
    public void setType(PaymentType value) {
        this.type = value;
    }


    private Boolean isCalculated;

    /**
     * Getter for isCalculated
     *
     * Whether or not the payment has been calculated.
     */
    public Boolean getIsCalculated() {
        return this.isCalculated;
    }

    /**
     * Setter for isCalculated
     *
     * Whether or not the payment has been calculated.
     */
    public void setIsCalculated(Boolean value) {
        this.isCalculated = value;
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
     * Returns a JSON string representation of FilingPaymentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
