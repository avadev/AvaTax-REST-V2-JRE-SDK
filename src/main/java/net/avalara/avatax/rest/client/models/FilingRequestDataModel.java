package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a commitment to file a tax return on a recurring basis.
            Only used if you subscribe to Avalara Returns.
 */
public class FilingRequestDataModel {
    private String taxTypeId;

    /**
     * Getter for taxTypeId - 
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - 
     */
    public void setTaxTypeId(String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - 
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String returnName;

    /**
     * Getter for returnName - 
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - 
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    
    private String registrationId;

    /**
     * Getter for registrationId - 
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * Setter for registrationId - 
     */
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - 
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - 
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private Date effDate;

    /**
     * Getter for effDate - 
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate - 
     */
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    
    private ArrayList<FilingAnswer> answers;

    /**
     * Getter for answers - 
     */
    public ArrayList<FilingAnswer> getAnswers() {
        return this.answers;
    }

    /**
     * Setter for answers - 
     */
    public void setAnswers(ArrayList<FilingAnswer> answers) {
        this.answers = answers;
    }

    
    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId - 
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId - 
     */
    public void setFilingFrequencyId(FilingFrequencyId filingFrequencyId) {
        this.filingFrequencyId = filingFrequencyId;
    }

    
    private Integer months;

    /**
     * Getter for months - 
     */
    public Integer getMonths() {
        return this.months;
    }

    /**
     * Setter for months - 
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

    
    private Long companyReturnId;

    /**
     * Getter for companyReturnId - 
     */
    public Long getCompanyReturnId() {
        return this.companyReturnId;
    }

    /**
     * Setter for companyReturnId - 
     */
    public void setCompanyReturnId(Long companyReturnId) {
        this.companyReturnId = companyReturnId;
    }

    


    /**
     * Returns a JSON string representation of FilingRequestDataModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    