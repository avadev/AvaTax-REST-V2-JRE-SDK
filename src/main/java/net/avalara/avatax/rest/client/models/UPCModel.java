package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * One Universal Product Code object as defined for your company.
 */
public class UPCModel {
    private Integer isSystem;

    /**
     * Getter for isSystem - One Universal Product Code object as defined for your company.
     */
    public Integer getIsSystem() {
        return this.isSystem;
    }

    /**
     * Setter for isSystem - One Universal Product Code object as defined for your company.
     */
    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - One Universal Product Code object as defined for your company.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - One Universal Product Code object as defined for your company.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String description;

    /**
     * Getter for description - One Universal Product Code object as defined for your company.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - One Universal Product Code object as defined for your company.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Integer usage;

    /**
     * Getter for usage - One Universal Product Code object as defined for your company.
     */
    public Integer getUsage() {
        return this.usage;
    }

    /**
     * Setter for usage - One Universal Product Code object as defined for your company.
     */
    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - One Universal Product Code object as defined for your company.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - One Universal Product Code object as defined for your company.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String legacyTaxCode;

    /**
     * Getter for legacyTaxCode - One Universal Product Code object as defined for your company.
     */
    public String getLegacyTaxCode() {
        return this.legacyTaxCode;
    }

    /**
     * Setter for legacyTaxCode - One Universal Product Code object as defined for your company.
     */
    public void setLegacyTaxCode(String legacyTaxCode) {
        this.legacyTaxCode = legacyTaxCode;
    }

    
    private String upc;

    /**
     * Getter for upc - One Universal Product Code object as defined for your company.
     */
    public String getUpc() {
        return this.upc;
    }

    /**
     * Setter for upc - One Universal Product Code object as defined for your company.
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    
    private Integer id;

    /**
     * Getter for id - One Universal Product Code object as defined for your company.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - One Universal Product Code object as defined for your company.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - One Universal Product Code object as defined for your company.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - One Universal Product Code object as defined for your company.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - One Universal Product Code object as defined for your company.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - One Universal Product Code object as defined for your company.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - One Universal Product Code object as defined for your company.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - One Universal Product Code object as defined for your company.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - One Universal Product Code object as defined for your company.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - One Universal Product Code object as defined for your company.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - One Universal Product Code object as defined for your company.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - One Universal Product Code object as defined for your company.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of UPCModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    