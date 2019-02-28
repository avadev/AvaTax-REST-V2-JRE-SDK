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
 * Accrual types
 */
public enum AccrualType {
    /** 
     * Filing indicates that this tax return should be filed with its tax authority by its due date. For example, if you file annually, you will have eleven months of Accrual returns and one Filing return.
     */
    Filing(1),

    /** 
     * An Accrual filing indicates taxes that are accrued, intended to be filed on a future tax return. For example, if you file annually, you will have eleven months of Accrual returns and one Filing return.
     */
    Accrual(2);

    private int value;
	private static Map map = new HashMap<>();
	
	private AccrualType(int value) {
		this.value = value;
	}
	
	static {
		for (AccrualType enumName : AccrualType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AccrualType valueOf(int intValue) {
		return (AccrualType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
