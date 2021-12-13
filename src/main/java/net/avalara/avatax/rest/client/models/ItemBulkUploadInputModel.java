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
 * Represents a bulk upload input model.
 */
public class ItemBulkUploadInputModel {


    private ArrayList<ItemModel> items;

    /**
     * Getter for items
     *
     * List of items
	 * 
     */
    public ArrayList<ItemModel> getItems() {
        return this.items;
    }

    /**
     * Setter for items
     *
     * List of items
     */
    public void setItems(ArrayList<ItemModel> value) {
        this.items = value;
    }

    /**
     * Returns a JSON string representation of ItemBulkUploadInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
