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
     * Getter for serviceMode - Specifies whether the tax calculation is handled Local, Remote, or Automatic (default)
     */
    public ServiceMode getServiceMode() {
        return this.serviceMode;
    }

    /**
     * Setter for serviceMode - Specifies whether the tax calculation is handled Local, Remote, or Automatic (default)
     */
    public void setServiceMode(ServiceMode serviceMode) {
        this.serviceMode = serviceMode;
    }

    
    private String batchCode;

    /**
     * Getter for batchCode - BatchCode for batch operations.
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode - BatchCode for batch operations.
     */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - Customer Usage Type - The client application customer or usage type.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - Customer Usage Type - The client application customer or usage type.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private Boolean commit;

    /**
     * Getter for commit - Causes the document to be committed if true.
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit - Causes the document to be committed if true.
     */
    public void setCommit(Boolean commit) {
        this.commit = commit;
    }

    
    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode - Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode - Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public void setReportingLocationCode(String reportingLocationCode) {
        this.reportingLocationCode = reportingLocationCode;
    }

    
    private String email;

    /**
     * Getter for email - Email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride - Specifies a tax override for the entire document
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride - Specifies a tax override for the entire document
     */
    public void setTaxOverride(TaxOverrideModel taxOverride) {
        this.taxOverride = taxOverride;
    }

    
    private String description;

    /**
     * Getter for description - Description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String posLaneCode;

    /**
     * Getter for posLaneCode - Sets the POS Lane Code sent by the User for this document.
     */
    public String getPosLaneCode() {
        return this.posLaneCode;
    }

    /**
     * Setter for posLaneCode - Sets the POS Lane Code sent by the User for this document.
     */
    public void setPosLaneCode(String posLaneCode) {
        this.posLaneCode = posLaneCode;
    }

    
    private TaxDebugLevel debugLevel;

    /**
     * Getter for debugLevel - If the user wishes to request additional debug information from this transaction, specify a level higher than 'normal'
     */
    public TaxDebugLevel getDebugLevel() {
        return this.debugLevel;
    }

    /**
     * Setter for debugLevel - If the user wishes to request additional debug information from this transaction, specify a level higher than 'normal'
     */
    public void setDebugLevel(TaxDebugLevel debugLevel) {
        this.debugLevel = debugLevel;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Company Code - Specify the code of the company creating this transaction here.  If you leave this value null,
                your account's default company will be used instead.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Company Code - Specify the code of the company creating this transaction here.  If you leave this value null,
                your account's default company will be used instead.
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo - BusinessIdentificationNo
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo - BusinessIdentificationNo
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    
    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo - Purchase Order Number for this document
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo - Purchase Order Number for this document
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    
    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate - Currency exchange rate from this transaction to the company base currency.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate - Currency exchange rate from this transaction to the company base currency.
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    
    private String customerCode;

    /**
     * Getter for customerCode - Customer Code - The client application customer reference code.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode - Customer Code - The client application customer reference code.
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    
    private String code;

    /**
     * Getter for code - Transaction Code - the internal reference code used by the client application.  This is used for operations such as
                Get, Adjust, Settle, and Void.  If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - Transaction Code - the internal reference code used by the client application.  This is used for operations such as
                Get, Adjust, Settle, and Void.  If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String exemptionNo;

    /**
     * Getter for exemptionNo - Exemption Number for this document
     */
    public String getExemptionNo() {
        return this.exemptionNo;
    }

    /**
     * Setter for exemptionNo - Exemption Number for this document
     */
    public void setExemptionNo(String exemptionNo) {
        this.exemptionNo = exemptionNo;
    }

    
    private String referenceCode;

    /**
     * Getter for referenceCode - Reference Code used to reference the original document for a return invoice
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode - Reference Code used to reference the original document for a return invoice
     */
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    
    private Date exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate - Effective date of the exchange rate.
     */
    public Date getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate - Effective date of the exchange rate.
     */
    public void setExchangeRateEffectiveDate(Date exchangeRateEffectiveDate) {
        this.exchangeRateEffectiveDate = exchangeRateEffectiveDate;
    }

    
    private Date date;

    /**
     * Getter for date - Transaction Date - The date on the invoice, purchase order, etc.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date - Transaction Date - The date on the invoice, purchase order, etc.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord - Specifies if the Transaction has the seller as IsSellerImporterOfRecord
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord - Specifies if the Transaction has the seller as IsSellerImporterOfRecord
     */
    public void setIsSellerImporterOfRecord(Boolean isSellerImporterOfRecord) {
        this.isSellerImporterOfRecord = isSellerImporterOfRecord;
    }

    
    private String currencyCode;

    /**
     * Getter for currencyCode - 3 character ISO 4217 currency code.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode - 3 character ISO 4217 currency code.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    
    private String salespersonCode;

    /**
     * Getter for salespersonCode - Salesperson Code - The client application salesperson reference code.
     */
    public String getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode - Salesperson Code - The client application salesperson reference code.
     */
    public void setSalespersonCode(String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }

    
    private DocumentType type;

    /**
     * Getter for type - Document Type
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type - Document Type
     */
    public void setType(DocumentType type) {
        this.type = type;
    }

    
    private BigDecimal discount;

    /**
     * Getter for discount - Discount - The discount amount to apply to the document.
     */
    public BigDecimal getDiscount() {
        return this.discount;
    }

    /**
     * Setter for discount - Discount - The discount amount to apply to the document.
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    
    private ArrayList<LineItemModel> lines;

    /**
     * Getter for lines - Document line items list
     */
    public ArrayList<LineItemModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines - Document line items list
     */
    public void setLines(ArrayList<LineItemModel> lines) {
        this.lines = lines;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - Special parameters for this transaction.
                To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - Special parameters for this transaction.
                To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private Date taxDate;

    /**
     * Getter for taxDate - Indicates the tax effectivity override date for the entire document.
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate - Indicates the tax effectivity override date for the entire document.
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    
    private HashMap<TransactionAddressType, AddressInfo> addresses;

    /**
     * Getter for addresses - Default addresses for all lines in this document
     */
    public HashMap<TransactionAddressType, AddressInfo> getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses - Default addresses for all lines in this document
     */
    public void setAddresses(HashMap<TransactionAddressType, AddressInfo> addresses) {
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
    