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


    private Int64 id;

    /**
     * Getter for id;
     * The unique ID number of this filing calendar.
     */
    public Int64 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this filing calendar.
     */
    public void setid(Int64 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company to which this filing calendar belongs.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company to which this filing calendar belongs.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String returnName;

    /**
     * Getter for returnName;
     * The name of the tax form to file.
     */
    public String getreturnName() {;
        return this.returnName;;
    }

    /**
     * Setter for returnName;
     * The name of the tax form to file.
     */
    public void setreturnName(String value) {;
        this.returnName = value;;
    }


    private String locationCode;

    /**
     * Getter for locationCode;
     * If this calendar is for a location-specific tax return, specify the location code here. To file for all locations, leave this value NULL.
     */
    public String getlocationCode() {;
        return this.locationCode;;
    }

    /**
     * Setter for locationCode;
     * If this calendar is for a location-specific tax return, specify the location code here. To file for all locations, leave this value NULL.
     */
    public void setlocationCode(String value) {;
        this.locationCode = value;;
    }


    private OutletTypeId? outletTypeId;

    /**
     * Getter for outletTypeId;
     * If this calendar is for a location-specific tax return, specify the location-specific behavior here.
     */
    public OutletTypeId? getoutletTypeId() {;
        return this.outletTypeId;;
    }

    /**
     * Setter for outletTypeId;
     * If this calendar is for a location-specific tax return, specify the location-specific behavior here.
     */
    public void setoutletTypeId(OutletTypeId? value) {;
        this.outletTypeId = value;;
    }


    private String paymentCurrency;

    /**
     * Getter for paymentCurrency;
     * Specify the ISO 4217 currency code for the currency to remit for this tax return. For all tax returns in the United States, specify "USD".
     */
    public String getpaymentCurrency() {;
        return this.paymentCurrency;;
    }

    /**
     * Setter for paymentCurrency;
     * Specify the ISO 4217 currency code for the currency to remit for this tax return. For all tax returns in the United States, specify "USD".
     */
    public void setpaymentCurrency(String value) {;
        this.paymentCurrency = value;;
    }


    private FilingFrequencyId? filingFrequencyId;

    /**
     * Getter for filingFrequencyId;
     * The frequency on which this tax form is filed.
     */
    public FilingFrequencyId? getfilingFrequencyId() {;
        return this.filingFrequencyId;;
    }

    /**
     * Setter for filingFrequencyId;
     * The frequency on which this tax form is filed.
     */
    public void setfilingFrequencyId(FilingFrequencyId? value) {;
        this.filingFrequencyId = value;;
    }


    private Int16? months;

    /**
     * Getter for months;
     * A 16-bit bitmap containing a 1 for each month when the return should be filed.
     */
    public Int16? getmonths() {;
        return this.months;;
    }

    /**
     * Setter for months;
     * A 16-bit bitmap containing a 1 for each month when the return should be filed.
     */
    public void setmonths(Int16? value) {;
        this.months = value;;
    }


    private String stateRegistrationId;

    /**
     * Getter for stateRegistrationId;
     * Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public String getstateRegistrationId() {;
        return this.stateRegistrationId;;
    }

    /**
     * Setter for stateRegistrationId;
     * Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public void setstateRegistrationId(String value) {;
        this.stateRegistrationId = value;;
    }


    private String localRegistrationId;

    /**
     * Getter for localRegistrationId;
     * Tax Registration ID for the local jurisdiction, if any.
     */
    public String getlocalRegistrationId() {;
        return this.localRegistrationId;;
    }

    /**
     * Setter for localRegistrationId;
     * Tax Registration ID for the local jurisdiction, if any.
     */
    public void setlocalRegistrationId(String value) {;
        this.localRegistrationId = value;;
    }


    private String employerIdentificationNumber;

    /**
     * Getter for employerIdentificationNumber;
     * The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public String getemployerIdentificationNumber() {;
        return this.employerIdentificationNumber;;
    }

    /**
     * Setter for employerIdentificationNumber;
     * The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public void setemployerIdentificationNumber(String value) {;
        this.employerIdentificationNumber = value;;
    }


    private String line1;

    /**
     * Getter for line1;
     * The first line of the physical address to be used when filing this tax return.
     */
    public String getline1() {;
        return this.line1;;
    }

    /**
     * Setter for line1;
     * The first line of the physical address to be used when filing this tax return.
     */
    public void setline1(String value) {;
        this.line1 = value;;
    }


    private String line2;

    /**
     * Getter for line2;
     * The second line of the physical address to be used when filing this tax return.
    * Please note that some tax forms do not support multiple address lines.
     */
    public String getline2() {;
        return this.line2;;
    }

    /**
     * Setter for line2;
     * The second line of the physical address to be used when filing this tax return.
    * Please note that some tax forms do not support multiple address lines.
     */
    public void setline2(String value) {;
        this.line2 = value;;
    }


    private String city;

    /**
     * Getter for city;
     * The city name of the physical address to be used when filing this tax return.
     */
    public String getcity() {;
        return this.city;;
    }

    /**
     * Setter for city;
     * The city name of the physical address to be used when filing this tax return.
     */
    public void setcity(String value) {;
        this.city = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The state, region, or province of the physical address to be used when filing this tax return.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The state, region, or province of the physical address to be used when filing this tax return.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * The postal code or zip code of the physical address to be used when filing this tax return.
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * The postal code or zip code of the physical address to be used when filing this tax return.
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two character ISO-3166 country code of the physical address to be used when filing this return.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two character ISO-3166 country code of the physical address to be used when filing this return.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String phone;

    /**
     * Getter for phone;
     * The phone number to be used when filing this return.
     */
    public String getphone() {;
        return this.phone;;
    }

    /**
     * Setter for phone;
     * The phone number to be used when filing this return.
     */
    public void setphone(String value) {;
        this.phone = value;;
    }


    private String customerFilingInstructions;

    /**
     * Getter for customerFilingInstructions;
     * Special filing instructions to be used when filing this return.
    * Please note that requesting special filing instructions may incur additional costs.
     */
    public String getcustomerFilingInstructions() {;
        return this.customerFilingInstructions;;
    }

    /**
     * Setter for customerFilingInstructions;
     * Special filing instructions to be used when filing this return.
    * Please note that requesting special filing instructions may incur additional costs.
     */
    public void setcustomerFilingInstructions(String value) {;
        this.customerFilingInstructions = value;;
    }


    private String legalEntityName;

    /**
     * Getter for legalEntityName;
     * The legal entity name to be used when filing this return.
     */
    public String getlegalEntityName() {;
        return this.legalEntityName;;
    }

    /**
     * Setter for legalEntityName;
     * The legal entity name to be used when filing this return.
     */
    public void setlegalEntityName(String value) {;
        this.legalEntityName = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The earliest date for the tax period when this return should be filed.
    * This date specifies the earliest date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The earliest date for the tax period when this return should be filed.
    * This date specifies the earliest date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * The last date for the tax period when this return should be filed.
    * This date specifies the last date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * The last date for the tax period when this return should be filed.
    * This date specifies the last date for tax transactions that should be reported on this filing calendar.
    * Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private FilingTypeId? filingTypeId;

    /**
     * Getter for filingTypeId;
     * The method to be used when filing this return.
     */
    public FilingTypeId? getfilingTypeId() {;
        return this.filingTypeId;;
    }

    /**
     * Setter for filingTypeId;
     * The method to be used when filing this return.
     */
    public void setfilingTypeId(FilingTypeId? value) {;
        this.filingTypeId = value;;
    }


    private String eFileUsername;

    /**
     * Getter for eFileUsername;
     * If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public String geteFileUsername() {;
        return this.eFileUsername;;
    }

    /**
     * Setter for eFileUsername;
     * If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public void seteFileUsername(String value) {;
        this.eFileUsername = value;;
    }


    private String eFilePassword;

    /**
     * Getter for eFilePassword;
     * If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public String geteFilePassword() {;
        return this.eFilePassword;;
    }

    /**
     * Setter for eFilePassword;
     * If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public void seteFilePassword(String value) {;
        this.eFilePassword = value;;
    }


    private Byte? prepayPercentage;

    /**
     * Getter for prepayPercentage;
     * If you are required to prepay a percentage of taxes for future periods, please specify the percentage in whole numbers; 
    * for example, the value 90 would indicate 90%.
     */
    public Byte? getprepayPercentage() {;
        return this.prepayPercentage;;
    }

    /**
     * Setter for prepayPercentage;
     * If you are required to prepay a percentage of taxes for future periods, please specify the percentage in whole numbers; 
    * for example, the value 90 would indicate 90%.
     */
    public void setprepayPercentage(Byte? value) {;
        this.prepayPercentage = value;;
    }


    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId;
     * The type of tax to report on this return.
     */
    public MatchingTaxType gettaxTypeId() {;
        return this.taxTypeId;;
    }

    /**
     * Setter for taxTypeId;
     * The type of tax to report on this return.
     */
    public void settaxTypeId(MatchingTaxType value) {;
        this.taxTypeId = value;;
    }


    private String internalNotes;

    /**
     * Getter for internalNotes;
     * Internal filing notes.
     */
    public String getinternalNotes() {;
        return this.internalNotes;;
    }

    /**
     * Setter for internalNotes;
     * Internal filing notes.
     */
    public void setinternalNotes(String value) {;
        this.internalNotes = value;;
    }


    private String alSignOn;

    /**
     * Getter for alSignOn;
     * Custom filing information field for Alabama.
     */
    public String getalSignOn() {;
        return this.alSignOn;;
    }

    /**
     * Setter for alSignOn;
     * Custom filing information field for Alabama.
     */
    public void setalSignOn(String value) {;
        this.alSignOn = value;;
    }


    private String alAccessCode;

    /**
     * Getter for alAccessCode;
     * Custom filing information field for Alabama.
     */
    public String getalAccessCode() {;
        return this.alAccessCode;;
    }

    /**
     * Setter for alAccessCode;
     * Custom filing information field for Alabama.
     */
    public void setalAccessCode(String value) {;
        this.alAccessCode = value;;
    }


    private String meBusinessCode;

    /**
     * Getter for meBusinessCode;
     * Custom filing information field for Maine.
     */
    public String getmeBusinessCode() {;
        return this.meBusinessCode;;
    }

    /**
     * Setter for meBusinessCode;
     * Custom filing information field for Maine.
     */
    public void setmeBusinessCode(String value) {;
        this.meBusinessCode = value;;
    }


    private String iaBen;

    /**
     * Getter for iaBen;
     * Custom filing information field for Iowa.
     */
    public String getiaBen() {;
        return this.iaBen;;
    }

    /**
     * Setter for iaBen;
     * Custom filing information field for Iowa.
     */
    public void setiaBen(String value) {;
        this.iaBen = value;;
    }


    private String ctReg;

    /**
     * Getter for ctReg;
     * Custom filing information field for Connecticut.
     */
    public String getctReg() {;
        return this.ctReg;;
    }

    /**
     * Setter for ctReg;
     * Custom filing information field for Connecticut.
     */
    public void setctReg(String value) {;
        this.ctReg = value;;
    }


    private String other1Name;

    /**
     * Getter for other1Name;
     * Custom filing information field. Leave blank.
     */
    public String getother1Name() {;
        return this.other1Name;;
    }

    /**
     * Setter for other1Name;
     * Custom filing information field. Leave blank.
     */
    public void setother1Name(String value) {;
        this.other1Name = value;;
    }


    private String other1Value;

    /**
     * Getter for other1Value;
     * Custom filing information field. Leave blank.
     */
    public String getother1Value() {;
        return this.other1Value;;
    }

    /**
     * Setter for other1Value;
     * Custom filing information field. Leave blank.
     */
    public void setother1Value(String value) {;
        this.other1Value = value;;
    }


    private String other2Name;

    /**
     * Getter for other2Name;
     * Custom filing information field. Leave blank.
     */
    public String getother2Name() {;
        return this.other2Name;;
    }

    /**
     * Setter for other2Name;
     * Custom filing information field. Leave blank.
     */
    public void setother2Name(String value) {;
        this.other2Name = value;;
    }


    private String other2Value;

    /**
     * Getter for other2Value;
     * Custom filing information field. Leave blank.
     */
    public String getother2Value() {;
        return this.other2Value;;
    }

    /**
     * Setter for other2Value;
     * Custom filing information field. Leave blank.
     */
    public void setother2Value(String value) {;
        this.other2Value = value;;
    }


    private String other3Name;

    /**
     * Getter for other3Name;
     * Custom filing information field. Leave blank.
     */
    public String getother3Name() {;
        return this.other3Name;;
    }

    /**
     * Setter for other3Name;
     * Custom filing information field. Leave blank.
     */
    public void setother3Name(String value) {;
        this.other3Name = value;;
    }


    private String other3Value;

    /**
     * Getter for other3Value;
     * Custom filing information field. Leave blank.
     */
    public String getother3Value() {;
        return this.other3Value;;
    }

    /**
     * Setter for other3Value;
     * Custom filing information field. Leave blank.
     */
    public void setother3Value(String value) {;
        this.other3Value = value;;
    }


    private Int32? taxAuthorityId;

    /**
     * Getter for taxAuthorityId;
     * The unique ID of the tax authority of this return.
     */
    public Int32? gettaxAuthorityId() {;
        return this.taxAuthorityId;;
    }

    /**
     * Setter for taxAuthorityId;
     * The unique ID of the tax authority of this return.
     */
    public void settaxAuthorityId(Int32? value) {;
        this.taxAuthorityId = value;;
    }


    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName;
     * The name of the tax authority of this return.
     */
    public String gettaxAuthorityName() {;
        return this.taxAuthorityName;;
    }

    /**
     * Setter for taxAuthorityName;
     * The name of the tax authority of this return.
     */
    public void settaxAuthorityName(String value) {;
        this.taxAuthorityName = value;;
    }


    private String taxAuthorityType;

    /**
     * Getter for taxAuthorityType;
     * The type description of the tax authority of this return.
     */
    public String gettaxAuthorityType() {;
        return this.taxAuthorityType;;
    }

    /**
     * Setter for taxAuthorityType;
     * The type description of the tax authority of this return.
     */
    public void settaxAuthorityType(String value) {;
        this.taxAuthorityType = value;;
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


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    /**
     * Returns a JSON string representation of FilingCalendarModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
