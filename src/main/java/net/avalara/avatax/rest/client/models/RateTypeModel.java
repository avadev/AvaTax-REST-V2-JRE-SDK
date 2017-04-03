package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Rate type Model
 */
public class RateTypeModel {
    private String id;

    /**
     * Getter for id - Rate type Model
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id - Rate type Model
     */
    public void setId(String id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - Rate type Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Rate type Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String country;

    /**
     * Getter for country - Rate type Model
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Rate type Model
     */
    public void setCountry(String country) {
        this.country = country;
    }

    


    /**
     * Returns a JSON string representation of RateTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    