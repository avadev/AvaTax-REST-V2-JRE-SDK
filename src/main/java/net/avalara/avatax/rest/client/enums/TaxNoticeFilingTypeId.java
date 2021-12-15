package net.avalara.avatax.rest.client.enums;
import java.util.HashMap;

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
 * Swagger name: AvaTaxClient
 */

/**
 * 
 */
public enum TaxNoticeFilingTypeId {
    /** 
     * 
     */
    ElectronicReturn(1),

    /** 
     * 
     */
    PaperReturn(2),

    /** 
     * 
     */
    ReturnNotFiled(3),

    /** 
     * 
     */
    EFTPaper(4),

    /** 
     * 
     */
    SER(5),

    /** 
     * 
     */
    TrustfileEdi(6),

    /** 
     * 
     */
    UploadFile(7),

    /** 
     * 
     */
    PaperManual(8),

    /** 
     * 
     */
    CertCapture(9),

    /** 
     * 
     */
    SignatureReady(10);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private TaxNoticeFilingTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (TaxNoticeFilingTypeId enumName : TaxNoticeFilingTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static TaxNoticeFilingTypeId valueOf(int intValue) {
		return (TaxNoticeFilingTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
