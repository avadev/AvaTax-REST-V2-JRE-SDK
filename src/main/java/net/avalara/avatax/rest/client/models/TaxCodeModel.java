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
 * Represents a tax code that can be applied to items on a transaction.
* A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
 */
public class TaxCodeModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax code.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax code.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that owns this tax code.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that owns this tax code.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String taxCode;

    /**
     * Getter for taxCode
     *
     * A code string that identifies this tax code.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * A code string that identifies this tax code.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }


    private String taxCodeTypeId;

    /**
     * Getter for taxCodeTypeId
     *
     * The type of this tax code.
     */
    public String getTaxCodeTypeId() {
        return this.taxCodeTypeId;
    }

    /**
     * Setter for taxCodeTypeId
     *
     * The type of this tax code.
     */
    public void setTaxCodeTypeId(String value) {
        this.taxCodeTypeId = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A friendly description of this tax code.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly description of this tax code.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String parentTaxCode;

    /**
     * Getter for parentTaxCode
     *
     * If this tax code is a subset of a different tax code, this identifies the parent code.
     */
    public String getParentTaxCode() {
        return this.parentTaxCode;
    }

    /**
     * Setter for parentTaxCode
     *
     * If this tax code is a subset of a different tax code, this identifies the parent code.
     */
    public void setParentTaxCode(String value) {
        this.parentTaxCode = value;
    }


    private Boolean isPhysical;

    /**
     * Getter for isPhysical
     *
     * True if this tax code type refers to a physical object. Read only field.
     */
    public Boolean getIsPhysical() {
        return this.isPhysical;
    }

    /**
     * Setter for isPhysical
     *
     * True if this tax code type refers to a physical object. Read only field.
     */
    public void setIsPhysical(Boolean value) {
        this.isPhysical = value;
    }


    private Long goodsServiceCode;

    /**
     * Getter for goodsServiceCode
     *
     * The Avalara Goods and Service Code represented by this tax code.
     */
    public Long getGoodsServiceCode() {
        return this.goodsServiceCode;
    }

    /**
     * Setter for goodsServiceCode
     *
     * The Avalara Goods and Service Code represented by this tax code.
     */
    public void setGoodsServiceCode(Long value) {
        this.goodsServiceCode = value;
    }


    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The Avalara Entity Use Code represented by this tax code.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The Avalara Entity Use Code represented by this tax code.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }


    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * True if this tax code is active and can be used in transactions.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * True if this tax code is active and can be used in transactions.
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }


    private Boolean isSSTCertified;

    /**
     * Getter for isSSTCertified
     *
     * True if this tax code has been certified by the Streamlined Sales Tax governing board.
    * By default, you should leave this value empty.
     */
    public Boolean getIsSSTCertified() {
        return this.isSSTCertified;
    }

    /**
     * Setter for isSSTCertified
     *
     * True if this tax code has been certified by the Streamlined Sales Tax governing board.
    * By default, you should leave this value empty.
     */
    public void setIsSSTCertified(Boolean value) {
        this.isSSTCertified = value;
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
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    /**
     * Returns a JSON string representation of TaxCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
