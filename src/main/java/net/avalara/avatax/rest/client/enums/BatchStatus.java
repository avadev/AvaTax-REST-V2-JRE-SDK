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
public enum BatchStatus {
    /** 
     * 
     */
    Waiting(0),

    /** 
     * 
     */
    SystemErrors(1),

    /** 
     * 
     */
    Cancelled(2),

    /** 
     * 
     */
    Completed(3),

    /** 
     * 
     */
    Creating(4),

    /** 
     * 
     */
    Deleted(5),

    /** 
     * 
     */
    Errors(6),

    /** 
     * 
     */
    Paused(7),

    /** 
     * 
     */
    Processing(8),

    /** 
     * 
     */
    Cancelling(9);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private BatchStatus(int value) {
		this.value = value;
	}
	
	static {
		for (BatchStatus enumName : BatchStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static BatchStatus valueOf(int intValue) {
		return (BatchStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
