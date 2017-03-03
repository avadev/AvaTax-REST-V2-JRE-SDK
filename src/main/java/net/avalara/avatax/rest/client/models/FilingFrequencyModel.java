package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * FilingFrequency Model
 */
public class FilingFrequencyModel {
    private Integer id;

    /**
     * Getter for id - FilingFrequency Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - FilingFrequency Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - FilingFrequency Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - FilingFrequency Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of FilingFrequencyModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    