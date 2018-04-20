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
 * Describes the different types of statuses which describe an entity (company).
 */
public enum NexusTypeId {
    /** 
     * Indicates no nexus
     */
    None,

    /** 
     * Indicates the entity is voluntarily collecting tax (default)
     *  
     *  This has replaced Collect
     */
    SalesOrSellersUseTax,

    /** 
     * Indicates the entity is required to collect tax in the state
     *  
     *  This has replaced Legal
     */
    SalesTax,

    /** 
     * Indicates the entity is registered as a Volunteer in an SST state.
     *  Only your SST administrator may set this option.
     */
    SSTVolunteer,

    /** 
     * Indicates the entity is registered as a Non-Volunteer in an SST state.
     *  Only your SST administrator may set this option.
     */
    SSTNonVolunteer,

}
    