package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a region, province, or state within a country
 */
public class IsoRegionModel {
    private String countryCode;

    /**
     * Getter for countryCode - The two-character ISO 3166 country code this region belongs to
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for countryCode - The two-character ISO 3166 country code this region belongs to
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    
    private String code;

    /**
     * Getter for code - The three character ISO 3166 region code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - The three character ISO 3166 region code
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String name;

    /**
     * Getter for name - The full name, using localized characters, for this region
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The full name, using localized characters, for this region
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String classification;

    /**
     * Getter for classification - The word in the local language that classifies what type of a region this represents
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * Setter for classification - The word in the local language that classifies what type of a region this represents
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    


    /**
     * Returns a JSON string representation of IsoRegionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    