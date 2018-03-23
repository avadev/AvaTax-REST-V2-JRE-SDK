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
 * Refund a committed transaction
 */
public class RefundTransactionModel {


    private String refundTransactionCode;

    /**
     * Getter for refundTransactionCode
     *
     * The transaction code for the refund. This code will be saved to the `ReturnInvoice` transaction, and does not need to match the code of the original sale.
     */
    public String getRefundTransactionCode() {
        return this.refundTransactionCode;
    }

    /**
     * Setter for refundTransactionCode
     *
     * The transaction code for the refund. This code will be saved to the `ReturnInvoice` transaction, and does not need to match the code of the original sale.
     */
    public void setRefundTransactionCode(String value) {
        this.refundTransactionCode = value;
    }


    private Date refundDate;

    /**
     * Getter for refundDate
     *
     * The date of the refund. For customers using Avalara's Managed Returns Service, this date controls the month in which the refund
    * transaction will be reported on a tax filing.
     */
    public Date getRefundDate() {
        return this.refundDate;
    }

    /**
     * Setter for refundDate
     *
     * The date of the refund. For customers using Avalara's Managed Returns Service, this date controls the month in which the refund
    * transaction will be reported on a tax filing.
     */
    public void setRefundDate(Date value) {
        this.refundDate = value;
    }


    private RefundType refundType;

    /**
     * Getter for refundType
     *
     * Type of this refund. 
    * 
    * To submit a full refund, specify `Full`. 
    * 
    * To refund only specific lines from the transaction, specify `Partial` and indicate the lines you wish to apply in the `refundLines` field.
    * 
    * To refund the tax that was paid in the previous transaction, specify `TaxOnly`.
    * 
    * To issue a percentage-based discount, specify `Percentage`.
     */
    public RefundType getRefundType() {
        return this.refundType;
    }

    /**
     * Setter for refundType
     *
     * Type of this refund. 
    * 
    * To submit a full refund, specify `Full`. 
    * 
    * To refund only specific lines from the transaction, specify `Partial` and indicate the lines you wish to apply in the `refundLines` field.
    * 
    * To refund the tax that was paid in the previous transaction, specify `TaxOnly`.
    * 
    * To issue a percentage-based discount, specify `Percentage`.
     */
    public void setRefundType(RefundType value) {
        this.refundType = value;
    }


    private BigDecimal refundPercentage;

    /**
     * Getter for refundPercentage
     *
     * The percentage for refund.
    * 
    * This value only applies if you choose `refundType = Percentage` or `refundType = Partial`.
     */
    public BigDecimal getRefundPercentage() {
        return this.refundPercentage;
    }

    /**
     * Setter for refundPercentage
     *
     * The percentage for refund.
    * 
    * This value only applies if you choose `refundType = Percentage` or `refundType = Partial`.
     */
    public void setRefundPercentage(BigDecimal value) {
        this.refundPercentage = value;
    }


    private ArrayList<String> refundLines;

    /**
     * Getter for refundLines
     *
     * If you chose a refund of type `Partial`, this indicates which lines from the original transaction are being refunded.
     */
    public ArrayList<String> getRefundLines() {
        return this.refundLines;
    }

    /**
     * Setter for refundLines
     *
     * If you chose a refund of type `Partial`, this indicates which lines from the original transaction are being refunded.
     */
    public void setRefundLines(ArrayList<String> value) {
        this.refundLines = value;
    }


    private String referenceCode;

    /**
     * Getter for referenceCode
     *
     * A user-defined reference field containing information about this refund.
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * A user-defined reference field containing information about this refund.
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
