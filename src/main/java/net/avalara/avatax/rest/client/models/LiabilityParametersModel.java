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
 * The model for liability parameters definitions
 */
public class LiabilityParametersModel {


    private ReturnsLiabilityType liabilityType;

    /**
     * Getter for liabilityType
     *
     * The type of Returns liability report to be generated
     */
    public ReturnsLiabilityType getLiabilityType() {
        return this.liabilityType;
    }

    /**
     * Setter for liabilityType
     *
     * The type of Returns liability report to be generated
     */
    public void setLiabilityType(ReturnsLiabilityType value) {
        this.liabilityType = value;
    }

    private ReturnsReportType returnsReportType;

    /**
     * Getter for returnsReportType
     *
     * The type of Returns report to be generated
     */
    public ReturnsReportType getReturnsReportType() {
        return this.returnsReportType;
    }

    /**
     * Setter for returnsReportType
     *
     * The type of Returns report to be generated
     */
    public void setReturnsReportType(ReturnsReportType value) {
        this.returnsReportType = value;
    }

    private Integer hospitalityAccountId;

    /**
     * Getter for hospitalityAccountId
     *
     * The Hospitality Account ID with Subscription Type as AvaLoding
     */
    public Integer getHospitalityAccountId() {
        return this.hospitalityAccountId;
    }

    /**
     * Setter for hospitalityAccountId
     *
     * The Hospitality Account ID with Subscription Type as AvaLoding
     */
    public void setHospitalityAccountId(Integer value) {
        this.hospitalityAccountId = value;
    }

    private Integer year;

    /**
     * Getter for year
     *
     * Filter report based on the year
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Setter for year
     *
     * Filter report based on the year
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    private Integer month;

    /**
     * Getter for month
     *
     * Filter report based on the month
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Setter for month
     *
     * Filter report based on the month
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Filter report based on the country code
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Filter report based on the country code
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * Filter report based on the region code or state code
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Filter report based on the region code or state code
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Returns a JSON string representation of LiabilityParametersModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
