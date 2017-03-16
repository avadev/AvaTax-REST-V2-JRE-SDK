package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Information about a location type
 */
public class TransactionLocationTypeModel {
    private Long documentLocationTypeId;

    /**
     * Getter for documentLocationTypeId - Information about a location type
     */
    public Long getDocumentLocationTypeId() {
        return this.documentLocationTypeId;
    }

    /**
     * Setter for documentLocationTypeId - Information about a location type
     */
    public void setDocumentLocationTypeId(Long documentLocationTypeId) {
        this.documentLocationTypeId = documentLocationTypeId;
    }

    
    private Long documentId;

    /**
     * Getter for documentId - Information about a location type
     */
    public Long getDocumentId() {
        return this.documentId;
    }

    /**
     * Setter for documentId - Information about a location type
     */
    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    
    private Long documentAddressId;

    /**
     * Getter for documentAddressId - Information about a location type
     */
    public Long getDocumentAddressId() {
        return this.documentAddressId;
    }

    /**
     * Setter for documentAddressId - Information about a location type
     */
    public void setDocumentAddressId(Long documentAddressId) {
        this.documentAddressId = documentAddressId;
    }

    
    private String locationTypeCode;

    /**
     * Getter for locationTypeCode - Information about a location type
     */
    public String getLocationTypeCode() {
        return this.locationTypeCode;
    }

    /**
     * Setter for locationTypeCode - Information about a location type
     */
    public void setLocationTypeCode(String locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }

    


    /**
     * Returns a JSON string representation of TransactionLocationTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    