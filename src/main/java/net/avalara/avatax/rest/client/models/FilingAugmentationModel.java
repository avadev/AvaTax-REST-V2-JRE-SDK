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
    private Long id;

    /**
     * Getter for id - The unique ID number for the augmentation.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number for the augmentation.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private BigDecimal fieldAmount;

    /**
     * Getter for fieldAmount - The field amount.
     */
    public BigDecimal getFieldAmount() {
        return this.fieldAmount;
    }

    /**
     * Setter for fieldAmount - The field amount.
     */
    public void setFieldAmount(BigDecimal fieldAmount) {
        this.fieldAmount = fieldAmount;
    }

    
    private String fieldName;

    /**
     * Getter for fieldName - The field name.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Setter for fieldName - The field name.
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    


    /**
     * Returns a JSON string representation of FilingAugmentationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    