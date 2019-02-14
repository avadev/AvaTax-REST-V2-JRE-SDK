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
 * Indicates the level of companies that can be accessed
 */
public enum CompanyAccessLevel {
    /** 
     * No permission to access companies.
     */
    None,

    /** 
     * Permission to access a single company and its children.
     */
    SingleCompany,

    /** 
     * Permission to access all companies in a single account.
     */
    SingleAccount,

    /** 
     * Permission to access all companies in all accounts. Reserved for system administration tasks.
     */
    AllCompanies,

}
    