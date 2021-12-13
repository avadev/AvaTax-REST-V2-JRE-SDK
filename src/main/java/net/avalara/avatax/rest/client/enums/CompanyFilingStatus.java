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
public enum CompanyFilingStatus {
    /** 
     * 
     */
    NotConfiguredForCompliance(0),

    /** 
     * 
     */
    NotYetFiling(1),

    /** 
     * 
     */
    FilingRequested(2),

    /** 
     * 
     */
    FirstFiling(3),

    /** 
     * 
     */
    Active(4),

    /** 
     * 
     */
    NoReporting(5),

    /** 
     * 
     */
    Inactive(6);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CompanyFilingStatus(int value) {
		this.value = value;
	}
	
	static {
		for (CompanyFilingStatus enumName : CompanyFilingStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CompanyFilingStatus valueOf(int intValue) {
		return (CompanyFilingStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
