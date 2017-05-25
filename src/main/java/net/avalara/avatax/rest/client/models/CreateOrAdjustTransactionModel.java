package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Create or adjust transaction model
 */
public class CreateOrAdjustTransactionModel {
    private CreateTransactionModel createTransactionModel;

    /**
     * Getter for createTransactionModel - Create or adjust transaction model
     */
    public CreateTransactionModel getCreateTransactionModel() {
        return this.createTransactionModel;
    }

    /**
     * Setter for createTransactionModel - Create or adjust transaction model
     */
    public void setCreateTransactionModel(CreateTransactionModel createTransactionModel) {
        this.createTransactionModel = createTransactionModel;
    }

    


    /**
     * Returns a JSON string representation of CreateOrAdjustTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    