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
 * Model for RateOption.
 */
public class ComplianceRateOptionModel {


    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The name of the Jurisdiction
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The name of the Jurisdiction
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private String groupCode;

    /**
     * Getter for groupCode
     *
     * The Group Code
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * Setter for groupCode
     *
     * The Group Code
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The id of the tax region.
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

    private String taxRegionName;

    /**
     * Getter for taxRegionName
     *
     * The name of the tax region.
     */
    public String getTaxRegionName() {
        return this.taxRegionName;
    }

    /**
     * Setter for taxRegionName
     *
     * The name of the tax region.
     */
    public void setTaxRegionName(String value) {
        this.taxRegionName = value;
    }

    private String reportLevel;

    /**
     * Getter for reportLevel
     *
     * The report level.
     */
    public String getReportLevel() {
        return this.reportLevel;
    }

    /**
     * Setter for reportLevel
     *
     * The report level.
     */
    public void setReportLevel(String value) {
        this.reportLevel = value;
    }

    private String taxTypeCode;

    /**
     * Getter for taxTypeCode
     *
     * The Tax Type Code.
     */
    public String getTaxTypeCode() {
        return this.taxTypeCode;
    }

    /**
     * Setter for taxTypeCode
     *
     * The Tax Type Code.
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    private String taxTypeCodeName;

    /**
     * Getter for taxTypeCodeName
     *
     * The name of the Tax Type Code.
     */
    public String getTaxTypeCodeName() {
        return this.taxTypeCodeName;
    }

    /**
     * Setter for taxTypeCodeName
     *
     * The name of the Tax Type Code.
     */
    public void setTaxTypeCodeName(String value) {
        this.taxTypeCodeName = value;
    }

    private String taxSubTypeCode;

    /**
     * Getter for taxSubTypeCode
     *
     * The Sub Type Code.
     */
    public String getTaxSubTypeCode() {
        return this.taxSubTypeCode;
    }

    /**
     * Setter for taxSubTypeCode
     *
     * The Sub Type Code.
     */
    public void setTaxSubTypeCode(String value) {
        this.taxSubTypeCode = value;
    }

    private String taxSubTypeCodeName;

    /**
     * Getter for taxSubTypeCodeName
     *
     * The name of Sub Type.
     */
    public String getTaxSubTypeCodeName() {
        return this.taxSubTypeCodeName;
    }

    /**
     * Setter for taxSubTypeCodeName
     *
     * The name of Sub Type.
     */
    public void setTaxSubTypeCodeName(String value) {
        this.taxSubTypeCodeName = value;
    }

    private String rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * The rate type of the rate.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * The rate type of the rate.
     */
    public void setRateTypeCode(String value) {
        this.rateTypeCode = value;
    }

    private String rateTypeCodeName;

    /**
     * Getter for rateTypeCodeName
     *
     * The rate type description.
     */
    public String getRateTypeCodeName() {
        return this.rateTypeCodeName;
    }

    /**
     * Setter for rateTypeCodeName
     *
     * The rate type description.
     */
    public void setRateTypeCodeName(String value) {
        this.rateTypeCodeName = value;
    }

    private BigDecimal stackRate;

    /**
     * Getter for stackRate
     *
     * The Stack Rate
     */
    public BigDecimal getStackRate() {
        return this.stackRate;
    }

    /**
     * Setter for stackRate
     *
     * The Stack Rate
     */
    public void setStackRate(BigDecimal value) {
        this.stackRate = value;
    }

    private BigDecimal componentRate;

    /**
     * Getter for componentRate
     *
     * The Component Rate
     */
    public BigDecimal getComponentRate() {
        return this.componentRate;
    }

    /**
     * Setter for componentRate
     *
     * The Component Rate
     */
    public void setComponentRate(BigDecimal value) {
        this.componentRate = value;
    }

    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The id of the tax authority.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The id of the tax authority.
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }

    private String cityName;

    /**
     * Getter for cityName
     *
     * City
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * Setter for cityName
     *
     * City
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    private String countyName;

    /**
     * Getter for countyName
     *
     * County
     */
    public String getCountyName() {
        return this.countyName;
    }

    /**
     * Setter for countyName
     *
     * County
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * Effective Date
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * Effective Date
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * End date
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * End date
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of ComplianceRateOptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
