package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a commitment to file a tax return on a recurring basis.
            Only used if you subscribe to Avalara Returns.
 */
public class FilingCalendarModel {
    private String other1Name;

    /**
     * Getter for other1Name - Custom filing information field.  Leave blank.
     */
    public String getOther1Name() {
        return this.other1Name;
    }

    /**
     * Setter for other1Name - Custom filing information field.  Leave blank.
     */
    public void setOther1Name(String other1Name) {
        this.other1Name = other1Name;
    }

    
    private String paymentCurrency;

    /**
     * Getter for paymentCurrency - Specify the ISO 4217 currency code for the currency to remit for this tax return.  For all tax returns in the United States, specify "USD".
     */
    public String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    /**
     * Setter for paymentCurrency - Specify the ISO 4217 currency code for the currency to remit for this tax return.  For all tax returns in the United States, specify "USD".
     */
    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    
    private String city;

    /**
     * Getter for city - The city name of the physical address to be used when filing this tax return.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - The city name of the physical address to be used when filing this tax return.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String eFileUsername;

    /**
     * Getter for eFileUsername - If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public String getEFileUsername() {
        return this.eFileUsername;
    }

    /**
     * Setter for eFileUsername - If you file electronically, this is the username you use to log in to the tax authority's website.
     */
    public void setEFileUsername(String eFileUsername) {
        this.eFileUsername = eFileUsername;
    }

    
    private String other2Name;

    /**
     * Getter for other2Name - Custom filing information field.  Leave blank.
     */
    public String getOther2Name() {
        return this.other2Name;
    }

    /**
     * Setter for other2Name - Custom filing information field.  Leave blank.
     */
    public void setOther2Name(String other2Name) {
        this.other2Name = other2Name;
    }

    
    private Integer prepayPercentage;

    /**
     * Getter for prepayPercentage - If you are required to prepay a percentage of taxes for future periods, please specify the percentage in whole numbers; 
            for example, the value 90 would indicate 90%.
     */
    public Integer getPrepayPercentage() {
        return this.prepayPercentage;
    }

    /**
     * Setter for prepayPercentage - If you are required to prepay a percentage of taxes for future periods, please specify the percentage in whole numbers; 
            for example, the value 90 would indicate 90%.
     */
    public void setPrepayPercentage(Integer prepayPercentage) {
        this.prepayPercentage = prepayPercentage;
    }

    
    private String other1Value;

    /**
     * Getter for other1Value - Custom filing information field.  Leave blank.
     */
    public String getOther1Value() {
        return this.other1Value;
    }

    /**
     * Setter for other1Value - Custom filing information field.  Leave blank.
     */
    public void setOther1Value(String other1Value) {
        this.other1Value = other1Value;
    }

    
    private String alSignOn;

    /**
     * Getter for alSignOn - Custom filing information field for Alabama.
     */
    public String getAlSignOn() {
        return this.alSignOn;
    }

    /**
     * Setter for alSignOn - Custom filing information field for Alabama.
     */
    public void setAlSignOn(String alSignOn) {
        this.alSignOn = alSignOn;
    }

    
    private String employerIdentificationNumber;

    /**
     * Getter for employerIdentificationNumber - The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public String getEmployerIdentificationNumber() {
        return this.employerIdentificationNumber;
    }

    /**
     * Setter for employerIdentificationNumber - The Employer Identification Number or Taxpayer Identification Number that is to be used when filing this return.
     */
    public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
        this.employerIdentificationNumber = employerIdentificationNumber;
    }

    
    private String legalEntityName;

    /**
     * Getter for legalEntityName - The legal entity name to be used when filing this return.
     */
    public String getLegalEntityName() {
        return this.legalEntityName;
    }

    /**
     * Setter for legalEntityName - The legal entity name to be used when filing this return.
     */
    public void setLegalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }

    
    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId - The type of tax to report on this return.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - The type of tax to report on this return.
     */
    public void setTaxTypeId(MatchingTaxType taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - The last date for the tax period when this return should be filed.
            This date specifies the last date for tax transactions that should be reported on this filing calendar.
            Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - The last date for the tax period when this return should be filed.
            This date specifies the last date for tax transactions that should be reported on this filing calendar.
            Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName - The name of the tax authority of this return.
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName - The name of the tax authority of this return.
     */
    public void setTaxAuthorityName(String taxAuthorityName) {
        this.taxAuthorityName = taxAuthorityName;
    }

    
    private String returnName;

    /**
     * Getter for returnName - The name of the tax form to file.
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - The name of the tax form to file.
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    
    private OutletTypeId outletTypeId;

    /**
     * Getter for outletTypeId - If this calendar is for a location-specific tax return, specify the location-specific behavior here.
     */
    public OutletTypeId getOutletTypeId() {
        return this.outletTypeId;
    }

    /**
     * Setter for outletTypeId - If this calendar is for a location-specific tax return, specify the location-specific behavior here.
     */
    public void setOutletTypeId(OutletTypeId outletTypeId) {
        this.outletTypeId = outletTypeId;
    }

    
    private String other3Value;

    /**
     * Getter for other3Value - Custom filing information field.  Leave blank.
     */
    public String getOther3Value() {
        return this.other3Value;
    }

    /**
     * Setter for other3Value - Custom filing information field.  Leave blank.
     */
    public void setOther3Value(String other3Value) {
        this.other3Value = other3Value;
    }

    
    private String taxAuthorityType;

    /**
     * Getter for taxAuthorityType - The type description of the tax authority of this return.
     */
    public String getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType - The type description of the tax authority of this return.
     */
    public void setTaxAuthorityType(String taxAuthorityType) {
        this.taxAuthorityType = taxAuthorityType;
    }

    
    private String alAccessCode;

    /**
     * Getter for alAccessCode - Custom filing information field for Alabama.
     */
    public String getAlAccessCode() {
        return this.alAccessCode;
    }

    /**
     * Setter for alAccessCode - Custom filing information field for Alabama.
     */
    public void setAlAccessCode(String alAccessCode) {
        this.alAccessCode = alAccessCode;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String ctReg;

    /**
     * Getter for ctReg - Custom filing information field for Connecticut.
     */
    public String getCtReg() {
        return this.ctReg;
    }

    /**
     * Setter for ctReg - Custom filing information field for Connecticut.
     */
    public void setCtReg(String ctReg) {
        this.ctReg = ctReg;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - If this calendar is for a location-specific tax return, specify the location code here.  To file for all locations, leave this value NULL.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - If this calendar is for a location-specific tax return, specify the location code here.  To file for all locations, leave this value NULL.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private String iaBen;

    /**
     * Getter for iaBen - Custom filing information field for Iowa.
     */
    public String getIaBen() {
        return this.iaBen;
    }

    /**
     * Setter for iaBen - Custom filing information field for Iowa.
     */
    public void setIaBen(String iaBen) {
        this.iaBen = iaBen;
    }

    
    private FilingTypeId filingTypeId;

    /**
     * Getter for filingTypeId - The method to be used when filing this return.
     */
    public FilingTypeId getFilingTypeId() {
        return this.filingTypeId;
    }

    /**
     * Setter for filingTypeId - The method to be used when filing this return.
     */
    public void setFilingTypeId(FilingTypeId filingTypeId) {
        this.filingTypeId = filingTypeId;
    }

    
    private String country;

    /**
     * Getter for country - The two character ISO-3166 country code of the physical address to be used when filing this return.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The two character ISO-3166 country code of the physical address to be used when filing this return.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String other3Name;

    /**
     * Getter for other3Name - Custom filing information field.  Leave blank.
     */
    public String getOther3Name() {
        return this.other3Name;
    }

    /**
     * Setter for other3Name - Custom filing information field.  Leave blank.
     */
    public void setOther3Name(String other3Name) {
        this.other3Name = other3Name;
    }

    
    private String internalNotes;

    /**
     * Getter for internalNotes - Internal filing notes.
     */
    public String getInternalNotes() {
        return this.internalNotes;
    }

    /**
     * Setter for internalNotes - Internal filing notes.
     */
    public void setInternalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
    }

    
    private String line1;

    /**
     * Getter for line1 - The first line of the physical address to be used when filing this tax return.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - The first line of the physical address to be used when filing this tax return.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String eFilePassword;

    /**
     * Getter for eFilePassword - If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public String getEFilePassword() {
        return this.eFilePassword;
    }

    /**
     * Setter for eFilePassword - If you file electronically, this is the password or pass code you use to log in to the tax authority's website.
     */
    public void setEFilePassword(String eFilePassword) {
        this.eFilePassword = eFilePassword;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - The postal code or zip code of the physical address to be used when filing this tax return.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - The postal code or zip code of the physical address to be used when filing this tax return.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this filing calendar.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this filing calendar.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String meBusinessCode;

    /**
     * Getter for meBusinessCode - Custom filing information field for Maine.
     */
    public String getMeBusinessCode() {
        return this.meBusinessCode;
    }

    /**
     * Setter for meBusinessCode - Custom filing information field for Maine.
     */
    public void setMeBusinessCode(String meBusinessCode) {
        this.meBusinessCode = meBusinessCode;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - The unique ID of the tax authority of this return.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - The unique ID of the tax authority of this return.
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String localRegistrationId;

    /**
     * Getter for localRegistrationId - Tax Registration ID for the local jurisdiction, if any.
     */
    public String getLocalRegistrationId() {
        return this.localRegistrationId;
    }

    /**
     * Setter for localRegistrationId - Tax Registration ID for the local jurisdiction, if any.
     */
    public void setLocalRegistrationId(String localRegistrationId) {
        this.localRegistrationId = localRegistrationId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - The earliest date for the tax period when this return should be filed.
            This date specifies the earliest date for tax transactions that should be reported on this filing calendar.
            Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - The earliest date for the tax period when this return should be filed.
            This date specifies the earliest date for tax transactions that should be reported on this filing calendar.
            Please note that tax is usually filed one month in arrears: for example, tax for January transactions is typically filed during the month of February.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - The state, region, or province of the physical address to be used when filing this tax return.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The state, region, or province of the physical address to be used when filing this tax return.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId - The frequency on which this tax form is filed.
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId - The frequency on which this tax form is filed.
     */
    public void setFilingFrequencyId(FilingFrequencyId filingFrequencyId) {
        this.filingFrequencyId = filingFrequencyId;
    }

    
    private String line2;

    /**
     * Getter for line2 - The second line of the physical address to be used when filing this tax return.
            Please note that some tax forms do not support multiple address lines.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - The second line of the physical address to be used when filing this tax return.
            Please note that some tax forms do not support multiple address lines.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private String stateRegistrationId;

    /**
     * Getter for stateRegistrationId - Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public String getStateRegistrationId() {
        return this.stateRegistrationId;
    }

    /**
     * Setter for stateRegistrationId - Tax Registration ID for this Region - in the U.S., this is for your state.
     */
    public void setStateRegistrationId(String stateRegistrationId) {
        this.stateRegistrationId = stateRegistrationId;
    }

    
    private String other2Value;

    /**
     * Getter for other2Value - Custom filing information field.  Leave blank.
     */
    public String getOther2Value() {
        return this.other2Value;
    }

    /**
     * Setter for other2Value - Custom filing information field.  Leave blank.
     */
    public void setOther2Value(String other2Value) {
        this.other2Value = other2Value;
    }

    
    private String customerFilingInstructions;

    /**
     * Getter for customerFilingInstructions - Special filing instructions to be used when filing this return.
            Please note that requesting special filing instructions may incur additional costs.
     */
    public String getCustomerFilingInstructions() {
        return this.customerFilingInstructions;
    }

    /**
     * Setter for customerFilingInstructions - Special filing instructions to be used when filing this return.
            Please note that requesting special filing instructions may incur additional costs.
     */
    public void setCustomerFilingInstructions(String customerFilingInstructions) {
        this.customerFilingInstructions = customerFilingInstructions;
    }

    
    private Integer months;

    /**
     * Getter for months - A 16-bit bitmap containing a 1 for each month when the return should be filed.
     */
    public Integer getMonths() {
        return this.months;
    }

    /**
     * Setter for months - A 16-bit bitmap containing a 1 for each month when the return should be filed.
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company to which this filing calendar belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company to which this filing calendar belongs.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String phone;

    /**
     * Getter for phone - The phone number to be used when filing this return.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone - The phone number to be used when filing this return.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of FilingCalendarModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    