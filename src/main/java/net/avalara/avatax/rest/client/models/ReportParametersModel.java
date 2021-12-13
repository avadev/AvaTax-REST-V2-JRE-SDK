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
 * The output model for report parameter definitions
 */
public class ReportParametersModel {


    private Date startDate;

    /**
     * Getter for startDate
     *
     * The start date filter used for your report
	 * 
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date filter used for your report
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date filter used for your report
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date filter used for your report
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country filter used for your report
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country filter used for your report
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * The state filter used for your report
	 * 
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * The state filter used for your report
     */
    public void setState(String value) {
        this.state = value;
    }

    private String dateFilter;

    /**
     * Getter for dateFilter
     *
     * The date type filter used for your report
	 * 
     */
    public String getDateFilter() {
        return this.dateFilter;
    }

    /**
     * Setter for dateFilter
     *
     * The date type filter used for your report
     */
    public void setDateFilter(String value) {
        this.dateFilter = value;
    }

    private String docType;

    /**
     * Getter for docType
     *
     * The doc type filter used for your report
	 * 
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Setter for docType
     *
     * The doc type filter used for your report
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    private String dateFormat;

    /**
     * Getter for dateFormat
     *
     * The date format used for your report
	 * 
     */
    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * Setter for dateFormat
     *
     * The date format used for your report
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The currency code used for your report
	 * 
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The currency code used for your report
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Integer numberOfPartitions;

    /**
     * Getter for numberOfPartitions
     *
     * Number of partitions to split the report into.
	 * 
     */
    public Integer getNumberOfPartitions() {
        return this.numberOfPartitions;
    }

    /**
     * Setter for numberOfPartitions
     *
     * Number of partitions to split the report into.
     */
    public void setNumberOfPartitions(Integer value) {
        this.numberOfPartitions = value;
    }

    private Integer partition;

    /**
     * Getter for partition
     *
     * The zero-based partition number to retrieve in this export request.
	 * 
     */
    public Integer getPartition() {
        return this.partition;
    }

    /**
     * Setter for partition
     *
     * The zero-based partition number to retrieve in this export request.
     */
    public void setPartition(Integer value) {
        this.partition = value;
    }

    private Boolean isLocked;

    /**
     * Getter for isLocked
     *
     * If true, include only documents that are locked.
    * If false, include only documents that are not locked.
    * Defaults to false if not specified.
	 * 
     */
    public Boolean getIsLocked() {
        return this.isLocked;
    }

    /**
     * Setter for isLocked
     *
     * If true, include only documents that are locked.
    * If false, include only documents that are not locked.
    * Defaults to false if not specified.
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    private String merchantSellerId;

    /**
     * Getter for merchantSellerId
     *
     * If set, include only documents associated with this merchantSellerId.
	 * 
     */
    public String getMerchantSellerId() {
        return this.merchantSellerId;
    }

    /**
     * Setter for merchantSellerId
     *
     * If set, include only documents associated with this merchantSellerId.
     */
    public void setMerchantSellerId(String value) {
        this.merchantSellerId = value;
    }

    private String documentStatus;

    /**
     * Getter for documentStatus
     *
     * The Document status filter used for report
    * For documentStatus, accepted values are: Temporary, Saved, Posted, Committed, Cancelled, Adjusted, Queued, PendingApproval
	 * 
     */
    public String getDocumentStatus() {
        return this.documentStatus;
    }

    /**
     * Setter for documentStatus
     *
     * The Document status filter used for report
    * For documentStatus, accepted values are: Temporary, Saved, Posted, Committed, Cancelled, Adjusted, Queued, PendingApproval
     */
    public void setDocumentStatus(String value) {
        this.documentStatus = value;
    }

    private Boolean isModifiedDateSameAsDocumentDate;

    /**
     * Getter for isModifiedDateSameAsDocumentDate
     *
     * If true, modified date will be same as document date
    * If false, modified date will not be same as document date
    * Defaults to false if not specified.
	 * 
     */
    public Boolean getIsModifiedDateSameAsDocumentDate() {
        return this.isModifiedDateSameAsDocumentDate;
    }

    /**
     * Setter for isModifiedDateSameAsDocumentDate
     *
     * If true, modified date will be same as document date
    * If false, modified date will not be same as document date
    * Defaults to false if not specified.
     */
    public void setIsModifiedDateSameAsDocumentDate(Boolean value) {
        this.isModifiedDateSameAsDocumentDate = value;
    }

    private String taxGroup;

    /**
     * Getter for taxGroup
     *
     * TaxGroup is required to support Sales tax (Sales + SellersUse) and VAT (Input+ Output).
    * TaxTypes, such as Lodging, Bottle, LandedCost, Ewaste, BevAlc, etc
	 * 
     */
    public String getTaxGroup() {
        return this.taxGroup;
    }

    /**
     * Setter for taxGroup
     *
     * TaxGroup is required to support Sales tax (Sales + SellersUse) and VAT (Input+ Output).
    * TaxTypes, such as Lodging, Bottle, LandedCost, Ewaste, BevAlc, etc
     */
    public void setTaxGroup(String value) {
        this.taxGroup = value;
    }

    private String taxName;

    /**
     * Getter for taxName
     *
     * The description of the tax
	 * 
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * The description of the tax
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * The AvaTax tax code or customer tax code associated with the item or SKU in the transaction
	 * 
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * The AvaTax tax code or customer tax code associated with the item or SKU in the transaction
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String customerVendorCode;

    /**
     * Getter for customerVendorCode
     *
     * The code your business application uses to identify a customer or vendor
	 * 
     */
    public String getCustomerVendorCode() {
        return this.customerVendorCode;
    }

    /**
     * Setter for customerVendorCode
     *
     * The code your business application uses to identify a customer or vendor
     */
    public void setCustomerVendorCode(String value) {
        this.customerVendorCode = value;
    }

    private String taxSubType;

    /**
     * Getter for taxSubType
     *
     * Defines the individual taxes associated with a TaxType category, such as Lodging TaxType which supports numerous TaxSubTypes, including Hotel, Occupancy, ConventionCenter, Accommotations, etc.
	 * 
     */
    public String getTaxSubType() {
        return this.taxSubType;
    }

    /**
     * Setter for taxSubType
     *
     * Defines the individual taxes associated with a TaxType category, such as Lodging TaxType which supports numerous TaxSubTypes, including Hotel, Occupancy, ConventionCenter, Accommotations, etc.
     */
    public void setTaxSubType(String value) {
        this.taxSubType = value;
    }

    /**
     * Returns a JSON string representation of ReportParametersModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
