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
 * Create or adjust transaction model
 */
public class CreateOrAdjustTransactionModel {


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


    private CreateTransactionModel createTransactionModel;

    /**
     * Getter for createTransactionModel
     *
     * The create transaction model to be created or updated.
    *  
    * If the transaction does not exist, create transaction.
    * If the transaction exists, adjust the existing transaction.
     */
    public CreateTransactionModel getCreateTransactionModel() {
        return this.createTransactionModel;
    }

    /**
     * Setter for createTransactionModel
     *
     * The create transaction model to be created or updated.
    *  
    * If the transaction does not exist, create transaction.
    * If the transaction exists, adjust the existing transaction.
     */
    public void setCreateTransactionModel(CreateTransactionModel value) {
        this.createTransactionModel = value;
    }


    /**
     * Returns a JSON string representation of CreateOrAdjustTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
