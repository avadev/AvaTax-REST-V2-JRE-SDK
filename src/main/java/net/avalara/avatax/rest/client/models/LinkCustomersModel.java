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
 * Represents a customer to whom you sell products and/or services.
 */
public class LinkCustomersModel {


    private ArrayList<String> customers;

    /**
     * Getter for customers
     *
     * An array of customerCodes that are exempted by this certificate
     */
    public ArrayList<String> getCustomers() {
        return this.customers;
    }

    /**
     * Setter for customers
     *
     * An array of customerCodes that are exempted by this certificate
     */
    public void setCustomers(ArrayList<String> value) {
        this.customers = value;
    }


    /**
     * Returns a JSON string representation of LinkCustomersModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
