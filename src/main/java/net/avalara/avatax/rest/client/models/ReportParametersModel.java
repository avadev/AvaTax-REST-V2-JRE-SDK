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
 * The output model for report parameter definitions
 */
public class ReportParametersModel {


    private Date startDate;

    /**
     * Getter for startDate
     *
     * The start date filter used for your report
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date filter used for your report
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date filter used for your report
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date filter used for your report
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The country filter used for your report
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country filter used for your report
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String state;

    /**
     * Getter for state
     *
     * The state filter used for your report
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * The state filter used for your report
     */
    public void setState(String value) {
        this.state = value;
    }


    private String dateFilter;

    /**
     * Getter for dateFilter
     *
     * The date type filter used for your report
     */
    public String getDateFilter() {
        return this.dateFilter;
    }

    /**
     * Setter for dateFilter
     *
     * The date type filter used for your report
     */
    public void setDateFilter(String value) {
        this.dateFilter = value;
    }


    private String docType;

    /**
     * Getter for docType
     *
     * The doc type filter used for your report
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Setter for docType
     *
     * The doc type filter used for your report
     */
    public void setDocType(String value) {
        this.docType = value;
    }


    private String dateFormat;

    /**
     * Getter for dateFormat
     *
     * The date format used for your report
     */
    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * Setter for dateFormat
     *
     * The date format used for your report
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }


    private String culture;

    /**
     * Getter for culture
     *
     * The culture used your report
     */
    public String getCulture() {
        return this.culture;
    }

    /**
     * Setter for culture
     *
     * The culture used your report
     */
    public void setCulture(String value) {
        this.culture = value;
    }


    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The currency code used for your report
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The currency code used for your report
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }


    /**
     * Returns a JSON string representation of ReportParametersModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
