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
public enum TaxRuleTypeId {
    /** 
     * 
     */
    RateRule(0),

    /** 
     * 
     */
    RateOverrideRule(1),

    /** 
     * 
     */
    BaseRule(2),

    /** 
     * 
     */
    ExemptEntityRule(3),

    /** 
     * 
     */
    ProductTaxabilityRule(4),

    /** 
     * 
     */
    NexusRule(5),

    /** 
     * 
     */
    RateCapRule(6),

    /** 
     * 
     */
    TaxOverrideRule(7),

    /** 
     * 
     */
    FeeRule(8),

    /** 
     * 
     */
    OtherRule(100);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private TaxRuleTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (TaxRuleTypeId enumName : TaxRuleTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static TaxRuleTypeId valueOf(int intValue) {
		return (TaxRuleTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
