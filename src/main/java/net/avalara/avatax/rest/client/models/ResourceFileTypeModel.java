package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Resource File Type Model
 */
public class ResourceFileTypeModel {
    private Integer resourceFileTypeId;

    /**
     * Getter for resourceFileTypeId - Resource File Type Model
     */
    public Integer getResourceFileTypeId() {
        return this.resourceFileTypeId;
    }

    /**
     * Setter for resourceFileTypeId - Resource File Type Model
     */
    public void setResourceFileTypeId(Integer resourceFileTypeId) {
        this.resourceFileTypeId = resourceFileTypeId;
    }

    
    private String name;

    /**
     * Getter for name - Resource File Type Model
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Resource File Type Model
     */
    public void setName(String name) {
        this.name = name;
    }

    


    /**
     * Returns a JSON string representation of ResourceFileTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    