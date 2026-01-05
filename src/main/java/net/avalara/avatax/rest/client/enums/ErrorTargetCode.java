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
 * What object experienced the error?
 */
public enum ErrorTargetCode {
    /** 
     * Error target is unknown
     */
    Unknown(0),

    /** 
     * There was an error in the request URL, querystring, or body
     */
    HttpRequest(1),

    /** 
     * There was an error in the HTTP Request headers
     */
    HttpRequestHeaders(2),

    /** 
     * Some data provided by the user was incorrect
     */
    IncorrectData(3),

    /** 
     * There was an error in the AvaTax API Server
     */
    AvaTaxApiServer(10),

    /** 
     * There was an error in the Avalara Identity Server
     */
    AvalaraIdentityServer(11),

    /** 
     * The customer's account setup does not permit certain actions
     */
    CustomerAccountSetup(12);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private ErrorTargetCode(int value) {
		this.value = value;
	}
	
	static {
		for (ErrorTargetCode enumName : ErrorTargetCode.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ErrorTargetCode valueOf(int intValue) {
		return (ErrorTargetCode) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
