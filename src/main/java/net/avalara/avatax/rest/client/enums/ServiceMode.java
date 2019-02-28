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
 * Service modes for tax calculation when using an AvaLocal server.
 */
public enum ServiceMode {
	
    /** 
     * Automatically use local or remote (default)
     */
    Automatic(0),

    /** 
     * Local server only
     */
    Local(1),

    /** 
     * Remote server only
     */
    Remote(2),

    /**
     * Integer value for ServiceMode
     */
    public final int Value;

    private ServiceMode(int value) {
		Value = value;
    }
	
	/**
	 * Map ServiceMode to ServiceMode integer ID.
	 */
	 private static final Map<Integer, ServiceMode> _map = new HashMap<Integer, ServiceMode>();
	 static
	 {
		 for (ServiceMode modelName : ServiceMode.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ServiceMode from value 
	  */
	 public static ServiceMode from(int value)
	 {
		 return _map.get(value);
	 }
}
