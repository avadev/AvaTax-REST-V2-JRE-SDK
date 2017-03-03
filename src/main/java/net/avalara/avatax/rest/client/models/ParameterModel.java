package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * An extra property that can change the behavior of tax transactions.
 */
public class ParameterModel {
    private String name;

    /**
     * Getter for name - An extra property that can change the behavior of tax transactions.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - An extra property that can change the behavior of tax transactions.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String description;

    /**
     * Getter for description - An extra property that can change the behavior of tax transactions.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - An extra property that can change the behavior of tax transactions.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Long id;

    /**
     * Getter for id - An extra property that can change the behavior of tax transactions.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - An extra property that can change the behavior of tax transactions.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String category;

    /**
     * Getter for category - An extra property that can change the behavior of tax transactions.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category - An extra property that can change the behavior of tax transactions.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
    private ParameterBagDataType dataType;

    /**
     * Getter for dataType - An extra property that can change the behavior of tax transactions.
     */
    public ParameterBagDataType getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType - An extra property that can change the behavior of tax transactions.
     */
    public void setDataType(ParameterBagDataType dataType) {
        this.dataType = dataType;
    }

    


    /**
     * Returns a JSON string representation of ParameterModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    