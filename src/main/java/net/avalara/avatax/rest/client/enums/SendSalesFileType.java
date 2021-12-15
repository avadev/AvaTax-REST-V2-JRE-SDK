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
public enum SendSalesFileType {
    /** 
     * 
     */
    Csv(0),

    /** 
     * 
     */
    Json(1);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private SendSalesFileType(int value) {
		this.value = value;
	}
	
	static {
		for (SendSalesFileType enumName : SendSalesFileType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static SendSalesFileType valueOf(int intValue) {
		return (SendSalesFileType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
