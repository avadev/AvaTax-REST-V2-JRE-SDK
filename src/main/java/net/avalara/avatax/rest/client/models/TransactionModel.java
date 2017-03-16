package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A single transaction - for example, a sales invoice or purchase order.
 */
public class TransactionModel {
    private ArrayList<AvaTaxMessage> messages;

    /**
     * Getter for messages - A single transaction - for example, a sales invoice or purchase order.
     */
    public ArrayList<AvaTaxMessage> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setMessages(ArrayList<AvaTaxMessage> messages) {
        this.messages = messages;
    }

    
    private String batchCode;

    /**
     * Getter for batchCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private ArrayList<TransactionModel> history;

    /**
     * Getter for history - A single transaction - for example, a sales invoice or purchase order.
     */
    public ArrayList<TransactionModel> getHistory() {
        return this.history;
    }

    /**
     * Setter for history - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setHistory(ArrayList<TransactionModel> history) {
        this.history = history;
    }

    
    private String email;

    /**
     * Getter for email - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private TaxOverrideTypeId taxOverrideType;

    /**
     * Getter for taxOverrideType - A single transaction - for example, a sales invoice or purchase order.
     */
    public TaxOverrideTypeId getTaxOverrideType() {
        return this.taxOverrideType;
    }

    /**
     * Setter for taxOverrideType - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTaxOverrideType(TaxOverrideTypeId taxOverrideType) {
        this.taxOverrideType = taxOverrideType;
    }

    
    private Long originAddressId;

    /**
     * Getter for originAddressId - A single transaction - for example, a sales invoice or purchase order.
     */
    public Long getOriginAddressId() {
        return this.originAddressId;
    }

    /**
     * Setter for originAddressId - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setOriginAddressId(Long originAddressId) {
        this.originAddressId = originAddressId;
    }

    
    private String description;

    /**
     * Getter for description - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String softwareVersion;

    /**
     * Getter for softwareVersion - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * Setter for softwareVersion - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    
    private String exemptNo;

    /**
     * Getter for exemptNo - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setExemptNo(String exemptNo) {
        this.exemptNo = exemptNo;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String locationCode;

    /**
     * Getter for locationCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    
    private Boolean locked;

    /**
     * Getter for locked - A single transaction - for example, a sales invoice or purchase order.
     */
    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * Setter for locked - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    
    private String country;

    /**
     * Getter for country - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTotalTaxable(BigDecimal totalTaxable) {
        this.totalTaxable = totalTaxable;
    }

    
    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    
    private String code;

    /**
     * Getter for code - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String referenceCode;

    /**
     * Getter for referenceCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    
    private BigDecimal totalAmount;

    /**
     * Getter for totalAmount - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * Setter for totalAmount - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    private Integer version;

    /**
     * Getter for version - A single transaction - for example, a sales invoice or purchase order.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    
    private Long id;

    /**
     * Getter for id - A single transaction - for example, a sales invoice or purchase order.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private Date exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public Date getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setExchangeRateEffectiveDate(Date exchangeRateEffectiveDate) {
        this.exchangeRateEffectiveDate = exchangeRateEffectiveDate;
    }

    
    private Date date;

    /**
     * Getter for date - A single transaction - for example, a sales invoice or purchase order.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    private Long destinationAddressId;

    /**
     * Getter for destinationAddressId - A single transaction - for example, a sales invoice or purchase order.
     */
    public Long getDestinationAddressId() {
        return this.destinationAddressId;
    }

    /**
     * Setter for destinationAddressId - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setDestinationAddressId(Long destinationAddressId) {
        this.destinationAddressId = destinationAddressId;
    }

    
    private DocumentStatus status;

    /**
     * Getter for status - A single transaction - for example, a sales invoice or purchase order.
     */
    public DocumentStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setStatus(DocumentStatus status) {
        this.status = status;
    }

    
    private ArrayList<TransactionLocationTypeModel> locationTypes;

    /**
     * Getter for locationTypes - A single transaction - for example, a sales invoice or purchase order.
     */
    public ArrayList<TransactionLocationTypeModel> getLocationTypes() {
        return this.locationTypes;
    }

    /**
     * Setter for locationTypes - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setLocationTypes(ArrayList<TransactionLocationTypeModel> locationTypes) {
        this.locationTypes = locationTypes;
    }

    
    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTaxOverrideReason(String taxOverrideReason) {
        this.taxOverrideReason = taxOverrideReason;
    }

    
    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord - A single transaction - for example, a sales invoice or purchase order.
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setIsSellerImporterOfRecord(Boolean isSellerImporterOfRecord) {
        this.isSellerImporterOfRecord = isSellerImporterOfRecord;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - A single transaction - for example, a sales invoice or purchase order.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private String currencyCode;

    /**
     * Getter for currencyCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    
    private String region;

    /**
     * Getter for region - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private BigDecimal taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getTaxOverrideAmount() {
        return this.taxOverrideAmount;
    }

    /**
     * Setter for taxOverrideAmount - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTaxOverrideAmount(BigDecimal taxOverrideAmount) {
        this.taxOverrideAmount = taxOverrideAmount;
    }

    
    private BigDecimal totalTax;

    /**
     * Getter for totalTax - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    
    private Date paymentDate;

    /**
     * Getter for paymentDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for paymentDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    
    private BigDecimal totalTaxCalculated;

    /**
     * Getter for totalTaxCalculated - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getTotalTaxCalculated() {
        return this.totalTaxCalculated;
    }

    /**
     * Setter for totalTaxCalculated - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTotalTaxCalculated(BigDecimal totalTaxCalculated) {
        this.totalTaxCalculated = totalTaxCalculated;
    }

    
    private String customerVendorCode;

    /**
     * Getter for customerVendorCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getCustomerVendorCode() {
        return this.customerVendorCode;
    }

    /**
     * Setter for customerVendorCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setCustomerVendorCode(String customerVendorCode) {
        this.customerVendorCode = customerVendorCode;
    }

    
    private String salespersonCode;

    /**
     * Getter for salespersonCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setSalespersonCode(String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }

    
    private DocumentType type;

    /**
     * Getter for type - A single transaction - for example, a sales invoice or purchase order.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setType(DocumentType type) {
        this.type = type;
    }

    
    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt - A single transaction - for example, a sales invoice or purchase order.
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTotalExempt(BigDecimal totalExempt) {
        this.totalExempt = totalExempt;
    }

    
    private ArrayList<TransactionLineModel> lines;

    /**
     * Getter for lines - A single transaction - for example, a sales invoice or purchase order.
     */
    public ArrayList<TransactionLineModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setLines(ArrayList<TransactionLineModel> lines) {
        this.lines = lines;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - A single transaction - for example, a sales invoice or purchase order.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private Date taxDate;

    /**
     * Getter for taxDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    
    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription - A single transaction - for example, a sales invoice or purchase order.
     */
    public String getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setAdjustmentDescription(String adjustmentDescription) {
        this.adjustmentDescription = adjustmentDescription;
    }

    
    private ArrayList<TransactionSummary> summary;

    /**
     * Getter for summary - A single transaction - for example, a sales invoice or purchase order.
     */
    public ArrayList<TransactionSummary> getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setSummary(ArrayList<TransactionSummary> summary) {
        this.summary = summary;
    }

    
    private AdjustmentReason adjustmentReason;

    /**
     * Getter for adjustmentReason - A single transaction - for example, a sales invoice or purchase order.
     */
    public AdjustmentReason getAdjustmentReason() {
        return this.adjustmentReason;
    }

    /**
     * Setter for adjustmentReason - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setAdjustmentReason(AdjustmentReason adjustmentReason) {
        this.adjustmentReason = adjustmentReason;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - A single transaction - for example, a sales invoice or purchase order.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Boolean reconciled;

    /**
     * Getter for reconciled - A single transaction - for example, a sales invoice or purchase order.
     */
    public Boolean getReconciled() {
        return this.reconciled;
    }

    /**
     * Setter for reconciled - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setReconciled(Boolean reconciled) {
        this.reconciled = reconciled;
    }

    
    private ArrayList<TransactionAddressModel> addresses;

    /**
     * Getter for addresses - A single transaction - for example, a sales invoice or purchase order.
     */
    public ArrayList<TransactionAddressModel> getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses - A single transaction - for example, a sales invoice or purchase order.
     */
    public void setAddresses(ArrayList<TransactionAddressModel> addresses) {
        this.addresses = addresses;
    }

    


    /**
     * Returns a JSON string representation of TransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    