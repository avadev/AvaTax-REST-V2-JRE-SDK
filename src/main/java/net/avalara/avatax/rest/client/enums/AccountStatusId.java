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
 * Status of an Avalara account
 */
public enum AccountStatusId {
    /** 
     * This account is not currently active.
     */
    Inactive(0),

    /** 
     * This account is active and in use.
     */
    Active(1),

    /** 
     * This account is flagged as a test account and may be temporary.
     */
    Test(2),

    /** 
     * The account is new and is currently in the onboarding process.
     *  
     *  An account is considered new until the account administrator has reviewed and accepted
     *  [Avalara's terms and conditions](https://www.avalara.com/us/en/legal/terms.html).
     */
    New(3);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private AccountStatusId(int value) {
		this.value = value;
	}
	
	static {
		for (AccountStatusId enumName : AccountStatusId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AccountStatusId valueOf(int intValue) {
		return (AccountStatusId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
