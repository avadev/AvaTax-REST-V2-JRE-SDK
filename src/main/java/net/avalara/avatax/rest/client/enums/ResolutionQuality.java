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
 * 
 */
public enum ResolutionQuality {
    /** 
     * 
     */
    NotCoded(0),

    /** 
     * 
     */
    External(1),

    /** 
     * 
     */
    CountryCentroid(2),

    /** 
     * 
     */
    RegionCentroid(3),

    /** 
     * 
     */
    PartialCentroid(4),

    /** 
     * 
     */
    PostalCentroidGood(5),

    /** 
     * 
     */
    PostalCentroidBetter(6),

    /** 
     * 
     */
    PostalCentroidBest(7),

    /** 
     * 
     */
    Intersection(8),

    /** 
     * 
     */
    Interpolated(9),

    /** 
     * 
     */
    Rooftop(10),

    /** 
     * 
     */
    Constant(11);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private ResolutionQuality(int value) {
		this.value = value;
	}
	
	static {
		for (ResolutionQuality enumName : ResolutionQuality.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ResolutionQuality valueOf(int intValue) {
		return (ResolutionQuality) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
