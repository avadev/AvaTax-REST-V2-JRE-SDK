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
 * Represents the output model containing the status and results of a tax code recommendation batch.
 */
public class ItemTaxcodeRecommendationBatchStatusOutputModel {


    private Long batchId;

    /**
     * Getter for batchId
     *
     * The unique ID of the batch.
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * Setter for batchId
     *
     * The unique ID of the batch.
     */
    public void setBatchId(Long value) {
        this.batchId = value;
    }

    private String batchStatus;

    /**
     * Getter for batchStatus
     *
     * The current processing status of the batch.
    * Possible values: "Pending", "Processing", "Completed", "Failed", "Deleted"
     */
    public String getBatchStatus() {
        return this.batchStatus;
    }

    /**
     * Setter for batchStatus
     *
     * The current processing status of the batch.
    * Possible values: "Pending", "Processing", "Completed", "Failed", "Deleted"
     */
    public void setBatchStatus(String value) {
        this.batchStatus = value;
    }

    private ArrayList<ItemTaxcodeRecommendationBatchesOutputModel> value;

    /**
     * Getter for value
     *
     * The list of items with their tax code recommendations.
    * This property is populated only when the batch status is "Completed".
     */
    public ArrayList<ItemTaxcodeRecommendationBatchesOutputModel> getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The list of items with their tax code recommendations.
    * This property is populated only when the batch status is "Completed".
     */
    public void setValue(ArrayList<ItemTaxcodeRecommendationBatchesOutputModel> value) {
        this.value = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * An optional message providing additional information about the batch.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * An optional message providing additional information about the batch.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Returns a JSON string representation of ItemTaxcodeRecommendationBatchStatusOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
