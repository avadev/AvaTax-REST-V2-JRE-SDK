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
     * Getter for other1Name - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getOther1Name() {
        return this.other1Name;
    }

    /**
     * Setter for other1Name - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOther1Name(String other1Name) {
        this.other1Name = other1Name;
    }

    
    private String paymentCurrency;

    /**
     * Getter for paymentCurrency - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    /**
     * Setter for paymentCurrency - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    
    private String city;

    /**
     * Getter for city - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String eFileUsername;

    /**
     * Getter for eFileUsername - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getEFileUsername() {
        return this.eFileUsername;
    }

    /**
     * Setter for eFileUsername - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEFileUsername(String eFileUsername) {
        this.eFileUsername = eFileUsername;
    }

    
    private String other2Name;

    /**
     * Getter for other2Name - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getOther2Name() {
        return this.other2Name;
    }

    /**
     * Setter for other2Name - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOther2Name(String other2Name) {
        this.other2Name = other2Name;
    }

    
    private Byte prepayPercentage;

    /**
     * Getter for prepayPercentage - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Byte getPrepayPercentage() {
        return this.prepayPercentage;
    }

    /**
     * Setter for prepayPercentage - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setPrepayPercentage(Byte prepayPercentage) {
        this.prepayPercentage = prepayPercentage;
    }

    
    private String other1Value;

    /**
     * Getter for other1Value - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getOther1Value() {
        return this.other1Value;
    }

    /**
     * Setter for other1Value - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOther1Value(String other1Value) {
        this.other1Value = other1Value;
    }

    
    private String alSignOn;

    /**
     * Getter for alSignOn - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getAlSignOn() {
        return this.alSignOn;
    }

    /**
     * Setter for alSignOn - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setAlSignOn(String alSignOn) {
        this.alSignOn = alSignOn;
    }

    
    private String employerIdentificationNumber;

    /**
     * Getter for employerIdentificationNumber - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getEmployerIdentificationNumber() {
        return this.employerIdentificationNumber;
    }

    /**
     * Setter for employerIdentificationNumber - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
        this.employerIdentificationNumber = employerIdentificationNumber;
    }

    
    private String legalEntityName;

    /**
     * Getter for legalEntityName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getLegalEntityName() {
        return this.legalEntityName;
    }

    /**
     * Setter for legalEntityName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setLegalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }

    
    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxTypeId(MatchingTaxType taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxAuthorityName(String taxAuthorityName) {
        this.taxAuthorityName = taxAuthorityName;
    }

    
    private String returnName;

    /**
     * Getter for returnName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    
    private OutletTypeId outletTypeId;

    /**
     * Getter for outletTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public OutletTypeId getOutletTypeId() {
        return this.outletTypeId;
    }

    /**
     * Setter for outletTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOutletTypeId(OutletTypeId outletTypeId) {
        this.outletTypeId = outletTypeId;
    }

    
    private String other3Value;

    /**
     * Getter for other3Value - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getOther3Value() {
        return this.other3Value;
    }

    /**
     * Setter for other3Value - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOther3Value(String other3Value) {
        this.other3Value = other3Value;
    }

    
    private String taxAuthorityType;

    /**
     * Getter for taxAuthorityType - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxAuthorityType(String taxAuthorityType) {
        this.taxAuthorityType = taxAuthorityType;
    }

    
    private String alAccessCode;

    /**
     * Getter for alAccessCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getAlAccessCode() {
        return this.alAccessCode;
    }

    /**
     * Setter for alAccessCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setAlAccessCode(String alAccessCode) {
        this.alAccessCode = alAccessCode;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String ctReg;

    /**
     * Getter for ctReg - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getCtReg() {
        return this.ctReg;
    }

    /**
     * Setter for ctReg - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCtReg(String ctReg) {
        this.ctReg = ctReg;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private String iaBen;

    /**
     * Getter for iaBen - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getIaBen() {
        return this.iaBen;
    }

    /**
     * Setter for iaBen - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setIaBen(String iaBen) {
        this.iaBen = iaBen;
    }

    
    private FilingTypeId filingTypeId;

    /**
     * Getter for filingTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public FilingTypeId getFilingTypeId() {
        return this.filingTypeId;
    }

    /**
     * Setter for filingTypeId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setFilingTypeId(FilingTypeId filingTypeId) {
        this.filingTypeId = filingTypeId;
    }

    
    private String country;

    /**
     * Getter for country - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String other3Name;

    /**
     * Getter for other3Name - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getOther3Name() {
        return this.other3Name;
    }

    /**
     * Setter for other3Name - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOther3Name(String other3Name) {
        this.other3Name = other3Name;
    }

    
    private String internalNotes;

    /**
     * Getter for internalNotes - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getInternalNotes() {
        return this.internalNotes;
    }

    /**
     * Setter for internalNotes - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setInternalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
    }

    
    private String line1;

    /**
     * Getter for line1 - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String eFilePassword;

    /**
     * Getter for eFilePassword - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getEFilePassword() {
        return this.eFilePassword;
    }

    /**
     * Setter for eFilePassword - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEFilePassword(String eFilePassword) {
        this.eFilePassword = eFilePassword;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private Long id;

    /**
     * Getter for id - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String meBusinessCode;

    /**
     * Getter for meBusinessCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getMeBusinessCode() {
        return this.meBusinessCode;
    }

    /**
     * Setter for meBusinessCode - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setMeBusinessCode(String meBusinessCode) {
        this.meBusinessCode = meBusinessCode;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String localRegistrationId;

    /**
     * Getter for localRegistrationId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getLocalRegistrationId() {
        return this.localRegistrationId;
    }

    /**
     * Setter for localRegistrationId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setLocalRegistrationId(String localRegistrationId) {
        this.localRegistrationId = localRegistrationId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setFilingFrequencyId(FilingFrequencyId filingFrequencyId) {
        this.filingFrequencyId = filingFrequencyId;
    }

    
    private String line2;

    /**
     * Getter for line2 - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private String stateRegistrationId;

    /**
     * Getter for stateRegistrationId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getStateRegistrationId() {
        return this.stateRegistrationId;
    }

    /**
     * Setter for stateRegistrationId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setStateRegistrationId(String stateRegistrationId) {
        this.stateRegistrationId = stateRegistrationId;
    }

    
    private String other2Value;

    /**
     * Getter for other2Value - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getOther2Value() {
        return this.other2Value;
    }

    /**
     * Setter for other2Value - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setOther2Value(String other2Value) {
        this.other2Value = other2Value;
    }

    
    private String customerFilingInstructions;

    /**
     * Getter for customerFilingInstructions - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getCustomerFilingInstructions() {
        return this.customerFilingInstructions;
    }

    /**
     * Setter for customerFilingInstructions - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCustomerFilingInstructions(String customerFilingInstructions) {
        this.customerFilingInstructions = customerFilingInstructions;
    }

    
    private Short months;

    /**
     * Getter for months - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Short getMonths() {
        return this.months;
    }

    /**
     * Setter for months - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setMonths(Short months) {
        this.months = months;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String phone;

    /**
     * Getter for phone - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
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
    