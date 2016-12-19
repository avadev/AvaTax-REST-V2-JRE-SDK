package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Authority Info
 */
public class TaxAuthorityInfo {
    private String avalaraId;

    /**
     * Getter for avalaraId - Avalara Id
     */
    public String getAvalaraId() {
        return this.avalaraId;
    }

    /**
     * Setter for avalaraId - Avalara Id
     */
    public void setAvalaraId(String avalaraId) {
        this.avalaraId = avalaraId;
    }

    
    private String jurisdictionName;

    /**
     * Getter for jurisdictionName - Jurisdiction Name
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName - Jurisdiction Name
     */
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    
    private JurisdictionType jurisdictionType;

    /**
     * Getter for jurisdictionType - Jurisdiction Type
     */
    public JurisdictionType getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType - Jurisdiction Type
     */
    public void setJurisdictionType(JurisdictionType jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    
    private String signatureCode;

    /**
     * Getter for signatureCode - Signature Code
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode - Signature Code
     */
    public void setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
    }

    


    /**
     * Returns a JSON string representation of TaxAuthorityInfo.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    