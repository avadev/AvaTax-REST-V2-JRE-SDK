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
 */

/**
 * The type of data contained in this batch
 */
public enum BatchType {
    /** 
     * 
     */
    AvaCertUpdate(0),

    /** 
     * 
     */
    AvaCertUpdateAll(1),

    /** 
     * 
     */
    BatchMaintenance(2),

    /** 
     * 
     */
    CompanyLocationImport(3),

    /** 
     * 
     */
    DocumentImport(4),

    /** 
     * 
     */
    ExemptCertImport(5),

    /** 
     * 
     */
    ItemImport(6),

    /** 
     * 
     */
    SalesAuditExport(7),

    /** 
     * 
     */
    SstpTestDeckImport(8),

    /** 
     * 
     */
    TaxRuleImport(9),

    /** 
     * This batch type represents tax transaction data being uploaded to AvaTax. Each line in the batch represents a single transaction
     *  or a line in a multi-line transaction. For reference, see [Batched Transactions in REST v2](http://developer.avalara.com/blog/2016/10/24/batch-transaction-upload-in-rest-v2)
     */
    TransactionImport(10),

    /** 
     * 
     */
    UPCBulkImport(11),

    /** 
     * 
     */
    UPCValidationImport(12);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private BatchType(int value) {
		this.value = value;
	}
	
	static {
		for (BatchType enumName : BatchType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static BatchType valueOf(int intValue) {
		return (BatchType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
