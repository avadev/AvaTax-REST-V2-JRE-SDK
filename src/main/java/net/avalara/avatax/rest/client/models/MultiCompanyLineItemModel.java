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
 * @version    17.6.0-89
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents one line item in a multi company transaction
 */
public class MultiCompanyLineItemModel {


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Company Code - Specify the code of the company for this line of transaction. If you leave this value null,
    * the company code at document level will be used instead.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company Code - Specify the code of the company for this line of transaction. If you leave this value null,
    * the company code at document level will be used instead.
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }


    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public void setReportingLocationCode(String value) {
        this.reportingLocationCode = value;
    }


    private String number;

    /**
     * Getter for number
     *
     * Line number within this document
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Setter for number
     *
     * Line number within this document
     */
    public void setNumber(String value) {
        this.number = value;
    }


    private BigDecimal quantity;

    /**
     * Getter for quantity
     *
     * Quantity of items in this line
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity
     *
     * Quantity of items in this line
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }


    private BigDecimal amount;

    /**
     * Getter for amount
     *
     * Total amount for this line
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * Total amount for this line
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
     * Customer Usage Type - The client application customer or usage type.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * Customer Usage Type - The client application customer or usage type.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }


    private String itemCode;

    /**
     * Getter for itemCode
     *
     * Item Code (SKU)
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * Item Code (SKU)
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }


    private String exemptionCode;

    /**
     * Getter for exemptionCode
     *
     * Exemption number for this line
     */
    public String getExemptionCode() {
        return this.exemptionCode;
    }

    /**
     * Setter for exemptionCode
     *
     * Exemption number for this line
     */
    public void setExemptionCode(String value) {
        this.exemptionCode = value;
    }


    private Boolean discounted;

    /**
     * Getter for discounted
     *
     * True if the document discount should be applied to this line
     */
    public Boolean getDiscounted() {
        return this.discounted;
    }

    /**
     * Setter for discounted
     *
     * True if the document discount should be applied to this line
     */
    public void setDiscounted(Boolean value) {
        this.discounted = value;
    }


    private Boolean taxIncluded;

    /**
     * Getter for taxIncluded
     *
     * Indicates if line has Tax Included; defaults to false
     */
    public Boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    /**
     * Setter for taxIncluded
     *
     * Indicates if line has Tax Included; defaults to false
     */
    public void setTaxIncluded(Boolean value) {
        this.taxIncluded = value;
    }


    private String revenueAccount;

    /**
     * Getter for revenueAccount
     *
     * Revenue Account
     */
    public String getRevenueAccount() {
        return this.revenueAccount;
    }

    /**
     * Setter for revenueAccount
     *
     * Revenue Account
     */
    public void setRevenueAccount(String value) {
        this.revenueAccount = value;
    }


    private String ref1;

    /**
     * Getter for ref1
     *
     * Reference 1 - Client specific reference field
     */
    public String getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1
     *
     * Reference 1 - Client specific reference field
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }


    private String ref2;

    /**
     * Getter for ref2
     *
     * Reference 2 - Client specific reference field
     */
    public String getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2
     *
     * Reference 2 - Client specific reference field
     */
    public void setRef2(String value) {
        this.ref2 = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * Item description. This is required for SST transactions if an unmapped ItemCode is used.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Item description. This is required for SST transactions if an unmapped ItemCode is used.
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
     * Specifies a tax override for this line
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride
     *
     * Specifies a tax override for this line
     */
    public void setTaxOverride(TaxOverrideModel value) {
        this.taxOverride = value;
    }


    private HashMap<String, String> parameters;

    /**
     * Getter for parameters
     *
     * Special parameters that apply to this line within this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Special parameters that apply to this line within this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public void setParameters(HashMap<String, String> value) {
        this.parameters = value;
    }


    /**
     * Returns a JSON string representation of MultiCompanyLineItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
