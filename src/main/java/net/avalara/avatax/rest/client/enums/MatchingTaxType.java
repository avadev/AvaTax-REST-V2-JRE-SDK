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
    Excise(5),

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
     * Match VAT Nonrecoverable Input Tax only
     */
    VATNonrecoverableInputTax(78),

    /** 
     * Match VAT Output Tax only
     */
    VATOutputTax(79),

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
    UseTax(85);

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
