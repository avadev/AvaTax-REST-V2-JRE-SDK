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
 * The data type that must be passed in a parameter bag
 */
public enum ParameterBagDataType {
    /** 
     * This data type is a string.
     */
    String,

    /** 
     * This data type is either 'true' or 'false'.
     */
    Boolean,

    /** 
     * This data type is a numeric value. It can include decimals.
     */
    Numeric,

}
    