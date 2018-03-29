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
 * A list of possible AvaFile filing types for tax notices.
 */
public enum TaxNoticeFilingTypeId {
    /** 
     * Denotes the tax return is being filed via electronic means; excludes SST electronic filing.
     */
    ElectronicReturn,

    /** 
     * Denotes the tax return is being filed on paper.
     */
    PaperReturn,

    /** 
     * Denotes the tax return that was not filed.
     */
    ReturnNotFiled,

    /** 
     * Denotes a return is paid via EFT and filed on paper without payment.
     */
    EFTPaper,

    /** 
     * Denotes the tax return is an SST filing.
     */
    SER,

    /** 
     * Denotes the tax return is a Trudsfile-EDI filing.
     */
    TrustfileEdi,

    /** 
     * Denotes the tax return is an uploaded file.
     */
    UploadFile,

    /** 
     * Denotes the tax return was manually filed via paper
     */
    PaperManual,

    /** 
     * Denotes a cert capture return
     */
    CertCapture,

    /** 
     * Denotes a signature ready return
     */
    SignatureReady,

}
    