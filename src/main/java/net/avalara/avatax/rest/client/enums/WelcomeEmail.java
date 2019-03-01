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
 */

/**
 * Represents the type of welcome email for the users
 */
public enum WelcomeEmail {
    /** 
     * Normal
     */
    Normal(0),

    /** 
     * Suppressed
     */
    Suppressed(1),

    /** 
     * Custom
     */
    Custom(2);
	
	private int value;
	private static HashMap map = new HashMap<>();
	
	private WelcomeEmail(int value) {
		this.value = value;
	}
	
	static {
		for (WelcomeEmail enumName : TextCase.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static WelcomeEmail valueOf(int intValue) {
		return (WelcomeEmail) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}

}
    