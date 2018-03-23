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
 * This data type is only used when an object must "Match" tax types. By specifying options here,
 *  you can indicate which tax types will match for the purposes of this object.
 *  For example, if you specify BothSalesAndUseTax, this value matches with both sales and seller's use tax.
 */
public enum MatchingTaxType {
    /** 
     * Match medical excise type
     */
    Excise,

    /** 
     * Match Lodging tax type
     */
    Lodging,

    /** 
     * Match bottle tax type
     */
    Bottle,

    /** 
     * Match all tax types
     */
    All,

    /** 
     * Match both Sales and Use Tax only
     */
    BothSalesAndUseTax,

    /** 
     * Match Consumer Use Tax only
     */
    ConsumerUseTax,

    /** 
     * Match both Consumer Use and Seller's Use Tax types
     */
    ConsumersUseAndSellersUseTax,

    /** 
     * Match both Consumer Use and Sales Tax types
     */
    ConsumerUseAndSalesTax,

    /** 
     * Match Fee tax types only
     */
    Fee,

    /** 
     * Match VAT Input Tax only
     */
    VATInputTax,

    /** 
     * Match VAT Nonrecoverable Input Tax only
     */
    VATNonrecoverableInputTax,

    /** 
     * Match VAT Output Tax only
     */
    VATOutputTax,

    /** 
     * Match Rental tax types only
     */
    Rental,

    /** 
     * Match Sales Tax only
     */
    SalesTax,

    /** 
     * Match Seller's Use Tax only
     */
    UseTax,

}
    