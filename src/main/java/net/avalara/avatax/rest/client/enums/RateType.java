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
    Construction(78),

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
    Leasing(84),

    /** 
     * 
     */
    LeasingLow(85),

    /** 
     * 
     */
    Services(88),

    /** 
     * 
     */
    Zero(90);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private RateType(int value) {
		this.value = value;
	}
	
	static {
		for (RateType enumName : RateType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static RateType valueOf(int intValue) {
		return (RateType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
