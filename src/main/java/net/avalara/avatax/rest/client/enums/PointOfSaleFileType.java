package net.avalara.avatax.rest.client.enums;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.6.0-89
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Type of file request
 */
public enum PointOfSaleFileType {
    /** 
     * File is in Javascript Object Notation format
     */
    Json,

    /** 
     * File is in Comma Separated Values format
     */
    Csv,

    /** 
     * File is in Extended Markup Language format
     */
    Xml,

}
    