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
 * Identifier for the specific varieties of component behavior.
 *  The subtype determines the expected format of a component's data property.
 */
public enum DynamicRuleComponentSubtype {
    /** 
     * An unknown or uninitialized subtype.
     */
    Unknown(0),

    /** 
     * Unspecified condition.
     */
    Condition(1),

    /** 
     * Compares two arbitrary expressions.
     */
    MatchExpression(2),

    /** 
     * Compares a field against one or more specific values.
     */
    MatchField(3),

    /** 
     * Matches based on the customer code.
     */
    MatchCustomerCode(4),

    /** 
     * Matches based on the document type.
     */
    MatchDocumentType(5),

    /** 
     * Matches based on a user-defined field.
     */
    MatchUserDefinedField(6),

    /** 
     * Matches based on a parameter.
     */
    MatchParameter(7),

    /** 
     * Matches based on tax override information.
     */
    MatchTaxOverride(8),

    /** 
     * Matches based on address information.
     */
    MatchAddress(9),

    /** 
     * Matches based on the tariff code.
     */
    MatchTariffCode(10),

    /** 
     * Matches based on the tax code.
     */
    MatchTaxCode(11),

    /** 
     * Matches based on jurisdiction and tax applicability.
     */
    MatchTax(12),

    /** 
     * Matches based on jurisdiction and a custom tax type and subtype.
     */
    CustomTax(13),

    /** 
     * Matches based on address jurisdictions.
     */
    MatchJurisdiction(14),

    /** 
     * Matches based on the entity use code.
     */
    MatchEntityUseCode(15),

    /** 
     * Unspecified action.
     */
    Action(256),

    /** 
     * Updates a transaction field with a value.
     */
    UpdateField(257),

    /** 
     * Copies a value from one field to another.
     */
    CopyField(258),

    /** 
     * Updates address-related fields.
     */
    UpdateAddress(259),

    /** 
     * Copies address values between address types.
     */
    CopyAddress(260),

    /** 
     * Updates a parameter value.
     */
    UpdateParameter(261),

    /** 
     * Updates a user-defined field value.
     */
    UpdateUserDefinedField(262),

    /** 
     * Updates a tax override value.
     */
    UpdateTaxOverride(263),

    /** 
     * Updates the location code.
     */
    UpdateLocationCode(264),

    /** 
     * Updates the marketplace location code.
     */
    UpdateMarketplace(265),

    /** 
     * Allocates values based on a field.
     */
    AllocateByField(266),

    /** 
     * Allocates values based on an address.
     */
    AllocateByAddress(267),

    /** 
     * Allocates consumer use tax.
     */
    AllocateConsumerUse(268),

    /** 
     * Aggregates line values post-allocation.
     */
    AggregateLines(269),

    /** 
     * Overrides the tax rate.
     */
    TaxRuleRateOverride(270),

    /** 
     * Overrides the taxable base.
     */
    TaxRuleBaseOverride(271),

    /** 
     * Overrides product taxability.
     */
    TaxRuleProductTaxability(272),

    /** 
     * Updates an exemption stauts.
     */
    TaxRuleExemptEntity(273),

    /** 
     * Unspecified variable.
     */
    Variable(512),

    /** 
     * Named expression.
     */
    Expression(513),

    /** 
     * Named aggregation computation.
     */
    Aggregation(514);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private DynamicRuleComponentSubtype(int value) {
		this.value = value;
	}
	
	static {
		for (DynamicRuleComponentSubtype enumName : DynamicRuleComponentSubtype.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static DynamicRuleComponentSubtype valueOf(int intValue) {
		return (DynamicRuleComponentSubtype) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
