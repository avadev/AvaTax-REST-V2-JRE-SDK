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
 * Filing Frequency types
 */
public enum FilingFrequencyId {
    /** 
     * File once per month
     */
    Monthly,

    /** 
     * File once per three months
     */
    Quarterly,

    /** 
     * File twice per year
     */
    SemiAnnually,

    /** 
     * File once per year
     */
    Annually,

    /** 
     * File every other month
     */
    Bimonthly,

    /** 
     * File only when there are documents to report
     */
    Occasional,

    /** 
     * File for the first two months of each quarter, then do not file on the quarterly month.
     */
    InverseQuarterly,

}
    