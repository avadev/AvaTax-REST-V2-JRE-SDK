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
     * Getter for name - The name of the property.  To use this property, add a field on the "properties" object of a /api/v2/companies/(code)/transactions/create call.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The name of the property.  To use this property, add a field on the "properties" object of a /api/v2/companies/(code)/transactions/create call.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String description;

    /**
     * Getter for description - A full description of this property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A full description of this property.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this property.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this property.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String category;

    /**
     * Getter for category - The service category of this property.  Some properties may require that you subscribe to certain features of avatax before they can be used.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category - The service category of this property.  Some properties may require that you subscribe to certain features of avatax before they can be used.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
    private ParameterBagDataType dataType;

    /**
     * Getter for dataType - The data type of the property.
     */
    public ParameterBagDataType getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType - The data type of the property.
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
    