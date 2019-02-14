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
 * Indicates the type of adjustment that was performed on a transaction
 */
public enum AdjustmentReason {
    /** 
     * The transaction has not been adjusted
     */
    NotAdjusted,

    /** 
     * A sourcing issue existed which caused the transaction to be adjusted
     */
    SourcingIssue,

    /** 
     * Transaction was adjusted to reconcile it with a general ledger
     */
    ReconciledWithGeneralLedger,

    /** 
     * Transaction was adjusted after an exemption certificate was applied
     */
    ExemptCertApplied,

    /** 
     * Transaction was adjusted when the price of an item changed
     */
    PriceAdjusted,

    /** 
     * Transaction was adjusted due to a product return
     */
    ProductReturned,

    /** 
     * Transaction was adjusted due to a product exchange
     */
    ProductExchanged,

    /** 
     * Transaction was adjusted due to bad or uncollectable debt
     */
    BadDebt,

    /** 
     * Transaction was adjusted for another reason not specified
     */
    Other,

    /** 
     * Offline
     */
    Offline,

}
    