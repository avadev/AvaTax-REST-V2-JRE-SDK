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
 * Replace an existing MultiDocument transaction recorded in AvaTax with a new one.
 */
public class AdjustMultiDocumentModel {


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


    private String adjustDescription;

    /**
     * Getter for adjustDescription
     *
     * If the AdjustmentReason is "Other", specify the reason here.
    * 
    * This is required when the AdjustmentReason is 8 (Other).
     */
    public String getAdjustDescription() {
        return this.adjustDescription;
    }

    /**
     * Setter for adjustDescription
     *
     * If the AdjustmentReason is "Other", specify the reason here.
    * 
    * This is required when the AdjustmentReason is 8 (Other).
     */
    public void setAdjustDescription(String value) {
        this.adjustDescription = value;
    }


    private CreateMultiDocumentModel newTransaction;

    /**
     * Getter for newTransaction
     *
     * Replace the current MultiDocument transaction with tax data calculated for this new MultiDocument transaction
     */
    public CreateMultiDocumentModel getNewTransaction() {
        return this.newTransaction;
    }

    /**
     * Setter for newTransaction
     *
     * Replace the current MultiDocument transaction with tax data calculated for this new MultiDocument transaction
     */
    public void setNewTransaction(CreateMultiDocumentModel value) {
        this.newTransaction = value;
    }


    /**
     * Returns a JSON string representation of AdjustMultiDocumentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
