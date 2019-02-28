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
 * Types of jurisdiction referenced in a transaction
 */
public enum JurisTypeId {
	
    /** 
     * State
     */
    STA(1),

    /** 
     * County
     */
    CTY(2),

    /** 
     * City
     */
    CIT(3),

    /** 
     * Special
     */
    STJ(4),

    /** 
     * Country
     */
    CNT(5),

    /**
     * Integer value for JurisTypeId
     */
    public final int Value;

    private JurisTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map JurisTypeId to JurisTypeId integer ID.
	 */
	 private static final Map<Integer, JurisTypeId> _map = new HashMap<Integer, JurisTypeId>();
	 static
	 {
		 for (JurisTypeId modelName : JurisTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get JurisTypeId from value 
	  */
	 public static JurisTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
