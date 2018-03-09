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
 * 
 */
public class FilingAnswerModel {


    private Long filingQuestionId;

    /**
     * Getter for filingQuestionId
     *
     * The ID number for a filing question
     */
    public Long getFilingQuestionId() {
        return this.filingQuestionId;
    }

    /**
     * Setter for filingQuestionId
     *
     * The ID number for a filing question
     */
    public void setFilingQuestionId(Long value) {
        this.filingQuestionId = value;
    }


    private HashMap<String, String> answer;

    /**
     * Getter for answer
     *
     * The value of the answer for the filing question identified by filingQuestionId
     */
    public HashMap<String, String> getAnswer() {
        return this.answer;
    }

    /**
     * Setter for answer
     *
     * The value of the answer for the filing question identified by filingQuestionId
     */
    public void setAnswer(HashMap<String, String> value) {
        this.answer = value;
    }


    /**
     * Returns a JSON string representation of FilingAnswerModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
