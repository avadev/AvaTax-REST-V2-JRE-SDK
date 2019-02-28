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
 * Exempt certificate review status
 */
public enum ExemptCertReviewStatusId {
	
    /** 
     * Review pending
     */
    Pending(0),

    /** 
     * Certificate was accepted
     */
    Accepted(1),

    /** 
     * Certificate was rejected
     */
    Rejected(2),

    /**
     * Integer value for ExemptCertReviewStatusId
     */
    public final int Value;

    private ExemptCertReviewStatusId(int value) {
		Value = value;
    }
	
	/**
	 * Map ExemptCertReviewStatusId to ExemptCertReviewStatusId integer ID.
	 */
	 private static final Map<Integer, ExemptCertReviewStatusId> _map = new HashMap<Integer, ExemptCertReviewStatusId>();
	 static
	 {
		 for (ExemptCertReviewStatusId modelName : ExemptCertReviewStatusId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ExemptCertReviewStatusId from value 
	  */
	 public static ExemptCertReviewStatusId from(int value)
	 {
		 return _map.get(value);
	 }
}
