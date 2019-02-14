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
 * Filing Request Status types
 */
public enum FilingRequestStatus {
    /** 
     * Customer is building a request for a new filing calendar
     */
    New,

    /** 
     * Customer’s information validated before submitting to go live. All required information as per state and form selection is entered.
     */
    Validated,

    /** 
     * Customer submitted a request for a new filing calendar
     */
    Pending,

    /** 
     * Filing calender is active
     */
    Active,

    /** 
     * Customer requested to deactivate filing calendar
     */
    PendingStop,

    /** 
     * Filing calendar is inactive
     */
    Inactive,

    /** 
     * This indicates that there is a new change request.
     */
    ChangeRequest,

    /** 
     * This indicates that the change request was approved.
     */
    RequestApproved,

    /** 
     * This indicates that compliance rejected the request.
     */
    RequestDenied,

}
    