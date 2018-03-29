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
 * Information about a username.
 */
public class UsernameModel {


    private String username;

    /**
     * Getter for username
     *
     * The username.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for username
     *
     * The username.
     */
    public void setUsername(String value) {
        this.username = value;
    }


    private Boolean taken;

    /**
     * Getter for taken
     *
     * Whether or not the username is taken.
     */
    public Boolean getTaken() {
        return this.taken;
    }

    /**
     * Setter for taken
     *
     * Whether or not the username is taken.
     */
    public void setTaken(Boolean value) {
        this.taken = value;
    }


    /**
     * Returns a JSON string representation of UsernameModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
