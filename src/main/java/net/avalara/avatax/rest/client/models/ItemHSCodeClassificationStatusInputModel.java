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
 * ItemHsCodeClassificationStatusInputModel
 */
public class ItemHSCodeClassificationStatusInputModel {


    private String country;

    /**
     * Getter for country
     *
     * The Country for which the item is getting classified
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The Country for which the item is getting classified
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * Status of the HS Code classification
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * Status of the HS Code classification
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String details;

    /**
     * Getter for details
     *
     * The description for the HS Code classification created/updated
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * The description for the HS Code classification created/updated
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeClassificationStatusInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
