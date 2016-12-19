package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a single security role.
 */
public class SecurityRoleModel {
    private String id;

    /**
     * Getter for id - The unique ID number of this security role.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this security role.
     */
    public void setId(String id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - A description of this security role
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A description of this security role
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of SecurityRoleModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    