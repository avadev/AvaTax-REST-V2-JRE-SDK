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
 * Represents item tax code recommendations model
 */
public class ItemTaxCodeRecommendationsOutputModel {


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

    private ArrayList<ItemTaxCodeModel> recommendations;

    /**
     * Getter for recommendations
     *
     * Item tax code recommendations
     */
    public ArrayList<ItemTaxCodeModel> getRecommendations() {
        return this.recommendations;
    }

    /**
     * Setter for recommendations
     *
     * Item tax code recommendations
     */
    public void setRecommendations(ArrayList<ItemTaxCodeModel> value) {
        this.recommendations = value;
    }

    private String url;

    /**
     * Getter for url
     *
     * Url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for url
     *
     * Url
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Returns a JSON string representation of ItemTaxCodeRecommendationsOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
