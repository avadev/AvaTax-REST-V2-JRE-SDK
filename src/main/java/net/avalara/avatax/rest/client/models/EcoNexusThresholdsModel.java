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
 * The economic nexus threshold statuses evaluated for a company.
 */
public class EcoNexusThresholdsModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which these threshold statuses belong.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which these threshold statuses belong.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private ArrayList<ThresholdStateSummaryModel> states;

    /**
     * Getter for states
     *
     * The per-state threshold statuses for this company.
    * Empty when no threshold status has been evaluated for the company.
     */
    public ArrayList<ThresholdStateSummaryModel> getStates() {
        return this.states;
    }

    /**
     * Setter for states
     *
     * The per-state threshold statuses for this company.
    * Empty when no threshold status has been evaluated for the company.
     */
    public void setStates(ArrayList<ThresholdStateSummaryModel> value) {
        this.states = value;
    }

    private Date lastRefreshedAt;

    /**
     * Getter for lastRefreshedAt
     *
     * The UTC date and time when these threshold statuses were last updated.
    * Omitted when the age of the data is not known.
     */
    public Date getLastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Setter for lastRefreshedAt
     *
     * The UTC date and time when these threshold statuses were last updated.
    * Omitted when the age of the data is not known.
     */
    public void setLastRefreshedAt(Date value) {
        this.lastRefreshedAt = value;
    }

    /**
     * Returns a JSON string representation of EcoNexusThresholdsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
