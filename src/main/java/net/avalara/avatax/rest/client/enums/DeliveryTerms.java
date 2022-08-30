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
public enum DeliveryTerms {
    /** 
     * Delivery At Place (DAP) implies that Duty And Tax will be paid by the Buyer or Consignee of the shipment
     */
    DAP(1),

    /** 
     * Delivery Duty Paid (DDP) implies that Duty And Tax will be paid by the Shipper
     */
    DDP(2);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private DeliveryTerms(int value) {
		this.value = value;
	}
	
	static {
		for (DeliveryTerms enumName : DeliveryTerms.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static DeliveryTerms valueOf(int intValue) {
		return (DeliveryTerms) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
