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
     * Getter for name - Represents a batch of uploaded documents.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents a batch of uploaded documents.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Integer currentRecord;

    /**
     * Getter for currentRecord - Represents a batch of uploaded documents.
     */
    public Integer getCurrentRecord() {
        return this.currentRecord;
    }

    /**
     * Setter for currentRecord - Represents a batch of uploaded documents.
     */
    public void setCurrentRecord(Integer currentRecord) {
        this.currentRecord = currentRecord;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a batch of uploaded documents.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a batch of uploaded documents.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - Represents a batch of uploaded documents.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents a batch of uploaded documents.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Date startedDate;

    /**
     * Getter for startedDate - Represents a batch of uploaded documents.
     */
    public Date getStartedDate() {
        return this.startedDate;
    }

    /**
     * Setter for startedDate - Represents a batch of uploaded documents.
     */
    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    
    private ArrayList<BatchFileModel> files;

    /**
     * Getter for files - Represents a batch of uploaded documents.
     */
    public ArrayList<BatchFileModel> getFiles() {
        return this.files;
    }

    /**
     * Setter for files - Represents a batch of uploaded documents.
     */
    public void setFiles(ArrayList<BatchFileModel> files) {
        this.files = files;
    }

    
    private String options;

    /**
     * Getter for options - Represents a batch of uploaded documents.
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options - Represents a batch of uploaded documents.
     */
    public void setOptions(String options) {
        this.options = options;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents a batch of uploaded documents.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a batch of uploaded documents.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String batchAgent;

    /**
     * Getter for batchAgent - Represents a batch of uploaded documents.
     */
    public String getBatchAgent() {
        return this.batchAgent;
    }

    /**
     * Setter for batchAgent - Represents a batch of uploaded documents.
     */
    public void setBatchAgent(String batchAgent) {
        this.batchAgent = batchAgent;
    }

    
    private BatchStatus status;

    /**
     * Getter for status - Represents a batch of uploaded documents.
     */
    public BatchStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Represents a batch of uploaded documents.
     */
    public void setStatus(BatchStatus status) {
        this.status = status;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a batch of uploaded documents.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a batch of uploaded documents.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a batch of uploaded documents.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a batch of uploaded documents.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer recordCount;

    /**
     * Getter for recordCount - Represents a batch of uploaded documents.
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * Setter for recordCount - Represents a batch of uploaded documents.
     */
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    
    private BatchType type;

    /**
     * Getter for type - Represents a batch of uploaded documents.
     */
    public BatchType getType() {
        return this.type;
    }

    /**
     * Setter for type - Represents a batch of uploaded documents.
     */
    public void setType(BatchType type) {
        this.type = type;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a batch of uploaded documents.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a batch of uploaded documents.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a batch of uploaded documents.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a batch of uploaded documents.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private Date completedDate;

    /**
     * Getter for completedDate - Represents a batch of uploaded documents.
     */
    public Date getCompletedDate() {
        return this.completedDate;
    }

    /**
     * Setter for completedDate - Represents a batch of uploaded documents.
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
    