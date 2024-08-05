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
public enum BulkImportStatus {
    /** 
     * 
     */
    None(0),

    /** 
     * 
     */
    Success(1),

    /** 
     * 
     */
    Created(2),

    /** 
     * 
     */
    Updated(4),

    /** 
     * 
     */
    NotImported(8),

    /** 
     * 
     */
    Ignored(16),

    /** 
     * 
     */
    Error(32),

    /** 
     * 
     */
    ValidationFailed(64),

    /** 
     * 
     */
    PartialSuccess(128),

    /** 
     * 
     */
    Invalid(256);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private BulkImportStatus(int value) {
		this.value = value;
	}
	
	static {
		for (BulkImportStatus enumName : BulkImportStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static BulkImportStatus valueOf(int intValue) {
		return (BulkImportStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
