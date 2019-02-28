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
 * A list of possible AvaFile Form Types.
 */
public enum FormTypeId {
	
    /** 
     * Denotes the form type is Sales and Use Tax
     */
    SalesAndUse(0),

    /** 
     * Denotes the form type is Sales Tax only
     */
    Sales(1),

    /** 
     * Denotes the form type is Sellers Use Tax only
     */
    SellersUse(2),

    /** 
     * Denotes the form type is Lodging Tax only
     */
    Lodging(3),

    /** 
     * Denotes the form type is Sales and Lodging Tax
     */
    SalesAndLodging(4),

    /** 
     * Denotes the form type is Consumer Use Tax only
     */
    ConsumerUse(5),

    /** 
     * Denotes the form type is Resort and Rental Tax
     */
    ResortAndRental(6),

    /** 
     * Denotes the form type is Tourist and Rental Tax
     */
    TouristAndRental(7),

    /** 
     * Denotes the form type is Prepayment
     */
    Prepayment(8),

    /** 
     * Denotes the form type is Prepayment Allowance
     */
    PrepaymentAllowed(9),

    /**
     * Integer value for FormTypeId
     */
    public final int Value;

    private FormTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map FormTypeId to FormTypeId integer ID.
	 */
	 private static final Map<Integer, FormTypeId> _map = new HashMap<Integer, FormTypeId>();
	 static
	 {
		 for (FormTypeId modelName : FormTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get FormTypeId from value 
	  */
	 public static FormTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
