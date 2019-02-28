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
 * Status for this exempt certificate
 */
public enum ExemptCertStatusId {
    /** 
     * Inactive certificate
     */
    Inactive(0),

    /** 
     * Active certificate
     */
    Active(1),

    /** 
     * Expired certificate
     */
    Expired(2),

    /** 
     * Revoked certificate
     */
    Revoked(3);

    private int value;
	private static Map map = new HashMap<>();
	
	private ExemptCertStatusId(int value) {
		this.value = value;
	}
	
	static {
		for (ExemptCertStatusId enumName : ExemptCertStatusId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ExemptCertStatusId valueOf(int intValue) {
		return (ExemptCertStatusId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
