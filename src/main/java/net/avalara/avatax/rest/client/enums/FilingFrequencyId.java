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
 * Filing Frequency types
 */
public enum FilingFrequencyId {
	
    /** 
     * File once per month
     */
    Monthly(1),

    /** 
     * File once per three months
     */
    Quarterly(2),

    /** 
     * File twice per year
     */
    SemiAnnually(3),

    /** 
     * File once per year
     */
    Annually(4),

    /** 
     * File every other month
     */
    Bimonthly(5),

    /** 
     * File only when there are documents to report
     */
    Occasional(6),

    /** 
     * File for the first two months of each quarter, then do not file on the quarterly month.
     */
    InverseQuarterly(7),

    /** 
     * File every week
     */
    Weekly(8),

    /**
     * Integer value for FilingFrequencyId
     */
    public final int Value;

    private FilingFrequencyId(int value) {
		Value = value;
    }
	
	/**
	 * Map FilingFrequencyId to FilingFrequencyId integer ID.
	 */
	 private static final Map<Integer, FilingFrequencyId> _map = new HashMap<Integer, FilingFrequencyId>();
	 static
	 {
		 for (FilingFrequencyId modelName : FilingFrequencyId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get FilingFrequencyId from value 
	  */
	 public static FilingFrequencyId from(int value)
	 {
		 return _map.get(value);
	 }
}
