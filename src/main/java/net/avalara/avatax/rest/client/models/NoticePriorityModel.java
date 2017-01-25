package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Notice Priority Model
 */
public class NoticePriorityModel {
    private Integer id;

    /**
     * Getter for id - The unique ID number of this tax notice customer Priority.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this tax notice customer Priority.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - The description name of this tax authority Priority.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - The description name of this tax authority Priority.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Boolean activeFlag;

    /**
     * Getter for activeFlag - A flag if the Priority is active
     */
    public Boolean getActiveFlag() {
        return this.activeFlag;
    }

    /**
     * Setter for activeFlag - A flag if the Priority is active
     */
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    
    private Integer sortOrder;

    /**
     * Getter for sortOrder - sort order of the Prioritys
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder - sort order of the Prioritys
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    


    /**
     * Returns a JSON string representation of NoticePriorityModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    