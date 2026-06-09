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
 * Response for HS code verification batch requests. When Avalara.ItemMasterCoreService.Models.v2.ItemHSCodeVerificationOutputModel.failed is non-empty, no rows were persisted or published.
 */
public class ItemHSCodeVerificationOutputModel {


    private Integer total;

    /**
     * Getter for total
     *
     * Number of rows in the request (same as request array length).
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * Setter for total
     *
     * Number of rows in the request (same as request array length).
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    private ArrayList<ItemHSCodeVerificationFailedRowModel> failed;

    /**
     * Getter for failed
     *
     * Rows that failed validation; empty when the full batch was accepted.
     */
    public ArrayList<ItemHSCodeVerificationFailedRowModel> getFailed() {
        return this.failed;
    }

    /**
     * Setter for failed
     *
     * Rows that failed validation; empty when the full batch was accepted.
     */
    public void setFailed(ArrayList<ItemHSCodeVerificationFailedRowModel> value) {
        this.failed = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeVerificationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
