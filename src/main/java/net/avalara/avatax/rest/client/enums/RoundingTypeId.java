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
 * Indicates the rounding behavior of a form
 */
public enum RoundingTypeId {
    /** 
     * There is no rounding on the return
     */
    None = 0,

    /** 
     * Round to the nearest whole number
     */
    Nearest = 1,

    /** 
     * Always round up
     */
    Up = 2,

    /** 
     * Always round down
     */
    Down = 3,

}
    