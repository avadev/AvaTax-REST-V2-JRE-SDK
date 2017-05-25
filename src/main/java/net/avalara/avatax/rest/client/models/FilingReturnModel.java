package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Filing Returns Model
 */
public class FilingReturnModel {
    private String formName;

    /**
     * Getter for formName - Filing Returns Model
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName - Filing Returns Model
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    
    private Date endPeriod;

    /**
     * Getter for endPeriod - Filing Returns Model
     */
    public Date getEndPeriod() {
        return this.endPeriod;
    }

    /**
     * Setter for endPeriod - Filing Returns Model
     */
    public void setEndPeriod(Date endPeriod) {
        this.endPeriod = endPeriod;
    }

    
    private BigDecimal collectAmount;

    /**
     * Getter for collectAmount - Filing Returns Model
     */
    public BigDecimal getCollectAmount() {
        return this.collectAmount;
    }

    /**
     * Setter for collectAmount - Filing Returns Model
     */
    public void setCollectAmount(BigDecimal collectAmount) {
        this.collectAmount = collectAmount;
    }

    
    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency - Filing Returns Model
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency - Filing Returns Model
     */
    public void setFilingFrequency(FilingFrequencyId filingFrequency) {
        this.filingFrequency = filingFrequency;
    }

    
    private Long filingCalendarId;

    /**
     * Getter for filingCalendarId - Filing Returns Model
     */
    public Long getFilingCalendarId() {
        return this.filingCalendarId;
    }

    /**
     * Setter for filingCalendarId - Filing Returns Model
     */
    public void setFilingCalendarId(Long filingCalendarId) {
        this.filingCalendarId = filingCalendarId;
    }

    
    private String description;

    /**
     * Getter for description - Filing Returns Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Filing Returns Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Filing Returns Model
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Filing Returns Model
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private FilingTypeId filingType;

    /**
     * Getter for filingType - Filing Returns Model
     */
    public FilingTypeId getFilingType() {
        return this.filingType;
    }

    /**
     * Setter for filingType - Filing Returns Model
     */
    public void setFilingType(FilingTypeId filingType) {
        this.filingType = filingType;
    }

    
    private AccrualType accrualType;

    /**
     * Getter for accrualType - Filing Returns Model
     */
    public AccrualType getAccrualType() {
        return this.accrualType;
    }

    /**
     * Setter for accrualType - Filing Returns Model
     */
    public void setAccrualType(AccrualType accrualType) {
        this.accrualType = accrualType;
    }

    
    private Integer year;

    /**
     * Getter for year - Filing Returns Model
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Setter for year - Filing Returns Model
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    
    private BigDecimal taxDueAmount;

    /**
     * Getter for taxDueAmount - Filing Returns Model
     */
    public BigDecimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount - Filing Returns Model
     */
    public void setTaxDueAmount(BigDecimal taxDueAmount) {
        this.taxDueAmount = taxDueAmount;
    }

    
    private Date filedDate;

    /**
     * Getter for filedDate - Filing Returns Model
     */
    public Date getFiledDate() {
        return this.filedDate;
    }

    /**
     * Setter for filedDate - Filing Returns Model
     */
    public void setFiledDate(Date filedDate) {
        this.filedDate = filedDate;
    }

    
    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount - Filing Returns Model
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount - Filing Returns Model
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    private Long id;

    /**
     * Getter for id - Filing Returns Model
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Filing Returns Model
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String formCode;

    /**
     * Getter for formCode - Filing Returns Model
     */
    public String getFormCode() {
        return this.formCode;
    }

    /**
     * Setter for formCode - Filing Returns Model
     */
    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    
    private BigDecimal remitAmount;

    /**
     * Getter for remitAmount - Filing Returns Model
     */
    public BigDecimal getRemitAmount() {
        return this.remitAmount;
    }

    /**
     * Setter for remitAmount - Filing Returns Model
     */
    public void setRemitAmount(BigDecimal remitAmount) {
        this.remitAmount = remitAmount;
    }

    
    private ArrayList<FilingAugmentationModel> augmentations;

    /**
     * Getter for augmentations - Filing Returns Model
     */
    public ArrayList<FilingAugmentationModel> getAugmentations() {
        return this.augmentations;
    }

    /**
     * Setter for augmentations - Filing Returns Model
     */
    public void setAugmentations(ArrayList<FilingAugmentationModel> augmentations) {
        this.augmentations = augmentations;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Filing Returns Model
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Filing Returns Model
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private FilingStatusId status;

    /**
     * Getter for status - Filing Returns Model
     */
    public FilingStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Filing Returns Model
     */
    public void setStatus(FilingStatusId status) {
        this.status = status;
    }

    
    private Long filingRegionId;

    /**
     * Getter for filingRegionId - Filing Returns Model
     */
    public Long getFilingRegionId() {
        return this.filingRegionId;
    }

    /**
     * Setter for filingRegionId - Filing Returns Model
     */
    public void setFilingRegionId(Long filingRegionId) {
        this.filingRegionId = filingRegionId;
    }

    
    private BigDecimal nonTaxableDueAmount;

    /**
     * Getter for nonTaxableDueAmount - Filing Returns Model
     */
    public BigDecimal getNonTaxableDueAmount() {
        return this.nonTaxableDueAmount;
    }

    /**
     * Setter for nonTaxableDueAmount - Filing Returns Model
     */
    public void setNonTaxableDueAmount(BigDecimal nonTaxableDueAmount) {
        this.nonTaxableDueAmount = nonTaxableDueAmount;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Filing Returns Model
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Filing Returns Model
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Date startPeriod;

    /**
     * Getter for startPeriod - Filing Returns Model
     */
    public Date getStartPeriod() {
        return this.startPeriod;
    }

    /**
     * Setter for startPeriod - Filing Returns Model
     */
    public void setStartPeriod(Date startPeriod) {
        this.startPeriod = startPeriod;
    }

    
    private BigDecimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount - Filing Returns Model
     */
    public BigDecimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount - Filing Returns Model
     */
    public void setConsumerUseNonTaxableAmount(BigDecimal consumerUseNonTaxableAmount) {
        this.consumerUseNonTaxableAmount = consumerUseNonTaxableAmount;
    }

    
    private Long resourceFileId;

    /**
     * Getter for resourceFileId - Filing Returns Model
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId - Filing Returns Model
     */
    public void setResourceFileId(Long resourceFileId) {
        this.resourceFileId = resourceFileId;
    }

    
    private ArrayList<FilingAdjustmentModel> adjustments;

    /**
     * Getter for adjustments - Filing Returns Model
     */
    public ArrayList<FilingAdjustmentModel> getAdjustments() {
        return this.adjustments;
    }

    /**
     * Setter for adjustments - Filing Returns Model
     */
    public void setAdjustments(ArrayList<FilingAdjustmentModel> adjustments) {
        this.adjustments = adjustments;
    }

    
    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount - Filing Returns Model
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount - Filing Returns Model
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    
    private BigDecimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount - Filing Returns Model
     */
    public BigDecimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount - Filing Returns Model
     */
    public void setConsumerUseTaxableAmount(BigDecimal consumerUseTaxableAmount) {
        this.consumerUseTaxableAmount = consumerUseTaxableAmount;
    }

    
    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount - Filing Returns Model
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount - Filing Returns Model
     */
    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    
    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount - Filing Returns Model
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount - Filing Returns Model
     */
    public void setNonTaxableAmount(BigDecimal nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    
    private BigDecimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount - Filing Returns Model
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount - Filing Returns Model
     */
    public void setConsumerUseTaxAmount(BigDecimal consumerUseTaxAmount) {
        this.consumerUseTaxAmount = consumerUseTaxAmount;
    }

    
    private BigDecimal totalAdjustments;

    /**
     * Getter for totalAdjustments - Filing Returns Model
     */
    public BigDecimal getTotalAdjustments() {
        return this.totalAdjustments;
    }

    /**
     * Setter for totalAdjustments - Filing Returns Model
     */
    public void setTotalAdjustments(BigDecimal totalAdjustments) {
        this.totalAdjustments = totalAdjustments;
    }

    
    private BigDecimal totalAugmentations;

    /**
     * Getter for totalAugmentations - Filing Returns Model
     */
    public BigDecimal getTotalAugmentations() {
        return this.totalAugmentations;
    }

    /**
     * Setter for totalAugmentations - Filing Returns Model
     */
    public void setTotalAugmentations(BigDecimal totalAugmentations) {
        this.totalAugmentations = totalAugmentations;
    }

    
    private Byte month;

    /**
     * Getter for month - Filing Returns Model
     */
    public Byte getMonth() {
        return this.month;
    }

    /**
     * Setter for month - Filing Returns Model
     */
    public void setMonth(Byte month) {
        this.month = month;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Filing Returns Model
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Filing Returns Model
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of FilingReturnModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    