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
 * Service modes for tax calculation when using an AvaLocal server.
 */
public enum ServiceMode {
    /** 
     * Automatically use local or remote (default)
     */
    Automatic(0),

    /** 
     * Local server only
     */
    Local(1),

    /** 
     * Remote server only
     */
    Remote(2);

    private int value;
	private static Map map = new HashMap<>();
	
	private ServiceMode(int value) {
		this.value = value;
	}
	
	static {
		for (ServiceMode enumName : ServiceMode.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ServiceMode valueOf(int intValue) {
		return (ServiceMode) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
