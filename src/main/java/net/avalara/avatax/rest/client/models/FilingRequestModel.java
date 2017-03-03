package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
 */
public class FilingRequestModel {
    private FilingRequestDataModel data;

    /**
     * Getter for data - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public FilingRequestDataModel getData() {
        return this.data;
    }

    /**
     * Setter for data - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setData(FilingRequestDataModel data) {
        this.data = data;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Long id;

    /**
     * Getter for id - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private FilingRequestStatus filingRequestStatusId;

    /**
     * Getter for filingRequestStatusId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public FilingRequestStatus getFilingRequestStatusId() {
        return this.filingRequestStatusId;
    }

    /**
     * Setter for filingRequestStatusId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setFilingRequestStatusId(FilingRequestStatus filingRequestStatusId) {
        this.filingRequestStatusId = filingRequestStatusId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a commitment to file a tax return on a recurring basis.
Only used if you subscribe to Avalara Returns.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of FilingRequestModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    