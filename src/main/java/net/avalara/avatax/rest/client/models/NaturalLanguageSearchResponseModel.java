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
 * Response model for natural language search
 */
public class NaturalLanguageSearchResponseModel {


    private String intent;

    /**
     * Getter for intent
     *
     * Intent of the search query (e.g., "GET" for read operations, "WRITE" for write operations)
     */
    public String getIntent() {
        return this.intent;
    }

    /**
     * Setter for intent
     *
     * Intent of the search query (e.g., "GET" for read operations, "WRITE" for write operations)
     */
    public void setIntent(String value) {
        this.intent = value;
    }

    private HashMap<String, String> filters;

    /**
     * Getter for filters
     *
     * Structured filters extracted from the natural language query
     */
    public HashMap<String, String> getFilters() {
        return this.filters;
    }

    /**
     * Setter for filters
     *
     * Structured filters extracted from the natural language query
     */
    public void setFilters(HashMap<String, String> value) {
        this.filters = value;
    }

    /**
     * Returns a JSON string representation of NaturalLanguageSearchResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
