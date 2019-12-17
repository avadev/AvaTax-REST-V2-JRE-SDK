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
 * 
 */
public class CappedFetchResult[ErrorCodeOutputModel] {


    private Boolean @isRecordsetCountCapped;

    /**
     * Getter for @isRecordsetCountCapped
     *
     * 
     */
    public Boolean get@isRecordsetCountCapped() {
        return this.@isRecordsetCountCapped;
    }

    /**
     * Setter for @isRecordsetCountCapped
     *
     * 
     */
    public void set@isRecordsetCountCapped(Boolean value) {
        this.@isRecordsetCountCapped = value;
    }


    private Integer @recordsetCount;

    /**
     * Getter for @recordsetCount
     *
     * 
     */
    public Integer get@recordsetCount() {
        return this.@recordsetCount;
    }

    /**
     * Setter for @recordsetCount
     *
     * 
     */
    public void set@recordsetCount(Integer value) {
        this.@recordsetCount = value;
    }


    private ArrayList<ErrorCodeOutputModel> value;

    /**
     * Getter for value
     *
     * 
     */
    public ArrayList<ErrorCodeOutputModel> getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * 
     */
    public void setValue(ArrayList<ErrorCodeOutputModel> value) {
        this.value = value;
    }


    private String @nextLink;

    /**
     * Getter for @nextLink
     *
     * 
     */
    public String get@nextLink() {
        return this.@nextLink;
    }

    /**
     * Setter for @nextLink
     *
     * 
     */
    public void set@nextLink(String value) {
        this.@nextLink = value;
    }


    private String pageKey;

    /**
     * Getter for pageKey
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
     * Returns a JSON string representation of CappedFetchResult[ErrorCodeOutputModel]
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
