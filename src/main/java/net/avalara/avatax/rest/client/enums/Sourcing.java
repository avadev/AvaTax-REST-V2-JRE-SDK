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
 * Sourcing
 */
public enum Sourcing {
	
    /** 
     * Mixed sourcing, for states that do both origin and destination calculation
     */
    Mixed(42),

    /** 
     * Destination
     */
    Destination(68),

    /** 
     * Origin
     */
    Origin(79),

    /**
     * Integer value for Sourcing
     */
    public final int Value;

    private Sourcing(int value) {
		Value = value;
    }
	
	/**
	 * Map Sourcing to Sourcing integer ID.
	 */
	 private static final Map<Integer, Sourcing> _map = new HashMap<Integer, Sourcing>();
	 static
	 {
		 for (Sourcing modelName : Sourcing.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get Sourcing from value 
	  */
	 public static Sourcing from(int value)
	 {
		 return _map.get(value);
	 }
}
