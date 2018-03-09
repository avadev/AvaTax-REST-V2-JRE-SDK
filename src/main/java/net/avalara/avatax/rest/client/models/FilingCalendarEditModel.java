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
 * An edit to be made on a filing calendar.
 */
public class FilingCalendarEditModel {


    private String fieldName;

    /**
     * Getter for fieldName
     *
     * The name of the field to be modified.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Setter for fieldName
     *
     * The name of the field to be modified.
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }


    private Integer questionId;

    /**
     * Getter for questionId
     *
     * The unique ID of the filing calendar question. "Filing calendar question" is the wording displayed to users for a given field.
     */
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId
     *
     * The unique ID of the filing calendar question. "Filing calendar question" is the wording displayed to users for a given field.
     */
    public void setQuestionId(Integer value) {
        this.questionId = value;
    }


    private HashMap<String, String> oldValue;

    /**
     * Getter for oldValue
     *
     * The current value of the field.
     */
    public HashMap<String, String> getOldValue() {
        return this.oldValue;
    }

    /**
     * Setter for oldValue
     *
     * The current value of the field.
     */
    public void setOldValue(HashMap<String, String> value) {
        this.oldValue = value;
    }


    private HashMap<String, String> newValue;

    /**
     * Getter for newValue
     *
     * The new/proposed value of the field.
     */
    public HashMap<String, String> getNewValue() {
        return this.newValue;
    }

    /**
     * Setter for newValue
     *
     * The new/proposed value of the field.
     */
    public void setNewValue(HashMap<String, String> value) {
        this.newValue = value;
    }


    /**
     * Returns a JSON string representation of FilingCalendarEditModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
