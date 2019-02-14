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
 * Jurisdiction boundary precision level found for address. This depends on the accuracy of the address
 *  as well as the precision level of the state provided jurisdiction boundaries.
 */
public enum BoundaryLevel {
    /** 
     * Street address precision
     */
    Address,

    /** 
     * 9-digit zip precision
     */
    Zip9,

    /** 
     * 5-digit zip precision
     */
    Zip5,

}
    