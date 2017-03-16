package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * This model contains a reconstructed CreateTransaction request object that could potentially be used
to recreate this transaction.

Note that the API changes over time, and this reconstructed model is likely different from the exact request
that was originally used to create this transaction.
 */
public class ReconstructedApiRequestResponseModel {
    private CreateTransactionModel request;

    /**
     * Getter for request - This model contains a reconstructed CreateTransaction request object that could potentially be used
to recreate this transaction.

Note that the API changes over time, and this reconstructed model is likely different from the exact request
that was originally used to create this transaction.
     */
    public CreateTransactionModel getRequest() {
        return this.request;
    }

    /**
     * Setter for request - This model contains a reconstructed CreateTransaction request object that could potentially be used
to recreate this transaction.

Note that the API changes over time, and this reconstructed model is likely different from the exact request
that was originally used to create this transaction.
     */
    public void setRequest(CreateTransactionModel request) {
        this.request = request;
    }

    


    /**
     * Returns a JSON string representation of ReconstructedApiRequestResponseModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    