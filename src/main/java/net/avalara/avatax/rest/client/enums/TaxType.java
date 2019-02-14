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
 * Tax type
 */
public enum TaxType {
    /** 
     * Sales tax
     */
    Sales,

    /** 
     * Use tax
     */
    Use,

    /** 
     * Consumer Use Tax
     */
    ConsumerUse,

    /** 
     * VAT/GST Output tax
     */
    Output,

    /** 
     * VAT/GST Input tax
     */
    Input,

    /** 
     * VAT/GST Nonrecoverable Input tax
     */
    Nonrecoverable,

    /** 
     * Fee - PIFs (Public Improvement Fees) and RSFs (Retail Sales Fees)
     */
    Fee,

    /** 
     * Rental Tax
     */
    Rental,

    /** 
     * Medical Excise Tax
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
     * EWaste tax type
     */
    EWaste,

    /** 
     * LandedCost tax type
     */
    LandedCost,

}
    