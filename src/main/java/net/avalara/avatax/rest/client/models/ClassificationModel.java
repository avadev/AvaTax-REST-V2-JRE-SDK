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
 * Represents a classification for a given item.
 */
public class ClassificationModel {


    private String productCode;

    /**
     * Getter for productCode
     *
     * The product code of an item in a given system.
	 * 
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Setter for productCode
     *
     * The product code of an item in a given system.
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    private String systemCode;

    /**
     * Getter for systemCode
     *
     * The system code in which the product belongs.
	 * 
     */
    public String getSystemCode() {
        return this.systemCode;
    }

    /**
     * Setter for systemCode
     *
     * The system code in which the product belongs.
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Returns a JSON string representation of ClassificationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
