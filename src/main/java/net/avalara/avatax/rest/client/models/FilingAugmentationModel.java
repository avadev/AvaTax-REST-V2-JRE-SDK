package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A model for return augmentations.
 */
public class FilingAugmentationModel {
    private Long filingId;

    /**
     * Getter for filingId - A model for return augmentations.
     */
    public Long getFilingId() {
        return this.filingId;
    }

    /**
     * Setter for filingId - A model for return augmentations.
     */
    public void setFilingId(Long filingId) {
        this.filingId = filingId;
    }

    
    private BigDecimal fieldAmount;

    /**
     * Getter for fieldAmount - A model for return augmentations.
     */
    public BigDecimal getFieldAmount() {
        return this.fieldAmount;
    }

    /**
     * Setter for fieldAmount - A model for return augmentations.
     */
    public void setFieldAmount(BigDecimal fieldAmount) {
        this.fieldAmount = fieldAmount;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - A model for return augmentations.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - A model for return augmentations.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Long id;

    /**
     * Getter for id - A model for return augmentations.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - A model for return augmentations.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String fieldName;

    /**
     * Getter for fieldName - A model for return augmentations.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Setter for fieldName - A model for return augmentations.
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - A model for return augmentations.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - A model for return augmentations.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - A model for return augmentations.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - A model for return augmentations.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - A model for return augmentations.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - A model for return augmentations.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of FilingAugmentationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    