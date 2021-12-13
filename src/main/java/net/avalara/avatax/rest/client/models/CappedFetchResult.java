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
 * 
 */
public class CappedFetchResult {


    private Boolean isRecordsetCountCapped;

    /**
     * Getter for @isRecordsetCountCapped
     *
     * 
	 * 
     */
    public Boolean getIsRecordsetCountCapped() {
        return this.isRecordsetCountCapped;
    }

    /**
     * Setter for @isRecordsetCountCapped
     *
     * 
     */
    public void setIsRecordsetCountCapped(Boolean value) {
        this.isRecordsetCountCapped = value;
    }

    private Integer recordsetCount;

    /**
     * Getter for @recordsetCount
     *
     * 
	 * 
     */
    public Integer getRecordsetCount() {
        return this.recordsetCount;
    }

    /**
     * Setter for @recordsetCount
     *
     * 
     */
    public void setRecordsetCount(Integer value) {
        this.recordsetCount = value;
    }

    private ArrayList<HashMap<String, String>> value;

    /**
     * Getter for value
     *
     * 
	 * 
     */
    public ArrayList<HashMap<String, String>> getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * 
     */
    public void setValue(ArrayList<HashMap<String, String>> value) {
        this.value = value;
    }

    private String nextLink;

    /**
     * Getter for @nextLink
     *
     * 
	 * 
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Setter for @nextLink
     *
     * 
     */
    public void setNextLink(String value) {
        this.nextLink = value;
    }

    private String pageKey;

    /**
     * Getter for pageKey
     *
     * 
	 * 
     */
    public String getPageKey() {
        return this.pageKey;
    }

    /**
     * Setter for pageKey
     *
     * 
     */
    public void setPageKey(String value) {
        this.pageKey = value;
    }

    /**
     * Returns a JSON string representation of CappedFetchResult<T>
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
