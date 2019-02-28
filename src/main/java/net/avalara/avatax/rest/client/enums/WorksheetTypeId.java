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
 * Filing worksheet Type
 */
public enum WorksheetTypeId {
	
    /** 
     * The original filing for a period
     */
    Original(0),

    /** 
     * Represents an amended filing for a period
     */
    Amended(1),

    /** 
     * Represents a test filing
     */
    Test(2),

    /**
     * Integer value for WorksheetTypeId
     */
    public final int Value;

    private WorksheetTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map WorksheetTypeId to WorksheetTypeId integer ID.
	 */
	 private static final Map<Integer, WorksheetTypeId> _map = new HashMap<Integer, WorksheetTypeId>();
	 static
	 {
		 for (WorksheetTypeId modelName : WorksheetTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get WorksheetTypeId from value 
	  */
	 public static WorksheetTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
