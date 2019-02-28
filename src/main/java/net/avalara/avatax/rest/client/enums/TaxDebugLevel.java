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
 * Indicates the level of detail requested from a tax API call
 */
public enum TaxDebugLevel {
    /** 
     * User requests the normal level of debug information when creating a tax transaction
     */
    Normal(0),

    /** 
     * User requests additional diagnostic information when creating a tax transaction
     */
    Diagnostic(1)

    private int value;
	private static Map map = new HashMap<>();
	
	private TaxDebugLevel(int value) {
		this.value = value;
	}
	
	static {
		for (TaxDebugLevel enumName : TaxDebugLevel.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static TaxDebugLevel valueOf(int intValue) {
		return (TaxDebugLevel) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
