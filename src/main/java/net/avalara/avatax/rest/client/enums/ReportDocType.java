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
 * The output DocumentType for a report
 */
public enum ReportDocType {
	
    /** 
     * Output all ConsumerUse tax transactions in the report
     */
    ConsumerUse(67),

    /** 
     * Output all Sales tax transactions in the report
     */
    Sales(83),

    /**
     * Integer value for ReportDocType
     */
    public final int Value;

    private ReportDocType(int value) {
		Value = value;
    }
	
	/**
	 * Map ReportDocType to ReportDocType integer ID.
	 */
	 private static final Map<Integer, ReportDocType> _map = new HashMap<Integer, ReportDocType>();
	 static
	 {
		 for (ReportDocType modelName : ReportDocType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ReportDocType from value 
	  */
	 public static ReportDocType from(int value)
	 {
		 return _map.get(value);
	 }
}
