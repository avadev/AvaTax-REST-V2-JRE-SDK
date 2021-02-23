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
 * Frequency Available object
 */
public class FrequencyAvailableModel {


    private String frequencyCode;

    /**
     * Getter for frequencyCode
     *
     * Frequency Code
     */
    public String getFrequencyCode() {
        return this.frequencyCode;
    }

    /**
     * Setter for frequencyCode
     *
     * Frequency Code
     */
    public void setFrequencyCode(String value) {
        this.frequencyCode = value;
    }

    private String frequencyName;

    /**
     * Getter for frequencyName
     *
     * Frequency Name
     */
    public String getFrequencyName() {
        return this.frequencyName;
    }

    /**
     * Setter for frequencyName
     *
     * Frequency Name
     */
    public void setFrequencyName(String value) {
        this.frequencyName = value;
    }

    private String reason;

    /**
     * Getter for reason
     *
     * Reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason
     *
     * Reason
     */
    public void setReason(String value) {
        this.reason = value;
    }

    private ArrayList<AvailableCycleModel> availableCycles;

    /**
     * Getter for availableCycles
     *
     * Expired Calendar End Date
     */
    public ArrayList<AvailableCycleModel> getAvailableCycles() {
        return this.availableCycles;
    }

    /**
     * Setter for availableCycles
     *
     * Expired Calendar End Date
     */
    public void setAvailableCycles(ArrayList<AvailableCycleModel> value) {
        this.availableCycles = value;
    }

    /**
     * Returns a JSON string representation of FrequencyAvailableModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
