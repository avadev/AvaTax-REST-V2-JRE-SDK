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
 * TaxDependencyLevelId
 */
public enum TaxDependencyLevelId {
    /** 
     * Document
     */
    Document(0),

    /** 
     * State
     */
    State(1),

    /** 
     * TaxRegion
     */
    TaxRegion(2),

    /** 
     * Address
     */
    Address(3);

    private int value;
	private static Map map = new HashMap<>();
	
	private TaxDependencyLevelId(int value) {
		this.value = value;
	}
	
	static {
		for (TaxDependencyLevelId enumName : TaxDependencyLevelId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static TaxDependencyLevelId valueOf(int intValue) {
		return (TaxDependencyLevelId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
