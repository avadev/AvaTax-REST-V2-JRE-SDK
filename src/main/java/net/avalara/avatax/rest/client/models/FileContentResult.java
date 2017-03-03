package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 */
public class FileContentResult {
    private String fileContents;

    /**
     * Getter for fileContents - 
     */
    public String getFileContents() {
        return this.fileContents;
    }

    /**
     * Setter for fileContents - 
     */
    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

    
    private String contentType;

    /**
     * Getter for contentType - 
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Setter for contentType - 
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    
    private String fileDownloadName;

    /**
     * Getter for fileDownloadName - 
     */
    public String getFileDownloadName() {
        return this.fileDownloadName;
    }

    /**
     * Setter for fileDownloadName - 
     */
    public void setFileDownloadName(String fileDownloadName) {
        this.fileDownloadName = fileDownloadName;
    }

    


    /**
     * Returns a JSON string representation of FileContentResult.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    