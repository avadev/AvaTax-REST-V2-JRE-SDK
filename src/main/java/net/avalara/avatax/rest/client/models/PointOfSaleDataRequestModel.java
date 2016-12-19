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
     * Getter for locationCodes - A list of location codes to include in this point-of-sale file. If no location codes are specified, response will include all locations within your company.
     */
    public ArrayList<String> getLocationCodes() {
        return this.locationCodes;
    }

    /**
     * Setter for locationCodes - A list of location codes to include in this point-of-sale file. If no location codes are specified, response will include all locations within your company.
     */
    public void setLocationCodes(ArrayList<String> locationCodes) {
        this.locationCodes = locationCodes;
    }

    
    private ArrayList<String> taxCodes;

    /**
     * Getter for taxCodes - A list of tax codes to include in this point-of-sale file. If no tax codes are specified, response will include all distinct tax codes associated with the Items within your company.
     */
    public ArrayList<String> getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes - A list of tax codes to include in this point-of-sale file. If no tax codes are specified, response will include all distinct tax codes associated with the Items within your company.
     */
    public void setTaxCodes(ArrayList<String> taxCodes) {
        this.taxCodes = taxCodes;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - A unique code that references a company within your account.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - A unique code that references a company within your account.
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private Integer partnerId;

    /**
     * Getter for partnerId - A unique code assoicated with the Partner you may be working with. If you are not working with a Partner or your Partner has not provided you an ID, leave null.
     */
    public Integer getPartnerId() {
        return this.partnerId;
    }

    /**
     * Setter for partnerId - A unique code assoicated with the Partner you may be working with. If you are not working with a Partner or your Partner has not provided you an ID, leave null.
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    
    private PointOfSaleFileType responseType;

    /**
     * Getter for responseType - The format of your response. Formats include JSON, CSV, and XML.
     */
    public PointOfSaleFileType getResponseType() {
        return this.responseType;
    }

    /**
     * Setter for responseType - The format of your response. Formats include JSON, CSV, and XML.
     */
    public void setResponseType(PointOfSaleFileType responseType) {
        this.responseType = responseType;
    }

    
    private Date documentDate;

    /**
     * Getter for documentDate - The date associated with the response content. Default is current date. This field can be used to backdate or postdate the response content.
     */
    public Date getDocumentDate() {
        return this.documentDate;
    }

    /**
     * Setter for documentDate - The date associated with the response content. Default is current date. This field can be used to backdate or postdate the response content.
     */
    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    
    private Boolean includeJurisCodes;

    /**
     * Getter for includeJurisCodes - Set this value to true to include Juris Code in the response.
     */
    public Boolean getIncludeJurisCodes() {
        return this.includeJurisCodes;
    }

    /**
     * Setter for includeJurisCodes - Set this value to true to include Juris Code in the response.
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
    