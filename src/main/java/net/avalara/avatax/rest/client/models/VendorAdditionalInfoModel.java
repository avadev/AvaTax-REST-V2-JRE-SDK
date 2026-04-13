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
 * Represents additional information for vendor
 */
public class VendorAdditionalInfoModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this vendor additional info record.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this vendor additional info record.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer vendorId;

    /**
     * Getter for vendorId
     *
     * The ID of the vendor (customer) this additional information is associated with.
     */
    public Integer getVendorId() {
        return this.vendorId;
    }

    /**
     * Setter for vendorId
     *
     * The ID of the vendor (customer) this additional information is associated with.
     */
    public void setVendorId(Integer value) {
        this.vendorId = value;
    }

    private Long costCenterId;

    /**
     * Getter for costCenterId
     *
     * The identifier for the cost center associated with this vendor.
     */
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    /**
     * Setter for costCenterId
     *
     * The identifier for the cost center associated with this vendor.
     */
    public void setCostCenterId(Long value) {
        this.costCenterId = value;
    }

    private String costCenterCode;

    /**
     * Getter for costCenterCode
     *
     * The cost center code associated with this vendor.
     */
    public String getCostCenterCode() {
        return this.costCenterCode;
    }

    /**
     * Setter for costCenterCode
     *
     * The cost center code associated with this vendor.
     */
    public void setCostCenterCode(String value) {
        this.costCenterCode = value;
    }

    private Long itemCodeId;

    /**
     * Getter for itemCodeId
     *
     * The identifier for the item code associated with this vendor.
     */
    public Long getItemCodeId() {
        return this.itemCodeId;
    }

    /**
     * Setter for itemCodeId
     *
     * The identifier for the item code associated with this vendor.
     */
    public void setItemCodeId(Long value) {
        this.itemCodeId = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * The item code associated with this vendor.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * The item code associated with this vendor.
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private String defaultTaxExemption;

    /**
     * Getter for defaultTaxExemption
     *
     * The default tax exemption for this vendor.
     */
    public String getDefaultTaxExemption() {
        return this.defaultTaxExemption;
    }

    /**
     * Setter for defaultTaxExemption
     *
     * The default tax exemption for this vendor.
     */
    public void setDefaultTaxExemption(String value) {
        this.defaultTaxExemption = value;
    }

    private Integer shipFromLocationId;

    /**
     * Getter for shipFromLocationId
     *
     * The ID of the ship-from location for this vendor.
     */
    public Integer getShipFromLocationId() {
        return this.shipFromLocationId;
    }

    /**
     * Setter for shipFromLocationId
     *
     * The ID of the ship-from location for this vendor.
     */
    public void setShipFromLocationId(Integer value) {
        this.shipFromLocationId = value;
    }

    private String shipFromLocationCode;

    /**
     * Getter for shipFromLocationCode
     *
     * The code identifying the ship-from location for this vendor.
     */
    public String getShipFromLocationCode() {
        return this.shipFromLocationCode;
    }

    /**
     * Setter for shipFromLocationCode
     *
     * The code identifying the ship-from location for this vendor.
     */
    public void setShipFromLocationCode(String value) {
        this.shipFromLocationCode = value;
    }

    private String shipFromAddressLine;

    /**
     * Getter for shipFromAddressLine
     *
     * Street address line of the ship-from location for this vendor.
     */
    public String getShipFromAddressLine() {
        return this.shipFromAddressLine;
    }

    /**
     * Setter for shipFromAddressLine
     *
     * Street address line of the ship-from location for this vendor.
     */
    public void setShipFromAddressLine(String value) {
        this.shipFromAddressLine = value;
    }

    private String shipFromAddressCity;

    /**
     * Getter for shipFromAddressCity
     *
     * City component of the ship-from address for this vendor.
     */
    public String getShipFromAddressCity() {
        return this.shipFromAddressCity;
    }

    /**
     * Setter for shipFromAddressCity
     *
     * City component of the ship-from address for this vendor.
     */
    public void setShipFromAddressCity(String value) {
        this.shipFromAddressCity = value;
    }

    private String shipFromAddressState;

    /**
     * Getter for shipFromAddressState
     *
     * State or region component of the ship-from address for this vendor.
     */
    public String getShipFromAddressState() {
        return this.shipFromAddressState;
    }

    /**
     * Setter for shipFromAddressState
     *
     * State or region component of the ship-from address for this vendor.
     */
    public void setShipFromAddressState(String value) {
        this.shipFromAddressState = value;
    }

    private String shipFromAddressZip;

    /**
     * Getter for shipFromAddressZip
     *
     * Postal code / zip code component of the ship-from address for this vendor.
     */
    public String getShipFromAddressZip() {
        return this.shipFromAddressZip;
    }

    /**
     * Setter for shipFromAddressZip
     *
     * Postal code / zip code component of the ship-from address for this vendor.
     */
    public void setShipFromAddressZip(String value) {
        this.shipFromAddressZip = value;
    }

    private String shipFromAddressCountry;

    /**
     * Getter for shipFromAddressCountry
     *
     * Country component of the ship-from address for this vendor.
     */
    public String getShipFromAddressCountry() {
        return this.shipFromAddressCountry;
    }

    /**
     * Setter for shipFromAddressCountry
     *
     * Country component of the ship-from address for this vendor.
     */
    public void setShipFromAddressCountry(String value) {
        this.shipFromAddressCountry = value;
    }

    private Integer shipToLocationId;

    /**
     * Getter for shipToLocationId
     *
     * The unique ID of the ship-to location for this vendor.
     */
    public Integer getShipToLocationId() {
        return this.shipToLocationId;
    }

    /**
     * Setter for shipToLocationId
     *
     * The unique ID of the ship-to location for this vendor.
     */
    public void setShipToLocationId(Integer value) {
        this.shipToLocationId = value;
    }

    private String shipToLocationCode;

    /**
     * Getter for shipToLocationCode
     *
     * The code identifying the ship-to location for this vendor.
     */
    public String getShipToLocationCode() {
        return this.shipToLocationCode;
    }

    /**
     * Setter for shipToLocationCode
     *
     * The code identifying the ship-to location for this vendor.
     */
    public void setShipToLocationCode(String value) {
        this.shipToLocationCode = value;
    }

    private String shipToAddressLine;

    /**
     * Getter for shipToAddressLine
     *
     * Street address line of the ship-to location for this vendor.
     */
    public String getShipToAddressLine() {
        return this.shipToAddressLine;
    }

    /**
     * Setter for shipToAddressLine
     *
     * Street address line of the ship-to location for this vendor.
     */
    public void setShipToAddressLine(String value) {
        this.shipToAddressLine = value;
    }

    private String shipToAddressCity;

    /**
     * Getter for shipToAddressCity
     *
     * City component of the ship-to address for this vendor.
     */
    public String getShipToAddressCity() {
        return this.shipToAddressCity;
    }

    /**
     * Setter for shipToAddressCity
     *
     * City component of the ship-to address for this vendor.
     */
    public void setShipToAddressCity(String value) {
        this.shipToAddressCity = value;
    }

    private String shipToAddressState;

    /**
     * Getter for shipToAddressState
     *
     * State or region component of the ship-to address for this vendor.
     */
    public String getShipToAddressState() {
        return this.shipToAddressState;
    }

    /**
     * Setter for shipToAddressState
     *
     * State or region component of the ship-to address for this vendor.
     */
    public void setShipToAddressState(String value) {
        this.shipToAddressState = value;
    }

    private String shipToAddressZip;

    /**
     * Getter for shipToAddressZip
     *
     * Postal code / zip code component of the ship-to address for this vendor.
     */
    public String getShipToAddressZip() {
        return this.shipToAddressZip;
    }

    /**
     * Setter for shipToAddressZip
     *
     * Postal code / zip code component of the ship-to address for this vendor.
     */
    public void setShipToAddressZip(String value) {
        this.shipToAddressZip = value;
    }

    private String shipToAddressCountry;

    /**
     * Getter for shipToAddressCountry
     *
     * Country component of the ship-to address for this vendor.
     */
    public String getShipToAddressCountry() {
        return this.shipToAddressCountry;
    }

    /**
     * Setter for shipToAddressCountry
     *
     * Country component of the ship-to address for this vendor.
     */
    public void setShipToAddressCountry(String value) {
        this.shipToAddressCountry = value;
    }

    private Boolean isTrustedVendor;

    /**
     * Getter for isTrustedVendor
     *
     * This value is `true` if this vendor is marked as a trusted vendor.
     */
    public Boolean getIsTrustedVendor() {
        return this.isTrustedVendor;
    }

    /**
     * Setter for isTrustedVendor
     *
     * This value is `true` if this vendor is marked as a trusted vendor.
     */
    public void setIsTrustedVendor(Boolean value) {
        this.isTrustedVendor = value;
    }

    private Boolean isAccrual;

    /**
     * Getter for isAccrual
     *
     * This value is `true` if accrual accounting is enabled for this vendor.
     */
    public Boolean getIsAccrual() {
        return this.isAccrual;
    }

    /**
     * Setter for isAccrual
     *
     * This value is `true` if accrual accounting is enabled for this vendor.
     */
    public void setIsAccrual(Boolean value) {
        this.isAccrual = value;
    }

    private Boolean isTaxOnVendor;

    /**
     * Getter for isTaxOnVendor
     *
     * This value is `true` if tax liability is on the vendor rather than the purchaser.
     */
    public Boolean getIsTaxOnVendor() {
        return this.isTaxOnVendor;
    }

    /**
     * Setter for isTaxOnVendor
     *
     * This value is `true` if tax liability is on the vendor rather than the purchaser.
     */
    public void setIsTaxOnVendor(Boolean value) {
        this.isTaxOnVendor = value;
    }

    /**
     * Returns a JSON string representation of VendorAdditionalInfoModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
