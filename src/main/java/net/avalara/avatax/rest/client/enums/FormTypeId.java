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
    SalesAndUse,

    /** 
     * Denotes the form type is Sales Tax only
     */
    Sales,

    /** 
     * Denotes the form type is Sellers Use Tax only
     */
    SellersUse,

    /** 
     * Denotes the form type is Lodging Tax only
     */
    Lodging,

    /** 
     * Denotes the form type is Sales and Lodging Tax
     */
    SalesAndLodging,

    /** 
     * Denotes the form type is Consumer Use Tax only
     */
    ConsumerUse,

    /** 
     * Denotes the form type is Resort and Rental Tax
     */
    ResortAndRental,

    /** 
     * Denotes the form type is Tourist and Rental Tax
     */
    TouristAndRental,

    /** 
     * Denotes the form type is Prepayment
     */
    Prepayment,

}
    