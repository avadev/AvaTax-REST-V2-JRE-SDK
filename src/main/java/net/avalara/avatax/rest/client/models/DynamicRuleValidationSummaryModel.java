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
 * Represents a summary of the validation results for a dynamic rule.
 */
public class DynamicRuleValidationSummaryModel {


    private String message;

    /**
     * Getter for message
     *
     * A high-level message describing the overall validation status.
    * For example, "Errors are present, do not save rule."
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * A high-level message describing the overall validation status.
    * For example, "Errors are present, do not save rule."
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private Integer errorCount;

    /**
     * Getter for errorCount
     *
     * The total number of errors found during validation.
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * Setter for errorCount
     *
     * The total number of errors found during validation.
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

    private Integer warningCount;

    /**
     * Getter for warningCount
     *
     * The total number of warnings found during validation.
     */
    public Integer getWarningCount() {
        return this.warningCount;
    }

    /**
     * Setter for warningCount
     *
     * The total number of warnings found during validation.
     */
    public void setWarningCount(Integer value) {
        this.warningCount = value;
    }

    private Integer infoCount;

    /**
     * Getter for infoCount
     *
     * The total number of informational messages generated during validation.
     */
    public Integer getInfoCount() {
        return this.infoCount;
    }

    /**
     * Setter for infoCount
     *
     * The total number of informational messages generated during validation.
     */
    public void setInfoCount(Integer value) {
        this.infoCount = value;
    }

    private Integer taxRuleCount;

    /**
     * Getter for taxRuleCount
     *
     * The total number of tax rules that would be generated or affected by this dynamic rule.
     */
    public Integer getTaxRuleCount() {
        return this.taxRuleCount;
    }

    /**
     * Setter for taxRuleCount
     *
     * The total number of tax rules that would be generated or affected by this dynamic rule.
     */
    public void setTaxRuleCount(Integer value) {
        this.taxRuleCount = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleValidationSummaryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
