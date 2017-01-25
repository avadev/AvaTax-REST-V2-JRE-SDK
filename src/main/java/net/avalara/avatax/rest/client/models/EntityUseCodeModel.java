package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a code describing the intended use for a product that may affect its taxability
 */
public class EntityUseCodeModel {
    private String code;

    /**
     * Getter for code - The Avalara-recognized entity use code for this definition
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - The Avalara-recognized entity use code for this definition
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String name;

    /**
     * Getter for name - The name of this entity use code
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The name of this entity use code
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String description;

    /**
     * Getter for description - Text describing the meaning of this use code
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Text describing the meaning of this use code
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private ArrayList<String> validCountries;

    /**
     * Getter for validCountries - A list of countries where this use code is valid
     */
    public ArrayList<String> getValidCountries() {
        return this.validCountries;
    }

    /**
     * Setter for validCountries - A list of countries where this use code is valid
     */
    public void setValidCountries(ArrayList<String> validCountries) {
        this.validCountries = validCountries;
    }

    


    /**
     * Returns a JSON string representation of EntityUseCodeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    