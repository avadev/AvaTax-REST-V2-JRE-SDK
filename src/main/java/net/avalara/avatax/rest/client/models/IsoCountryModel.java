package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents an ISO 3166 recognized country
 */
public class IsoCountryModel {
    private String code;

    /**
     * Getter for code - The two character ISO 3166 country code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - The two character ISO 3166 country code
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String name;

    /**
     * Getter for name - The full name of this country as it is known in US English
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The full name of this country as it is known in US English
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Boolean isEuropeanUnion;

    /**
     * Getter for isEuropeanUnion - True if this country is a member of the European Union
     */
    public Boolean getIsEuropeanUnion() {
        return this.isEuropeanUnion;
    }

    /**
     * Setter for isEuropeanUnion - True if this country is a member of the European Union
     */
    public void setIsEuropeanUnion(Boolean isEuropeanUnion) {
        this.isEuropeanUnion = isEuropeanUnion;
    }

    


    /**
     * Returns a JSON string representation of IsoCountryModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    