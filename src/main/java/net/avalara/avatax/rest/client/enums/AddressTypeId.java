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
 * Indicates whether this address refers to a person or an business
 */
public enum AddressTypeId {
    /** 
     * A business location, for example a store, warehouse, or office.
     */
    Location,

    /** 
     * A person's address who performs sales tasks for the company remotely from an office.
     */
    Salesperson,

}
    