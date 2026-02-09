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
 * Represents input model for additional HS Code Duty Details request.
 */
public class ItemAdditionalHSCodeDutyInputModel {


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

    private String hscode;

    /**
     * Getter for hscode
     *
     * The country of import.
     */
    public String getHscode() {
        return this.hscode;
    }

    /**
     * Setter for hscode
     *
     * The country of import.
     */
    public void setHscode(String value) {
        this.hscode = value;
    }

    private Boolean isAdditionalDuty;

    /**
     * Getter for isAdditionalDuty
     *
     * The country of import.
     */
    public Boolean getIsAdditionalDuty() {
        return this.isAdditionalDuty;
    }

    /**
     * Setter for isAdditionalDuty
     *
     * The country of import.
     */
    public void setIsAdditionalDuty(Boolean value) {
        this.isAdditionalDuty = value;
    }

    /**
     * Returns a JSON string representation of ItemAdditionalHSCodeDutyInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
