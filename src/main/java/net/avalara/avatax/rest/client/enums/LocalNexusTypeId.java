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
 * Describes nexus type id
 */
public enum LocalNexusTypeId {
    /** 
     * Only the specific nexus objects declared for this company are declared.
     */
    Selected,

    /** 
     * Customer declares nexus in all state administered taxing authorities.
     *  
     *  This value only takes effect if you set `hasLocalNexus` = true.
     */
    StateAdministered,

    /** 
     * Customer declares nexus in all local taxing authorities. 
     *  
     *  This value only takes effect if you set `hasLocalNexus` = true.
     */
    All,

}
    