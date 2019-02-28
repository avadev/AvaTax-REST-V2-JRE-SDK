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
 * Type of file request
 */
public enum PointOfSaleFileType {
	
    /** 
     * File is in Javascript Object Notation format
     */
    Json(0),

    /** 
     * File is in Comma Separated Values format
     */
    Csv(1),

    /** 
     * File is in Extended Markup Language format
     */
    Xml(2),

    /**
     * Integer value for PointOfSaleFileType
     */
    public final int Value;

    private PointOfSaleFileType(int value) {
		Value = value;
    }
	
	/**
	 * Map PointOfSaleFileType to PointOfSaleFileType integer ID.
	 */
	 private static final Map<Integer, PointOfSaleFileType> _map = new HashMap<Integer, PointOfSaleFileType>();
	 static
	 {
		 for (PointOfSaleFileType modelName : PointOfSaleFileType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get PointOfSaleFileType from value 
	  */
	 public static PointOfSaleFileType from(int value)
	 {
		 return _map.get(value);
	 }
}
