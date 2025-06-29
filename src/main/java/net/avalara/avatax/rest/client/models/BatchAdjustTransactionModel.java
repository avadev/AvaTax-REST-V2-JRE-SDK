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
 * Replace an existing transaction recorded in AvaTax with a new one.
 */
public class BatchAdjustTransactionModel {


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Specifies the code of the company for this transaction.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Specifies the code of the company for this transaction.
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    private String transactionCode;

    /**
     * Getter for transactionCode
     *
     * Please specify the transaction code of the transaction to void.
     */
    public String getTransactionCode() {
        return this.transactionCode;
    }

    /**
     * Setter for transactionCode
     *
     * Please specify the transaction code of the transaction to void.
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    private String documentType;

    /**
     * Getter for documentType
     *
     * Specifies the type of document to void.
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType
     *
     * Specifies the type of document to void.
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    private AdjustmentReason adjustmentReason;

    /**
     * Getter for adjustmentReason
     *
     * A reason code indicating why this adjustment was made
     */
    public AdjustmentReason getAdjustmentReason() {
        return this.adjustmentReason;
    }

    /**
     * Setter for adjustmentReason
     *
     * A reason code indicating why this adjustment was made
     */
    public void setAdjustmentReason(AdjustmentReason value) {
        this.adjustmentReason = value;
    }

    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription
     *
     * If the AdjustmentReason is "Other", specify the reason here.
    *  
    * This is required when the AdjustmentReason is 8 (Other).
     */
    public String getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription
     *
     * If the AdjustmentReason is "Other", specify the reason here.
    *  
    * This is required when the AdjustmentReason is 8 (Other).
     */
    public void setAdjustmentDescription(String value) {
        this.adjustmentDescription = value;
    }

    private CreateTransactionModel newTransaction;

    /**
     * Getter for newTransaction
     *
     * 
     */
    public CreateTransactionModel getNewTransaction() {
        return this.newTransaction;
    }

    /**
     * Setter for newTransaction
     *
     * 
     */
    public void setNewTransaction(CreateTransactionModel value) {
        this.newTransaction = value;
    }

    /**
     * Returns a JSON string representation of BatchAdjustTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
