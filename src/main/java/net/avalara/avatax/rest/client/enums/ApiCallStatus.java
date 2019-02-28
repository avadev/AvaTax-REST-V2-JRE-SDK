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
 * Indicates what level of auditing information is available for a transaction
 */
public enum ApiCallStatus {
    /** 
     * If the original api call is availabe on S3
     */
    OriginalApiCallAvailable(0),

    /** 
     * if the original api call is not available, reconstructed api call should always be available
     */
    ReconstructedApiCallAvailable(1),

    /** 
     * Any other api call status
     */
    Any(-1)

    private int value;
	private static Map map = new HashMap<>();
	
	private ApiCallStatus(int value) {
		this.value = value;
	}
	
	static {
		for (ApiCallStatus enumName : ApiCallStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ApiCallStatus valueOf(int intValue) {
		return (ApiCallStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
