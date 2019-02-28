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
 * The way of delivering request
 */
public enum CertificateRequestDeliveryMethod {
    /** 
     * The invitation will be sent via email to the recipient's email address.
     */
    Email(1),

    /** 
     * The invitation will be sent via facsimile to the recipient's facsimile phone number.
     *  
     *  Facsimile transmission make take time to process and deliver via phone lines.
     */
    Fax(2),

    /** 
     * The request will be processed and turned into a web link (URL) which the user can click on to visit the CertExpress site and immediately
     *  begin entering data about their certificates.
     */
    Download(3),

    private int value;
	private static Map map = new HashMap<>();
	
	private CertificateRequestDeliveryMethod(int value) {
		this.value = value;
	}
	
	static {
		for (CertificateRequestDeliveryMethod enumName : CertificateRequestDeliveryMethod.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CertificateRequestDeliveryMethod valueOf(int intValue) {
		return (CertificateRequestDeliveryMethod) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
