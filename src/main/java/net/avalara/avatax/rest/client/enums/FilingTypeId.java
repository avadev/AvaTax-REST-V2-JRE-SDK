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
 * A list of possible AvaFile filing types.
 */
public enum FilingTypeId {
    /** 
     * Denotes the tax return is being filed on paper.
     */
    PaperReturn,

    /** 
     * Denotes the tax return is being filed via electronic means; excludes SST electronic filing.
     */
    ElectronicReturn,

    /** 
     * Denotes the tax return is an SST filing.
     */
    SER,

    /** 
     * Denotes a return is paid via EFT and filed on paper without payment.
     */
    EFTPaper,

    /** 
     * Denotes a return is paid via phone and filed on paper without payment.
     */
    PhonePaper,

    /** 
     * Denotes a return is prepared but delivered to the customer for filing and payment.
     */
    SignatureReady,

    /** 
     * Denotes a return which is filed online but paid by check.
     */
    EfileCheck,

}
    