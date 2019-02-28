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
 * Reason code for voiding or cancelling a transaction
 */
public enum VoidReasonCode {
	
    /** 
     * Unspecified reason
     */
    Unspecified(0),

    /** 
     * Post operation failed - Document status will be changed to unposted
     */
    PostFailed(1),

    /** 
     * Document deleted - If committed, document status will be changed to Cancelled. If not committed, document will be
     *  deleted.
     */
    DocDeleted(2),

    /** 
     * Document has been voided and DocStatus will be set to Cancelled
     */
    DocVoided(3),

    /** 
     * AdjustTax operation has been cancelled. Adjustment will be reversed.
     */
    AdjustmentCancelled(4),

    /**
     * Integer value for VoidReasonCode
     */
    public final int Value;

    private VoidReasonCode(int value) {
		Value = value;
    }
	
	/**
	 * Map VoidReasonCode to VoidReasonCode integer ID.
	 */
	 private static final Map<Integer, VoidReasonCode> _map = new HashMap<Integer, VoidReasonCode>();
	 static
	 {
		 for (VoidReasonCode modelName : VoidReasonCode.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get VoidReasonCode from value 
	  */
	 public static VoidReasonCode from(int value)
	 {
		 return _map.get(value);
	 }
}
