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
 * Product classification output model.
 */
public class ItemClassificationOutputModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this product.
	 * 
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this product.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Long itemId;

    /**
     * Getter for itemId
     *
     * The unique ID number of the item this product belongs to.
	 * 
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The unique ID number of the item this product belongs to.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private Integer systemId;

    /**
     * Getter for systemId
     *
     * The system id which the product belongs.
	 * 
     */
    public Integer getSystemId() {
        return this.systemId;
    }

    /**
     * Setter for systemId
     *
     * The system id which the product belongs.
     */
    public void setSystemId(Integer value) {
        this.systemId = value;
    }

    private String productCode;

    /**
     * Getter for productCode
     *
     * A unique code representing this item.
	 * 
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Setter for productCode
     *
     * A unique code representing this item.
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    private String systemCode;

    /**
     * Getter for systemCode
     *
     * A unique code representing this item.
	 * 
     */
    public String getSystemCode() {
        return this.systemCode;
    }

    /**
     * Setter for systemCode
     *
     * A unique code representing this item.
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Returns a JSON string representation of ItemClassificationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
