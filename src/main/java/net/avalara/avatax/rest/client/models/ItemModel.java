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
     * Getter for taxCode - Represents an item in your company's product catalog.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - Represents an item in your company's product catalog.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private String description;

    /**
     * Getter for description - Represents an item in your company's product catalog.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents an item in your company's product catalog.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents an item in your company's product catalog.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents an item in your company's product catalog.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer taxCodeId;

    /**
     * Getter for taxCodeId - Represents an item in your company's product catalog.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId - Represents an item in your company's product catalog.
     */
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    
    private Long id;

    /**
     * Getter for id - Represents an item in your company's product catalog.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents an item in your company's product catalog.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents an item in your company's product catalog.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents an item in your company's product catalog.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents an item in your company's product catalog.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents an item in your company's product catalog.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String itemCode;

    /**
     * Getter for itemCode - Represents an item in your company's product catalog.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode - Represents an item in your company's product catalog.
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents an item in your company's product catalog.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents an item in your company's product catalog.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents an item in your company's product catalog.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents an item in your company's product catalog.
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
    