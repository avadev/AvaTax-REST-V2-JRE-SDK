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
     * Getter for accountId - The primary key of the account
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - The primary key of the account
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String privateLicenseKey;

    /**
     * Getter for privateLicenseKey - This is your private license key.  You must record this license key for safekeeping.
            If you lose this key, you must contact the ResetLicenseKey API in order to request a new one.
            Each account can only have one license key at a time.
     */
    public String getPrivateLicenseKey() {
        return this.privateLicenseKey;
    }

    /**
     * Setter for privateLicenseKey - This is your private license key.  You must record this license key for safekeeping.
            If you lose this key, you must contact the ResetLicenseKey API in order to request a new one.
            Each account can only have one license key at a time.
     */
    public void setPrivateLicenseKey(String privateLicenseKey) {
        this.privateLicenseKey = privateLicenseKey;
    }

    
    private String httpRequestHeader;

    /**
     * Getter for httpRequestHeader - If your software allows you to specify the HTTP Authorization header directly, this is the header string you 
            should use when contacting Avalara to make API calls with this license key.
     */
    public String getHttpRequestHeader() {
        return this.httpRequestHeader;
    }

    /**
     * Setter for httpRequestHeader - If your software allows you to specify the HTTP Authorization header directly, this is the header string you 
            should use when contacting Avalara to make API calls with this license key.
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
    