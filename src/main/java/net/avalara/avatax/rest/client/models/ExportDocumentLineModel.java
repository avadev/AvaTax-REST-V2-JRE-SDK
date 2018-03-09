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
 * An input model for executing a report detailed to the document line level
 */
public class ExportDocumentLineModel {


    private ReportFormat format;

    /**
     * Getter for format
     *
     * The output format: CSV, XML, etc. If no preference, report will be in CSV format.
     */
    public ReportFormat getFormat() {
        return this.format;
    }

    /**
     * Setter for format
     *
     * The output format: CSV, XML, etc. If no preference, report will be in CSV format.
     */
    public void setFormat(ReportFormat value) {
        this.format = value;
    }


    private Date startDate;

    /**
     * Getter for startDate
     *
     * The start date filter for report execution. If no date provided, same date of last month will be used as the startDate.
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date filter for report execution. If no date provided, same date of last month will be used as the startDate.
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date filter for report execution. If no date provided, today's date will be used as the endDate.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date filter for report execution. If no date provided, today's date will be used as the endDate.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The transactions in the country you wish to run a report:
    * use "ALL" for all countries
    * use "ALL Non-US" for all international countries
    * or use a single 2-char ISO country code
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The transactions in the country you wish to run a report:
    * use "ALL" for all countries
    * use "ALL Non-US" for all international countries
    * or use a single 2-char ISO country code
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String state;

    /**
     * Getter for state
     *
     * The state associated with the transactions you wish to run a report on: use "ALL" for all states.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * The state associated with the transactions you wish to run a report on: use "ALL" for all states.
     */
    public void setState(String value) {
        this.state = value;
    }


    private ReportDateFilter dateFilter;

    /**
     * Getter for dateFilter
     *
     * The type of date to filter your transactions
     */
    public ReportDateFilter getDateFilter() {
        return this.dateFilter;
    }

    /**
     * Setter for dateFilter
     *
     * The type of date to filter your transactions
     */
    public void setDateFilter(ReportDateFilter value) {
        this.dateFilter = value;
    }


    private ReportDocType docType;

    /**
     * Getter for docType
     *
     * The transaction type you want to run a report on
     */
    public ReportDocType getDocType() {
        return this.docType;
    }

    /**
     * Setter for docType
     *
     * The transaction type you want to run a report on
     */
    public void setDocType(ReportDocType value) {
        this.docType = value;
    }


    private String dateFormat;

    /**
     * Getter for dateFormat
     *
     * Format of dates in your rendered report. Example: "MM/dd/yyyy"
     */
    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * Setter for dateFormat
     *
     * Format of dates in your rendered report. Example: "MM/dd/yyyy"
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }


    private String culture;

    /**
     * Getter for culture
     *
     * In which culture your report is produced with. Example: "en-US"
     */
    public String getCulture() {
        return this.culture;
    }

    /**
     * Setter for culture
     *
     * In which culture your report is produced with. Example: "en-US"
     */
    public void setCulture(String value) {
        this.culture = value;
    }


    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * The currency your report is displayed in. Example: "USD"
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * The currency your report is displayed in. Example: "USD"
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }


    /**
     * Returns a JSON string representation of ExportDocumentLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
