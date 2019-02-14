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
 * Indicates the behavior of a tax form for a company with multiple places of business.
 *  
 *  Some tax authorities require that a separate form must be filed for each place of business.
 */
public enum OutletTypeId {
    /** 
     * File a single return per cycle for your entire business.
     */
    None,

    /** 
     * You may file separate forms for each outlet; contact the tax authority for more details about location based reporting requirements.
     */
    Schedule,

    /** 
     * You may file separate forms for each outlet; contact the tax authority for more details about location based reporting requirements.
     */
    Duplicate,

    /** 
     * File a single return, but you must have a line item for each place of business.
     */
    Consolidated,

}
    