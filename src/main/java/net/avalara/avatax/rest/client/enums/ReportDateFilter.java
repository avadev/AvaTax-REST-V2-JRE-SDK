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
 * The date filter type for report
 *  "RD" for Reporting Date, "DD" for Document Date, "TD" for Tax Date, "PD" for Payment Date
 */
public enum ReportDateFilter {
	
    /** 
     * The date when the transaction is posted
     */
    DocumentDate(68),

    /** 
     * The date when the transaction is paid for
     */
    PaymentDate(80),

    /** 
     * The date when the transaction is added to report
     */
    ReportingDate(82),

    /** 
     * The date when the transaction is being taxed
     */
    TaxDate(84),

    private int value;
	private static Map map = new HashMap<>();
	
	private ReportDateFilter(int value) {
		this.value = value;
	}
	
	static {
		for (ReportDateFilter enumName : ReportDateFilter.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ReportDateFilter valueOf(int intValue) {
		return (ReportDateFilter) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
