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
 * Input model for the Advanced Rules bulk import API
 */
public class AdvancedRuleBulkImportModel {


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
     * Returns a JSON string representation of AdvancedRuleBulkImportModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
