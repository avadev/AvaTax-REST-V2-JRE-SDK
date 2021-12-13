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
 * Swagger name: AvaTaxClient
 */

/**
 * Filing Returns Model
 */
public class MultiTaxFilingReturnModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing return.
	 * 
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

    private Long filingCalendarId;

    /**
     * Getter for filingCalendarId
     *
     * The unique ID number of the filing calendar associated with this return.
	 * 
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

    private FilingStatusId status;

    /**
     * Getter for status
     *
     * The current status of the filing return.
	 * 
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
	 * 
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

    private FilingTypeId filingType;

    /**
     * Getter for filingType
     *
     * The filing type of the return.
	 * 
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
	 * 
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

    private String formCode;

    /**
     * Getter for formCode
     *
     * The unique code of the form.
	 * 
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
	 * 
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

    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * Tax Authority ID of this return
	 * 
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

    private Date filedDate;

    /**
     * Getter for filedDate
     *
     * The date the return was filed by Avalara.
	 * 
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

    private AccrualType accrualType;

    /**
     * Getter for accrualType
     *
     * Accrual type of the return
	 * 
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

    private Date startPeriod;

    /**
     * Getter for startPeriod
     *
     * The start date of this return
	 * 
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
	 * 
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

    private String type;

    /**
     * Getter for type
     *
     * The FilingTaskType for this return.
	 * 
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The FilingTaskType for this return.
     */
    public void setType(String value) {
        this.type = value;
    }

    private FilingsTaxSummaryModel returnTaxSummary;

    /**
     * Getter for returnTaxSummary
     *
     * 
	 * 
     */
    public FilingsTaxSummaryModel getReturnTaxSummary() {
        return this.returnTaxSummary;
    }

    /**
     * Setter for returnTaxSummary
     *
     * 
     */
    public void setReturnTaxSummary(FilingsTaxSummaryModel value) {
        this.returnTaxSummary = value;
    }

    private ArrayList<FilingsTaxDetailsModel> returnTaxDetails;

    /**
     * Getter for returnTaxDetails
     *
     * A detailed breakdown of the taxes in this filing
	 * 
     */
    public ArrayList<FilingsTaxDetailsModel> getReturnTaxDetails() {
        return this.returnTaxDetails;
    }

    /**
     * Setter for returnTaxDetails
     *
     * A detailed breakdown of the taxes in this filing
     */
    public void setReturnTaxDetails(ArrayList<FilingsTaxDetailsModel> value) {
        this.returnTaxDetails = value;
    }

    private FilingReturnCreditModel excludedCarryOverCredits;

    /**
     * Getter for excludedCarryOverCredits
     *
     * 
	 * 
     */
    public FilingReturnCreditModel getExcludedCarryOverCredits() {
        return this.excludedCarryOverCredits;
    }

    /**
     * Setter for excludedCarryOverCredits
     *
     * 
     */
    public void setExcludedCarryOverCredits(FilingReturnCreditModel value) {
        this.excludedCarryOverCredits = value;
    }

    private FilingReturnCreditModel appliedCarryOverCredits;

    /**
     * Getter for appliedCarryOverCredits
     *
     * 
	 * 
     */
    public FilingReturnCreditModel getAppliedCarryOverCredits() {
        return this.appliedCarryOverCredits;
    }

    /**
     * Setter for appliedCarryOverCredits
     *
     * 
     */
    public void setAppliedCarryOverCredits(FilingReturnCreditModel value) {
        this.appliedCarryOverCredits = value;
    }

    private BigDecimal totalAdjustments;

    /**
     * Getter for totalAdjustments
     *
     * Total amount of adjustments on this return
	 * 
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

    private ArrayList<FilingAdjustmentModel> adjustments;

    /**
     * Getter for adjustments
     *
     * The Adjustments for this return.
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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

    private ArrayList<FilingAttachmentModel> attachments;

    /**
     * Getter for attachments
     *
     * The attachments for this return.
	 * 
     */
    public ArrayList<FilingAttachmentModel> getAttachments() {
        return this.attachments;
    }

    /**
     * Setter for attachments
     *
     * The attachments for this return.
     */
    public void setAttachments(ArrayList<FilingAttachmentModel> value) {
        this.attachments = value;
    }

    /**
     * Returns a JSON string representation of MultiTaxFilingReturnModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
