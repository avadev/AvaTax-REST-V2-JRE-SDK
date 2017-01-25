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
     * Getter for id - The unique ID number of this tax authority type.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this tax authority type.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - The description name of this tax authority type.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - The description name of this tax authority type.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Boolean isOpen;

    /**
     * Getter for isOpen - True if a tax notice in this status is considered 'open' and has more work expected to be done before it is closed.
     */
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    /**
     * Setter for isOpen - True if a tax notice in this status is considered 'open' and has more work expected to be done before it is closed.
     */
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    
    private Integer sortOrder;

    /**
     * Getter for sortOrder - If a list of status values is to be displayed in a dropdown, they should be displayed in this numeric order.
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder - If a list of status values is to be displayed in a dropdown, they should be displayed in this numeric order.
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
    