package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Commit this transaction as permanent
 */
public class CommitTransactionModel {
    private Boolean commit;

    /**
     * Getter for commit - Commit this transaction as permanent
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit - Commit this transaction as permanent
     */
    public void setCommit(Boolean commit) {
        this.commit = commit;
    }

    


    /**
     * Returns a JSON string representation of CommitTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    