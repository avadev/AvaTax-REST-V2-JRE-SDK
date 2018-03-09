package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Filing Returns Model
 */
public class FilingReturnModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing return.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this filing return.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Long filingRegionId;

    /**
     * Getter for filingRegionId
     *
     * The region id that this return belongs too
     */
    public Long getFilingRegionId() {
        return this.filingRegionId;
    }

    /**
     * Setter for filingRegionId
     *
     * The region id that this return belongs too
     */
    public void setFilingRegionId(Long value) {
        this.filingRegionId = value;
    }


    private Long filingCalendarId;

    /**
     * Getter for filingCalendarId
     *
     * The unique ID number of the filing calendar associated with this return.
     */
    public Long getFilingCalendarId() {
        return this.filingCalendarId;
    }

    /**
     * Setter for filingCalendarId
     *
     * The unique ID number of the filing calendar associated with this return.
     */
    public void setFilingCalendarId(Long value) {
        this.filingCalendarId = value;
    }


    private Long resourceFileId;

    /**
     * Getter for resourceFileId
     *
     * The resourceFileId of the return. Will be null if not available.
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId
     *
     * The resourceFileId of the return. Will be null if not available.
     */
    public void setResourceFileId(Long value) {
        this.resourceFileId = value;
    }


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * Tax Authority ID of this return
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * Tax Authority ID of this return
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private FilingStatusId status;

    /**
     * Getter for status
     *
     * The current status of the filing return.
     */
    public FilingStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The current status of the filing return.
     */
    public void setStatus(FilingStatusId value) {
        this.status = value;
    }


    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency
     *
     * The filing frequency of the return.
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency
     *
     * The filing frequency of the return.
     */
    public void setFilingFrequency(FilingFrequencyId value) {
        this.filingFrequency = value;
    }


    private Date filedDate;

    /**
     * Getter for filedDate
     *
     * The date the return was filed by Avalara.
     */
    public Date getFiledDate() {
        return this.filedDate;
    }

    /**
     * Setter for filedDate
     *
     * The date the return was filed by Avalara.
     */
    public void setFiledDate(Date value) {
        this.filedDate = value;
    }


    private Date startPeriod;

    /**
     * Getter for startPeriod
     *
     * The start date of this return
     */
    public Date getStartPeriod() {
        return this.startPeriod;
    }

    /**
     * Setter for startPeriod
     *
     * The start date of this return
     */
    public void setStartPeriod(Date value) {
        this.startPeriod = value;
    }


    private Date endPeriod;

    /**
     * Getter for endPeriod
     *
     * The end date of this return
     */
    public Date getEndPeriod() {
        return this.endPeriod;
    }

    /**
     * Setter for endPeriod
     *
     * The end date of this return
     */
    public void setEndPeriod(Date value) {
        this.endPeriod = value;
    }


    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount
     *
     * The sales amount.
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount
     *
     * The sales amount.
     */
    public void setSalesAmount(BigDecimal value) {
        this.salesAmount = value;
    }


    private FilingTypeId filingType;

    /**
     * Getter for filingType
     *
     * The filing type of the return.
     */
    public FilingTypeId getFilingType() {
        return this.filingType;
    }

    /**
     * Setter for filingType
     *
     * The filing type of the return.
     */
    public void setFilingType(FilingTypeId value) {
        this.filingType = value;
    }


    private String formName;

    /**
     * Getter for formName
     *
     * The name of the form.
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName
     *
     * The name of the form.
     */
    public void setFormName(String value) {
        this.formName = value;
    }


    private BigDecimal remitAmount;

    /**
     * Getter for remitAmount
     *
     * The remittance amount of the return.
     */
    public BigDecimal getRemitAmount() {
        return this.remitAmount;
    }

    /**
     * Setter for remitAmount
     *
     * The remittance amount of the return.
     */
    public void setRemitAmount(BigDecimal value) {
        this.remitAmount = value;
    }


    private String formCode;

    /**
     * Getter for formCode
     *
     * The unique code of the form.
     */
    public String getFormCode() {
        return this.formCode;
    }

    /**
     * Setter for formCode
     *
     * The unique code of the form.
     */
    public void setFormCode(String value) {
        this.formCode = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A description for the return.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description for the return.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount.
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount.
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }


    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * The tax amount.
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * The tax amount.
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }


    private BigDecimal collectAmount;

    /**
     * Getter for collectAmount
     *
     * The amount collected by avalara for this return
     */
    public BigDecimal getCollectAmount() {
        return this.collectAmount;
    }

    /**
     * Setter for collectAmount
     *
     * The amount collected by avalara for this return
     */
    public void setCollectAmount(BigDecimal value) {
        this.collectAmount = value;
    }


    private BigDecimal taxDueAmount;

    /**
     * Getter for taxDueAmount
     *
     * The tax due amount.
     */
    public BigDecimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount
     *
     * The tax due amount.
     */
    public void setTaxDueAmount(BigDecimal value) {
        this.taxDueAmount = value;
    }


    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount
     *
     * The non-taxable amount.
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount
     *
     * The non-taxable amount.
     */
    public void setNonTaxableAmount(BigDecimal value) {
        this.nonTaxableAmount = value;
    }


    private BigDecimal nonTaxableDueAmount;

    /**
     * Getter for nonTaxableDueAmount
     *
     * The non-taxable due amount.
     */
    public BigDecimal getNonTaxableDueAmount() {
        return this.nonTaxableDueAmount;
    }

    /**
     * Setter for nonTaxableDueAmount
     *
     * The non-taxable due amount.
     */
    public void setNonTaxableDueAmount(BigDecimal value) {
        this.nonTaxableDueAmount = value;
    }


    private BigDecimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount
     *
     * Consumer use tax liability during the period.
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount
     *
     * Consumer use tax liability during the period.
     */
    public void setConsumerUseTaxAmount(BigDecimal value) {
        this.consumerUseTaxAmount = value;
    }


    private BigDecimal consumerUseTaxDueAmount;

    /**
     * Getter for consumerUseTaxDueAmount
     *
     * Consumer use tax liability accrued during the period.
     */
    public BigDecimal getConsumerUseTaxDueAmount() {
        return this.consumerUseTaxDueAmount;
    }

    /**
     * Setter for consumerUseTaxDueAmount
     *
     * Consumer use tax liability accrued during the period.
     */
    public void setConsumerUseTaxDueAmount(BigDecimal value) {
        this.consumerUseTaxDueAmount = value;
    }


    private BigDecimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount
     *
     * Consumer use non-taxable amount.
     */
    public BigDecimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount
     *
     * Consumer use non-taxable amount.
     */
    public void setConsumerUseNonTaxableAmount(BigDecimal value) {
        this.consumerUseNonTaxableAmount = value;
    }


    private BigDecimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount
     *
     * Consumer use taxable amount.
     */
    public BigDecimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount
     *
     * Consumer use taxable amount.
     */
    public void setConsumerUseTaxableAmount(BigDecimal value) {
        this.consumerUseTaxableAmount = value;
    }


    private BigDecimal totalAdjustments;

    /**
     * Getter for totalAdjustments
     *
     * Total amount of adjustments on this return
     */
    public BigDecimal getTotalAdjustments() {
        return this.totalAdjustments;
    }

    /**
     * Setter for totalAdjustments
     *
     * Total amount of adjustments on this return
     */
    public void setTotalAdjustments(BigDecimal value) {
        this.totalAdjustments = value;
    }


    private BigDecimal excludedSalesAmount;

    /**
     * Getter for excludedSalesAmount
     *
     * The amount of sales excluded from the liability calculation
     */
    public BigDecimal getExcludedSalesAmount() {
        return this.excludedSalesAmount;
    }

    /**
     * Setter for excludedSalesAmount
     *
     * The amount of sales excluded from the liability calculation
     */
    public void setExcludedSalesAmount(BigDecimal value) {
        this.excludedSalesAmount = value;
    }


    private BigDecimal excludedNonTaxableAmount;

    /**
     * Getter for excludedNonTaxableAmount
     *
     * The amount of non-taxable sales excluded from the liability calculation
     */
    public BigDecimal getExcludedNonTaxableAmount() {
        return this.excludedNonTaxableAmount;
    }

    /**
     * Setter for excludedNonTaxableAmount
     *
     * The amount of non-taxable sales excluded from the liability calculation
     */
    public void setExcludedNonTaxableAmount(BigDecimal value) {
        this.excludedNonTaxableAmount = value;
    }


    private BigDecimal excludedTaxAmount;

    /**
     * Getter for excludedTaxAmount
     *
     * The amount of tax excluded from the liability calculation
     */
    public BigDecimal getExcludedTaxAmount() {
        return this.excludedTaxAmount;
    }

    /**
     * Setter for excludedTaxAmount
     *
     * The amount of tax excluded from the liability calculation
     */
    public void setExcludedTaxAmount(BigDecimal value) {
        this.excludedTaxAmount = value;
    }


    private BigDecimal carryOverSalesAmount;

    /**
     * Getter for carryOverSalesAmount
     *
     * The amount of carry over sales applied to the liability calculation
     */
    public BigDecimal getCarryOverSalesAmount() {
        return this.carryOverSalesAmount;
    }

    /**
     * Setter for carryOverSalesAmount
     *
     * The amount of carry over sales applied to the liability calculation
     */
    public void setCarryOverSalesAmount(BigDecimal value) {
        this.carryOverSalesAmount = value;
    }


    private BigDecimal carryOverNonTaxableAmount;

    /**
     * Getter for carryOverNonTaxableAmount
     *
     * The amount of carry over non taxable sales applied to the liability calculation
     */
    public BigDecimal getCarryOverNonTaxableAmount() {
        return this.carryOverNonTaxableAmount;
    }

    /**
     * Setter for carryOverNonTaxableAmount
     *
     * The amount of carry over non taxable sales applied to the liability calculation
     */
    public void setCarryOverNonTaxableAmount(BigDecimal value) {
        this.carryOverNonTaxableAmount = value;
    }


    private BigDecimal carryOverTaxAmount;

    /**
     * Getter for carryOverTaxAmount
     *
     * The amount of carry over sales tax applied to the liability calculation
     */
    public BigDecimal getCarryOverTaxAmount() {
        return this.carryOverTaxAmount;
    }

    /**
     * Setter for carryOverTaxAmount
     *
     * The amount of carry over sales tax applied to the liability calculation
     */
    public void setCarryOverTaxAmount(BigDecimal value) {
        this.carryOverTaxAmount = value;
    }


    private BigDecimal carryOverConsumerUseTaxAmount;

    /**
     * Getter for carryOverConsumerUseTaxAmount
     *
     * The amount of carry over consumer use tax applied to the liability calculation
     */
    public BigDecimal getCarryOverConsumerUseTaxAmount() {
        return this.carryOverConsumerUseTaxAmount;
    }

    /**
     * Setter for carryOverConsumerUseTaxAmount
     *
     * The amount of carry over consumer use tax applied to the liability calculation
     */
    public void setCarryOverConsumerUseTaxAmount(BigDecimal value) {
        this.carryOverConsumerUseTaxAmount = value;
    }


    private BigDecimal taxAccrualAmount;

    /**
     * Getter for taxAccrualAmount
     *
     * The total amount of total tax accrued in the current active period
     */
    public BigDecimal getTaxAccrualAmount() {
        return this.taxAccrualAmount;
    }

    /**
     * Setter for taxAccrualAmount
     *
     * The total amount of total tax accrued in the current active period
     */
    public void setTaxAccrualAmount(BigDecimal value) {
        this.taxAccrualAmount = value;
    }


    private BigDecimal salesAccrualAmount;

    /**
     * Getter for salesAccrualAmount
     *
     * The total amount of sales accrued in the current active period
     */
    public BigDecimal getSalesAccrualAmount() {
        return this.salesAccrualAmount;
    }

    /**
     * Setter for salesAccrualAmount
     *
     * The total amount of sales accrued in the current active period
     */
    public void setSalesAccrualAmount(BigDecimal value) {
        this.salesAccrualAmount = value;
    }


    private BigDecimal nonTaxableAccrualAmount;

    /**
     * Getter for nonTaxableAccrualAmount
     *
     * The total amount of nontaxable sales accrued in the current active period
     */
    public BigDecimal getNonTaxableAccrualAmount() {
        return this.nonTaxableAccrualAmount;
    }

    /**
     * Setter for nonTaxableAccrualAmount
     *
     * The total amount of nontaxable sales accrued in the current active period
     */
    public void setNonTaxableAccrualAmount(BigDecimal value) {
        this.nonTaxableAccrualAmount = value;
    }


    private BigDecimal salesTaxAccrualAmount;

    /**
     * Getter for salesTaxAccrualAmount
     *
     * The total amount of sales tax accrued in the current active period
     */
    public BigDecimal getSalesTaxAccrualAmount() {
        return this.salesTaxAccrualAmount;
    }

    /**
     * Setter for salesTaxAccrualAmount
     *
     * The total amount of sales tax accrued in the current active period
     */
    public void setSalesTaxAccrualAmount(BigDecimal value) {
        this.salesTaxAccrualAmount = value;
    }


    private BigDecimal sellersUseTaxAccrualAmount;

    /**
     * Getter for sellersUseTaxAccrualAmount
     *
     * The total amount of sellers use tax accrued in the current active period
     */
    public BigDecimal getSellersUseTaxAccrualAmount() {
        return this.sellersUseTaxAccrualAmount;
    }

    /**
     * Setter for sellersUseTaxAccrualAmount
     *
     * The total amount of sellers use tax accrued in the current active period
     */
    public void setSellersUseTaxAccrualAmount(BigDecimal value) {
        this.sellersUseTaxAccrualAmount = value;
    }


    private BigDecimal consumerUseTaxAccrualAmount;

    /**
     * Getter for consumerUseTaxAccrualAmount
     *
     * The total amount of consumer use tax accrued in the current active period
     */
    public BigDecimal getConsumerUseTaxAccrualAmount() {
        return this.consumerUseTaxAccrualAmount;
    }

    /**
     * Setter for consumerUseTaxAccrualAmount
     *
     * The total amount of consumer use tax accrued in the current active period
     */
    public void setConsumerUseTaxAccrualAmount(BigDecimal value) {
        this.consumerUseTaxAccrualAmount = value;
    }


    private BigDecimal consumerUseTaxableAccrualAmount;

    /**
     * Getter for consumerUseTaxableAccrualAmount
     *
     * The total amount of consumer use taxable sales accrued in the current active period
     */
    public BigDecimal getConsumerUseTaxableAccrualAmount() {
        return this.consumerUseTaxableAccrualAmount;
    }

    /**
     * Setter for consumerUseTaxableAccrualAmount
     *
     * The total amount of consumer use taxable sales accrued in the current active period
     */
    public void setConsumerUseTaxableAccrualAmount(BigDecimal value) {
        this.consumerUseTaxableAccrualAmount = value;
    }


    private BigDecimal consumerUseNonTaxableAccrualAmount;

    /**
     * Getter for consumerUseNonTaxableAccrualAmount
     *
     * The total amount of consumer use non taxable sales accrued in the current active period
     */
    public BigDecimal getConsumerUseNonTaxableAccrualAmount() {
        return this.consumerUseNonTaxableAccrualAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAccrualAmount
     *
     * The total amount of consumer use non taxable sales accrued in the current active period
     */
    public void setConsumerUseNonTaxableAccrualAmount(BigDecimal value) {
        this.consumerUseNonTaxableAccrualAmount = value;
    }


    private ArrayList<FilingAdjustmentModel> adjustments;

    /**
     * Getter for adjustments
     *
     * The Adjustments for this return.
     */
    public ArrayList<FilingAdjustmentModel> getAdjustments() {
        return this.adjustments;
    }

    /**
     * Setter for adjustments
     *
     * The Adjustments for this return.
     */
    public void setAdjustments(ArrayList<FilingAdjustmentModel> value) {
        this.adjustments = value;
    }


    private BigDecimal totalAugmentations;

    /**
     * Getter for totalAugmentations
     *
     * Total amount of augmentations on this return
     */
    public BigDecimal getTotalAugmentations() {
        return this.totalAugmentations;
    }

    /**
     * Setter for totalAugmentations
     *
     * Total amount of augmentations on this return
     */
    public void setTotalAugmentations(BigDecimal value) {
        this.totalAugmentations = value;
    }


    private ArrayList<FilingAugmentationModel> augmentations;

    /**
     * Getter for augmentations
     *
     * The Augmentations for this return.
     */
    public ArrayList<FilingAugmentationModel> getAugmentations() {
        return this.augmentations;
    }

    /**
     * Setter for augmentations
     *
     * The Augmentations for this return.
     */
    public void setAugmentations(ArrayList<FilingAugmentationModel> value) {
        this.augmentations = value;
    }


    private BigDecimal totalPayments;

    /**
     * Getter for totalPayments
     *
     * Total amount of payments on this return
     */
    public BigDecimal getTotalPayments() {
        return this.totalPayments;
    }

    /**
     * Setter for totalPayments
     *
     * Total amount of payments on this return
     */
    public void setTotalPayments(BigDecimal value) {
        this.totalPayments = value;
    }


    private ArrayList<FilingPaymentModel> payments;

    /**
     * Getter for payments
     *
     * The payments for this return.
     */
    public ArrayList<FilingPaymentModel> getPayments() {
        return this.payments;
    }

    /**
     * Setter for payments
     *
     * The payments for this return.
     */
    public void setPayments(ArrayList<FilingPaymentModel> value) {
        this.payments = value;
    }


    private AccrualType accrualType;

    /**
     * Getter for accrualType
     *
     * Accrual type of the return
     */
    public AccrualType getAccrualType() {
        return this.accrualType;
    }

    /**
     * Setter for accrualType
     *
     * Accrual type of the return
     */
    public void setAccrualType(AccrualType value) {
        this.accrualType = value;
    }


    private Byte month;

    /**
     * Getter for month
     *
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Byte getMonth() {
        return this.month;
    }

    /**
     * Setter for month
     *
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setMonth(Byte value) {
        this.month = value;
    }


    private Integer year;

    /**
     * Getter for year
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Setter for year
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setYear(Integer value) {
        this.year = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    /**
     * Returns a JSON string representation of FilingReturnModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
