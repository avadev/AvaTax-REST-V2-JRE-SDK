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
 * A Dynamic Rule is a type of a custom rule which is similar to an Advanced Rule, but
* has a graph-based execution flow made up of modular Conditions and Actions that may
* be linked to one or more traditional custom Tax Rules.
 */
public class DynamicRuleInputModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique identifier for the execution
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the execution
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private DynamicRuleDefinitionInputModel definition;

    /**
     * Getter for definition
     *
     * 
     */
    public DynamicRuleDefinitionInputModel getDefinition() {
        return this.definition;
    }

    /**
     * Setter for definition
     *
     * 
     */
    public void setDefinition(DynamicRuleDefinitionInputModel value) {
        this.definition = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the execution
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the execution
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * The description of the execution
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of the execution
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The start date when the execution is valid
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The start date when the execution is valid
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date when the execution is valid
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date when the execution is valid
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean enabled;

    /**
     * Getter for enabled
     *
     * Whether the execution is enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for enabled
     *
     * Whether the execution is enabled
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    private Boolean continueOnError;

    /**
     * Getter for continueOnError
     *
     * Whether to continue execution if this rule fails
     */
    public Boolean getContinueOnError() {
        return this.continueOnError;
    }

    /**
     * Setter for continueOnError
     *
     * Whether to continue execution if this rule fails
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    private Boolean isDraft;

    /**
     * Getter for isDraft
     *
     * Whether this is a draft rule; draft rules are not executed
    * on transactions unless specifically enabled for testing
     */
    public Boolean getIsDraft() {
        return this.isDraft;
    }

    /**
     * Setter for isDraft
     *
     * Whether this is a draft rule; draft rules are not executed
    * on transactions unless specifically enabled for testing
     */
    public void setIsDraft(Boolean value) {
        this.isDraft = value;
    }

    private Integer priority;

    /**
     * Getter for priority
     *
     * The execution priority of the rule, which is used for sorting rules; within
    * each execution step, rules with a lower priority value are executed earlier
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Setter for priority
     *
     * The execution priority of the rule, which is used for sorting rules; within
    * each execution step, rules with a lower priority value are executed earlier
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
