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
     * Getter for fieldName - An edit to be made on a filing calendar.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Setter for fieldName - An edit to be made on a filing calendar.
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    
    private Integer questionId;

    /**
     * Getter for questionId - An edit to be made on a filing calendar.
     */
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId - An edit to be made on a filing calendar.
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    
    private HashMap<String, String> oldValue;

    /**
     * Getter for oldValue - An edit to be made on a filing calendar.
     */
    public HashMap<String, String> getOldValue() {
        return this.oldValue;
    }

    /**
     * Setter for oldValue - An edit to be made on a filing calendar.
     */
    public void setOldValue(HashMap<String, String> oldValue) {
        this.oldValue = oldValue;
    }

    
    private HashMap<String, String> newValue;

    /**
     * Getter for newValue - An edit to be made on a filing calendar.
     */
    public HashMap<String, String> getNewValue() {
        return this.newValue;
    }

    /**
     * Setter for newValue - An edit to be made on a filing calendar.
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
    