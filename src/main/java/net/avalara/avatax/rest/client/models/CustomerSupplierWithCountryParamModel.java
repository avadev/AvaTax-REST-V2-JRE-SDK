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
 * Represents a customer with its country parameter information.
* This model combines CustomerSupplier and CustomerSupplierCountryParam data.
 */
public class CustomerSupplierWithCountryParamModel {


    private Long customerId;

    /**
     * Getter for customerId
     *
     * Customer ID
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for customerId
     *
     * Customer ID
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    private String customerCode;

    /**
     * Getter for customerCode
     *
     * Customer Code
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * Customer Code
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company ID
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company ID
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Integer customerTypeId;

    /**
     * Getter for customerTypeId
     *
     * Customer Type ID (1=Customer, 2=Supplier)
     */
    public Integer getCustomerTypeId() {
        return this.customerTypeId;
    }

    /**
     * Setter for customerTypeId
     *
     * Customer Type ID (1=Customer, 2=Supplier)
     */
    public void setCustomerTypeId(Integer value) {
        this.customerTypeId = value;
    }

    private Long customerSupplierCountryParamId;

    /**
     * Getter for customerSupplierCountryParamId
     *
     * Customer Supplier Country Parameter ID
     */
    public Long getCustomerSupplierCountryParamId() {
        return this.customerSupplierCountryParamId;
    }

    /**
     * Setter for customerSupplierCountryParamId
     *
     * Customer Supplier Country Parameter ID
     */
    public void setCustomerSupplierCountryParamId(Long value) {
        this.customerSupplierCountryParamId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Country code
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country code
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private Boolean isEstablished;

    /**
     * Getter for isEstablished
     *
     * Whether the customer is established in this country
     */
    public Boolean getIsEstablished() {
        return this.isEstablished;
    }

    /**
     * Setter for isEstablished
     *
     * Whether the customer is established in this country
     */
    public void setIsEstablished(Boolean value) {
        this.isEstablished = value;
    }

    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * Business Identification Number
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * Business Identification Number
     */
    public void setBusinessIdentificationNo(String value) {
        this.businessIdentificationNo = value;
    }

    private Boolean isRegisteredThroughFiscalRep;

    /**
     * Getter for isRegisteredThroughFiscalRep
     *
     * Whether registered through fiscal representative
     */
    public Boolean getIsRegisteredThroughFiscalRep() {
        return this.isRegisteredThroughFiscalRep;
    }

    /**
     * Setter for isRegisteredThroughFiscalRep
     *
     * Whether registered through fiscal representative
     */
    public void setIsRegisteredThroughFiscalRep(Boolean value) {
        this.isRegisteredThroughFiscalRep = value;
    }

    private String vatNumber;

    /**
     * Getter for vatNumber
     *
     * VAT number for the customer in this country
     */
    public String getVatNumber() {
        return this.vatNumber;
    }

    /**
     * Setter for vatNumber
     *
     * VAT number for the customer in this country
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    private Integer vatNumberStatus;

    /**
     * Getter for vatNumberStatus
     *
     * Status of VAT number validation (0=NotValidated, 1=Valid, 2=Invalid, 3=Unverifiable, 4=ValidationError, 5=UnsupportedCountry)
     */
    public Integer getVatNumberStatus() {
        return this.vatNumberStatus;
    }

    /**
     * Setter for vatNumberStatus
     *
     * Status of VAT number validation (0=NotValidated, 1=Valid, 2=Invalid, 3=Unverifiable, 4=ValidationError, 5=UnsupportedCountry)
     */
    public void setVatNumberStatus(Integer value) {
        this.vatNumberStatus = value;
    }

    /**
     * Returns a JSON string representation of CustomerSupplierWithCountryParamModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
