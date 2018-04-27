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
 * This object represents a single transaction; for example, a sales invoice or purchase order.
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


    private String code;

    /**
     * Getter for code
     *
     * A unique customer-provided code identifying this transaction.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * A unique customer-provided code identifying this transaction.
     */
    public void setCode(String value) {
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
     * The type of the transaction. 
    * 
    * Transactions of type `SalesOrder`, `ReturnOrder`, and so on are temporary estimates and will not be saved.
    * 
    * Transactions of type `SalesInvoice, `ReturnInvoice`, and so on are permanent transactions that can be reported to tax authorities
    * if they are in status `Committed`.
    * 
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
     * The type of the transaction. 
    * 
    * Transactions of type `SalesOrder`, `ReturnOrder`, and so on are temporary estimates and will not be saved.
    * 
    * Transactions of type `SalesInvoice, `ReturnInvoice`, and so on are permanent transactions that can be reported to tax authorities
    * if they are in status `Committed`.
    * 
    * A sales transaction represents a sale from the company to a customer. A purchase transaction represents a purchase made by the company.
    * A return transaction represents a customer who decided to request a refund after purchasing a product from the company. An inventory 
    * transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private String batchCode;

    /**
     * Getter for batchCode
     *
     * If this transaction was created as part of a batch, this code indicates which batch.
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode
     *
     * If this transaction was created as part of a batch, this code indicates which batch.
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
    }


    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * DEPRECATED - The customer usage type for this transaction. Customer usage types often affect exemption or taxability rules.
    * Please use entityUseCode instead.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * DEPRECATED - The customer usage type for this transaction. Customer usage types often affect exemption or taxability rules.
    * Please use entityUseCode instead.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }


    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The entity use code for this transaction. Entity use codes often affect exemption or taxability rules.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The entity use code for this transaction. Entity use codes often affect exemption or taxability rules.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }


    private String customerVendorCode;

    /**
     * Getter for customerVendorCode
     *
     * DEPRECATED - Please use `customerCode`.
    * 
    * This field has been renamed to `customerCode` to match documentation for other APIs related to exemption customers.
     */
    public String getCustomerVendorCode() {
        return this.customerVendorCode;
    }

    /**
     * Setter for customerVendorCode
     *
     * DEPRECATED - Please use `customerCode`.
    * 
    * This field has been renamed to `customerCode` to match documentation for other APIs related to exemption customers.
     */
    public void setCustomerVendorCode(String value) {
        this.customerVendorCode = value;
    }


    private String customerCode;

    /**
     * Getter for customerCode
     *
     * Unique code identifying the customer that requested this transaction. 
    * 
    * When you specify a `customerCode`, AvaTax will look to see if a customer exists with this code in the exemption certificate system.
    * If that customer exists, and if that customer has uploaded an exemption certificate that applies to this transaction, the relevant
    * parts of this transaction that can use the exemption certificate will be treated as exempt.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * Unique code identifying the customer that requested this transaction. 
    * 
    * When you specify a `customerCode`, AvaTax will look to see if a customer exists with this code in the exemption certificate system.
    * If that customer exists, and if that customer has uploaded an exemption certificate that applies to this transaction, the relevant
    * parts of this transaction that can use the exemption certificate will be treated as exempt.
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }


    private String exemptNo;

    /**
     * Getter for exemptNo
     *
     * If this transaction was exempt, this field will contain the word "Exempt".
     */
    public String getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo
     *
     * If this transaction was exempt, this field will contain the word "Exempt".
     */
    public void setExemptNo(String value) {
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


    private String locationCode;

    /**
     * Getter for locationCode
     *
     * (DEPRECATED) This field has been replaced by the reportingLocationCode field
    * In order to ensure consistency of field names, Please use reportingLocationCode instead.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * (DEPRECATED) This field has been replaced by the reportingLocationCode field
    * In order to ensure consistency of field names, Please use reportingLocationCode instead.
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }


    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode
     *
     * For customers who use [location-based tax reporting](https://developer.avalara.com/avatax/dev-guide/locations/location-based-reporting), 
    * this field controls how this transaction will be filed for multi-location tax filings.
    * 
    * If you specify a non-null value for this field, AvaTax will ensure that this transaction is reported on the tax return associated 
    * with the [LocationModel](https://developer.avalara.com/api-reference/avatax/rest/v2/models/LocationModel/) identified by this code.
    * 
    * This field does not affect any addresses for the transaction. It only controls the tax filing behavior of this transaction.
    * 
    * If you are looking for information about how to set up addresses for a transaction, please see [Using Address Types](https://developer.avalara.com/avatax/dev-guide/customizing-transaction/address-types/) 
    * in the AvaTax Developer Guide.
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode
     *
     * For customers who use [location-based tax reporting](https://developer.avalara.com/avatax/dev-guide/locations/location-based-reporting), 
    * this field controls how this transaction will be filed for multi-location tax filings.
    * 
    * If you specify a non-null value for this field, AvaTax will ensure that this transaction is reported on the tax return associated 
    * with the [LocationModel](https://developer.avalara.com/api-reference/avatax/rest/v2/models/LocationModel/) identified by this code.
    * 
    * This field does not affect any addresses for the transaction. It only controls the tax filing behavior of this transaction.
    * 
    * If you are looking for information about how to set up addresses for a transaction, please see [Using Address Types](https://developer.avalara.com/avatax/dev-guide/customizing-transaction/address-types/) 
    * in the AvaTax Developer Guide.
     */
    public void setReportingLocationCode(String value) {
        this.reportingLocationCode = value;
    }


    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo
     *
     * The customer-supplied purchase order number of this transaction.
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo
     *
     * The customer-supplied purchase order number of this transaction.
     */
    public void setPurchaseOrderNo(String value) {
        this.purchaseOrderNo = value;
    }


    private String referenceCode;

    /**
     * Getter for referenceCode
     *
     * A user-defined reference code for this transaction.
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * A user-defined reference code for this transaction.
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }


    private String salespersonCode;

    /**
     * Getter for salespersonCode
     *
     * The salesperson who provided this transaction. Not required.
     */
    public String getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode
     *
     * The salesperson who provided this transaction. Not required.
     */
    public void setSalespersonCode(String value) {
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


    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason
     *
     * If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public String getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason
     *
     * If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public void setTaxOverrideReason(String value) {
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


    private BigDecimal totalDiscount;

    /**
     * Getter for totalDiscount
     *
     * The total amount of discounts applied to all lines within this transaction.
     */
    public BigDecimal getTotalDiscount() {
        return this.totalDiscount;
    }

    /**
     * Setter for totalDiscount
     *
     * The total amount of discounts applied to all lines within this transaction.
     */
    public void setTotalDiscount(BigDecimal value) {
        this.totalDiscount = value;
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


    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription
     *
     * If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public String getAdjustmentDescription() {
        return this.adjustmentDescription;
    }

    /**
     * Setter for adjustmentDescription
     *
     * If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public void setAdjustmentDescription(String value) {
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


    private String region;

    /**
     * Getter for region
     *
     * The two-or-three character ISO region code of the region for this transaction.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two-or-three character ISO region code of the region for this transaction.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The two-character ISO 3166 code of the country for this transaction.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two-character ISO 3166 code of the country for this transaction.
     */
    public void setCountry(String value) {
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


    private String softwareVersion;

    /**
     * Getter for softwareVersion
     *
     * The software version used to calculate this transaction.
     */
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * Setter for softwareVersion
     *
     * The software version used to calculate this transaction.
     */
    public void setSoftwareVersion(String value) {
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
     * By default, the value is null, when the value is null, the value can be set at nexus level and used.
    * If the value is not null, it will override the value at nexus level.
    * 
    * If true, this seller was considered the importer of record of a product shipped internationally.
    * 
    * If this transaction is not an international transaction, this field may be left blank.
    * 
    * The "importer of record" is liable to pay customs and import duties for products shipped internationally. If 
    * you specify that the seller is the importer of record, then estimates of customs and import duties will be added
    * as tax details to the transaction. Otherwise, the buyer is considered the importer of record, and customs
    * and import duties will not be added to the tax details for this transaction.
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord
     *
     * By default, the value is null, when the value is null, the value can be set at nexus level and used.
    * If the value is not null, it will override the value at nexus level.
    * 
    * If true, this seller was considered the importer of record of a product shipped internationally.
    * 
    * If this transaction is not an international transaction, this field may be left blank.
    * 
    * The "importer of record" is liable to pay customs and import duties for products shipped internationally. If 
    * you specify that the seller is the importer of record, then estimates of customs and import duties will be added
    * as tax details to the transaction. Otherwise, the buyer is considered the importer of record, and customs
    * and import duties will not be added to the tax details for this transaction.
     */
    public void setIsSellerImporterOfRecord(Boolean value) {
        this.isSellerImporterOfRecord = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * Description of this transaction. Field permits unicode values.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of this transaction. Field permits unicode values.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String email;

    /**
     * Getter for email
     *
     * Email address associated with this transaction.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * Email address associated with this transaction.
     */
    public void setEmail(String value) {
        this.email = value;
    }


    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * VAT business identification number used for this transaction.
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * VAT business identification number used for this transaction.
     */
    public void setBusinessIdentificationNo(String value) {
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


    private ArrayList<TransactionLineModel> lines;

    /**
     * Getter for lines
     *
     * A list of line items in this transaction. To fetch this list, add the query string `?$include=Lines` or `?$include=Details` to your URL.
     */
    public ArrayList<TransactionLineModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * A list of line items in this transaction. To fetch this list, add the query string `?$include=Lines` or `?$include=Details` to your URL.
     */
    public void setLines(ArrayList<TransactionLineModel> value) {
        this.lines = value;
    }


    private ArrayList<TransactionAddressModel> addresses;

    /**
     * Getter for addresses
     *
     * A list of line items in this transaction. To fetch this list, add the query string `?$include=Addresses` to your URL.
    * 
    * For more information about transaction addresses, please see [Using Address Types](https://developer.avalara.com/avatax/dev-guide/customizing-transaction/address-types/) 
    * in the AvaTax Developer Guide.
     */
    public ArrayList<TransactionAddressModel> getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses
     *
     * A list of line items in this transaction. To fetch this list, add the query string `?$include=Addresses` to your URL.
    * 
    * For more information about transaction addresses, please see [Using Address Types](https://developer.avalara.com/avatax/dev-guide/customizing-transaction/address-types/) 
    * in the AvaTax Developer Guide.
     */
    public void setAddresses(ArrayList<TransactionAddressModel> value) {
        this.addresses = value;
    }


    private ArrayList<TransactionLocationTypeModel> locationTypes;

    /**
     * Getter for locationTypes
     *
     * A list of location types in this transaction. To fetch this list, add the query string `?$include=Addresses` to your URL.
     */
    public ArrayList<TransactionLocationTypeModel> getLocationTypes() {
        return this.locationTypes;
    }

    /**
     * Setter for locationTypes
     *
     * A list of location types in this transaction. To fetch this list, add the query string `?$include=Addresses` to your URL.
     */
    public void setLocationTypes(ArrayList<TransactionLocationTypeModel> value) {
        this.locationTypes = value;
    }


    private ArrayList<TransactionSummary> summary;

    /**
     * Getter for summary
     *
     * Contains a summary of tax on this transaction.
     */
    public ArrayList<TransactionSummary> getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * Contains a summary of tax on this transaction.
     */
    public void setSummary(ArrayList<TransactionSummary> value) {
        this.summary = value;
    }


    private HashMap<String, String> parameters;

    /**
     * Getter for parameters
     *
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public void setParameters(HashMap<String, String> value) {
        this.parameters = value;
    }


    private ArrayList<AvaTaxMessage> messages;

    /**
     * Getter for messages
     *
     * List of informational and warning messages regarding this API call. These messages are only relevant to the current API call.
     */
    public ArrayList<AvaTaxMessage> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages
     *
     * List of informational and warning messages regarding this API call. These messages are only relevant to the current API call.
     */
    public void setMessages(ArrayList<AvaTaxMessage> value) {
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
