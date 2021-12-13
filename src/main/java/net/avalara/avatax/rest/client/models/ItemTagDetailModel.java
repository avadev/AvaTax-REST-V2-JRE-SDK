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
 * Represents a tag for an item in your company's product catalog.
 */
public class ItemTagDetailModel {


    private Integer itemTagDetailId;

    /**
     * Getter for itemTagDetailId
     *
     * The unique ID number of the item-tag relation.
	 * 
     */
    public Integer getItemTagDetailId() {
        return this.itemTagDetailId;
    }

    /**
     * Setter for itemTagDetailId
     *
     * The unique ID number of the item-tag relation.
     */
    public void setItemTagDetailId(Integer value) {
        this.itemTagDetailId = value;
    }

    private Integer tagId;

    /**
     * Getter for tagId
     *
     * The unique tag Id for the tags.
	 * 
     */
    public Integer getTagId() {
        return this.tagId;
    }

    /**
     * Setter for tagId
     *
     * The unique tag Id for the tags.
     */
    public void setTagId(Integer value) {
        this.tagId = value;
    }

    private String tagName;

    /**
     * Getter for tagName
     *
     * The tag name.
	 * 
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Setter for tagName
     *
     * The tag name.
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    private Long itemId;

    /**
     * Getter for itemId
     *
     * The unique ID number of this item.
	 * 
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The unique ID number of this item.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that owns this item.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that owns this item.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    /**
     * Returns a JSON string representation of ItemTagDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
