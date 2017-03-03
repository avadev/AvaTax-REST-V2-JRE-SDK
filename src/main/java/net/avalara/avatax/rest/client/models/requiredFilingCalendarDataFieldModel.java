package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a verification request using Skyscraper for a company
 */
public class requiredFilingCalendarDataFieldModel {
    private String name;

    /**
     * Getter for name - Represents a verification request using Skyscraper for a company
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents a verification request using Skyscraper for a company
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String description;

    /**
     * Getter for description - Represents a verification request using Skyscraper for a company
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents a verification request using Skyscraper for a company
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of requiredFilingCalendarDataFieldModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    