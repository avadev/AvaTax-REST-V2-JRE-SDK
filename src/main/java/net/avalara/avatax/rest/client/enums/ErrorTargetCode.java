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
 * What object experienced the error?
 */
public enum ErrorTargetCode {
    /** 
     * Error target is unknown
     */
    Unknown,

    /** 
     * There was an error in the request URL, querystring, or body
     */
    HttpRequest,

    /** 
     * There was an error in the HTTP Request headers
     */
    HttpRequestHeaders,

    /** 
     * Some data provided by the user was incorrect
     */
    IncorrectData,

    /** 
     * There was an error in the AvaTax API Server
     */
    AvaTaxApiServer,

    /** 
     * There was an error in the Avalara Identity Server
     */
    AvalaraIdentityServer,

    /** 
     * The customer's account setup does not permit certain actions
     */
    CustomerAccountSetup,

}
    