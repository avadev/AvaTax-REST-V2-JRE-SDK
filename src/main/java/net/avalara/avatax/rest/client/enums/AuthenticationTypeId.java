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
 * Represents the type of authentication provided to the API call
 */
public enum AuthenticationTypeId {
    /** 
     * This API call was not authenticated.
     */
    None(0),

    /** 
     * This API call was authenticated by your username/password.
     */
    UsernamePassword(1),

    /** 
     * This API call was authenticated by your Avalara Account ID and private license key.
     */
    AccountIdLicenseKey(2),

    /** 
     * This API call was authenticated by OpenID Bearer Token.
     */
    OpenIdBearerToken(3);

    private int value;
	private static Map map = new HashMap<>();
	
	private AuthenticationTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (AuthenticationTypeId enumName : AuthenticationTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AuthenticationTypeId valueOf(int intValue) {
		return (AuthenticationTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
