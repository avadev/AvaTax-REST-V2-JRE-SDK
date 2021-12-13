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
 * Model representing an execution of an advanced rule for a company
 */
public class AdvancedRuleExecutionModel {


    private String ruleExecutionId;

    /**
     * Getter for ruleExecutionId
     *
     * Rule execution unique identifier
	 * 
     */
    public String getRuleExecutionId() {
        return this.ruleExecutionId;
    }

    /**
     * Setter for ruleExecutionId
     *
     * Rule execution unique identifier
     */
    public void setRuleExecutionId(String value) {
        this.ruleExecutionId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Name of rule execution
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Name of rule execution
     */
    public void setName(String value) {
        this.name = value;
    }

    private Date startDate;

    /**
     * Getter for startDate
     *
     * Date rule execution starts
	 * 
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * Date rule execution starts
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * Date rule execution ends
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Date rule execution ends
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean enabled;

    /**
     * Getter for enabled
     *
     * Is rule execution enabled
	 * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for enabled
     *
     * Is rule execution enabled
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    private Boolean continueOnError;

    /**
     * Getter for continueOnError
     *
     * Should we keep running if we hit an exception
	 * 
     */
    public Boolean getContinueOnError() {
        return this.continueOnError;
    }

    /**
     * Setter for continueOnError
     *
     * Should we keep running if we hit an exception
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    private String ruleId;

    /**
     * Getter for ruleId
     *
     * Unique identifier of rule to execute
	 * 
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * Setter for ruleId
     *
     * Unique identifier of rule to execute
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    private AdvancedRuleModel rule;

    /**
     * Getter for rule
     *
     * 
	 * 
     */
    public AdvancedRuleModel getRule() {
        return this.rule;
    }

    /**
     * Setter for rule
     *
     * 
     */
    public void setRule(AdvancedRuleModel value) {
        this.rule = value;
    }

    private String customerData;

    /**
     * Getter for customerData
     *
     * Json data used for rule execution
	 * 
     */
    public String getCustomerData() {
        return this.customerData;
    }

    /**
     * Setter for customerData
     *
     * Json data used for rule execution
     */
    public void setCustomerData(String value) {
        this.customerData = value;
    }

    private String customerDataId;

    /**
     * Getter for customerDataId
     *
     * Unique identifier of customer data used in rule execution
	 * 
     */
    public String getCustomerDataId() {
        return this.customerDataId;
    }

    /**
     * Setter for customerDataId
     *
     * Unique identifier of customer data used in rule execution
     */
    public void setCustomerDataId(String value) {
        this.customerDataId = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleExecutionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
