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
 * Refund types
 */
public enum RefundType {
    /** 
     * Refund the whole transaction.
     */
    Full(0),

    /** 
     * Refund only specific lines from the original a transaction.
     */
    Partial(1),

    /** 
     * Only refund the tax part of the transaction.
     */
    TaxOnly(2),

    /** 
     * Refund a percentage of the value of this transaction.
     */
    Percentage(3)

    private int value;
	private static Map map = new HashMap<>();
	
	private RefundType(int value) {
		this.value = value;
	}
	
	static {
		for (RefundType enumName : RefundType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static RefundType valueOf(int intValue) {
		return (RefundType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
