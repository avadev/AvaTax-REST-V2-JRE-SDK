package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * An edit to be made on a filing calendar.
 */
public class FilingCalendarEditModel {
    private String fieldName;

    /**
     * Getter for fieldName - The name of the field to be modified.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Setter for fieldName - The name of the field to be modified.
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    
    private Integer questionId;

    /**
     * Getter for questionId - The unique ID of the filing calendar question. "Filing calendar question" is the wording displayed to users for a given field.
     */
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId - The unique ID of the filing calendar question. "Filing calendar question" is the wording displayed to users for a given field.
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    
    private HashMap<String, String> oldValue;

    /**
     * Getter for oldValue - The current value of the field.
     */
    public HashMap<String, String> getOldValue() {
        return this.oldValue;
    }

    /**
     * Setter for oldValue - The current value of the field.
     */
    public void setOldValue(HashMap<String, String> oldValue) {
        this.oldValue = oldValue;
    }

    
    private HashMap<String, String> newValue;

    /**
     * Getter for newValue - The new/proposed value of the field.
     */
    public HashMap<String, String> getNewValue() {
        return this.newValue;
    }

    /**
     * Setter for newValue - The new/proposed value of the field.
     */
    public void setNewValue(HashMap<String, String> newValue) {
        this.newValue = newValue;
    }

    


    /**
     * Returns a JSON string representation of FilingCalendarEditModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    