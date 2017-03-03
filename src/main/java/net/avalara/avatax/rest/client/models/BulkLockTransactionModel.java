package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Bulk lock documents model
 */
public class BulkLockTransactionModel {
    private ArrayList<Long> documentIds;

    /**
     * Getter for documentIds - Bulk lock documents model
     */
    public ArrayList<Long> getDocumentIds() {
        return this.documentIds;
    }

    /**
     * Setter for documentIds - Bulk lock documents model
     */
    public void setDocumentIds(ArrayList<Long> documentIds) {
        this.documentIds = documentIds;
    }

    
    private Boolean isLocked;

    /**
     * Getter for isLocked - Bulk lock documents model
     */
    public Boolean getIsLocked() {
        return this.isLocked;
    }

    /**
     * Setter for isLocked - Bulk lock documents model
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    


    /**
     * Returns a JSON string representation of BulkLockTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    