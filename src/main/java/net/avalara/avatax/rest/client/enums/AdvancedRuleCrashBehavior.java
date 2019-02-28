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
public enum AdvancedRuleCrashBehavior {
	
    /** 
     * 
     */
    FailOnError(0),

    /** 
     * 
     */
    ProceedWithOriginal(1),

    /**
     * Integer value for AdvancedRuleCrashBehavior
     */
    public final int Value;

    private AdvancedRuleCrashBehavior(int value) {
		Value = value;
    }
	
	/**
	 * Map AdvancedRuleCrashBehavior to AdvancedRuleCrashBehavior integer ID.
	 */
	 private static final Map<Integer, AdvancedRuleCrashBehavior> _map = new HashMap<Integer, AdvancedRuleCrashBehavior>();
	 static
	 {
		 for (AdvancedRuleCrashBehavior modelName : AdvancedRuleCrashBehavior.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get AdvancedRuleCrashBehavior from value 
	  */
	 public static AdvancedRuleCrashBehavior from(int value)
	 {
		 return _map.get(value);
	 }
}
