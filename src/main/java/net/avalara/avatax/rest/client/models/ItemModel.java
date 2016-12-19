package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents an item in your company's product catalog.
 */
public class ItemModel {
    private String taxCode;

    /**
     * Getter for taxCode - The unique code string of the Tax Code that is applied when selling this item.
            When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - The unique code string of the Tax Code that is applied when selling this item.
            When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private String description;

    /**
     * Getter for description - A friendly description of this item in your product catalog.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A friendly description of this item in your product catalog.
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

    
    private Integer taxCodeId;

    /**
     * Getter for taxCodeId - The unique ID number of the tax code that is applied when selling this item.
            When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId - The unique ID number of the tax code that is applied when selling this item.
            When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this item.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this item.
     */
    public void setId(Long id) {
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

    
    private String itemCode;

    /**
     * Getter for itemCode - A unique code representing this item.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode - A unique code representing this item.
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company that owns this item.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company that owns this item.
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
     * Returns a JSON string representation of ItemModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    