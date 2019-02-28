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
 * A list of possible AvaFile filing option types.
 */
public enum FilingOptionTypeId {
    /** 
     * Denotes the tax return is being filed on paper.
     */
    Paper(0),

    /** 
     * Denotes the form can be efiled optionally.
     */
    OptionalEfile(1),

    /** 
     * Denotes the form is being filed via efile.
     */
    MandatoryEfile(2)

    private int value;
	private static Map map = new HashMap<>();
	
	private FilingOptionTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (FilingOptionTypeId enumName : FilingOptionTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static FilingOptionTypeId valueOf(int intValue) {
		return (FilingOptionTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
