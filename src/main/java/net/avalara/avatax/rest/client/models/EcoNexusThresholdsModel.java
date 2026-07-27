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
 * Response model for GET /api/v2/companies/{companyId}/econexusthresholds.
 */
public class EcoNexusThresholdsModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The Avalara company identifier.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The Avalara company identifier.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private ArrayList<ThresholdStateSummaryModel> states;

    /**
     * Getter for states
     *
     * Per-state threshold summaries for the company. Empty array if no evaluated data exists.
     */
    public ArrayList<ThresholdStateSummaryModel> getStates() {
        return this.states;
    }

    /**
     * Setter for states
     *
     * Per-state threshold summaries for the company. Empty array if no evaluated data exists.
     */
    public void setStates(ArrayList<ThresholdStateSummaryModel> value) {
        this.states = value;
    }

    private Date lastRefreshedAt;

    /**
     * Getter for lastRefreshedAt
     *
     * UTC timestamp of when the TPS in-memory cache last successfully refreshed from Snowflake.
    * Omitted when a refresh has not yet completed.
     */
    public Date getLastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Setter for lastRefreshedAt
     *
     * UTC timestamp of when the TPS in-memory cache last successfully refreshed from Snowflake.
    * Omitted when a refresh has not yet completed.
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
