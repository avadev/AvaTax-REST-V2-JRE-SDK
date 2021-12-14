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
public enum DocumentType {
    /** 
     * 
     */
    SalesOrder(0),

    /** 
     * 
     */
    SalesInvoice(1),

    /** 
     * 
     */
    PurchaseOrder(2),

    /** 
     * 
     */
    PurchaseInvoice(3),

    /** 
     * 
     */
    ReturnOrder(4),

    /** 
     * 
     */
    ReturnInvoice(5),

    /** 
     * 
     */
    InventoryTransferOrder(6),

    /** 
     * 
     */
    InventoryTransferInvoice(7),

    /** 
     * 
     */
    ReverseChargeOrder(8),

    /** 
     * 
     */
    ReverseChargeInvoice(9),

    /** 
     * 
     */
    CustomsInvoice(10),

    /** 
     * 
     */
    CustomsOrder(11),

    /** 
     * 
     */
    Any(-1);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private DocumentType(int value) {
		this.value = value;
	}
	
	static {
		for (DocumentType enumName : DocumentType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static DocumentType valueOf(int intValue) {
		return (DocumentType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
