package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents information about location types stored in a line
 */
public class TransactionLineLocationTypeModel {
    private Long documentLineLocationTypeId;

    /**
     * Getter for documentLineLocationTypeId - Represents information about location types stored in a line
     */
    public Long getDocumentLineLocationTypeId() {
        return this.documentLineLocationTypeId;
    }

    /**
     * Setter for documentLineLocationTypeId - Represents information about location types stored in a line
     */
    public void setDocumentLineLocationTypeId(Long documentLineLocationTypeId) {
        this.documentLineLocationTypeId = documentLineLocationTypeId;
    }

    
    private Long documentLineId;

    /**
     * Getter for documentLineId - Represents information about location types stored in a line
     */
    public Long getDocumentLineId() {
        return this.documentLineId;
    }

    /**
     * Setter for documentLineId - Represents information about location types stored in a line
     */
    public void setDocumentLineId(Long documentLineId) {
        this.documentLineId = documentLineId;
    }

    
    private Long documentAddressId;

    /**
     * Getter for documentAddressId - Represents information about location types stored in a line
     */
    public Long getDocumentAddressId() {
        return this.documentAddressId;
    }

    /**
     * Setter for documentAddressId - Represents information about location types stored in a line
     */
    public void setDocumentAddressId(Long documentAddressId) {
        this.documentAddressId = documentAddressId;
    }

    
    private String locationTypeCode;

    /**
     * Getter for locationTypeCode - Represents information about location types stored in a line
     */
    public String getLocationTypeCode() {
        return this.locationTypeCode;
    }

    /**
     * Setter for locationTypeCode - Represents information about location types stored in a line
     */
    public void setLocationTypeCode(String locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }

    


    /**
     * Returns a JSON string representation of TransactionLineLocationTypeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    