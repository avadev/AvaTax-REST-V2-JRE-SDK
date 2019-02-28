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
 * A list of possible AvaFile filing types.
 */
public enum FilingTypeId {
    /** 
     * Denotes the tax return is being filed on paper.
     */
    PaperReturn(0),

    /** 
     * Denotes the tax return is being filed via electronic means; excludes SST electronic filing.
     */
    ElectronicReturn(1),

    /** 
     * Denotes the tax return is an SST filing.
     */
    SER(2),

    /** 
     * Denotes a return is paid via EFT and filed on paper without payment.
     */
    EFTPaper(3),

    /** 
     * Denotes a return is paid via phone and filed on paper without payment.
     */
    PhonePaper(4),

    /** 
     * Denotes a return is prepared but delivered to the customer for filing and payment.
     */
    SignatureReady(5),

    /** 
     * Denotes a return which is filed online but paid by check.
     */
    EfileCheck(6)

    private int value;
	private static Map map = new HashMap<>();
	
	private FilingTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (FilingTypeId enumName : FilingTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static FilingTypeId valueOf(int intValue) {
		return (FilingTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
