package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Returns
 */
public class FilingReturnModel {
    private String formName;

    /**
     * Getter for formName - Returns
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName - Returns
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    
    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency - Returns
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency - Returns
     */
    public void setFilingFrequency(FilingFrequencyId filingFrequency) {
        this.filingFrequency = filingFrequency;
    }

    
    private Long filingCalendarId;

    /**
     * Getter for filingCalendarId - Returns
     */
    public Long getFilingCalendarId() {
        return this.filingCalendarId;
    }

    /**
     * Setter for filingCalendarId - Returns
     */
    public void setFilingCalendarId(Long filingCalendarId) {
        this.filingCalendarId = filingCalendarId;
    }

    
    private String description;

    /**
     * Getter for description - Returns
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Returns
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private FilingTypeId filingType;

    /**
     * Getter for filingType - Returns
     */
    public FilingTypeId getFilingType() {
        return this.filingType;
    }

    /**
     * Setter for filingType - Returns
     */
    public void setFilingType(FilingTypeId filingType) {
        this.filingType = filingType;
    }

    
    private AccrualType accrualType;

    /**
     * Getter for accrualType - Returns
     */
    public AccrualType getAccrualType() {
        return this.accrualType;
    }

    /**
     * Setter for accrualType - Returns
     */
    public void setAccrualType(AccrualType accrualType) {
        this.accrualType = accrualType;
    }

    
    private BigDecimal taxDueAmount;

    /**
     * Getter for taxDueAmount - Returns
     */
    public BigDecimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount - Returns
     */
    public void setTaxDueAmount(BigDecimal taxDueAmount) {
        this.taxDueAmount = taxDueAmount;
    }

    
    private Date filedDate;

    /**
     * Getter for filedDate - Returns
     */
    public Date getFiledDate() {
        return this.filedDate;
    }

    /**
     * Setter for filedDate - Returns
     */
    public void setFiledDate(Date filedDate) {
        this.filedDate = filedDate;
    }

    
    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount - Returns
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount - Returns
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    private Long id;

    /**
     * Getter for id - Returns
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Returns
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String formCode;

    /**
     * Getter for formCode - Returns
     */
    public String getFormCode() {
        return this.formCode;
    }

    /**
     * Setter for formCode - Returns
     */
    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    
    private BigDecimal remitAmount;

    /**
     * Getter for remitAmount - Returns
     */
    public BigDecimal getRemitAmount() {
        return this.remitAmount;
    }

    /**
     * Setter for remitAmount - Returns
     */
    public void setRemitAmount(BigDecimal remitAmount) {
        this.remitAmount = remitAmount;
    }

    
    private ArrayList<FilingAugmentationModel> augmentations;

    /**
     * Getter for augmentations - Returns
     */
    public ArrayList<FilingAugmentationModel> getAugmentations() {
        return this.augmentations;
    }

    /**
     * Setter for augmentations - Returns
     */
    public void setAugmentations(ArrayList<FilingAugmentationModel> augmentations) {
        this.augmentations = augmentations;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Returns
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Returns
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private FilingStatusId status;

    /**
     * Getter for status - Returns
     */
    public FilingStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Returns
     */
    public void setStatus(FilingStatusId status) {
        this.status = status;
    }

    
    private BigDecimal nonTaxableDueAmount;

    /**
     * Getter for nonTaxableDueAmount - Returns
     */
    public BigDecimal getNonTaxableDueAmount() {
        return this.nonTaxableDueAmount;
    }

    /**
     * Setter for nonTaxableDueAmount - Returns
     */
    public void setNonTaxableDueAmount(BigDecimal nonTaxableDueAmount) {
        this.nonTaxableDueAmount = nonTaxableDueAmount;
    }

    
    private BigDecimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount - Returns
     */
    public BigDecimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount - Returns
     */
    public void setConsumerUseNonTaxableAmount(BigDecimal consumerUseNonTaxableAmount) {
        this.consumerUseNonTaxableAmount = consumerUseNonTaxableAmount;
    }

    
    private ArrayList<FilingAdjustmentModel> adjustments;

    /**
     * Getter for adjustments - Returns
     */
    public ArrayList<FilingAdjustmentModel> getAdjustments() {
        return this.adjustments;
    }

    /**
     * Setter for adjustments - Returns
     */
    public void setAdjustments(ArrayList<FilingAdjustmentModel> adjustments) {
        this.adjustments = adjustments;
    }

    
    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount - Returns
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount - Returns
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    
    private BigDecimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount - Returns
     */
    public BigDecimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount - Returns
     */
    public void setConsumerUseTaxableAmount(BigDecimal consumerUseTaxableAmount) {
        this.consumerUseTaxableAmount = consumerUseTaxableAmount;
    }

    
    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount - Returns
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount - Returns
     */
    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    
    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount - Returns
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount - Returns
     */
    public void setNonTaxableAmount(BigDecimal nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    
    private BigDecimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount - Returns
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount - Returns
     */
    public void setConsumerUseTaxAmount(BigDecimal consumerUseTaxAmount) {
        this.consumerUseTaxAmount = consumerUseTaxAmount;
    }

    


    /**
     * Returns a JSON string representation of FilingReturnModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    