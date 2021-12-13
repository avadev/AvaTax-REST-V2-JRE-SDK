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
 * Request model for when a user is deleting multiple error transaction
 */
public class DeleteErrorTransactionsRequestModel {


    private ArrayList<ErrorTransactionModelBase> models;

    /**
     * Getter for models
     *
     * List of error transactions to be deleted
	 * 
     */
    public ArrayList<ErrorTransactionModelBase> getModels() {
        return this.models;
    }

    /**
     * Setter for models
     *
     * List of error transactions to be deleted
     */
    public void setModels(ArrayList<ErrorTransactionModelBase> value) {
        this.models = value;
    }

    /**
     * Returns a JSON string representation of DeleteErrorTransactionsRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
