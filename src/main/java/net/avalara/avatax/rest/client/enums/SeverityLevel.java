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
 * Severity of message
 */
public enum SeverityLevel {
	
    /** 
     * Operation succeeded
     */
    Success(0),

    /** 
     * Warnings occured, operation succeeded
     */
    Warning(1),

    /** 
     * Errors occured, operation failed
     */
    Error(2),

    /** 
     * Unexpected exceptions occurred, operation failed
     */
    Exception(3),

    /**
     * Integer value for SeverityLevel
     */
    public final int Value;

    private SeverityLevel(int value) {
		Value = value;
    }
	
	/**
	 * Map SeverityLevel to SeverityLevel integer ID.
	 */
	 private static final Map<Integer, SeverityLevel> _map = new HashMap<Integer, SeverityLevel>();
	 static
	 {
		 for (SeverityLevel modelName : SeverityLevel.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get SeverityLevel from value 
	  */
	 public static SeverityLevel from(int value)
	 {
		 return _map.get(value);
	 }
}
