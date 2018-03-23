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
 * The date filter type for report
 *  "RD" for Reporting Date, "DD" for Document Date, "TD" for Tax Date, "PD" for Payment Date
 */
public enum ReportDateFilter {
    /** 
     * The date when the transaction is posted
     */
    DocumentDate,

    /** 
     * The date when the transaction is paid for
     */
    PaymentDate,

    /** 
     * The date when the transaction is added to report
     */
    ReportingDate,

    /** 
     * The date when the transaction is being taxed
     */
    TaxDate,

}
    