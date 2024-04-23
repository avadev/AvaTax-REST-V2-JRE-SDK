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
 * Model for Advanced Rules when full details are requested
 */
public class AdvancedRuleFullDetailsModel {


    private String createdBy;

    /**
     * Getter for createdBy
     *
     * Creator of the rule
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for createdBy
     *
     * Creator of the rule
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    private String createdOn;

    /**
     * Getter for createdOn
     *
     * When the rule was created
     */
    public String getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for createdOn
     *
     * When the rule was created
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
    }

    private Boolean isSystemRule;

    /**
     * Getter for isSystemRule
     *
     * Is this a system rule as opposed to customer-facing
     */
    public Boolean getIsSystemRule() {
        return this.isSystemRule;
    }

    /**
     * Setter for isSystemRule
     *
     * Is this a system rule as opposed to customer-facing
     */
    public void setIsSystemRule(Boolean value) {
        this.isSystemRule = value;
    }

    private Boolean isVisibleInCUP;

    /**
     * Getter for isVisibleInCUP
     *
     * Is the rule displayed in the CUP UI
     */
    public Boolean getIsVisibleInCUP() {
        return this.isVisibleInCUP;
    }

    /**
     * Setter for isVisibleInCUP
     *
     * Is the rule displayed in the CUP UI
     */
    public void setIsVisibleInCUP(Boolean value) {
        this.isVisibleInCUP = value;
    }

    private Boolean isTest;

    /**
     * Getter for isTest
     *
     * Is this a rule created for testing
     */
    public Boolean getIsTest() {
        return this.isTest;
    }

    /**
     * Setter for isTest
     *
     * Is this a rule created for testing
     */
    public void setIsTest(Boolean value) {
        this.isTest = value;
    }

    private String customerDataSchema;

    /**
     * Getter for customerDataSchema
     *
     * The JSON schema for customer data if it is required for the rule
     */
    public String getCustomerDataSchema() {
        return this.customerDataSchema;
    }

    /**
     * Setter for customerDataSchema
     *
     * The JSON schema for customer data if it is required for the rule
     */
    public void setCustomerDataSchema(String value) {
        this.customerDataSchema = value;
    }

    private Integer version;

    /**
     * Getter for version
     *
     * The version of the rule
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version
     *
     * The version of the rule
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    private String ruleId;

    /**
     * Getter for ruleId
     *
     * Unique identifier for a rule
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * Setter for ruleId
     *
     * Unique identifier for a rule
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Rule name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Rule name
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Description of the rule
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of the rule
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Boolean arEntitlementRequired;

    /**
     * Getter for arEntitlementRequired
     *
     * Advance Rules limited availability
     */
    public Boolean getArEntitlementRequired() {
        return this.arEntitlementRequired;
    }

    /**
     * Setter for arEntitlementRequired
     *
     * Advance Rules limited availability
     */
    public void setArEntitlementRequired(Boolean value) {
        this.arEntitlementRequired = value;
    }

    private String executionPosition;

    /**
     * Getter for executionPosition
     *
     * Execution position. Both, Before or After
     */
    public String getExecutionPosition() {
        return this.executionPosition;
    }

    /**
     * Setter for executionPosition
     *
     * Execution position. Both, Before or After
     */
    public void setExecutionPosition(String value) {
        this.executionPosition = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleFullDetailsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
