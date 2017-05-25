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
 * One line item on this transaction.
 */
public class TransactionLineModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this transaction line item.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this transaction line item.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int64? transactionId;

    /**
     * Getter for transactionId;
     * The unique ID number of the transaction to which this line item belongs.
     */
    public Int64? gettransactionId() {;
        return this.transactionId;;
    }

    /**
     * Setter for transactionId;
     * The unique ID number of the transaction to which this line item belongs.
     */
    public void settransactionId(Int64? value) {;
        this.transactionId = value;;
    }


    private String lineNumber;

    /**
     * Getter for lineNumber;
     * The line number or code indicating the line on this invoice or receipt or document.
     */
    public String getlineNumber() {;
        return this.lineNumber;;
    }

    /**
     * Setter for lineNumber;
     * The line number or code indicating the line on this invoice or receipt or document.
     */
    public void setlineNumber(String value) {;
        this.lineNumber = value;;
    }


    private Int32? boundaryOverrideId;

    /**
     * Getter for boundaryOverrideId;
     * The unique ID number of the boundary override applied to this line item.
     */
    public Int32? getboundaryOverrideId() {;
        return this.boundaryOverrideId;;
    }

    /**
     * Setter for boundaryOverrideId;
     * The unique ID number of the boundary override applied to this line item.
     */
    public void setboundaryOverrideId(Int32? value) {;
        this.boundaryOverrideId = value;;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType;
     * The customer usage type for this line item. Usage type often affects taxability rules.
     */
    public String getcustomerUsageType() {;
        return this.customerUsageType;;
    }

    /**
     * Setter for customerUsageType;
     * The customer usage type for this line item. Usage type often affects taxability rules.
     */
    public void setcustomerUsageType(String value) {;
        this.customerUsageType = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A description of the item or service represented by this line.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A description of the item or service represented by this line.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private Int64? destinationAddressId;

    /**
     * Getter for destinationAddressId;
     * The unique ID number of the destination address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the destination address and origin address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public Int64? getdestinationAddressId() {;
        return this.destinationAddressId;;
    }

    /**
     * Setter for destinationAddressId;
     * The unique ID number of the destination address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the destination address and origin address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public void setdestinationAddressId(Int64? value) {;
        this.destinationAddressId = value;;
    }


    private Int64? originAddressId;

    /**
     * Getter for originAddressId;
     * The unique ID number of the origin address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the origin address and destination address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public Int64? getoriginAddressId() {;
        return this.originAddressId;;
    }

    /**
     * Setter for originAddressId;
     * The unique ID number of the origin address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the origin address and destination address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public void setoriginAddressId(Int64? value) {;
        this.originAddressId = value;;
    }


    private Decimal? discountAmount;

    /**
     * Getter for discountAmount;
     * The amount of discount that was applied to this line item. This represents the difference between list price and sale price of the item.
    * In general, a discount represents money that did not change hands; tax is calculated on only the amount of money that changed hands.
     */
    public Decimal? getdiscountAmount() {;
        return this.discountAmount;;
    }

    /**
     * Setter for discountAmount;
     * The amount of discount that was applied to this line item. This represents the difference between list price and sale price of the item.
    * In general, a discount represents money that did not change hands; tax is calculated on only the amount of money that changed hands.
     */
    public void setdiscountAmount(Decimal? value) {;
        this.discountAmount = value;;
    }


    private Int32? discountTypeId;

    /**
     * Getter for discountTypeId;
     * The type of discount, if any, that was applied to this line item.
     */
    public Int32? getdiscountTypeId() {;
        return this.discountTypeId;;
    }

    /**
     * Setter for discountTypeId;
     * The type of discount, if any, that was applied to this line item.
     */
    public void setdiscountTypeId(Int32? value) {;
        this.discountTypeId = value;;
    }


    private Decimal? exemptAmount;

    /**
     * Getter for exemptAmount;
     * The amount of this line item that was exempt.
     */
    public Decimal? getexemptAmount() {;
        return this.exemptAmount;;
    }

    /**
     * Setter for exemptAmount;
     * The amount of this line item that was exempt.
     */
    public void setexemptAmount(Decimal? value) {;
        this.exemptAmount = value;;
    }


    private Int32? exemptCertId;

    /**
     * Getter for exemptCertId;
     * The unique ID number of the exemption certificate that applied to this line item.
     */
    public Int32? getexemptCertId() {;
        return this.exemptCertId;;
    }

    /**
     * Setter for exemptCertId;
     * The unique ID number of the exemption certificate that applied to this line item.
     */
    public void setexemptCertId(Int32? value) {;
        this.exemptCertId = value;;
    }


    private String exemptNo;

    /**
     * Getter for exemptNo;
     * If this line item was exempt, this string contains the word 'Exempt'.
     */
    public String getexemptNo() {;
        return this.exemptNo;;
    }

    /**
     * Setter for exemptNo;
     * If this line item was exempt, this string contains the word 'Exempt'.
     */
    public void setexemptNo(String value) {;
        this.exemptNo = value;;
    }


    private Boolean? isItemTaxable;

    /**
     * Getter for isItemTaxable;
     * True if this item is taxable.
     */
    public Boolean? getisItemTaxable() {;
        return this.isItemTaxable;;
    }

    /**
     * Setter for isItemTaxable;
     * True if this item is taxable.
     */
    public void setisItemTaxable(Boolean? value) {;
        this.isItemTaxable = value;;
    }


    private Boolean? isSSTP;

    /**
     * Getter for isSSTP;
     * True if this item is a Streamlined Sales Tax line item.
     */
    public Boolean? getisSSTP() {;
        return this.isSSTP;;
    }

    /**
     * Setter for isSSTP;
     * True if this item is a Streamlined Sales Tax line item.
     */
    public void setisSSTP(Boolean? value) {;
        this.isSSTP = value;;
    }


    private String itemCode;

    /**
     * Getter for itemCode;
     * The code string of the item represented by this line item.
     */
    public String getitemCode() {;
        return this.itemCode;;
    }

    /**
     * Setter for itemCode;
     * The code string of the item represented by this line item.
     */
    public void setitemCode(String value) {;
        this.itemCode = value;;
    }


    private Decimal? lineAmount;

    /**
     * Getter for lineAmount;
     * The total amount of the transaction, including both taxable and exempt. This is the total price for all items.
    * To determine the individual item price, divide this by quantity.
     */
    public Decimal? getlineAmount() {;
        return this.lineAmount;;
    }

    /**
     * Setter for lineAmount;
     * The total amount of the transaction, including both taxable and exempt. This is the total price for all items.
    * To determine the individual item price, divide this by quantity.
     */
    public void setlineAmount(Decimal? value) {;
        this.lineAmount = value;;
    }


    private Decimal? quantity;

    /**
     * Getter for quantity;
     * The quantity of products sold on this line item.
     */
    public Decimal? getquantity() {;
        return this.quantity;;
    }

    /**
     * Setter for quantity;
     * The quantity of products sold on this line item.
     */
    public void setquantity(Decimal? value) {;
        this.quantity = value;;
    }


    private String ref1;

    /**
     * Getter for ref1;
     * A user-defined reference identifier for this transaction line item.
     */
    public String getref1() {;
        return this.ref1;;
    }

    /**
     * Setter for ref1;
     * A user-defined reference identifier for this transaction line item.
     */
    public void setref1(String value) {;
        this.ref1 = value;;
    }


    private String ref2;

    /**
     * Getter for ref2;
     * A user-defined reference identifier for this transaction line item.
     */
    public String getref2() {;
        return this.ref2;;
    }

    /**
     * Setter for ref2;
     * A user-defined reference identifier for this transaction line item.
     */
    public void setref2(String value) {;
        this.ref2 = value;;
    }


    private DateTime? reportingDate;

    /**
     * Getter for reportingDate;
     * The date when this transaction should be reported. By default, all transactions are reported on the date when the actual transaction took place.
    * In some cases, line items may be reported later due to delayed shipments or other business reasons.
     */
    public DateTime? getreportingDate() {;
        return this.reportingDate;;
    }

    /**
     * Setter for reportingDate;
     * The date when this transaction should be reported. By default, all transactions are reported on the date when the actual transaction took place.
    * In some cases, line items may be reported later due to delayed shipments or other business reasons.
     */
    public void setreportingDate(DateTime? value) {;
        this.reportingDate = value;;
    }


    private String revAccount;

    /**
     * Getter for revAccount;
     * The revenue account number for this line item.
     */
    public String getrevAccount() {;
        return this.revAccount;;
    }

    /**
     * Setter for revAccount;
     * The revenue account number for this line item.
     */
    public void setrevAccount(String value) {;
        this.revAccount = value;;
    }


    private Sourcing? sourcing;

    /**
     * Getter for sourcing;
     * Indicates whether this line item was taxed according to the origin or destination.
     */
    public Sourcing? getsourcing() {;
        return this.sourcing;;
    }

    /**
     * Setter for sourcing;
     * Indicates whether this line item was taxed according to the origin or destination.
     */
    public void setsourcing(Sourcing? value) {;
        this.sourcing = value;;
    }


    private Decimal? tax;

    /**
     * Getter for tax;
     * The amount of tax generated for this line item.
     */
    public Decimal? gettax() {;
        return this.tax;;
    }

    /**
     * Setter for tax;
     * The amount of tax generated for this line item.
     */
    public void settax(Decimal? value) {;
        this.tax = value;;
    }


    private Decimal? taxableAmount;

    /**
     * Getter for taxableAmount;
     * The taxable amount of this line item.
     */
    public Decimal? gettaxableAmount() {;
        return this.taxableAmount;;
    }

    /**
     * Setter for taxableAmount;
     * The taxable amount of this line item.
     */
    public void settaxableAmount(Decimal? value) {;
        this.taxableAmount = value;;
    }


    private Decimal? taxCalculated;

    /**
     * Getter for taxCalculated;
     * The tax calculated for this line by Avalara. If the transaction was calculated with a tax override, this amount will be different from the "tax" value.
     */
    public Decimal? gettaxCalculated() {;
        return this.taxCalculated;;
    }

    /**
     * Setter for taxCalculated;
     * The tax calculated for this line by Avalara. If the transaction was calculated with a tax override, this amount will be different from the "tax" value.
     */
    public void settaxCalculated(Decimal? value) {;
        this.taxCalculated = value;;
    }


    private String taxCode;

    /**
     * Getter for taxCode;
     * The code string for the tax code that was used to calculate this line item.
     */
    public String gettaxCode() {;
        return this.taxCode;;
    }

    /**
     * Setter for taxCode;
     * The code string for the tax code that was used to calculate this line item.
     */
    public void settaxCode(String value) {;
        this.taxCode = value;;
    }


    private Int32? taxCodeId;

    /**
     * Getter for taxCodeId;
     * The unique ID number for the tax code that was used to calculate this line item.
     */
    public Int32? gettaxCodeId() {;
        return this.taxCodeId;;
    }

    /**
     * Setter for taxCodeId;
     * The unique ID number for the tax code that was used to calculate this line item.
     */
    public void settaxCodeId(Int32? value) {;
        this.taxCodeId = value;;
    }


    private DateTime? taxDate;

    /**
     * Getter for taxDate;
     * The date that was used for calculating tax amounts for this line item. By default, this date should be the same as the document date.
    * In some cases, for example when a consumer returns a product purchased previously, line items may be calculated using a tax date in the past
    * so that the consumer can receive a refund for the correct tax amount that was charged when the item was originally purchased.
     */
    public DateTime? gettaxDate() {;
        return this.taxDate;;
    }

    /**
     * Setter for taxDate;
     * The date that was used for calculating tax amounts for this line item. By default, this date should be the same as the document date.
    * In some cases, for example when a consumer returns a product purchased previously, line items may be calculated using a tax date in the past
    * so that the consumer can receive a refund for the correct tax amount that was charged when the item was originally purchased.
     */
    public void settaxDate(DateTime? value) {;
        this.taxDate = value;;
    }


    private String taxEngine;

    /**
     * Getter for taxEngine;
     * The tax engine identifier that was used to calculate this line item.
     */
    public String gettaxEngine() {;
        return this.taxEngine;;
    }

    /**
     * Setter for taxEngine;
     * The tax engine identifier that was used to calculate this line item.
     */
    public void settaxEngine(String value) {;
        this.taxEngine = value;;
    }


    private TaxOverrideTypeId? taxOverrideType;

    /**
     * Getter for taxOverrideType;
     * If a tax override was specified, this indicates the type of tax override.
     */
    public TaxOverrideTypeId? gettaxOverrideType() {;
        return this.taxOverrideType;;
    }

    /**
     * Setter for taxOverrideType;
     * If a tax override was specified, this indicates the type of tax override.
     */
    public void settaxOverrideType(TaxOverrideTypeId? value) {;
        this.taxOverrideType = value;;
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


    private Decimal? taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount;
     * If a tax override was specified, this indicates the amount of tax that was requested.
     */
    public Decimal? gettaxOverrideAmount() {;
        return this.taxOverrideAmount;;
    }

    /**
     * Setter for taxOverrideAmount;
     * If a tax override was specified, this indicates the amount of tax that was requested.
     */
    public void settaxOverrideAmount(Decimal? value) {;
        this.taxOverrideAmount = value;;
    }


    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason;
     * If a tax override was specified, represents the reason for the tax override.
     */
    public String gettaxOverrideReason() {;
        return this.taxOverrideReason;;
    }

    /**
     * Setter for taxOverrideReason;
     * If a tax override was specified, represents the reason for the tax override.
     */
    public void settaxOverrideReason(String value) {;
        this.taxOverrideReason = value;;
    }


    private Boolean? taxIncluded;

    /**
     * Getter for taxIncluded;
     * True if tax was included in the purchase price of the item.
     */
    public Boolean? gettaxIncluded() {;
        return this.taxIncluded;;
    }

    /**
     * Setter for taxIncluded;
     * True if tax was included in the purchase price of the item.
     */
    public void settaxIncluded(Boolean? value) {;
        this.taxIncluded = value;;
    }


    private List<TransactionLineDetailModel> details;

    /**
     * Getter for details;
     * Optional: A list of tax details for this line item. To fetch this list, add the query string "?$include=Details" to your URL.
     */
    public List<TransactionLineDetailModel> getdetails() {;
        return this.details;;
    }

    /**
     * Setter for details;
     * Optional: A list of tax details for this line item. To fetch this list, add the query string "?$include=Details" to your URL.
     */
    public void setdetails(List<TransactionLineDetailModel> value) {;
        this.details = value;;
    }


    private List<TransactionLineLocationTypeModel> lineLocationTypes;

    /**
     * Getter for lineLocationTypes;
     * Optional: A list of location types for this line item. To fetch this list, add the query string "?$include=LineLocationTypes" to your URL.
     */
    public List<TransactionLineLocationTypeModel> getlineLocationTypes() {;
        return this.lineLocationTypes;;
    }

    /**
     * Setter for lineLocationTypes;
     * Optional: A list of location types for this line item. To fetch this list, add the query string "?$include=LineLocationTypes" to your URL.
     */
    public void setlineLocationTypes(List<TransactionLineLocationTypeModel> value) {;
        this.lineLocationTypes = value;;
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


    /**
     * Returns a JSON string representation of TransactionLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
