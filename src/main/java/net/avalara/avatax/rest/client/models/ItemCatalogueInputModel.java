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
 * Represents an item in your company's product catalog.
 */
public class ItemCatalogueInputModel {


    private Long itemId;

    /**
     * Getter for itemId
     *
     * The unique ID number of this item.
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The unique ID number of this item.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * A unique code representing this item.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * A unique code representing this item.
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A friendly description of this item in your product catalog.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly description of this item in your product catalog.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * The tax code of the item.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The tax code of the item.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String itemType;

    /**
     * Getter for itemType
     *
     * Type of item
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * Setter for itemType
     *
     * Type of item
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    private String upc;

    /**
     * Getter for upc
     *
     * The universal product code of the item.
     */
    public String getUpc() {
        return this.upc;
    }

    /**
     * Setter for upc
     *
     * The universal product code of the item.
     */
    public void setUpc(String value) {
        this.upc = value;
    }

    private String summary;

    /**
     * Getter for summary
     *
     * A summary for selection of the tax code.
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * A summary for selection of the tax code.
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    private String itemGroup;

    /**
     * Getter for itemGroup
     *
     * A way to group similar items.
     */
    public String getItemGroup() {
        return this.itemGroup;
    }

    /**
     * Setter for itemGroup
     *
     * A way to group similar items.
     */
    public void setItemGroup(String value) {
        this.itemGroup = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * A path to the category where item is included.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * A path to the category where item is included.
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private String source;

    /**
     * Getter for source
     *
     * The source of creation of this item.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for source
     *
     * The source of creation of this item.
     */
    public void setSource(String value) {
        this.source = value;
    }

    private String sourceEntityId;

    /**
     * Getter for sourceEntityId
     *
     * The Id of this item at the source
     */
    public String getSourceEntityId() {
        return this.sourceEntityId;
    }

    /**
     * Setter for sourceEntityId
     *
     * The Id of this item at the source
     */
    public void setSourceEntityId(String value) {
        this.sourceEntityId = value;
    }

    private HashMap<String, String> properties;

    /**
     * Getter for properties
     *
     * Additional key-description of the product.
     */
    public HashMap<String, String> getProperties() {
        return this.properties;
    }

    /**
     * Setter for properties
     *
     * Additional key-description of the product.
     */
    public void setProperties(HashMap<String, String> value) {
        this.properties = value;
    }

    private ArrayList<ClassificationModel> classifications;

    /**
     * Getter for classifications
     *
     * Classifications Attached to the Product
     */
    public ArrayList<ClassificationModel> getClassifications() {
        return this.classifications;
    }

    /**
     * Setter for classifications
     *
     * Classifications Attached to the Product
     */
    public void setClassifications(ArrayList<ClassificationModel> value) {
        this.classifications = value;
    }

    private ArrayList<ItemParameterModel> parameters;

    /**
     * Getter for parameters
     *
     * Parameters Attached to the Product
     */
    public ArrayList<ItemParameterModel> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Parameters Attached to the Product
     */
    public void setParameters(ArrayList<ItemParameterModel> value) {
        this.parameters = value;
    }

    /**
     * Returns a JSON string representation of ItemCatalogueInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
