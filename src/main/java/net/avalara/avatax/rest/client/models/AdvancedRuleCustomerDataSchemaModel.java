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
 * Model for retrieving customer data schema
 */
public class AdvancedRuleCustomerDataSchemaModel {


    private String ruleId;

    /**
     * Getter for ruleId
     *
     * Unique identifier for the rule
	 * 
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * Setter for ruleId
     *
     * Unique identifier for the rule
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    private String customerDataSchema;

    /**
     * Getter for customerDataSchema
     *
     * Customer data schema
	 * 
     */
    public String getCustomerDataSchema() {
        return this.customerDataSchema;
    }

    /**
     * Setter for customerDataSchema
     *
     * Customer data schema
     */
    public void setCustomerDataSchema(String value) {
        this.customerDataSchema = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleCustomerDataSchemaModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
