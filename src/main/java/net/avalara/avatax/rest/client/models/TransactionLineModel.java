package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * One line item on this transaction.
 */
public class TransactionLineModel {
    private BigDecimal exemptAmount;

    /**
     * Getter for exemptAmount - One line item on this transaction.
     */
    public BigDecimal getExemptAmount() {
        return this.exemptAmount;
    }

    /**
     * Setter for exemptAmount - One line item on this transaction.
     */
    public void setExemptAmount(BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }

    
    private String taxCode;

    /**
     * Getter for taxCode - One line item on this transaction.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode - One line item on this transaction.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    private BigDecimal quantity;

    /**
     * Getter for quantity - One line item on this transaction.
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for quantity - One line item on this transaction.
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
    private String taxEngine;

    /**
     * Getter for taxEngine - One line item on this transaction.
     */
    public String getTaxEngine() {
        return this.taxEngine;
    }

    /**
     * Setter for taxEngine - One line item on this transaction.
     */
    public void setTaxEngine(String taxEngine) {
        this.taxEngine = taxEngine;
    }

    
    private String customerUsageType;

    /**
     * Getter for customerUsageType - One line item on this transaction.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType - One line item on this transaction.
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    
    private Boolean isItemTaxable;

    /**
     * Getter for isItemTaxable - One line item on this transaction.
     */
    public Boolean getIsItemTaxable() {
        return this.isItemTaxable;
    }

    /**
     * Setter for isItemTaxable - One line item on this transaction.
     */
    public void setIsItemTaxable(Boolean isItemTaxable) {
        this.isItemTaxable = isItemTaxable;
    }

    
    private TaxOverrideTypeId taxOverrideType;

    /**
     * Getter for taxOverrideType - One line item on this transaction.
     */
    public TaxOverrideTypeId getTaxOverrideType() {
        return this.taxOverrideType;
    }

    /**
     * Setter for taxOverrideType - One line item on this transaction.
     */
    public void setTaxOverrideType(TaxOverrideTypeId taxOverrideType) {
        this.taxOverrideType = taxOverrideType;
    }

    
    private BigDecimal tax;

    /**
     * Getter for tax - One line item on this transaction.
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax - One line item on this transaction.
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    
    private Long originAddressId;

    /**
     * Getter for originAddressId - One line item on this transaction.
     */
    public Long getOriginAddressId() {
        return this.originAddressId;
    }

    /**
     * Setter for originAddressId - One line item on this transaction.
     */
    public void setOriginAddressId(Long originAddressId) {
        this.originAddressId = originAddressId;
    }

    
    private String description;

    /**
     * Getter for description - One line item on this transaction.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - One line item on this transaction.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Integer discountTypeId;

    /**
     * Getter for discountTypeId - One line item on this transaction.
     */
    public Integer getDiscountTypeId() {
        return this.discountTypeId;
    }

    /**
     * Setter for discountTypeId - One line item on this transaction.
     */
    public void setDiscountTypeId(Integer discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    
    private String exemptNo;

    /**
     * Getter for exemptNo - One line item on this transaction.
     */
    public String getExemptNo() {
        return this.exemptNo;
    }

    /**
     * Setter for exemptNo - One line item on this transaction.
     */
    public void setExemptNo(String exemptNo) {
        this.exemptNo = exemptNo;
    }

    
    private Integer boundaryOverrideId;

    /**
     * Getter for boundaryOverrideId - One line item on this transaction.
     */
    public Integer getBoundaryOverrideId() {
        return this.boundaryOverrideId;
    }

    /**
     * Setter for boundaryOverrideId - One line item on this transaction.
     */
    public void setBoundaryOverrideId(Integer boundaryOverrideId) {
        this.boundaryOverrideId = boundaryOverrideId;
    }

    
    private String ref1;

    /**
     * Getter for ref1 - One line item on this transaction.
     */
    public String getRef1() {
        return this.ref1;
    }

    /**
     * Setter for ref1 - One line item on this transaction.
     */
    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    
    private ArrayList<TransactionLineLocationTypeModel> lineLocationTypes;

    /**
     * Getter for lineLocationTypes - One line item on this transaction.
     */
    public ArrayList<TransactionLineLocationTypeModel> getLineLocationTypes() {
        return this.lineLocationTypes;
    }

    /**
     * Setter for lineLocationTypes - One line item on this transaction.
     */
    public void setLineLocationTypes(ArrayList<TransactionLineLocationTypeModel> lineLocationTypes) {
        this.lineLocationTypes = lineLocationTypes;
    }

    
    private Date reportingDate;

    /**
     * Getter for reportingDate - One line item on this transaction.
     */
    public Date getReportingDate() {
        return this.reportingDate;
    }

    /**
     * Setter for reportingDate - One line item on this transaction.
     */
    public void setReportingDate(Date reportingDate) {
        this.reportingDate = reportingDate;
    }

    
    private Sourcing sourcing;

    /**
     * Getter for sourcing - One line item on this transaction.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing - One line item on this transaction.
     */
    public void setSourcing(Sourcing sourcing) {
        this.sourcing = sourcing;
    }

    
    private Integer exemptCertId;

    /**
     * Getter for exemptCertId - One line item on this transaction.
     */
    public Integer getExemptCertId() {
        return this.exemptCertId;
    }

    /**
     * Setter for exemptCertId - One line item on this transaction.
     */
    public void setExemptCertId(Integer exemptCertId) {
        this.exemptCertId = exemptCertId;
    }

    
    private Integer taxCodeId;

    /**
     * Getter for taxCodeId - One line item on this transaction.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId - One line item on this transaction.
     */
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    
    private String ref2;

    /**
     * Getter for ref2 - One line item on this transaction.
     */
    public String getRef2() {
        return this.ref2;
    }

    /**
     * Setter for ref2 - One line item on this transaction.
     */
    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    
    private String lineNumber;

    /**
     * Getter for lineNumber - One line item on this transaction.
     */
    public String getLineNumber() {
        return this.lineNumber;
    }

    /**
     * Setter for lineNumber - One line item on this transaction.
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    
    private String revAccount;

    /**
     * Getter for revAccount - One line item on this transaction.
     */
    public String getRevAccount() {
        return this.revAccount;
    }

    /**
     * Setter for revAccount - One line item on this transaction.
     */
    public void setRevAccount(String revAccount) {
        this.revAccount = revAccount;
    }

    
    private Long id;

    /**
     * Getter for id - One line item on this transaction.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - One line item on this transaction.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private BigDecimal taxCalculated;

    /**
     * Getter for taxCalculated - One line item on this transaction.
     */
    public BigDecimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated - One line item on this transaction.
     */
    public void setTaxCalculated(BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }

    
    private BigDecimal lineAmount;

    /**
     * Getter for lineAmount - One line item on this transaction.
     */
    public BigDecimal getLineAmount() {
        return this.lineAmount;
    }

    /**
     * Setter for lineAmount - One line item on this transaction.
     */
    public void setLineAmount(BigDecimal lineAmount) {
        this.lineAmount = lineAmount;
    }

    
    private Long destinationAddressId;

    /**
     * Getter for destinationAddressId - One line item on this transaction.
     */
    public Long getDestinationAddressId() {
        return this.destinationAddressId;
    }

    /**
     * Setter for destinationAddressId - One line item on this transaction.
     */
    public void setDestinationAddressId(Long destinationAddressId) {
        this.destinationAddressId = destinationAddressId;
    }

    
    private Boolean isSSTP;

    /**
     * Getter for isSSTP - One line item on this transaction.
     */
    public Boolean getIsSSTP() {
        return this.isSSTP;
    }

    /**
     * Setter for isSSTP - One line item on this transaction.
     */
    public void setIsSSTP(Boolean isSSTP) {
        this.isSSTP = isSSTP;
    }

    
    private String taxOverrideReason;

    /**
     * Getter for taxOverrideReason - One line item on this transaction.
     */
    public String getTaxOverrideReason() {
        return this.taxOverrideReason;
    }

    /**
     * Setter for taxOverrideReason - One line item on this transaction.
     */
    public void setTaxOverrideReason(String taxOverrideReason) {
        this.taxOverrideReason = taxOverrideReason;
    }

    
    private String itemCode;

    /**
     * Getter for itemCode - One line item on this transaction.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode - One line item on this transaction.
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    
    private ArrayList<TransactionLineDetailModel> details;

    /**
     * Getter for details - One line item on this transaction.
     */
    public ArrayList<TransactionLineDetailModel> getDetails() {
        return this.details;
    }

    /**
     * Setter for details - One line item on this transaction.
     */
    public void setDetails(ArrayList<TransactionLineDetailModel> details) {
        this.details = details;
    }

    
    private BigDecimal taxOverrideAmount;

    /**
     * Getter for taxOverrideAmount - One line item on this transaction.
     */
    public BigDecimal getTaxOverrideAmount() {
        return this.taxOverrideAmount;
    }

    /**
     * Setter for taxOverrideAmount - One line item on this transaction.
     */
    public void setTaxOverrideAmount(BigDecimal taxOverrideAmount) {
        this.taxOverrideAmount = taxOverrideAmount;
    }

    
    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount - One line item on this transaction.
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount - One line item on this transaction.
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    
    private Boolean taxIncluded;

    /**
     * Getter for taxIncluded - One line item on this transaction.
     */
    public Boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    /**
     * Setter for taxIncluded - One line item on this transaction.
     */
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    
    private HashMap<String, String> parameters;

    /**
     * Getter for parameters - One line item on this transaction.
     */
    public HashMap<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters - One line item on this transaction.
     */
    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    
    private Date taxDate;

    /**
     * Getter for taxDate - One line item on this transaction.
     */
    public Date getTaxDate() {
        return this.taxDate;
    }

    /**
     * Setter for taxDate - One line item on this transaction.
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    
    private Long transactionId;

    /**
     * Getter for transactionId - One line item on this transaction.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId - One line item on this transaction.
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    
    private BigDecimal discountAmount;

    /**
     * Getter for discountAmount - One line item on this transaction.
     */
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Setter for discountAmount - One line item on this transaction.
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    


    /**
     * Returns a JSON string representation of TransactionLineModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    