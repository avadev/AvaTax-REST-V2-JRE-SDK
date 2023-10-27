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
 * AP Config Setting Response Model
 */
public class APConfigSettingSuccessResponseModel {


    private Long ruleId;

    /**
     * Getter for ruleId
     *
     * The Rule Id
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * Setter for ruleId
     *
     * The Rule Id
     */
    public void setRuleId(Long value) {
        this.ruleId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId to which the rule belongs
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId to which the rule belongs
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private TaxProfileMetaDataModel meta;

    /**
     * Getter for meta
     *
     * 
     */
    public TaxProfileMetaDataModel getMeta() {
        return this.meta;
    }

    /**
     * Setter for meta
     *
     * 
     */
    public void setMeta(TaxProfileMetaDataModel value) {
        this.meta = value;
    }

    private Long amount;

    /**
     * Getter for amount
     *
     * The Amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * The Amount
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    private Long varianceForIgnore;

    /**
     * Getter for varianceForIgnore
     *
     * The Variance For Ignore
     */
    public Long getVarianceForIgnore() {
        return this.varianceForIgnore;
    }

    /**
     * Setter for varianceForIgnore
     *
     * The Variance For Ignore
     */
    public void setVarianceForIgnore(Long value) {
        this.varianceForIgnore = value;
    }

    private Long varianceForAccrue;

    /**
     * Getter for varianceForAccrue
     *
     * The Variance For Accrue
     */
    public Long getVarianceForAccrue() {
        return this.varianceForAccrue;
    }

    /**
     * Setter for varianceForAccrue
     *
     * The Variance For Accrue
     */
    public void setVarianceForAccrue(Long value) {
        this.varianceForAccrue = value;
    }

    private Long variancePercent;

    /**
     * Getter for variancePercent
     *
     * The Variance Percent
     */
    public Long getVariancePercent() {
        return this.variancePercent;
    }

    /**
     * Setter for variancePercent
     *
     * The Variance Percent
     */
    public void setVariancePercent(Long value) {
        this.variancePercent = value;
    }

    /**
     * Returns a JSON string representation of APConfigSettingSuccessResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
