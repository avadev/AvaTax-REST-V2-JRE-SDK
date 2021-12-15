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
public enum AddressCategoryId {
    /** 
     * 
     */
    Storefront(1),

    /** 
     * 
     */
    MainOffice(2),

    /** 
     * 
     */
    Warehouse(3),

    /** 
     * 
     */
    Salesperson(4),

    /** 
     * 
     */
    Other(5),

    /** 
     * 
     */
    SellerRemitsTax(6),

    /** 
     * 
     */
    MarketplaceRemitsTax(7),

    /** 
     * 
     */
    NonPhysical(8);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private AddressCategoryId(int value) {
		this.value = value;
	}
	
	static {
		for (AddressCategoryId enumName : AddressCategoryId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AddressCategoryId valueOf(int intValue) {
		return (AddressCategoryId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
