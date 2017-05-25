package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents one configuration setting for this company
 */
public class CompanyConfigurationModel {
    private String name;

    /**
     * Getter for name - Represents one configuration setting for this company
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents one configuration setting for this company
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents one configuration setting for this company
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents one configuration setting for this company
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents one configuration setting for this company
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents one configuration setting for this company
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents one configuration setting for this company
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents one configuration setting for this company
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String category;

    /**
     * Getter for category - Represents one configuration setting for this company
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category - Represents one configuration setting for this company
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
    private String value;

    /**
     * Getter for value - Represents one configuration setting for this company
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value - Represents one configuration setting for this company
     */
    public void setValue(String value) {
        this.value = value;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents one configuration setting for this company
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents one configuration setting for this company
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents one configuration setting for this company
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents one configuration setting for this company
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of CompanyConfigurationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    