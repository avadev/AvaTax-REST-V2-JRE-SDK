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
 * Represents a single patch operation
 */
public class PatchOperation {


    private String op;

    /**
     * Getter for op
     *
     * The operation to perform (add, replace, remove, etc.)
     */
    public String getOp() {
        return this.op;
    }

    /**
     * Setter for op
     *
     * The operation to perform (add, replace, remove, etc.)
     */
    public void setOp(String value) {
        this.op = value;
    }

    private String path;

    /**
     * Getter for path
     *
     * Path to the property being modified
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for path
     *
     * Path to the property being modified
     */
    public void setPath(String value) {
        this.path = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * Value as a string (for add and replace operations)
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * Value as a string (for add and replace operations)
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JSON string representation of PatchOperation
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
