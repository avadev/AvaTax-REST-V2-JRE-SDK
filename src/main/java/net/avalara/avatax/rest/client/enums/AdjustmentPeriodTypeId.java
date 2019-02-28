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
 * 
 */
public enum AdjustmentPeriodTypeId {
	
    /** 
     * 
     */
    None(0),

    /** 
     * 
     */
    CurrentPeriod(1),

    /** 
     * 
     */
    NextPeriod(2),

    /**
     * Integer value for AdjustmentPeriodTypeId
     */
    public final int Value;

    private AdjustmentPeriodTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map AdjustmentPeriodTypeId to AdjustmentPeriodTypeId integer ID.
	 */
	 private static final Map<Integer, AdjustmentPeriodTypeId> _map = new HashMap<Integer, AdjustmentPeriodTypeId>();
	 static
	 {
		 for (AdjustmentPeriodTypeId modelName : AdjustmentPeriodTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get AdjustmentPeriodTypeId from value 
	  */
	 public static AdjustmentPeriodTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
