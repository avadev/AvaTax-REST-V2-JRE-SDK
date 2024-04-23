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
 * Model for the results of importing a single rule execution with the Advanced Rules bulk import API
 */
public class AdvancedRuleImportResultModel {


    private String name;

    /**
     * Getter for name
     *
     * Name of rule execution
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

    private String importResult;

    /**
     * Getter for importResult
     *
     * Import result status code (e.g. Success, ValidationFailed, NotCreated, etc.)
     */
    public String getImportResult() {
        return this.importResult;
    }

    /**
     * Setter for importResult
     *
     * Import result status code (e.g. Success, ValidationFailed, NotCreated, etc.)
     */
    public void setImportResult(String value) {
        this.importResult = value;
    }

    private String importDetails;

    /**
     * Getter for importDetails
     *
     * Import result status message (e.g. list of validation errors)
     */
    public String getImportDetails() {
        return this.importDetails;
    }

    /**
     * Setter for importDetails
     *
     * Import result status message (e.g. list of validation errors)
     */
    public void setImportDetails(String value) {
        this.importDetails = value;
    }

    private String ruleExecutionId;

    /**
     * Getter for ruleExecutionId
     *
     * Rule execution unique identifier
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

    private String ruleId;

    /**
     * Getter for ruleId
     *
     * Unique identifier of rule to execute
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

    /**
     * Returns a JSON string representation of AdvancedRuleImportResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
