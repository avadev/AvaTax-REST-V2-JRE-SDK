package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Informational or warning messages returned by AvaTax with a transaction
 */
public class AvaTaxMessage {
    private String refersTo;

    /**
     * Getter for refersTo - Informational or warning messages returned by AvaTax with a transaction
     */
    public String getRefersTo() {
        return this.refersTo;
    }

    /**
     * Setter for refersTo - Informational or warning messages returned by AvaTax with a transaction
     */
    public void setRefersTo(String refersTo) {
        this.refersTo = refersTo;
    }

    
    private String source;

    /**
     * Getter for source - Informational or warning messages returned by AvaTax with a transaction
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for source - Informational or warning messages returned by AvaTax with a transaction
     */
    public void setSource(String source) {
        this.source = source;
    }

    
    private String details;

    /**
     * Getter for details - Informational or warning messages returned by AvaTax with a transaction
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Setter for details - Informational or warning messages returned by AvaTax with a transaction
     */
    public void setDetails(String details) {
        this.details = details;
    }

    
    private String severity;

    /**
     * Getter for severity - Informational or warning messages returned by AvaTax with a transaction
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * Setter for severity - Informational or warning messages returned by AvaTax with a transaction
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    
    private String summary;

    /**
     * Getter for summary - Informational or warning messages returned by AvaTax with a transaction
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary - Informational or warning messages returned by AvaTax with a transaction
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    


    /**
     * Returns a JSON string representation of AvaTaxMessage.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    