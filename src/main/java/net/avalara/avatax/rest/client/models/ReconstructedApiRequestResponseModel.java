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
 * This model contains a reconstructed CreateTransaction request object that could potentially be used
* to recreate this transaction.
* 
* Note that the API changes over time, and this reconstructed model is likely different from the exact request
* that was originally used to create this transaction.
 */
public class ReconstructedApiRequestResponseModel {


    private CreateTransactionModel request;

    /**
     * Getter for request
     *
     * API request
     */
    public CreateTransactionModel getRequest() {
        return this.request;
    }

    /**
     * Setter for request
     *
     * API request
     */
    public void setRequest(CreateTransactionModel value) {
        this.request = value;
    }


    /**
     * Returns a JSON string representation of ReconstructedApiRequestResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
