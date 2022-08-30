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
 * This field will identify who is remitting the tax - Marketplace or Seller.
 */
public enum MarketplaceLiabilityType {
    /** 
     * MarketPlace
     */
    Marketplace(1),

    /** 
     * Seller
     */
    Seller(2);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private MarketplaceLiabilityType(int value) {
		this.value = value;
	}
	
	static {
		for (MarketplaceLiabilityType enumName : MarketplaceLiabilityType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static MarketplaceLiabilityType valueOf(int intValue) {
		return (MarketplaceLiabilityType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
