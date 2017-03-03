package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Notice Status Model
 */
public class NoticeStatusModel {
    private Integer id;

    /**
     * Getter for id - Tax Notice Status Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Tax Notice Status Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - Tax Notice Status Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Tax Notice Status Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Boolean isOpen;

    /**
     * Getter for isOpen - Tax Notice Status Model
     */
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    /**
     * Setter for isOpen - Tax Notice Status Model
     */
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    
    private Integer sortOrder;

    /**
     * Getter for sortOrder - Tax Notice Status Model
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder - Tax Notice Status Model
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    


    /**
     * Returns a JSON string representation of NoticeStatusModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    