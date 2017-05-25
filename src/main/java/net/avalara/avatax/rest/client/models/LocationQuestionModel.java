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
 * Information about questions that the local jurisdictions require for each location
 */
public class LocationQuestionModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this location setting type
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this location setting type
     */
    public void setId(int value) {
        this.id = value;
    }


    private string question;

    /**
     * Getter for question
     *
     * This is the prompt for this question
     */
    public string getQuestion() {
        return this.question;
    }

    /**
     * Setter for question
     *
     * This is the prompt for this question
     */
    public void setQuestion(string value) {
        this.question = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * If additional information is available about the location setting, this contains descriptive text to help
    * you identify the correct value to provide in this setting.
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * If additional information is available about the location setting, this contains descriptive text to help
    * you identify the correct value to provide in this setting.
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string regularExpression;

    /**
     * Getter for regularExpression
     *
     * If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public string getRegularExpression() {
        return this.regularExpression;
    }

    /**
     * Setter for regularExpression
     *
     * If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public void setRegularExpression(string value) {
        this.regularExpression = value;
    }


    private string exampleValue;

    /**
     * Getter for exampleValue
     *
     * If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public string getExampleValue() {
        return this.exampleValue;
    }

    /**
     * Setter for exampleValue
     *
     * If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public void setExampleValue(string value) {
        this.exampleValue = value;
    }


    private string jurisdictionName;

    /**
     * Getter for jurisdictionName
     *
     * Indicates which jurisdiction requires this question
     */
    public string getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName
     *
     * Indicates which jurisdiction requires this question
     */
    public void setJurisdictionName(string value) {
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


    private string jurisdictionCountry;

    /**
     * Getter for jurisdictionCountry
     *
     * Indicates the country that this jurisdiction belongs to
     */
    public string getJurisdictionCountry() {
        return this.jurisdictionCountry;
    }

    /**
     * Setter for jurisdictionCountry
     *
     * Indicates the country that this jurisdiction belongs to
     */
    public void setJurisdictionCountry(string value) {
        this.jurisdictionCountry = value;
    }


    private string jurisdictionRegion;

    /**
     * Getter for jurisdictionRegion
     *
     * Indicates the state, region, or province that this jurisdiction belongs to
     */
    public string getJurisdictionRegion() {
        return this.jurisdictionRegion;
    }

    /**
     * Setter for jurisdictionRegion
     *
     * Indicates the state, region, or province that this jurisdiction belongs to
     */
    public void setJurisdictionRegion(string value) {
        this.jurisdictionRegion = value;
    }


    /**
     * Returns a JSON string representation of LocationQuestionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
