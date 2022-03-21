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
 * Item Catalogue output model.
 */
public class ItemCatalogueOutputModel {


    private Integer total;

    /**
     * Getter for total
     *
     * Total number of items processed.
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * Setter for total
     *
     * Total number of items processed.
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    private ArrayList<ItemUploadErrorModel> failed;

    /**
     * Getter for failed
     *
     * List of the items that failed during creation because of an error.
     */
    public ArrayList<ItemUploadErrorModel> getFailed() {
        return this.failed;
    }

    /**
     * Setter for failed
     *
     * List of the items that failed during creation because of an error.
     */
    public void setFailed(ArrayList<ItemUploadErrorModel> value) {
        this.failed = value;
    }

    /**
     * Returns a JSON string representation of ItemCatalogueOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
