import java.util.HashMap;

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
 * Filing Frequency types
 */
public enum NoticePriorityId {
	
    /** 
     * Immediate Attention Required
     */
    ImmediateAttentionRequired(1),

    /** 
     * High
     */
    High(2),

    /** 
     * Normal
     */
    Normal(3),

    /** 
     * Low
     */
    Low(4),

    /**
     * Integer value for NoticePriorityId
     */
    public final int Value;

    private NoticePriorityId(int value) {
		Value = value;
    }
	
	/**
	 * Map NoticePriorityId to NoticePriorityId integer ID.
	 */
	 private static final Map<Integer, NoticePriorityId> _map = new HashMap<Integer, NoticePriorityId>();
	 static
	 {
		 for (NoticePriorityId modelName : NoticePriorityId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get NoticePriorityId from value 
	  */
	 public static NoticePriorityId from(int value)
	 {
		 return _map.get(value);
	 }
}
