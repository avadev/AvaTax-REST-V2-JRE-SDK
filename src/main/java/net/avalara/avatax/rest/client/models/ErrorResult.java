package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Helper function for throwing known error response
 */
public class ErrorResult {
    private ErrorInfo error;

    /**
     * Getter for error - Information about the error(s)
     */
    public ErrorInfo getError() {
        return this.error;
    }

    /**
     * Setter for error - Information about the error(s)
     */
    public void setError(ErrorInfo error) {
        this.error = error;
    }

    


    /**
     * Returns a JSON string representation of ErrorResult.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    