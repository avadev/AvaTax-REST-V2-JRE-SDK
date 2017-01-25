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
     * Getter for success - Whether or not the filing calendar can be expired.
            e.g. if user makes end date of a calendar earlier than latest filing, this would be set to false.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Setter for success - Whether or not the filing calendar can be expired.
            e.g. if user makes end date of a calendar earlier than latest filing, this would be set to false.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    
    private String message;

    /**
     * Getter for message - The message to present to the user if expiration is successful or unsuccessful.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - The message to present to the user if expiration is successful or unsuccessful.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private ArrayList<CycleExpireOptionModel> cycleExpirationOptions;

    /**
     * Getter for cycleExpirationOptions - A list of options for expiring the filing calendar.
     */
    public ArrayList<CycleExpireOptionModel> getCycleExpirationOptions() {
        return this.cycleExpirationOptions;
    }

    /**
     * Setter for cycleExpirationOptions - A list of options for expiring the filing calendar.
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
    