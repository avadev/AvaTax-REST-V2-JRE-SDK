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
public enum AdjustmentReason {
    /** 
     * 
     */
    NotAdjusted(0),

    /** 
     * 
     */
    SourcingIssue(1),

    /** 
     * 
     */
    ReconciledWithGeneralLedger(2),

    /** 
     * 
     */
    ExemptCertApplied(3),

    /** 
     * 
     */
    PriceAdjusted(4),

    /** 
     * 
     */
    ProductReturned(5),

    /** 
     * 
     */
    ProductExchanged(6),

    /** 
     * 
     */
    BadDebt(7),

    /** 
     * 
     */
    Other(8),

    /** 
     * 
     */
    Offline(9);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private AdjustmentReason(int value) {
		this.value = value;
	}
	
	static {
		for (AdjustmentReason enumName : AdjustmentReason.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static AdjustmentReason valueOf(int intValue) {
		return (AdjustmentReason) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
