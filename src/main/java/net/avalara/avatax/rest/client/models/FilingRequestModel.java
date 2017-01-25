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
     * Getter for data - 
     */
    public FilingRequestDataModel getData() {
        return this.data;
    }

    /**
     * Setter for data - 
     */
    public void setData(FilingRequestDataModel data) {
        this.data = data;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this filing request.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this filing request.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private FilingRequestStatus filingRequestStatusId;

    /**
     * Getter for filingRequestStatusId - 
     */
    public FilingRequestStatus getFilingRequestStatusId() {
        return this.filingRequestStatusId;
    }

    /**
     * Setter for filingRequestStatusId - 
     */
    public void setFilingRequestStatusId(FilingRequestStatus filingRequestStatusId) {
        this.filingRequestStatusId = filingRequestStatusId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company to which this filing request belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company to which this filing request belongs.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
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
    