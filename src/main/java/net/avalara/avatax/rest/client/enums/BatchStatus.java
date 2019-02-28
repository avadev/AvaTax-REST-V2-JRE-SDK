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
 * The status of a batch file
 */
public enum BatchStatus {
	
    /** 
     * Batch file has been received and is in the queue to be processed.
     */
    Waiting(0),

    /** 
     * Batch file experienced system errors and cannot be processed.
     */
    SystemErrors(1),

    /** 
     * Batch file is cancelled
     */
    Cancelled(2),

    /** 
     * Batch file has been completely processed.
     */
    Completed(3),

    /** 
     * Batch file is currently being created.
     */
    Creating(4),

    /** 
     * Batch file has been deleted.
     */
    Deleted(5),

    /** 
     * Batch file was processed with some errors.
     */
    Errors(6),

    /** 
     * Batch processing was paused.
     */
    Paused(7),

    /** 
     * Batch is currently being processed.
     */
    Processing(8),

    private int value;
	private static Map map = new HashMap<>();
	
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
