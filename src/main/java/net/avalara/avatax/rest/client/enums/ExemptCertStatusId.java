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
 * Status for this exempt certificate
 */
public enum ExemptCertStatusId {
	
    /** 
     * Inactive certificate
     */
    Inactive(0),

    /** 
     * Active certificate
     */
    Active(1),

    /** 
     * Expired certificate
     */
    Expired(2),

    /** 
     * Revoked certificate
     */
    Revoked(3),

    /**
     * Integer value for ExemptCertStatusId
     */
    public final int Value;

    private ExemptCertStatusId(int value) {
		Value = value;
    }
	
	/**
	 * Map ExemptCertStatusId to ExemptCertStatusId integer ID.
	 */
	 private static final Map<Integer, ExemptCertStatusId> _map = new HashMap<Integer, ExemptCertStatusId>();
	 static
	 {
		 for (ExemptCertStatusId modelName : ExemptCertStatusId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ExemptCertStatusId from value 
	  */
	 public static ExemptCertStatusId from(int value)
	 {
		 return _map.get(value);
	 }
}
