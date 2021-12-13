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
 * Represents a request to sync items.
 */
public class SyncItemsRequestModel {


    private ArrayList<ItemSyncModel> items;

    /**
     * Getter for items
     *
     * A list of items to sync with AvaTax.
	 * 
     */
    public ArrayList<ItemSyncModel> getItems() {
        return this.items;
    }

    /**
     * Setter for items
     *
     * A list of items to sync with AvaTax.
     */
    public void setItems(ArrayList<ItemSyncModel> value) {
        this.items = value;
    }

    /**
     * Returns a JSON string representation of SyncItemsRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
