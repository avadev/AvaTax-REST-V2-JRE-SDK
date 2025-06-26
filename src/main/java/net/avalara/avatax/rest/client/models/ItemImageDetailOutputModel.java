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
 * Item image output model with the image URL
 */
public class ItemImageDetailOutputModel {


    private String imageUrl;

    /**
     * Getter for imageUrl
     *
     * The image url
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * Setter for imageUrl
     *
     * The image url
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    private String itemImageId;

    /**
     * Getter for itemImageId
     *
     * Guid Primary key for ItemImage
     */
    public String getItemImageId() {
        return this.itemImageId;
    }

    /**
     * Setter for itemImageId
     *
     * Guid Primary key for ItemImage
     */
    public void setItemImageId(String value) {
        this.itemImageId = value;
    }

    private Long itemImageDetailId;

    /**
     * Getter for itemImageDetailId
     *
     * Numeric primary key for ItemImage
     */
    public Long getItemImageDetailId() {
        return this.itemImageDetailId;
    }

    /**
     * Setter for itemImageDetailId
     *
     * Numeric primary key for ItemImage
     */
    public void setItemImageDetailId(Long value) {
        this.itemImageDetailId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Gets or sets the company ID associated with the item image.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Gets or sets the company ID associated with the item image.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Long itemId;

    /**
     * Getter for itemId
     *
     * Gets or sets the item ID.
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * Gets or sets the item ID.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private Date createdAt;

    /**
     * Getter for createdAt
     *
     * Gets or sets the creation timestamp of the item image.
     */
    public Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for createdAt
     *
     * Gets or sets the creation timestamp of the item image.
     */
    public void setCreatedAt(Date value) {
        this.createdAt = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * Gets or sets the ID of the user who created the item image.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * Gets or sets the ID of the user who created the item image.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedAt;

    /**
     * Getter for modifiedAt
     *
     * Gets or sets the last modification timestamp of the item image.
     */
    public Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * Setter for modifiedAt
     *
     * Gets or sets the last modification timestamp of the item image.
     */
    public void setModifiedAt(Date value) {
        this.modifiedAt = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * Gets or sets the ID of the user who last modified the item image.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * Gets or sets the ID of the user who last modified the item image.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of ItemImageDetailOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
