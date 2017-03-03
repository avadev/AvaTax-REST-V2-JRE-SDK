package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a service or a subscription type.
 */
public class SubscriptionTypeModel {
    private Integer id;

    /**
     * Getter for id - Represents a service or a subscription type.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a service or a subscription type.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - Represents a service or a subscription type.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents a service or a subscription type.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of SubscriptionTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    