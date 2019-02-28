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
 * Type of verification task
 */
public enum ScraperType {
	
    /** 
     * Indicates that is is a login type
     */
    Login(1),

    /** 
     * Indicates that it is a Customer DOR Data type
     */
    CustomerDorData(2),

    /**
     * Integer value for ScraperType
     */
    public final int Value;

    private ScraperType(int value) {
		Value = value;
    }
	
	/**
	 * Map ScraperType to ScraperType integer ID.
	 */
	 private static final Map<Integer, ScraperType> _map = new HashMap<Integer, ScraperType>();
	 static
	 {
		 for (ScraperType modelName : ScraperType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ScraperType from value 
	  */
	 public static ScraperType from(int value)
	 {
		 return _map.get(value);
	 }
}
