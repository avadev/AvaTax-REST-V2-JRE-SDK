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
 * 
 */
public enum PointOfSalePartnerId {
	
    /** 
     * 
     */
    DMA(1),

    /** 
     * 
     */
    AX7(2),

    /**
     * Integer value for PointOfSalePartnerId
     */
    public final int Value;

    private PointOfSalePartnerId(int value) {
		Value = value;
    }
	
	/**
	 * Map PointOfSalePartnerId to PointOfSalePartnerId integer ID.
	 */
	 private static final Map<Integer, PointOfSalePartnerId> _map = new HashMap<Integer, PointOfSalePartnerId>();
	 static
	 {
		 for (PointOfSalePartnerId modelName : PointOfSalePartnerId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get PointOfSalePartnerId from value 
	  */
	 public static PointOfSalePartnerId from(int value)
	 {
		 return _map.get(value);
	 }
}
