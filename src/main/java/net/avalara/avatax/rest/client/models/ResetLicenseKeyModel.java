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
     * Getter for accountId - Represents a license key reset request.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - Represents a license key reset request.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private Boolean confirmResetLicenseKey;

    /**
     * Getter for confirmResetLicenseKey - Represents a license key reset request.
     */
    public Boolean getConfirmResetLicenseKey() {
        return this.confirmResetLicenseKey;
    }

    /**
     * Setter for confirmResetLicenseKey - Represents a license key reset request.
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
    