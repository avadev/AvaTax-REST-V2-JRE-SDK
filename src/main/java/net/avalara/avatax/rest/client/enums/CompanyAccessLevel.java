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
public enum CompanyAccessLevel {
    /** 
     * 
     */
    None(0),

    /** 
     * 
     */
    SingleCompany(1),

    /** 
     * 
     */
    SingleAccount(2),

    /** 
     * 
     */
    AllCompanies(3),

    /** 
     * 
     */
    FirmManagedAccounts(4);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CompanyAccessLevel(int value) {
		this.value = value;
	}
	
	static {
		for (CompanyAccessLevel enumName : CompanyAccessLevel.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CompanyAccessLevel valueOf(int intValue) {
		return (CompanyAccessLevel) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
