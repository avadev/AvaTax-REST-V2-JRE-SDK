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
    OpenIdBearerToken(3),

    /**
     * Integer value for AuthenticationTypeId
     */
    public final int Value;

    private AuthenticationTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map AuthenticationTypeId to AuthenticationTypeId integer ID.
	 */
	 private static final Map<Integer, AuthenticationTypeId> _map = new HashMap<Integer, AuthenticationTypeId>();
	 static
	 {
		 for (AuthenticationTypeId modelName : AuthenticationTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get AuthenticationTypeId from value 
	  */
	 public static AuthenticationTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
