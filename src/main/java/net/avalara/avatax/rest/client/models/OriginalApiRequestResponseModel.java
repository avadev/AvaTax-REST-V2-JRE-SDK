package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents the exact API request and response from the original transaction API call, if available
 */
public class OriginalApiRequestResponseModel {
    private String request;

    /**
     * Getter for request - Represents the exact API request and response from the original transaction API call, if available
     */
    public String getRequest() {
        return this.request;
    }

    /**
     * Setter for request - Represents the exact API request and response from the original transaction API call, if available
     */
    public void setRequest(String request) {
        this.request = request;
    }

    
    private String response;

    /**
     * Getter for response - Represents the exact API request and response from the original transaction API call, if available
     */
    public String getResponse() {
        return this.response;
    }

    /**
     * Setter for response - Represents the exact API request and response from the original transaction API call, if available
     */
    public void setResponse(String response) {
        this.response = response;
    }

    


    /**
     * Returns a JSON string representation of OriginalApiRequestResponseModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    