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
     * Getter for question - This is the prompt for this question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Setter for question - This is the prompt for this question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    
    private String description;

    /**
     * Getter for description - If additional information is available about the location setting, this contains descriptive text to help
            you identify the correct value to provide in this setting.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - If additional information is available about the location setting, this contains descriptive text to help
            you identify the correct value to provide in this setting.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private String regularExpression;

    /**
     * Getter for regularExpression - If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public String getRegularExpression() {
        return this.regularExpression;
    }

    /**
     * Setter for regularExpression - If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public void setRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
    }

    
    private String jurisdictionCountry;

    /**
     * Getter for jurisdictionCountry - Indicates the country that this jurisdiction belongs to
     */
    public String getJurisdictionCountry() {
        return this.jurisdictionCountry;
    }

    /**
     * Setter for jurisdictionCountry - Indicates the country that this jurisdiction belongs to
     */
    public void setJurisdictionCountry(String jurisdictionCountry) {
        this.jurisdictionCountry = jurisdictionCountry;
    }

    
    private String jurisdictionRegion;

    /**
     * Getter for jurisdictionRegion - Indicates the state, region, or province that this jurisdiction belongs to
     */
    public String getJurisdictionRegion() {
        return this.jurisdictionRegion;
    }

    /**
     * Setter for jurisdictionRegion - Indicates the state, region, or province that this jurisdiction belongs to
     */
    public void setJurisdictionRegion(String jurisdictionRegion) {
        this.jurisdictionRegion = jurisdictionRegion;
    }

    
    private String exampleValue;

    /**
     * Getter for exampleValue - If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public String getExampleValue() {
        return this.exampleValue;
    }

    /**
     * Setter for exampleValue - If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public void setExampleValue(String exampleValue) {
        this.exampleValue = exampleValue;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this location setting type
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this location setting type
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private JurisdictionType jurisdictionType;

    /**
     * Getter for jurisdictionType - Indicates which type of jurisdiction requires this question
     */
    public JurisdictionType getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType - Indicates which type of jurisdiction requires this question
     */
    public void setJurisdictionType(JurisdictionType jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    
    private String jurisdictionName;

    /**
     * Getter for jurisdictionName - Indicates which jurisdiction requires this question
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName - Indicates which jurisdiction requires this question
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
    