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
 * Represents the type of service or subscription given to a user
 */
public enum ServiceTypeId {
	
    /** 
     * None
     */
    None(0),

    /** 
     * AvaTaxST
     */
    AvaTaxST(1),

    /** 
     * AvaTaxPro
     */
    AvaTaxPro(2),

    /** 
     * AvaTaxGlobal
     */
    AvaTaxGlobal(3),

    /** 
     * AutoAddress
     */
    AutoAddress(4),

    /** 
     * AutoReturns
     */
    AutoReturns(5),

    /** 
     * TaxSolver
     */
    TaxSolver(6),

    /** 
     * AvaTaxCsp
     */
    AvaTaxCsp(7),

    /** 
     * Twe
     */
    Twe(8),

    /** 
     * Mrs
     */
    Mrs(9),

    /** 
     * AvaCert
     */
    AvaCert(10),

    /** 
     * AuthorizationPartner
     */
    AuthorizationPartner(11),

    /** 
     * CertCapture
     */
    CertCapture(12),

    /** 
     * AvaUpc
     */
    AvaUpc(13),

    /** 
     * AvaCUT
     */
    AvaCUT(14),

    /** 
     * AvaLandedCost
     */
    AvaLandedCost(15),

    /** 
     * AvaLodging
     */
    AvaLodging(16),

    /** 
     * AvaBottle
     */
    AvaBottle(17),

    /** 
     * AvaComms
     */
    AvaComms(18),

    /** 
     * AvaEWaste
     */
    AvaEWaste(19),

    /** 
     * AvaExemptTier1
     */
    AvaExemptTier1(20),

    /** 
     * AvaExemptTier2
     */
    AvaExemptTier2(21),

    /** 
     * AvaExemptTier3
     */
    AvaExemptTier3(22),

    /** 
     * AvaExemptTier4
     */
    AvaExemptTier4(23),

    /** 
     * MRSComplianceManager
     */
    MRSComplianceManager(24),

    /** 
     * AvaBikeTax
     */
    AvaBikeTax(25),

    /** 
     * AvaCheckoutBag
     */
    AvaCheckoutBag(26),

    /** 
     * TFOCompliance
     */
    TFOCompliance(27),

    /** 
     * Send Sales Rate file service
     */
    SendSalesRateFile(28),

    private int value;
	private static Map map = new HashMap<>();
	
	private ServiceTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (ServiceTypeId enumName : ServiceTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ServiceTypeId valueOf(int intValue) {
		return (ServiceTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
