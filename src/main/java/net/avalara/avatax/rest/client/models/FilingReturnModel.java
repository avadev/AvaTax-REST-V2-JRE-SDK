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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Filing Returns Model
 */
public class FilingReturnModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this filing return.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this filing return.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int64? filingRegionId;

    /**
     * Getter for filingRegionId;
     * The region id that this return belongs too
     */
    public Int64? getfilingRegionId() {;
        return this.filingRegionId;;
    }

    /**
     * Setter for filingRegionId;
     * The region id that this return belongs too
     */
    public void setfilingRegionId(Int64? value) {;
        this.filingRegionId = value;;
    }


    private Int64? filingCalendarId;

    /**
     * Getter for filingCalendarId;
     * The unique ID number of the filing calendar associated with this return.
     */
    public Int64? getfilingCalendarId() {;
        return this.filingCalendarId;;
    }

    /**
     * Setter for filingCalendarId;
     * The unique ID number of the filing calendar associated with this return.
     */
    public void setfilingCalendarId(Int64? value) {;
        this.filingCalendarId = value;;
    }


    private Int64? resourceFileId;

    /**
     * Getter for resourceFileId;
     * The resourceFileId of the return. Will be null if not available.
     */
    public Int64? getresourceFileId() {;
        return this.resourceFileId;;
    }

    /**
     * Setter for resourceFileId;
     * The resourceFileId of the return. Will be null if not available.
     */
    public void setresourceFileId(Int64? value) {;
        this.resourceFileId = value;;
    }


    private Int32? taxAuthorityId;

    /**
     * Getter for taxAuthorityId;
     * Tax Authority ID of this return
     */
    public Int32? gettaxAuthorityId() {;
        return this.taxAuthorityId;;
    }

    /**
     * Setter for taxAuthorityId;
     * Tax Authority ID of this return
     */
    public void settaxAuthorityId(Int32? value) {;
        this.taxAuthorityId = value;;
    }


    private FilingStatusId? status;

    /**
     * Getter for status;
     * The current status of the filing return.
     */
    public FilingStatusId? getstatus() {;
        return this.status;;
    }

    /**
     * Setter for status;
     * The current status of the filing return.
     */
    public void setstatus(FilingStatusId? value) {;
        this.status = value;;
    }


    private FilingFrequencyId? filingFrequency;

    /**
     * Getter for filingFrequency;
     * The filing frequency of the return.
     */
    public FilingFrequencyId? getfilingFrequency() {;
        return this.filingFrequency;;
    }

    /**
     * Setter for filingFrequency;
     * The filing frequency of the return.
     */
    public void setfilingFrequency(FilingFrequencyId? value) {;
        this.filingFrequency = value;;
    }


    private DateTime? filedDate;

    /**
     * Getter for filedDate;
     * The date the return was filed by Avalara.
     */
    public DateTime? getfiledDate() {;
        return this.filedDate;;
    }

    /**
     * Setter for filedDate;
     * The date the return was filed by Avalara.
     */
    public void setfiledDate(DateTime? value) {;
        this.filedDate = value;;
    }


    private DateTime? startPeriod;

    /**
     * Getter for startPeriod;
     * The start date of this return
     */
    public DateTime? getstartPeriod() {;
        return this.startPeriod;;
    }

    /**
     * Setter for startPeriod;
     * The start date of this return
     */
    public void setstartPeriod(DateTime? value) {;
        this.startPeriod = value;;
    }


    private DateTime? endPeriod;

    /**
     * Getter for endPeriod;
     * The end date of this return
     */
    public DateTime? getendPeriod() {;
        return this.endPeriod;;
    }

    /**
     * Setter for endPeriod;
     * The end date of this return
     */
    public void setendPeriod(DateTime? value) {;
        this.endPeriod = value;;
    }


    private Decimal? salesAmount;

    /**
     * Getter for salesAmount;
     * The sales amount.
     */
    public Decimal? getsalesAmount() {;
        return this.salesAmount;;
    }

    /**
     * Setter for salesAmount;
     * The sales amount.
     */
    public void setsalesAmount(Decimal? value) {;
        this.salesAmount = value;;
    }


    private FilingTypeId? filingType;

    /**
     * Getter for filingType;
     * The filing type of the return.
     */
    public FilingTypeId? getfilingType() {;
        return this.filingType;;
    }

    /**
     * Setter for filingType;
     * The filing type of the return.
     */
    public void setfilingType(FilingTypeId? value) {;
        this.filingType = value;;
    }


    private String formName;

    /**
     * Getter for formName;
     * The name of the form.
     */
    public String getformName() {;
        return this.formName;;
    }

    /**
     * Setter for formName;
     * The name of the form.
     */
    public void setformName(String value) {;
        this.formName = value;;
    }


    private Decimal? remitAmount;

    /**
     * Getter for remitAmount;
     * The remittance amount of the return.
     */
    public Decimal? getremitAmount() {;
        return this.remitAmount;;
    }

    /**
     * Setter for remitAmount;
     * The remittance amount of the return.
     */
    public void setremitAmount(Decimal? value) {;
        this.remitAmount = value;;
    }


    private String formCode;

    /**
     * Getter for formCode;
     * The unique code of the form.
     */
    public String getformCode() {;
        return this.formCode;;
    }

    /**
     * Setter for formCode;
     * The unique code of the form.
     */
    public void setformCode(String value) {;
        this.formCode = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A description for the return.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A description for the return.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private Decimal? taxableAmount;

    /**
     * Getter for taxableAmount;
     * The taxable amount.
     */
    public Decimal? gettaxableAmount() {;
        return this.taxableAmount;;
    }

    /**
     * Setter for taxableAmount;
     * The taxable amount.
     */
    public void settaxableAmount(Decimal? value) {;
        this.taxableAmount = value;;
    }


    private Decimal? taxAmount;

    /**
     * Getter for taxAmount;
     * The tax amount.
     */
    public Decimal? gettaxAmount() {;
        return this.taxAmount;;
    }

    /**
     * Setter for taxAmount;
     * The tax amount.
     */
    public void settaxAmount(Decimal? value) {;
        this.taxAmount = value;;
    }


    private Decimal? collectAmount;

    /**
     * Getter for collectAmount;
     * The amount collected by avalara for this return
     */
    public Decimal? getcollectAmount() {;
        return this.collectAmount;;
    }

    /**
     * Setter for collectAmount;
     * The amount collected by avalara for this return
     */
    public void setcollectAmount(Decimal? value) {;
        this.collectAmount = value;;
    }


    private Decimal? taxDueAmount;

    /**
     * Getter for taxDueAmount;
     * The tax due amount.
     */
    public Decimal? gettaxDueAmount() {;
        return this.taxDueAmount;;
    }

    /**
     * Setter for taxDueAmount;
     * The tax due amount.
     */
    public void settaxDueAmount(Decimal? value) {;
        this.taxDueAmount = value;;
    }


    private Decimal? nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount;
     * The non-taxable amount.
     */
    public Decimal? getnonTaxableAmount() {;
        return this.nonTaxableAmount;;
    }

    /**
     * Setter for nonTaxableAmount;
     * The non-taxable amount.
     */
    public void setnonTaxableAmount(Decimal? value) {;
        this.nonTaxableAmount = value;;
    }


    private Decimal? nonTaxableDueAmount;

    /**
     * Getter for nonTaxableDueAmount;
     * The non-taxable due amount.
     */
    public Decimal? getnonTaxableDueAmount() {;
        return this.nonTaxableDueAmount;;
    }

    /**
     * Setter for nonTaxableDueAmount;
     * The non-taxable due amount.
     */
    public void setnonTaxableDueAmount(Decimal? value) {;
        this.nonTaxableDueAmount = value;;
    }


    private Decimal? consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount;
     * Consumer use tax liability.
     */
    public Decimal? getconsumerUseTaxAmount() {;
        return this.consumerUseTaxAmount;;
    }

    /**
     * Setter for consumerUseTaxAmount;
     * Consumer use tax liability.
     */
    public void setconsumerUseTaxAmount(Decimal? value) {;
        this.consumerUseTaxAmount = value;;
    }


    private Decimal? consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount;
     * Consumer use non-taxable amount.
     */
    public Decimal? getconsumerUseNonTaxableAmount() {;
        return this.consumerUseNonTaxableAmount;;
    }

    /**
     * Setter for consumerUseNonTaxableAmount;
     * Consumer use non-taxable amount.
     */
    public void setconsumerUseNonTaxableAmount(Decimal? value) {;
        this.consumerUseNonTaxableAmount = value;;
    }


    private Decimal? consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount;
     * Consumer use taxable amount.
     */
    public Decimal? getconsumerUseTaxableAmount() {;
        return this.consumerUseTaxableAmount;;
    }

    /**
     * Setter for consumerUseTaxableAmount;
     * Consumer use taxable amount.
     */
    public void setconsumerUseTaxableAmount(Decimal? value) {;
        this.consumerUseTaxableAmount = value;;
    }


    private Decimal? totalAdjustments;

    /**
     * Getter for totalAdjustments;
     * Total amount of adjustments on this return
     */
    public Decimal? gettotalAdjustments() {;
        return this.totalAdjustments;;
    }

    /**
     * Setter for totalAdjustments;
     * Total amount of adjustments on this return
     */
    public void settotalAdjustments(Decimal? value) {;
        this.totalAdjustments = value;;
    }


    private List<FilingAdjustmentModel> adjustments;

    /**
     * Getter for adjustments;
     * The Adjustments for this return.
     */
    public List<FilingAdjustmentModel> getadjustments() {;
        return this.adjustments;;
    }

    /**
     * Setter for adjustments;
     * The Adjustments for this return.
     */
    public void setadjustments(List<FilingAdjustmentModel> value) {;
        this.adjustments = value;;
    }


    private Decimal? totalAugmentations;

    /**
     * Getter for totalAugmentations;
     * Total amount of augmentations on this return
     */
    public Decimal? gettotalAugmentations() {;
        return this.totalAugmentations;;
    }

    /**
     * Setter for totalAugmentations;
     * Total amount of augmentations on this return
     */
    public void settotalAugmentations(Decimal? value) {;
        this.totalAugmentations = value;;
    }


    private List<FilingAugmentationModel> augmentations;

    /**
     * Getter for augmentations;
     * The Augmentations for this return.
     */
    public List<FilingAugmentationModel> getaugmentations() {;
        return this.augmentations;;
    }

    /**
     * Setter for augmentations;
     * The Augmentations for this return.
     */
    public void setaugmentations(List<FilingAugmentationModel> value) {;
        this.augmentations = value;;
    }


    private AccrualType? accrualType;

    /**
     * Getter for accrualType;
     * Accrual type of the return
     */
    public AccrualType? getaccrualType() {;
        return this.accrualType;;
    }

    /**
     * Setter for accrualType;
     * Accrual type of the return
     */
    public void setaccrualType(AccrualType? value) {;
        this.accrualType = value;;
    }


    private Byte? month;

    /**
     * Getter for month;
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Byte? getmonth() {;
        return this.month;;
    }

    /**
     * Setter for month;
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setmonth(Byte? value) {;
        this.month = value;;
    }


    private Int32? year;

    /**
     * Getter for year;
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Int32? getyear() {;
        return this.year;;
    }

    /**
     * Setter for year;
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setyear(Int32? value) {;
        this.year = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    /**
     * Returns a JSON string representation of FilingReturnModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
