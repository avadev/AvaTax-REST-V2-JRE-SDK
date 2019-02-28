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
 * Exempt Cert type
 */
public enum ExemptCertTypeId {
	
    /** 
     * Blanked certificate
     */
    Blanket(0),

    /** 
     * Single use
     */
    SingleUse(1),

    /**
     * Integer value for ExemptCertTypeId
     */
    public final int Value;

    private ExemptCertTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map ExemptCertTypeId to ExemptCertTypeId integer ID.
	 */
	 private static final Map<Integer, ExemptCertTypeId> _map = new HashMap<Integer, ExemptCertTypeId>();
	 static
	 {
		 for (ExemptCertTypeId modelName : ExemptCertTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ExemptCertTypeId from value 
	  */
	 public static ExemptCertTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
