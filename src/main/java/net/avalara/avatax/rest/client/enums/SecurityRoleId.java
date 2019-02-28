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
 * Permission level of a user
 */
public enum SecurityRoleId {
    /** 
     * NoAccess
     */
    NoAccess(0),

    /** 
     * SiteAdmin
     */
    SiteAdmin(1),

    /** 
     * AccountOperator
     */
    AccountOperator(2),

    /** 
     * AccountAdmin
     */
    AccountAdmin(3),

    /** 
     * AccountUser
     */
    AccountUser(4),

    /** 
     * SystemAdmin
     */
    SystemAdmin(5),

    /** 
     * Registrar
     */
    Registrar(6),

    /** 
     * CSPTester
     */
    CSPTester(7),

    /** 
     * CSPAdmin
     */
    CSPAdmin(8),

    /** 
     * SystemOperator
     */
    SystemOperator(9),

    /** 
     * TechnicalSupportUser
     */
    TechnicalSupportUser(10),

    /** 
     * TechnicalSupportAdmin
     */
    TechnicalSupportAdmin(11),

    /** 
     * TreasuryUser
     */
    TreasuryUser(12),

    /** 
     * TreasuryAdmin
     */
    TreasuryAdmin(13),

    /** 
     * ComplianceUser
     */
    ComplianceUser(14),

    /** 
     * ComplianceAdmin
     */
    ComplianceAdmin(15),

    /** 
     * ProStoresOperator
     */
    ProStoresOperator(16),

    /** 
     * CompanyUser
     */
    CompanyUser(17),

    /** 
     * CompanyAdmin
     */
    CompanyAdmin(18),

    /** 
     * ComplianceTempUser
     */
    ComplianceTempUser(19),

    /** 
     * ComplianceRootUser
     */
    ComplianceRootUser(20),

    /** 
     * ComplianceOperator
     */
    ComplianceOperator(21),

    /** 
     * SSTAdmin
     */
    SSTAdmin(22);

    private int value;
	private static Map map = new HashMap<>();
	
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
