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
 * A model for aggregated rates.
 */
public class ComplianceAggregatedTaxRateModel {


    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The compontent rate.
	 * 
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The compontent rate.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    private BigDecimal stackRate;

    /**
     * Getter for stackRate
     *
     * The stack rate based on the aggregation method.
	 * 
     */
    public BigDecimal getStackRate() {
        return this.stackRate;
    }

    /**
     * Setter for stackRate
     *
     * The stack rate based on the aggregation method.
     */
    public void setStackRate(BigDecimal value) {
        this.stackRate = value;
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

    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * The tax type of the rate.
	 * 
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * The tax type of the rate.
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private String rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * The rate type of the rate.
	 * 
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * The rate type of the rate.
     */
    public void setRateTypeId(String value) {
        this.rateTypeId = value;
    }

    /**
     * Returns a JSON string representation of ComplianceAggregatedTaxRateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
