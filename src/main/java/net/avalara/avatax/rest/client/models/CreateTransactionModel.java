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
 * Create a transaction
 */
public class CreateTransactionModel {


    private String code;

    /**
     * Getter for code
     *
     * The internal reference code used by the client application. This is used for operations such as
    * Get, Adjust, Settle, and Void. If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The internal reference code used by the client application. This is used for operations such as
    * Get, Adjust, Settle, and Void. If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private ArrayList<LineItemModel> lines;

    /**
     * Getter for lines
     *
     * A list of line items that will appear on this transaction.
     */
    public ArrayList<LineItemModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * A list of line items that will appear on this transaction.
     */
    public void setLines(ArrayList<LineItemModel> value) {
        this.lines = value;
    }

    private DocumentType type;

    /**
     * Getter for type
     *
     * Specifies the type of document to create. A document type ending with `Invoice` is a permanent transaction
    * that will be recorded in AvaTax. A document type ending with `Order` is a temporary estimate that will not
    * be preserved.
    *  
    * If you omit this value, the API will assume you want to create a `SalesOrder`.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Specifies the type of document to create. A document type ending with `Invoice` is a permanent transaction
    * that will be recorded in AvaTax. A document type ending with `Order` is a temporary estimate that will not
    * be preserved.
    *  
    * If you omit this value, the API will assume you want to create a `SalesOrder`.
     */
    public void setType(DocumentType value) {
        this.type = value;
    }

    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Company Code - Specify the code of the company creating this transaction here. If you leave this value null,
    * your account's default company will be used instead.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company Code - Specify the code of the company creating this transaction here. If you leave this value null,
    * your account's default company will be used instead.
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    private Date date;

    /**
     * Getter for date
     *
     * Transaction Date - The date on the invoice, purchase order, etc.
    *  
    * By default, this date will be used to calculate the tax rates for the transaction. If you wish to use a
    * different date to calculate tax rates, please specify a `taxOverride` of type `taxDate`.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date
     *
     * Transaction Date - The date on the invoice, purchase order, etc.
    *  
    * By default, this date will be used to calculate the tax rates for the transaction. If you wish to use a
    * different date to calculate tax rates, please specify a `taxOverride` of type `taxDate`.
     */
    public void setDate(Date value) {
        this.date = value;
    }

    private String salespersonCode;

    /**
     * Getter for salespersonCode
     *
     * Salesperson Code - The client application salesperson reference code.
     */
    public String getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode
     *
     * Salesperson Code - The client application salesperson reference code.
     */
    public void setSalespersonCode(String value) {
        this.salespersonCode = value;
    }

    private String customerCode;

    /**
     * Getter for customerCode
     *
     * Customer Code - The client application customer reference code.
    * Note: This field is case sensitive. To have exemption certificates apply, this value should
    * be the same as the one passed to create a customer.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * Customer Code - The client application customer reference code.
    * Note: This field is case sensitive. To have exemption certificates apply, this value should
    * be the same as the one passed to create a customer.
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * DEPRECATED - Date: 10/16/2017, Version: 17.11, Message: Please use entityUseCode instead.
    * Customer Usage Type - The client application customer or usage type.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * DEPRECATED - Date: 10/16/2017, Version: 17.11, Message: Please use entityUseCode instead.
    * Customer Usage Type - The client application customer or usage type.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * Entity Use Code - The client application customer or usage type. For a list of
    * available usage types, use [ListEntityUseCodes](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListEntityUseCodes/) API.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * Entity Use Code - The client application customer or usage type. For a list of
    * available usage types, use [ListEntityUseCodes](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListEntityUseCodes/) API.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private BigDecimal discount;

    /**
     * Getter for discount
     *
     * Discount - The discount amount to apply to the document. This value will be applied only to lines
    * that have the `discounted` flag set to true. If no lines have `discounted` set to true, this discount
    * cannot be applied.
     */
    public BigDecimal getDiscount() {
        return this.discount;
    }

    /**
     * Setter for discount
     *
     * Discount - The discount amount to apply to the document. This value will be applied only to lines
    * that have the `discounted` flag set to true. If no lines have `discounted` set to true, this discount
    * cannot be applied.
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo
     *
     * Purchase Order Number for this document.
    *  
    * This is required for single use exemption certificates to match the order and invoice with the certificate.
     */
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo
     *
     * Purchase Order Number for this document.
    *  
    * This is required for single use exemption certificates to match the order and invoice with the certificate.
     */
    public void setPurchaseOrderNo(String value) {
        this.purchaseOrderNo = value;
    }

    private String exemptionNo;

    /**
     * Getter for exemptionNo
     *
     * Exemption Number for this document.
    *  
    * If you specify an exemption number for this document, this document will be considered exempt, and you
    * may be asked to provide proof of this exemption certificate in the event that you are asked by an auditor
    * to verify your exemptions.
    * Note: This is same as 'exemptNo' in TransactionModel.
     */
    public String getExemptionNo() {
        return this.exemptionNo;
    }

    /**
     * Setter for exemptionNo
     *
     * Exemption Number for this document.
    *  
    * If you specify an exemption number for this document, this document will be considered exempt, and you
    * may be asked to provide proof of this exemption certificate in the event that you are asked by an auditor
    * to verify your exemptions.
    * Note: This is same as 'exemptNo' in TransactionModel.
     */
    public void setExemptionNo(String value) {
        this.exemptionNo = value;
    }

    private AddressesModel addresses;

    /**
     * Getter for addresses
     *
     * Default addresses for all lines in this document.
    *  
    * These addresses are the default values that will be used for any lines that do not have their own
    * address information. If you specify addresses for a line, then no default addresses will be loaded
    * for that line.
     */
    public AddressesModel getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses
     *
     * Default addresses for all lines in this document.
    *  
    * These addresses are the default values that will be used for any lines that do not have their own
    * address information. If you specify addresses for a line, then no default addresses will be loaded
    * for that line.
     */
    public void setAddresses(AddressesModel value) {
        this.addresses = value;
    }

    private ArrayList<TransactionParameterModel> parameters;

    /**
     * Getter for parameters
     *
     * Special parameters for this transaction.
    *  
    * To get a full list of available parameters, please use the [ListParameters](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListParameters/) endpoint.
     */
    public ArrayList<TransactionParameterModel> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Special parameters for this transaction.
    *  
    * To get a full list of available parameters, please use the [ListParameters](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListParameters/) endpoint.
     */
    public void setParameters(ArrayList<TransactionParameterModel> value) {
        this.parameters = value;
    }

    private String referenceCode;

    /**
     * Getter for referenceCode
     *
     * Customer-provided Reference Code with information about this transaction.
    *  
    * This field could be used to reference the original document for a return invoice, or for any other
    * reference purpose.
     */
    public String getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * Customer-provided Reference Code with information about this transaction.
    *  
    * This field could be used to reference the original document for a return invoice, or for any other
    * reference purpose.
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
    *  
    * This value is used by Avalara Managed Returns to group documents together by reporting locations
    * for tax authorities that require location-based reporting.
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
    *  
    * This value is used by Avalara Managed Returns to group documents together by reporting locations
    * for tax authorities that require location-based reporting.
     */
    public void setReportingLocationCode(String value) {
        this.reportingLocationCode = value;
    }

    private Boolean commit;

    /**
     * Getter for commit
     *
     * Causes the document to be committed if true. This option is only applicable for invoice document
    * types, not orders.
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit
     *
     * Causes the document to be committed if true. This option is only applicable for invoice document
    * types, not orders.
     */
    public void setCommit(Boolean value) {
        this.commit = value;
    }

    private String batchCode;

    /**
     * Getter for batchCode
     *
     * BatchCode for batch operations.
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode
     *
     * BatchCode for batch operations.
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
    }

    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride
     *
     * Specifies a tax override for the entire document
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride
     *
     * Specifies a tax override for the entire document
     */
    public void setTaxOverride(TaxOverrideModel value) {
        this.taxOverride = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The three-character ISO 4217 currency code for this transaction.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The three-character ISO 4217 currency code for this transaction.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private ServiceMode serviceMode;

    /**
     * Getter for serviceMode
     *
     * Specifies whether the tax calculation is handled Local, Remote, or Automatic (default). This only
    * applies when using an AvaLocal server.
     */
    public ServiceMode getServiceMode() {
        return this.serviceMode;
    }

    /**
     * Setter for serviceMode
     *
     * Specifies whether the tax calculation is handled Local, Remote, or Automatic (default). This only
    * applies when using an AvaLocal server.
     */
    public void setServiceMode(ServiceMode value) {
        this.serviceMode = value;
    }

    private BigDecimal exchangeRate;

    /**
     * Getter for exchangeRate
     *
     * Currency exchange rate from this transaction to the company base currency.
    *  
    * This only needs to be set if the transaction currency is different than the company base currency.
    * It defaults to 1.0.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate
     *
     * Currency exchange rate from this transaction to the company base currency.
    *  
    * This only needs to be set if the transaction currency is different than the company base currency.
    * It defaults to 1.0.
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    private Date exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate
     *
     * Effective date of the exchange rate.
     */
    public Date getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate
     *
     * Effective date of the exchange rate.
     */
    public void setExchangeRateEffectiveDate(Date value) {
        this.exchangeRateEffectiveDate = value;
    }

    private String exchangeRateCurrencyCode;

    /**
     * Getter for exchangeRateCurrencyCode
     *
     * Optional three-character ISO 4217 reporting exchange rate currency code for this transaction. The default value is USD.
     */
    public String getExchangeRateCurrencyCode() {
        return this.exchangeRateCurrencyCode;
    }

    /**
     * Setter for exchangeRateCurrencyCode
     *
     * Optional three-character ISO 4217 reporting exchange rate currency code for this transaction. The default value is USD.
     */
    public void setExchangeRateCurrencyCode(String value) {
        this.exchangeRateCurrencyCode = value;
    }

    private String posLaneCode;

    /**
     * Getter for posLaneCode
     *
     * Sets the Point of Sale Lane Code sent by the User for this document.
     */
    public String getPosLaneCode() {
        return this.posLaneCode;
    }

    /**
     * Setter for posLaneCode
     *
     * Sets the Point of Sale Lane Code sent by the User for this document.
     */
    public void setPosLaneCode(String value) {
        this.posLaneCode = value;
    }

    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * VAT business identification number for the customer for this transaction. This number will be used for all lines
    * in the transaction, except for those lines where you have defined a different business identification number.
    *  
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * VAT business identification number for the customer for this transaction. This number will be used for all lines
    * in the transaction, except for those lines where you have defined a different business identification number.
    *  
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public void setBusinessIdentificationNo(String value) {
        this.businessIdentificationNo = value;
    }

    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord
     *
     * Specifies if the transaction should have value-added and cross-border taxes calculated with the seller as the importer of record.
    *  
    * Some taxes only apply if the seller is the importer of record for a product. In cases where companies are working together to
    * ship products, there may be mutual agreement as to which company is the entity designated as importer of record. The importer
    * of record will then be the company designated to pay taxes marked as being obligated to the importer of record.
    *  
    * Set this value to `true` to consider your company as the importer of record and collect these taxes.
    *  
    * This value may also be set at the Nexus level. See `NexusModel` for more information.
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord
     *
     * Specifies if the transaction should have value-added and cross-border taxes calculated with the seller as the importer of record.
    *  
    * Some taxes only apply if the seller is the importer of record for a product. In cases where companies are working together to
    * ship products, there may be mutual agreement as to which company is the entity designated as importer of record. The importer
    * of record will then be the company designated to pay taxes marked as being obligated to the importer of record.
    *  
    * Set this value to `true` to consider your company as the importer of record and collect these taxes.
    *  
    * This value may also be set at the Nexus level. See `NexusModel` for more information.
     */
    public void setIsSellerImporterOfRecord(Boolean value) {
        this.isSellerImporterOfRecord = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * User-supplied description for this transaction.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * User-supplied description for this transaction.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String email;

    /**
     * Getter for email
     *
     * User-supplied email address relevant for this transaction.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * User-supplied email address relevant for this transaction.
     */
    public void setEmail(String value) {
        this.email = value;
    }

    private TaxDebugLevel debugLevel;

    /**
     * Getter for debugLevel
     *
     * If the user wishes to request additional debug information from this transaction, specify a level higher than `normal`.
     */
    public TaxDebugLevel getDebugLevel() {
        return this.debugLevel;
    }

    /**
     * Setter for debugLevel
     *
     * If the user wishes to request additional debug information from this transaction, specify a level higher than `normal`.
     */
    public void setDebugLevel(TaxDebugLevel value) {
        this.debugLevel = value;
    }

    /**
     * Returns a JSON string representation of CreateTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
