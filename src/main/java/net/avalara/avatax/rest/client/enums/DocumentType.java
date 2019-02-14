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
 * Represents the different types of transactions that AvaTax can process.
 */
public enum DocumentType {
    /** 
     * Represents an estimate, or a sales order, or a quote. 
     *  
     *  This document type is used before a sale has occurred to estimate the final amount of tax to be paid when the
     *  sale is completed.
     *  
     *  For a sales order, the `companyCode` of the transaction refers to the seller and the `customerVendorCode` refers to the buyer.
     *  
     *  This is a temporary document type and is not saved in tax history.
     */
    SalesOrder,

    /** 
     * Represents a sale that has been finalized.
     *  
     *  This document type is used to record a final transaction and calculate the final tax amount with all necessary information.
     *  
     *  For a sales invoice, the `companyCode` of the transaction refers to the seller and the `customerVendorCode` refers to the buyer.
     *  
     *  This is a permanent document and is recorded in AvaTax.
     */
    SalesInvoice,

    /** 
     * Represents an estimate, or a purchase order, or a quote.
     *  
     *  This document type is used before a sale has occurred to estimate the final amount of tax to be paid when the
     *  sale is completed.
     *  
     *  For a purchase order, the `companyCode` of the transaction refers to the buyer and the `customerVendorCode` refers to the seller.
     *  
     *  This is a temporary document type and is not saved in tax history.
     */
    PurchaseOrder,

    /** 
     * Represents a sale that has been finalized.
     *  
     *  This document type is used to record a final transaction and calculate the final tax amount with all necessary information.
     *  
     *  For a purchase invoice, the `companyCode` of the transaction refers to the buyer and the `customerVendorCode` refers to the seller.
     *  
     *  This is a permanent document and is recorded in AvaTax.
     */
    PurchaseInvoice,

    /** 
     * Represents an estimate of tax to be refunded if a refund or return is processed.
     *  
     *  This document type is used before a customer chooses to request a refund for a previous sale, and it
     *  estimates the final amount of tax to be refunded when the refund is completed.
     *  
     *  For a return order, the `companyCode` of the transaction refers to the seller who is giving the refund 
     *  and the `customerVendorCode` refers to the buyer who is requesting the refund.
     *  
     *  This is a temporary document type and is not saved in tax history.
     */
    ReturnOrder,

    /** 
     * Represents an refund that has been finalized.
     *  
     *  This document type is used when a customer chooses to request a refund for a previous sale, and it
     *  records the final amount of tax that has been refunded when the refund is completed.
     *  
     *  For a return invoice, the `companyCode` of the transaction refers to the seller who is giving the refund 
     *  and the `customerVendorCode` refers to the buyer who is requesting the refund.
     *  
     *  This is a permanent document and is recorded in AvaTax.
     *  
     *  Please note that many jurisdictions around the United States have special rules about how to report refunds
     *  on a sales tax filing, and some refund transactions may be unable to file immediately due to credit netting
     *  rules.
     */
    ReturnInvoice,

    /** 
     * Represents a proposed movement of inventory from one jurisdiction to another.
     *  
     *  This document type is used when physical goods are shipped from one jurisdiction to another, and it
     *  may cause updates in the tax liability for various jurisdictions.
     *  
     *  For an inventory transfer invoice, the `companyCode` of the transaction refers to the owner of the inventory
     *  that will be moved from one location to another.
     *  
     *  This is a temporary document type and is not saved in tax history.
     */
    InventoryTransferOrder,

    /** 
     * Represents a movement of inventory from one jurisdiction to another that has been finalized.
     *  
     *  This document type is used when physical goods are shipped from one jurisdiction to another, and it
     *  may cause updates in the tax liability for various jurisdictions.
     *  
     *  For an inventory transfer invoice, the `companyCode` of the transaction refers to the owner of the inventory
     *  that will be moved from one location to another.
     *  
     *  This is a permanent document and is recorded in AvaTax.
     */
    InventoryTransferInvoice,

    /** 
     * Represents a VAT "Reverse Charge" mechanism transaction as defined in the European Union.
     *  
     *  A Reverse Charge transaction moves the responsibility for VAT reporting from the seller to the buyer, and
     *  is intended to allow simplification of commerce and reduce the reporting requirements for sellers that deliver
     *  goods and services into the single market.
     *  
     *  This is a temporary document type and is not saved in tax history.
     */
    ReverseChargeOrder,

    /** 
     * Represents a VAT "Reverse Charge" mechanism transaction as defined in the European Union.
     *  
     *  A Reverse Charge transaction moves the responsibility for VAT reporting from the seller to the buyer, and
     *  is intended to allow simplification of commerce and reduce the reporting requirements for sellers that deliver
     *  goods and services into the single market.
     *  
     *  This is a permanent document and is recorded in AvaTax.
     */
    ReverseChargeInvoice,

    /** 
     * Not a real document type.
     *  
     *  This value is used when querying for documents. You can specify the type `Any` in some cases to permit the
     *  system to find any document matching other criteria.
     */
    Any,

}
    