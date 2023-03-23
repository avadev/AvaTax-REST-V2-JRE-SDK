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
 * 
 */
public class ItemCatalogueResultModel {


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

    private ItemCatalogueResultEvent itemEvent;

    /**
     * Getter for itemEvent
     *
     * A CRUD event for item db operations
     */
    public ItemCatalogueResultEvent getItemEvent() {
        return this.itemEvent;
    }

    /**
     * Setter for itemEvent
     *
     * A CRUD event for item db operations
     */
    public void setItemEvent(ItemCatalogueResultEvent value) {
        this.itemEvent = value;
    }

    private ArrayList<String> errors;

    /**
     * Getter for errors
     *
     * Contains list of errors for item catalogue entry
     */
    public ArrayList<String> getErrors() {
        return this.errors;
    }

    /**
     * Setter for errors
     *
     * Contains list of errors for item catalogue entry
     */
    public void setErrors(ArrayList<String> value) {
        this.errors = value;
    }

    /**
     * Returns a JSON string representation of ItemCatalogueResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
