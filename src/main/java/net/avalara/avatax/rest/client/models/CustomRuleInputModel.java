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
 * A Custom Rule customizes AvaTax's default tax calculation to match a company's specific requirements.
* It is composed of modular conditions and actions that can adjust an item's taxability, tax base, and tax rate,
* modify transaction fields and addresses, allocate or split line items, update location codes, and more.
 */
public class CustomRuleInputModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique integer ID for this rule.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique integer ID for this rule.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private CustomRuleDefinitionInputModel definition;

    /**
     * Getter for definition
     *
     * 
     */
    public CustomRuleDefinitionInputModel getDefinition() {
        return this.definition;
    }

    /**
     * Setter for definition
     *
     * 
     */
    public void setDefinition(CustomRuleDefinitionInputModel value) {
        this.definition = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the rule. Must be unique within a company.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the rule. Must be unique within a company.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Optional description of the rule.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Optional description of the rule.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date at which this rule applies.
    * Within each execution step, each rule executes in effective date order by default.
    * Rules effective on the same date execute alphabetically based on their name.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The first date at which this rule applies.
    * Within each execution step, each rule executes in effective date order by default.
    * Rules effective on the same date execute alphabetically based on their name.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date for which this rule applies.
    * This must be on or after the effective date for the rule to be valid.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date for which this rule applies.
    * This must be on or after the effective date for the rule to be valid.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean enabled;

    /**
     * Getter for enabled
     *
     * Whether the rule is ever allowed to execute.
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for enabled
     *
     * Whether the rule is ever allowed to execute.
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    private Boolean continueOnError;

    /**
     * Getter for continueOnError
     *
     * Whether to continue the transaction if this rule fails.
    * If set to `false`, a failure will cause the entire transaction to return an error.
    * If set to `true`, a failure will only stop execution of this rule.
     */
    public Boolean getContinueOnError() {
        return this.continueOnError;
    }

    /**
     * Setter for continueOnError
     *
     * Whether to continue the transaction if this rule fails.
    * If set to `false`, a failure will cause the entire transaction to return an error.
    * If set to `true`, a failure will only stop execution of this rule.
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    private Boolean isDraft;

    /**
     * Getter for isDraft
     *
     * Whether this is a draft rule. Draft rules are not executed
    * on transactions by default. To execute a draft rule,
    * it must be enabled and the `TestTransaction` endpoint
    * must be used with appropriate settings.
     */
    public Boolean getIsDraft() {
        return this.isDraft;
    }

    /**
     * Setter for isDraft
     *
     * Whether this is a draft rule. Draft rules are not executed
    * on transactions by default. To execute a draft rule,
    * it must be enabled and the `TestTransaction` endpoint
    * must be used with appropriate settings.
     */
    public void setIsDraft(Boolean value) {
        this.isDraft = value;
    }

    /**
     * Returns a JSON string representation of CustomRuleInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
