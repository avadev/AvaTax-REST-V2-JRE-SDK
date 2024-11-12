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
 * Defines returns liability type.
 */
public enum ReturnsLiabilityType {
    /** 
     * all
     */
    ALL(0),

    /** 
     * original
     */
    ORIGINAL(1),

    /** 
     * amend
     */
    AMENDED(2);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private ReturnsLiabilityType(int value) {
		this.value = value;
	}
	
	static {
		for (ReturnsLiabilityType enumName : ReturnsLiabilityType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ReturnsLiabilityType valueOf(int intValue) {
		return (ReturnsLiabilityType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
