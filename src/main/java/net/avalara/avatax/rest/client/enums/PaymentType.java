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
 * Indicates the type of payments
 */
public enum PaymentType {
    /** 
     * The payment is for the current payment
     */
    CurrentPeriod,

    /** 
     * The payment is a prepayment
     */
    Prepayment,

    /** 
     * The payment is a prior payment
     */
    PriorPayment,

    /** 
     * The payment is a prior CSP fee
     */
    PriorCspFee,

}
    