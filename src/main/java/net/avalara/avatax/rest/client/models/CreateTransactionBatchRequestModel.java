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
 * Represents a create transaction batch request model.
 */
public class CreateTransactionBatchRequestModel {


    private String name;

    /**
     * Getter for name
     *
     * The user-friendly readable name for this batch.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The user-friendly readable name for this batch.
     */
    public void setName(String value) {
        this.name = value;
    }

    private ArrayList<TransactionBatchItemModel> transactions;

    /**
     * Getter for transactions
     *
     * The list of transactions contained in this batch.
     */
    public ArrayList<TransactionBatchItemModel> getTransactions() {
        return this.transactions;
    }

    /**
     * Setter for transactions
     *
     * The list of transactions contained in this batch.
     */
    public void setTransactions(ArrayList<TransactionBatchItemModel> value) {
        this.transactions = value;
    }

    private String options;

    /**
     * Getter for options
     *
     * Any optional flags provided for this batch
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Any optional flags provided for this batch
     */
    public void setOptions(String value) {
        this.options = value;
    }

    private Boolean skipTransactionValidation;

    /**
     * Getter for skipTransactionValidation
     *
     * Skips upload-time transaction type, company code, and nested model validation when true.
    * The transactions are instead validated individually while BatchV2 processes the batch,
    * and transaction validation failures are written to the batch error file.
    *  
    * An explicit value overrides the BatchProcessing configuration default. If omitted, the
    * configured SkipTransactionValidation value is used.
     */
    public Boolean getSkipTransactionValidation() {
        return this.skipTransactionValidation;
    }

    /**
     * Setter for skipTransactionValidation
     *
     * Skips upload-time transaction type, company code, and nested model validation when true.
    * The transactions are instead validated individually while BatchV2 processes the batch,
    * and transaction validation failures are written to the batch error file.
    *  
    * An explicit value overrides the BatchProcessing configuration default. If omitted, the
    * configured SkipTransactionValidation value is used.
     */
    public void setSkipTransactionValidation(Boolean value) {
        this.skipTransactionValidation = value;
    }

    /**
     * Returns a JSON string representation of CreateTransactionBatchRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
