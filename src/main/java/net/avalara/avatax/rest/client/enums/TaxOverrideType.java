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
 * TaxOverride reasons
 */
public enum TaxOverrideType {
    /** 
     * No override
     */
    None,

    /** 
     * Tax was overriden by the client
     */
    TaxAmount,

    /** 
     * Entity exemption was ignored (e.g. item was consumed)
     */
    Exemption,

    /** 
     * Only the tax date was overriden
     */
    TaxDate,

    /** 
     * To support Consumer Use Tax
     */
    AccruedTaxAmount,

    /** 
     * Derive the taxable amount from the tax amount
     */
    DeriveTaxable,

}
    