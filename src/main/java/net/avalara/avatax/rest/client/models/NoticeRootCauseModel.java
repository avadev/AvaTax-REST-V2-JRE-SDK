package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * NoticeRootCause Model
 */
public class NoticeRootCauseModel {
    private Integer id;

    /**
     * Getter for id - NoticeRootCause Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - NoticeRootCause Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - NoticeRootCause Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - NoticeRootCause Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - NoticeRootCause Model
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - NoticeRootCause Model
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    private Integer sortOrder;

    /**
     * Getter for sortOrder - NoticeRootCause Model
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder - NoticeRootCause Model
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    


    /**
     * Returns a JSON string representation of NoticeRootCauseModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    