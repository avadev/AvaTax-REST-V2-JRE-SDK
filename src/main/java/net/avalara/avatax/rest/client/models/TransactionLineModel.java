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


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this transaction line item.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this transaction line item.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Long transactionId;

    /**
     * Getter for transactionId
     *
     * The unique ID number of the transaction to which this line item belongs.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId
     *
     * The unique ID number of the transaction to which this line item belongs.
     */
    public void setTransactionId(Long value) {
        this.transactionId = value;
    }


    private string lineNumber;

    /**
     * Getter for lineNumber
     *
     * The line number or code indicating the line on this invoice or receipt or document.
     */
    public string getLineNumber() {
        return this.lineNumber;
    }

    /**
     * Setter for lineNumber
     *
     * The line number or code indicating the line on this invoice or receipt or document.
     */
    public void setLineNumber(string value) {
        this.lineNumber = value;
    }


    private Integer boundaryOverrideId;

    /**
     * Getter for boundaryOverrideId
     *
     * The unique ID number of the boundary override applied to this line item.
     */
    public Integer getBoundaryOverrideId() {
        return this.boundaryOverrideId;
    }

    /**
     * Setter for boundaryOverrideId
     *
     * The unique ID number of the boundary override applied to this line item.
     */
    public void setBoundaryOverrideId(Integer value) {
        this.boundaryOverrideId = value;
    }


    private string customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * The customer usage type for this line item. Usage type often affects taxability rules.
     */
    public string getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * The customer usage type for this line item. Usage type often affects taxability rules.
     */
    public void setCustomerUsageType(string value) {
        this.customerUsageType = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * A description of the item or service represented by this line.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of the item or service represented by this line.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private Long destinationAddressId;

    /**
     * Getter for destinationAddressId
     *
     * The unique ID number of the destination address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the destination address and origin address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public Long getDestinationAddressId() {
        return this.destinationAddressId;
    }

    /**
     * Setter for destinationAddressId
     *
     * The unique ID number of the destination address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the destination address and origin address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public void setDestinationAddressId(Long value) {
        this.destinationAddressId = value;
    }


    private Long originAddressId;

    /**
     * Getter for originAddressId
     *
     * The unique ID number of the origin address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the origin address and destination address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public Long getOriginAddressId() {
        return this.originAddressId;
    }

    /**
     * Setter for originAddressId
     *
     * The unique ID number of the origin address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the origin address and destination address will be the same.
    * In the case of a shipped transaction, they will be different.
     */
    public void setOriginAddressId(Long value) {
        this.originAddressId = value;
    }


    private Decimal discountAmount;

    /**
     * Getter for discountAmount
     *
     * The amount of discount that was applied to this line item. This represents the difference between list price and sale price of the item.
    * In general, a discount represents money that did not change hands; tax is calculated on only the amount of money that changed hands.
     */
    public Decimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Setter for discountAmount
     *
     * The amount of discount that was applied to this line item. This represents the difference between list price and sale price of the item.
    * In general, a discount represents money that did not change hands; tax is calculated on only the amount of money that changed hands.
     */
    public void setDiscountAmount(Decimal value) {
        this.discountAmount = value;
    }


    private Integer discountTypeId;

    /**
     * Getter for discountTypeId
     *
     * The type of discount, if any, that was applied to this line item.
     */
    public Integer getDiscountTypeId() {
        return this.discountTypeId;
    }

    /**
     * Setter for discountTypeId
     *
     * The type of discount, if any, that was applied to this line item.
     */
    public void setDiscountTypeId(Integer value) {
        this.discountTypeId = value;
    }


    private Decimal exemptAmount;

    /**
     * Getter for exemptAmount
     *
     * The amount of this line item that was exempt.
     */
    public Decimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount
     *
     * The amount of this line item that was exempt.
     */
    public void setExemptAmount(Decimal value) {
        this.exemptAmount = value;
    }


    private Integer exemptCertId;

    /**
     * Getter for exemptCertId
     *
     * The unique ID number of the exemption certificate that applied to this line item.
     */
    public Integer getExemptCertId() {
        return this.exemptCertId;
    }

    /**
     * Setter for exemptCertId
     *
     * The unique ID number of the exemption certificate that applied to this line item.
     */
    public void setExemptCertId(Integer value) {
        this.exemptCertId = value;
    }


    private string exemptNo;

    /**
     * Getter for exemptNo
     *
     * If this line item was exempt, this string contains the word 'Exempt'.
     */
    public string getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo
     *
     * If this line item was exempt, this string contains the word 'Exempt'.
     */
    public void setExemptNo(string value) {
        this.exemptNo = value;
    }


    private object isItemTaxable;

    /**
     * Getter for isItemTaxable
     *
     * True if this item is taxable.
     */
    public object getIsItemTaxable() {
        return this.isItemTaxable;
    }

    /**
     * Setter for isItemTaxable
     *
     * True if this item is taxable.
     */
    public void setIsItemTaxable(object value) {
        this.isItemTaxable = value;
    }


    private object isSSTP;

    /**
     * Getter for isSSTP
     *
     * True if this item is a Streamlined Sales Tax line item.
     */
    public object getIsSSTP() {
        return this.isSSTP;
    }

    /**
     * Setter for isSSTP
     *
     * True if this item is a Streamlined Sales Tax line item.
     */
    public void setIsSSTP(object value) {
        this.isSSTP = value;
    }


    private string itemCode;

    /**
     * Getter for itemCode
     *
     * The code string of the item represented by this line item.
     */
    public string getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * The code string of the item represented by this line item.
     */
    public void setItemCode(string value) {
        this.itemCode = value;
    }


    private Decimal lineAmount;

    /**
     * Getter for lineAmount
     *
     * The total amount of the transaction, including both taxable and exempt. This is the total price for all items.
    * To determine the individual item price, divide this by quantity.
     */
    public Decimal getLineAmount() {
        return this.lineAmount;
    }

    /**
     * Setter for lineAmount
     *
     * The total amount of the transaction, including both taxable and exempt. This is the total price for all items.
    * To determine the individual item price, divide this by quantity.
     */
    public void setLineAmount(Decimal value) {
        this.lineAmount = value;
    }


    private Decimal quantity;

    /**
     * Getter for quantity
     *
     * The quantity of products sold on this line item.
     */
    public Decimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity
     *
     * The quantity of products sold on this line item.
     */
    public void setQuantity(Decimal value) {
        this.quantity = value;
    }


    private string ref1;

    /**
     * Getter for ref1
     *
     * A user-defined reference identifier for this transaction line item.
     */
    public string getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1
     *
     * A user-defined reference identifier for this transaction line item.
     */
    public void setRef1(string value) {
        this.ref1 = value;
    }


    private string ref2;

    /**
     * Getter for ref2
     *
     * A user-defined reference identifier for this transaction line item.
     */
    public string getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2
     *
     * A user-defined reference identifier for this transaction line item.
     */
    public void setRef2(string value) {
        this.ref2 = value;
    }


    private Instant reportingDate;

    /**
     * Getter for reportingDate
     *
     * The date when this transaction should be reported. By default, all transactions are reported on the date when the actual transaction took place.
    * In some cases, line items may be reported later due to delayed shipments or other business reasons.
     */
    public Instant getReportingDate() {
        return this.reportingDate;
    }

    /**
     * Setter for reportingDate
     *
     * The date when this transaction should be reported. By default, all transactions are reported on the date when the actual transaction took place.
    * In some cases, line items may be reported later due to delayed shipments or other business reasons.
     */
    public void setReportingDate(Instant value) {
        this.reportingDate = value;
    }


    private string revAccount;

    /**
     * Getter for revAccount
     *
     * The revenue account number for this line item.
     */
    public string getRevAccount() {
        return this.revAccount;
    }

    /**
     * Setter for revAccount
     *
     * The revenue account number for this line item.
     */
    public void setRevAccount(string value) {
        this.revAccount = value;
    }


    private Sourcing sourcing;

    /**
     * Getter for sourcing
     *
     * Indicates whether this line item was taxed according to the origin or destination.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * Indicates whether this line item was taxed according to the origin or destination.
     */
    public void setSourcing(Sourcing value) {
        this.sourcing = value;
    }


    private Decimal tax;

    /**
     * Getter for tax
     *
     * The amount of tax generated for this line item.
     */
    public Decimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax
     *
     * The amount of tax generated for this line item.
     */
    public void setTax(Decimal value) {
        this.tax = value;
    }


    private Decimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount of this line item.
     */
    public Decimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount of this line item.
     */
    public void setTaxableAmount(Decimal value) {
        this.taxableAmount = value;
    }


    private Decimal taxCalculated;

    /**
     * Getter for taxCalculated
     *
     * The tax calculated for this line by Avalara. If the transaction was calculated with a tax override, this amount will be different from the "tax" value.
     */
    public Decimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated
     *
     * The tax calculated for this line by Avalara. If the transaction was calculated with a tax override, this amount will be different from the "tax" value.
     */
    public void setTaxCalculated(Decimal value) {
        this.taxCalculated = value;
    }


    private string taxCode;

    /**
     * Getter for taxCode
     *
     * The code string for the tax code that was used to calculate this line item.
     */
    public string getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The code string for the tax code that was used to calculate this line item.
     */
    public void setTaxCode(string value) {
        this.taxCode = value;
    }


    private Integer taxCodeId;

    /**
     * Getter for taxCodeId
     *
     * The unique ID number for the tax code that was used to calculate this line item.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId
     *
     * The unique ID number for the tax code that was used to calculate this line item.
     */
    public void setTaxCodeId(Integer value) {
        this.taxCodeId = value;
    }


    private Instant taxDate;

    /**
     * Getter for taxDate
     *
     * The date that was used for calculating tax amounts for this line item. By default, this date should be the same as the document date.
    * In some cases, for example when a consumer returns a product purchased previously, line items may be calculated using a tax date in the past
    * so that the consumer can receive a refund for the correct tax amount that was charged when the item was originally purchased.
     */
    public Instant getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate
     *
     * The date that was used for calculating tax amounts for this line item. By default, this date should be the same as the document date.
    * In some cases, for example when a consumer returns a product purchased previously, line items may be calculated using a tax date in the past
    * so that the consumer can receive a refund for the correct tax amount that was charged when the item was originally purchased.
     */
    public void setTaxDate(Instant value) {
        this.taxDate = value;
    }


    private string taxEngine;

    /**
     * Getter for taxEngine
     *
     * The tax engine identifier that was used to calculate this line item.
     */
    public string getTaxEngine() {
        return this.taxEngine;
    }

    /**
     * Setter for taxEngine
     *
     * The tax engine identifier that was used to calculate this line item.
     */
    public void setTaxEngine(string value) {
        this.taxEngine = value;
    }


    private TaxOverrideTypeId taxOverrideType;

    /**
     * Getter for taxOverrideType
     *
     * If a tax override was specified, this indicates the type of tax override.
     */
    public TaxOverrideTypeId getTaxOverrideType() {
        return this.taxOverrideType;
    }

    /**
     * Setter for taxOverrideType
     *
     * If a tax override was specified, this indicates the type of tax override.
     */
    public void setTaxOverrideType(TaxOverrideTypeId value) {
        this.taxOverrideType = value;
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


    private Decimal taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount
     *
     * If a tax override was specified, this indicates the amount of tax that was requested.
     */
    public Decimal getTaxOverrideAmount() {
        return this.taxOverrideAmount;
    }

    /**
     * Setter for taxOverrideAmount
     *
     * If a tax override was specified, this indicates the amount of tax that was requested.
     */
    public void setTaxOverrideAmount(Decimal value) {
        this.taxOverrideAmount = value;
    }


    private string taxOverrideReason;

    /**
     * Getter for taxOverrideReason
     *
     * If a tax override was specified, represents the reason for the tax override.
     */
    public string getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason
     *
     * If a tax override was specified, represents the reason for the tax override.
     */
    public void setTaxOverrideReason(string value) {
        this.taxOverrideReason = value;
    }


    private object taxIncluded;

    /**
     * Getter for taxIncluded
     *
     * True if tax was included in the purchase price of the item.
     */
    public object getTaxIncluded() {
        return this.taxIncluded;
    }

    /**
     * Setter for taxIncluded
     *
     * True if tax was included in the purchase price of the item.
     */
    public void setTaxIncluded(object value) {
        this.taxIncluded = value;
    }


    private TransactionLineDetailModel[] details;

    /**
     * Getter for details
     *
     * Optional: A list of tax details for this line item. To fetch this list, add the query string "?$include=Details" to your URL.
     */
    public TransactionLineDetailModel[] getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * Optional: A list of tax details for this line item. To fetch this list, add the query string "?$include=Details" to your URL.
     */
    public void setDetails(TransactionLineDetailModel[] value) {
        this.details = value;
    }


    private TransactionLineLocationTypeModel[] lineLocationTypes;

    /**
     * Getter for lineLocationTypes
     *
     * Optional: A list of location types for this line item. To fetch this list, add the query string "?$include=LineLocationTypes" to your URL.
     */
    public TransactionLineLocationTypeModel[] getLineLocationTypes() {
        return this.lineLocationTypes;
    }

    /**
     * Setter for lineLocationTypes
     *
     * Optional: A list of location types for this line item. To fetch this list, add the query string "?$include=LineLocationTypes" to your URL.
     */
    public void setLineLocationTypes(TransactionLineLocationTypeModel[] value) {
        this.lineLocationTypes = value;
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


    /**
     * Returns a JSON string representation of TransactionLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
