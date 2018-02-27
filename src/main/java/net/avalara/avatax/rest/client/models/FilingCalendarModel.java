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
 * Represents a commitment to file a tax return on a recurring basis.
* Only used if you subscribe to Avalara Returns.
 */
public class FilingCalendarModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing calendar.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this filing calendar.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which this filing calendar belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which this filing calendar belongs.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String returnName;

    /**
     * Getter for returnName
     *
     * DEPRECATED - The legacy return name of the tax form to file. Please use `taxFormCode` instead.
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName
     *
     * DEPRECATED - The legacy return name of the tax form to file. Please use `taxFormCode` instead.
     */
    public void setReturnName(String value) {
        this.returnName = value;
    }


    private String formCountry;

    /**
     * Getter for formCountry
     *
     * Name or ISO 3166 code identifying the country that issued the tax form for this filing calendar.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getFormCountry() {
        return this.formCountry;
    }

    /**
     * Setter for formCountry
     *
     * Name or ISO 3166 code identifying the country that issued the tax form for this filing calendar.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setFormCountry(String value) {
        this.formCountry = value;
    }


    private String formRegion;

    /**
     * Getter for formRegion
     *
     * Name or ISO 3166 code identifying the region that issued the tax form for this filing calendar.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public String getFormRegion() {
        return this.formRegion;
    }

    /**
     * Setter for formRegion
     *
     * Name or ISO 3166 code identifying the region that issued the tax form for this filing calendar.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setFormRegion(String value) {
        this.formRegion = value;
    }


    private String taxFormCode;

    /**
     * Getter for taxFormCode
     *
     * The Avalara standard tax form code of the tax form for this filing calendar. The first two characters of the tax form code
    * are the ISO 3166 country code of the country that issued this form.
     */
    public String getTaxFormCode() {
        return this.taxFormCode;
    }

    /**
     * Setter for taxFormCode
     *
     * The Avalara standard tax form code of the tax form for this filing calendar. The first two characters of the tax form code
    * are the ISO 3166 country code of the country that issued this form.
     */
    public void setTaxFormCode(String value) {
        this.taxFormCode = value;
    }


    private String locationCode;

    /**
     * Getter for locationCode
     *
     * If this calendar is for a location-specific tax return, specify the location code here. To file for all locations, leave this value NULL.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * If this calendar is for a location-specific tax return, specify the location code here. To file for all locations, leave this value NULL.
     */
    public void setLocationCode(String value) {
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


    private String paymentCurrency;

    /**
     * Getter for paymentCurrency
     *
     * Specify the ISO 4217 currency code for the currency to remit for this tax return. For all tax returns in the United States, specify "USD".
     */
    public String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    /**
     * Setter for paymentCurrency
     *
     * Specify the ISO 4217 currency code for the currency to remit for this tax return. For all tax returns in the United States, specify "USD".
     */
    public void setPaymentCurrency(String value) {
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


    private String stateRegistrationId;

    /**
     * Getter for stateRegistrationId
     *
     * Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public String getStateRegistrationId() {
        return this.stateRegistrationId;
    }

    /**
     * Setter for stateRegistrationId
     *
     * Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public void setStateRegistrationId(String value) {
        this.stateRegistrationId = value;
    }


    private String localRegistrationId;

    /**
     * Getter for localRegistrationId
     *
     * Tax Registration ID for the local jurisdiction, if any.
     */
    public String getLocalRegistrationId() {
        return this.localRegistrationId;
    }

    /**
     * Setter for localRegistrationId
     *
     * Tax Registration ID for the local jurisdiction, if any.
     */
    public void setLocalRegistrationId(String value) {
        this.localRegistrationId = value;
    }


    private String employerIdentificationNumber;

    /**
     * Getter for employerIdentificationNumber
     *
     * The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public String getEmployerIdentificationNumber() {
        return this.employerIdentificationNumber;
    }

    /**
     * Setter for employerIdentificationNumber
     *
     * The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public void setEmployerIdentificationNumber(String value) {
        this.employerIdentificationNumber = value;
    }


    private String line1;

    /**
     * Getter for line1
     *
     * DEPRECATED - The first line of the mailing address that will be used when filling out this tax return.
    * Field will be no longer be available after the 17.9 release.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1
     *
     * DEPRECATED - The first line of the mailing address that will be used when filling out this tax return.
    * Field will be no longer be available after the 17.9 release.
     */
    public void setLine1(String value) {
        this.line1 = value;
    }


    private String line2;

    /**
     * Getter for line2
     *
     * DEPRECATED - The second line of the mailing address that will be used when filling out this tax return.
    * Please note that some tax forms do not support multiple address lines.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2
     *
     * DEPRECATED - The second line of the mailing address that will be used when filling out this tax return.
    * Please note that some tax forms do not support multiple address lines.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public void setLine2(String value) {
        this.line2 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * DEPRECATED - The city name of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * DEPRECATED - The city name of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * DEPRECATED - The state, region, or province of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * DEPRECATED - The state, region, or province of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * DEPRECATED - The postal code or zip code of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * DEPRECATED - The postal code or zip code of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * DEPRECATED - The two character ISO-3166 country code of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * DEPRECATED - The two character ISO-3166 country code of the mailing address that will be used when filling out this tax return.
    * 
    * Field will be no longer be available after the 17.9 release.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String mailingAddressLine1;

    /**
     * Getter for mailingAddressLine1
     *
     * The first line of the mailing address that will be used when filling out this tax return.
     */
    public String getMailingAddressLine1() {
        return this.mailingAddressLine1;
    }

    /**
     * Setter for mailingAddressLine1
     *
     * The first line of the mailing address that will be used when filling out this tax return.
     */
    public void setMailingAddressLine1(String value) {
        this.mailingAddressLine1 = value;
    }


    private String mailingAddressLine2;

    /**
     * Getter for mailingAddressLine2
     *
     * The second line of the mailing address that will be used when filling out this tax return.
    * Please note that some tax forms do not support multiple address lines.
     */
    public String getMailingAddressLine2() {
        return this.mailingAddressLine2;
    }

    /**
     * Setter for mailingAddressLine2
     *
     * The second line of the mailing address that will be used when filling out this tax return.
    * Please note that some tax forms do not support multiple address lines.
     */
    public void setMailingAddressLine2(String value) {
        this.mailingAddressLine2 = value;
    }


    private String mailingAddressCity;

    /**
     * Getter for mailingAddressCity
     *
     * The city name of the mailing address that will be used when filling out this tax return.
     */
    public String getMailingAddressCity() {
        return this.mailingAddressCity;
    }

    /**
     * Setter for mailingAddressCity
     *
     * The city name of the mailing address that will be used when filling out this tax return.
     */
    public void setMailingAddressCity(String value) {
        this.mailingAddressCity = value;
    }


    private String mailingAddressRegion;

    /**
     * Getter for mailingAddressRegion
     *
     * Name or ISO 3166 code identifying the region of the mailing address that will be used when filling out this tax return.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public String getMailingAddressRegion() {
        return this.mailingAddressRegion;
    }

    /**
     * Setter for mailingAddressRegion
     *
     * Name or ISO 3166 code identifying the region of the mailing address that will be used when filling out this tax return.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setMailingAddressRegion(String value) {
        this.mailingAddressRegion = value;
    }


    private String mailingAddressPostalCode;

    /**
     * Getter for mailingAddressPostalCode
     *
     * The postal code or zip code of the mailing address that will be used when filling out this tax return.
     */
    public String getMailingAddressPostalCode() {
        return this.mailingAddressPostalCode;
    }

    /**
     * Setter for mailingAddressPostalCode
     *
     * The postal code or zip code of the mailing address that will be used when filling out this tax return.
     */
    public void setMailingAddressPostalCode(String value) {
        this.mailingAddressPostalCode = value;
    }


    private String mailingAddressCountry;

    /**
     * Getter for mailingAddressCountry
     *
     * Name or ISO 3166 code identifying the country of the mailing address that will be used when filling out this tax return.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getMailingAddressCountry() {
        return this.mailingAddressCountry;
    }

    /**
     * Setter for mailingAddressCountry
     *
     * Name or ISO 3166 code identifying the country of the mailing address that will be used when filling out this tax return.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setMailingAddressCountry(String value) {
        this.mailingAddressCountry = value;
    }


    private String phone;

    /**
     * Getter for phone
     *
     * The phone number to be used when filing this return.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone
     *
     * The phone number to be used when filing this return.
     */
    public void setPhone(String value) {
        this.phone = value;
    }


    private String customerFilingInstructions;

    /**
     * Getter for customerFilingInstructions
     *
     * Special filing instructions to be used when filing this return.
    * Please note that requesting special filing instructions may incur additional costs.
     */
    public String getCustomerFilingInstructions() {
        return this.customerFilingInstructions;
    }

    /**
     * Setter for customerFilingInstructions
     *
     * Special filing instructions to be used when filing this return.
    * Please note that requesting special filing instructions may incur additional costs.
     */
    public void setCustomerFilingInstructions(String value) {
        this.customerFilingInstructions = value;
    }


    private String legalEntityName;

    /**
     * Getter for legalEntityName
     *
     * The legal entity name to be used when filing this return.
     */
    public String getLegalEntityName() {
        return this.legalEntityName;
    }

    /**
     * Setter for legalEntityName
     *
     * The legal entity name to be used when filing this return.
     */
    public void setLegalEntityName(String value) {
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


    private String eFileUsername;

    /**
     * Getter for eFileUsername
     *
     * If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public String getEFileUsername() {
        return this.eFileUsername;
    }

    /**
     * Setter for eFileUsername
     *
     * If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public void setEFileUsername(String value) {
        this.eFileUsername = value;
    }


    private String eFilePassword;

    /**
     * Getter for eFilePassword
     *
     * If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public String getEFilePassword() {
        return this.eFilePassword;
    }

    /**
     * Setter for eFilePassword
     *
     * If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public void setEFilePassword(String value) {
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


    private String internalNotes;

    /**
     * Getter for internalNotes
     *
     * Internal filing notes.
     */
    public String getInternalNotes() {
        return this.internalNotes;
    }

    /**
     * Setter for internalNotes
     *
     * Internal filing notes.
     */
    public void setInternalNotes(String value) {
        this.internalNotes = value;
    }


    private String alSignOn;

    /**
     * Getter for alSignOn
     *
     * Custom filing information field for Alabama.
     */
    public String getAlSignOn() {
        return this.alSignOn;
    }

    /**
     * Setter for alSignOn
     *
     * Custom filing information field for Alabama.
     */
    public void setAlSignOn(String value) {
        this.alSignOn = value;
    }


    private String alAccessCode;

    /**
     * Getter for alAccessCode
     *
     * Custom filing information field for Alabama.
     */
    public String getAlAccessCode() {
        return this.alAccessCode;
    }

    /**
     * Setter for alAccessCode
     *
     * Custom filing information field for Alabama.
     */
    public void setAlAccessCode(String value) {
        this.alAccessCode = value;
    }


    private String meBusinessCode;

    /**
     * Getter for meBusinessCode
     *
     * Custom filing information field for Maine.
     */
    public String getMeBusinessCode() {
        return this.meBusinessCode;
    }

    /**
     * Setter for meBusinessCode
     *
     * Custom filing information field for Maine.
     */
    public void setMeBusinessCode(String value) {
        this.meBusinessCode = value;
    }


    private String iaBen;

    /**
     * Getter for iaBen
     *
     * Custom filing information field for Iowa.
     */
    public String getIaBen() {
        return this.iaBen;
    }

    /**
     * Setter for iaBen
     *
     * Custom filing information field for Iowa.
     */
    public void setIaBen(String value) {
        this.iaBen = value;
    }


    private String ctReg;

    /**
     * Getter for ctReg
     *
     * Custom filing information field for Connecticut.
     */
    public String getCtReg() {
        return this.ctReg;
    }

    /**
     * Setter for ctReg
     *
     * Custom filing information field for Connecticut.
     */
    public void setCtReg(String value) {
        this.ctReg = value;
    }


    private String other1Name;

    /**
     * Getter for other1Name
     *
     * Custom filing information field. Leave blank.
     */
    public String getOther1Name() {
        return this.other1Name;
    }

    /**
     * Setter for other1Name
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther1Name(String value) {
        this.other1Name = value;
    }


    private String other1Value;

    /**
     * Getter for other1Value
     *
     * Custom filing information field. Leave blank.
     */
    public String getOther1Value() {
        return this.other1Value;
    }

    /**
     * Setter for other1Value
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther1Value(String value) {
        this.other1Value = value;
    }


    private String other2Name;

    /**
     * Getter for other2Name
     *
     * Custom filing information field. Leave blank.
     */
    public String getOther2Name() {
        return this.other2Name;
    }

    /**
     * Setter for other2Name
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther2Name(String value) {
        this.other2Name = value;
    }


    private String other2Value;

    /**
     * Getter for other2Value
     *
     * Custom filing information field. Leave blank.
     */
    public String getOther2Value() {
        return this.other2Value;
    }

    /**
     * Setter for other2Value
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther2Value(String value) {
        this.other2Value = value;
    }


    private String other3Name;

    /**
     * Getter for other3Name
     *
     * Custom filing information field. Leave blank.
     */
    public String getOther3Name() {
        return this.other3Name;
    }

    /**
     * Setter for other3Name
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther3Name(String value) {
        this.other3Name = value;
    }


    private String other3Value;

    /**
     * Getter for other3Value
     *
     * Custom filing information field. Leave blank.
     */
    public String getOther3Value() {
        return this.other3Value;
    }

    /**
     * Setter for other3Value
     *
     * Custom filing information field. Leave blank.
     */
    public void setOther3Value(String value) {
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


    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName
     *
     * The name of the tax authority of this return.
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName
     *
     * The name of the tax authority of this return.
     */
    public void setTaxAuthorityName(String value) {
        this.taxAuthorityName = value;
    }


    private String taxAuthorityType;

    /**
     * Getter for taxAuthorityType
     *
     * The type description of the tax authority of this return.
     */
    public String getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType
     *
     * The type description of the tax authority of this return.
     */
    public void setTaxAuthorityType(String value) {
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
