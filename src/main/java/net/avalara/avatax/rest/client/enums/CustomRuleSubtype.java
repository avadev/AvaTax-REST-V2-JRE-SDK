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
 * The subtype of a custom rule
 */
public enum CustomRuleSubtype {
    /** 
     * The unknown rule type
     */
    Unknown(0),

    /** 
     * A product taxability tax rule
     */
    ProductTaxabilityRule(1),

    /** 
     * An exempt entity tax rule
     */
    ExemptEntityRule(2),

    /** 
     * A rate override tax rule
     */
    RateOverrideRule(3),

    /** 
     * A base override tax rule
     */
    BaseOverrideRule(4),

    /** 
     * A Marketplace advanced rule
     */
    Marketplace(5),

    /** 
     * A Bundled Items Allocation advanced rule
     */
    BundledItemsAllocation(6),

    /** 
     * A Multiple Points of Use Allocation advanced rule
     */
    MultiplePointsOfUseAllocation(7),

    /** 
     * A Find and Replace Before Calculationadvanced rule
     */
    FindAndReplaceBeforeCalculation(8),

    /** 
     * A Find and Replace After Calculation advanced rule
     */
    FindAndReplaceAfterCalculation(9),

    /** 
     * A Reporting Location advanced rule
     */
    ReportingLocation(10),

    /** 
     * A Seller Remits Aggregator advanced rule
     */
    SellerRemitsAggregator(11),

    /** 
     * A Consumer Use Allocation advanced rule
     */
    ConsumerUseAllocation(12),

    /** 
     * A Find and Replace Jurisdiction Match advanced rule
     */
    FindAndReplaceJurisdictionMatch(13),

    /** 
     * Updates a transaction field with a value.
     */
    UpdateField(14),

    /** 
     * Copies a value from one field to another.
     */
    CopyField(15),

    /** 
     * Updates address-related fields.
     */
    UpdateAddress(16),

    /** 
     * Copies address values between address types.
     */
    CopyAddress(17),

    /** 
     * Updates a parameter value.
     */
    UpdateParameter(18),

    /** 
     * Updates a user-defined field value.
     */
    UpdateUserDefinedField(19),

    /** 
     * Updates a tax override value.
     */
    UpdateTaxOverride(20),

    /** 
     * Updates the location code.
     */
    UpdateLocationCode(21),

    /** 
     * Updates the marketplace location code.
     */
    UpdateMarketplace(22),

    /** 
     * Allocates values based on a field.
     */
    AllocateByField(23),

    /** 
     * Allocates values based on an address.
     */
    AllocateByAddress(24),

    /** 
     * Allocates consumer use tax.
     */
    AllocateConsumerUse(25),

    /** 
     * Aggregates line values post-allocation.
     */
    AggregateLines(26),

    /** 
     * Overrides the tax rate.
     */
    TaxRuleRateOverride(27),

    /** 
     * Overrides the taxable base.
     */
    TaxRuleBaseOverride(28),

    /** 
     * Overrides product taxability.
     */
    TaxRuleProductTaxability(29),

    /** 
     * Updates an exemption stauts.
     */
    TaxRuleExemptEntity(30),

    /** 
     * Defines one or more custom content rules.
     */
    CustomTax(31);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private CustomRuleSubtype(int value) {
		this.value = value;
	}
	
	static {
		for (CustomRuleSubtype enumName : CustomRuleSubtype.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static CustomRuleSubtype valueOf(int intValue) {
		return (CustomRuleSubtype) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
