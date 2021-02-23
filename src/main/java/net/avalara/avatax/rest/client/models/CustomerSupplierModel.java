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
public class CustomerSupplierModel {


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

    private String customerCode;

    /**
     * Getter for customerCode
     *
     * CustomerCode
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * CustomerCode
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Returns a JSON string representation of CustomerSupplierModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
