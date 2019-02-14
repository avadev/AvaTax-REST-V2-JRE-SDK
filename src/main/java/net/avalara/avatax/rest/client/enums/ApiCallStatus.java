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
 * Indicates what level of auditing information is available for a transaction
 */
public enum ApiCallStatus {
    /** 
     * If the original api call is availabe on S3
     */
    OriginalApiCallAvailable,

    /** 
     * if the original api call is not available, reconstructed api call should always be available
     */
    ReconstructedApiCallAvailable,

    /** 
     * Any other api call status
     */
    Any,

}
    