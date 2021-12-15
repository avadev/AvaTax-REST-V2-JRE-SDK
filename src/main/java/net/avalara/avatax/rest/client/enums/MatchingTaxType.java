package net.avalara.avatax.rest.client.enums;
import java.util.HashMap;

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
 * Swagger name: AvaTaxClient
 */

/**
 * 
 */
public enum MatchingTaxType {
    /** 
     * 
     */
    E(5),

    /** 
     * 
     */
    Lodging(6),

    /** 
     * 
     */
    Bottle(7),

    /** 
     * 
     */
    RentToOwn(8),

    /** 
     * 
     */
    BikeTax(11),

    /** 
     * 
     */
    LandedCost(12),

    /** 
     * 
     */
    CheckoutBag(13),

    /** 
     * 
     */
    Alcohol(17),

    /** 
     * 
     */
    Amusement(20),

    /** 
     * 
     */
    Hospitality(21),

    /** 
     * 
     */
    RentalLeasing(23),

    /** 
     * 
     */
    GrossReceipts(24),

    /** 
     * 
     */
    Mattress(25),

    /** 
     * 
     */
    Lumber(27),

    /** 
     * 
     */
    Paint(28),

    /** 
     * 
     */
    Tires(29),

    /** 
     * 
     */
    EI(30),

    /** 
     * 
     */
    All(65),

    /** 
     * 
     */
    BothSalesAndUseTax(66),

    /** 
     * 
     */
    ConsumerUseTax(67),

    /** 
     * 
     */
    ConsumersUseAndSellersUseTax(68),

    /** 
     * 
     */
    ConsumerUseAndSalesTax(69),

    /** 
     * 
     */
    Fee(70),

    /** 
     * 
     */
    VATInputTax(73),

    /** 
     * 
     */
    LightBulbs(76),

    /** 
     * 
     */
    Meals(77),

    /** 
     * 
     */
    VATNonrecoverableInputTax(78),

    /** 
     * 
     */
    VATOutputTax(79),

    /** 
     * 
     */
    PIF(80),

    /** 
     * 
     */
    Rental(82),

    /** 
     * 
     */
    SalesTax(83),

    /** 
     * 
     */
    UseTax(85),

    /** 
     * 
     */
    EWaste(87),

    /** 
     * 
     */
    Batteries(90);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private MatchingTaxType(int value) {
		this.value = value;
	}
	
	static {
		for (MatchingTaxType enumName : MatchingTaxType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static MatchingTaxType valueOf(int intValue) {
		return (MatchingTaxType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
