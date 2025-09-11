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
 * Represents a single step in the execution plan of a dynamic rule.
 */
public class DynamicRuleValidationPlanStepModel {


    private String step;

    /**
     * Getter for step
     *
     * Describes the stage or phase of calculation this step belongs to.
    * For example, "BeforeCalc".
     */
    public String getStep() {
        return this.step;
    }

    /**
     * Setter for step
     *
     * Describes the stage or phase of calculation this step belongs to.
    * For example, "BeforeCalc".
     */
    public void setStep(String value) {
        this.step = value;
    }

    private Integer order;

    /**
     * Getter for order
     *
     * The order in which this step will be executed.
     */
    public Integer getOrder() {
        return this.order;
    }

    /**
     * Setter for order
     *
     * The order in which this step will be executed.
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    private ArrayList<String> nodes;

    /**
     * Getter for nodes
     *
     * A list of node identifiers that are part of this execution step, in the order they will be executed.
    * These refer to specific conditions or actions.
     */
    public ArrayList<String> getNodes() {
        return this.nodes;
    }

    /**
     * Setter for nodes
     *
     * A list of node identifiers that are part of this execution step, in the order they will be executed.
    * These refer to specific conditions or actions.
     */
    public void setNodes(ArrayList<String> value) {
        this.nodes = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleValidationPlanStepModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
