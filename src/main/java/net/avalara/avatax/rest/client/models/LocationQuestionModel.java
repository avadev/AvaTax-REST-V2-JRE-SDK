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
 * Information about questions that the local jurisdictions require for each location
 */
public class LocationQuestionModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this location setting type
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this location setting type
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String question;

    /**
     * Getter for question
     *
     * This is the prompt for this question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Setter for question
     *
     * This is the prompt for this question
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * If additional information is available about the location setting, this contains descriptive text to help
    * you identify the correct value to provide in this setting.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * If additional information is available about the location setting, this contains descriptive text to help
    * you identify the correct value to provide in this setting.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String regularExpression;

    /**
     * Getter for regularExpression
     *
     * If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public String getRegularExpression() {
        return this.regularExpression;
    }

    /**
     * Setter for regularExpression
     *
     * If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
    }

    private String exampleValue;

    /**
     * Getter for exampleValue
     *
     * If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public String getExampleValue() {
        return this.exampleValue;
    }

    /**
     * Setter for exampleValue
     *
     * If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public void setExampleValue(String value) {
        this.exampleValue = value;
    }

    private String jurisdictionName;

    /**
     * Getter for jurisdictionName
     *
     * Indicates which jurisdiction requires this question
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName
     *
     * Indicates which jurisdiction requires this question
     */
    public void setJurisdictionName(String value) {
        this.jurisdictionName = value;
    }

    private JurisdictionType jurisdictionType;

    /**
     * Getter for jurisdictionType
     *
     * Indicates which type of jurisdiction requires this question
     */
    public JurisdictionType getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType
     *
     * Indicates which type of jurisdiction requires this question
     */
    public void setJurisdictionType(JurisdictionType value) {
        this.jurisdictionType = value;
    }

    private String jurisdictionCountry;

    /**
     * Getter for jurisdictionCountry
     *
     * Indicates the country that this jurisdiction belongs to
     */
    public String getJurisdictionCountry() {
        return this.jurisdictionCountry;
    }

    /**
     * Setter for jurisdictionCountry
     *
     * Indicates the country that this jurisdiction belongs to
     */
    public void setJurisdictionCountry(String value) {
        this.jurisdictionCountry = value;
    }

    private String jurisdictionRegion;

    /**
     * Getter for jurisdictionRegion
     *
     * Indicates the state, region, or province that this jurisdiction belongs to
     */
    public String getJurisdictionRegion() {
        return this.jurisdictionRegion;
    }

    /**
     * Setter for jurisdictionRegion
     *
     * Indicates the state, region, or province that this jurisdiction belongs to
     */
    public void setJurisdictionRegion(String value) {
        this.jurisdictionRegion = value;
    }

    private String helpText;

    /**
     * Getter for helpText
     *
     * Help and guidance for this specific question
     */
    public String getHelpText() {
        return this.helpText;
    }

    /**
     * Setter for helpText
     *
     * Help and guidance for this specific question
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    private Integer maxLength;

    /**
     * Getter for maxLength
     *
     * Maximum length of the answer string
     */
    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * Setter for maxLength
     *
     * Maximum length of the answer string
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    private Boolean required;

    /**
     * Getter for required
     *
     * True if this question must be answered for this filing calendar
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * Setter for required
     *
     * True if this question must be answered for this filing calendar
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    private String dataType;

    /**
     * Getter for dataType
     *
     * Data type of the answer
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType
     *
     * Data type of the answer
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    private String staticOptions;

    /**
     * Getter for staticOptions
     *
     * 
     */
    public String getStaticOptions() {
        return this.staticOptions;
    }

    /**
     * Setter for staticOptions
     *
     * 
     */
    public void setStaticOptions(String value) {
        this.staticOptions = value;
    }

    private Boolean unique;

    /**
     * Getter for unique
     *
     * 
     */
    public Boolean getUnique() {
        return this.unique;
    }

    /**
     * Setter for unique
     *
     * 
     */
    public void setUnique(Boolean value) {
        this.unique = value;
    }

    /**
     * Returns a JSON string representation of LocationQuestionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
