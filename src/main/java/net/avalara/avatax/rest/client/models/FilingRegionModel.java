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
    private Long filingId;

    /**
     * Getter for filingId - Regions
     */
    public Long getFilingId() {
        return this.filingId;
    }

    /**
     * Setter for filingId - Regions
     */
    public void setFilingId(Long filingId) {
        this.filingId = filingId;
    }

    
    private BigDecimal collectAmount;

    /**
     * Getter for collectAmount - Regions
     */
    public BigDecimal getCollectAmount() {
        return this.collectAmount;
    }

    /**
     * Setter for collectAmount - Regions
     */
    public void setCollectAmount(BigDecimal collectAmount) {
        this.collectAmount = collectAmount;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - Regions
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Regions
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Regions
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Regions
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private BigDecimal taxDueAmount;

    /**
     * Getter for taxDueAmount - Regions
     */
    public BigDecimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount - Regions
     */
    public void setTaxDueAmount(BigDecimal taxDueAmount) {
        this.taxDueAmount = taxDueAmount;
    }

    
    private String country;

    /**
     * Getter for country - Regions
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Regions
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount - Regions
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount - Regions
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    private Long id;

    /**
     * Getter for id - Regions
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Regions
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private BigDecimal totalRemittanceAmount;

    /**
     * Getter for totalRemittanceAmount - Regions
     */
    public BigDecimal getTotalRemittanceAmount() {
        return this.totalRemittanceAmount;
    }

    /**
     * Setter for totalRemittanceAmount - Regions
     */
    public void setTotalRemittanceAmount(BigDecimal totalRemittanceAmount) {
        this.totalRemittanceAmount = totalRemittanceAmount;
    }

    
    private Date approveDate;

    /**
     * Getter for approveDate - Regions
     */
    public Date getApproveDate() {
        return this.approveDate;
    }

    /**
     * Setter for approveDate - Regions
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    
    private ArrayList<FilingReturnModel> returns;

    /**
     * Getter for returns - Regions
     */
    public ArrayList<FilingReturnModel> getReturns() {
        return this.returns;
    }

    /**
     * Setter for returns - Regions
     */
    public void setReturns(ArrayList<FilingReturnModel> returns) {
        this.returns = returns;
    }

    
    private FilingStatusId status;

    /**
     * Getter for status - Regions
     */
    public FilingStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Regions
     */
    public void setStatus(FilingStatusId status) {
        this.status = status;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Regions
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Regions
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Regions
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Regions
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - Regions
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Regions
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private BigDecimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount - Regions
     */
    public BigDecimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount - Regions
     */
    public void setConsumerUseNonTaxableAmount(BigDecimal consumerUseNonTaxableAmount) {
        this.consumerUseNonTaxableAmount = consumerUseNonTaxableAmount;
    }

    
    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount - Regions
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount - Regions
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    
    private BigDecimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount - Regions
     */
    public BigDecimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount - Regions
     */
    public void setConsumerUseTaxableAmount(BigDecimal consumerUseTaxableAmount) {
        this.consumerUseTaxableAmount = consumerUseTaxableAmount;
    }

    
    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount - Regions
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount - Regions
     */
    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    
    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount - Regions
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount - Regions
     */
    public void setNonTaxableAmount(BigDecimal nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    
    private Boolean hasNexus;

    /**
     * Getter for hasNexus - Regions
     */
    public Boolean getHasNexus() {
        return this.hasNexus;
    }

    /**
     * Setter for hasNexus - Regions
     */
    public void setHasNexus(Boolean hasNexus) {
        this.hasNexus = hasNexus;
    }

    
    private BigDecimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount - Regions
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount - Regions
     */
    public void setConsumerUseTaxAmount(BigDecimal consumerUseTaxAmount) {
        this.consumerUseTaxAmount = consumerUseTaxAmount;
    }

    
    private Date startDate;

    /**
     * Getter for startDate - Regions
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate - Regions
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    
    private ArrayList<FilingsCheckupSuggestedFormModel> suggestReturns;

    /**
     * Getter for suggestReturns - Regions
     */
    public ArrayList<FilingsCheckupSuggestedFormModel> getSuggestReturns() {
        return this.suggestReturns;
    }

    /**
     * Setter for suggestReturns - Regions
     */
    public void setSuggestReturns(ArrayList<FilingsCheckupSuggestedFormModel> suggestReturns) {
        this.suggestReturns = suggestReturns;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Regions
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Regions
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of FilingRegionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    