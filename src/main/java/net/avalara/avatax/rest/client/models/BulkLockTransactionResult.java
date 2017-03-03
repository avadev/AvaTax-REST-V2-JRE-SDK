package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Returns information about transactions that were locked
 */
public class BulkLockTransactionResult {
    private Integer numberOfRecords;

    /**
     * Getter for numberOfRecords - Returns information about transactions that were locked
     */
    public Integer getNumberOfRecords() {
        return this.numberOfRecords;
    }

    /**
     * Setter for numberOfRecords - Returns information about transactions that were locked
     */
    public void setNumberOfRecords(Integer numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }

    


    /**
     * Returns a JSON string representation of BulkLockTransactionResult.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    