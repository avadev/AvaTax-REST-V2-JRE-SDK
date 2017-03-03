package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 */
public class FilingAnswerModel {
    private Long filingQuestionId;

    /**
     * Getter for filingQuestionId - 
     */
    public Long getFilingQuestionId() {
        return this.filingQuestionId;
    }

    /**
     * Setter for filingQuestionId - 
     */
    public void setFilingQuestionId(Long filingQuestionId) {
        this.filingQuestionId = filingQuestionId;
    }

    
    private HashMap<String, String> answer;

    /**
     * Getter for answer - 
     */
    public HashMap<String, String> getAnswer() {
        return this.answer;
    }

    /**
     * Setter for answer - 
     */
    public void setAnswer(HashMap<String, String> answer) {
        this.answer = answer;
    }

    


    /**
     * Returns a JSON string representation of FilingAnswerModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    