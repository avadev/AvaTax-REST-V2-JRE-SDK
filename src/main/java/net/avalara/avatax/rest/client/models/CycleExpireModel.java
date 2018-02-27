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
 * Cycle Safe Expiration results.
 */
public class CycleExpireModel {


    private Boolean success;

    /**
     * Getter for success
     *
     * Whether or not the filing calendar can be expired.
    * e.g. if user makes end date of a calendar earlier than latest filing, this would be set to false.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Setter for success
     *
     * Whether or not the filing calendar can be expired.
    * e.g. if user makes end date of a calendar earlier than latest filing, this would be set to false.
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }


    private String message;

    /**
     * Getter for message
     *
     * The message to present to the user if expiration is successful or unsuccessful.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The message to present to the user if expiration is successful or unsuccessful.
     */
    public void setMessage(String value) {
        this.message = value;
    }


    private ArrayList<CycleExpireOptionModel> cycleExpirationOptions;

    /**
     * Getter for cycleExpirationOptions
     *
     * A list of options for expiring the filing calendar.
     */
    public ArrayList<CycleExpireOptionModel> getCycleExpirationOptions() {
        return this.cycleExpirationOptions;
    }

    /**
     * Setter for cycleExpirationOptions
     *
     * A list of options for expiring the filing calendar.
     */
    public void setCycleExpirationOptions(ArrayList<CycleExpireOptionModel> value) {
        this.cycleExpirationOptions = value;
    }


    /**
     * Returns a JSON string representation of CycleExpireModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
