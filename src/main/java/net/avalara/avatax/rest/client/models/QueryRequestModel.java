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
 * Represents a complex query request to parse using query filter guidelines from Microsoft REST standards
 */
public class QueryRequestModel {


    private String filter;

    /**
     * Getter for filter
     *
     * A list of conditions to filter objects.
	 * 
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Setter for filter
     *
     * A list of conditions to filter objects.
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    private String include;

    /**
     * Getter for include
     *
     * A list of included commands for this fetch operation.
	 * 
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * Setter for include
     *
     * A list of included commands for this fetch operation.
     */
    public void setInclude(String value) {
        this.include = value;
    }

    private Integer maxResults;

    /**
     * Getter for maxResults
     *
     * For pagination: This is the maximum number of results to return.
	 * 
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Setter for maxResults
     *
     * For pagination: This is the maximum number of results to return.
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    private Integer startIndex;

    /**
     * Getter for startIndex
     *
     * For pagination: This is the index of the first result.
	 * 
     */
    public Integer getStartIndex() {
        return this.startIndex;
    }

    /**
     * Setter for startIndex
     *
     * For pagination: This is the index of the first result.
     */
    public void setStartIndex(Integer value) {
        this.startIndex = value;
    }

    private String sortBy;

    /**
     * Getter for sortBy
     *
     * Sorts the resulting objects in a specific manner.
	 * 
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * Setter for sortBy
     *
     * Sorts the resulting objects in a specific manner.
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * Returns a JSON string representation of QueryRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
