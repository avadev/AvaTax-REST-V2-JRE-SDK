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
 * PasswordStatusId
 */
public enum PasswordStatusId {
	
    /** 
     * UserCannotChange
     */
    UserCannotChange(0),

    /** 
     * UserCanChange
     */
    UserCanChange(1),

    /** 
     * UserMustChange
     */
    UserMustChange(2),

    /**
     * Integer value for PasswordStatusId
     */
    public final int Value;

    private PasswordStatusId(int value) {
		Value = value;
    }
	
	/**
	 * Map PasswordStatusId to PasswordStatusId integer ID.
	 */
	 private static final Map<Integer, PasswordStatusId> _map = new HashMap<Integer, PasswordStatusId>();
	 static
	 {
		 for (PasswordStatusId modelName : PasswordStatusId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get PasswordStatusId from value 
	  */
	 public static PasswordStatusId from(int value)
	 {
		 return _map.get(value);
	 }
}
