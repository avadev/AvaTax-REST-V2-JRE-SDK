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
 * Represents a create advanced rules batch request model.
 */
public class CreateAdvancedRulesBatchRequestModel {


    private String name;

    /**
     * Getter for name
     *
     * The user-friendly readable name for this batch.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The user-friendly readable name for this batch.
     */
    public void setName(String value) {
        this.name = value;
    }

    private Boolean replaceExisting;

    /**
     * Getter for replaceExisting
     *
     * Flag to try updating existing rules instead of just append
     */
    public Boolean getReplaceExisting() {
        return this.replaceExisting;
    }

    /**
     * Setter for replaceExisting
     *
     * Flag to try updating existing rules instead of just append
     */
    public void setReplaceExisting(Boolean value) {
        this.replaceExisting = value;
    }

    private String options;

    /**
     * Getter for options
     *
     * Any optional flags provided for this batch
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Any optional flags provided for this batch
     */
    public void setOptions(String value) {
        this.options = value;
    }

    private ArrayList<AdvancedRuleExecutionModel> executions;

    /**
     * Getter for executions
     *
     * List of rule executions to import
     */
    public ArrayList<AdvancedRuleExecutionModel> getExecutions() {
        return this.executions;
    }

    /**
     * Setter for executions
     *
     * List of rule executions to import
     */
    public void setExecutions(ArrayList<AdvancedRuleExecutionModel> value) {
        this.executions = value;
    }

    /**
     * Returns a JSON string representation of CreateAdvancedRulesBatchRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
