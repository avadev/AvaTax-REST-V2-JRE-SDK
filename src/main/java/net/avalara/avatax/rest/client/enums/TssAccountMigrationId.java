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
public enum TssAccountMigrationId {
    /** 
     * 
     */
    BothWithoutRollbackReadFromSql(0),

    /** 
     * 
     */
    BothWithRollbackReadFromTss(1),

    /** 
     * 
     */
    SQLOnly(2),

    /** 
     * 
     */
    TSSOnly(3),

    /** 
     * 
     */
    ReadOnly(4);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private TssAccountMigrationId(int value) {
		this.value = value;
	}
	
	static {
		for (TssAccountMigrationId enumName : TssAccountMigrationId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static TssAccountMigrationId valueOf(int intValue) {
		return (TssAccountMigrationId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
