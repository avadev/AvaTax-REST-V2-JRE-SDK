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
 * The address resolution quality of an address validation result
 */
public enum ResolutionQuality {
    /** 
     * Location was not geocoded
     */
    NotCoded(0),

    /** 
     * Location was already geocoded on the request
     */
    External(1),

    /** 
     * Avalara-defined country centroid
     */
    CountryCentroid(2),

    /** 
     * Avalara-defined state / province centroid
     */
    RegionCentroid(3),

    /** 
     * Geocoded at a level more coarse than a PostalCentroid1
     */
    PartialCentroid(4),

    /** 
     * Largest postal code (zip5 in US, left three in CA, etc
     */
    PostalCentroidGood(5),

    /** 
     * Better postal code (zip7 in US)
     */
    PostalCentroidBetter(6),

    /** 
     * Best postal code (zip9 in US, complete postal code elsewhere)
     */
    PostalCentroidBest(7),

    /** 
     * Nearest intersection
     */
    Intersection(8),

    /** 
     * Interpolated to rooftop
     */
    Interpolated(9),

    /** 
     * Assumed to be rooftop level, non-interpolated
     */
    Rooftop(10),

    /** 
     * Pulled from a static list of geocodes for specific jurisdictions
     */
    Constant(11)

    private int value;
	private static Map map = new HashMap<>();
	
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
