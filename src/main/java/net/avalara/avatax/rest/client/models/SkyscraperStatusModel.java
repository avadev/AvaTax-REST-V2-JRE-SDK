package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a list of statuses of returns available in skyscraper
 */
public class SkyscraperStatusModel {
    private String name;

    /**
     * Getter for name - Represents a list of statuses of returns available in skyscraper
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents a list of statuses of returns available in skyscraper
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String country;

    /**
     * Getter for country - Represents a list of statuses of returns available in skyscraper
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Represents a list of statuses of returns available in skyscraper
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String expectedResponseTime;

    /**
     * Getter for expectedResponseTime - Represents a list of statuses of returns available in skyscraper
     */
    public String getExpectedResponseTime() {
        return this.expectedResponseTime;
    }

    /**
     * Setter for expectedResponseTime - Represents a list of statuses of returns available in skyscraper
     */
    public void setExpectedResponseTime(String expectedResponseTime) {
        this.expectedResponseTime = expectedResponseTime;
    }

    
    private ScraperType scraperType;

    /**
     * Getter for scraperType - Represents a list of statuses of returns available in skyscraper
     */
    public ScraperType getScraperType() {
        return this.scraperType;
    }

    /**
     * Setter for scraperType - Represents a list of statuses of returns available in skyscraper
     */
    public void setScraperType(ScraperType scraperType) {
        this.scraperType = scraperType;
    }

    
    private String message;

    /**
     * Getter for message - Represents a list of statuses of returns available in skyscraper
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - Represents a list of statuses of returns available in skyscraper
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private Boolean isAvailable;

    /**
     * Getter for isAvailable - Represents a list of statuses of returns available in skyscraper
     */
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    /**
     * Setter for isAvailable - Represents a list of statuses of returns available in skyscraper
     */
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    
    private ArrayList<String> taxFormCodes;

    /**
     * Getter for taxFormCodes - Represents a list of statuses of returns available in skyscraper
     */
    public ArrayList<String> getTaxFormCodes() {
        return this.taxFormCodes;
    }

    /**
     * Setter for taxFormCodes - Represents a list of statuses of returns available in skyscraper
     */
    public void setTaxFormCodes(ArrayList<String> taxFormCodes) {
        this.taxFormCodes = taxFormCodes;
    }

    
    private ArrayList<requiredFilingCalendarDataFieldModel> requiredFilingCalendarDataFields;

    /**
     * Getter for requiredFilingCalendarDataFields - Represents a list of statuses of returns available in skyscraper
     */
    public ArrayList<requiredFilingCalendarDataFieldModel> getRequiredFilingCalendarDataFields() {
        return this.requiredFilingCalendarDataFields;
    }

    /**
     * Setter for requiredFilingCalendarDataFields - Represents a list of statuses of returns available in skyscraper
     */
    public void setRequiredFilingCalendarDataFields(ArrayList<requiredFilingCalendarDataFieldModel> requiredFilingCalendarDataFields) {
        this.requiredFilingCalendarDataFields = requiredFilingCalendarDataFields;
    }

    


    /**
     * Returns a JSON string representation of SkyscraperStatusModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    