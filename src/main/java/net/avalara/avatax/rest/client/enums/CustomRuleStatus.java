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
 * The status of a custom rule as returned by the custom rule summary endpoint.
 */
public enum CustomRuleStatus {
    /** 
     * The status of the rule is unknown.
     */
    Unknown(0),

    /** 
     * The rule is enabled and effective on the current date.
     */
    Active(1),

    /** 
     * The rule is not enabled.
     */
    Inactive(2),

    /** 
     * The rule is marked enabled, but it is past the end date of the rule.
     */
    Expired(3),

    /** 
     * The rule is marked enabled, but it is before the first effective date of the rule.
     */
    Future(4);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CustomRuleStatus(int value) {
		this.value = value;
	}
	
	static {
		for (CustomRuleStatus enumName : CustomRuleStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CustomRuleStatus valueOf(int intValue) {
		return (CustomRuleStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
