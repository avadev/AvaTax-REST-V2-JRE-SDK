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
 * 
 */
public enum FilingRequestStatus {
    /** 
     * 
     */
    New(1),

    /** 
     * 
     */
    Validated(2),

    /** 
     * 
     */
    Pending(3),

    /** 
     * 
     */
    Active(4),

    /** 
     * 
     */
    PendingStop(5),

    /** 
     * 
     */
    Inactive(6),

    /** 
     * 
     */
    ChangeRequest(7),

    /** 
     * 
     */
    RequestApproved(8),

    /** 
     * 
     */
    RequestDenied(9);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private FilingRequestStatus(int value) {
		this.value = value;
	}
	
	static {
		for (FilingRequestStatus enumName : FilingRequestStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static FilingRequestStatus valueOf(int intValue) {
		return (FilingRequestStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
