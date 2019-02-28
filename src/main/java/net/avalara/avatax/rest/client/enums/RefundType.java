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
 * Refund types
 */
public enum RefundType {
	
    /** 
     * Refund the whole transaction.
     */
    Full(0),

    /** 
     * Refund only specific lines from the original a transaction.
     */
    Partial(1),

    /** 
     * Only refund the tax part of the transaction.
     */
    TaxOnly(2),

    /** 
     * Refund a percentage of the value of this transaction.
     */
    Percentage(3),

    /**
     * Integer value for RefundType
     */
    public final int Value;

    private RefundType(int value) {
		Value = value;
    }
	
	/**
	 * Map RefundType to RefundType integer ID.
	 */
	 private static final Map<Integer, RefundType> _map = new HashMap<Integer, RefundType>();
	 static
	 {
		 for (RefundType modelName : RefundType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get RefundType from value 
	  */
	 public static RefundType from(int value)
	 {
		 return _map.get(value);
	 }
}
