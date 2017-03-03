package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Worksheet Checkup Report Suggested Form Model
 */
public class FilingsCheckupSuggestedFormModel {
    private String returnName;

    /**
     * Getter for returnName - Worksheet Checkup Report Suggested Form Model
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - Worksheet Checkup Report Suggested Form Model
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    
    private String country;

    /**
     * Getter for country - Worksheet Checkup Report Suggested Form Model
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Worksheet Checkup Report Suggested Form Model
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String taxFormCode;

    /**
     * Getter for taxFormCode - Worksheet Checkup Report Suggested Form Model
     */
    public String getTaxFormCode() {
        return this.taxFormCode;
    }

    /**
     * Setter for taxFormCode - Worksheet Checkup Report Suggested Form Model
     */
    public void setTaxFormCode(String taxFormCode) {
        this.taxFormCode = taxFormCode;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Worksheet Checkup Report Suggested Form Model
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Worksheet Checkup Report Suggested Form Model
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String region;

    /**
     * Getter for region - Worksheet Checkup Report Suggested Form Model
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Worksheet Checkup Report Suggested Form Model
     */
    public void setRegion(String region) {
        this.region = region;
    }

    


    /**
     * Returns a JSON string representation of FilingsCheckupSuggestedFormModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    