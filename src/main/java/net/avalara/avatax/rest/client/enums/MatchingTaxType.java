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
 * This data type is only used when an object must "Match" tax types. By specifying options here,
 *  you can indicate which tax types will match for the purposes of this object.
 *  For example, if you specify BothSalesAndUseTax, this value matches with both sales and seller's use tax.
 */
public enum MatchingTaxType {
    /** 
     * Match medical excise type
     */
    E(5),

    /** 
     * Match Lodging tax type
     */
    Lodging(6),

    /** 
     * Match bottle tax type
     */
    Bottle(7),

    /** 
     * Match RentToOwn tax type
     */
    RentToOwn(8),

    /** 
     * BikeTax tax type
     */
    BikeTax(11),

    /** 
     * LandedCost tax type
     */
    LandedCost(12),

    /** 
     * CheckoutBag tax type
     */
    CheckoutBag(13),

    /** 
     * Alcohol tax type
     */
    Alcohol(17),

    /** 
     * Amusement tax type
     */
    Amusement(20),

    /** 
     * Hospitality tax type
     */
    Hospitality(21),

    /** 
     * RentalLeasing tax type
     */
    RentalLeasing(23),

    /** 
     * GrossReceipts tax type
     */
    GrossReceipts(24),

    /** 
     * Mattress tax type
     */
    Mattress(25),

    /** 
     * Lumber tax type
     */
    Lumber(27),

    /** 
     * Paint tax type
     */
    Paint(28),

    /** 
     * Tires tax type
     */
    Tires(29),

    /** 
     * Economic Incentive tax type
     */
    EI(30),

    /** 
     * Match all tax types
     */
    All(65),

    /** 
     * Match both Sales and Use Tax only
     */
    BothSalesAndUseTax(66),

    /** 
     * Match Consumer Use Tax only
     */
    ConsumerUseTax(67),

    /** 
     * Match both Consumer Use and Seller's Use Tax types
     */
    ConsumersUseAndSellersUseTax(68),

    /** 
     * Match both Consumer Use and Sales Tax types
     */
    ConsumerUseAndSalesTax(69),

    /** 
     * Match Fee tax types only
     */
    Fee(70),

    /** 
     * Match VAT Input Tax only
     */
    VATInputTax(73),

    /** 
     * LightBulbs tax type
     */
    LightBulbs(76),

    /** 
     * Meals tax type
     */
    Meals(77),

    /** 
     * Match VAT Nonrecoverable Input Tax only
     */
    VATNonrecoverableInputTax(78),

    /** 
     * Match VAT Output Tax only
     */
    VATOutputTax(79),

    /** 
     * PIF tax type
     */
    PIF(80),

    /** 
     * Match Rental tax types only
     */
    Rental(82),

    /** 
     * Match Sales Tax only
     */
    SalesTax(83),

    /** 
     * Match Seller's Use Tax only
     */
    UseTax(85),

    /** 
     * EWaste tax type
     */
    EWaste(87),

    /** 
     * Batteries tax type
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
