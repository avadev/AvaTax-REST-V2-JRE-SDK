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
 */

/**
 * Represents a single security role.
 */
public class SecurityRoleModel {


    private Byte id;

    /**
     * Getter for id
     *
     * The unique ID number of this security role.
     */
    public Byte getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this security role.
     */
    public void setId(Byte value) {
        this.id = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A description of this security role
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of this security role
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * Returns a JSON string representation of SecurityRoleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
