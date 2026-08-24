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
 * Represents the definition of a Custom Rule, which defines its execution flow.
 */
public class CustomRuleDefinitionInputModel {


    private ArrayList<CustomRuleComponentInputModel> variables;

    /**
     * Getter for variables
     *
     * Define fixed components with rule-wide scope.
     */
    public ArrayList<CustomRuleComponentInputModel> getVariables() {
        return this.variables;
    }

    /**
     * Setter for variables
     *
     * Define fixed components with rule-wide scope.
     */
    public void setVariables(ArrayList<CustomRuleComponentInputModel> value) {
        this.variables = value;
    }

    private ArrayList<CustomRuleComponentInputModel> nodes;

    /**
     * Getter for nodes
     *
     * Define components which make up the execution graph.
    * The graph must be directed and acyclic.
     */
    public ArrayList<CustomRuleComponentInputModel> getNodes() {
        return this.nodes;
    }

    /**
     * Setter for nodes
     *
     * Define components which make up the execution graph.
    * The graph must be directed and acyclic.
     */
    public void setNodes(ArrayList<CustomRuleComponentInputModel> value) {
        this.nodes = value;
    }

    /**
     * Returns a JSON string representation of CustomRuleDefinitionInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
