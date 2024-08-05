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
 * Defines how a stack rate is determined for a specific country and region.
 */
public enum StackAggregationOption {
    /** 
     * No aggregation.
     *  The component rate is used for the stack rate.
     */
    NoStackAggregation(0),

    /** 
     * Rates are aggregated across all jurisdiction types.
     */
    FullStackAggregation(1),

    /** 
     * State and county rates are aggregated.
     */
    AggregateStateAndCounty(2),

    /** 
     * City and county rates are aggregated.
     */
    AggregateCityAndCounty(3);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private StackAggregationOption(int value) {
		this.value = value;
	}
	
	static {
		for (StackAggregationOption enumName : StackAggregationOption.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static StackAggregationOption valueOf(int intValue) {
		return (StackAggregationOption) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
