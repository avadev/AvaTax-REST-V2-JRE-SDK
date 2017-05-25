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
 * Create a transaction
 */
public class CreateTransactionModel {


    private DocumentType? type;

    /**
     * Getter for type;
     * Document Type: if not specified, a document with type of SalesOrder will be created by default
     */
    public DocumentType? gettype() {;
        return this.type;;
    }

    /**
     * Setter for type;
     * Document Type: if not specified, a document with type of SalesOrder will be created by default
     */
    public void settype(DocumentType? value) {;
        this.type = value;;
    }


    private String code;

    /**
     * Getter for code;
     * Transaction Code - the internal reference code used by the client application. This is used for operations such as
    * Get, Adjust, Settle, and Void. If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public String getcode() {;
        return this.code;;
    }

    /**
     * Setter for code;
     * Transaction Code - the internal reference code used by the client application. This is used for operations such as
    * Get, Adjust, Settle, and Void. If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public void setcode(String value) {;
        this.code = value;;
    }


    private String companyCode;

    /**
     * Getter for companyCode;
     * Company Code - Specify the code of the company creating this transaction here. If you leave this value null,
    * your account's default company will be used instead.
     */
    public String getcompanyCode() {;
        return this.companyCode;;
    }

    /**
     * Setter for companyCode;
     * Company Code - Specify the code of the company creating this transaction here. If you leave this value null,
    * your account's default company will be used instead.
     */
    public void setcompanyCode(String value) {;
        this.companyCode = value;;
    }


    private DateTime date;

    /**
     * Getter for date;
     * Transaction Date - The date on the invoice, purchase order, etc.
     */
    public DateTime getdate() {;
        return this.date;;
    }

    /**
     * Setter for date;
     * Transaction Date - The date on the invoice, purchase order, etc.
     */
    public void setdate(DateTime value) {;
        this.date = value;;
    }


    private String salespersonCode;

    /**
     * Getter for salespersonCode;
     * Salesperson Code - The client application salesperson reference code.
     */
    public String getsalespersonCode() {;
        return this.salespersonCode;;
    }

    /**
     * Setter for salespersonCode;
     * Salesperson Code - The client application salesperson reference code.
     */
    public void setsalespersonCode(String value) {;
        this.salespersonCode = value;;
    }


    private String customerCode;

    /**
     * Getter for customerCode;
     * Customer Code - The client application customer reference code.
     */
    public String getcustomerCode() {;
        return this.customerCode;;
    }

    /**
     * Setter for customerCode;
     * Customer Code - The client application customer reference code.
     */
    public void setcustomerCode(String value) {;
        this.customerCode = value;;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType;
     * Customer Usage Type - The client application customer or usage type. For a list of 
    * available usage types, see `/api/v2/definitions/entityusecodes`.
     */
    public String getcustomerUsageType() {;
        return this.customerUsageType;;
    }

    /**
     * Setter for customerUsageType;
     * Customer Usage Type - The client application customer or usage type. For a list of 
    * available usage types, see `/api/v2/definitions/entityusecodes`.
     */
    public void setcustomerUsageType(String value) {;
        this.customerUsageType = value;;
    }


    private Decimal? discount;

    /**
     * Getter for discount;
     * Discount - The discount amount to apply to the document. This value will be applied only to lines
    * that have the `discounted` flag set to true. If no lines have `discounted` set to true, this discount
    * cannot be applied.
     */
    public Decimal? getdiscount() {;
        return this.discount;;
    }

    /**
     * Setter for discount;
     * Discount - The discount amount to apply to the document. This value will be applied only to lines
    * that have the `discounted` flag set to true. If no lines have `discounted` set to true, this discount
    * cannot be applied.
     */
    public void setdiscount(Decimal? value) {;
        this.discount = value;;
    }


    private String purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo;
     * Purchase Order Number for this document
    * This is required for single use exemption certificates to match the order and invoice with the certificate.
     */
    public String getpurchaseOrderNo() {;
        return this.purchaseOrderNo;;
    }

    /**
     * Setter for purchaseOrderNo;
     * Purchase Order Number for this document
    * This is required for single use exemption certificates to match the order and invoice with the certificate.
     */
    public void setpurchaseOrderNo(String value) {;
        this.purchaseOrderNo = value;;
    }


    private String exemptionNo;

    /**
     * Getter for exemptionNo;
     * Exemption Number for this document
     */
    public String getexemptionNo() {;
        return this.exemptionNo;;
    }

    /**
     * Setter for exemptionNo;
     * Exemption Number for this document
     */
    public void setexemptionNo(String value) {;
        this.exemptionNo = value;;
    }


    private AddressesModel addresses;

    /**
     * Getter for addresses;
     * Default addresses for all lines in this document
     */
    public AddressesModel getaddresses() {;
        return this.addresses;;
    }

    /**
     * Setter for addresses;
     * Default addresses for all lines in this document
     */
    public void setaddresses(AddressesModel value) {;
        this.addresses = value;;
    }


    private List<LineItemModel> lines;

    /**
     * Getter for lines;
     * Document line items list
     */
    public List<LineItemModel> getlines() {;
        return this.lines;;
    }

    /**
     * Setter for lines;
     * Document line items list
     */
    public void setlines(List<LineItemModel> value) {;
        this.lines = value;;
    }


    private Dictionary<string, string> parameters;

    /**
     * Getter for parameters;
     * Special parameters for this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public Dictionary<string, string> getparameters() {;
        return this.parameters;;
    }

    /**
     * Setter for parameters;
     * Special parameters for this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public void setparameters(Dictionary<string, string> value) {;
        this.parameters = value;;
    }


    private String referenceCode;

    /**
     * Getter for referenceCode;
     * Reference Code used to reference the original document for a return invoice
     */
    public String getreferenceCode() {;
        return this.referenceCode;;
    }

    /**
     * Setter for referenceCode;
     * Reference Code used to reference the original document for a return invoice
     */
    public void setreferenceCode(String value) {;
        this.referenceCode = value;;
    }


    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode;
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public String getreportingLocationCode() {;
        return this.reportingLocationCode;;
    }

    /**
     * Setter for reportingLocationCode;
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public void setreportingLocationCode(String value) {;
        this.reportingLocationCode = value;;
    }


    private Boolean? commit;

    /**
     * Getter for commit;
     * Causes the document to be committed if true. This option is only applicable for invoice document 
    * types, not orders.
     */
    public Boolean? getcommit() {;
        return this.commit;;
    }

    /**
     * Setter for commit;
     * Causes the document to be committed if true. This option is only applicable for invoice document 
    * types, not orders.
     */
    public void setcommit(Boolean? value) {;
        this.commit = value;;
    }


    private String batchCode;

    /**
     * Getter for batchCode;
     * BatchCode for batch operations.
     */
    public String getbatchCode() {;
        return this.batchCode;;
    }

    /**
     * Setter for batchCode;
     * BatchCode for batch operations.
     */
    public void setbatchCode(String value) {;
        this.batchCode = value;;
    }


    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride;
     * Specifies a tax override for the entire document
     */
    public TaxOverrideModel gettaxOverride() {;
        return this.taxOverride;;
    }

    /**
     * Setter for taxOverride;
     * Specifies a tax override for the entire document
     */
    public void settaxOverride(TaxOverrideModel value) {;
        this.taxOverride = value;;
    }


    private String currencyCode;

    /**
     * Getter for currencyCode;
     * 3 character ISO 4217 currency code.
     */
    public String getcurrencyCode() {;
        return this.currencyCode;;
    }

    /**
     * Setter for currencyCode;
     * 3 character ISO 4217 currency code.
     */
    public void setcurrencyCode(String value) {;
        this.currencyCode = value;;
    }


    private ServiceMode? serviceMode;

    /**
     * Getter for serviceMode;
     * Specifies whether the tax calculation is handled Local, Remote, or Automatic (default). This only 
    * applies when using an AvaLocal server.
     */
    public ServiceMode? getserviceMode() {;
        return this.serviceMode;;
    }

    /**
     * Setter for serviceMode;
     * Specifies whether the tax calculation is handled Local, Remote, or Automatic (default). This only 
    * applies when using an AvaLocal server.
     */
    public void setserviceMode(ServiceMode? value) {;
        this.serviceMode = value;;
    }


    private Decimal? exchangeRate;

    /**
     * Getter for exchangeRate;
     * Currency exchange rate from this transaction to the company base currency.
     */
    public Decimal? getexchangeRate() {;
        return this.exchangeRate;;
    }

    /**
     * Setter for exchangeRate;
     * Currency exchange rate from this transaction to the company base currency.
     */
    public void setexchangeRate(Decimal? value) {;
        this.exchangeRate = value;;
    }


    private DateTime? exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate;
     * Effective date of the exchange rate.
     */
    public DateTime? getexchangeRateEffectiveDate() {;
        return this.exchangeRateEffectiveDate;;
    }

    /**
     * Setter for exchangeRateEffectiveDate;
     * Effective date of the exchange rate.
     */
    public void setexchangeRateEffectiveDate(DateTime? value) {;
        this.exchangeRateEffectiveDate = value;;
    }


    private String posLaneCode;

    /**
     * Getter for posLaneCode;
     * Sets the POS Lane Code sent by the User for this document.
     */
    public String getposLaneCode() {;
        return this.posLaneCode;;
    }

    /**
     * Setter for posLaneCode;
     * Sets the POS Lane Code sent by the User for this document.
     */
    public void setposLaneCode(String value) {;
        this.posLaneCode = value;;
    }


    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo;
     * VAT business identification number for the customer for this transaction. This number will be used for all lines 
    * in the transaction, except for those lines where you have defined a different business identification number.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public String getbusinessIdentificationNo() {;
        return this.businessIdentificationNo;;
    }

    /**
     * Setter for businessIdentificationNo;
     * VAT business identification number for the customer for this transaction. This number will be used for all lines 
    * in the transaction, except for those lines where you have defined a different business identification number.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public void setbusinessIdentificationNo(String value) {;
        this.businessIdentificationNo = value;;
    }


    private Boolean? isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord;
     * Specifies if the Transaction has the seller as IsSellerImporterOfRecord
     */
    public Boolean? getisSellerImporterOfRecord() {;
        return this.isSellerImporterOfRecord;;
    }

    /**
     * Setter for isSellerImporterOfRecord;
     * Specifies if the Transaction has the seller as IsSellerImporterOfRecord
     */
    public void setisSellerImporterOfRecord(Boolean? value) {;
        this.isSellerImporterOfRecord = value;;
    }


    private String description;

    /**
     * Getter for description;
     * Description
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * Description
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String email;

    /**
     * Getter for email;
     * Email
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * Email
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private TaxDebugLevel? debugLevel;

    /**
     * Getter for debugLevel;
     * If the user wishes to request additional debug information from this transaction, specify a level higher than 'normal'
     */
    public TaxDebugLevel? getdebugLevel() {;
        return this.debugLevel;;
    }

    /**
     * Setter for debugLevel;
     * If the user wishes to request additional debug information from this transaction, specify a level higher than 'normal'
     */
    public void setdebugLevel(TaxDebugLevel? value) {;
        this.debugLevel = value;;
    }


    /**
     * Returns a JSON string representation of CreateTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
