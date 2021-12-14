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
 * Swagger name: AvaTaxBeverageClient
 */

/**
 * 
 */
public enum AgeVerifyFailureCode {
    /** 
     * 
     */
    not_found(0),

    /** 
     * 
     */
    dob_unverifiable(1),

    /** 
     * 
     */
    under_age(2),

    /** 
     * 
     */
    suspected_fraud(3),

    /** 
     * 
     */
    deceased(4),

    /** 
     * 
     */
    unknown_error(5);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private AgeVerifyFailureCode(int value) {
		this.value = value;
	}
	
	static {
		for (AgeVerifyFailureCode enumName : AgeVerifyFailureCode.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AgeVerifyFailureCode valueOf(int intValue) {
		return (AgeVerifyFailureCode) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
