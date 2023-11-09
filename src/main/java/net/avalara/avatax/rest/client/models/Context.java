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
 * Model to represent the system
 */
public class Context {


    private String id;

    /**
     * Getter for id
     *
     * Unique id of the system
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique id of the system
     */
    public void setId(String value) {
        this.id = value;
    }

    private String system;

    /**
     * Getter for system
     *
     * System name
     */
    public String getSystem() {
        return this.system;
    }

    /**
     * Setter for system
     *
     * System name
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Returns a JSON string representation of Context
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
