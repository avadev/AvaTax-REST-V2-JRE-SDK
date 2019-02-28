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
 * Filing Frequency types
 */
public enum NoticeCustomerType {
	
    /** 
     * AvaTax Returns
     */
    AvaTaxReturns(1),

    /** 
     * Stand Alone
     */
    StandAlone(2),

    /** 
     * Strategic
     */
    Strategic(3),

    /** 
     * SST
     */
    SST(4),

    /** 
     * TrustFile
     */
    TrustFile(5),

    /**
     * Integer value for NoticeCustomerType
     */
    public final int Value;

    private NoticeCustomerType(int value) {
		Value = value;
    }
	
	/**
	 * Map NoticeCustomerType to NoticeCustomerType integer ID.
	 */
	 private static final Map<Integer, NoticeCustomerType> _map = new HashMap<Integer, NoticeCustomerType>();
	 static
	 {
		 for (NoticeCustomerType modelName : NoticeCustomerType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get NoticeCustomerType from value 
	  */
	 public static NoticeCustomerType from(int value)
	 {
		 return _map.get(value);
	 }
}
