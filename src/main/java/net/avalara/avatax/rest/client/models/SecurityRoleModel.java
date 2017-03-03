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
    private Byte id;

    /**
     * Getter for id - Represents a single security role.
     */
    public Byte getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a single security role.
     */
    public void setId(Byte id) {
        this.id = id;
    }

    
    private String description;

    /**
     * Getter for description - Represents a single security role.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents a single security role.
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
    