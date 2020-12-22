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
 */

/**
 * Represents a parameter associated with a company.
 */
public class CustomerSupplierCountryParamModel {


    private Long id;

    /**
     * Getter for id
     *
     * Identifier for company parameter
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Identifier for company parameter
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId associated with the parameter
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId associated with the parameter
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Long customerId;

    /**
     * Getter for customerId
     *
     * Identifier for company parameter
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for customerId
     *
     * Identifier for company parameter
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    private String customerCode;

    /**
     * Getter for customerCode
     *
     * 
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * 
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * 
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private Boolean isEstablished;

    /**
     * Getter for isEstablished
     *
     * 
     */
    public Boolean getIsEstablished() {
        return this.isEstablished;
    }

    /**
     * Setter for isEstablished
     *
     * 
     */
    public void setIsEstablished(Boolean value) {
        this.isEstablished = value;
    }

    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * 
     */
    public String getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * 
     */
    public void setBusinessIdentificationNo(String value) {
        this.businessIdentificationNo = value;
    }

    private Boolean isRegisteredThroughFiscalRep;

    /**
     * Getter for isRegisteredThroughFiscalRep
     *
     * 
     */
    public Boolean getIsRegisteredThroughFiscalRep() {
        return this.isRegisteredThroughFiscalRep;
    }

    /**
     * Setter for isRegisteredThroughFiscalRep
     *
     * 
     */
    public void setIsRegisteredThroughFiscalRep(Boolean value) {
        this.isRegisteredThroughFiscalRep = value;
    }

    /**
     * Returns a JSON string representation of CustomerSupplierCountryParamModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
