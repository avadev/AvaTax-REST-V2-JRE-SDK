package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A request to void a previously created transaction
 */
public class VoidTransactionModel {
    private VoidReasonCode code;

    /**
     * Getter for code - A request to void a previously created transaction
     */
    public VoidReasonCode getCode() {
        return this.code;
    }

    /**
     * Setter for code - A request to void a previously created transaction
     */
    public void setCode(VoidReasonCode code) {
        this.code = code;
    }

    


    /**
     * Returns a JSON string representation of VoidTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    