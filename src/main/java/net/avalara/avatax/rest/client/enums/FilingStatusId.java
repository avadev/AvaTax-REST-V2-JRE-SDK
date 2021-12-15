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
public enum FilingStatusId {
    /** 
     * 
     */
    PendingApproval(0),

    /** 
     * 
     */
    Dirty(1),

    /** 
     * 
     */
    ApprovedToFile(2),

    /** 
     * 
     */
    PendingFiling(3),

    /** 
     * 
     */
    PendingFilingOnBehalf(4),

    /** 
     * 
     */
    Filed(5),

    /** 
     * 
     */
    FiledOnBehalf(6),

    /** 
     * 
     */
    ReturnAccepted(7),

    /** 
     * 
     */
    ReturnAcceptedOnBehalf(8),

    /** 
     * 
     */
    PaymentRemitted(9),

    /** 
     * 
     */
    Voided(10),

    /** 
     * 
     */
    PendingReturn(11),

    /** 
     * 
     */
    PendingReturnOnBehalf(12),

    /** 
     * 
     */
    DoNotFile(13),

    /** 
     * 
     */
    ReturnRejected(14),

    /** 
     * 
     */
    ReturnRejectedOnBehalf(15),

    /** 
     * 
     */
    ApprovedToFileOnBehalf(16);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private FilingStatusId(int value) {
		this.value = value;
	}
	
	static {
		for (FilingStatusId enumName : FilingStatusId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static FilingStatusId valueOf(int intValue) {
		return (FilingStatusId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
