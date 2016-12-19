package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Settle this transaction with your ledger by verifying its amounts.
            If the transaction is not yet committed, you may specify the "commit" value to commit it to the ledger and allow it to be reported.
            You may also optionally change the transaction's code by specifying the "newTransactionCode" value.
 */
public class ChangeTransactionCodeModel {
    private String newCode;

    /**
     * Getter for newCode - To change the transaction code for this transaction, specify the new transaction code here.
     */
    public String getNewCode() {
        return this.newCode;
    }

    /**
     * Setter for newCode - To change the transaction code for this transaction, specify the new transaction code here.
     */
    public void setNewCode(String newCode) {
        this.newCode = newCode;
    }

    


    /**
     * Returns a JSON string representation of ChangeTransactionCodeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    