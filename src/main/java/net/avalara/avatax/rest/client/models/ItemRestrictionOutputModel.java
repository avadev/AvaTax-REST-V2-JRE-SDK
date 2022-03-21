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
 * Represents a parameter associated with an item.
 */
public class ItemRestrictionOutputModel {


    private String id;

    /**
     * Getter for id
     *
     * 
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    private String countryOfImport;

    /**
     * Getter for countryOfImport
     *
     * The Country Of Import for which this restriction is there
     */
    public String getCountryOfImport() {
        return this.countryOfImport;
    }

    /**
     * Setter for countryOfImport
     *
     * The Country Of Import for which this restriction is there
     */
    public void setCountryOfImport(String value) {
        this.countryOfImport = value;
    }

    private String countryOfExport;

    /**
     * Getter for countryOfExport
     *
     * The Country Of Export for which this restriction is there
     */
    public String getCountryOfExport() {
        return this.countryOfExport;
    }

    /**
     * Setter for countryOfExport
     *
     * The Country Of Export for which this restriction is there
     */
    public void setCountryOfExport(String value) {
        this.countryOfExport = value;
    }

    private String countryOfManufacture;

    /**
     * Getter for countryOfManufacture
     *
     * The Country Of Manufacture for which this restriction is there
     */
    public String getCountryOfManufacture() {
        return this.countryOfManufacture;
    }

    /**
     * Setter for countryOfManufacture
     *
     * The Country Of Manufacture for which this restriction is there
     */
    public void setCountryOfManufacture(String value) {
        this.countryOfManufacture = value;
    }

    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The HsCode for which this restriction is getting created
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The HsCode for which this restriction is getting created
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * Item for which this restrictions exists
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * Item for which this restrictions exists
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId associated with the item
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId associated with the item
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String restrictionType;

    /**
     * Getter for restrictionType
     *
     * Restriction Type of the Item
     */
    public String getRestrictionType() {
        return this.restrictionType;
    }

    /**
     * Setter for restrictionType
     *
     * Restriction Type of the Item
     */
    public void setRestrictionType(String value) {
        this.restrictionType = value;
    }

    private String regulation;

    /**
     * Getter for regulation
     *
     * Regulation of the Item
     */
    public String getRegulation() {
        return this.regulation;
    }

    /**
     * Setter for regulation
     *
     * Regulation of the Item
     */
    public void setRegulation(String value) {
        this.regulation = value;
    }

    private String governmentAgency;

    /**
     * Getter for governmentAgency
     *
     * Government agency which is related for this restriction
     */
    public String getGovernmentAgency() {
        return this.governmentAgency;
    }

    /**
     * Setter for governmentAgency
     *
     * Government agency which is related for this restriction
     */
    public void setGovernmentAgency(String value) {
        this.governmentAgency = value;
    }

    private String complianceMessage;

    /**
     * Getter for complianceMessage
     *
     * Message
     */
    public String getComplianceMessage() {
        return this.complianceMessage;
    }

    /**
     * Setter for complianceMessage
     *
     * Message
     */
    public void setComplianceMessage(String value) {
        this.complianceMessage = value;
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
     * The user which created the record
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user which created the record
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    /**
     * Returns a JSON string representation of ItemRestrictionOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
