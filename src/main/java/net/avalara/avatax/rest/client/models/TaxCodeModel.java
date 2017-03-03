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
     * Getter for taxCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private String description;

    /**
     * Getter for description - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String entityUseCode;

    /**
     * Getter for entityUseCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setEntityUseCode(String entityUseCode) {
        this.entityUseCode = entityUseCode;
    }

    
    private Long goodsServiceCode;

    /**
     * Getter for goodsServiceCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Long getGoodsServiceCode() {
        return this.goodsServiceCode;
    }

    /**
     * Setter for goodsServiceCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setGoodsServiceCode(Long goodsServiceCode) {
        this.goodsServiceCode = goodsServiceCode;
    }

    
    private Boolean isPhysical;

    /**
     * Getter for isPhysical - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Boolean getIsPhysical() {
        return this.isPhysical;
    }

    /**
     * Setter for isPhysical - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setIsPhysical(Boolean isPhysical) {
        this.isPhysical = isPhysical;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Boolean isSSTCertified;

    /**
     * Getter for isSSTCertified - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Boolean getIsSSTCertified() {
        return this.isSSTCertified;
    }

    /**
     * Setter for isSSTCertified - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setIsSSTCertified(Boolean isSSTCertified) {
        this.isSSTCertified = isSSTCertified;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String taxCodeTypeId;

    /**
     * Getter for taxCodeTypeId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public String getTaxCodeTypeId() {
        return this.taxCodeTypeId;
    }

    /**
     * Setter for taxCodeTypeId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setTaxCodeTypeId(String taxCodeTypeId) {
        this.taxCodeTypeId = taxCodeTypeId;
    }

    
    private String parentTaxCode;

    /**
     * Getter for parentTaxCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public String getParentTaxCode() {
        return this.parentTaxCode;
    }

    /**
     * Setter for parentTaxCode - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setParentTaxCode(String parentTaxCode) {
        this.parentTaxCode = parentTaxCode;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a tax code that can be applied to items on a transaction.
A tax code can have specific rules for specific jurisdictions that change the tax calculation behavior.
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
    