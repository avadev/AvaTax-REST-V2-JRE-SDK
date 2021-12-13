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
 * Represents a tax rule product detail that changes the behavior of Avalara's tax engine for certain tax rules.
*  
* Avalara supports a two types of tax product detail. For information about tax rule Product Types
* HSCode and TaxCode
*  
* Because different types of tax rules have different behavior, some fields may change their behavior based on
* the type of tax rule selected. Please read the documentation for each field carefully and ensure that
* the value you send is appropriate for the type of tax rule.
 */
public class TaxRuleProductDetailModel {


    private Integer taxRuleProductDetailId;

    /**
     * Getter for taxRuleProductDetailId
     *
     * The unique ID number of this Tax rule product detail.
	 * 
     */
    public Integer getTaxRuleProductDetailId() {
        return this.taxRuleProductDetailId;
    }

    /**
     * Setter for taxRuleProductDetailId
     *
     * The unique ID number of this Tax rule product detail.
     */
    public void setTaxRuleProductDetailId(Integer value) {
        this.taxRuleProductDetailId = value;
    }

    private Integer taxRuleId;

    /**
     * Getter for taxRuleId
     *
     * TaxRule Id of TaxRule Product Detail entry
	 * 
     */
    public Integer getTaxRuleId() {
        return this.taxRuleId;
    }

    /**
     * Setter for taxRuleId
     *
     * TaxRule Id of TaxRule Product Detail entry
     */
    public void setTaxRuleId(Integer value) {
        this.taxRuleId = value;
    }

    private String productCode;

    /**
     * Getter for productCode
     *
     * Product Code value
	 * 
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Setter for productCode
     *
     * Product Code value
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date at which this product detail applies. If `null`, this product detail will apply to all dates prior to the end date.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The first date at which this product detail applies. If `null`, this product detail will apply to all dates prior to the end date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date for which this product detail applies. If `null`, this product detail will apply to all dates after the effective date.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date for which this product detail applies. If `null`, this product detail will apply to all dates after the effective date.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Integer systemId;

    /**
     * Getter for systemId
     *
     * Represents the system Id the detail is applicable for.
	 * 
     */
    public Integer getSystemId() {
        return this.systemId;
    }

    /**
     * Setter for systemId
     *
     * Represents the system Id the detail is applicable for.
     */
    public void setSystemId(Integer value) {
        this.systemId = value;
    }

    /**
     * Returns a JSON string representation of TaxRuleProductDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
