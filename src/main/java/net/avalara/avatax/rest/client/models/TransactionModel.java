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


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this transaction.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this transaction.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private String code;

    /**
     * Getter for code;
     * A unique customer-provided code identifying this transaction.
     */
    public String getcode() {;
        return this.code;;
    }

    /**
     * Setter for code;
     * A unique customer-provided code identifying this transaction.
     */
    public void setcode(String value) {;
        this.code = value;;
    }


    private Int32? companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company that recorded this transaction.
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company that recorded this transaction.
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private DateTime? date;

    /**
     * Getter for date;
     * The date on which this transaction occurred.
     */
    public DateTime? getdate() {;
        return this.date;;
    }

    /**
     * Setter for date;
     * The date on which this transaction occurred.
     */
    public void setdate(DateTime? value) {;
        this.date = value;;
    }


    private DateTime? paymentDate;

    /**
     * Getter for paymentDate;
     * The date when payment was made on this transaction. By default, this should be the same as the date of the transaction.
     */
    public DateTime? getpaymentDate() {;
        return this.paymentDate;;
    }

    /**
     * Setter for paymentDate;
     * The date when payment was made on this transaction. By default, this should be the same as the date of the transaction.
     */
    public void setpaymentDate(DateTime? value) {;
        this.paymentDate = value;;
    }


    private DocumentStatus? status;

    /**
     * Getter for status;
     * The status of the transaction.
     */
    public DocumentStatus? getstatus() {;
        return this.status;;
    }

    /**
     * Setter for status;
     * The status of the transaction.
     */
    public void setstatus(DocumentStatus? value) {;
        this.status = value;;
    }


    private DocumentType? type;

    /**
     * Getter for type;
     * The type of the transaction. For Returns customers, a transaction type of "Invoice" will be reported to the tax authorities.
    * A sales transaction represents a sale from the company to a customer. A purchase transaction represents a purchase made by the company.
    * A return transaction represents a customer who decided to request a refund after purchasing a product from the company. An inventory 
    * transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public DocumentType? gettype() {;
        return this.type;;
    }

    /**
     * Setter for type;
     * The type of the transaction. For Returns customers, a transaction type of "Invoice" will be reported to the tax authorities.
    * A sales transaction represents a sale from the company to a customer. A purchase transaction represents a purchase made by the company.
    * A return transaction represents a customer who decided to request a refund after purchasing a product from the company. An inventory 
    * transfer transaction represents goods that were moved from one location of the company to another location without changing ownership.
     */
    public void settype(DocumentType? value) {;
        this.type = value;;
    }


    private String batchCode;

    /**
     * Getter for batchCode;
     * If this transaction was created as part of a batch, this code indicates which batch.
     */
    public String getbatchCode() {;
        return this.batchCode;;
    }

    /**
     * Setter for batchCode;
     * If this transaction was created as part of a batch, this code indicates which batch.
     */
    public void setbatchCode(String value) {;
        this.batchCode = value;;
    }


    private String currencyCode;

    /**
     * Getter for currencyCode;
     * The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public String getcurrencyCode() {;
        return this.currencyCode;;
    }

    /**
     * Setter for currencyCode;
     * The three-character ISO 4217 currency code that was used for payment for this transaction.
     */
    public void setcurrencyCode(String value) {;
        this.currencyCode = value;;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType;
     * The customer usage type for this transaction. Customer usage types often affect exemption or taxability rules.
     */
    public String getcustomerUsageType() {;
        return this.customerUsageType;;
    }

    /**
     * Setter for customerUsageType;
     * The customer usage type for this transaction. Customer usage types often affect exemption or taxability rules.
     */
    public void setcustomerUsageType(String value) {;
        this.customerUsageType = value;;
    }


    private String customerVendorCode;

    /**
     * Getter for customerVendorCode;
     * CustomerVendorCode
     */
    public String getcustomerVendorCode() {;
        return this.customerVendorCode;;
    }

    /**
     * Setter for customerVendorCode;
     * CustomerVendorCode
     */
    public void setcustomerVendorCode(String value) {;
        this.customerVendorCode = value;;
    }


    private String exemptNo;

    /**
     * Getter for exemptNo;
     * If this transaction was exempt, this field will contain the word "Exempt".
     */
    public String getexemptNo() {;
        return this.exemptNo;;
    }

    /**
     * Setter for exemptNo;
     * If this transaction was exempt, this field will contain the word "Exempt".
     */
    public void setexemptNo(String value) {;
        this.exemptNo = value;;
    }


    private Boolean? reconciled;

    /**
     * Getter for reconciled;
     * If this transaction has been reconciled against the company's ledger, this value is set to true.
     */
    public Boolean? getreconciled() {;
        return this.reconciled;;
    }

    /**
     * Setter for reconciled;
     * If this transaction has been reconciled against the company's ledger, this value is set to true.
     */
    public void setreconciled(Boolean? value) {;
        this.reconciled = value;;
    }


    private String locationCode;

    /**
     * Getter for locationCode;
     * If this transaction was made from a specific reporting location, this is the code string of the location.
    * For customers using Returns, this indicates how tax will be reported according to different locations on the tax forms.
     */
    public String getlocationCode() {;
        return this.locationCode;;
    }

    /**
     * Setter for locationCode;
     * If this transaction was made from a specific reporting location, this is the code string of the location.
    * For customers using Returns, this indicates how tax will be reported according to different locations on the tax forms.
     */
    public void setlocationCode(String value) {;
        this.locationCode = value;;
    }


    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo;
     * The customer-supplied purchase order number of this transaction.
     */
    public String getpurchaseOrderNo() {;
        return this.purchaseOrderNo;;
    }

    /**
     * Setter for purchaseOrderNo;
     * The customer-supplied purchase order number of this transaction.
     */
    public void setpurchaseOrderNo(String value) {;
        this.purchaseOrderNo = value;;
    }


    private String referenceCode;

    /**
     * Getter for referenceCode;
     * A user-defined reference code for this transaction.
     */
    public String getreferenceCode() {;
        return this.referenceCode;;
    }

    /**
     * Setter for referenceCode;
     * A user-defined reference code for this transaction.
     */
    public void setreferenceCode(String value) {;
        this.referenceCode = value;;
    }


    private String salespersonCode;

    /**
     * Getter for salespersonCode;
     * The salesperson who provided this transaction. Not required.
     */
    public String getsalespersonCode() {;
        return this.salespersonCode;;
    }

    /**
     * Setter for salespersonCode;
     * The salesperson who provided this transaction. Not required.
     */
    public void setsalespersonCode(String value) {;
        this.salespersonCode = value;;
    }


    private TaxOverrideTypeId? taxOverrideType;

    /**
     * Getter for taxOverrideType;
     * If a tax override was applied to this transaction, indicates what type of tax override was applied.
     */
    public TaxOverrideTypeId? gettaxOverrideType() {;
        return this.taxOverrideType;;
    }

    /**
     * Setter for taxOverrideType;
     * If a tax override was applied to this transaction, indicates what type of tax override was applied.
     */
    public void settaxOverrideType(TaxOverrideTypeId? value) {;
        this.taxOverrideType = value;;
    }


    private Decimal? taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount;
     * If a tax override was applied to this transaction, indicates the amount of tax that was requested by the customer.
     */
    public Decimal? gettaxOverrideAmount() {;
        return this.taxOverrideAmount;;
    }

    /**
     * Setter for taxOverrideAmount;
     * If a tax override was applied to this transaction, indicates the amount of tax that was requested by the customer.
     */
    public void settaxOverrideAmount(Decimal? value) {;
        this.taxOverrideAmount = value;;
    }


    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason;
     * If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public String gettaxOverrideReason() {;
        return this.taxOverrideReason;;
    }

    /**
     * Setter for taxOverrideReason;
     * If a tax override was applied to this transaction, indicates the reason for the tax override.
     */
    public void settaxOverrideReason(String value) {;
        this.taxOverrideReason = value;;
    }


    private Decimal? totalAmount;

    /**
     * Getter for totalAmount;
     * The total amount of this transaction.
     */
    public Decimal? gettotalAmount() {;
        return this.totalAmount;;
    }

    /**
     * Setter for totalAmount;
     * The total amount of this transaction.
     */
    public void settotalAmount(Decimal? value) {;
        this.totalAmount = value;;
    }


    private Decimal? totalExempt;

    /**
     * Getter for totalExempt;
     * The amount of this transaction that was exempt.
     */
    public Decimal? gettotalExempt() {;
        return this.totalExempt;;
    }

    /**
     * Setter for totalExempt;
     * The amount of this transaction that was exempt.
     */
    public void settotalExempt(Decimal? value) {;
        this.totalExempt = value;;
    }


    private Decimal? totalTax;

    /**
     * Getter for totalTax;
     * The total tax calculated for all lines in this transaction.
     */
    public Decimal? gettotalTax() {;
        return this.totalTax;;
    }

    /**
     * Setter for totalTax;
     * The total tax calculated for all lines in this transaction.
     */
    public void settotalTax(Decimal? value) {;
        this.totalTax = value;;
    }


    private Decimal? totalTaxable;

    /**
     * Getter for totalTaxable;
     * The portion of the total amount of this transaction that was taxable.
     */
    public Decimal? gettotalTaxable() {;
        return this.totalTaxable;;
    }

    /**
     * Setter for totalTaxable;
     * The portion of the total amount of this transaction that was taxable.
     */
    public void settotalTaxable(Decimal? value) {;
        this.totalTaxable = value;;
    }


    private Decimal? totalTaxCalculated;

    /**
     * Getter for totalTaxCalculated;
     * If a tax override was applied to this transaction, indicates the amount of tax Avalara calculated for the transaction.
     */
    public Decimal? gettotalTaxCalculated() {;
        return this.totalTaxCalculated;;
    }

    /**
     * Setter for totalTaxCalculated;
     * If a tax override was applied to this transaction, indicates the amount of tax Avalara calculated for the transaction.
     */
    public void settotalTaxCalculated(Decimal? value) {;
        this.totalTaxCalculated = value;;
    }


    private AdjustmentReason? adjustmentReason;

    /**
     * Getter for adjustmentReason;
     * If this transaction was adjusted, indicates the unique ID number of the reason why the transaction was adjusted.
     */
    public AdjustmentReason? getadjustmentReason() {;
        return this.adjustmentReason;;
    }

    /**
     * Setter for adjustmentReason;
     * If this transaction was adjusted, indicates the unique ID number of the reason why the transaction was adjusted.
     */
    public void setadjustmentReason(AdjustmentReason? value) {;
        this.adjustmentReason = value;;
    }


    private String adjustmentDescription;

    /**
     * Getter for adjustmentDescription;
     * If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public String getadjustmentDescription() {;
        return this.adjustmentDescription;;
    }

    /**
     * Setter for adjustmentDescription;
     * If this transaction was adjusted, indicates a description of the reason why the transaction was adjusted.
     */
    public void setadjustmentDescription(String value) {;
        this.adjustmentDescription = value;;
    }


    private Boolean? locked;

    /**
     * Getter for locked;
     * If this transaction has been reported to a tax authority, this transaction is considered locked and may not be adjusted after reporting.
     */
    public Boolean? getlocked() {;
        return this.locked;;
    }

    /**
     * Setter for locked;
     * If this transaction has been reported to a tax authority, this transaction is considered locked and may not be adjusted after reporting.
     */
    public void setlocked(Boolean? value) {;
        this.locked = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The two-or-three character ISO region code of the region for this transaction.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The two-or-three character ISO region code of the region for this transaction.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two-character ISO 3166 code of the country for this transaction.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two-character ISO 3166 code of the country for this transaction.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private Int32? version;

    /**
     * Getter for version;
     * If this transaction was adjusted, this indicates the version number of this transaction. Incremented each time the transaction
    * is adjusted.
     */
    public Int32? getversion() {;
        return this.version;;
    }

    /**
     * Setter for version;
     * If this transaction was adjusted, this indicates the version number of this transaction. Incremented each time the transaction
    * is adjusted.
     */
    public void setversion(Int32? value) {;
        this.version = value;;
    }


    private String softwareVersion;

    /**
     * Getter for softwareVersion;
     * The software version used to calculate this transaction.
     */
    public String getsoftwareVersion() {;
        return this.softwareVersion;;
    }

    /**
     * Setter for softwareVersion;
     * The software version used to calculate this transaction.
     */
    public void setsoftwareVersion(String value) {;
        this.softwareVersion = value;;
    }


    private Int64? originAddressId;

    /**
     * Getter for originAddressId;
     * The unique ID number of the origin address for this transaction.
     */
    public Int64? getoriginAddressId() {;
        return this.originAddressId;;
    }

    /**
     * Setter for originAddressId;
     * The unique ID number of the origin address for this transaction.
     */
    public void setoriginAddressId(Int64? value) {;
        this.originAddressId = value;;
    }


    private Int64? destinationAddressId;

    /**
     * Getter for destinationAddressId;
     * The unique ID number of the destination address for this transaction.
     */
    public Int64? getdestinationAddressId() {;
        return this.destinationAddressId;;
    }

    /**
     * Setter for destinationAddressId;
     * The unique ID number of the destination address for this transaction.
     */
    public void setdestinationAddressId(Int64? value) {;
        this.destinationAddressId = value;;
    }


    private DateTime? exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate;
     * If this transaction included foreign currency exchange, this is the date as of which the exchange rate was calculated.
     */
    public DateTime? getexchangeRateEffectiveDate() {;
        return this.exchangeRateEffectiveDate;;
    }

    /**
     * Setter for exchangeRateEffectiveDate;
     * If this transaction included foreign currency exchange, this is the date as of which the exchange rate was calculated.
     */
    public void setexchangeRateEffectiveDate(DateTime? value) {;
        this.exchangeRateEffectiveDate = value;;
    }


    private Decimal? exchangeRate;

    /**
     * Getter for exchangeRate;
     * If this transaction included foreign currency exchange, this is the exchange rate that was used.
     */
    public Decimal? getexchangeRate() {;
        return this.exchangeRate;;
    }

    /**
     * Setter for exchangeRate;
     * If this transaction included foreign currency exchange, this is the exchange rate that was used.
     */
    public void setexchangeRate(Decimal? value) {;
        this.exchangeRate = value;;
    }


    private Boolean? isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord;
     * If true, this seller was considered the importer of record of a product shipped internationally.
     */
    public Boolean? getisSellerImporterOfRecord() {;
        return this.isSellerImporterOfRecord;;
    }

    /**
     * Setter for isSellerImporterOfRecord;
     * If true, this seller was considered the importer of record of a product shipped internationally.
     */
    public void setisSellerImporterOfRecord(Boolean? value) {;
        this.isSellerImporterOfRecord = value;;
    }


    private String description;

    /**
     * Getter for description;
     * Description of this transaction.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * Description of this transaction.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String email;

    /**
     * Getter for email;
     * Email address associated with this transaction.
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * Email address associated with this transaction.
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo;
     * VAT business identification number used for this transaction.
     */
    public String getbusinessIdentificationNo() {;
        return this.businessIdentificationNo;;
    }

    /**
     * Setter for businessIdentificationNo;
     * VAT business identification number used for this transaction.
     */
    public void setbusinessIdentificationNo(String value) {;
        this.businessIdentificationNo = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private DateTime? taxDate;

    /**
     * Getter for taxDate;
     * Tax date for this transaction
     */
    public DateTime? gettaxDate() {;
        return this.taxDate;;
    }

    /**
     * Setter for taxDate;
     * Tax date for this transaction
     */
    public void settaxDate(DateTime? value) {;
        this.taxDate = value;;
    }


    private List<TransactionLineModel> lines;

    /**
     * Getter for lines;
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Lines" or "?$include=Details" to your URL.
     */
    public List<TransactionLineModel> getlines() {;
        return this.lines;;
    }

    /**
     * Setter for lines;
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Lines" or "?$include=Details" to your URL.
     */
    public void setlines(List<TransactionLineModel> value) {;
        this.lines = value;;
    }


    private List<TransactionAddressModel> addresses;

    /**
     * Getter for addresses;
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public List<TransactionAddressModel> getaddresses() {;
        return this.addresses;;
    }

    /**
     * Setter for addresses;
     * Optional: A list of line items in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public void setaddresses(List<TransactionAddressModel> value) {;
        this.addresses = value;;
    }


    private List<TransactionLocationTypeModel> locationTypes;

    /**
     * Getter for locationTypes;
     * Optional: A list of location types in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public List<TransactionLocationTypeModel> getlocationTypes() {;
        return this.locationTypes;;
    }

    /**
     * Setter for locationTypes;
     * Optional: A list of location types in this transaction. To fetch this list, add the query string "?$include=Addresses" to your URL.
     */
    public void setlocationTypes(List<TransactionLocationTypeModel> value) {;
        this.locationTypes = value;;
    }


    private List<TransactionModel> history;

    /**
     * Getter for history;
     * If this transaction has been adjusted, this list contains all the previous versions of the document.
     */
    public List<TransactionModel> gethistory() {;
        return this.history;;
    }

    /**
     * Setter for history;
     * If this transaction has been adjusted, this list contains all the previous versions of the document.
     */
    public void sethistory(List<TransactionModel> value) {;
        this.history = value;;
    }


    private List<TransactionSummary> summary;

    /**
     * Getter for summary;
     * Contains a summary of tax on this transaction.
     */
    public List<TransactionSummary> getsummary() {;
        return this.summary;;
    }

    /**
     * Setter for summary;
     * Contains a summary of tax on this transaction.
     */
    public void setsummary(List<TransactionSummary> value) {;
        this.summary = value;;
    }


    private Dictionary<string, string> parameters;

    /**
     * Getter for parameters;
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public Dictionary<string, string> getparameters() {;
        return this.parameters;;
    }

    /**
     * Setter for parameters;
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public void setparameters(Dictionary<string, string> value) {;
        this.parameters = value;;
    }


    private List<AvaTaxMessage> messages;

    /**
     * Getter for messages;
     * List of informational and warning messages regarding this API call. These messages are only relevant to the current API call.
     */
    public List<AvaTaxMessage> getmessages() {;
        return this.messages;;
    }

    /**
     * Setter for messages;
     * List of informational and warning messages regarding this API call. These messages are only relevant to the current API call.
     */
    public void setmessages(List<AvaTaxMessage> value) {;
        this.messages = value;;
    }


    /**
     * Returns a JSON string representation of TransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
