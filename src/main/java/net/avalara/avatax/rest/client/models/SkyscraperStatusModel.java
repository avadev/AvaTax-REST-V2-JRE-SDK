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
 * Represents a list of statuses of returns available in skyscraper
 */
public class SkyscraperStatusModel {


    private String name;

    /**
     * Getter for name
     *
     * The specific name of the returns available in skyscraper
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The specific name of the returns available in skyscraper
     */
    public void setName(String value) {
        this.name = value;
    }


    private ArrayList<String> taxFormCodes;

    /**
     * Getter for taxFormCodes
     *
     * The tax form codes available to file through skyscrper
     */
    public ArrayList<String> getTaxFormCodes() {
        return this.taxFormCodes;
    }

    /**
     * Setter for taxFormCodes
     *
     * The tax form codes available to file through skyscrper
     */
    public void setTaxFormCodes(ArrayList<String> value) {
        this.taxFormCodes = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The country of the returns
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country of the returns
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private ScraperType scraperType;

    /**
     * Getter for scraperType
     *
     * They Scraper type
     */
    public ScraperType getScraperType() {
        return this.scraperType;
    }

    /**
     * Setter for scraperType
     *
     * They Scraper type
     */
    public void setScraperType(ScraperType value) {
        this.scraperType = value;
    }


    private Boolean isAvailable;

    /**
     * Getter for isAvailable
     *
     * Indicates if the return is currently available
     */
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    /**
     * Setter for isAvailable
     *
     * Indicates if the return is currently available
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }


    private String expectedResponseTime;

    /**
     * Getter for expectedResponseTime
     *
     * The expected response time of the call
     */
    public String getExpectedResponseTime() {
        return this.expectedResponseTime;
    }

    /**
     * Setter for expectedResponseTime
     *
     * The expected response time of the call
     */
    public void setExpectedResponseTime(String value) {
        this.expectedResponseTime = value;
    }


    private String message;

    /**
     * Getter for message
     *
     * Message on the returns
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * Message on the returns
     */
    public void setMessage(String value) {
        this.message = value;
    }


    private ArrayList<requiredFilingCalendarDataFieldModel> requiredFilingCalendarDataFields;

    /**
     * Getter for requiredFilingCalendarDataFields
     *
     * A list of required fields to file
     */
    public ArrayList<requiredFilingCalendarDataFieldModel> getRequiredFilingCalendarDataFields() {
        return this.requiredFilingCalendarDataFields;
    }

    /**
     * Setter for requiredFilingCalendarDataFields
     *
     * A list of required fields to file
     */
    public void setRequiredFilingCalendarDataFields(ArrayList<requiredFilingCalendarDataFieldModel> value) {
        this.requiredFilingCalendarDataFields = value;
    }


    /**
     * Returns a JSON string representation of SkyscraperStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
