import java.util.HashMap;

package net.avalara.avatax.rest.client.enums;

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
 */

/**
 * 
 */
public enum AdvancedRuleScriptType {
	
    /** 
     * 
     */
    RequestRule(0),

    /** 
     * 
     */
    ResponseRule(1),

    /**
     * Integer value for AdvancedRuleScriptType
     */
    public final int Value;

    private AdvancedRuleScriptType(int value) {
		Value = value;
    }
	
	/**
	 * Map AdvancedRuleScriptType to AdvancedRuleScriptType integer ID.
	 */
	 private static final Map<Integer, AdvancedRuleScriptType> _map = new HashMap<Integer, AdvancedRuleScriptType>();
	 static
	 {
		 for (AdvancedRuleScriptType modelName : AdvancedRuleScriptType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get AdvancedRuleScriptType from value 
	  */
	 public static AdvancedRuleScriptType from(int value)
	 {
		 return _map.get(value);
	 }
}
