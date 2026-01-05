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
 * Represents HS Code FTA (Free Trade Agreement) Details.
 */
public class ItemHSCodeFTADetailModel {


    private String name;

    /**
     * Getter for name
     *
     * The name of the FTA.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the FTA.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String rate;

    /**
     * Getter for rate
     *
     * The rate for this FTA.
     */
    public String getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The rate for this FTA.
     */
    public void setRate(String value) {
        this.rate = value;
    }

    private String uom;

    /**
     * Getter for uom
     *
     * The unit of measure.
     */
    public String getUom() {
        return this.uom;
    }

    /**
     * Setter for uom
     *
     * The unit of measure.
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeFTADetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
