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
 * Swagger name: AvaTaxClient
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
     * 
	 * 
     */
    public VerifyTransactionModel getVerify() {
        return this.verify;
    }

    /**
     * Setter for verify
     *
     * 
     */
    public void setVerify(VerifyTransactionModel value) {
        this.verify = value;
    }

    private ChangeTransactionCodeModel changeCode;

    /**
     * Getter for changeCode
     *
     * 
	 * 
     */
    public ChangeTransactionCodeModel getChangeCode() {
        return this.changeCode;
    }

    /**
     * Setter for changeCode
     *
     * 
     */
    public void setChangeCode(ChangeTransactionCodeModel value) {
        this.changeCode = value;
    }

    private CommitTransactionModel commit;

    /**
     * Getter for commit
     *
     * 
	 * 
     */
    public CommitTransactionModel getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit
     *
     * 
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
