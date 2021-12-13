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
 * Model for updating rule execution order
 */
public class AdvancedRuleExecutionOrderModel {


    private ArrayList<String> ruleExecutionIds;

    /**
     * Getter for ruleExecutionIds
     *
     * The rule execution Ids in the desired order
	 * 
     */
    public ArrayList<String> getRuleExecutionIds() {
        return this.ruleExecutionIds;
    }

    /**
     * Setter for ruleExecutionIds
     *
     * The rule execution Ids in the desired order
     */
    public void setRuleExecutionIds(ArrayList<String> value) {
        this.ruleExecutionIds = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleExecutionOrderModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
