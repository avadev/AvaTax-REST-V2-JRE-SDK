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
 * 
 */
public enum PaymentAccountTypeId {
	
    /** 
     * 
     */
    None(0),

    /** 
     * 
     */
    AccountsReceivableAccountsPayable(1),

    /** 
     * 
     */
    AccountsReceivable(2),

    /** 
     * 
     */
    AccountsPayable(3),

    /**
     * Integer value for PaymentAccountTypeId
     */
    public final int Value;

    private PaymentAccountTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map PaymentAccountTypeId to PaymentAccountTypeId integer ID.
	 */
	 private static final Map<Integer, PaymentAccountTypeId> _map = new HashMap<Integer, PaymentAccountTypeId>();
	 static
	 {
		 for (PaymentAccountTypeId modelName : PaymentAccountTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get PaymentAccountTypeId from value 
	  */
	 public static PaymentAccountTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
