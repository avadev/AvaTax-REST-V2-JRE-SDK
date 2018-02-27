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
 * 
 */
public enum CertCaptureProvisionStatus {
    /** 
     * Account and company are provisioned
     */
    Finished,

    /** 
     * Account are not provisioned
     */
    NotStarted,

    /** 
     * Provision job is being queued
     *  This could also be an indication that some companies under an account has been provisioned, while others
     *  under the same account has not.
     */
    InProgress,

    /** 
     * The account is put into provisioned queue.
     */
    Queued,

}
    