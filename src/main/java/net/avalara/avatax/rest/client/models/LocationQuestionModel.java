package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Information about questions that the local jurisdictions require for each location
 */
public class LocationQuestionModel {
    private String question;

    /**
     * Getter for question - Information about questions that the local jurisdictions require for each location
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Setter for question - Information about questions that the local jurisdictions require for each location
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    
    private String description;

    /**
     * Getter for description - Information about questions that the local jurisdictions require for each location
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Information about questions that the local jurisdictions require for each location
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String regularExpression;

    /**
     * Getter for regularExpression - Information about questions that the local jurisdictions require for each location
     */
    public String getRegularExpression() {
        return this.regularExpression;
    }

    /**
     * Setter for regularExpression - Information about questions that the local jurisdictions require for each location
     */
    public void setRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
    }

    
    private String jurisdictionCountry;

    /**
     * Getter for jurisdictionCountry - Information about questions that the local jurisdictions require for each location
     */
    public String getJurisdictionCountry() {
        return this.jurisdictionCountry;
    }

    /**
     * Setter for jurisdictionCountry - Information about questions that the local jurisdictions require for each location
     */
    public void setJurisdictionCountry(String jurisdictionCountry) {
        this.jurisdictionCountry = jurisdictionCountry;
    }

    
    private String jurisdictionRegion;

    /**
     * Getter for jurisdictionRegion - Information about questions that the local jurisdictions require for each location
     */
    public String getJurisdictionRegion() {
        return this.jurisdictionRegion;
    }

    /**
     * Setter for jurisdictionRegion - Information about questions that the local jurisdictions require for each location
     */
    public void setJurisdictionRegion(String jurisdictionRegion) {
        this.jurisdictionRegion = jurisdictionRegion;
    }

    
    private String exampleValue;

    /**
     * Getter for exampleValue - Information about questions that the local jurisdictions require for each location
     */
    public String getExampleValue() {
        return this.exampleValue;
    }

    /**
     * Setter for exampleValue - Information about questions that the local jurisdictions require for each location
     */
    public void setExampleValue(String exampleValue) {
        this.exampleValue = exampleValue;
    }

    
    private Integer id;

    /**
     * Getter for id - Information about questions that the local jurisdictions require for each location
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Information about questions that the local jurisdictions require for each location
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private JurisdictionType jurisdictionType;

    /**
     * Getter for jurisdictionType - Information about questions that the local jurisdictions require for each location
     */
    public JurisdictionType getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType - Information about questions that the local jurisdictions require for each location
     */
    public void setJurisdictionType(JurisdictionType jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    
    private String jurisdictionName;

    /**
     * Getter for jurisdictionName - Information about questions that the local jurisdictions require for each location
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName - Information about questions that the local jurisdictions require for each location
     */
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    


    /**
     * Returns a JSON string representation of LocationQuestionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    