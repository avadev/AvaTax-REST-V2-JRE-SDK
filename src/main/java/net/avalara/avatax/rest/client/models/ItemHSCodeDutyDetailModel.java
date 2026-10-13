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
 * Represents HS Code Duty Details for an item.
 */
public class ItemHSCodeDutyDetailModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID of the HS Code Duty Detail.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID of the HS Code Duty Detail.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Long itemId;

    /**
     * Getter for itemId
     *
     * The unique ID of the item.
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The unique ID of the item.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID of the company.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID of the company.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String countryOfImport;

    /**
     * Getter for countryOfImport
     *
     * The country of import.
     */
    public String getCountryOfImport() {
        return this.countryOfImport;
    }

    /**
     * Setter for countryOfImport
     *
     * The country of import.
     */
    public void setCountryOfImport(String value) {
        this.countryOfImport = value;
    }

    private String countryOfExport;

    /**
     * Getter for countryOfExport
     *
     * The country of export.
     */
    public String getCountryOfExport() {
        return this.countryOfExport;
    }

    /**
     * Setter for countryOfExport
     *
     * The country of export.
     */
    public void setCountryOfExport(String value) {
        this.countryOfExport = value;
    }

    private String countryOfOrigin;

    /**
     * Getter for countryOfOrigin
     *
     * The country of origin.
     */
    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    /**
     * Setter for countryOfOrigin
     *
     * The country of origin.
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    private String manufacturerName;

    /**
     * Getter for manufacturerName
     *
     * The manufacturer name.
     */
    public String getManufacturerName() {
        return this.manufacturerName;
    }

    /**
     * Setter for manufacturerName
     *
     * The manufacturer name.
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    private String mfnRate;

    /**
     * Getter for mfnRate
     *
     * The MFN rate.
     */
    public String getMfnRate() {
        return this.mfnRate;
    }

    /**
     * Setter for mfnRate
     *
     * The MFN rate.
     */
    public void setMfnRate(String value) {
        this.mfnRate = value;
    }

    private String currency;

    /**
     * Getter for currency
     *
     * The three-character currency code according to the country of import. For example, if the country is 'US' then the currency is 'USD'.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Setter for currency
     *
     * The three-character currency code according to the country of import. For example, if the country is 'US' then the currency is 'USD'.
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    private String uom;

    /**
     * Getter for uom
     *
     * The unit of measure.
     */
    public String getUom() {
        return this.uom;
    }

    /**
     * Setter for uom
     *
     * The unit of measure.
     */
    public void setUom(String value) {
        this.uom = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The import date the duty snapshot is effective for (date-only, yyyy-MM-dd). Optional; saved as-is on Create / Update and returned as null when no date is available.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The import date the duty snapshot is effective for (date-only, yyyy-MM-dd). Optional; saved as-is on Create / Update and returned as null when no date is available.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private BigDecimal effectiveRate;

    /**
     * Getter for effectiveRate
     *
     * The effective duty rate as a decimal number (for example, 7.5).
     */
    public BigDecimal getEffectiveRate() {
        return this.effectiveRate;
    }

    /**
     * Setter for effectiveRate
     *
     * The effective duty rate as a decimal number (for example, 7.5).
     */
    public void setEffectiveRate(BigDecimal value) {
        this.effectiveRate = value;
    }

    private String effectiveRateFormula;

    /**
     * Getter for effectiveRateFormula
     *
     * The effective rate formula passed to the UI as-is (for example, "90 * Count").
     */
    public String getEffectiveRateFormula() {
        return this.effectiveRateFormula;
    }

    /**
     * Setter for effectiveRateFormula
     *
     * The effective rate formula passed to the UI as-is (for example, "90 * Count").
     */
    public void setEffectiveRateFormula(String value) {
        this.effectiveRateFormula = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private ArrayList<ItemHSCodeFTADetailModel> ftaDetails;

    /**
     * Getter for ftaDetails
     *
     * List of FTA details.
     */
    public ArrayList<ItemHSCodeFTADetailModel> getFtaDetails() {
        return this.ftaDetails;
    }

    /**
     * Setter for ftaDetails
     *
     * List of FTA details.
     */
    public void setFtaDetails(ArrayList<ItemHSCodeFTADetailModel> value) {
        this.ftaDetails = value;
    }

    private ArrayList<ItemHSCodeCvdAddDetailModel> cvdAddDetails;

    /**
     * Getter for cvdAddDetails
     *
     * List of CVD/ADD details.
     */
    public ArrayList<ItemHSCodeCvdAddDetailModel> getCvdAddDetails() {
        return this.cvdAddDetails;
    }

    /**
     * Setter for cvdAddDetails
     *
     * List of CVD/ADD details.
     */
    public void setCvdAddDetails(ArrayList<ItemHSCodeCvdAddDetailModel> value) {
        this.cvdAddDetails = value;
    }

    private ArrayList<ItemHSCodePunitiveRateDetailModel> punitiveRateDetails;

    /**
     * Getter for punitiveRateDetails
     *
     * List of punitive rate details.
     */
    public ArrayList<ItemHSCodePunitiveRateDetailModel> getPunitiveRateDetails() {
        return this.punitiveRateDetails;
    }

    /**
     * Setter for punitiveRateDetails
     *
     * List of punitive rate details.
     */
    public void setPunitiveRateDetails(ArrayList<ItemHSCodePunitiveRateDetailModel> value) {
        this.punitiveRateDetails = value;
    }

    private ArrayList<ItemHSCodeRestrictionDetailModel> restrictionDetails;

    /**
     * Getter for restrictionDetails
     *
     * List of restriction details.
     */
    public ArrayList<ItemHSCodeRestrictionDetailModel> getRestrictionDetails() {
        return this.restrictionDetails;
    }

    /**
     * Setter for restrictionDetails
     *
     * List of restriction details.
     */
    public void setRestrictionDetails(ArrayList<ItemHSCodeRestrictionDetailModel> value) {
        this.restrictionDetails = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeDutyDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
