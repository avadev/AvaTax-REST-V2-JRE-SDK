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
 * Jurisdiction Type
 */
public enum JurisdictionType {
	
    /** 
     * Country
     */
    Country(0),

    /** 
     * State
     */
    State(1),

    /** 
     * County
     */
    County(2),

    /** 
     * City
     */
    City(3),

    /** 
     * Special Tax Jurisdiction
     */
    Special(4),

    private int value;
	private static Map map = new HashMap<>();
	
	private JurisdictionType(int value) {
		this.value = value;
	}
	
	static {
		for (JurisdictionType enumName : JurisdictionType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static JurisdictionType valueOf(int intValue) {
		return (JurisdictionType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
