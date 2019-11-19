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
 * Settle this transaction with your ledger by verifying its amounts.
* If the transaction is not yet committed, you may specify the "commit" value to commit it to the ledger and allow it to be reported.
* You may also optionally change the transaction's code by specifying the "newTransactionCode" value.
 */
public class ChangeTransactionCodeModel {


    private String newCode;

    /**
     * Getter for newCode
     *
     * To change the transaction code for this transaction, specify the new transaction code here.
     */
    public String getNewCode() {
        return this.newCode;
    }

    /**
     * Setter for newCode
     *
     * To change the transaction code for this transaction, specify the new transaction code here.
     */
    public void setNewCode(String value) {
        this.newCode = value;
    }


    /**
     * Returns a JSON string representation of ChangeTransactionCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
