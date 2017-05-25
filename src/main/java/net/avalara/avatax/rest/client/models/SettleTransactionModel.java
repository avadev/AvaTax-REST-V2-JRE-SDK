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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Settle this transaction with your ledger by executing one or many actions against that transaction. 
* You may use this endpoint to verify the transaction, change the transaction's code, and commit the transaction for reporting purposes.
* This endpoint may be used to execute any or all of these actions at once.
 */
public class SettleTransactionModel {


    private VerifyTransactionModel verify;

    /**
     * Getter for verify;
     * To use the "Settle" endpoint to verify a transaction, fill out this value.
     */
    public VerifyTransactionModel getverify() {;
        return this.verify;;
    }

    /**
     * Setter for verify;
     * To use the "Settle" endpoint to verify a transaction, fill out this value.
     */
    public void setverify(VerifyTransactionModel value) {;
        this.verify = value;;
    }


    private ChangeTransactionCodeModel changeCode;

    /**
     * Getter for changeCode;
     * To use the "Settle" endpoint to change a transaction's code, fill out this value.
     */
    public ChangeTransactionCodeModel getchangeCode() {;
        return this.changeCode;;
    }

    /**
     * Setter for changeCode;
     * To use the "Settle" endpoint to change a transaction's code, fill out this value.
     */
    public void setchangeCode(ChangeTransactionCodeModel value) {;
        this.changeCode = value;;
    }


    private CommitTransactionModel commit;

    /**
     * Getter for commit;
     * To use the "Settle" endpoint to commit a transaction for reporting purposes, fill out this value.
    * If you use Avalara Returns, committing a transaction will cause that transaction to be filed.
     */
    public CommitTransactionModel getcommit() {;
        return this.commit;;
    }

    /**
     * Setter for commit;
     * To use the "Settle" endpoint to commit a transaction for reporting purposes, fill out this value.
    * If you use Avalara Returns, committing a transaction will cause that transaction to be filed.
     */
    public void setcommit(CommitTransactionModel value) {;
        this.commit = value;;
    }


    /**
     * Returns a JSON string representation of SettleTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
