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
public class FilingReturnModelBasic {


    private Long companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company filing return.
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company filing return.
     */
    public void setCompanyId(Long value) {
        this.companyId = value;
    }


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


    private Long filingId;

    /**
     * Getter for filingId
     *
     * The filing id that this return belongs too
     */
    public Long getFilingId() {
        return this.filingId;
    }

    /**
     * Setter for filingId
     *
     * The filing id that this return belongs too
     */
    public void setFilingId(Long value) {
        this.filingId = value;
    }


    private Long resourceFileId;

    /**
     * Getter for resourceFileId
     *
     * The resourceFileId of the return
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId
     *
     * The resourceFileId of the return
     */
    public void setResourceFileId(Long value) {
        this.resourceFileId = value;
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


    private String country;

    /**
     * Getter for country
     *
     * The country of the form.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country of the form.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The region of the form.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The region of the form.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private Byte endPeriodMonth;

    /**
     * Getter for endPeriodMonth
     *
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Byte getEndPeriodMonth() {
        return this.endPeriodMonth;
    }

    /**
     * Setter for endPeriodMonth
     *
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setEndPeriodMonth(Byte value) {
        this.endPeriodMonth = value;
    }


    private Short endPeriodYear;

    /**
     * Getter for endPeriodYear
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Short getEndPeriodYear() {
        return this.endPeriodYear;
    }

    /**
     * Setter for endPeriodYear
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setEndPeriodYear(Short value) {
        this.endPeriodYear = value;
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
     * Consumer use tax liability.
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount
     *
     * Consumer use tax liability.
     */
    public void setConsumerUseTaxAmount(BigDecimal value) {
        this.consumerUseTaxAmount = value;
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
     * Returns a JSON string representation of FilingReturnModelBasic
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
