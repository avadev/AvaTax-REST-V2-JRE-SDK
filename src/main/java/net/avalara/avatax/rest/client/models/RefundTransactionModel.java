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
 * @version    17.6.0-85
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Refund a committed transaction
 */
public class RefundTransactionModel {


    private String refundTransactionCode;

    /**
     * Getter for refundTransactionCode
     *
     * the transaction code for this refund
     */
    public String getRefundTransactionCode() {
        return this.refundTransactionCode;
    }

    /**
     * Setter for refundTransactionCode
     *
     * the transaction code for this refund
     */
    public void setRefundTransactionCode(String value) {
        this.refundTransactionCode = value;
    }


    private Date refundDate;

    /**
     * Getter for refundDate
     *
     * The date of the refund. If null, today's date will be used
     */
    public Date getRefundDate() {
        return this.refundDate;
    }

    /**
     * Setter for refundDate
     *
     * The date of the refund. If null, today's date will be used
     */
    public void setRefundDate(Date value) {
        this.refundDate = value;
    }


    private RefundType refundType;

    /**
     * Getter for refundType
     *
     * Type of this refund
     */
    public RefundType getRefundType() {
        return this.refundType;
    }

    /**
     * Setter for refundType
     *
     * Type of this refund
     */
    public void setRefundType(RefundType value) {
        this.refundType = value;
    }


    private BigDecimal refundPercentage;

    /**
     * Getter for refundPercentage
     *
     * Percentage for refund
     */
    public BigDecimal getRefundPercentage() {
        return this.refundPercentage;
    }

    /**
     * Setter for refundPercentage
     *
     * Percentage for refund
     */
    public void setRefundPercentage(BigDecimal value) {
        this.refundPercentage = value;
    }


    private ArrayList<String> refundLines;

    /**
     * Getter for refundLines
     *
     * Process refund for these lines
     */
    public ArrayList<String> getRefundLines() {
        return this.refundLines;
    }

    /**
     * Setter for refundLines
     *
     * Process refund for these lines
     */
    public void setRefundLines(ArrayList<String> value) {
        this.refundLines = value;
    }


    private String referenceCode;

    /**
     * Getter for referenceCode
     *
     * Reference code for this refund
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * Reference code for this refund
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }


    /**
     * Returns a JSON string representation of RefundTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
