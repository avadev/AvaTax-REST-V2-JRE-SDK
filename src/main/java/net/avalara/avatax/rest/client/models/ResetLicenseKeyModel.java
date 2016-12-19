package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a license key reset request.
 */
public class ResetLicenseKeyModel {
    private Integer accountId;

    /**
     * Getter for accountId - The primary key of the account ID to reset
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - The primary key of the account ID to reset
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Boolean confirmResetLicenseKey;

    /**
     * Getter for confirmResetLicenseKey - Set this value to true to reset the license key for this account.
            This license key reset function will only work when called using the credentials of the account administrator of this account.
     */
    public Boolean getConfirmResetLicenseKey() {
        return this.confirmResetLicenseKey;
    }

    /**
     * Setter for confirmResetLicenseKey - Set this value to true to reset the license key for this account.
            This license key reset function will only work when called using the credentials of the account administrator of this account.
     */
    public void setConfirmResetLicenseKey(Boolean confirmResetLicenseKey) {
        this.confirmResetLicenseKey = confirmResetLicenseKey;
    }

    


    /**
     * Returns a JSON string representation of ResetLicenseKeyModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    