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
 * Indicates the status of a CertExpress invitation link.
 */
public enum CertExpressInvitationStatus {
    /** 
     * The CertExpress website is currently building a landing page for the customer. Please
     *  wait about 10 seconds and fetch this request again to see when it will be ready.
     */
    InProgress(0),

    /** 
     * Indicates that the CertExpress invitation has been completed and is ready to use.
     */
    Ready(1);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CertExpressInvitationStatus(int value) {
		this.value = value;
	}
	
	static {
		for (CertExpressInvitationStatus enumName : CertExpressInvitationStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CertExpressInvitationStatus valueOf(int intValue) {
		return (CertExpressInvitationStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
