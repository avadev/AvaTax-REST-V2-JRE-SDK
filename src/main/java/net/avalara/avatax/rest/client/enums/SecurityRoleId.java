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
public enum SecurityRoleId {
    /** 
     * 
     */
    NoAccess(0),

    /** 
     * 
     */
    SiteAdmin(1),

    /** 
     * 
     */
    AccountOperator(2),

    /** 
     * 
     */
    AccountAdmin(3),

    /** 
     * 
     */
    AccountUser(4),

    /** 
     * 
     */
    SystemAdmin(5),

    /** 
     * 
     */
    Registrar(6),

    /** 
     * 
     */
    CSPTester(7),

    /** 
     * 
     */
    CSPAdmin(8),

    /** 
     * 
     */
    SystemOperator(9),

    /** 
     * 
     */
    TechnicalSupportUser(10),

    /** 
     * 
     */
    TechnicalSupportAdmin(11),

    /** 
     * 
     */
    TreasuryUser(12),

    /** 
     * 
     */
    TreasuryAdmin(13),

    /** 
     * 
     */
    ComplianceUser(14),

    /** 
     * 
     */
    ComplianceAdmin(15),

    /** 
     * 
     */
    ProStoresOperator(16),

    /** 
     * 
     */
    CompanyUser(17),

    /** 
     * 
     */
    CompanyAdmin(18),

    /** 
     * 
     */
    ComplianceTempUser(19),

    /** 
     * 
     */
    ComplianceRootUser(20),

    /** 
     * 
     */
    ComplianceOperator(21),

    /** 
     * 
     */
    SSTAdmin(22),

    /** 
     * 
     */
    FirmUser(23),

    /** 
     * 
     */
    FirmAdmin(24);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private SecurityRoleId(int value) {
		this.value = value;
	}
	
	static {
		for (SecurityRoleId enumName : SecurityRoleId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static SecurityRoleId valueOf(int intValue) {
		return (SecurityRoleId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
