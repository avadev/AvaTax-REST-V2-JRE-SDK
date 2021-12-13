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
 * Swagger name: AvaTaxClient
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
	 * 
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
	 * 
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

    private String lineNumber;

    /**
     * Getter for lineNumber
     *
     * The line number or code indicating the line on this invoice or receipt or document.
	 * 
     */
    public String getLineNumber() {
        return this.lineNumber;
    }

    /**
     * Setter for lineNumber
     *
     * The line number or code indicating the line on this invoice or receipt or document.
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    private Integer boundaryOverrideId;

    /**
     * Getter for boundaryOverrideId
     *
     * The unique ID number of the boundary override applied to this line item.
	 * 
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

    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * DEPRECATED - Date: 10/16/2017, Version: 17.11, Message: Please use entityUseCode instead.
    * The customer usage type for this line item. Usage type often affects taxability rules.
	 * 
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * DEPRECATED - Date: 10/16/2017, Version: 17.11, Message: Please use entityUseCode instead.
    * The customer usage type for this line item. Usage type often affects taxability rules.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The entity use code for this line item. Usage type often affects taxability rules.
	 * 
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The entity use code for this line item. Usage type often affects taxability rules.
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A description of the item or service represented by this line.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of the item or service represented by this line.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Long destinationAddressId;

    /**
     * Getter for destinationAddressId
     *
     * The unique ID number of the destination address where this line was delivered or sold.
    * In the case of a point-of-sale transaction, the destination address and origin address will be the same.
    * In the case of a shipped transaction, they will be different.
	 * 
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
	 * 
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

    private BigDecimal discountAmount;

    /**
     * Getter for discountAmount
     *
     * The amount of discount that was applied to this line item. This represents the difference between list price and sale price of the item.
    * In general, a discount represents money that did not change hands; tax is calculated on only the amount of money that changed hands.
	 * 
     */
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Setter for discountAmount
     *
     * The amount of discount that was applied to this line item. This represents the difference between list price and sale price of the item.
    * In general, a discount represents money that did not change hands; tax is calculated on only the amount of money that changed hands.
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    private Integer discountTypeId;

    /**
     * Getter for discountTypeId
     *
     * The type of discount, if any, that was applied to this line item.
	 * 
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

    private BigDecimal exemptAmount;

    /**
     * Getter for exemptAmount
     *
     * The amount of this line item that was exempt.
	 * 
     */
    public BigDecimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount
     *
     * The amount of this line item that was exempt.
     */
    public void setExemptAmount(BigDecimal value) {
        this.exemptAmount = value;
    }

    private Integer exemptCertId;

    /**
     * Getter for exemptCertId
     *
     * The unique ID number of the exemption certificate that applied to this line item. It is the calc_id associated with a certificate in CertCapture.
	 * 
     */
    public Integer getExemptCertId() {
        return this.exemptCertId;
    }

    /**
     * Setter for exemptCertId
     *
     * The unique ID number of the exemption certificate that applied to this line item. It is the calc_id associated with a certificate in CertCapture.
     */
    public void setExemptCertId(Integer value) {
        this.exemptCertId = value;
    }

    private String certificateId;

    /**
     * Getter for certificateId
     *
     * The CertCapture Certificate ID
	 * 
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * Setter for certificateId
     *
     * The CertCapture Certificate ID
     */
    public void setCertificateId(String value) {
        this.certificateId = value;
    }

    private String exemptNo;

    /**
     * Getter for exemptNo
     *
     * The customer Tax Id Number (tax_number) associated with a certificate - Sales tax calculation requests first determine if there is an applicable
    * ECMS entry available, and will utilize it for exemption processing. If no applicable ECMS entry is available, the AvaTax service
    * will determine if an Exemption Number field is populated or an Entity/Use Code is included in the sales tax calculation request,
    * and will perform exemption processing using either of those two options.
	 * 
     */
    public String getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo
     *
     * The customer Tax Id Number (tax_number) associated with a certificate - Sales tax calculation requests first determine if there is an applicable
    * ECMS entry available, and will utilize it for exemption processing. If no applicable ECMS entry is available, the AvaTax service
    * will determine if an Exemption Number field is populated or an Entity/Use Code is included in the sales tax calculation request,
    * and will perform exemption processing using either of those two options.
     */
    public void setExemptNo(String value) {
        this.exemptNo = value;
    }

    private Boolean isItemTaxable;

    /**
     * Getter for isItemTaxable
     *
     * True if this item is taxable.
	 * 
     */
    public Boolean getIsItemTaxable() {
        return this.isItemTaxable;
    }

    /**
     * Setter for isItemTaxable
     *
     * True if this item is taxable.
     */
    public void setIsItemTaxable(Boolean value) {
        this.isItemTaxable = value;
    }

    private Boolean isSSTP;

    /**
     * Getter for isSSTP
     *
     * True if this item is a Streamlined Sales Tax line item.
	 * 
     */
    public Boolean getIsSSTP() {
        return this.isSSTP;
    }

    /**
     * Setter for isSSTP
     *
     * True if this item is a Streamlined Sales Tax line item.
     */
    public void setIsSSTP(Boolean value) {
        this.isSSTP = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * The code string of the item represented by this line item.
	 * 
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * The code string of the item represented by this line item.
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private BigDecimal lineAmount;

    /**
     * Getter for lineAmount
     *
     * The total amount of the transaction, including both taxable and exempt. This is the total price for all items.
    * To determine the individual item price, divide this by quantity.
	 * 
     */
    public BigDecimal getLineAmount() {
        return this.lineAmount;
    }

    /**
     * Setter for lineAmount
     *
     * The total amount of the transaction, including both taxable and exempt. This is the total price for all items.
    * To determine the individual item price, divide this by quantity.
     */
    public void setLineAmount(BigDecimal value) {
        this.lineAmount = value;
    }

    private BigDecimal quantity;

    /**
     * Getter for quantity
     *
     * The quantity of products sold on this line item.
	 * 
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity
     *
     * The quantity of products sold on this line item.
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    private String ref1;

    /**
     * Getter for ref1
     *
     * A user-defined reference identifier for this transaction line item.
	 * 
     */
    public String getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1
     *
     * A user-defined reference identifier for this transaction line item.
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }

    private String ref2;

    /**
     * Getter for ref2
     *
     * A user-defined reference identifier for this transaction line item.
	 * 
     */
    public String getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2
     *
     * A user-defined reference identifier for this transaction line item.
     */
    public void setRef2(String value) {
        this.ref2 = value;
    }

    private Date reportingDate;

    /**
     * Getter for reportingDate
     *
     * The date when this transaction should be reported. By default, all transactions are reported on the date when the actual transaction took place.
    * In some cases, line items may be reported later due to delayed shipments or other business reasons.
	 * 
     */
    public Date getReportingDate() {
        return this.reportingDate;
    }

    /**
     * Setter for reportingDate
     *
     * The date when this transaction should be reported. By default, all transactions are reported on the date when the actual transaction took place.
    * In some cases, line items may be reported later due to delayed shipments or other business reasons.
     */
    public void setReportingDate(Date value) {
        this.reportingDate = value;
    }

    private String revAccount;

    /**
     * Getter for revAccount
     *
     * The revenue account number for this line item.
	 * 
     */
    public String getRevAccount() {
        return this.revAccount;
    }

    /**
     * Setter for revAccount
     *
     * The revenue account number for this line item.
     */
    public void setRevAccount(String value) {
        this.revAccount = value;
    }

    private Sourcing sourcing;

    /**
     * Getter for sourcing
     *
     * Indicates whether this line item was taxed according to the origin or destination.
	 * 
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

    private BigDecimal tax;

    /**
     * Getter for tax
     *
     * The tax for this line in this transaction.
    *  
    * If you used a `taxOverride` of type `taxAmount` for this line, this value
    * will represent the amount of your override. AvaTax will still attempt to calculate the correct tax
    * for this line and will store that calculated value in the `taxCalculated` field.
    *  
    * You can compare the `tax` and `taxCalculated` fields to check for any discrepancies
    * between an external tax calculation provider and the calculation performed by AvaTax.
	 * 
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax
     *
     * The tax for this line in this transaction.
    *  
    * If you used a `taxOverride` of type `taxAmount` for this line, this value
    * will represent the amount of your override. AvaTax will still attempt to calculate the correct tax
    * for this line and will store that calculated value in the `taxCalculated` field.
    *  
    * You can compare the `tax` and `taxCalculated` fields to check for any discrepancies
    * between an external tax calculation provider and the calculation performed by AvaTax.
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount of this line item.
	 * 
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount of this line item.
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    private BigDecimal taxCalculated;

    /**
     * Getter for taxCalculated
     *
     * The amount of tax that AvaTax calculated for the transaction.
    *  
    * If you used a `taxOverride` of type `taxAmount`, there may be a difference between
    * the `tax` field which applies your override, and the `taxCalculated` field which
    * represents the amount of tax that AvaTax calculated without the override.
    *  
    * You can compare the `tax` and `taxCalculated` fields to check for any discrepancies
    * between an external tax calculation provider and the calculation performed by AvaTax.
	 * 
     */
    public BigDecimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated
     *
     * The amount of tax that AvaTax calculated for the transaction.
    *  
    * If you used a `taxOverride` of type `taxAmount`, there may be a difference between
    * the `tax` field which applies your override, and the `taxCalculated` field which
    * represents the amount of tax that AvaTax calculated without the override.
    *  
    * You can compare the `tax` and `taxCalculated` fields to check for any discrepancies
    * between an external tax calculation provider and the calculation performed by AvaTax.
     */
    public void setTaxCalculated(BigDecimal value) {
        this.taxCalculated = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * The code string for the tax code that was used to calculate this line item.
	 * 
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The code string for the tax code that was used to calculate this line item.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private Integer taxCodeId;

    /**
     * Getter for taxCodeId
     *
     * The unique ID number for the tax code that was used to calculate this line item.
	 * 
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

    private Date taxDate;

    /**
     * Getter for taxDate
     *
     * The date that was used for calculating tax amounts for this line item. By default, this date should be the same as the document date.
    * In some cases, for example when a consumer returns a product purchased previously, line items may be calculated using a tax date in the past
    * so that the consumer can receive a refund for the correct tax amount that was charged when the item was originally purchased.
	 * 
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate
     *
     * The date that was used for calculating tax amounts for this line item. By default, this date should be the same as the document date.
    * In some cases, for example when a consumer returns a product purchased previously, line items may be calculated using a tax date in the past
    * so that the consumer can receive a refund for the correct tax amount that was charged when the item was originally purchased.
     */
    public void setTaxDate(Date value) {
        this.taxDate = value;
    }

    private String taxEngine;

    /**
     * Getter for taxEngine
     *
     * The tax engine identifier that was used to calculate this line item.
	 * 
     */
    public String getTaxEngine() {
        return this.taxEngine;
    }

    /**
     * Setter for taxEngine
     *
     * The tax engine identifier that was used to calculate this line item.
     */
    public void setTaxEngine(String value) {
        this.taxEngine = value;
    }

    private TaxOverrideType taxOverrideType;

    /**
     * Getter for taxOverrideType
     *
     * If a tax override was specified, this indicates the type of tax override.
	 * 
     */
    public TaxOverrideType getTaxOverrideType() {
        return this.taxOverrideType;
    }

    /**
     * Setter for taxOverrideType
     *
     * If a tax override was specified, this indicates the type of tax override.
     */
    public void setTaxOverrideType(TaxOverrideType value) {
        this.taxOverrideType = value;
    }

    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * VAT business identification number used for this transaction.
	 * 
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

    private BigDecimal taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount
     *
     * If a tax override was specified, this indicates the amount of tax that was requested.
	 * 
     */
    public BigDecimal getTaxOverrideAmount() {
        return this.taxOverrideAmount;
    }

    /**
     * Setter for taxOverrideAmount
     *
     * If a tax override was specified, this indicates the amount of tax that was requested.
     */
    public void setTaxOverrideAmount(BigDecimal value) {
        this.taxOverrideAmount = value;
    }

    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason
     *
     * If a tax override was specified, represents the reason for the tax override.
	 * 
     */
    public String getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason
     *
     * If a tax override was specified, represents the reason for the tax override.
     */
    public void setTaxOverrideReason(String value) {
        this.taxOverrideReason = value;
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
	 * 
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

    private Long merchantSellerId;

    /**
     * Getter for merchantSellerId
     *
     * DEPRECATED - Date: 04/15/2021, Version: 21.4, Message: Please use merchantSellerIdentifier instead.
    * ID of the merchant selling on the Marketplace. This field must be populated by Marketplace.
	 * 
     */
    public Long getMerchantSellerId() {
        return this.merchantSellerId;
    }

    /**
     * Setter for merchantSellerId
     *
     * DEPRECATED - Date: 04/15/2021, Version: 21.4, Message: Please use merchantSellerIdentifier instead.
    * ID of the merchant selling on the Marketplace. This field must be populated by Marketplace.
     */
    public void setMerchantSellerId(Long value) {
        this.merchantSellerId = value;
    }

    private String merchantSellerIdentifier;

    /**
     * Getter for merchantSellerIdentifier
     *
     * ID of the merchant selling on the Marketplace. This field must be populated by Marketplace.
	 * 
     */
    public String getMerchantSellerIdentifier() {
        return this.merchantSellerIdentifier;
    }

    /**
     * Setter for merchantSellerIdentifier
     *
     * ID of the merchant selling on the Marketplace. This field must be populated by Marketplace.
     */
    public void setMerchantSellerIdentifier(String value) {
        this.merchantSellerIdentifier = value;
    }

    private MarketplaceLiabilityType marketplaceLiabilityType;

    /**
     * Getter for marketplaceLiabilityType
     *
     * This field will identify who is remitting Marketplace or Seller. This field must be populated by Marketplace.
	 * 
     */
    public MarketplaceLiabilityType getMarketplaceLiabilityType() {
        return this.marketplaceLiabilityType;
    }

    /**
     * Setter for marketplaceLiabilityType
     *
     * This field will identify who is remitting Marketplace or Seller. This field must be populated by Marketplace.
     */
    public void setMarketplaceLiabilityType(MarketplaceLiabilityType value) {
        this.marketplaceLiabilityType = value;
    }

    private String originationDocumentId;

    /**
     * Getter for originationDocumentId
     *
     * The transaction's original ID in its origination system
	 * 
     */
    public String getOriginationDocumentId() {
        return this.originationDocumentId;
    }

    /**
     * Setter for originationDocumentId
     *
     * The transaction's original ID in its origination system
     */
    public void setOriginationDocumentId(String value) {
        this.originationDocumentId = value;
    }

    private String originationSite;

    /**
     * Getter for originationSite
     *
     * Synonym of Marketplace Origination. Name of the Marketplace where the transaction originated from.
	 * 
     */
    public String getOriginationSite() {
        return this.originationSite;
    }

    /**
     * Setter for originationSite
     *
     * Synonym of Marketplace Origination. Name of the Marketplace where the transaction originated from.
     */
    public void setOriginationSite(String value) {
        this.originationSite = value;
    }

    private ArrayList<TransactionLineDetailModel> details;

    /**
     * Getter for details
     *
     * Optional: A list of tax details for this line item.
    *  
    * Tax details represent taxes being charged by various tax authorities. Taxes that appear in the `details` collection are intended to be
    * displayed to the customer and charged as a 'tax' on the invoice.
    *  
    * To fetch this list, add the query string `?$include=Details` to your URL.
	 * 
     */
    public ArrayList<TransactionLineDetailModel> getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * Optional: A list of tax details for this line item.
    *  
    * Tax details represent taxes being charged by various tax authorities. Taxes that appear in the `details` collection are intended to be
    * displayed to the customer and charged as a 'tax' on the invoice.
    *  
    * To fetch this list, add the query string `?$include=Details` to your URL.
     */
    public void setDetails(ArrayList<TransactionLineDetailModel> value) {
        this.details = value;
    }

    private ArrayList<TransactionLineDetailModel> nonPassthroughDetails;

    /**
     * Getter for nonPassthroughDetails
     *
     * Optional: A list of non-passthrough tax details for this line item.
    *  
    * Tax details represent taxes being charged by various tax authorities. Taxes that appear in the `nonPassthroughDetails` collection are
    * taxes that must be paid directly by the company and not shown to the customer.
	 * 
     */
    public ArrayList<TransactionLineDetailModel> getNonPassthroughDetails() {
        return this.nonPassthroughDetails;
    }

    /**
     * Setter for nonPassthroughDetails
     *
     * Optional: A list of non-passthrough tax details for this line item.
    *  
    * Tax details represent taxes being charged by various tax authorities. Taxes that appear in the `nonPassthroughDetails` collection are
    * taxes that must be paid directly by the company and not shown to the customer.
     */
    public void setNonPassthroughDetails(ArrayList<TransactionLineDetailModel> value) {
        this.nonPassthroughDetails = value;
    }

    private ArrayList<TransactionLineLocationTypeModel> lineLocationTypes;

    /**
     * Getter for lineLocationTypes
     *
     * Optional: A list of location types for this line item. To fetch this list, add the query string "?$include=LineLocationTypes" to your URL.
	 * 
     */
    public ArrayList<TransactionLineLocationTypeModel> getLineLocationTypes() {
        return this.lineLocationTypes;
    }

    /**
     * Setter for lineLocationTypes
     *
     * Optional: A list of location types for this line item. To fetch this list, add the query string "?$include=LineLocationTypes" to your URL.
     */
    public void setLineLocationTypes(ArrayList<TransactionLineLocationTypeModel> value) {
        this.lineLocationTypes = value;
    }

    private ArrayList<TransactionLineParameterModel> parameters;

    /**
     * Getter for parameters
     *
     * Contains a list of extra parameters that were set when the transaction was created.
	 * 
     */
    public ArrayList<TransactionLineParameterModel> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Contains a list of extra parameters that were set when the transaction was created.
     */
    public void setParameters(ArrayList<TransactionLineParameterModel> value) {
        this.parameters = value;
    }

    private ArrayList<TransactionLineUserDefinedFieldModel> userDefinedFields;

    /**
     * Getter for userDefinedFields
     *
     * Custom user fields/flex fields for this transaction.
	 * 
     */
    public ArrayList<TransactionLineUserDefinedFieldModel> getUserDefinedFields() {
        return this.userDefinedFields;
    }

    /**
     * Setter for userDefinedFields
     *
     * Custom user fields/flex fields for this transaction.
     */
    public void setUserDefinedFields(ArrayList<TransactionLineUserDefinedFieldModel> value) {
        this.userDefinedFields = value;
    }

    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The cross-border harmonized system code (HSCode) used to calculate tariffs and duties for this line item.
    * For a full list of HS codes, see `ListCrossBorderCodes()`.
	 * 
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The cross-border harmonized system code (HSCode) used to calculate tariffs and duties for this line item.
    * For a full list of HS codes, see `ListCrossBorderCodes()`.
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    private BigDecimal costInsuranceFreight;

    /**
     * Getter for costInsuranceFreight
     *
     * Indicates the cost of insurance and freight for this line.
	 * 
     */
    public BigDecimal getCostInsuranceFreight() {
        return this.costInsuranceFreight;
    }

    /**
     * Setter for costInsuranceFreight
     *
     * Indicates the cost of insurance and freight for this line.
     */
    public void setCostInsuranceFreight(BigDecimal value) {
        this.costInsuranceFreight = value;
    }

    private String vatCode;

    /**
     * Getter for vatCode
     *
     * Indicates the VAT code for this line item.
	 * 
     */
    public String getVatCode() {
        return this.vatCode;
    }

    /**
     * Setter for vatCode
     *
     * Indicates the VAT code for this line item.
     */
    public void setVatCode(String value) {
        this.vatCode = value;
    }

    private Integer vatNumberTypeId;

    /**
     * Getter for vatNumberTypeId
     *
     * Indicates the VAT number type for this line item.
	 * 
     */
    public Integer getVatNumberTypeId() {
        return this.vatNumberTypeId;
    }

    /**
     * Setter for vatNumberTypeId
     *
     * Indicates the VAT number type for this line item.
     */
    public void setVatNumberTypeId(Integer value) {
        this.vatNumberTypeId = value;
    }

    private ArrayList<TransactionLineTaxAmountByTaxTypeModel> taxAmountByTaxTypes;

    /**
     * Getter for taxAmountByTaxTypes
     *
     * Contains a list of TaxType that are to be overridden with their respective TaxOverrideAmount.
	 * 
     */
    public ArrayList<TransactionLineTaxAmountByTaxTypeModel> getTaxAmountByTaxTypes() {
        return this.taxAmountByTaxTypes;
    }

    /**
     * Setter for taxAmountByTaxTypes
     *
     * Contains a list of TaxType that are to be overridden with their respective TaxOverrideAmount.
     */
    public void setTaxAmountByTaxTypes(ArrayList<TransactionLineTaxAmountByTaxTypeModel> value) {
        this.taxAmountByTaxTypes = value;
    }

    private DeemedSellerType deemedSupplier;

    /**
     * Getter for deemedSupplier
     *
     * Deemed Supplier field indicates which party on the marketplace transaction is liable for collecting and reporting the VAT. This is based on the 2021 E-commerce legislative reforms in EU and UK. This field will not be used until after July 1, 2021.
	 * 
     */
    public DeemedSellerType getDeemedSupplier() {
        return this.deemedSupplier;
    }

    /**
     * Setter for deemedSupplier
     *
     * Deemed Supplier field indicates which party on the marketplace transaction is liable for collecting and reporting the VAT. This is based on the 2021 E-commerce legislative reforms in EU and UK. This field will not be used until after July 1, 2021.
     */
    public void setDeemedSupplier(DeemedSellerType value) {
        this.deemedSupplier = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * Product category breadcrumbs. This is the full path to the category where item is included. Categories should be separated by “ > “. Multiple category paths per item are accepted. In this case, category paths should be separated by “;”.
	 * 
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * Product category breadcrumbs. This is the full path to the category where item is included. Categories should be separated by “ > “. Multiple category paths per item are accepted. In this case, category paths should be separated by “;”.
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private String summary;

    /**
     * Getter for summary
     *
     * A long description of the product.
	 * 
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * A long description of the product.
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Returns a JSON string representation of TransactionLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
