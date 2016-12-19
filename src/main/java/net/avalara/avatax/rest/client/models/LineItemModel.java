package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents one line item in a transaction
 */
public class LineItemModel {
    private String number;

    /**
     * Getter for number - Line number within this document
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Setter for number - Line number within this document
     */
    public void setNumber(String number) {
        this.number = number;
    }

    
    private String taxCode;

    /**
     * Getter for taxCode - Tax Code - System or Custom Tax Code.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - Tax Code - System or Custom Tax Code.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private BigDecimal quantity;

    /**
     * Getter for quantity - Quantity of items in this line
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity - Quantity of items in this line
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - Customer Usage Type - The client application customer or usage type.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - Customer Usage Type - The client application customer or usage type.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride - Specifies a tax override for this line
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride - Specifies a tax override for this line
     */
    public void setTaxOverride(TaxOverrideModel taxOverride) {
        this.taxOverride = taxOverride;
    }

    
    private String description;

    /**
     * Getter for description - Item description.  This is required for SST transactions if an unmapped ItemCode is used.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Item description.  This is required for SST transactions if an unmapped ItemCode is used.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo - BusinessIdentificationNo
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo - BusinessIdentificationNo
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    
    private String ref1;

    /**
     * Getter for ref1 - Reference 1 - Client specific reference field
     */
    public String getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1 - Reference 1 - Client specific reference field
     */
    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    
    private String revenueAccount;

    /**
     * Getter for revenueAccount - Revenue Account
     */
    public String getRevenueAccount() {
        return this.revenueAccount;
    }

    /**
     * Setter for revenueAccount - Revenue Account
     */
    public void setRevenueAccount(String revenueAccount) {
        this.revenueAccount = revenueAccount;
    }

    
    private BigDecimal amount;

    /**
     * Getter for amount - Total amount for this line
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount - Total amount for this line
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
    private String ref2;

    /**
     * Getter for ref2 - Reference 2 - Client specific reference field
     */
    public String getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2 - Reference 2 - Client specific reference field
     */
    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    
    private String itemCode;

    /**
     * Getter for itemCode - Item Code (SKU)
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode - Item Code (SKU)
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    
    private String exemptionCode;

    /**
     * Getter for exemptionCode - Exemption number for this line
     */
    public String getExemptionCode() {
        return this.exemptionCode;
    }

    /**
     * Setter for exemptionCode - Exemption number for this line
     */
    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    
    private Boolean taxIncluded;

    /**
     * Getter for taxIncluded - Indicates if line has Tax Included; defaults to false
     */
    public Boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    /**
     * Setter for taxIncluded - Indicates if line has Tax Included; defaults to false
     */
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - Special parameters that apply to this line within this transaction.
                To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - Special parameters that apply to this line within this transaction.
                To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private Boolean discounted;

    /**
     * Getter for discounted - True if the document discount should be applied to this line
     */
    public Boolean getDiscounted() {
        return this.discounted;
    }

    /**
     * Setter for discounted - True if the document discount should be applied to this line
     */
    public void setDiscounted(Boolean discounted) {
        this.discounted = discounted;
    }

    
    private HashMap<TransactionAddressType, AddressInfo> addresses;

    /**
     * Getter for addresses - Specify any differences for addresses between this line and the rest of the document
     */
    public HashMap<TransactionAddressType, AddressInfo> getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses - Specify any differences for addresses between this line and the rest of the document
     */
    public void setAddresses(HashMap<TransactionAddressType, AddressInfo> addresses) {
        this.addresses = addresses;
    }

    


    /**
     * Returns a JSON string representation of LineItemModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    