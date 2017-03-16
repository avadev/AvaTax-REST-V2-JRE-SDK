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
    private String name;

    /**
     * Getter for name - Represents a region, province, or state within a country
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents a region, province, or state within a country
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Boolean streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax - Represents a region, province, or state within a country
     */
    public Boolean getStreamlinedSalesTax() {
        return this.streamlinedSalesTax;
    }

    /**
     * Setter for streamlinedSalesTax - Represents a region, province, or state within a country
     */
    public void setStreamlinedSalesTax(Boolean streamlinedSalesTax) {
        this.streamlinedSalesTax = streamlinedSalesTax;
    }

    
    private String code;

    /**
     * Getter for code - Represents a region, province, or state within a country
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - Represents a region, province, or state within a country
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String countryCode;

    /**
     * Getter for countryCode - Represents a region, province, or state within a country
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for countryCode - Represents a region, province, or state within a country
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    
    private String classification;

    /**
     * Getter for classification - Represents a region, province, or state within a country
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * Setter for classification - Represents a region, province, or state within a country
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
    