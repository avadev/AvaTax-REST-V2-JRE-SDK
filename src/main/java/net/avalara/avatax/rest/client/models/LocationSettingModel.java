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
 * Represents the answer to one local jurisdiction question for a location.
 */
public class LocationSettingModel {


    private Integer questionId;

    /**
     * Getter for questionId
     *
     * The unique ID number of the location question answered.
     */
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for questionId
     *
     * The unique ID number of the location question answered.
     */
    public void setQuestionId(Integer value) {
        this.questionId = value;
    }


    private String value;

    /**
     * Getter for value
     *
     * The answer the user provided.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The answer the user provided.
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Returns a JSON string representation of LocationSettingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
