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
 * Used for Enabling an Autit Trail.
 */
public class AuditServiceConfigModel {


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Date and Time to start Auditing in UTC. If left blank, default to current time
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Date and Time to start Auditing in UTC. If left blank, default to current time
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Integer duration;

    /**
     * Getter for duration
     *
     * Duration of Audit in hours
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Setter for duration
     *
     * Duration of Audit in hours
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Returns a JSON string representation of AuditServiceConfigModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
