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
     * Getter for isSystem - A flag indicating whether this UPC code is attached to the AvaTax system or to a company.
     */
    public Integer getIsSystem() {
        return this.isSystem;
    }

    /**
     * Setter for isSystem - A flag indicating whether this UPC code is attached to the AvaTax system or to a company.
     */
    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - If this UPC expired or will expire on a certain date, this contains the last date on which the UPC was effective.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - If this UPC expired or will expire on a certain date, this contains the last date on which the UPC was effective.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String description;

    /**
     * Getter for description - Description of the product to which this UPC applies.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Description of the product to which this UPC applies.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Integer usage;

    /**
     * Getter for usage - A usage identifier for this UPC code.
     */
    public Integer getUsage() {
        return this.usage;
    }

    /**
     * Setter for usage - A usage identifier for this UPC code.
     */
    public void setUsage(Integer usage) {
        this.usage = usage;
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

    
    private String legacyTaxCode;

    /**
     * Getter for legacyTaxCode - Legacy Tax Code applied to any product sold with this UPC.
     */
    public String getLegacyTaxCode() {
        return this.legacyTaxCode;
    }

    /**
     * Setter for legacyTaxCode - Legacy Tax Code applied to any product sold with this UPC.
     */
    public void setLegacyTaxCode(String legacyTaxCode) {
        this.legacyTaxCode = legacyTaxCode;
    }

    
    private String upc;

    /**
     * Getter for upc - The 12-14 character Universal Product Code, European Article Number, or Global Trade Identification Number.
     */
    public String getUpc() {
        return this.upc;
    }

    /**
     * Setter for upc - The 12-14 character Universal Product Code, European Article Number, or Global Trade Identification Number.
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number for this UPC.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number for this UPC.
     */
    public void setId(Integer id) {
        this.id = id;
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

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - If this UPC became effective on a certain date, this contains the first date on which the UPC was effective.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - If this UPC became effective on a certain date, this contains the first date on which the UPC was effective.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company to which this UPC belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company to which this UPC belongs.
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
     * Returns a JSON string representation of UPCModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    