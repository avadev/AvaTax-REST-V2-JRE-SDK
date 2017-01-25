package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Regions
 */
public class FilingRegionModel {
    private Date endDate;

    /**
     * Getter for endDate - The end date for the filing cycle.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - The end date for the filing cycle.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String country;

    /**
     * Getter for country - The two-character ISO-3166 code for the country.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The two-character ISO-3166 code for the country.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount - The tax amount.
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount - The tax amount.
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this filing region.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this filing region.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private Date approveDate;

    /**
     * Getter for approveDate - The date the filing region was approved.
     */
    public Date getApproveDate() {
        return this.approveDate;
    }

    /**
     * Setter for approveDate - The date the filing region was approved.
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    
    private ArrayList<FilingReturnModel> returns;

    /**
     * Getter for returns - A list of tax returns in this region.
     */
    public ArrayList<FilingReturnModel> getReturns() {
        return this.returns;
    }

    /**
     * Setter for returns - A list of tax returns in this region.
     */
    public void setReturns(ArrayList<FilingReturnModel> returns) {
        this.returns = returns;
    }

    
    private WorksheetStatusId status;

    /**
     * Getter for status - The current status of the filing region.
     */
    public WorksheetStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status - The current status of the filing region.
     */
    public void setStatus(WorksheetStatusId status) {
        this.status = status;
    }

    
    private String region;

    /**
     * Getter for region - The two or three character region code for the region.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The two or three character region code for the region.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private BigDecimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount - Consumer use non-taxable amount.
     */
    public BigDecimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount - Consumer use non-taxable amount.
     */
    public void setConsumerUseNonTaxableAmount(BigDecimal consumerUseNonTaxableAmount) {
        this.consumerUseNonTaxableAmount = consumerUseNonTaxableAmount;
    }

    
    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount - The taxable amount.
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount - The taxable amount.
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    
    private BigDecimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount - Consumer use taxable amount.
     */
    public BigDecimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount - Consumer use taxable amount.
     */
    public void setConsumerUseTaxableAmount(BigDecimal consumerUseTaxableAmount) {
        this.consumerUseTaxableAmount = consumerUseTaxableAmount;
    }

    
    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount - The sales amount.
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount - The sales amount.
     */
    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    
    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount - The non-taxable amount.
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount - The non-taxable amount.
     */
    public void setNonTaxableAmount(BigDecimal nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    
    private Boolean hasNexus;

    /**
     * Getter for hasNexus - Whether or not you have nexus in this region.
     */
    public Boolean getHasNexus() {
        return this.hasNexus;
    }

    /**
     * Setter for hasNexus - Whether or not you have nexus in this region.
     */
    public void setHasNexus(Boolean hasNexus) {
        this.hasNexus = hasNexus;
    }

    
    private BigDecimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount - Consumer use tax liability.
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount - Consumer use tax liability.
     */
    public void setConsumerUseTaxAmount(BigDecimal consumerUseTaxAmount) {
        this.consumerUseTaxAmount = consumerUseTaxAmount;
    }

    
    private Date startDate;

    /**
     * Getter for startDate - The start date for the filing cycle.
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate - The start date for the filing cycle.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    
    private BigDecimal taxAmountDue;

    /**
     * Getter for taxAmountDue - The tax amount due.
     */
    public BigDecimal getTaxAmountDue() {
        return this.taxAmountDue;
    }

    /**
     * Setter for taxAmountDue - The tax amount due.
     */
    public void setTaxAmountDue(BigDecimal taxAmountDue) {
        this.taxAmountDue = taxAmountDue;
    }

    


    /**
     * Returns a JSON string representation of FilingRegionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    