package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Create a transaction
 */
public class CreateTransactionModel {
    private ServiceMode serviceMode;

    /**
     * Getter for serviceMode - Create a transaction
     */
    public ServiceMode getServiceMode() {
        return this.serviceMode;
    }

    /**
     * Setter for serviceMode - Create a transaction
     */
    public void setServiceMode(ServiceMode serviceMode) {
        this.serviceMode = serviceMode;
    }

    
    private String batchCode;

    /**
     * Getter for batchCode - Create a transaction
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode - Create a transaction
     */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - Create a transaction
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - Create a transaction
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private Boolean commit;

    /**
     * Getter for commit - Create a transaction
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit - Create a transaction
     */
    public void setCommit(Boolean commit) {
        this.commit = commit;
    }

    
    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode - Create a transaction
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode - Create a transaction
     */
    public void setReportingLocationCode(String reportingLocationCode) {
        this.reportingLocationCode = reportingLocationCode;
    }

    
    private String email;

    /**
     * Getter for email - Create a transaction
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Create a transaction
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride - Create a transaction
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride - Create a transaction
     */
    public void setTaxOverride(TaxOverrideModel taxOverride) {
        this.taxOverride = taxOverride;
    }

    
    private String description;

    /**
     * Getter for description - Create a transaction
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Create a transaction
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String posLaneCode;

    /**
     * Getter for posLaneCode - Create a transaction
     */
    public String getPosLaneCode() {
        return this.posLaneCode;
    }

    /**
     * Setter for posLaneCode - Create a transaction
     */
    public void setPosLaneCode(String posLaneCode) {
        this.posLaneCode = posLaneCode;
    }

    
    private TaxDebugLevel debugLevel;

    /**
     * Getter for debugLevel - Create a transaction
     */
    public TaxDebugLevel getDebugLevel() {
        return this.debugLevel;
    }

    /**
     * Setter for debugLevel - Create a transaction
     */
    public void setDebugLevel(TaxDebugLevel debugLevel) {
        this.debugLevel = debugLevel;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Create a transaction
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Create a transaction
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo - Create a transaction
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo - Create a transaction
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    
    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo - Create a transaction
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo - Create a transaction
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    
    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate - Create a transaction
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate - Create a transaction
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    
    private String customerCode;

    /**
     * Getter for customerCode - Create a transaction
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode - Create a transaction
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    
    private String code;

    /**
     * Getter for code - Create a transaction
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - Create a transaction
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String exemptionNo;

    /**
     * Getter for exemptionNo - Create a transaction
     */
    public String getExemptionNo() {
        return this.exemptionNo;
    }

    /**
     * Setter for exemptionNo - Create a transaction
     */
    public void setExemptionNo(String exemptionNo) {
        this.exemptionNo = exemptionNo;
    }

    
    private String referenceCode;

    /**
     * Getter for referenceCode - Create a transaction
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode - Create a transaction
     */
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    
    private Date exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate - Create a transaction
     */
    public Date getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate - Create a transaction
     */
    public void setExchangeRateEffectiveDate(Date exchangeRateEffectiveDate) {
        this.exchangeRateEffectiveDate = exchangeRateEffectiveDate;
    }

    
    private Date date;

    /**
     * Getter for date - Create a transaction
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date - Create a transaction
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord - Create a transaction
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord - Create a transaction
     */
    public void setIsSellerImporterOfRecord(Boolean isSellerImporterOfRecord) {
        this.isSellerImporterOfRecord = isSellerImporterOfRecord;
    }

    
    private String currencyCode;

    /**
     * Getter for currencyCode - Create a transaction
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode - Create a transaction
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    
    private String salespersonCode;

    /**
     * Getter for salespersonCode - Create a transaction
     */
    public String getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode - Create a transaction
     */
    public void setSalespersonCode(String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }

    
    private DocumentType type;

    /**
     * Getter for type - Create a transaction
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type - Create a transaction
     */
    public void setType(DocumentType type) {
        this.type = type;
    }

    
    private BigDecimal discount;

    /**
     * Getter for discount - Create a transaction
     */
    public BigDecimal getDiscount() {
        return this.discount;
    }

    /**
     * Setter for discount - Create a transaction
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    
    private ArrayList<LineItemModel> lines;

    /**
     * Getter for lines - Create a transaction
     */
    public ArrayList<LineItemModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines - Create a transaction
     */
    public void setLines(ArrayList<LineItemModel> lines) {
        this.lines = lines;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - Create a transaction
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - Create a transaction
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private AddressesModel addresses;

    /**
     * Getter for addresses - Create a transaction
     */
    public AddressesModel getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses - Create a transaction
     */
    public void setAddresses(AddressesModel addresses) {
        this.addresses = addresses;
    }

    


    /**
     * Returns a JSON string representation of CreateTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    