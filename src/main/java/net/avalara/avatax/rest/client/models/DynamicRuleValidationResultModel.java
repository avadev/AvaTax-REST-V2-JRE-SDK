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
 * Represents the complete validation result for a dynamic rule, including a summary,
* individual messages, an execution plan, and affected tax rules.
 */
public class DynamicRuleValidationResultModel {


    private DynamicRuleValidationSummaryModel summary;

    /**
     * Getter for summary
     *
     * 
     */
    public DynamicRuleValidationSummaryModel getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * 
     */
    public void setSummary(DynamicRuleValidationSummaryModel value) {
        this.summary = value;
    }

    private ArrayList<DynamicRuleValidationMessageModel> messages;

    /**
     * Getter for messages
     *
     * A list of detailed validation messages (errors, warnings, info).
     */
    public ArrayList<DynamicRuleValidationMessageModel> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages
     *
     * A list of detailed validation messages (errors, warnings, info).
     */
    public void setMessages(ArrayList<DynamicRuleValidationMessageModel> value) {
        this.messages = value;
    }

    private ArrayList<DynamicRuleValidationPlanStepModel> executionPlan;

    /**
     * Getter for executionPlan
     *
     * A list of steps outlining the execution plan for the dynamic rule.
    * This can help in understanding how the rule will be processed.
     */
    public ArrayList<DynamicRuleValidationPlanStepModel> getExecutionPlan() {
        return this.executionPlan;
    }

    /**
     * Setter for executionPlan
     *
     * A list of steps outlining the execution plan for the dynamic rule.
    * This can help in understanding how the rule will be processed.
     */
    public void setExecutionPlan(ArrayList<DynamicRuleValidationPlanStepModel> value) {
        this.executionPlan = value;
    }

    private ArrayList<DynamicRuleGeneratedTaxRuleModel> taxRules;

    /**
     * Getter for taxRules
     *
     * A list of tax rules that would be generated or affected by this dynamic rule if it were saved.
     */
    public ArrayList<DynamicRuleGeneratedTaxRuleModel> getTaxRules() {
        return this.taxRules;
    }

    /**
     * Setter for taxRules
     *
     * A list of tax rules that would be generated or affected by this dynamic rule if it were saved.
     */
    public void setTaxRules(ArrayList<DynamicRuleGeneratedTaxRuleModel> value) {
        this.taxRules = value;
    }

    private ArrayList<String> lookupFilesUsed;

    /**
     * Getter for lookupFilesUsed
     *
     * The list of lookup files used by this rule.
     */
    public ArrayList<String> getLookupFilesUsed() {
        return this.lookupFilesUsed;
    }

    /**
     * Setter for lookupFilesUsed
     *
     * The list of lookup files used by this rule.
     */
    public void setLookupFilesUsed(ArrayList<String> value) {
        this.lookupFilesUsed = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleValidationResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
