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
 * Represent HS code classification for a given item.
 */
public class ItemHSCodeClassificationStatusModel {


    private String id;

    /**
     * Getter for id
     *
     * The unique ID of this HS code classification.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID of this HS code classification.
     */
    public void setId(String value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID of the company that owns this HS code classification.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID of the company that owns this HS code classification.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Long itemId;

    /**
     * Getter for itemId
     *
     * A unique code representing the item
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * A unique code representing the item
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country for which the item is getting classified.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country for which the item is getting classified.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * The status of the HS code classification
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the HS code classification
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String details;

    /**
     * Getter for details
     *
     * The description for the HS code classification being created/updated.
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * The description for the HS code classification being created/updated.
     */
    public void setDetails(String value) {
        this.details = value;
    }

    private Date createdAt;

    /**
     * Getter for createdAt
     *
     * The date when this record was created.
     */
    public Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for createdAt
     *
     * The date when this record was created.
     */
    public void setCreatedAt(Date value) {
        this.createdAt = value;
    }

    private Long createdUserId;

    /**
     * Getter for createdUserId
     *
     * The ID of the user who created this record.
     */
    public Long getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The ID of the user who created this record.
     */
    public void setCreatedUserId(Long value) {
        this.createdUserId = value;
    }

    private Date modifiedAt;

    /**
     * Getter for modifiedAt
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * Setter for modifiedAt
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedAt(Date value) {
        this.modifiedAt = value;
    }

    private Long modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The ID of the user who last modified this record.
     */
    public Long getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The ID of the user who last modified this record.
     */
    public void setModifiedUserId(Long value) {
        this.modifiedUserId = value;
    }

    private Date completedAt;

    /**
     * Getter for completedAt
     *
     * The date/time when the request for this record was completed.
     */
    public Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Setter for completedAt
     *
     * The date/time when the request for this record was completed.
     */
    public void setCompletedAt(Date value) {
        this.completedAt = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeClassificationStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
