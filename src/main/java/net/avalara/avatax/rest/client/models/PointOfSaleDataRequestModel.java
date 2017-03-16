package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Point-of-Sale Data Request Model
 */
public class PointOfSaleDataRequestModel {
    private ArrayList<String> locationCodes;

    /**
     * Getter for locationCodes - Point-of-Sale Data Request Model
     */
    public ArrayList<String> getLocationCodes() {
        return this.locationCodes;
    }

    /**
     * Setter for locationCodes - Point-of-Sale Data Request Model
     */
    public void setLocationCodes(ArrayList<String> locationCodes) {
        this.locationCodes = locationCodes;
    }

    
    private ArrayList<String> taxCodes;

    /**
     * Getter for taxCodes - Point-of-Sale Data Request Model
     */
    public ArrayList<String> getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes - Point-of-Sale Data Request Model
     */
    public void setTaxCodes(ArrayList<String> taxCodes) {
        this.taxCodes = taxCodes;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Point-of-Sale Data Request Model
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Point-of-Sale Data Request Model
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private PointOfSalePartnerId partnerId;

    /**
     * Getter for partnerId - Point-of-Sale Data Request Model
     */
    public PointOfSalePartnerId getPartnerId() {
        return this.partnerId;
    }

    /**
     * Setter for partnerId - Point-of-Sale Data Request Model
     */
    public void setPartnerId(PointOfSalePartnerId partnerId) {
        this.partnerId = partnerId;
    }

    
    private PointOfSaleFileType responseType;

    /**
     * Getter for responseType - Point-of-Sale Data Request Model
     */
    public PointOfSaleFileType getResponseType() {
        return this.responseType;
    }

    /**
     * Setter for responseType - Point-of-Sale Data Request Model
     */
    public void setResponseType(PointOfSaleFileType responseType) {
        this.responseType = responseType;
    }

    
    private Date documentDate;

    /**
     * Getter for documentDate - Point-of-Sale Data Request Model
     */
    public Date getDocumentDate() {
        return this.documentDate;
    }

    /**
     * Setter for documentDate - Point-of-Sale Data Request Model
     */
    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    
    private Boolean includeJurisCodes;

    /**
     * Getter for includeJurisCodes - Point-of-Sale Data Request Model
     */
    public Boolean getIncludeJurisCodes() {
        return this.includeJurisCodes;
    }

    /**
     * Setter for includeJurisCodes - Point-of-Sale Data Request Model
     */
    public void setIncludeJurisCodes(Boolean includeJurisCodes) {
        this.includeJurisCodes = includeJurisCodes;
    }

    


    /**
     * Returns a JSON string representation of PointOfSaleDataRequestModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    