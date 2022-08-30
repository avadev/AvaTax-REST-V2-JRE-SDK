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
public enum POASubscriptionType {
    /** 
     * 
     */
    Mrs(0),

    /** 
     * 
     */
    AvaComms(1),

    /** 
     * 
     */
    AvaHospitality(2),

    /** 
     * 
     */
    AvaLodging(3),

    /** 
     * 
     */
    MRSComplianceManager(4),

    /** 
     * 
     */
    AMRA(5),

    /** 
     * 
     */
    MRSPremium(6),

    /** 
     * 
     */
    MRSPremier(7);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private POASubscriptionType(int value) {
		this.value = value;
	}
	
	static {
		for (POASubscriptionType enumName : POASubscriptionType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static POASubscriptionType valueOf(int intValue) {
		return (POASubscriptionType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
