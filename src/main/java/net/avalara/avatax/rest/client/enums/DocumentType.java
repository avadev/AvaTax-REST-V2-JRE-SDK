package net.avalara.avatax.rest.client.enums;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.6.0-85
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Document Types
 */
public enum DocumentType {
    /** 
     * Sales Order, estimate or quote (default). This is a temporary document type and is not saved in tax history.
     */
    SalesOrder,

    /** 
     * Sales Invoice
     */
    SalesInvoice,

    /** 
     * Purchase order, estimate, or quote. This is a temporary document type and is not saved in tax history.
     */
    PurchaseOrder,

    /** 
     * Purchase Invoice
     */
    PurchaseInvoice,

    /** 
     * Sales Return Order. This is a temporary document type and is not saved in tax history.
     */
    ReturnOrder,

    /** 
     * Sales Return Invoice
     */
    ReturnInvoice,

    /** 
     * InventoryTransferOrder
     */
    InventoryTransferOrder,

    /** 
     * InventoryTransferInvoice
     */
    InventoryTransferInvoice,

    /** 
     * ReverseChargeOrder
     */
    ReverseChargeOrder,

    /** 
     * ReverseChargeInvoice
     */
    ReverseChargeInvoice,

    /** 
     * No particular type
     */
    Any,

}
    