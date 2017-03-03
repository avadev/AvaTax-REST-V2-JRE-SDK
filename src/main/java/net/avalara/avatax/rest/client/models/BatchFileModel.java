package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents one file in a batch upload.
 */
public class BatchFileModel {
    private String name;

    /**
     * Getter for name - Represents one file in a batch upload.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Represents one file in a batch upload.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String fileExtension;

    /**
     * Getter for fileExtension - Represents one file in a batch upload.
     */
    public String getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Setter for fileExtension - Represents one file in a batch upload.
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    
    private Integer errorCount;

    /**
     * Getter for errorCount - Represents one file in a batch upload.
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * Setter for errorCount - Represents one file in a batch upload.
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    
    private Integer contentLength;

    /**
     * Getter for contentLength - Represents one file in a batch upload.
     */
    public Integer getContentLength() {
        return this.contentLength;
    }

    /**
     * Setter for contentLength - Represents one file in a batch upload.
     */
    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents one file in a batch upload.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents one file in a batch upload.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String contentType;

    /**
     * Getter for contentType - Represents one file in a batch upload.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Setter for contentType - Represents one file in a batch upload.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    
    private String content;

    /**
     * Getter for content - Represents one file in a batch upload.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content - Represents one file in a batch upload.
     */
    public void setContent(String content) {
        this.content = content;
    }

    
    private Integer batchId;

    /**
     * Getter for batchId - Represents one file in a batch upload.
     */
    public Integer getBatchId() {
        return this.batchId;
    }

    /**
     * Setter for batchId - Represents one file in a batch upload.
     */
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    


    /**
     * Returns a JSON string representation of BatchFileModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    