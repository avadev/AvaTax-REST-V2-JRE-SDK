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
 * 
 */
public enum CertCaptureProvisionStatus {
    /** 
     * Account and company are provisioned
     */
    Provisioned(0),

    /** 
     * Provision job is being queued
     *  This could also be an indication that some companies under an account has been provisioned, while others
     *  under the same account has not.
     */
    InProgress(1),

    /** 
     * 
     */
    NotProvisioned(2);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CertCaptureProvisionStatus(int value) {
		this.value = value;
	}
	
	static {
		for (CertCaptureProvisionStatus enumName : CertCaptureProvisionStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CertCaptureProvisionStatus valueOf(int intValue) {
		return (CertCaptureProvisionStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
