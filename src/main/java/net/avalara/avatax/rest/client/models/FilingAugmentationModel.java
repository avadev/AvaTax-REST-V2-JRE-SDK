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

    


    /**
     * Returns a JSON string representation of FilingAugmentationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    