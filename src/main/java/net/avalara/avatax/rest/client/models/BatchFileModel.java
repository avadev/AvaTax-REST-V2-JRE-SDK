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
     * Getter for name - Logical Name of file (e.g. "Input" or "Error").
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - Logical Name of file (e.g. "Input" or "Error").
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String fileExtension;

    /**
     * Getter for fileExtension - File extension (e.g. CSV).
     */
    public String getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Setter for fileExtension - File extension (e.g. CSV).
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    
    private Integer errorCount;

    /**
     * Getter for errorCount - Number of errors that occurred when processing this file.
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * Setter for errorCount - Number of errors that occurred when processing this file.
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    
    private Integer contentLength;

    /**
     * Getter for contentLength - Size of content, in bytes.
     */
    public Integer getContentLength() {
        return this.contentLength;
    }

    /**
     * Setter for contentLength - Size of content, in bytes.
     */
    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number assigned to this batch file.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number assigned to this batch file.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String contentType;

    /**
     * Getter for contentType - Content mime type (e.g. text/csv).  This is used for HTTP downloading.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Setter for contentType - Content mime type (e.g. text/csv).  This is used for HTTP downloading.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    
    private String content;

    /**
     * Getter for content - Content of the batch file.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content - Content of the batch file.
     */
    public void setContent(String content) {
        this.content = content;
    }

    
    private Integer batchId;

    /**
     * Getter for batchId - The unique ID number of the batch that this file belongs to.
     */
    public Integer getBatchId() {
        return this.batchId;
    }

    /**
     * Setter for batchId - The unique ID number of the batch that this file belongs to.
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
    