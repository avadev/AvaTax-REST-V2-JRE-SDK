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
    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxTypeId(MatchingTaxType taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxAuthorityName(String taxAuthorityName) {
        this.taxAuthorityName = taxAuthorityName;
    }

    
    private String returnName;

    /**
     * Getter for returnName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    
    private String registrationId;

    /**
     * Getter for registrationId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * Setter for registrationId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private Date effDate;

    /**
     * Getter for effDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    
    private ArrayList<FilingAnswerModel> answers;

    /**
     * Getter for answers - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public ArrayList<FilingAnswerModel> getAnswers() {
        return this.answers;
    }

    /**
     * Setter for answers - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setAnswers(ArrayList<FilingAnswerModel> answers) {
        this.answers = answers;
    }

    
    private Boolean isClone;

    /**
     * Getter for isClone - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Boolean getIsClone() {
        return this.isClone;
    }

    /**
     * Setter for isClone - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setIsClone(Boolean isClone) {
        this.isClone = isClone;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String region;

    /**
     * Getter for region - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setFilingFrequencyId(FilingFrequencyId filingFrequencyId) {
        this.filingFrequencyId = filingFrequencyId;
    }

    
    private Short months;

    /**
     * Getter for months - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Short getMonths() {
        return this.months;
    }

    /**
     * Setter for months - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setMonths(Short months) {
        this.months = months;
    }

    
    private Long companyReturnId;

    /**
     * Getter for companyReturnId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Long getCompanyReturnId() {
        return this.companyReturnId;
    }

    /**
     * Setter for companyReturnId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
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
    