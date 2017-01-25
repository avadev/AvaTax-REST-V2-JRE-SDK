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
     * Getter for formName - The name of the form.
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName - The name of the form.
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    
    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency - The filing frequency of the return.
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency - The filing frequency of the return.
     */
    public void setFilingFrequency(FilingFrequencyId filingFrequency) {
        this.filingFrequency = filingFrequency;
    }

    
    private Long filingCalendarId;

    /**
     * Getter for filingCalendarId - The unique ID number of the filing calendar associated with this return.
     */
    public Long getFilingCalendarId() {
        return this.filingCalendarId;
    }

    /**
     * Setter for filingCalendarId - The unique ID number of the filing calendar associated with this return.
     */
    public void setFilingCalendarId(Long filingCalendarId) {
        this.filingCalendarId = filingCalendarId;
    }

    
    private String description;

    /**
     * Getter for description - A description for the return.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A description for the return.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private FilingTypeId filingType;

    /**
     * Getter for filingType - The filing type of the return.
     */
    public FilingTypeId getFilingType() {
        return this.filingType;
    }

    /**
     * Setter for filingType - The filing type of the return.
     */
    public void setFilingType(FilingTypeId filingType) {
        this.filingType = filingType;
    }

    
    private BigDecimal taxDueAmount;

    /**
     * Getter for taxDueAmount - The tax due amount.
     */
    public BigDecimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount - The tax due amount.
     */
    public void setTaxDueAmount(BigDecimal taxDueAmount) {
        this.taxDueAmount = taxDueAmount;
    }

    
    private Date filedDate;

    /**
     * Getter for filedDate - The date the return was filed by Avalara.
     */
    public Date getFiledDate() {
        return this.filedDate;
    }

    /**
     * Setter for filedDate - The date the return was filed by Avalara.
     */
    public void setFiledDate(Date filedDate) {
        this.filedDate = filedDate;
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
     * Getter for id - The unique ID number of this filing return.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this filing return.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String formCode;

    /**
     * Getter for formCode - The unique code of the form.
     */
    public String getFormCode() {
        return this.formCode;
    }

    /**
     * Setter for formCode - The unique code of the form.
     */
    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    
    private BigDecimal remitAmount;

    /**
     * Getter for remitAmount - The remittance amount of the return.
     */
    public BigDecimal getRemitAmount() {
        return this.remitAmount;
    }

    /**
     * Setter for remitAmount - The remittance amount of the return.
     */
    public void setRemitAmount(BigDecimal remitAmount) {
        this.remitAmount = remitAmount;
    }

    
    private ArrayList<FilingAugmentationModel> augmentations;

    /**
     * Getter for augmentations - The Augmentations for this return.
     */
    public ArrayList<FilingAugmentationModel> getAugmentations() {
        return this.augmentations;
    }

    /**
     * Setter for augmentations - The Augmentations for this return.
     */
    public void setAugmentations(ArrayList<FilingAugmentationModel> augmentations) {
        this.augmentations = augmentations;
    }

    
    private WorksheetStatusId status;

    /**
     * Getter for status - The current status of the filing return.
     */
    public WorksheetStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status - The current status of the filing return.
     */
    public void setStatus(WorksheetStatusId status) {
        this.status = status;
    }

    
    private BigDecimal nonTaxableDueAmount;

    /**
     * Getter for nonTaxableDueAmount - The non-taxable due amount.
     */
    public BigDecimal getNonTaxableDueAmount() {
        return this.nonTaxableDueAmount;
    }

    /**
     * Setter for nonTaxableDueAmount - The non-taxable due amount.
     */
    public void setNonTaxableDueAmount(BigDecimal nonTaxableDueAmount) {
        this.nonTaxableDueAmount = nonTaxableDueAmount;
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

    
    private ArrayList<FilingAdjustmentModel> adjustments;

    /**
     * Getter for adjustments - The Adjustments for this return.
     */
    public ArrayList<FilingAdjustmentModel> getAdjustments() {
        return this.adjustments;
    }

    /**
     * Setter for adjustments - The Adjustments for this return.
     */
    public void setAdjustments(ArrayList<FilingAdjustmentModel> adjustments) {
        this.adjustments = adjustments;
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

    


    /**
     * Returns a JSON string representation of FilingReturnModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    