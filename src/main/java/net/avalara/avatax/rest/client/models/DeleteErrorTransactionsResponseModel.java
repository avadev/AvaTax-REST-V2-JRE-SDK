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
 * Response model of error transaction batch delete
 */
public class DeleteErrorTransactionsResponseModel {


    private ArrayList<DeleteErrorTransactionResponseModel> results;

    /**
     * Getter for results
     *
     * The individual result of each error transaction in the request batch
	 * 
     */
    public ArrayList<DeleteErrorTransactionResponseModel> getResults() {
        return this.results;
    }

    /**
     * Setter for results
     *
     * The individual result of each error transaction in the request batch
     */
    public void setResults(ArrayList<DeleteErrorTransactionResponseModel> value) {
        this.results = value;
    }

    /**
     * Returns a JSON string representation of DeleteErrorTransactionsResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
