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
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Service modes for tax calculation when using an AvaLocal server.
 */
public enum ServiceMode {
    /** 
     * Automatically use local or remote (default)
     */
    Automatic,

    /** 
     * Local server only
     */
    Local,

    /** 
     * Remote server only
     */
    Remote,

}
    