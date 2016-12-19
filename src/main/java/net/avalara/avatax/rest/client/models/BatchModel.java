package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a batch of uploaded documents.
 */
public class BatchModel {
    private String name;

    /**
     * Getter for name - The user-friendly readable name for this batch.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - The user-friendly readable name for this batch.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Integer currentRecord;

    /**
     * Getter for currentRecord - The current record being processed
     */
    public Integer getCurrentRecord() {
        return this.currentRecord;
    }

    /**
     * Setter for currentRecord - The current record being processed
     */
    public void setCurrentRecord(Integer currentRecord) {
        this.currentRecord = currentRecord;
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

    
    private Integer accountId;

    /**
     * Getter for accountId - The Account ID number of the account that owns this batch.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - The Account ID number of the account that owns this batch.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Date startedDate;

    /**
     * Getter for startedDate - The date/time when this batch started processing
     */
    public Date getStartedDate() {
        return this.startedDate;
    }

    /**
     * Setter for startedDate - The date/time when this batch started processing
     */
    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    
    private ArrayList<BatchFileModel> files;

    /**
     * Getter for files - The list of files contained in this batch.
     */
    public ArrayList<BatchFileModel> getFiles() {
        return this.files;
    }

    /**
     * Setter for files - The list of files contained in this batch.
     */
    public void setFiles(ArrayList<BatchFileModel> files) {
        this.files = files;
    }

    
    private String options;

    /**
     * Getter for options - Any optional flags provided for this batch
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options - Any optional flags provided for this batch
     */
    public void setOptions(String options) {
        this.options = options;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this batch.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this batch.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String batchAgent;

    /**
     * Getter for batchAgent - The agent used to create this batch
     */
    public String getBatchAgent() {
        return this.batchAgent;
    }

    /**
     * Setter for batchAgent - The agent used to create this batch
     */
    public void setBatchAgent(String batchAgent) {
        this.batchAgent = batchAgent;
    }

    
    private BatchStatus status;

    /**
     * Getter for status - This batch's current processing status
     */
    public BatchStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status - This batch's current processing status
     */
    public void setStatus(BatchStatus status) {
        this.status = status;
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

    
    private Integer recordCount;

    /**
     * Getter for recordCount - The number of records in this batch; determined by the server
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * Setter for recordCount - The number of records in this batch; determined by the server
     */
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    
    private BatchType type;

    /**
     * Getter for type - The type of this batch.
     */
    public BatchType getType() {
        return this.type;
    }

    /**
     * Setter for type - The type of this batch.
     */
    public void setType(BatchType type) {
        this.type = type;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The Company ID number of the company that owns this batch.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The Company ID number of the company that owns this batch.
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

    
    private Date completedDate;

    /**
     * Getter for completedDate - The date/time when this batch was completely processed
     */
    public Date getCompletedDate() {
        return this.completedDate;
    }

    /**
     * Setter for completedDate - The date/time when this batch was completely processed
     */
    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    


    /**
     * Returns a JSON string representation of BatchModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    