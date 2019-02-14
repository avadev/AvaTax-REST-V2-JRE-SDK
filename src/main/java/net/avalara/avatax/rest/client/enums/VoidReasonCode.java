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
 * Reason code for voiding or cancelling a transaction
 */
public enum VoidReasonCode {
    /** 
     * Unspecified reason
     */
    Unspecified,

    /** 
     * Post operation failed - Document status will be changed to unposted
     */
    PostFailed,

    /** 
     * Document deleted - If committed, document status will be changed to Cancelled. If not committed, document will be
     *  deleted.
     */
    DocDeleted,

    /** 
     * Document has been voided and DocStatus will be set to Cancelled
     */
    DocVoided,

    /** 
     * AdjustTax operation has been cancelled. Adjustment will be reversed.
     */
    AdjustmentCancelled,

}
    