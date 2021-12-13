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
 * The tax rate model.
 */
public class ComplianceTaxRateModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique id of the rate.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique id of the rate.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The tax rate.
	 * 
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The tax rate.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * The id of the jurisdiction.
	 * 
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * The id of the jurisdiction.
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
    }

    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The id of the tax region.
	 * 
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The id of the tax region.
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date this rate is starts to take effect.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date this rate is starts to take effect.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date this rate is no longer active.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date this rate is no longer active.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * The rate type.
	 * 
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * The rate type.
     */
    public void setRateTypeId(String value) {
        this.rateTypeId = value;
    }

    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * The tax type.
	 * 
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * The tax type.
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private String taxName;

    /**
     * Getter for taxName
     *
     * The name of the tax.
	 * 
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * The name of the tax.
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    private Long unitOfBasisId;

    /**
     * Getter for unitOfBasisId
     *
     * The unit of basis.
	 * 
     */
    public Long getUnitOfBasisId() {
        return this.unitOfBasisId;
    }

    /**
     * Setter for unitOfBasisId
     *
     * The unit of basis.
     */
    public void setUnitOfBasisId(Long value) {
        this.unitOfBasisId = value;
    }

    private Integer rateTypeTaxTypeMappingId;

    /**
     * Getter for rateTypeTaxTypeMappingId
     *
     * The rate type tax type mapping id.
	 * 
     */
    public Integer getRateTypeTaxTypeMappingId() {
        return this.rateTypeTaxTypeMappingId;
    }

    /**
     * Setter for rateTypeTaxTypeMappingId
     *
     * The rate type tax type mapping id.
     */
    public void setRateTypeTaxTypeMappingId(Integer value) {
        this.rateTypeTaxTypeMappingId = value;
    }

    /**
     * Returns a JSON string representation of ComplianceTaxRateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
