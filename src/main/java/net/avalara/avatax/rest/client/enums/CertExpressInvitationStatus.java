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
 * Indicates the status of a CertExpress invitation link.
 */
public enum CertExpressInvitationStatus {
	
    /** 
     * The CertExpress website is currently building a landing page for the customer. Please
     *  wait about 10 seconds and fetch this request again to see when it will be ready.
     */
    InProgress(0),

    /** 
     * Indicates that the CertExpress invitation has been completed and is ready to use.
     */
    Ready(1),

    /**
     * Integer value for CertExpressInvitationStatus
     */
    public final int Value;

    private CertExpressInvitationStatus(int value) {
		Value = value;
    }
	
	/**
	 * Map CertExpressInvitationStatus to CertExpressInvitationStatus integer ID.
	 */
	 private static final Map<Integer, CertExpressInvitationStatus> _map = new HashMap<Integer, CertExpressInvitationStatus>();
	 static
	 {
		 for (CertExpressInvitationStatus modelName : CertExpressInvitationStatus.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get CertExpressInvitationStatus from value 
	  */
	 public static CertExpressInvitationStatus from(int value)
	 {
		 return _map.get(value);
	 }
}
