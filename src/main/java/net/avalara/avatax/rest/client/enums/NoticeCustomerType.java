package net.avalara.avatax.rest.client.enums;
import java.util.HashMap;

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
 * Swagger name: AvaTaxClient
 */

/**
 * 
 */
public enum NoticeCustomerType {
    /** 
     * 
     */
    AvaTaxReturns(1),

    /** 
     * 
     */
    StandAlone(2),

    /** 
     * 
     */
    Strategic(3),

    /** 
     * 
     */
    SST(4),

    /** 
     * 
     */
    TrustFile(5),

    /** 
     * 
     */
    PWC(6),

    /** 
     * 
     */
    HudsonGroup(7),

    /** 
     * 
     */
    MRA(8),

    /** 
     * 
     */
    None(9);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private NoticeCustomerType(int value) {
		this.value = value;
	}
	
	static {
		for (NoticeCustomerType enumName : NoticeCustomerType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static NoticeCustomerType valueOf(int intValue) {
		return (NoticeCustomerType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
