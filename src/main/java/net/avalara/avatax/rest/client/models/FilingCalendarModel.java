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
 * Represents a commitment to file a tax return on a recurring basis.
* Only used if you subscribe to Avalara Returns.
 */
public class FilingCalendarModel {


    private long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing calendar.
     */
    public long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this filing calendar.
     */
    public void setId(long value) {
        this.id = value;
    }


    private int companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which this filing calendar belongs.
     */
    public int getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which this filing calendar belongs.
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }


    private string returnName;

    /**
     * Getter for returnName
     *
     * The name of the tax form to file.
     */
    public string getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName
     *
     * The name of the tax form to file.
     */
    public void setReturnName(string value) {
        this.returnName = value;
    }


    private string locationCode;

    /**
     * Getter for locationCode
     *
     * If this calendar is for a location-specific tax return, specify the location code here. To file for all locations, leave this value NULL.
     */
    public string getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * If this calendar is for a location-specific tax return, specify the location code here. To file for all locations, leave this value NULL.
     */
    public void setLocationCode(string value) {
        this.locationCode = value;
    }


    private OutletTypeId outletTypeId;

    /**
     * Getter for outletTypeId
     *
     * If this calendar is for a location-specific tax return, specify the location-specific behavior here.
     */
    public OutletTypeId getOutletTypeId() {
        return this.outletTypeId;
    }

    /**
     * Setter for outletTypeId
     *
     * If this calendar is for a location-specific tax return, specify the location-specific behavior here.
     */
    public void setOutletTypeId(OutletTypeId value) {
        this.outletTypeId = value;
    }


    private string paymentCurrency;

    /**
     * Getter for paymentCurrency
     *
     * Specify the ISO 4217 currency code for the currency to remit for this tax return. For all tax returns in the United States, specify "USD".
     */
    public string getPaymentCurrency() {
        return this.paymentCurrency;
    }

    /**
     * Setter for paymentCurrency
     *
     * Specify the ISO 4217 currency code for the currency to remit for this tax return. For all tax returns in the United States, specify "USD".
     */
    public void setPaymentCurrency(string value) {
        this.paymentCurrency = value;
    }


    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId
     *
     * The frequency on which this tax form is filed.
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId
     *
     * The frequency on which this tax form is filed.
     */
    public void setFilingFrequencyId(FilingFrequencyId value) {
        this.filingFrequencyId = value;
    }


    private Short months;

    /**
     * Getter for months
     *
     * A 16-bit bitmap containing a 1 for each month when the return should be filed.
     */
    public Short getMonths() {
        return this.months;
    }

    /**
     * Setter for months
     *
     * A 16-bit bitmap containing a 1 for each month when the return should be filed.
     */
    public void setMonths(Short value) {
        this.months = value;
    }


    private string stateRegistrationId;

    /**
     * Getter for stateRegistrationId
     *
     * Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public string getStateRegistrationId() {
        return this.stateRegistrationId;
    }

    /**
     * Setter for stateRegistrationId
     *
     * Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public void setStateRegistrationId(string value) {
        this.stateRegistrationId = value;
    }


    private string localRegistrationId;

    /**
     * Getter for localRegistrationId
     *
     * Tax Registration ID for the local jurisdiction, if any.
     */
    public string getLocalRegistrationId() {
        return this.localRegistrationId;
    }

    /**
     * Setter for localRegistrationId
     *
     * Tax Registration ID for the local jurisdiction, if any.
     */
    public void setLocalRegistrationId(string value) {
        this.localRegistrationId = value;
    }


    private string employerIdentificationNumber;

    /**
     * Getter for employerIdentificationNumber
     *
     * The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public string getEmployerIdentificationNumber() {
        return this.employerIdentificationNumber;
    }

    /**
     * Setter for employerIdentificationNumber
     *
     * The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public void setEmployerIdentificationNumber(string value) {
        this.employerIdentificationNumber = value;
    }


    private string line1;

    /**
     * Getter for line1
     *
     * The first line of the physical address to be used when filing this tax return.
     */
    public string getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * The first line of the physical address to be used when filing this tax return.
     */
    public void setLine1(string value) {
        this.line1 = value;
    }


    private string line2;

    /**
     * Getter for line2
     *
     * The second line of the physical address to be used when filing this tax return.
    * Please note that some tax forms do not support multiple address lines.
     */
    public string getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * The second line of the physical address to be used when filing this tax return.
    * Please note that some tax forms do not support multiple address lines.
     */
    public void setLine2(string value) {
        this.line2 = value;
    }


    private string city;

    /**
     * Getter for city
     *
     * The city name of the physical address to be used when filing this tax return.
     */
    public string getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * The city name of the physical address to be used when filing this tax return.
     */
    public void setCity(string value) {
        this.city = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The state, region, or province of the physical address to be used when filing this tax return.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The state, region, or province of the physical address to be used when filing this tax return.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code or zip code of the physical address to be used when filing this tax return.
     */
    public string getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code or zip code of the physical address to be used when filing this tax return.
     */
    public void setPostalCode(string value) {
        this.postalCode = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The two character ISO-3166 country code of the physical address to be used when filing this return.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO-3166 country code of the physical address to be used when filing this return.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string phone;

    /**
     * Getter for phone
     *
     * The phone number to be used when filing this return.
     */
    public string getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone
     *
     * The phone number to be used when filing this return.
     */
    public void setPhone(string value) {
        this.phone = value;
    }


    private string customerFilingInstructions;

    /**
     * Getter for customerFilingInstructions
     *
     * Special filing instructions to be used when filing this return.
    * Please note that requesting special filing instructions may incur additional costs.
     */
    public string getCustomerFilingInstructions() {
        return this.customerFilingInstructions;
    }

    /**
     * Setter for customerFilingInstructions
     *
     * Special filing instructions to be used when filing this return.
    * Please note that requesting special filing instructions may incur additional costs.
     */
    public void setCustomerFilingInstructions(string value) {
        this.customerFilingInstructions = value;
    }


    private string legalEntityName;

    /**
     * Getter for legalEntityName
     *
     * The legal entity name to be used when filing this return.
     */
    public string getLegalEntityName() {
        return this.legalEntityName;
    }

    /**
     * Setter for legalEntityName
     *
     * The legal entity name to be used when filing this return.
     */
    public void setLegalEntityName(string value) {
        this.legalEntityName = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The earliest date for the tax period when this return should be filed.
    * This date specifies the earliest date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The earliest date for the tax period when this return should be filed.
    * This date specifies the earliest date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date for the tax period when this return should be filed.
    * This date specifies the last date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date for the tax period when this return should be filed.
    * This date specifies the last date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private FilingTypeId filingTypeId;

    /**
     * Getter for filingTypeId
     *
     * The method to be used when filing this return.
     */
    public FilingTypeId getFilingTypeId() {
        return this.filingTypeId;
    }

    /**
     * Setter for filingTypeId
     *
     * The method to be used when filing this return.
     */
    public void setFilingTypeId(FilingTypeId value) {
        this.filingTypeId = value;
    }


    private string eFileUsername;

    /**
     * Getter for eFileUsername
     *
     * If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public string getEFileUsername() {
        return this.eFileUsername;
    }

    /**
     * Setter for eFileUsername
     *
     * If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public void setEFileUsername(string value) {
        this.eFileUsername = value;
    }


    private string eFilePassword;

    /**
     * Getter for eFilePassword
     *
     * If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public string getEFilePassword() {
        return this.eFilePassword;
    }

    /**
     * Setter for eFilePassword
     *
     * If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public void setEFilePassword(string value) {
        this.eFilePassword = value;
    }


    private Byte prepayPercentage;

    /**
     * Getter for prepayPercentage
     *
     * If you are required to prepay a percentage of taxes for future periods, please specify the percentage in whole numbers; 
    * for example, the value 90 would indicate 90%.
     */
    public Byte getPrepayPercentage() {
        return this.prepayPercentage;
    }

    /**
     * Setter for prepayPercentage
     *
     * If you are required to prepay a percentage of taxes for future periods, please specify the percentage in whole numbers; 
    * for example, the value 90 would indicate 90%.
     */
    public void setPrepayPercentage(Byte value) {
        this.prepayPercentage = value;
    }


    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * The type of tax to report on this return.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * The type of tax to report on this return.
     */
    public void setTaxTypeId(MatchingTaxType value) {
        this.taxTypeId = value;
    }


    private string internalNotes;

    /**
     * Getter for internalNotes
     *
     * Internal filing notes.
     */
    public string getInternalNotes() {
        return this.internalNotes;
    }

    /**
     * Setter for internalNotes
     *
     * Internal filing notes.
     */
    public void setInternalNotes(string value) {
        this.internalNotes = value;
    }


    private string alSignOn;

    /**
     * Getter for alSignOn
     *
     * Custom filing information field for Alabama.
     */
    public string getAlSignOn() {
        return this.alSignOn;
    }

    /**
     * Setter for alSignOn
     *
     * Custom filing information field for Alabama.
     */
    public void setAlSignOn(string value) {
        this.alSignOn = value;
    }


    private string alAccessCode;

    /**
     * Getter for alAccessCode
     *
     * Custom filing information field for Alabama.
     */
    public string getAlAccessCode() {
        return this.alAccessCode;
    }

    /**
     * Setter for alAccessCode
     *
     * Custom filing information field for Alabama.
     */
    public void setAlAccessCode(string value) {
        this.alAccessCode = value;
    }


    private string meBusinessCode;

    /**
     * Getter for meBusinessCode
     *
     * Custom filing information field for Maine.
     */
    public string getMeBusinessCode() {
        return this.meBusinessCode;
    }

    /**
     * Setter for meBusinessCode
     *
     * Custom filing information field for Maine.
     */
    public void setMeBusinessCode(string value) {
        this.meBusinessCode = value;
    }


    private string iaBen;

    /**
     * Getter for iaBen
     *
     * Custom filing information field for Iowa.
     */
    public string getIaBen() {
        return this.iaBen;
    }

    /**
     * Setter for iaBen
     *
     * Custom filing information field for Iowa.
     */
    public void setIaBen(string value) {
        this.iaBen = value;
    }


    private string ctReg;

    /**
     * Getter for ctReg
     *
     * Custom filing information field for Connecticut.
     */
    public string getCtReg() {
        return this.ctReg;
    }

    /**
     * Setter for ctReg
     *
     * Custom filing information field for Connecticut.
     */
    public void setCtReg(string value) {
        this.ctReg = value;
    }


    private string other1Name;

    /**
     * Getter for other1Name
     *
     * Custom filing information field. Leave blank.
     */
    public string getOther1Name() {
        return this.other1Name;
    }

    /**
     * Setter for other1Name
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther1Name(string value) {
        this.other1Name = value;
    }


    private string other1Value;

    /**
     * Getter for other1Value
     *
     * Custom filing information field. Leave blank.
     */
    public string getOther1Value() {
        return this.other1Value;
    }

    /**
     * Setter for other1Value
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther1Value(string value) {
        this.other1Value = value;
    }


    private string other2Name;

    /**
     * Getter for other2Name
     *
     * Custom filing information field. Leave blank.
     */
    public string getOther2Name() {
        return this.other2Name;
    }

    /**
     * Setter for other2Name
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther2Name(string value) {
        this.other2Name = value;
    }


    private string other2Value;

    /**
     * Getter for other2Value
     *
     * Custom filing information field. Leave blank.
     */
    public string getOther2Value() {
        return this.other2Value;
    }

    /**
     * Setter for other2Value
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther2Value(string value) {
        this.other2Value = value;
    }


    private string other3Name;

    /**
     * Getter for other3Name
     *
     * Custom filing information field. Leave blank.
     */
    public string getOther3Name() {
        return this.other3Name;
    }

    /**
     * Setter for other3Name
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther3Name(string value) {
        this.other3Name = value;
    }


    private string other3Value;

    /**
     * Getter for other3Value
     *
     * Custom filing information field. Leave blank.
     */
    public string getOther3Value() {
        return this.other3Value;
    }

    /**
     * Setter for other3Value
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther3Value(string value) {
        this.other3Value = value;
    }


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The unique ID of the tax authority of this return.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The unique ID of the tax authority of this return.
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private string taxAuthorityName;

    /**
     * Getter for taxAuthorityName
     *
     * The name of the tax authority of this return.
     */
    public string getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName
     *
     * The name of the tax authority of this return.
     */
    public void setTaxAuthorityName(string value) {
        this.taxAuthorityName = value;
    }


    private string taxAuthorityType;

    /**
     * Getter for taxAuthorityType
     *
     * The type description of the tax authority of this return.
     */
    public string getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType
     *
     * The type description of the tax authority of this return.
     */
    public void setTaxAuthorityType(string value) {
        this.taxAuthorityType = value;
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


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    /**
     * Returns a JSON string representation of FilingCalendarModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
