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
 * The type of address represented by this object
 */
public enum AddressCategoryId {
    /** 
     * Address refers to a storefront location
     */
    Storefront,

    /** 
     * Address refers to a main office of this company
     */
    MainOffice,

    /** 
     * Address refers to a warehouse or other non-public location
     */
    Warehouse,

    /** 
     * Address refers to a location for a single salesperson
     */
    Salesperson,

    /** 
     * Address is a type not reflected in the other lists
     */
    Other,

    /** 
     * The marketplace vendor does not collect and remit tax for transactions tied to this
     *  location. Use this option if you are using a marketplace vendor to handle your transactions
     *  and your company is responsible for collecting and remitting all taxes for transactions tied
     *  to this location.
     */
    SellerRemitsTax,

    /** 
     * The marketplace vendor collects and remits tax on your behalf for all transactions tied
     *  to this location. Use this option if your marketplace vendor already pays sales and use
     *  taxes on your behalf. When this option is selected, all transactions tied to this location
     *  will be treated as already filed, and will be listed on each sales tax return as amounts
     *  already paid.
     */
    MarketplaceRemitsTax,

}
    