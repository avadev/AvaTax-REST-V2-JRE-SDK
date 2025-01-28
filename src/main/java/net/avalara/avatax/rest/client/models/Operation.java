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
 * 
 */
public class Operation {


    private HashMap<String, String> value;

    /**
     * Getter for value
     *
     * 
     */
    public HashMap<String, String> getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * 
     */
    public void setValue(HashMap<String, String> value) {
        this.value = value;
    }

    private String path;

    /**
     * Getter for path
     *
     * 
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for path
     *
     * 
     */
    public void setPath(String value) {
        this.path = value;
    }

    private String op;

    /**
     * Getter for op
     *
     * 
     */
    public String getOp() {
        return this.op;
    }

    /**
     * Setter for op
     *
     * 
     */
    public void setOp(String value) {
        this.op = value;
    }

    private String from;

    /**
     * Getter for from
     *
     * 
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * Setter for from
     *
     * 
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Returns a JSON string representation of Operation
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
