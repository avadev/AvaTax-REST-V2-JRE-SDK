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
 * Choice of rounding level for a transaction
 */
public enum RoundingLevelId {
	
    /** 
     * Round tax on each line separately
     */
    Line(0),

    /** 
     * Round tax at the document level
     */
    Document(1),

    /**
     * Integer value for RoundingLevelId
     */
    public final int Value;

    private RoundingLevelId(int value) {
		Value = value;
    }
	
	/**
	 * Map RoundingLevelId to RoundingLevelId integer ID.
	 */
	 private static final Map<Integer, RoundingLevelId> _map = new HashMap<Integer, RoundingLevelId>();
	 static
	 {
		 for (RoundingLevelId modelName : RoundingLevelId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get RoundingLevelId from value 
	  */
	 public static RoundingLevelId from(int value)
	 {
		 return _map.get(value);
	 }
}
