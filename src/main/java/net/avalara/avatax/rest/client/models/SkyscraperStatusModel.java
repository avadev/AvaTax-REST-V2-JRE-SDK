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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a list of statuses of returns available in skyscraper
 */
public class SkyscraperStatusModel {


    private String name;

    /**
     * Getter for name;
     * The specific name of the returns available in skyscraper
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The specific name of the returns available in skyscraper
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private List<String> taxFormCodes;

    /**
     * Getter for taxFormCodes;
     * The tax form codes available to file through skyscrper
     */
    public List<String> gettaxFormCodes() {;
        return this.taxFormCodes;;
    }

    /**
     * Setter for taxFormCodes;
     * The tax form codes available to file through skyscrper
     */
    public void settaxFormCodes(List<String> value) {;
        this.taxFormCodes = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The country of the returns
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The country of the returns
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private ScraperType? scraperType;

    /**
     * Getter for scraperType;
     * They Scraper type
     */
    public ScraperType? getscraperType() {;
        return this.scraperType;;
    }

    /**
     * Setter for scraperType;
     * They Scraper type
     */
    public void setscraperType(ScraperType? value) {;
        this.scraperType = value;;
    }


    private Boolean? isAvailable;

    /**
     * Getter for isAvailable;
     * Indicates if the return is currently available
     */
    public Boolean? getisAvailable() {;
        return this.isAvailable;;
    }

    /**
     * Setter for isAvailable;
     * Indicates if the return is currently available
     */
    public void setisAvailable(Boolean? value) {;
        this.isAvailable = value;;
    }


    private String expectedResponseTime;

    /**
     * Getter for expectedResponseTime;
     * The expected response time of the call
     */
    public String getexpectedResponseTime() {;
        return this.expectedResponseTime;;
    }

    /**
     * Setter for expectedResponseTime;
     * The expected response time of the call
     */
    public void setexpectedResponseTime(String value) {;
        this.expectedResponseTime = value;;
    }


    private String message;

    /**
     * Getter for message;
     * Message on the returns
     */
    public String getmessage() {;
        return this.message;;
    }

    /**
     * Setter for message;
     * Message on the returns
     */
    public void setmessage(String value) {;
        this.message = value;;
    }


    private List<requiredFilingCalendarDataFieldModel> requiredFilingCalendarDataFields;

    /**
     * Getter for requiredFilingCalendarDataFields;
     * A list of required fields to file
     */
    public List<requiredFilingCalendarDataFieldModel> getrequiredFilingCalendarDataFields() {;
        return this.requiredFilingCalendarDataFields;;
    }

    /**
     * Setter for requiredFilingCalendarDataFields;
     * A list of required fields to file
     */
    public void setrequiredFilingCalendarDataFields(List<requiredFilingCalendarDataFieldModel> value) {;
        this.requiredFilingCalendarDataFields = value;;
    }


    /**
     * Returns a JSON string representation of SkyscraperStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
