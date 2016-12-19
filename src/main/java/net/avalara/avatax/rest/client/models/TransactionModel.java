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
     * Getter for messages - List of informational and warning messages regarding this API call.  These messages are only relevant to the current API call.
     */
    public ArrayList<AvaTaxMessage> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages - List of informational and warning messages regarding this API call.  These messages are only relevant to the current API call.
     */
    public void setMessages(ArrayList<AvaTaxMessage> messages) {
        this.messages = messages;
    }

    
    private String batchCode;

    /**
     * Getter for batchCode - If this transaction was created as part of a batch, this code indicates which batch.
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode - If this transaction was created as part of a batch, this code indicates which batch.
     */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - The customer usage type for this transaction.  Customer usage types often affect exemption or taxability rules.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - The customer usage type for this transaction.  Customer usage types often affect exemption or taxability rules.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private ArrayList<TransactionModel> history;

    /**
     * Getter for history - If this transaction has been adjusted, this list contains all the previous versions of the document.
     */
    public ArrayList<TransactionModel> getHistory() {
        return this.history;
    }

    /**
     * Setter for history - If this transaction has been adjusted, this list contains all the previous versions of the document.
     */
    public void setHistory(ArrayList<TransactionModel> history) {
        this.history = history;
    }

    
    private String email;

    /**
     * Getter for email - Email address associated with this transaction.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Email address associated with this transaction.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private TaxOverrideTypeId taxOverrideType;

    /**
     * Getter for taxOverrideType - If a tax override was applied to this transaction, indicates what type of tax override was applied.
     */
    public TaxOverrideTypeId getTaxOverrideType() {
        return this.taxOverrideType;
    }

    /**
     * Setter for taxOverrideType - If a tax override was applied to this transaction, indicates what type of tax override was applied.
     */
    public void setTaxOverrideType(TaxOverrideTypeId taxOverrideType) {
        this.taxOverrideType = taxOverrideType;
    }

    
    private Long originAddressId;

    /**
     * Getter for originAddressId - The unique ID number of the origin address for this transaction.
     */
    public Long getOriginAddressId() {
        return this.originAddressId;
    }

    /**
     * Setter for originAddressId - The unique ID number of the origin address for this transaction.
     */
    public void setOriginAddressId(Long originAddressId) {
        this.originAddressId = originAddressId;
    }

    
    private String description;

    /**
     * Getter for description - Description of this transaction.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Description of this transaction.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String softwareVersion;

    /**
     * Getter for softwareVersion - The software version used to calculate this transaction.
     */
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * Setter for softwareVersion - The software version used to calculate this transaction.
     */
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    
    private String exemptNo;

    /**
     * Getter for exemptNo - If this transaction was exempt, this field will contain the word "Exempt".
     */
    public String getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo - If this transaction was exempt, this field will contain the word "Exempt".
     */
    public void setExemptNo(String exemptNo) {
        this.exemptNo = exemptNo;
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

    
    private String locationCode;

    /**
     * Getter for locationCode - If this transaction was made from a specific reporting location, this is the code string of the location.
            For customers using Returns, this indicates how tax will be reported according to different locations on the tax forms.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode - If this transaction was made from a specific reporting location, this is the code string of the location.
            For customers using Returns, this indicates how tax will be reported according to different locations on the tax forms.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    
    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo - The customer-supplied purchase order number of this transaction.
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo - The customer-supplied purchase order number of this transaction.
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    
    private Boolean locked;

    /**
     * Getter for locked - If this transaction has been reported to a tax authority, this transaction is considered locked and may not be adjusted after reporting.
     */
    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * Setter for locked - If this transaction has been reported to a tax authority, this transaction is considered locked and may not be adjusted after reporting.
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    
    private String country;

    /**
     * Getter for country - The two-character ISO 3166 code of the country for this transaction.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The two-character ISO 3166 code of the country for this transaction.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable - The portion of the total amount of this transaction that was taxable.
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable - The portion of the total amount of this transaction that was taxable.
     */
    public void setTotalTaxable(BigDecimal totalTaxable) {
        this.totalTaxable = totalTaxable;
    }

    
    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate - If this transaction included foreign currency exchange, this is the exchange rate that was used.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate - If this transaction included foreign currency exchange, this is the exchange rate that was used.
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    
    private String code;

    /**
     * Getter for code - A unique customer-provided code identifying this transaction.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code - A unique customer-provided code identifying this transaction.
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    private String referenceCode;

    /**
     * Getter for referenceCode - A user-defined reference code for this transaction.
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode - A user-defined reference code for this transaction.
     */
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    
    private BigDecimal totalAmount;

    /**
     * Getter for totalAmount - The total amount of this transaction.
     */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * Setter for totalAmount - The total amount of this transaction.
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    private Integer version;

    /**
     * Getter for version - If this transaction was adjusted, this indicates the version number of this transaction.  Incremented each time the transaction
            is adjusted.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version - If this transaction was adjusted, this indicates the version number of this transaction.  Incremented each time the transaction
            is adjusted.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this transaction.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this transaction.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private Date exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate - If this transaction included foreign currency exchange, this is the date as of which the exchange rate was calculated.
     */
    public Date getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate - If this transaction included foreign currency exchange, this is the date as of which the exchange rate was calculated.
     */
    public void setExchangeRateEffectiveDate(Date exchangeRateEffectiveDate) {
        this.exchangeRateEffectiveDate = exchangeRateEffectiveDate;
    }

    
    private Date date;

    /**
     * Getter for date - The date on which this transaction occurred.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date - The date on which this transaction occurred.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    private Long destinationAddressId;

    /**
     * Getter for destinationAddressId - The unique ID number of the destination address for this transaction.
     */
    public Long getDestinationAddressId() {
        return this.destinationAddressId;
    }

    /**
     * Setter for destinationAddressId - The unique ID number of the destination address for this transaction.
     */
    public void setDestinationAddressId(Long destinationAddressId) {
        this.destinationAddressId = destinationAddressId;
    }

    
    private DocumentStatus status;

    /**
     * Getter for status - The status of the transaction.
     */
    public DocumentStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status - The status of the transaction.
     */
    public void setStatus(DocumentStatus status) {
        this.status = status;
    }

    
    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason - If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public String getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason - If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public void setTaxOverrideReason(String taxOverrideReason) {
        this.taxOverrideReason = taxOverrideReason;
    }

    
    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord - If true, this seller was considered the importer of record of a product shipped internationally.
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord - If true, this seller was considered the importer of record of a product shipped internationally.
     */
    public void setIsSellerImporterOfRecord(Boolean isSellerImporterOfRecord) {
        this.isSellerImporterOfRecord = isSellerImporterOfRecord;
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

    
    private String currencyCode;

    /**
     * Getter for currencyCode - The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode - The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    
    private String region;

    /**
     * Getter for region - The two-or-three character ISO region code of the region for this transaction.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The two-or-three character ISO region code of the region for this transaction.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private BigDecimal taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount - If a tax override was applied to this transaction, indicates the amount of tax that was requested by the customer.
     */
    public BigDecimal getTaxOverrideAmount() {
        return this.taxOverrideAmount;
    }

    /**
     * Setter for taxOverrideAmount - If a tax override was applied to this transaction, indicates the amount of tax that was requested by the customer.
     */
    public void setTaxOverrideAmount(BigDecimal taxOverrideAmount) {
        this.taxOverrideAmount = taxOverrideAmount;
    }

    
    private BigDecimal totalTax;

    /**
     * Getter for totalTax - The total tax calculated for all lines in this transaction.
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax - The total tax calculated for all lines in this transaction.
     */
    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    
    private Date paymentDate;

    /**
     * Getter for paymentDate - The date when payment was made on this transaction.  By default, this should be the same as the date of the transaction.
     */
    public Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for paymentDate - The date when payment was made on this transaction.  By default, this should be the same as the date of the transaction.
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    
    private BigDecimal totalTaxCalculated;

    /**
     * Getter for totalTaxCalculated - If a tax override was applied to this transaction, indicates the amount of tax Avalara calculated for the transaction.
     */
    public BigDecimal getTotalTaxCalculated() {
        return this.totalTaxCalculated;
    }

    /**
     * Setter for totalTaxCalculated - If a tax override was applied to this transaction, indicates the amount of tax Avalara calculated for the transaction.
     */
    public void setTotalTaxCalculated(BigDecimal totalTaxCalculated) {
        this.totalTaxCalculated = totalTaxCalculated;
    }

    
    private String customerVendorCode;

    /**
     * Getter for customerVendorCode - CustomerVendorCode
     */
    public String getCustomerVendorCode() {
        return this.customerVendorCode;
    }

    /**
     * Setter for customerVendorCode - CustomerVendorCode
     */
    public void setCustomerVendorCode(String customerVendorCode) {
        this.customerVendorCode = customerVendorCode;
    }

    
    private String salespersonCode;

    /**
     * Getter for salespersonCode - The salesperson who provided this transaction.  Not required.
     */
    public String getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode - The salesperson who provided this transaction.  Not required.
     */
    public void setSalespersonCode(String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }

    
    private DocumentType type;

    /**
     * Getter for type - The type of the transaction.  For Returns customers, a transaction type of "Invoice" will be reported to the tax authorities.
            A sales transaction represents a sale from the company to a customer.  A purchase transaction represents a purchase made by the company.
            A return transaction represents a customer who decided to request a refund after purchasing a product from the company.  An inventory 
            transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type - The type of the transaction.  For Returns customers, a transaction type of "Invoice" will be reported to the tax authorities.
            A sales transaction represents a sale from the company to a customer.  A purchase transaction represents a purchase made by the company.
            A return transaction represents a customer who decided to request a refund after purchasing a product from the company.  An inventory 
            transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public void setType(DocumentType type) {
        this.type = type;
    }

    
    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt - The amount of this transaction that was exempt.
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt - The amount of this transaction that was exempt.
     */
    public void setTotalExempt(BigDecimal totalExempt) {
        this.totalExempt = totalExempt;
    }

    
    private ArrayList<TransactionLineModel> lines;

    /**
     * Getter for lines - Optional: A list of line items in this transaction.  To fetch this list, add the query string "?$include=Lines" or "?$include=Details" to your URL.
     */
    public ArrayList<TransactionLineModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines - Optional: A list of line items in this transaction.  To fetch this list, add the query string "?$include=Lines" or "?$include=Details" to your URL.
     */
    public void setLines(ArrayList<TransactionLineModel> lines) {
        this.lines = lines;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - Contains a list of extra parameters that were set when the transaction was created.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - Contains a list of extra parameters that were set when the transaction was created.
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private Date taxDate;

    /**
     * Getter for taxDate - The date that was used when calculating tax for this transaction.
            By default, this should be the same as the transaction date; however, when a consumer returns a product purchased in a previous month,
            it may be necessary to specify the date of the original transaction in order to correctly return the exact amount of sales tax that was
            charged of the consumer on the original date they purchased the product.
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate - The date that was used when calculating tax for this transaction.
            By default, this should be the same as the transaction date; however, when a consumer returns a product purchased in a previous month,
            it may be necessary to specify the date of the original transaction in order to correctly return the exact amount of sales tax that was
            charged of the consumer on the original date they purchased the product.
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    
    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription - If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public String getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription - If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public void setAdjustmentDescription(String adjustmentDescription) {
        this.adjustmentDescription = adjustmentDescription;
    }

    
    private ArrayList<TransactionSummary> summary;

    /**
     * Getter for summary - Contains a summary of tax on this transaction.
     */
    public ArrayList<TransactionSummary> getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary - Contains a summary of tax on this transaction.
     */
    public void setSummary(ArrayList<TransactionSummary> summary) {
        this.summary = summary;
    }

    
    private AdjustmentReason adjustmentReason;

    /**
     * Getter for adjustmentReason - If this transaction was adjusted, indicates the unique ID number of the reason why the transaction was adjusted.
     */
    public AdjustmentReason getAdjustmentReason() {
        return this.adjustmentReason;
    }

    /**
     * Setter for adjustmentReason - If this transaction was adjusted, indicates the unique ID number of the reason why the transaction was adjusted.
     */
    public void setAdjustmentReason(AdjustmentReason adjustmentReason) {
        this.adjustmentReason = adjustmentReason;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company that recorded this transaction.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company that recorded this transaction.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Boolean reconciled;

    /**
     * Getter for reconciled - If this transaction has been reconciled against the company's ledger, this value is set to true.
     */
    public Boolean getReconciled() {
        return this.reconciled;
    }

    /**
     * Setter for reconciled - If this transaction has been reconciled against the company's ledger, this value is set to true.
     */
    public void setReconciled(Boolean reconciled) {
        this.reconciled = reconciled;
    }

    
    private ArrayList<TransactionAddressModel> addresses;

    /**
     * Getter for addresses - Optional: A list of line items in this transaction.  To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public ArrayList<TransactionAddressModel> getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses - Optional: A list of line items in this transaction.  To fetch this list, add the query string "?$include=Addresses" to your URL.
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
    