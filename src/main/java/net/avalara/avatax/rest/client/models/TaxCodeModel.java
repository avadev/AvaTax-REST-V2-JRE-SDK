package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a tax code that can be applied to items on a transaction.
            A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
 */
public class TaxCodeModel {
    private String taxCode;

    /**
     * Getter for taxCode - A code string that identifies this tax code.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - A code string that identifies this tax code.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private String description;

    /**
     * Getter for description - A friendly description of this tax code.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A friendly description of this tax code.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String entityUseCode;

    /**
     * Getter for entityUseCode - The Avalara Entity Use Code represented by this tax code.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode - The Avalara Entity Use Code represented by this tax code.
     */
    public void setEntityUseCode(String entityUseCode) {
        this.entityUseCode = entityUseCode;
    }

    
    private Long goodsServiceCode;

    /**
     * Getter for goodsServiceCode - The Avalara Goods and Service Code represented by this tax code.
     */
    public Long getGoodsServiceCode() {
        return this.goodsServiceCode;
    }

    /**
     * Setter for goodsServiceCode - The Avalara Goods and Service Code represented by this tax code.
     */
    public void setGoodsServiceCode(Long goodsServiceCode) {
        this.goodsServiceCode = goodsServiceCode;
    }

    
    private Boolean isPhysical;

    /**
     * Getter for isPhysical - True if this tax code refers to a physical object.
     */
    public Boolean getIsPhysical() {
        return this.isPhysical;
    }

    /**
     * Setter for isPhysical - True if this tax code refers to a physical object.
     */
    public void setIsPhysical(Boolean isPhysical) {
        this.isPhysical = isPhysical;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this tax code.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this tax code.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Boolean isSSTCertified;

    /**
     * Getter for isSSTCertified - True if this tax code has been certified by the Streamlined Sales Tax governing board.
            By default, you should leave this value empty.
     */
    public Boolean getIsSSTCertified() {
        return this.isSSTCertified;
    }

    /**
     * Setter for isSSTCertified - True if this tax code has been certified by the Streamlined Sales Tax governing board.
            By default, you should leave this value empty.
     */
    public void setIsSSTCertified(Boolean isSSTCertified) {
        this.isSSTCertified = isSSTCertified;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - True if this tax code is active and can be used in transactions.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - True if this tax code is active and can be used in transactions.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String taxCodeTypeId;

    /**
     * Getter for taxCodeTypeId - The type of this tax code.
     */
    public String getTaxCodeTypeId() {
        return this.taxCodeTypeId;
    }

    /**
     * Setter for taxCodeTypeId - The type of this tax code.
     */
    public void setTaxCodeTypeId(String taxCodeTypeId) {
        this.taxCodeTypeId = taxCodeTypeId;
    }

    
    private String parentTaxCode;

    /**
     * Getter for parentTaxCode - If this tax code is a subset of a different tax code, this identifies the parent code.
     */
    public String getParentTaxCode() {
        return this.parentTaxCode;
    }

    /**
     * Setter for parentTaxCode - If this tax code is a subset of a different tax code, this identifies the parent code.
     */
    public void setParentTaxCode(String parentTaxCode) {
        this.parentTaxCode = parentTaxCode;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company that owns this tax code.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company that owns this tax code.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of TaxCodeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    