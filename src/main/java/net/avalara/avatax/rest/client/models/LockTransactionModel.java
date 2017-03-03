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
public class LockTransactionModel {
    private Boolean isLocked;

    /**
     * Getter for isLocked - Commit this transaction as permanent
     */
    public Boolean getIsLocked() {
        return this.isLocked;
    }

    /**
     * Setter for isLocked - Commit this transaction as permanent
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    


    /**
     * Returns a JSON string representation of LockTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    