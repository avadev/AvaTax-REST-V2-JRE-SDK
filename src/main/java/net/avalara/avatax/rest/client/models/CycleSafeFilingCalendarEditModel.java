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
 * Filing Calendar Edit
 */
public class CycleSafeFilingCalendarEditModel {


    private String fieldName;

    /**
     * Getter for fieldName
     *
     * Field To Edit
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Setter for fieldName
     *
     * Field To Edit
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    private String destination;

    /**
     * Getter for destination
     *
     * Destination is used to identify filing questions' type Other or Settings.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Setter for destination
     *
     * Destination is used to identify filing questions' type Other or Settings.
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    private Long questionId;

    /**
     * Getter for questionId
     *
     * Question
     */
    public Long getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId
     *
     * Question
     */
    public void setQuestionId(Long value) {
        this.questionId = value;
    }

    private String questionCode;

    /**
     * Getter for questionCode
     *
     * The filing question code.
     */
    public String getQuestionCode() {
        return this.questionCode;
    }

    /**
     * Setter for questionCode
     *
     * The filing question code.
     */
    public void setQuestionCode(String value) {
        this.questionCode = value;
    }

    private HashMap<String, String> oldValue;

    /**
     * Getter for oldValue
     *
     * Old Value
     */
    public HashMap<String, String> getOldValue() {
        return this.oldValue;
    }

    /**
     * Setter for oldValue
     *
     * Old Value
     */
    public void setOldValue(HashMap<String, String> value) {
        this.oldValue = value;
    }

    private HashMap<String, String> newValue;

    /**
     * Getter for newValue
     *
     * New Value
     */
    public HashMap<String, String> getNewValue() {
        return this.newValue;
    }

    /**
     * Setter for newValue
     *
     * New Value
     */
    public void setNewValue(HashMap<String, String> value) {
        this.newValue = value;
    }

    /**
     * Returns a JSON string representation of CycleSafeFilingCalendarEditModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
