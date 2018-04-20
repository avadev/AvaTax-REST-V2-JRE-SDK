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
 * The way of delivering request
 */
public enum CertificateRequestDeliveryMethod {
    /** 
     * The invitation will be sent via email to the recipient's email address.
     */
    Email,

    /** 
     * The invitation will be sent via facsimile to the recipient's facsimile phone number.
     *  
     *  Facsimile transmission make take time to process and deliver via phone lines.
     */
    Fax,

    /** 
     * The request will be processed and turned into a web link (URL) which the user can click on to visit the CertExpress site and immediately
     *  begin entering data about their certificates.
     */
    Download,

}
    