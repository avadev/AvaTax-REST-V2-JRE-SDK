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
 * Represents a Premium Classification output model associated with an item's SystemCode..
 */
public class ItemPremiumClassificationOutputModel {


    private String id;

    /**
     * Getter for id
     *
     * ItemPremiumClassificationDetailId
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * ItemPremiumClassificationDetailId
     */
    public void setId(String value) {
        this.id = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * Item associated with this premium classification.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * Item associated with this premium classification.
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId with which the Item is associated.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId with which the Item is associated.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The HS code associated with this item's premium classification.
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The HS code associated with this item's premium classification.
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    private String systemCode;

    /**
     * Getter for systemCode
     *
     * SystemCode associated with this premium classificaitons.
     */
    public String getSystemCode() {
        return this.systemCode;
    }

    /**
     * Setter for systemCode
     *
     * SystemCode associated with this premium classificaitons.
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    private String justification;

    /**
     * Getter for justification
     *
     * Justification why this HsCode is attached to this item.
     */
    public String getJustification() {
        return this.justification;
    }

    /**
     * Setter for justification
     *
     * Justification why this HsCode is attached to this item.
     */
    public void setJustification(String value) {
        this.justification = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
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

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user who created the record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user who created the record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    /**
     * Returns a JSON string representation of ItemPremiumClassificationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
