package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a license key for this account.
 */
public class LicenseKeyModel {
    private Integer accountId;

    /**
     * Getter for accountId - Represents a license key for this account.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents a license key for this account.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String privateLicenseKey;

    /**
     * Getter for privateLicenseKey - Represents a license key for this account.
     */
    public String getPrivateLicenseKey() {
        return this.privateLicenseKey;
    }

    /**
     * Setter for privateLicenseKey - Represents a license key for this account.
     */
    public void setPrivateLicenseKey(String privateLicenseKey) {
        this.privateLicenseKey = privateLicenseKey;
    }

    
    private String httpRequestHeader;

    /**
     * Getter for httpRequestHeader - Represents a license key for this account.
     */
    public String getHttpRequestHeader() {
        return this.httpRequestHeader;
    }

    /**
     * Setter for httpRequestHeader - Represents a license key for this account.
     */
    public void setHttpRequestHeader(String httpRequestHeader) {
        this.httpRequestHeader = httpRequestHeader;
    }

    


    /**
     * Returns a JSON string representation of LicenseKeyModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    