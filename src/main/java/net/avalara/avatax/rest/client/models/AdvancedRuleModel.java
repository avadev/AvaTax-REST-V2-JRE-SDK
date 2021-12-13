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
 * A generic global advanced rule encapsulating a script
 */
public class AdvancedRuleModel {


    private String ruleId;

    /**
     * Getter for ruleId
     *
     * Unique identifier for a rule
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
     * Returns a JSON string representation of AdvancedRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
