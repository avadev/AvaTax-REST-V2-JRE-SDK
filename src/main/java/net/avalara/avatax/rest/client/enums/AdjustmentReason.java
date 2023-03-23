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
 * Indicates the type of adjustment that was performed on a transaction
 */
public enum AdjustmentReason {
    /** 
     * The transaction has not been adjusted
     */
    NotAdjusted(0),

    /** 
     * A sourcing issue existed which caused the transaction to be adjusted
     */
    SourcingIssue(1),

    /** 
     * Transaction was adjusted to reconcile it with a general ledger
     */
    ReconciledWithGeneralLedger(2),

    /** 
     * Transaction was adjusted after an exemption certificate was applied
     */
    ExemptCertApplied(3),

    /** 
     * Transaction was adjusted when the price of an item changed
     */
    PriceAdjusted(4),

    /** 
     * Transaction was adjusted due to a product return
     */
    ProductReturned(5),

    /** 
     * Transaction was adjusted due to a product exchange
     */
    ProductExchanged(6),

    /** 
     * Transaction was adjusted due to bad or uncollectable debt
     */
    BadDebt(7),

    /** 
     * Transaction was adjusted for another reason not specified
     */
    Other(8),

    /** 
     * Offline
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
