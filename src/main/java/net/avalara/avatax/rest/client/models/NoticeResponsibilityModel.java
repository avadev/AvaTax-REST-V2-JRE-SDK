package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * NoticeResponsibility Model
 */
public class NoticeResponsibilityModel {
    private Integer id;

    /**
     * Getter for id - NoticeResponsibility Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - NoticeResponsibility Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - NoticeResponsibility Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - NoticeResponsibility Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - NoticeResponsibility Model
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - NoticeResponsibility Model
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    private Integer sortOrder;

    /**
     * Getter for sortOrder - NoticeResponsibility Model
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder - NoticeResponsibility Model
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    


    /**
     * Returns a JSON string representation of NoticeResponsibilityModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    