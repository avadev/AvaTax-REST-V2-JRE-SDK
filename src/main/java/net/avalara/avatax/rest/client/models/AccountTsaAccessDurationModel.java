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
 * Swagger name: AvaTaxClient
 */

/**
 * Specifies a duration for which to grant TSA accounts write access.
* See AVT-25316
 */
public class AccountTsaAccessDurationModel {


    private Integer minutes;

    /**
     * Getter for minutes
     *
     * Number of minutes
     */
    public Integer getMinutes() {
        return this.minutes;
    }

    /**
     * Setter for minutes
     *
     * Number of minutes
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    private Integer hours;

    /**
     * Getter for hours
     *
     * Number of hours
     */
    public Integer getHours() {
        return this.hours;
    }

    /**
     * Setter for hours
     *
     * Number of hours
     */
    public void setHours(Integer value) {
        this.hours = value;
    }

    private Integer days;

    /**
     * Getter for days
     *
     * Number of days
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * Setter for days
     *
     * Number of days
     */
    public void setDays(Integer value) {
        this.days = value;
    }

    /**
     * Returns a JSON string representation of AccountTsaAccessDurationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
