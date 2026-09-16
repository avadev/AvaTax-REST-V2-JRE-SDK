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
 * Identifies the party that collects tax from the consumer, as distinct from
 *  LiabilityType (who remits it) and ChargedTo (who pays it). Introduced for
 *  AVT-99436 — OTA Marketplace Liability Decision.
 */
public enum CollectedBy {
    /** 
     * Seller
     */
    Seller(0),

    /** 
     * Marketplace
     */
    Marketplace(1),

    /** 
     * Buyer
     */
    Buyer(2),

    /** 
     * OTA
     */
    OTA(3);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CollectedBy(int value) {
		this.value = value;
	}
	
	static {
		for (CollectedBy enumName : CollectedBy.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CollectedBy valueOf(int intValue) {
		return (CollectedBy) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
