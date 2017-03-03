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
     * Getter for questionId - Represents the answer to one local jurisdiction question for a location.
     */
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId - Represents the answer to one local jurisdiction question for a location.
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    
    private String value;

    /**
     * Getter for value - Represents the answer to one local jurisdiction question for a location.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value - Represents the answer to one local jurisdiction question for a location.
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
    