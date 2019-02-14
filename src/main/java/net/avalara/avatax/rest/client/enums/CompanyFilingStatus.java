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
 * Indicates whether Avalara Managed Returns has begun filing for this company.
 */
public enum CompanyFilingStatus {
    /** 
     * This company is not a reporting entity and cannot file taxes. To change this behavior, you must mark
     *  the company as a reporting entity.
     */
    NoReporting,

    /** 
     * This company is a reporting entity, but Avalara is not currently filing tax returns for this company.
     */
    NotYetFiling,

    /** 
     * The customer has requested that Avalara Managed Returns begin filing for this company, however filing has
     *  not yet started. Avalara's compliance team is reviewing this request and will update the company to
     *  first filing status when complete.
     */
    FilingRequested,

    /** 
     * Avalara has begun filing tax returns for this company. Normally, this status will change to `Active` after 
     *  one month of successful filing of tax returns.
     */
    FirstFiling,

    /** 
     * Avalara currently files tax returns for this company.
     */
    Active,

    /** 
     * This company has not been configured for compliance
     */
    NotConfiguredForCompliance,

}
    