package net.avalara.avatax.rest.client.enums;
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
 * Represents the type of component in a graph-based custom rule.
 */
public enum CustomRuleComponentType {
    /** 
     * Unknown component type.
     */
    Unknown(0),

    /** 
     * A condition component that evaluates an expression and returns boolean results.
     */
    Condition(1),

    /** 
     * An action component that executes a specific operation when a rule is triggered.
     */
    Action(2),

    /** 
     * A variable component that defines a named value that can be referenced within rules.
     */
    Variable(3);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CustomRuleComponentType(int value) {
		this.value = value;
	}
	
	static {
		for (CustomRuleComponentType enumName : CustomRuleComponentType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CustomRuleComponentType valueOf(int intValue) {
		return (CustomRuleComponentType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
