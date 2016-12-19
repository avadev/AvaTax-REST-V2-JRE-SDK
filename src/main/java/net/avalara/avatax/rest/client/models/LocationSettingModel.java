package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents the answer to one local jurisdiction question for a location.
 */
public class LocationSettingModel {
    private Integer questionId;

    /**
     * Getter for questionId - The unique ID number of the location question answered.
     */
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId - The unique ID number of the location question answered.
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    
    private String value;

    /**
     * Getter for value - The answer the user provided.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value - The answer the user provided.
     */
    public void setValue(String value) {
        this.value = value;
    }

    


    /**
     * Returns a JSON string representation of LocationSettingModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    