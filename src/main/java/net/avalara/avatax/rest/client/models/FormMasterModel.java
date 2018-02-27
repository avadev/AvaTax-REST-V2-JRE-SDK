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
 * Represents information about a tax form known to Avalara
 */
public class FormMasterModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique ID number of this form master object
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number of this form master object
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer formTypeId;

    /**
     * Getter for formTypeId
     *
     * The type of the form being submitted
     */
    public Integer getFormTypeId() {
        return this.formTypeId;
    }

    /**
     * Setter for formTypeId
     *
     * The type of the form being submitted
     */
    public void setFormTypeId(Integer value) {
        this.formTypeId = value;
    }


    private String taxFormCode;

    /**
     * Getter for taxFormCode
     *
     * Unique tax form code representing this tax form
     */
    public String getTaxFormCode() {
        return this.taxFormCode;
    }

    /**
     * Setter for taxFormCode
     *
     * Unique tax form code representing this tax form
     */
    public void setTaxFormCode(String value) {
        this.taxFormCode = value;
    }


    private String legacyReturnName;

    /**
     * Getter for legacyReturnName
     *
     * Legacy return name as known in the AvaFileForm table
     */
    public String getLegacyReturnName() {
        return this.legacyReturnName;
    }

    /**
     * Setter for legacyReturnName
     *
     * Legacy return name as known in the AvaFileForm table
     */
    public void setLegacyReturnName(String value) {
        this.legacyReturnName = value;
    }


    private String taxFormName;

    /**
     * Getter for taxFormName
     *
     * Human readable form summary name
     */
    public String getTaxFormName() {
        return this.taxFormName;
    }

    /**
     * Setter for taxFormName
     *
     * Human readable form summary name
     */
    public void setTaxFormName(String value) {
        this.taxFormName = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * Description of this tax form
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of this tax form
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Boolean isEffective;

    /**
     * Getter for isEffective
     *
     * True if this form is available for use
     */
    public Boolean getIsEffective() {
        return this.isEffective;
    }

    /**
     * Setter for isEffective
     *
     * True if this form is available for use
     */
    public void setIsEffective(Boolean value) {
        this.isEffective = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * ISO 3166 code of the country that issued this tax form
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * ISO 3166 code of the country that issued this tax form
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The region within which this form was issued
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The region within which this form was issued
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String authorityName;

    /**
     * Getter for authorityName
     *
     * Tax authority that issued the form
     */
    public String getAuthorityName() {
        return this.authorityName;
    }

    /**
     * Setter for authorityName
     *
     * Tax authority that issued the form
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }


    private String shortCode;

    /**
     * Getter for shortCode
     *
     * DEPRECATED
     */
    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * Setter for shortCode
     *
     * DEPRECATED
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }


    private Integer dueDay;

    /**
     * Getter for dueDay
     *
     * Day of the month when the form is due
     */
    public Integer getDueDay() {
        return this.dueDay;
    }

    /**
     * Setter for dueDay
     *
     * Day of the month when the form is due
     */
    public void setDueDay(Integer value) {
        this.dueDay = value;
    }


    private Integer delinquentDay;

    /**
     * Getter for delinquentDay
     *
     * Day of the month on which the form is considered delinquent. Almost always the same as DueDay
     */
    public Integer getDelinquentDay() {
        return this.delinquentDay;
    }

    /**
     * Setter for delinquentDay
     *
     * Day of the month on which the form is considered delinquent. Almost always the same as DueDay
     */
    public void setDelinquentDay(Integer value) {
        this.delinquentDay = value;
    }


    private Integer fiscalYearStartMonth;

    /**
     * Getter for fiscalYearStartMonth
     *
     * Month of the year the state considers as the first fiscal month
     */
    public Integer getFiscalYearStartMonth() {
        return this.fiscalYearStartMonth;
    }

    /**
     * Setter for fiscalYearStartMonth
     *
     * Month of the year the state considers as the first fiscal month
     */
    public void setFiscalYearStartMonth(Integer value) {
        this.fiscalYearStartMonth = value;
    }


    private Boolean hasMultiFrequencies;

    /**
     * Getter for hasMultiFrequencies
     *
     * Can form support multi frequencies
     */
    public Boolean getHasMultiFrequencies() {
        return this.hasMultiFrequencies;
    }

    /**
     * Setter for hasMultiFrequencies
     *
     * Can form support multi frequencies
     */
    public void setHasMultiFrequencies(Boolean value) {
        this.hasMultiFrequencies = value;
    }


    private Boolean isPOARequired;

    /**
     * Getter for isPOARequired
     *
     * Does this tax authority require a power of attorney in order to speak to Avalara
     */
    public Boolean getIsPOARequired() {
        return this.isPOARequired;
    }

    /**
     * Setter for isPOARequired
     *
     * Does this tax authority require a power of attorney in order to speak to Avalara
     */
    public void setIsPOARequired(Boolean value) {
        this.isPOARequired = value;
    }


    private Boolean isRegistrationRequired;

    /**
     * Getter for isRegistrationRequired
     *
     * True if this form requires that the customer register with the authority
     */
    public Boolean getIsRegistrationRequired() {
        return this.isRegistrationRequired;
    }

    /**
     * Setter for isRegistrationRequired
     *
     * True if this form requires that the customer register with the authority
     */
    public void setIsRegistrationRequired(Boolean value) {
        this.isRegistrationRequired = value;
    }


    private Boolean hasMultiRegistrationMethods;

    /**
     * Getter for hasMultiRegistrationMethods
     *
     * Unused
     */
    public Boolean getHasMultiRegistrationMethods() {
        return this.hasMultiRegistrationMethods;
    }

    /**
     * Setter for hasMultiRegistrationMethods
     *
     * Unused
     */
    public void setHasMultiRegistrationMethods(Boolean value) {
        this.hasMultiRegistrationMethods = value;
    }


    private Boolean hasSchedules;

    /**
     * Getter for hasSchedules
     *
     * Unused
     */
    public Boolean getHasSchedules() {
        return this.hasSchedules;
    }

    /**
     * Setter for hasSchedules
     *
     * Unused
     */
    public void setHasSchedules(Boolean value) {
        this.hasSchedules = value;
    }


    private Boolean hasMultiFilingMethods;

    /**
     * Getter for hasMultiFilingMethods
     *
     * Unused
     */
    public Boolean getHasMultiFilingMethods() {
        return this.hasMultiFilingMethods;
    }

    /**
     * Setter for hasMultiFilingMethods
     *
     * Unused
     */
    public void setHasMultiFilingMethods(Boolean value) {
        this.hasMultiFilingMethods = value;
    }


    private Boolean hasMultiPayMethods;

    /**
     * Getter for hasMultiPayMethods
     *
     * Unused
     */
    public Boolean getHasMultiPayMethods() {
        return this.hasMultiPayMethods;
    }

    /**
     * Setter for hasMultiPayMethods
     *
     * Unused
     */
    public void setHasMultiPayMethods(Boolean value) {
        this.hasMultiPayMethods = value;
    }


    private Boolean isEFTRequired;

    /**
     * Getter for isEFTRequired
     *
     * Unused
     */
    public Boolean getIsEFTRequired() {
        return this.isEFTRequired;
    }

    /**
     * Setter for isEFTRequired
     *
     * Unused
     */
    public void setIsEFTRequired(Boolean value) {
        this.isEFTRequired = value;
    }


    private Boolean isFilePayMethodLinked;

    /**
     * Getter for isFilePayMethodLinked
     *
     * Unused
     */
    public Boolean getIsFilePayMethodLinked() {
        return this.isFilePayMethodLinked;
    }

    /**
     * Setter for isFilePayMethodLinked
     *
     * Unused
     */
    public void setIsFilePayMethodLinked(Boolean value) {
        this.isFilePayMethodLinked = value;
    }


    private Integer mailingReceivedRuleId;

    /**
     * Getter for mailingReceivedRuleId
     *
     * Unused
     */
    public Integer getMailingReceivedRuleId() {
        return this.mailingReceivedRuleId;
    }

    /**
     * Setter for mailingReceivedRuleId
     *
     * Unused
     */
    public void setMailingReceivedRuleId(Integer value) {
        this.mailingReceivedRuleId = value;
    }


    private Integer proofOfMailingId;

    /**
     * Getter for proofOfMailingId
     *
     * Unused
     */
    public Integer getProofOfMailingId() {
        return this.proofOfMailingId;
    }

    /**
     * Setter for proofOfMailingId
     *
     * Unused
     */
    public void setProofOfMailingId(Integer value) {
        this.proofOfMailingId = value;
    }


    private Boolean isNegAmountAllowed;

    /**
     * Getter for isNegAmountAllowed
     *
     * True if you can report a negative amount in a single jurisdiction on the form
     */
    public Boolean getIsNegAmountAllowed() {
        return this.isNegAmountAllowed;
    }

    /**
     * Setter for isNegAmountAllowed
     *
     * True if you can report a negative amount in a single jurisdiction on the form
     */
    public void setIsNegAmountAllowed(Boolean value) {
        this.isNegAmountAllowed = value;
    }


    private Boolean allowNegativeOverallTax;

    /**
     * Getter for allowNegativeOverallTax
     *
     * True if the form overall can go negative
     */
    public Boolean getAllowNegativeOverallTax() {
        return this.allowNegativeOverallTax;
    }

    /**
     * Setter for allowNegativeOverallTax
     *
     * True if the form overall can go negative
     */
    public void setAllowNegativeOverallTax(Boolean value) {
        this.allowNegativeOverallTax = value;
    }


    private Boolean isNettingRequired;

    /**
     * Getter for isNettingRequired
     *
     * Unused
     */
    public Boolean getIsNettingRequired() {
        return this.isNettingRequired;
    }

    /**
     * Setter for isNettingRequired
     *
     * Unused
     */
    public void setIsNettingRequired(Boolean value) {
        this.isNettingRequired = value;
    }


    private Integer roundingMethodId;

    /**
     * Getter for roundingMethodId
     *
     * Unused
     */
    public Integer getRoundingMethodId() {
        return this.roundingMethodId;
    }

    /**
     * Setter for roundingMethodId
     *
     * Unused
     */
    public void setRoundingMethodId(Integer value) {
        this.roundingMethodId = value;
    }


    private BigDecimal vendorDiscountAnnualMax;

    /**
     * Getter for vendorDiscountAnnualMax
     *
     * Total amount of discounts that can be received by a vendor each year
     */
    public BigDecimal getVendorDiscountAnnualMax() {
        return this.vendorDiscountAnnualMax;
    }

    /**
     * Setter for vendorDiscountAnnualMax
     *
     * Total amount of discounts that can be received by a vendor each year
     */
    public void setVendorDiscountAnnualMax(BigDecimal value) {
        this.vendorDiscountAnnualMax = value;
    }


    private Boolean versionsRequireAuthorityApproval;

    /**
     * Getter for versionsRequireAuthorityApproval
     *
     * Unused
     */
    public Boolean getVersionsRequireAuthorityApproval() {
        return this.versionsRequireAuthorityApproval;
    }

    /**
     * Setter for versionsRequireAuthorityApproval
     *
     * Unused
     */
    public void setVersionsRequireAuthorityApproval(Boolean value) {
        this.versionsRequireAuthorityApproval = value;
    }


    private Integer outletReportingMethodId;

    /**
     * Getter for outletReportingMethodId
     *
     * Type of outlet reporting for this form
     */
    public Integer getOutletReportingMethodId() {
        return this.outletReportingMethodId;
    }

    /**
     * Setter for outletReportingMethodId
     *
     * Type of outlet reporting for this form
     */
    public void setOutletReportingMethodId(Integer value) {
        this.outletReportingMethodId = value;
    }


    private Boolean hasReportingCodes;

    /**
     * Getter for hasReportingCodes
     *
     * Unused
     */
    public Boolean getHasReportingCodes() {
        return this.hasReportingCodes;
    }

    /**
     * Setter for hasReportingCodes
     *
     * Unused
     */
    public void setHasReportingCodes(Boolean value) {
        this.hasReportingCodes = value;
    }


    private Boolean hasPrepayments;

    /**
     * Getter for hasPrepayments
     *
     * Not sure if used
     */
    public Boolean getHasPrepayments() {
        return this.hasPrepayments;
    }

    /**
     * Setter for hasPrepayments
     *
     * Not sure if used
     */
    public void setHasPrepayments(Boolean value) {
        this.hasPrepayments = value;
    }


    private Boolean grossIncludesInterstateSales;

    /**
     * Getter for grossIncludesInterstateSales
     *
     * Unused
     */
    public Boolean getGrossIncludesInterstateSales() {
        return this.grossIncludesInterstateSales;
    }

    /**
     * Setter for grossIncludesInterstateSales
     *
     * Unused
     */
    public void setGrossIncludesInterstateSales(Boolean value) {
        this.grossIncludesInterstateSales = value;
    }


    private String grossIncludesTax;

    /**
     * Getter for grossIncludesTax
     *
     * Unused
     */
    public String getGrossIncludesTax() {
        return this.grossIncludesTax;
    }

    /**
     * Setter for grossIncludesTax
     *
     * Unused
     */
    public void setGrossIncludesTax(String value) {
        this.grossIncludesTax = value;
    }


    private Boolean hasEfileFee;

    /**
     * Getter for hasEfileFee
     *
     * Unused
     */
    public Boolean getHasEfileFee() {
        return this.hasEfileFee;
    }

    /**
     * Setter for hasEfileFee
     *
     * Unused
     */
    public void setHasEfileFee(Boolean value) {
        this.hasEfileFee = value;
    }


    private Boolean hasEpayFee;

    /**
     * Getter for hasEpayFee
     *
     * Unused
     */
    public Boolean getHasEpayFee() {
        return this.hasEpayFee;
    }

    /**
     * Setter for hasEpayFee
     *
     * Unused
     */
    public void setHasEpayFee(Boolean value) {
        this.hasEpayFee = value;
    }


    private Boolean hasDependencies;

    /**
     * Getter for hasDependencies
     *
     * Unused
     */
    public Boolean getHasDependencies() {
        return this.hasDependencies;
    }

    /**
     * Setter for hasDependencies
     *
     * Unused
     */
    public void setHasDependencies(Boolean value) {
        this.hasDependencies = value;
    }


    private String requiredEfileTrigger;

    /**
     * Getter for requiredEfileTrigger
     *
     * Unused
     */
    public String getRequiredEfileTrigger() {
        return this.requiredEfileTrigger;
    }

    /**
     * Setter for requiredEfileTrigger
     *
     * Unused
     */
    public void setRequiredEfileTrigger(String value) {
        this.requiredEfileTrigger = value;
    }


    private String requiredEftTrigger;

    /**
     * Getter for requiredEftTrigger
     *
     * Unused
     */
    public String getRequiredEftTrigger() {
        return this.requiredEftTrigger;
    }

    /**
     * Setter for requiredEftTrigger
     *
     * Unused
     */
    public void setRequiredEftTrigger(String value) {
        this.requiredEftTrigger = value;
    }


    private Boolean vendorDiscountEfile;

    /**
     * Getter for vendorDiscountEfile
     *
     * Unused
     */
    public Boolean getVendorDiscountEfile() {
        return this.vendorDiscountEfile;
    }

    /**
     * Setter for vendorDiscountEfile
     *
     * Unused
     */
    public void setVendorDiscountEfile(Boolean value) {
        this.vendorDiscountEfile = value;
    }


    private Boolean vendorDiscountPaper;

    /**
     * Getter for vendorDiscountPaper
     *
     * Unused
     */
    public Boolean getVendorDiscountPaper() {
        return this.vendorDiscountPaper;
    }

    /**
     * Setter for vendorDiscountPaper
     *
     * Unused
     */
    public void setVendorDiscountPaper(Boolean value) {
        this.vendorDiscountPaper = value;
    }


    private String peerReviewed;

    /**
     * Getter for peerReviewed
     *
     * Unused
     */
    public String getPeerReviewed() {
        return this.peerReviewed;
    }

    /**
     * Setter for peerReviewed
     *
     * Unused
     */
    public void setPeerReviewed(String value) {
        this.peerReviewed = value;
    }


    private String peerReviewedId;

    /**
     * Getter for peerReviewedId
     *
     * Unused
     */
    public String getPeerReviewedId() {
        return this.peerReviewedId;
    }

    /**
     * Setter for peerReviewedId
     *
     * Unused
     */
    public void setPeerReviewedId(String value) {
        this.peerReviewedId = value;
    }


    private String peerReviewedDate;

    /**
     * Getter for peerReviewedDate
     *
     * Unused
     */
    public String getPeerReviewedDate() {
        return this.peerReviewedDate;
    }

    /**
     * Setter for peerReviewedDate
     *
     * Unused
     */
    public void setPeerReviewedDate(String value) {
        this.peerReviewedDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * ID of the Avalara user who created the form
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * ID of the Avalara user who created the form
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * Date when form was created
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Date when form was created
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * ID of the Avalara user who modified the form
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * ID of the Avalara user who modified the form
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Date when form was modified
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Date when form was modified
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private String dorAddressMailTo;

    /**
     * Getter for dorAddressMailTo
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddressMailTo() {
        return this.dorAddressMailTo;
    }

    /**
     * Setter for dorAddressMailTo
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddressMailTo(String value) {
        this.dorAddressMailTo = value;
    }


    private String dorAddress1;

    /**
     * Getter for dorAddress1
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddress1() {
        return this.dorAddress1;
    }

    /**
     * Setter for dorAddress1
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddress1(String value) {
        this.dorAddress1 = value;
    }


    private String dorAddress2;

    /**
     * Getter for dorAddress2
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddress2() {
        return this.dorAddress2;
    }

    /**
     * Setter for dorAddress2
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddress2(String value) {
        this.dorAddress2 = value;
    }


    private String dorAddressCity;

    /**
     * Getter for dorAddressCity
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddressCity() {
        return this.dorAddressCity;
    }

    /**
     * Setter for dorAddressCity
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddressCity(String value) {
        this.dorAddressCity = value;
    }


    private String dorAddressRegion;

    /**
     * Getter for dorAddressRegion
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddressRegion() {
        return this.dorAddressRegion;
    }

    /**
     * Setter for dorAddressRegion
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddressRegion(String value) {
        this.dorAddressRegion = value;
    }


    private String dorAddressPostalCode;

    /**
     * Getter for dorAddressPostalCode
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddressPostalCode() {
        return this.dorAddressPostalCode;
    }

    /**
     * Setter for dorAddressPostalCode
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddressPostalCode(String value) {
        this.dorAddressPostalCode = value;
    }


    private String dorAddressCountry;

    /**
     * Getter for dorAddressCountry
     *
     * Mailing address of the department of revenue
     */
    public String getDorAddressCountry() {
        return this.dorAddressCountry;
    }

    /**
     * Setter for dorAddressCountry
     *
     * Mailing address of the department of revenue
     */
    public void setDorAddressCountry(String value) {
        this.dorAddressCountry = value;
    }


    private String zeroAddressMailTo;

    /**
     * Getter for zeroAddressMailTo
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddressMailTo() {
        return this.zeroAddressMailTo;
    }

    /**
     * Setter for zeroAddressMailTo
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddressMailTo(String value) {
        this.zeroAddressMailTo = value;
    }


    private String zeroAddress1;

    /**
     * Getter for zeroAddress1
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddress1() {
        return this.zeroAddress1;
    }

    /**
     * Setter for zeroAddress1
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddress1(String value) {
        this.zeroAddress1 = value;
    }


    private String zeroAddress2;

    /**
     * Getter for zeroAddress2
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddress2() {
        return this.zeroAddress2;
    }

    /**
     * Setter for zeroAddress2
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddress2(String value) {
        this.zeroAddress2 = value;
    }


    private String zeroAddressCity;

    /**
     * Getter for zeroAddressCity
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddressCity() {
        return this.zeroAddressCity;
    }

    /**
     * Setter for zeroAddressCity
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddressCity(String value) {
        this.zeroAddressCity = value;
    }


    private String zeroAddressRegion;

    /**
     * Getter for zeroAddressRegion
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddressRegion() {
        return this.zeroAddressRegion;
    }

    /**
     * Setter for zeroAddressRegion
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddressRegion(String value) {
        this.zeroAddressRegion = value;
    }


    private String zeroAddressPostalCode;

    /**
     * Getter for zeroAddressPostalCode
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddressPostalCode() {
        return this.zeroAddressPostalCode;
    }

    /**
     * Setter for zeroAddressPostalCode
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddressPostalCode(String value) {
        this.zeroAddressPostalCode = value;
    }


    private String zeroAddressCountry;

    /**
     * Getter for zeroAddressCountry
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public String getZeroAddressCountry() {
        return this.zeroAddressCountry;
    }

    /**
     * Setter for zeroAddressCountry
     *
     * Mailing address to use when a zero dollar form is filed
     */
    public void setZeroAddressCountry(String value) {
        this.zeroAddressCountry = value;
    }


    private String amendedAddressMailTo;

    /**
     * Getter for amendedAddressMailTo
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddressMailTo() {
        return this.amendedAddressMailTo;
    }

    /**
     * Setter for amendedAddressMailTo
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddressMailTo(String value) {
        this.amendedAddressMailTo = value;
    }


    private String amendedAddress1;

    /**
     * Getter for amendedAddress1
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddress1() {
        return this.amendedAddress1;
    }

    /**
     * Setter for amendedAddress1
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddress1(String value) {
        this.amendedAddress1 = value;
    }


    private String amendedAddress2;

    /**
     * Getter for amendedAddress2
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddress2() {
        return this.amendedAddress2;
    }

    /**
     * Setter for amendedAddress2
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddress2(String value) {
        this.amendedAddress2 = value;
    }


    private String amendedAddressCity;

    /**
     * Getter for amendedAddressCity
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddressCity() {
        return this.amendedAddressCity;
    }

    /**
     * Setter for amendedAddressCity
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddressCity(String value) {
        this.amendedAddressCity = value;
    }


    private String amendedAddressRegion;

    /**
     * Getter for amendedAddressRegion
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddressRegion() {
        return this.amendedAddressRegion;
    }

    /**
     * Setter for amendedAddressRegion
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddressRegion(String value) {
        this.amendedAddressRegion = value;
    }


    private String amendedAddressPostalCode;

    /**
     * Getter for amendedAddressPostalCode
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddressPostalCode() {
        return this.amendedAddressPostalCode;
    }

    /**
     * Setter for amendedAddressPostalCode
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddressPostalCode(String value) {
        this.amendedAddressPostalCode = value;
    }


    private String amendedAddressCountry;

    /**
     * Getter for amendedAddressCountry
     *
     * Mailing address to use when filing an amended return
     */
    public String getAmendedAddressCountry() {
        return this.amendedAddressCountry;
    }

    /**
     * Setter for amendedAddressCountry
     *
     * Mailing address to use when filing an amended return
     */
    public void setAmendedAddressCountry(String value) {
        this.amendedAddressCountry = value;
    }


    private Boolean onlineBackFiling;

    /**
     * Getter for onlineBackFiling
     *
     * Unused
     */
    public Boolean getOnlineBackFiling() {
        return this.onlineBackFiling;
    }

    /**
     * Setter for onlineBackFiling
     *
     * Unused
     */
    public void setOnlineBackFiling(Boolean value) {
        this.onlineBackFiling = value;
    }


    private Boolean onlineAmendedReturns;

    /**
     * Getter for onlineAmendedReturns
     *
     * Unused
     */
    public Boolean getOnlineAmendedReturns() {
        return this.onlineAmendedReturns;
    }

    /**
     * Setter for onlineAmendedReturns
     *
     * Unused
     */
    public void setOnlineAmendedReturns(Boolean value) {
        this.onlineAmendedReturns = value;
    }


    private String prepaymentFrequency;

    /**
     * Getter for prepaymentFrequency
     *
     * --Need Further Clarification
     */
    public String getPrepaymentFrequency() {
        return this.prepaymentFrequency;
    }

    /**
     * Setter for prepaymentFrequency
     *
     * --Need Further Clarification
     */
    public void setPrepaymentFrequency(String value) {
        this.prepaymentFrequency = value;
    }


    private Boolean outletLocationIdentifiersRequired;

    /**
     * Getter for outletLocationIdentifiersRequired
     *
     * Unused
     */
    public Boolean getOutletLocationIdentifiersRequired() {
        return this.outletLocationIdentifiersRequired;
    }

    /**
     * Setter for outletLocationIdentifiersRequired
     *
     * Unused
     */
    public void setOutletLocationIdentifiersRequired(Boolean value) {
        this.outletLocationIdentifiersRequired = value;
    }


    private String listingSortOrder;

    /**
     * Getter for listingSortOrder
     *
     * --Need Further Clarification
     */
    public String getListingSortOrder() {
        return this.listingSortOrder;
    }

    /**
     * Setter for listingSortOrder
     *
     * --Need Further Clarification
     */
    public void setListingSortOrder(String value) {
        this.listingSortOrder = value;
    }


    private String dorWebsite;

    /**
     * Getter for dorWebsite
     *
     * Link to the state department of revenue website, if available
     */
    public String getDorWebsite() {
        return this.dorWebsite;
    }

    /**
     * Setter for dorWebsite
     *
     * Link to the state department of revenue website, if available
     */
    public void setDorWebsite(String value) {
        this.dorWebsite = value;
    }


    private Boolean fileForAllOutlets;

    /**
     * Getter for fileForAllOutlets
     *
     * --Need Further Clarification
     */
    public Boolean getFileForAllOutlets() {
        return this.fileForAllOutlets;
    }

    /**
     * Setter for fileForAllOutlets
     *
     * --Need Further Clarification
     */
    public void setFileForAllOutlets(Boolean value) {
        this.fileForAllOutlets = value;
    }


    private Boolean paperFormsDoNotHaveDiscounts;

    /**
     * Getter for paperFormsDoNotHaveDiscounts
     *
     * --Need Further Clarification
     */
    public Boolean getPaperFormsDoNotHaveDiscounts() {
        return this.paperFormsDoNotHaveDiscounts;
    }

    /**
     * Setter for paperFormsDoNotHaveDiscounts
     *
     * --Need Further Clarification
     */
    public void setPaperFormsDoNotHaveDiscounts(Boolean value) {
        this.paperFormsDoNotHaveDiscounts = value;
    }


    private Boolean stackAggregation;

    /**
     * Getter for stackAggregation
     *
     * Internal behavior
     */
    public Boolean getStackAggregation() {
        return this.stackAggregation;
    }

    /**
     * Setter for stackAggregation
     *
     * Internal behavior
     */
    public void setStackAggregation(Boolean value) {
        this.stackAggregation = value;
    }


    private String roundingPrecision;

    /**
     * Getter for roundingPrecision
     *
     * --Need Further Clarification
     */
    public String getRoundingPrecision() {
        return this.roundingPrecision;
    }

    /**
     * Setter for roundingPrecision
     *
     * --Need Further Clarification
     */
    public void setRoundingPrecision(String value) {
        this.roundingPrecision = value;
    }


    private String inconsistencyTolerance;

    /**
     * Getter for inconsistencyTolerance
     *
     * --Need Further Clarification
     */
    public String getInconsistencyTolerance() {
        return this.inconsistencyTolerance;
    }

    /**
     * Setter for inconsistencyTolerance
     *
     * --Need Further Clarification
     */
    public void setInconsistencyTolerance(String value) {
        this.inconsistencyTolerance = value;
    }


    private Date effDate;

    /**
     * Getter for effDate
     *
     * Date when this form became effective
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * Date when this form became effective
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * Date when this form expired
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Date when this form expired
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private Boolean visibleToCustomers;

    /**
     * Getter for visibleToCustomers
     *
     * True if this form can be shown to customers
     */
    public Boolean getVisibleToCustomers() {
        return this.visibleToCustomers;
    }

    /**
     * Setter for visibleToCustomers
     *
     * True if this form can be shown to customers
     */
    public void setVisibleToCustomers(Boolean value) {
        this.visibleToCustomers = value;
    }


    private Boolean requiresOutletSetup;

    /**
     * Getter for requiresOutletSetup
     *
     * True if this form requires that you set up outlets in the state
     */
    public Boolean getRequiresOutletSetup() {
        return this.requiresOutletSetup;
    }

    /**
     * Setter for requiresOutletSetup
     *
     * True if this form requires that you set up outlets in the state
     */
    public void setRequiresOutletSetup(Boolean value) {
        this.requiresOutletSetup = value;
    }


    private Boolean achCreditAllowed;

    /**
     * Getter for achCreditAllowed
     *
     * True if this state permits payment by ACH Credit
     */
    public Boolean getAchCreditAllowed() {
        return this.achCreditAllowed;
    }

    /**
     * Setter for achCreditAllowed
     *
     * True if this state permits payment by ACH Credit
     */
    public void setAchCreditAllowed(Boolean value) {
        this.achCreditAllowed = value;
    }


    private String reportLevel;

    /**
     * Getter for reportLevel
     *
     * Jurisdiction level of the state
     */
    public String getReportLevel() {
        return this.reportLevel;
    }

    /**
     * Setter for reportLevel
     *
     * Jurisdiction level of the state
     */
    public void setReportLevel(String value) {
        this.reportLevel = value;
    }


    private Boolean postOfficeValidated;

    /**
     * Getter for postOfficeValidated
     *
     * True if this form is verified filed via email
     */
    public Boolean getPostOfficeValidated() {
        return this.postOfficeValidated;
    }

    /**
     * Setter for postOfficeValidated
     *
     * True if this form is verified filed via email
     */
    public void setPostOfficeValidated(Boolean value) {
        this.postOfficeValidated = value;
    }


    private String stackAggregationOption;

    /**
     * Getter for stackAggregationOption
     *
     * Internal Avalara flag
     */
    public String getStackAggregationOption() {
        return this.stackAggregationOption;
    }

    /**
     * Setter for stackAggregationOption
     *
     * Internal Avalara flag
     */
    public void setStackAggregationOption(String value) {
        this.stackAggregationOption = value;
    }


    private String sstBehavior;

    /**
     * Getter for sstBehavior
     *
     * Internal Avalara flag
     */
    public String getSstBehavior() {
        return this.sstBehavior;
    }

    /**
     * Setter for sstBehavior
     *
     * Internal Avalara flag
     */
    public void setSstBehavior(String value) {
        this.sstBehavior = value;
    }


    private String nonSstBehavior;

    /**
     * Getter for nonSstBehavior
     *
     * Internal Avalara flag
     */
    public String getNonSstBehavior() {
        return this.nonSstBehavior;
    }

    /**
     * Setter for nonSstBehavior
     *
     * Internal Avalara flag
     */
    public void setNonSstBehavior(String value) {
        this.nonSstBehavior = value;
    }


    private String dorPhoneNumber;

    /**
     * Getter for dorPhoneNumber
     *
     * Phone number of the department of revenue
     */
    public String getDorPhoneNumber() {
        return this.dorPhoneNumber;
    }

    /**
     * Setter for dorPhoneNumber
     *
     * Phone number of the department of revenue
     */
    public void setDorPhoneNumber(String value) {
        this.dorPhoneNumber = value;
    }


    private String averageCheckClearDays;

    /**
     * Getter for averageCheckClearDays
     *
     * Unused
     */
    public String getAverageCheckClearDays() {
        return this.averageCheckClearDays;
    }

    /**
     * Setter for averageCheckClearDays
     *
     * Unused
     */
    public void setAverageCheckClearDays(String value) {
        this.averageCheckClearDays = value;
    }


    private Boolean filterZeroRatedLineDetails;

    /**
     * Getter for filterZeroRatedLineDetails
     *
     * Unused
     */
    public Boolean getFilterZeroRatedLineDetails() {
        return this.filterZeroRatedLineDetails;
    }

    /**
     * Setter for filterZeroRatedLineDetails
     *
     * Unused
     */
    public void setFilterZeroRatedLineDetails(Boolean value) {
        this.filterZeroRatedLineDetails = value;
    }


    private Boolean allowsBulkFilingAccounts;

    /**
     * Getter for allowsBulkFilingAccounts
     *
     * Unused
     */
    public Boolean getAllowsBulkFilingAccounts() {
        return this.allowsBulkFilingAccounts;
    }

    /**
     * Setter for allowsBulkFilingAccounts
     *
     * Unused
     */
    public void setAllowsBulkFilingAccounts(Boolean value) {
        this.allowsBulkFilingAccounts = value;
    }


    private String bulkAccountInstructionLink;

    /**
     * Getter for bulkAccountInstructionLink
     *
     * Unused
     */
    public String getBulkAccountInstructionLink() {
        return this.bulkAccountInstructionLink;
    }

    /**
     * Setter for bulkAccountInstructionLink
     *
     * Unused
     */
    public void setBulkAccountInstructionLink(String value) {
        this.bulkAccountInstructionLink = value;
    }


    private String registrationIdFormat;

    /**
     * Getter for registrationIdFormat
     *
     * Unused
     */
    public String getRegistrationIdFormat() {
        return this.registrationIdFormat;
    }

    /**
     * Setter for registrationIdFormat
     *
     * Unused
     */
    public void setRegistrationIdFormat(String value) {
        this.registrationIdFormat = value;
    }


    private String thresholdTrigger;

    /**
     * Getter for thresholdTrigger
     *
     * Unused
     */
    public String getThresholdTrigger() {
        return this.thresholdTrigger;
    }

    /**
     * Setter for thresholdTrigger
     *
     * Unused
     */
    public void setThresholdTrigger(String value) {
        this.thresholdTrigger = value;
    }


    private String transactionSortingOption;

    /**
     * Getter for transactionSortingOption
     *
     * Unused
     */
    public String getTransactionSortingOption() {
        return this.transactionSortingOption;
    }

    /**
     * Setter for transactionSortingOption
     *
     * Unused
     */
    public void setTransactionSortingOption(String value) {
        this.transactionSortingOption = value;
    }


    private Integer contentReviewFrequencyId;

    /**
     * Getter for contentReviewFrequencyId
     *
     * Unused
     */
    public Integer getContentReviewFrequencyId() {
        return this.contentReviewFrequencyId;
    }

    /**
     * Setter for contentReviewFrequencyId
     *
     * Unused
     */
    public void setContentReviewFrequencyId(Integer value) {
        this.contentReviewFrequencyId = value;
    }


    private String aliasForFormMasterId;

    /**
     * Getter for aliasForFormMasterId
     *
     * Unused
     */
    public String getAliasForFormMasterId() {
        return this.aliasForFormMasterId;
    }

    /**
     * Setter for aliasForFormMasterId
     *
     * Unused
     */
    public void setAliasForFormMasterId(String value) {
        this.aliasForFormMasterId = value;
    }


    /**
     * Returns a JSON string representation of FormMasterModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
