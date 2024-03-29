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
 * Comment Types
 */
public enum CommentType {
    /** 
     * Internal comments are those comments only intended to be for compliance users
     */
    Internal(1),

    /** 
     * Customer comments are those comments that both compliance and the customer can read
     */
    Customer(2),

    /** 
     * A comment that has a POA Attachment on it
     */
    POAAttachment(3),

    /** 
     * Used when creating Notice Comments in Returns Console
     */
    NoticeVoucher(4);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CommentType(int value) {
		this.value = value;
	}
	
	static {
		for (CommentType enumName : CommentType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CommentType valueOf(int intValue) {
		return (CommentType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
