package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A request to upload a file to Resource Files
 */
public class ResourceFileUploadRequestModel {
    private String name;

    /**
     * Getter for name - A request to upload a file to Resource Files
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - A request to upload a file to Resource Files
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private Integer resourceFileTypeId;

    /**
     * Getter for resourceFileTypeId - A request to upload a file to Resource Files
     */
    public Integer getResourceFileTypeId() {
        return this.resourceFileTypeId;
    }

    /**
     * Setter for resourceFileTypeId - A request to upload a file to Resource Files
     */
    public void setResourceFileTypeId(Integer resourceFileTypeId) {
        this.resourceFileTypeId = resourceFileTypeId;
    }

    
    private String username;

    /**
     * Getter for username - A request to upload a file to Resource Files
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for username - A request to upload a file to Resource Files
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - A request to upload a file to Resource Files
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - A request to upload a file to Resource Files
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String content;

    /**
     * Getter for content - A request to upload a file to Resource Files
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content - A request to upload a file to Resource Files
     */
    public void setContent(String content) {
        this.content = content;
    }

    
    private Long length;

    /**
     * Getter for length - A request to upload a file to Resource Files
     */
    public Long getLength() {
        return this.length;
    }

    /**
     * Setter for length - A request to upload a file to Resource Files
     */
    public void setLength(Long length) {
        this.length = length;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - A request to upload a file to Resource Files
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - A request to upload a file to Resource Files
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    


    /**
     * Returns a JSON string representation of ResourceFileUploadRequestModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    