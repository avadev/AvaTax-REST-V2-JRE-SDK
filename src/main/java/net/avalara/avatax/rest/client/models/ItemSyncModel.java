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
 * An abridged item model used for syncing product catalogs with AvaTax.
 */
public class ItemSyncModel {


    private String itemCode;

    /**
     * Getter for itemCode
     *
     * A unique code representing this item.
	 * 
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
     * A friendly description of the item. If your company has enrolled in Streamlined Sales Tax, this description must be auditable.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly description of the item. If your company has enrolled in Streamlined Sales Tax, this description must be auditable.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String itemGroup;

    /**
     * Getter for itemGroup
     *
     * A group to which the item belongs.
	 * 
     */
    public String getItemGroup() {
        return this.itemGroup;
    }

    /**
     * Setter for itemGroup
     *
     * A group to which the item belongs.
     */
    public void setItemGroup(String value) {
        this.itemGroup = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * The tax code of the item (optional)
	 * 
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The tax code of the item (optional)
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Returns a JSON string representation of ItemSyncModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
