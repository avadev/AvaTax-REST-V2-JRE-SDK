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
 * Describes nexus type id
 */
public enum LocalNexusTypeId {
	
    /** 
     * Only the specific nexus objects declared for this company are declared.
     */
    Selected(0),

    /** 
     * Customer declares nexus in all state administered taxing authorities.
     *  
     *  This value only takes effect if you set `hasLocalNexus` = true.
     */
    StateAdministered(1),

    /** 
     * Customer declares nexus in all local taxing authorities. 
     *  
     *  This value only takes effect if you set `hasLocalNexus` = true.
     */
    All(2),

    /**
     * Integer value for LocalNexusTypeId
     */
    public final int Value;

    private LocalNexusTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map LocalNexusTypeId to LocalNexusTypeId integer ID.
	 */
	 private static final Map<Integer, LocalNexusTypeId> _map = new HashMap<Integer, LocalNexusTypeId>();
	 static
	 {
		 for (LocalNexusTypeId modelName : LocalNexusTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get LocalNexusTypeId from value 
	  */
	 public static LocalNexusTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
