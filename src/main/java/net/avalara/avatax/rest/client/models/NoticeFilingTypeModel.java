package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Notice FilingType Model
 */
public class NoticeFilingTypeModel {
    private Integer id;

    /**
     * Getter for id - Tax Notice FilingType Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Tax Notice FilingType Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - Tax Notice FilingType Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Tax Notice FilingType Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Boolean activeFlag;

    /**
     * Getter for activeFlag - Tax Notice FilingType Model
     */
    public Boolean getActiveFlag() {
        return this.activeFlag;
    }

    /**
     * Setter for activeFlag - Tax Notice FilingType Model
     */
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    
    private Integer sortOrder;

    /**
     * Getter for sortOrder - Tax Notice FilingType Model
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder - Tax Notice FilingType Model
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    


    /**
     * Returns a JSON string representation of NoticeFilingTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    