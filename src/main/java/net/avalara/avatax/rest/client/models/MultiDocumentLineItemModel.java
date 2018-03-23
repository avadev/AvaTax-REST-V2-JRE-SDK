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
 * Represents one line item in a MultiDocument transaction
 */
public class MultiDocumentLineItemModel {


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Specify the code of the company for this line of transaction. 
    * 
    * If you leave this value null, the `companyCode` at the root level will be used instead.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Specify the code of the company for this line of transaction. 
    * 
    * If you leave this value null, the `companyCode` at the root level will be used instead.
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }


    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority. 
    * 
    * If you leave this value `null`, the `reportingLocationCode` at the root level will be used instead.
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority. 
    * 
    * If you leave this value `null`, the `reportingLocationCode` at the root level will be used instead.
     */
    public void setReportingLocationCode(String value) {
        this.reportingLocationCode = value;
    }


    private String number;

    /**
     * Getter for number
     *
     * The line number of this line within the document. This can be any text that is useful to you, such as numeric line numbers, alphabetic line numbers, or other text.
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Setter for number
     *
     * The line number of this line within the document. This can be any text that is useful to you, such as numeric line numbers, alphabetic line numbers, or other text.
     */
    public void setNumber(String value) {
        this.number = value;
    }


    private BigDecimal quantity;

    /**
     * Getter for quantity
     *
     * Quantity of items in this line. This quantity value should always be a positive value representing the quantity of product that changed hands, even when handling returns or refunds.
    * 
    * If not provided, or if set to zero, the quantity value is assumed to be one (1).
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity
     *
     * Quantity of items in this line. This quantity value should always be a positive value representing the quantity of product that changed hands, even when handling returns or refunds.
    * 
    * If not provided, or if set to zero, the quantity value is assumed to be one (1).
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }


    private BigDecimal amount;

    /**
     * Getter for amount
     *
     * Total amount for this line. The amount represents the net currency value that changed hands from the customer (represented by the `customerCode` field) to the company (represented by the `companyCode`) field.
    * 
    * For sale transactions, this value must be positive. It indicates the amount of money paid by the customer to the company.
    * 
    * For refund or return transactions, this value must be negative.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * Total amount for this line. The amount represents the net currency value that changed hands from the customer (represented by the `customerCode` field) to the company (represented by the `companyCode`) field.
    * 
    * For sale transactions, this value must be positive. It indicates the amount of money paid by the customer to the company.
    * 
    * For refund or return transactions, this value must be negative.
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }


    private AddressesModel addresses;

    /**
     * Getter for addresses
     *
     * The addresses to use for this transaction line.
    * 
    * If you set this value to `null`, or if you omit this element from your API call, then instead the transaction
    * will use the `addresses` from the document level.
    * 
    * If you specify any other value besides `null`, only addresses specified for this line will be used for this line.
     */
    public AddressesModel getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses
     *
     * The addresses to use for this transaction line.
    * 
    * If you set this value to `null`, or if you omit this element from your API call, then instead the transaction
    * will use the `addresses` from the document level.
    * 
    * If you specify any other value besides `null`, only addresses specified for this line will be used for this line.
     */
    public void setAddresses(AddressesModel value) {
        this.addresses = value;
    }


    private String taxCode;

    /**
     * Getter for taxCode
     *
     * Tax Code - System or Custom Tax Code.
    *  
    * You can use your own tax code mapping or standard Avalara tax codes. For a full list of tax codes, see `ListTaxCodes`.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * Tax Code - System or Custom Tax Code.
    *  
    * You can use your own tax code mapping or standard Avalara tax codes. For a full list of tax codes, see `ListTaxCodes`.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * DEPRECATED - Please use `entityUseCode` instead.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * DEPRECATED - Please use `entityUseCode` instead.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }


    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * Entity Use Code - The client application customer or usage type. This field allows you to designate a type of usage that 
    * may make this transaction considered exempt by reason of exempt usage.
    * 
    * For a list of entity use codes, see the Definitions API `ListEntityUseCodes`.
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * Entity Use Code - The client application customer or usage type. This field allows you to designate a type of usage that 
    * may make this transaction considered exempt by reason of exempt usage.
    * 
    * For a list of entity use codes, see the Definitions API `ListEntityUseCodes`.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }


    private String itemCode;

    /**
     * Getter for itemCode
     *
     * Item Code (SKU). If you provide an `itemCode` field, the AvaTax API will look up the item you created with the `CreateItems` API call
    * and use all the information available about that item for this transaction.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * Item Code (SKU). If you provide an `itemCode` field, the AvaTax API will look up the item you created with the `CreateItems` API call
    * and use all the information available about that item for this transaction.
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }


    private String exemptionCode;

    /**
     * Getter for exemptionCode
     *
     * Exemption certificate number for this line.
     */
    public String getExemptionCode() {
        return this.exemptionCode;
    }

    /**
     * Setter for exemptionCode
     *
     * Exemption certificate number for this line.
     */
    public void setExemptionCode(String value) {
        this.exemptionCode = value;
    }


    private Boolean discounted;

    /**
     * Getter for discounted
     *
     * True if the document discount should be applied to this line. If this value is false, or not provided, discounts will not be 
    * applied to this line even if they are specified on the root `discount` element.
     */
    public Boolean getDiscounted() {
        return this.discounted;
    }

    /**
     * Setter for discounted
     *
     * True if the document discount should be applied to this line. If this value is false, or not provided, discounts will not be 
    * applied to this line even if they are specified on the root `discount` element.
     */
    public void setDiscounted(Boolean value) {
        this.discounted = value;
    }


    private Boolean taxIncluded;

    /**
     * Getter for taxIncluded
     *
     * Indicates whether the `amount` for this line already includes tax.
    * 
    * If this value is `true`, the final price of this line including tax will equal the value in `amount`. 
    * 
    * If this value is `null` or `false`, the final price will equal `amount` plus whatever taxes apply to this line.
     */
    public Boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    /**
     * Setter for taxIncluded
     *
     * Indicates whether the `amount` for this line already includes tax.
    * 
    * If this value is `true`, the final price of this line including tax will equal the value in `amount`. 
    * 
    * If this value is `null` or `false`, the final price will equal `amount` plus whatever taxes apply to this line.
     */
    public void setTaxIncluded(Boolean value) {
        this.taxIncluded = value;
    }


    private String revenueAccount;

    /**
     * Getter for revenueAccount
     *
     * Revenue Account (Customer Defined Field).
    * 
    * This field is available for you to use to provide whatever information your implementation requires. It does not affect tax calculation.
     */
    public String getRevenueAccount() {
        return this.revenueAccount;
    }

    /**
     * Setter for revenueAccount
     *
     * Revenue Account (Customer Defined Field).
    * 
    * This field is available for you to use to provide whatever information your implementation requires. It does not affect tax calculation.
     */
    public void setRevenueAccount(String value) {
        this.revenueAccount = value;
    }


    private String ref1;

    /**
     * Getter for ref1
     *
     * Ref1 (Customer Defined Field)
    * 
    * This field is available for you to use to provide whatever information your implementation requires. It does not affect tax calculation.
     */
    public String getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1
     *
     * Ref1 (Customer Defined Field)
    * 
    * This field is available for you to use to provide whatever information your implementation requires. It does not affect tax calculation.
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }


    private String ref2;

    /**
     * Getter for ref2
     *
     * Ref2 (Customer Defined Field)
    * 
    * This field is available for you to use to provide whatever information your implementation requires. It does not affect tax calculation.
     */
    public String getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2
     *
     * Ref2 (Customer Defined Field)
    * 
    * This field is available for you to use to provide whatever information your implementation requires. It does not affect tax calculation.
     */
    public void setRef2(String value) {
        this.ref2 = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * Item description.
    * 
    * For Streamlined Sales Tax (SST) customers, this field is required if an unmapped `itemCode` is used.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Item description.
    * 
    * For Streamlined Sales Tax (SST) customers, this field is required if an unmapped `itemCode` is used.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * VAT business identification number for the customer for this line item. If you leave this field empty,
    * this line item will use whatever business identification number you provided at the transaction level.
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
     * VAT business identification number for the customer for this line item. If you leave this field empty,
    * this line item will use whatever business identification number you provided at the transaction level.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public void setBusinessIdentificationNo(String value) {
        this.businessIdentificationNo = value;
    }


    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride
     *
     * Specifies a tax override for this line.
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride
     *
     * Specifies a tax override for this line.
     */
    public void setTaxOverride(TaxOverrideModel value) {
        this.taxOverride = value;
    }


    private HashMap<String, String> parameters;

    /**
     * Getter for parameters
     *
     * Special parameters that apply to this line within this transaction.
    * 
    * To get a full list of available parameters, please use the `ListParameters` API.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Special parameters that apply to this line within this transaction.
    * 
    * To get a full list of available parameters, please use the `ListParameters` API.
     */
    public void setParameters(HashMap<String, String> value) {
        this.parameters = value;
    }


    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The Item code for Custom Duty / Global Import tax determination
    * Harmonized Tariff System code for this transaction.
    * 
    * For a list of harmonized tariff codes, see the Definitions API for harmonized tariff codes.
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The Item code for Custom Duty / Global Import tax determination
    * Harmonized Tariff System code for this transaction.
    * 
    * For a list of harmonized tariff codes, see the Definitions API for harmonized tariff codes.
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }


    /**
     * Returns a JSON string representation of MultiDocumentLineItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
