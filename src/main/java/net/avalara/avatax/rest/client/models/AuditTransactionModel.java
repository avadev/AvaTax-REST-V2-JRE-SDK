package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Information about a previously created transaction
 */
public class AuditTransactionModel {
    private ReconstructedApiRequestResponseModel reconstructed;

    /**
     * Getter for reconstructed - Information about a previously created transaction
     */
    public ReconstructedApiRequestResponseModel getReconstructed() {
        return this.reconstructed;
    }

    /**
     * Setter for reconstructed - Information about a previously created transaction
     */
    public void setReconstructed(ReconstructedApiRequestResponseModel reconstructed) {
        this.reconstructed = reconstructed;
    }

    
    private Date serverTimestamp;

    /**
     * Getter for serverTimestamp - Information about a previously created transaction
     */
    public Date getServerTimestamp() {
        return this.serverTimestamp;
    }

    /**
     * Setter for serverTimestamp - Information about a previously created transaction
     */
    public void setServerTimestamp(Date serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }

    
    private ApiCallStatus apiCallStatus;

    /**
     * Getter for apiCallStatus - Information about a previously created transaction
     */
    public ApiCallStatus getApiCallStatus() {
        return this.apiCallStatus;
    }

    /**
     * Setter for apiCallStatus - Information about a previously created transaction
     */
    public void setApiCallStatus(ApiCallStatus apiCallStatus) {
        this.apiCallStatus = apiCallStatus;
    }

    
    private Date serverDuration;

    /**
     * Getter for serverDuration - Information about a previously created transaction
     */
    public Date getServerDuration() {
        return this.serverDuration;
    }

    /**
     * Setter for serverDuration - Information about a previously created transaction
     */
    public void setServerDuration(Date serverDuration) {
        this.serverDuration = serverDuration;
    }

    
    private OriginalApiRequestResponseModel original;

    /**
     * Getter for original - Information about a previously created transaction
     */
    public OriginalApiRequestResponseModel getOriginal() {
        return this.original;
    }

    /**
     * Setter for original - Information about a previously created transaction
     */
    public void setOriginal(OriginalApiRequestResponseModel original) {
        this.original = original;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Information about a previously created transaction
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Information about a previously created transaction
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    


    /**
     * Returns a JSON string representation of AuditTransactionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    