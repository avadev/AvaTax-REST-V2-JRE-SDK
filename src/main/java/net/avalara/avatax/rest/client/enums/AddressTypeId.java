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
 * Indicates whether this address refers to a person or an business
 */
public enum AddressTypeId {
    /** 
     * A business location, for example a store, warehouse, or office.
     */
    Location(1),

    /** 
     * A person's address who performs sales tasks for the company remotely from an office.
     */
    Salesperson(2),

    /** 
     * This location is a marketplace vendor that handles transactions on behalf of the company.
     *  When you select `Marketplace` as the address type for a location, you must then choose either
     *  `SellerRemitsTax` or `MarketplaceRemitsTax` to indicate which business entity is responsible
     *  for collecting and remitting tax for this location.
     */
    Marketplace(3),

    private int value;
	private static Map map = new HashMap<>();
	
	private AddressTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (AddressTypeId enumName : AddressTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AddressTypeId valueOf(int intValue) {
		return (AddressTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
