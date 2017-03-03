package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents information about a single legal taxing jurisdiction
 */
public class JurisdictionModel {
    private BigDecimal rate;

    /**
     * Getter for rate - Represents information about a single legal taxing jurisdiction
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate - Represents information about a single legal taxing jurisdiction
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    
    private String name;

    /**
     * Getter for name - Represents information about a single legal taxing jurisdiction
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents information about a single legal taxing jurisdiction
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String code;

    /**
     * Getter for code - Represents information about a single legal taxing jurisdiction
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - Represents information about a single legal taxing jurisdiction
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private BigDecimal salesRate;

    /**
     * Getter for salesRate - Represents information about a single legal taxing jurisdiction
     */
    public BigDecimal getSalesRate() {
        return this.salesRate;
    }

    /**
     * Setter for salesRate - Represents information about a single legal taxing jurisdiction
     */
    public void setSalesRate(BigDecimal salesRate) {
        this.salesRate = salesRate;
    }

    
    private BigDecimal useRate;

    /**
     * Getter for useRate - Represents information about a single legal taxing jurisdiction
     */
    public BigDecimal getUseRate() {
        return this.useRate;
    }

    /**
     * Setter for useRate - Represents information about a single legal taxing jurisdiction
     */
    public void setUseRate(BigDecimal useRate) {
        this.useRate = useRate;
    }

    
    private String region;

    /**
     * Getter for region - Represents information about a single legal taxing jurisdiction
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents information about a single legal taxing jurisdiction
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private JurisdictionType type;

    /**
     * Getter for type - Represents information about a single legal taxing jurisdiction
     */
    public JurisdictionType getType() {
        return this.type;
    }

    /**
     * Setter for type - Represents information about a single legal taxing jurisdiction
     */
    public void setType(JurisdictionType type) {
        this.type = type;
    }

    
    private String signatureCode;

    /**
     * Getter for signatureCode - Represents information about a single legal taxing jurisdiction
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode - Represents information about a single legal taxing jurisdiction
     */
    public void setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
    }

    


    /**
     * Returns a JSON string representation of JurisdictionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    