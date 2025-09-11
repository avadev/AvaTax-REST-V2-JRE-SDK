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
 * Model for constructing a simple template graph based on user selected node subtypes
 */
public class DynamicRuleTemplateRequestModel {


    private ArrayList<String> nodeSubtypes;

    /**
     * Getter for nodeSubtypes
     *
     * The node types that must be included in the resulting template
     */
    public ArrayList<String> getNodeSubtypes() {
        return this.nodeSubtypes;
    }

    /**
     * Setter for nodeSubtypes
     *
     * The node types that must be included in the resulting template
     */
    public void setNodeSubtypes(ArrayList<String> value) {
        this.nodeSubtypes = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleTemplateRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
