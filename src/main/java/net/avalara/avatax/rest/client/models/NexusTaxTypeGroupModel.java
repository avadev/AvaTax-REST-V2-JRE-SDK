package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 */
public class NexusTaxTypeGroupModel {
    private Integer id;

    /**
     * Getter for id - 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String nexusTaxTypeGroupId;

    /**
     * Getter for nexusTaxTypeGroupId - 
     */
    public String getNexusTaxTypeGroupId() {
        return this.nexusTaxTypeGroupId;
    }

    /**
     * Setter for nexusTaxTypeGroupId - 
     */
    public void setNexusTaxTypeGroupId(String nexusTaxTypeGroupId) {
        this.nexusTaxTypeGroupId = nexusTaxTypeGroupId;
    }

    
    private String description;

    /**
     * Getter for description - 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of NexusTaxTypeGroupModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    