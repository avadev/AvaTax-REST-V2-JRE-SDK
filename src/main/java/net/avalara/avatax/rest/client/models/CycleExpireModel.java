package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Cycle Safe Expiration results.
 */
public class CycleExpireModel {
    private Boolean success;

    /**
     * Getter for success - Cycle Safe Expiration results.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Setter for success - Cycle Safe Expiration results.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    
    private String message;

    /**
     * Getter for message - Cycle Safe Expiration results.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - Cycle Safe Expiration results.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private ArrayList<CycleExpireOptionModel> cycleExpirationOptions;

    /**
     * Getter for cycleExpirationOptions - Cycle Safe Expiration results.
     */
    public ArrayList<CycleExpireOptionModel> getCycleExpirationOptions() {
        return this.cycleExpirationOptions;
    }

    /**
     * Setter for cycleExpirationOptions - Cycle Safe Expiration results.
     */
    public void setCycleExpirationOptions(ArrayList<CycleExpireOptionModel> cycleExpirationOptions) {
        this.cycleExpirationOptions = cycleExpirationOptions;
    }

    


    /**
     * Returns a JSON string representation of CycleExpireModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    