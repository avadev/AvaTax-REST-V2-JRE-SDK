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
    EfileCheck(6),

    /**
     * Integer value for FilingTypeId
     */
    public final int Value;

    private FilingTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map FilingTypeId to FilingTypeId integer ID.
	 */
	 private static final Map<Integer, FilingTypeId> _map = new HashMap<Integer, FilingTypeId>();
	 static
	 {
		 for (FilingTypeId modelName : FilingTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get FilingTypeId from value 
	  */
	 public static FilingTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
