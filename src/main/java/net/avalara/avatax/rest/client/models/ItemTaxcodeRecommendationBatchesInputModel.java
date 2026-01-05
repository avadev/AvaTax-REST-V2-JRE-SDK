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
 * Represents an input model of a single item for tax code recommendation batches (both synchronous and asynchronous).
 */
public class ItemTaxcodeRecommendationBatchesInputModel {


    private String description;

    /**
     * Getter for description
     *
     * A brief description of the item.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A brief description of the item.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * The category of the item.
    * For example: "Home > Kitchen > Mugs"
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * The category of the item.
    * For example: "Home > Kitchen > Mugs"
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private String itemType;

    /**
     * Getter for itemType
     *
     * The type of item. (optional)
    * Examples: "Physical", "Digital", "Service", "Freight"
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * Setter for itemType
     *
     * The type of item. (optional)
    * Examples: "Physical", "Digital", "Service", "Freight"
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    private String upc;

    /**
     * Getter for upc
     *
     * The Universal Product Code (UPC) associated with the item. (optional)
     */
    public String getUpc() {
        return this.upc;
    }

    /**
     * Setter for upc
     *
     * The Universal Product Code (UPC) associated with the item. (optional)
     */
    public void setUpc(String value) {
        this.upc = value;
    }

    private String summary;

    /**
     * Getter for summary
     *
     * A summary or detailed description of the item. (optional)
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * A summary or detailed description of the item. (optional)
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Returns a JSON string representation of ItemTaxcodeRecommendationBatchesInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
