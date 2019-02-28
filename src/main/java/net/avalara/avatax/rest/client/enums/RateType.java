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
public enum RateType {
	
    /** 
     * 
     */
    ReducedA(65),

    /** 
     * 
     */
    ReducedB(66),

    /** 
     * 
     */
    Food(70),

    /** 
     * 
     */
    General(71),

    /** 
     * 
     */
    IncreasedStandard(73),

    /** 
     * 
     */
    LinenRental(76),

    /** 
     * 
     */
    Medical(77),

    /** 
     * 
     */
    Parking(80),

    /** 
     * 
     */
    SuperReduced(81),

    /** 
     * 
     */
    ReducedR(82),

    /** 
     * 
     */
    Standard(83),

    /** 
     * 
     */
    Services(88),

    /** 
     * 
     */
    Zero(90),

    /**
     * Integer value for RateType
     */
    public final int Value;

    private RateType(int value) {
		Value = value;
    }
	
	/**
	 * Map RateType to RateType integer ID.
	 */
	 private static final Map<Integer, RateType> _map = new HashMap<Integer, RateType>();
	 static
	 {
		 for (RateType modelName : RateType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get RateType from value 
	  */
	 public static RateType from(int value)
	 {
		 return _map.get(value);
	 }
}
