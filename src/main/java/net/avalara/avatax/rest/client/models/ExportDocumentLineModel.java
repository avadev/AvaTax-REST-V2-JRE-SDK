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
 * An input model for executing a report detailed to the document line level
 */
public class ExportDocumentLineModel {


    private ReportFormat format;

    /**
     * Getter for format
     *
     * The file format.
	 * 
     */
    public ReportFormat getFormat() {
        return this.format;
    }

    /**
     * Setter for format
     *
     * The file format.
     */
    public void setFormat(ReportFormat value) {
        this.format = value;
    }

    private Date startDate;

    /**
     * Getter for startDate
     *
     * The start date filter for report execution. If no date provided, same date of last month will be used as the startDate.
    * Accepts date in short format yyyy-mm-dd as well as date time stamp
	 * 
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date filter for report execution. If no date provided, same date of last month will be used as the startDate.
    * Accepts date in short format yyyy-mm-dd as well as date time stamp
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date filter for report execution. If no date provided, today's date will be used as the endDate.
    * Accepts date in short format yyyy-mm-dd as well as date time stamp
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date filter for report execution. If no date provided, today's date will be used as the endDate.
    * Accepts date in short format yyyy-mm-dd as well as date time stamp
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The transactions in the country you wish to run a report.
    * Use "ALL" for all countries
    * Use "ALL Non-US" for all international countries
    * Or use a single 2-char ISO country code
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The transactions in the country you wish to run a report.
    * Use "ALL" for all countries
    * Use "ALL Non-US" for all international countries
    * Or use a single 2-char ISO country code
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * The state associated with the transactions you wish to run a report.
    * Use "ALL" for all states or 2-char state code.
	 * 
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * The state associated with the transactions you wish to run a report.
    * Use "ALL" for all states or 2-char state code.
     */
    public void setState(String value) {
        this.state = value;
    }

    private ReportDateFilter dateFilter;

    /**
     * Getter for dateFilter
     *
     * The type of date to filter your transactions
	 * 
     */
    public ReportDateFilter getDateFilter() {
        return this.dateFilter;
    }

    /**
     * Setter for dateFilter
     *
     * The type of date to filter your transactions
     */
    public void setDateFilter(ReportDateFilter value) {
        this.dateFilter = value;
    }

    private ReportDocType docType;

    /**
     * Getter for docType
     *
     * The transaction type you want to run a report on
	 * 
     */
    public ReportDocType getDocType() {
        return this.docType;
    }

    /**
     * Setter for docType
     *
     * The transaction type you want to run a report on
     */
    public void setDocType(ReportDocType value) {
        this.docType = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The currency your report is displayed in.
    * Accepts "USD" or leave this blank to get all the documents with all the currencies
	 * 
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The currency your report is displayed in.
    * Accepts "USD" or leave this blank to get all the documents with all the currencies
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Integer numberOfPartitions;

    /**
     * Getter for numberOfPartitions
     *
     * Number of partitions (2 - 250) to split the report into.
    * If a value is provided for this property, a value must also be provided for the partition property.
	 * 
     */
    public Integer getNumberOfPartitions() {
        return this.numberOfPartitions;
    }

    /**
     * Setter for numberOfPartitions
     *
     * Number of partitions (2 - 250) to split the report into.
    * If a value is provided for this property, a value must also be provided for the partition property.
     */
    public void setNumberOfPartitions(Integer value) {
        this.numberOfPartitions = value;
    }

    private Integer partition;

    /**
     * Getter for partition
     *
     * The zero-based partition number to retrieve in this export request.
    * If a value is provided for this property, a value must also be provided for the numberOfPartitions property.
	 * 
     */
    public Integer getPartition() {
        return this.partition;
    }

    /**
     * Setter for partition
     *
     * The zero-based partition number to retrieve in this export request.
    * If a value is provided for this property, a value must also be provided for the numberOfPartitions property.
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

    private String merchantSellerIdentifier;

    /**
     * Getter for merchantSellerIdentifier
     *
     * If set, include only documents associated with these merchantSellerIds.Multiple merchantSellerIds should be sent by comma separated values.
	 * 
     */
    public String getMerchantSellerIdentifier() {
        return this.merchantSellerIdentifier;
    }

    /**
     * Setter for merchantSellerIdentifier
     *
     * If set, include only documents associated with these merchantSellerIds.Multiple merchantSellerIds should be sent by comma separated values.
     */
    public void setMerchantSellerIdentifier(String value) {
        this.merchantSellerIdentifier = value;
    }

    private DocumentStatus documentStatus;

    /**
     * Getter for documentStatus
     *
     * DocumentStatus
    * For documentStatus, accepted values are: Saved, Posted, Committed, Cancelled
	 * 
     */
    public DocumentStatus getDocumentStatus() {
        return this.documentStatus;
    }

    /**
     * Setter for documentStatus
     *
     * DocumentStatus
    * For documentStatus, accepted values are: Saved, Posted, Committed, Cancelled
     */
    public void setDocumentStatus(DocumentStatus value) {
        this.documentStatus = value;
    }

    private Boolean isModifiedDateSameAsDocumentDate;

    /**
     * Getter for isModifiedDateSameAsDocumentDate
     *
     * Use this parameter when dateFilter = ModifiedDate.
    * For dateFilter = DocumentDate, PaymentDate, TaxDate or ReportingDate, the isModifiedDateSameAsDocumentDate parameter is ignored.
    * Set this parameter to true when you would like to get Documents which have the Document Date same as Modified Date.
    * Defaults to false if not specified.
	 * 
     */
    public Boolean getIsModifiedDateSameAsDocumentDate() {
        return this.isModifiedDateSameAsDocumentDate;
    }

    /**
     * Setter for isModifiedDateSameAsDocumentDate
     *
     * Use this parameter when dateFilter = ModifiedDate.
    * For dateFilter = DocumentDate, PaymentDate, TaxDate or ReportingDate, the isModifiedDateSameAsDocumentDate parameter is ignored.
    * Set this parameter to true when you would like to get Documents which have the Document Date same as Modified Date.
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
     * Returns a JSON string representation of ExportDocumentLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
