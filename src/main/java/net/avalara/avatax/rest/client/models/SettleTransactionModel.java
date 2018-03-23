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
 * Settle this transaction with your ledger by executing one or many actions against that transaction. 
* 
* You may use this endpoint to verify the transaction, change the transaction's code, and commit the transaction for reporting purposes.
* This endpoint may be used to execute any or all of these actions at once.
 */
public class SettleTransactionModel {


    private VerifyTransactionModel verify;

    /**
     * Getter for verify
     *
     * To verify this transaction, you may provide information in this field.
    * 
    * If you leave this field null, the transaction will not be verified.
     */
    public VerifyTransactionModel getVerify() {
        return this.verify;
    }

    /**
     * Setter for verify
     *
     * To verify this transaction, you may provide information in this field.
    * 
    * If you leave this field null, the transaction will not be verified.
     */
    public void setVerify(VerifyTransactionModel value) {
        this.verify = value;
    }


    private ChangeTransactionCodeModel changeCode;

    /**
     * Getter for changeCode
     *
     * To change the code for this transaction, you may provide information in this field.
    * 
    * If you leave this field null, the transaction's code will not be changed.
     */
    public ChangeTransactionCodeModel getChangeCode() {
        return this.changeCode;
    }

    /**
     * Setter for changeCode
     *
     * To change the code for this transaction, you may provide information in this field.
    * 
    * If you leave this field null, the transaction's code will not be changed.
     */
    public void setChangeCode(ChangeTransactionCodeModel value) {
        this.changeCode = value;
    }


    private CommitTransactionModel commit;

    /**
     * Getter for commit
     *
     * To commit this transaction so that it can be reported on a tax filing, you may provide information in this field.
    * 
    * If you leave this field null, the transaction's commit status will not be changed.
    * 
    * If you use Avalara's Managed Returns Service, committing a transaction will allow that transaction to be filed.
     */
    public CommitTransactionModel getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit
     *
     * To commit this transaction so that it can be reported on a tax filing, you may provide information in this field.
    * 
    * If you leave this field null, the transaction's commit status will not be changed.
    * 
    * If you use Avalara's Managed Returns Service, committing a transaction will allow that transaction to be filed.
     */
    public void setCommit(CommitTransactionModel value) {
        this.commit = value;
    }


    /**
     * Returns a JSON string representation of SettleTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
