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
 * Output model for the Advanced Rules bulk import API
 */
public class AdvancedRuleBulkImportResultModel {


    private BulkImportStatus importResult;

    /**
     * Getter for importResult
     *
     * Aggregated import result code
     */
    public BulkImportStatus getImportResult() {
        return this.importResult;
    }

    /**
     * Setter for importResult
     *
     * Aggregated import result code
     */
    public void setImportResult(BulkImportStatus value) {
        this.importResult = value;
    }

    private String importMessage;

    /**
     * Getter for importMessage
     *
     * Aggregated import result message
     */
    public String getImportMessage() {
        return this.importMessage;
    }

    /**
     * Setter for importMessage
     *
     * Aggregated import result message
     */
    public void setImportMessage(String value) {
        this.importMessage = value;
    }

    private ArrayList<AdvancedRuleImportResultModel> executions;

    /**
     * Getter for executions
     *
     * Import results for individual rule executions
     */
    public ArrayList<AdvancedRuleImportResultModel> getExecutions() {
        return this.executions;
    }

    /**
     * Setter for executions
     *
     * Import results for individual rule executions
     */
    public void setExecutions(ArrayList<AdvancedRuleImportResultModel> value) {
        this.executions = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleBulkImportResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
