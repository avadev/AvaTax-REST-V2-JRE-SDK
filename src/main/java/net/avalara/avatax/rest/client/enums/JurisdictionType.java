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
 * Jurisdiction Type
 */
public enum JurisdictionType {
	
    /** 
     * Country
     */
    Country(0),

    /** 
     * State
     */
    State(1),

    /** 
     * County
     */
    County(2),

    /** 
     * City
     */
    City(3),

    /** 
     * Special Tax Jurisdiction
     */
    Special(4),

    /**
     * Integer value for JurisdictionType
     */
    public final int Value;

    private JurisdictionType(int value) {
		Value = value;
    }
	
	/**
	 * Map JurisdictionType to JurisdictionType integer ID.
	 */
	 private static final Map<Integer, JurisdictionType> _map = new HashMap<Integer, JurisdictionType>();
	 static
	 {
		 for (JurisdictionType modelName : JurisdictionType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get JurisdictionType from value 
	  */
	 public static JurisdictionType from(int value)
	 {
		 return _map.get(value);
	 }
}
