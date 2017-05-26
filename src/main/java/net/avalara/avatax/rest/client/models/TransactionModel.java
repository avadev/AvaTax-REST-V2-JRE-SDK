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
 * A single transaction - for example, a sales invoice or purchase order.
 */
public class TransactionModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this transaction.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this transaction.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private string code;

    /**
     * Getter for code
     *
     * A unique customer-provided code identifying this transaction.
     */
    public string getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * A unique customer-provided code identifying this transaction.
     */
    public void setCode(string value) {
        this.code = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that recorded this transaction.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that recorded this transaction.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private Date date;

    /**
     * Getter for date
     *
     * The date on which this transaction occurred.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date
     *
     * The date on which this transaction occurred.
     */
    public void setDate(Date value) {
        this.date = value;
    }


    private Date paymentDate;

    /**
     * Getter for paymentDate
     *
     * The date when payment was made on this transaction. By default, this should be the same as the date of the transaction.
     */
    public Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for paymentDate
     *
     * The date when payment was made on this transaction. By default, this should be the same as the date of the transaction.
     */
    public void setPaymentDate(Date value) {
        this.paymentDate = value;
    }


    private DocumentStatus status;

    /**
     * Getter for status
     *
     * The status of the transaction.
     */
    public DocumentStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the transaction.
     */
    public void setStatus(DocumentStatus value) {
        this.status = value;
    }


    private DocumentType type;

    /**
     * Getter for type
     *
     * The type of the transaction. For Returns customers, a transaction type of "Invoice" will be reported to the tax authorities.
    * A sales transaction represents a sale from the company to a customer. A purchase transaction represents a purchase made by the company.
    * A return transaction represents a customer who decided to request a refund after purchasing a product from the company. An inventory 
    * transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the transaction. For Returns customers, a transaction type of "Invoice" will be reported to the tax authorities.
    * A sales transaction represents a sale from the company to a customer. A purchase transaction represents a purchase made by the company.
    * A return transaction represents a customer who decided to request a refund after purchasing a product from the company. An inventory 
    * transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private string batchCode;

    /**
     * Getter for batchCode
     *
     * If this transaction was created as part of a batch, this code indicates which batch.
     */
    public string getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode
     *
     * If this transaction was created as part of a batch, this code indicates which batch.
     */
    public void setBatchCode(string value) {
        this.batchCode = value;
    }


    private string currencyCode;

    /**
     * Getter for currencyCode
     *
     * The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public string getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public void setCurrencyCode(string value) {
        this.currencyCode = value;
    }


    private string customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * The customer usage type for this transaction. Customer usage types often affect exemption or taxability rules.
     */
    public string getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * The customer usage type for this transaction. Customer usage types often affect exemption or taxability rules.
     */
    public void setCustomerUsageType(string value) {
        this.customerUsageType = value;
    }


    private string customerVendorCode;

    /**
     * Getter for customerVendorCode
     *
     * CustomerVendorCode
     */
    public string getCustomerVendorCode() {
        return this.customerVendorCode;
    }

    /**
     * Setter for customerVendorCode
     *
     * CustomerVendorCode
     */
    public void setCustomerVendorCode(string value) {
        this.customerVendorCode = value;
    }


    private string exemptNo;

    /**
     * Getter for exemptNo
     *
     * If this transaction was exempt, this field will contain the word "Exempt".
     */
    public string getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo
     *
     * If this transaction was exempt, this field will contain the word "Exempt".
     */
    public void setExemptNo(string value) {
        this.exemptNo = value;
    }


    private Boolean reconciled;

    /**
     * Getter for reconciled
     *
     * If this transaction has been reconciled against the company's ledger, this value is set to true.
     */
    public Boolean getReconciled() {
        return this.reconciled;
    }

    /**
     * Setter for reconciled
     *
     * If this transaction has been reconciled against the company's ledger, this value is set to true.
     */
    public void setReconciled(Boolean value) {
        this.reconciled = value;
    }


    private string locationCode;

    /**
     * Getter for locationCode
     *
     * If this transaction was made from a specific reporting location, this is the code string of the location.
    * For customers using Returns, this indicates how tax will be reported according to different locations on the tax forms.
     */
    public string getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * If this transaction was made from a specific reporting location, this is the code string of the location.
    * For customers using Returns, this indicates how tax will be reported according to different locations on the tax forms.
     */
    public void setLocationCode(string value) {
        this.locationCode = value;
    }


    private string purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo
     *
     * The customer-supplied purchase order number of this transaction.
     */
    public string getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo
     *
     * The customer-supplied purchase order number of this transaction.
     */
    public void setPurchaseOrderNo(string value) {
        this.purchaseOrderNo = value;
    }


    private string referenceCode;

    /**
     * Getter for referenceCode
     *
     * A user-defined reference code for this transaction.
     */
    public string getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * A user-defined reference code for this transaction.
     */
    public void setReferenceCode(string value) {
        this.referenceCode = value;
    }


    private string salespersonCode;

    /**
     * Getter for salespersonCode
     *
     * The salesperson who provided this transaction. Not required.
     */
    public string getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode
     *
     * The salesperson who provided this transaction. Not required.
     */
    public void setSalespersonCode(string value) {
        this.salespersonCode = value;
    }


    private TaxOverrideTypeId taxOverrideType;

    /**
     * Getter for taxOverrideType
     *
     * If a tax override was applied to this transaction, indicates what type of tax override was applied.
     */
    public TaxOverrideTypeId getTaxOverrideType() {
        return this.taxOverrideType;
    }

    /**
     * Setter for taxOverrideType
     *
     * If a tax override was applied to this transaction, indicates what type of tax override was applied.
     */
    public void setTaxOverrideType(TaxOverrideTypeId value) {
        this.taxOverrideType = value;
    }


    private BigDecimal taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount
     *
     * If a tax override was applied to this transaction, indicates the amount of tax that was requested by the customer.
     */
    public BigDecimal getTaxOverrideAmount() {
        return this.taxOverrideAmount;
    }

    /**
     * Setter for taxOverrideAmount
     *
     * If a tax override was applied to this transaction, indicates the amount of tax that was requested by the customer.
     */
    public void setTaxOverrideAmount(BigDecimal value) {
        this.taxOverrideAmount = value;
    }


    private string taxOverrideReason;

    /**
     * Getter for taxOverrideReason
     *
     * If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public string getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason
     *
     * If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public void setTaxOverrideReason(string value) {
        this.taxOverrideReason = value;
    }


    private BigDecimal totalAmount;

    /**
     * Getter for totalAmount
     *
     * The total amount of this transaction.
     */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * Setter for totalAmount
     *
     * The total amount of this transaction.
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }


    private BigDecimal totalExempt;

    /**
     * Getter for totalExempt
     *
     * The amount of this transaction that was exempt.
     */
    public BigDecimal getTotalExempt() {
        return this.totalExempt;
    }

    /**
     * Setter for totalExempt
     *
     * The amount of this transaction that was exempt.
     */
    public void setTotalExempt(BigDecimal value) {
        this.totalExempt = value;
    }


    private BigDecimal totalTax;

    /**
     * Getter for totalTax
     *
     * The total tax calculated for all lines in this transaction.
     */
    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    /**
     * Setter for totalTax
     *
     * The total tax calculated for all lines in this transaction.
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }


    private BigDecimal totalTaxable;

    /**
     * Getter for totalTaxable
     *
     * The portion of the total amount of this transaction that was taxable.
     */
    public BigDecimal getTotalTaxable() {
        return this.totalTaxable;
    }

    /**
     * Setter for totalTaxable
     *
     * The portion of the total amount of this transaction that was taxable.
     */
    public void setTotalTaxable(BigDecimal value) {
        this.totalTaxable = value;
    }


    private BigDecimal totalTaxCalculated;

    /**
     * Getter for totalTaxCalculated
     *
     * If a tax override was applied to this transaction, indicates the amount of tax Avalara calculated for the transaction.
     */
    public BigDecimal getTotalTaxCalculated() {
        return this.totalTaxCalculated;
    }

    /**
     * Setter for totalTaxCalculated
     *
     * If a tax override was applied to this transaction, indicates the amount of tax Avalara calculated for the transaction.
     */
    public void setTotalTaxCalculated(BigDecimal value) {
        this.totalTaxCalculated = value;
    }


    private AdjustmentReason adjustmentReason;

    /**
     * Getter for adjustmentReason
     *
     * If this transaction was adjusted, indicates the unique ID number of the reason why the transaction was adjusted.
     */
    public AdjustmentReason getAdjustmentReason() {
        return this.adjustmentReason;
    }

    /**
     * Setter for adjustmentReason
     *
     * If this transaction was adjusted, indicates the unique ID number of the reason why the transaction was adjusted.
     */
    public void setAdjustmentReason(AdjustmentReason value) {
        this.adjustmentReason = value;
    }


    private string adjustmentDescription;

    /**
     * Getter for adjustmentDescription
     *
     * If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public string getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription
     *
     * If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public void setAdjustmentDescription(string value) {
        this.adjustmentDescription = value;
    }


    private Boolean locked;

    /**
     * Getter for locked
     *
     * If this transaction has been reported to a tax authority, this transaction is considered locked and may not be adjusted after reporting.
     */
    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * Setter for locked
     *
     * If this transaction has been reported to a tax authority, this transaction is considered locked and may not be adjusted after reporting.
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The two-or-three character ISO region code of the region for this transaction.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two-or-three character ISO region code of the region for this transaction.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The two-character ISO 3166 code of the country for this transaction.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two-character ISO 3166 code of the country for this transaction.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private Integer version;

    /**
     * Getter for version
     *
     * If this transaction was adjusted, this indicates the version number of this transaction. Incremented each time the transaction
    * is adjusted.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version
     *
     * If this transaction was adjusted, this indicates the version number of this transaction. Incremented each time the transaction
    * is adjusted.
     */
    public void setVersion(Integer value) {
        this.version = value;
    }


    private string softwareVersion;

    /**
     * Getter for softwareVersion
     *
     * The software version used to calculate this transaction.
     */
    public string getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * Setter for softwareVersion
     *
     * The software version used to calculate this transaction.
     */
    public void setSoftwareVersion(string value) {
        this.softwareVersion = value;
    }


    private Long originAddressId;

    /**
     * Getter for originAddressId
     *
     * The unique ID number of the origin address for this transaction.
     */
    public Long getOriginAddressId() {
        return this.originAddressId;
    }

    /**
     * Setter for originAddressId
     *
     * The unique ID number of the origin address for this transaction.
     */
    public void setOriginAddressId(Long value) {
        this.originAddressId = value;
    }


    private Long destinationAddressId;

    /**
     * Getter for destinationAddressId
     *
     * The unique ID number of the destination address for this transaction.
     */
    public Long getDestinationAddressId() {
        return this.destinationAddressId;
    }

    /**
     * Setter for destinationAddressId
     *
     * The unique ID number of the destination address for this transaction.
     */
    public void setDestinationAddressId(Long value) {
        this.destinationAddressId = value;
    }


    private Date exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate
     *
     * If this transaction included foreign currency exchange, this is the date as of which the exchange rate was calculated.
     */
    public Date getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate
     *
     * If this transaction included foreign currency exchange, this is the date as of which the exchange rate was calculated.
     */
    public void setExchangeRateEffectiveDate(Date value) {
        this.exchangeRateEffectiveDate = value;
    }


    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate
     *
     * If this transaction included foreign currency exchange, this is the exchange rate that was used.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate
     *
     * If this transaction included foreign currency exchange, this is the exchange rate that was used.
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }


    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord
     *
     * If true, this seller was considered the importer of record of a product shipped internationally.
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord
     *
     * If true, this seller was considered the importer of record of a product shipped internationally.
     */
    public void setIsSellerImporterOfRecord(Boolean value) {
        this.isSellerImporterOfRecord = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * Description of this transaction.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of this transaction.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string email;

    /**
     * Getter for email
     *
     * Email address associated with this transaction.
     */
    public string getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * Email address associated with this transaction.
     */
    public void setEmail(string value) {
        this.email = value;
    }


    private string businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * VAT business identification number used for this transaction.
     */
    public string getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * VAT business identification number used for this transaction.
     */
    public void setBusinessIdentificationNo(string value) {
        this.businessIdentificationNo = value;
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


    private Date taxDate;

    /**
     * Getter for taxDate
     *
     * Tax date for this transaction
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate
     *
     * Tax date for this transaction
     */
    public void setTaxDate(Date value) {
        this.taxDate = value;
    }


    private TransactionLineModel[] lines;

    /**
     * Getter for lines
     *
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Lines" or "?$include=Details" to your URL.
     */
    public TransactionLineModel[] getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Lines" or "?$include=Details" to your URL.
     */
    public void setLines(TransactionLineModel[] value) {
        this.lines = value;
    }


    private TransactionAddressModel[] addresses;

    /**
     * Getter for addresses
     *
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public TransactionAddressModel[] getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses
     *
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public void setAddresses(TransactionAddressModel[] value) {
        this.addresses = value;
    }


    private TransactionLocationTypeModel[] locationTypes;

    /**
     * Getter for locationTypes
     *
     * Optional: A list of location types in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public TransactionLocationTypeModel[] getLocationTypes() {
        return this.locationTypes;
    }

    /**
     * Setter for locationTypes
     *
     * Optional: A list of location types in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public void setLocationTypes(TransactionLocationTypeModel[] value) {
        this.locationTypes = value;
    }


    private TransactionModel[] history;

    /**
     * Getter for history
     *
     * If this transaction has been adjusted, this list contains all the previous versions of the document.
     */
    public TransactionModel[] getHistory() {
        return this.history;
    }

    /**
     * Setter for history
     *
     * If this transaction has been adjusted, this list contains all the previous versions of the document.
     */
    public void setHistory(TransactionModel[] value) {
        this.history = value;
    }


    private TransactionSummary[] summary;

    /**
     * Getter for summary
     *
     * Contains a summary of tax on this transaction.
     */
    public TransactionSummary[] getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * Contains a summary of tax on this transaction.
     */
    public void setSummary(TransactionSummary[] value) {
        this.summary = value;
    }


    private object parameters;

    /**
     * Getter for parameters
     *
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public object getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public void setParameters(object value) {
        this.parameters = value;
    }


    private AvaTaxMessage[] messages;

    /**
     * Getter for messages
     *
     * List of informational and warning messages regarding this API call. These messages are only relevant to the current API call.
     */
    public AvaTaxMessage[] getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages
     *
     * List of informational and warning messages regarding this API call. These messages are only relevant to the current API call.
     */
    public void setMessages(AvaTaxMessage[] value) {
        this.messages = value;
    }


    /**
     * Returns a JSON string representation of TransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
