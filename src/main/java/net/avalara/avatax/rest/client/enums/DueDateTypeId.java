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
 * A list of possible Due Date Types
 */
public enum DueDateTypeId {
	
    /** 
     * Denotes form is due on the due day
     */
    ByDay(0),

    /** 
     * Denotes form is due by last day of the month
     */
    ByLastDay(1),

    /** 
     * Denotes form is due by second to last day of the month
     */
    BySecondLastDay(2),

    /**
     * Integer value for DueDateTypeId
     */
    public final int Value;

    private DueDateTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map DueDateTypeId to DueDateTypeId integer ID.
	 */
	 private static final Map<Integer, DueDateTypeId> _map = new HashMap<Integer, DueDateTypeId>();
	 static
	 {
		 for (DueDateTypeId modelName : DueDateTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get DueDateTypeId from value 
	  */
	 public static DueDateTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
