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
 * Visibility for a parameter.
 */
public enum Visibility {
    /** 
     * Denotes the Parameter is required
     */
    Required(0),

    /** 
     * Denotes the Parameter is recommended
     */
    Recommended(1),

    /** 
     * Denotes the Parameter is optional
     */
    Optional(2),

    /** 
     * Denotes the Parameter is conditional
     */
    Conditional(3);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private Visibility(int value) {
		this.value = value;
	}
	
	static {
		for (Visibility enumName : Visibility.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static Visibility valueOf(int intValue) {
		return (Visibility) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
