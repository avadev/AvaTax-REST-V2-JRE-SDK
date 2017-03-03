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
     * Getter for number - Represents one line item in a transaction
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Setter for number - Represents one line item in a transaction
     */
    public void setNumber(String number) {
        this.number = number;
    }

    
    private String taxCode;

    /**
     * Getter for taxCode - Represents one line item in a transaction
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - Represents one line item in a transaction
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private BigDecimal quantity;

    /**
     * Getter for quantity - Represents one line item in a transaction
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity - Represents one line item in a transaction
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - Represents one line item in a transaction
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - Represents one line item in a transaction
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride - Represents one line item in a transaction
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride - Represents one line item in a transaction
     */
    public void setTaxOverride(TaxOverrideModel taxOverride) {
        this.taxOverride = taxOverride;
    }

    
    private String description;

    /**
     * Getter for description - Represents one line item in a transaction
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents one line item in a transaction
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo - Represents one line item in a transaction
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo - Represents one line item in a transaction
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    
    private String ref1;

    /**
     * Getter for ref1 - Represents one line item in a transaction
     */
    public String getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1 - Represents one line item in a transaction
     */
    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    
    private String revenueAccount;

    /**
     * Getter for revenueAccount - Represents one line item in a transaction
     */
    public String getRevenueAccount() {
        return this.revenueAccount;
    }

    /**
     * Setter for revenueAccount - Represents one line item in a transaction
     */
    public void setRevenueAccount(String revenueAccount) {
        this.revenueAccount = revenueAccount;
    }

    
    private BigDecimal amount;

    /**
     * Getter for amount - Represents one line item in a transaction
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount - Represents one line item in a transaction
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
    private String ref2;

    /**
     * Getter for ref2 - Represents one line item in a transaction
     */
    public String getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2 - Represents one line item in a transaction
     */
    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    
    private String itemCode;

    /**
     * Getter for itemCode - Represents one line item in a transaction
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode - Represents one line item in a transaction
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    
    private String exemptionCode;

    /**
     * Getter for exemptionCode - Represents one line item in a transaction
     */
    public String getExemptionCode() {
        return this.exemptionCode;
    }

    /**
     * Setter for exemptionCode - Represents one line item in a transaction
     */
    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    
    private Boolean taxIncluded;

    /**
     * Getter for taxIncluded - Represents one line item in a transaction
     */
    public Boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    /**
     * Setter for taxIncluded - Represents one line item in a transaction
     */
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - Represents one line item in a transaction
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - Represents one line item in a transaction
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private Boolean discounted;

    /**
     * Getter for discounted - Represents one line item in a transaction
     */
    public Boolean getDiscounted() {
        return this.discounted;
    }

    /**
     * Setter for discounted - Represents one line item in a transaction
     */
    public void setDiscounted(Boolean discounted) {
        this.discounted = discounted;
    }

    
    private AddressesModel addresses;

    /**
     * Getter for addresses - Represents one line item in a transaction
     */
    public AddressesModel getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses - Represents one line item in a transaction
     */
    public void setAddresses(AddressesModel addresses) {
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
    