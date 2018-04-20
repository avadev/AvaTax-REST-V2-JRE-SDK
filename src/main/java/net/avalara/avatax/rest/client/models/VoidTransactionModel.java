package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
 * A request to void a previously created transaction
 */
public class VoidTransactionModel {


    private VoidReasonCode code;

    /**
     * Getter for code
     *
     * Please specify the reason for voiding or cancelling this transaction
     */
    public VoidReasonCode getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Please specify the reason for voiding or cancelling this transaction
     */
    public void setCode(VoidReasonCode value) {
        this.code = value;
    }


    /**
     * Returns a JSON string representation of VoidTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
