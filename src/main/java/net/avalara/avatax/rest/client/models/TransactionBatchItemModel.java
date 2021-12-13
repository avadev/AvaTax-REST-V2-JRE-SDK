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
 * Represents a transaction batch item.
* Only one child transaction model should contain data.
 */
public class TransactionBatchItemModel {


    private String memo;

    /**
     * Getter for memo
     *
     * Represents a transaction memo.
	 * 
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * Setter for memo
     *
     * Represents a transaction memo.
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    private CreateTransactionModel createTransactionModel;

    /**
     * Getter for createTransactionModel
     *
     * 
	 * 
     */
    public CreateTransactionModel getCreateTransactionModel() {
        return this.createTransactionModel;
    }

    /**
     * Setter for createTransactionModel
     *
     * 
     */
    public void setCreateTransactionModel(CreateTransactionModel value) {
        this.createTransactionModel = value;
    }

    private BatchAdjustTransactionModel adjustTransactionModel;

    /**
     * Getter for adjustTransactionModel
     *
     * 
	 * 
     */
    public BatchAdjustTransactionModel getAdjustTransactionModel() {
        return this.adjustTransactionModel;
    }

    /**
     * Setter for adjustTransactionModel
     *
     * 
     */
    public void setAdjustTransactionModel(BatchAdjustTransactionModel value) {
        this.adjustTransactionModel = value;
    }

    private CreateOrAdjustTransactionModel createOrAdjustTransactionModel;

    /**
     * Getter for createOrAdjustTransactionModel
     *
     * 
	 * 
     */
    public CreateOrAdjustTransactionModel getCreateOrAdjustTransactionModel() {
        return this.createOrAdjustTransactionModel;
    }

    /**
     * Setter for createOrAdjustTransactionModel
     *
     * 
     */
    public void setCreateOrAdjustTransactionModel(CreateOrAdjustTransactionModel value) {
        this.createOrAdjustTransactionModel = value;
    }

    private BatchVoidTransactionModel voidTransactionModel;

    /**
     * Getter for voidTransactionModel
     *
     * 
	 * 
     */
    public BatchVoidTransactionModel getVoidTransactionModel() {
        return this.voidTransactionModel;
    }

    /**
     * Setter for voidTransactionModel
     *
     * 
     */
    public void setVoidTransactionModel(BatchVoidTransactionModel value) {
        this.voidTransactionModel = value;
    }

    /**
     * Returns a JSON string representation of TransactionBatchItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
