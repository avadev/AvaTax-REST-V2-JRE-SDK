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
 * /// The user can set some tolerance or threshold limits inorder to take appropriate actions when
 *  their transactions are above or below certain threshold limits.
 *  Account Payable (AP) status code indicates an action that needs to be taken when the tolerance/threshold falls between certain range.
 */
public enum APStatus {
    /** 
     * 
     */
    NoAccrualMatch(0),

    /** 
     * 
     */
    AccruedShortPayItemsMatch(1),

    /** 
     * 
     */
    NeedReviewMatch(2),

    /** 
     * 
     */
    NoAccrualRejectMatch(3),

    /** 
     * 
     */
    NoAccrualUndercharge(4),

    /** 
     * 
     */
    AccruedUndercharge(5),

    /** 
     * 
     */
    AccruedShortPayItemsUndercharge(6),

    /** 
     * 
     */
    NeedReviewUndercharge(7),

    /** 
     * 
     */
    NoAccrualRejectUndercharge(8),

    /** 
     * 
     */
    NoAccrualOvercharge(9),

    /** 
     * 
     */
    NoAccrualShortPayAvalaraCalculated(10),

    /** 
     * 
     */
    AccruedShortPayItemsOvercharge(11),

    /** 
     * 
     */
    NeedReviewOvercharge(12),

    /** 
     * 
     */
    NoAccrualRejectOvercharge(13),

    /** 
     * 
     */
    NoAccrualAmountThresholdNotMet(14),

    /** 
     * 
     */
    NoAccrualExemptedCostCenter(15),

    /** 
     * 
     */
    NoAccrualExemptedItem(16),

    /** 
     * 
     */
    NoAccrualTrustedVendor(17),

    /** 
     * 
     */
    AccruedVendor(18),

    /** 
     * 
     */
    NeedReviewVendor(19),

    /** 
     * 
     */
    NoAccrualExemptedVendor(20),

    /** 
     * 
     */
    NoAccrualExemptedGLAccount(21),

    /** 
     * 
     */
    PendingAccrualVendor(22),

    /** 
     * 
     */
    PendingAccrualUndercharge(23),

    /** 
     * 
     */
    PendingShortPayItemsUndercharge(24),

    /** 
     * 
     */
    PendingShortPayItemsMatch(25),

    /** 
     * 
     */
    PendingShortPayItemsOvercharge(26),

    /** 
     * 
     */
    NoAccrualExemptedMapping(27),

    /** 
     * 
     */
    ShortPayItemsAccrueMatch(-1),

    /** 
     * 
     */
    MarkForReviewMatch(-1),

    /** 
     * 
     */
    RejectMatch(-1),

    /** 
     * 
     */
    ShortPayItemsAccrueUndercharge(-1),

    /** 
     * 
     */
    RejectUndercharge(-1),

    /** 
     * 
     */
    ShortPayAvalaraCalculated(-1),

    /** 
     * 
     */
    ShortPayItemsAccrueOvercharge(-1),

    /** 
     * 
     */
    MarkForReviewOvercharge(-1),

    /** 
     * 
     */
    RejectOvercharge(-1);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private APStatus(int value) {
		this.value = value;
	}
	
	static {
		for (APStatus enumName : APStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static APStatus valueOf(int intValue) {
		return (APStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
