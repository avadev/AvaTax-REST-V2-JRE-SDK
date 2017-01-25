package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents the current status of a funding ESign method
 */
public class FundingESignMethodReturn {
    private String method;

    /**
     * Getter for method - Method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * Setter for method - Method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    
    private Boolean javaScriptReady;

    /**
     * Getter for javaScriptReady - JavaScriptReady
     */
    public Boolean getJavaScriptReady() {
        return this.javaScriptReady;
    }

    /**
     * Setter for javaScriptReady - JavaScriptReady
     */
    public void setJavaScriptReady(Boolean javaScriptReady) {
        this.javaScriptReady = javaScriptReady;
    }

    
    private String javaScript;

    /**
     * Getter for javaScript - The actual javascript to use to render this object
     */
    public String getJavaScript() {
        return this.javaScript;
    }

    /**
     * Setter for javaScript - The actual javascript to use to render this object
     */
    public void setJavaScript(String javaScript) {
        this.javaScript = javaScript;
    }

    


    /**
     * Returns a JSON string representation of FundingESignMethodReturn.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    